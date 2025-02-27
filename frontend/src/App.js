import { useState } from "react";
import logo from "./logo.svg";
import "./App.css";

function App() {
  const [prompt, setPrompt] = useState(""); // Stores user input
  const [response, setResponse] = useState(""); // Stores AI response
  const [loading, setLoading] = useState(false); // Loading state

  const fetchAIResponse = async () => {
    if (!prompt.trim()) return; // Prevent empty requests
    setLoading(true);
    try {
      const res = await fetch(`http://localhost:8080/ask-ai?prompt=${encodeURIComponent(prompt)}`);
      const data = await res.text(); // Assuming the response is plain text
      setResponse(data);
    } catch (error) {
      console.error("Error fetching data:", error);
      setResponse("Error fetching response");
    }
    setLoading(false);
  };

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>Enter a prompt to get an AI response:</p>
        
        <input
          type="text"
          value={prompt}
          onChange={(e) => setPrompt(e.target.value)}
          placeholder="Type your query..."
          className="App-input"
        />
        <button onClick={fetchAIResponse} className="App-button">
          {loading ? "Loading..." : "Ask AI"}
        </button>

        <p>AI Response:</p>
        <p>{response || "Waiting for input..."}</p>
      </header>
    </div>
  );
}

export default App;

# Motiv.ai - AI-Powered Motivational Messages

Motiv.ai is an AI-driven application designed to generate uplifting and inspiring messages. The backend is built with **Spring Boot**, integrating **OpenAI** for AI-powered responses, while the frontend is developed using **React and Node.js**.

---

## **Project Structure**

**Backend** (`Spring Boot - Java`)
- Provides AI-generated motivational messages via a REST API.
- Uses OpenAI for AI-powered responses.
- Exposes endpoints for frontend interaction.

**Frontend** (`React - Node.js`)
- A simple and responsive UI for users to receive motivational messages.
- Communicates with the backend API to fetch AI-generated responses.

---

## **Tech Stack**

### **Backend:**
- Java (Spring Boot)
- OpenAI API (via `org.springframework.ai.openai.OpenAiChatModel`)
- RESTful API
- Maven

### **Frontend:**
- React.js
- Node.js
- Axios (for API requests)
- Tailwind CSS (optional for styling)

---

## **Getting Started**

### **Backend Setup (Spring Boot)**

1. **Clone the repository**  
   ```sh
   git clone https://github.com/yourusername/motiv-ai.git
   cd motiv-ai/backend
   ```

2. **Set up environment variables** (API Key for OpenAI)  
   Create an `application.properties` file inside `src/main/resources/`:  
   ```
   openai.api.key=YOUR_OPENAI_API_KEY
   ```

3. **Run the Spring Boot application**  
   ```sh
   mvn spring-boot:run
   ```
   The backend will start at: `http://localhost:8080/`

---

### **Frontend Setup (React + Node.js)**

1. **Navigate to the frontend folder and install dependencies**  
   ```sh
   cd ../frontend
   npm install
   ```

2. **Start the React app**  
   ```sh
   npm start
   ```
   The frontend will be available at `http://localhost:3000/`.

3. **Ensure API calls are pointing to your backend**  
   In your React code, update API requests to:  
   ```js
   axios.get("http://localhost:8080/ask-ai?prompt=YourMessage");
   ```

---

## **API Endpoints**

### **GET /ask-ai**
**Description:** Fetches an AI-generated motivational message based on user input.

**Request Example:**  
```
GET http://localhost:8080/ask-ai?prompt=I need motivation
```

**Response Example:**  
```json
{
  "message": "You are capable of great things. Keep pushing forward!"
}
```

---

## **Future Enhancements**
Improve UI/UX with animations and better styling.  
Add user authentication for personalized messages.  
Engineer custom responses for more humanized experience.
Implement a database to store previous motivational messages.  

---

## **Contributors**
- **Azizbek Husainov, Blake Ebert, Rasheed Abbasov, Salah Maarouf, Sergio Nguyen** - Developers  
- **OpenAI** - AI-powered message generation  
---


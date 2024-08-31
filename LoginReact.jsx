// src/Login.js
import React, { useState } from "react";

function Login() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    
    // Mock authentication (replace with real API call)
    const mockUsername = "admin";
    const mockPassword = "password";
    
    if (username === mockUsername && password === mockPassword) {
      alert("Login successful!");
      // Redirect to home page or dashboard
    } else {
      alert("Login failed. Please check your credentials.");
    }
  };

  return (
    <div style={styles.container}>
      <h2>Login</h2>
      <form onSubmit={handleSubmit} style={styles.form}>
        <div style={styles.inputGroup}>
          <label>Username:</label>
          <input
            type="text"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
            style={styles.input}
            required
          />
        </div>
        <div style={styles.inputGroup}>
          <label>Password:</label>
          <input
            type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            style={styles.input}
            required
          />
        </div>
        <button type="submit" style={styles.button}>Login</button>
      </form>
    </div>
  );
}

const styles = {
  container: {
    width: "300px",
    margin: "0 auto",
    padding: "20px",
    border: "1px solid #ccc",
    borderRadius: "5px",
    boxShadow: "0 0 10px rgba(0, 0, 0, 0.1)",
  },
  form: {
    display: "flex",
    flexDirection: "column",
  },
  inputGroup: {
    marginBottom: "15px",
  },
  input: {
    width: "100%",
    padding: "8px",
    borderRadius: "3px",
    border: "1px solid #ccc",
  },
  button: {
    padding: "10px",
    borderRadius: "3px",
    border: "none",
    backgroundColor: "#28a745",
    color: "#fff",
    cursor: "pointer",
  },
};

export default Login;

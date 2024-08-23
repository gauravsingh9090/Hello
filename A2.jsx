// src/Login.js
import React, { useState } from "react";

const Login = () => {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault();
        // Here you would typically handle the login logic, like sending credentials to a server.
        console.log("Username:", username);
        console.log("Password:", password);
        
        // Example: redirect or show a message on successful login
        if (username === "admin" && password === "password") {
            alert("Login successful!");
        } else {
            alert("Invalid credentials, please try again.");
        }
    };

    return (
        <div style={{ display: "flex", justifyContent: "center", alignItems: "center", height: "100vh" }}>
            <form onSubmit={handleSubmit} style={{ width: "300px", padding: "20px", border: "1px solid #ccc", borderRadius: "10px" }}>
                <h2>Login</h2>
                <div style={{ marginBottom: "10px" }}>
                    <label>Username:</label>
                    <input
                        type="text"
                        value={username}
                        onChange={(e) => setUsername(e.target.value)}
                        style={{ width: "100%", padding: "8px", marginTop: "5px", borderRadius: "5px" }}
                    />
                </div>
                <div style={{ marginBottom: "20px" }}>
                    <label>Password:</label>
                    <input
                        type="password"
                        value={password}
                        onChange={(e) => setPassword(e.target.value)}
                        style={{ width: "100%", padding: "8px", marginTop: "5px", borderRadius: "5px" }}
                    />
                </div>
                <button type="submit" style={{ width: "100%", padding: "10px", borderRadius: "5px", backgroundColor: "#4CAF50", color: "white", border: "none" }}>
                    Login
                </button>
            </form>
        </div>
    );
};

export default Login;

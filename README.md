# OAuth2-Authentication-Service-with-Secure-API-Integration


# Overview
This project implements a secure authentication service using OAuth2. It provides an end-to-end solution for integrating third-party authentication providers like Google and GitHub while securing API access with JWT tokens.

## Key Features

- **OAuth2 Authentication**: Seamlessly integrates with OAuth2 providers (Google, GitHub, etc.) to authenticate users..
- **JWT Security**: Protects API access by issuing and validating JSON Web Tokens (JWTs)
- **Secure Endpoints**: Ensures sensitive API endpoints are protected using role-based access control.
- **Ready-to-Use**:Includes configurations and endpoints to quickly start building secure applications.

## Getting Started

### Prerequisites

- Before starting, ensure you have the following installed:

-    Java 11 or higher
-    Spring Boot 2.x
-    Maven or Gradle
-    A registered OAuth2 application with Google or GitHub (for API keys).
### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/ishrivasayush/oauth2-authentication-service.git
cd oauth2-authentication-service
    ```

2. **Configure OAuth2 keys in application.yml:**

    ```yaml
    spring:
  security:
    oauth2:
      client:
        registration:
          google:
            client-id: YOUR_GOOGLE_CLIENT_ID
            client-secret: YOUR_GOOGLE_CLIENT_SECRET
            redirect-uri: http://localhost:8080/login/oauth2/code/google
          github:
            client-id: YOUR_GITHUB_CLIENT_ID
            client-secret: YOUR_GITHUB_CLIENT_SECRET
            redirect-uri: http://localhost:8080/login/oauth2/code/github```

3. **Build and Run the Application:**

    Use Maven to build and run the application:

        ```bash
    mvn clean install
    ```

4. **Start the server:**
        ```bash
    mvn spring-boot:run
  ```
## How to use
-    Visit the login page at: http://localhost:8080/login
-    Select a provider (Google/GitHub) to authenticate.
-    Once logged in, a JWT token will be issued.
-    Use the token to access protected endpoints by adding it as a Bearer token in the Authorization header.
    
### Example API Call
    To access a protected endpoint:
   ```bash
    curl -H "Authorization: Bearer YOUR_JWT_TOKEN" http://localhost:8080/protected-endpoint
```
### Contribution
Feel free to contribute by submitting issues or pull requests. For major changes, please discuss with the maintainers first.
### License
This project is licensed under the MIT License. See the LICENSE file for details.

Food Delivery App is a comprehensive system designed for managing customers, inventory, and orders. It offers secure authentication, role-based access control, and database integration using MySQL. Built with Spring Boot and Thymeleaf, the application provides a seamless experience for admin and staff members.
<img width="1273" height="675" alt="Screenshot 2025-08-07 142215" src="https://github.com/user-attachments/assets/bade26e1-70e3-4f8c-b6b2-60f482839b9c" />
<img width="1244" height="558" alt="Screenshot 2025-08-07 142236" src="https://github.com/user-attachments/assets/6ca885c8-0509-4ce9-bc8e-8272ed92f38f" />
<img width="1384" height="882" alt="Screenshot 2025-08-07 143945" src="https://github.com/user-attachments/assets/b2a2fd40-adc5-439c-bc3e-1251f6bd8df3" />
src/
├── main/
│   ├── java/
│   │   └── com.example.foodfrenzy/
│   │       ├── controller/      # Contains all controllers
│   │       ├── model/           # Contains entity classes
│   │       ├── repository/      # Repository interfaces for database interaction
│   │       └── service/         # Service layer with business logic
│   ├── resources/
│   │   ├── templates/           # Thymeleaf templates for views
│   │   ├── static/              # Static assets (CSS, JavaScript)
│   │   └── application.properties  # Project configuration
│   └── webapp/
│       └── WEB-INF/
│           └── views/           # Additional view files
└── test/                        # Test cases for unit testing

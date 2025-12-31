# Inventory Management System

A modern inventory management system built with **Java + Spring Boot** (backend) and **React** (frontend), designed following **Hexagonal Architecture (Ports & Adapters)** principles.

This project is intended as a **junior-level professional portfolio project**, demonstrating clean architecture, separation of concerns, and real-world backend/frontend integration.

---

## 🧱 Architecture Overview

The backend follows **Hexagonal Architecture**, also known as **Ports and Adapters**.

This approach allows the core business logic to remain independent of frameworks, databases, or external technologies.

### Architecture Layers


┌──────────────────────────────┐
│ Infrastructure │
│ (Controllers, DB, REST) │
└──────────────▲───────────────┘
│
┌──────────────┴───────────────┐
│ Application │
│ (Use Cases / Services) │
└──────────────▲───────────────┘
│
┌──────────────┴───────────────┐
│ Domain │
│ (Entities & Business Rules) │
└──────────────────────────────┘


---

## 📦 Backend – Spring Boot

### Tech Stack
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL (Supabase)
- Maven

### Package Structure



com.anderson.dev.inventory
│
├── domain
│ ├── model
│ │ └── Product
│ └── port
│ ├── in
│ │ └── ProductUseCase
│ └── out
│ └── ProductRepositoryPort
│
├── application
│ └── service
│ └── ProductService
│
├── infrastructure
│ └── adapter
│ ├── in
│ │ ├── ProductController
│ │ └── dto
│ │ ├── ProductRequestDto
│ │ └── ProductResponseDto
│ └── out
│ ├── persistence
│ │ ├── entity
│ │ │ └── ProductEntity
│ │ ├── repository
│ │ │ └── ProductJpaRepository
│ │ └── ProductPostgresAdapter
│ └── memory
│ └── InMemoryProductRepository
│
└── InventoryApplication


---

## 🔌 Ports & Adapters Explained

### Input Port
- `ProductUseCase`
- Defines what the application **can do**
- Used by controllers

### Output Port
- `ProductRepositoryPort`
- Defines what the application **needs**
- Implemented by:
  - In-memory repository (for tests)
  - PostgreSQL adapter (Supabase)

---

## 🧠 Domain Model

### Product
- id
- name
- category
- stock
- price (BigDecimal, COP format)

The domain layer has **no Spring annotations**.

---

## 🗄️ Database

- PostgreSQL hosted on **Supabase**
- JPA entities live only in the infrastructure layer
- Domain models are mapped to entities using adapters

---

## 🌐 REST API

### Endpoints

| Method | Endpoint        | Description           |
|------|-----------------|-----------------------|
| POST | /api/products   | Create product        |
| GET  | /api/products   | List all products     |

---

## 🎨 Frontend – React (Planned)

The frontend will be developed using:

- React
- Vite
- TailwindCSS
- Dark futuristic UI (purple / neon accents)
- Animations (Spline / Lottie)

### Features
- Product list
- Create product form
- Stock indicators
- Currency formatted in COP
- API integration with Spring Boot

---

## 🚀 How to Run (Backend)

```bash
./mvnw spring-boot:run


Server runs on:

http://localhost:8080

🛣️ Roadmap

 Hexagonal architecture setup

 REST API

 Supabase integration

 Database migrations

 React frontend

 Authentication

 Docker support

👤 Author

Anderson Blandón
Junior Java Backend Developer

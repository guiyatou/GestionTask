# GestionTask — API REST Spring Boot

API REST de gestion de tâches développée avec Spring Boot, illustrant une architecture en couches (Controller / Service / Repository / Model).

---

## Technologies

- Java 17
- Spring Boot 4.0.4
- Spring Data JPA
- Base de données H2 (en mémoire)
- Lombok
- Maven
- JUnit 5

---

## Architecture du projet

```
src/main/java/com/rothiam/GestionTask/
│
├── model/
│   └── Task.java           # Entité JPA — représente une tâche
│
├── repository/
│   └── TaskRepository.java # Accès base de données (Spring Data JPA)
│
├── service/
│   └── TaskService.java    # Logique métier
│
└── controller/
    └── TaskController.java # Endpoints REST
```

---

## Endpoints disponibles

| Méthode | URL | Description |
|--------|-----|-------------|
| GET | `/api/tasks` | Récupérer toutes les tâches |
| POST | `/api/tasks` | Créer une nouvelle tâche |
| DELETE | `/api/tasks/{id}` | Supprimer une tâche par son ID |

---

## Lancer le projet

### Prérequis
- Java 17+
- Maven (ou utiliser le wrapper inclus)

### Démarrage

```bash
./mvnw spring-boot:run
```

L'application démarre sur `http://localhost:8080`

### Lancer les tests

```bash
./mvnw test
```

---

## Exemples d'utilisation

### Créer une tâche
```bash
curl -X POST http://localhost:8080/api/tasks \
  -H "Content-Type: application/json" \
  -d '{"title": "Ma première tâche", "description": "Test API", "completed": false}'
```

### Récupérer toutes les tâches
```bash
curl http://localhost:8080/api/tasks
```

### Supprimer une tâche
```bash
curl -X DELETE http://localhost:8080/api/tasks/1
```

---

![CI](https://github.com/TON_USERNAME/GestionTask/actions/workflows/ci.yml/badge.svg)

## Auteure
**Rouguiyatou Thiam** — Ingénieure Développeuse Java EE  
[sendguiya@gmail.com](mailto:sendguiya@gmail.com)

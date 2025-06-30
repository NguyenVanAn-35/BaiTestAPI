# 📦 Spring Boot REST API - Quản lý người dùng

## ✅ Mô tả dự án

Đây là một ứng dụng REST API sử dụng **Spring Boot**, có chức năng **đăng ký**, **đăng nhập (JWT Authentication)** và **phân quyền (Authorization)** người dùng. Hệ thống có hỗ trợ **soft delete** và quản lý trạng thái người dùng (`ACTIVE`, `INACTIVE`).

---

## 🛠️ Công nghệ sử dụng

- Java 17
- Spring Boot 3.x
- Spring Security 6
- JWT (JSON Web Token)
- Hibernate JPA
- Maven
- SQL Server

---

## 📋 Tính năng

- ✅ Đăng ký tài khoản
- ✅ Đăng nhập và nhận JWT Token
- ✅ Xác thực và phân quyền bằng JWT
- ✅ CRUD User
- ✅ Soft Delete user
- ✅ Trạng thái user: `ACTIVE` / `INACTIVE`
- ✅ Token bảo vệ các API cần xác thực

---

## 📁 Cấu trúc thư mục

```
src
 └── main
     ├── java
     │   └── com.example.demo
     │       ├── controller       # Rest Controller
     │       ├── entity           # User Entity
     │       ├── repository       # User Repository
     │       ├── security         # JWT Config & Filter
     │       └── service          # Business Logic
     └── resources
         └── application.properties
```

---

## ⚙️ Cài đặt môi trường

1. Cài đặt Java 17 (hoặc cao hơn)
2. Cài đặt Maven
3. Tạo database SQL Server tên `bai_test` và cấu hình lại trong `application.properties`:

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=bai_test
spring.datasource.username=sa
spring.datasource.password=12345678
spring.jpa.hibernate.ddl-auto=update
```

---

## 🚀 Chạy ứng dụng

```bash
./mvnw spring-boot:run
```

Ứng dụng sẽ chạy tại: [http://localhost:8080](http://localhost:8080)

---

## 🔐 Hướng dẫn xác thực (JWT)

### 1. Đăng ký

```
POST /api/auth/register
Body: {
  "name": "Nguyen Van A",
  "username": "nguyenvana",
  "password": "123456",
  "email": "a@example.com",
  "phone": "0123456789"
}
```

### 2. Đăng nhập

```
POST /api/auth/login
Body: {
  "username": "nguyenvana",
  "password": "123456"
}
```

Kết quả trả về:

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```

### 3. Gọi API bảo vệ

```http
GET /api/auth
Header:
Authorization: Bearer <token>
```

---

## ✅ Soft Delete là gì?

Soft delete nghĩa là thay vì xóa dữ liệu khỏi database, ta đánh dấu `deleted = true` và ẩn đi. Hệ thống chỉ hiển thị user có `deleted = false`.
---
## 🗃️ Quản lý mã nguồn

- Mã nguồn quản lý trên GitHub

## 👩‍💻 Tác giả

- Tên: Nguyễn Văn An
- Email: anviptd2k4@gmail.
- Ngày hoàn thành: 30/06/2025
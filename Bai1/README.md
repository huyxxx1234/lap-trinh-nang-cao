# Bài 1: Quản lý Dependency với Maven (MathUtils)

- Nâng cấp `pom.xml` lên chuẩn Maven 4.0.0 với `maven.compiler.release` 17.
- Tích hợp `slf4j-api` 2.0.9 + `logback-classic` 1.4.11 thay thế hoàn toàn `System.out.println` bằng structured logging.
- Bổ sung `hibernate-core` 6.2.0.Final phục vụ persistence trong tương lai (dùng JBoss Logging nên không xung đột với SLF4J/Logback).
- Sử dụng duy nhất `junit-jupiter` 5.9.2 kết hợp `maven-surefire-plugin` 3.2.5 (loại bỏ JUnit 4 / Vintage engine).

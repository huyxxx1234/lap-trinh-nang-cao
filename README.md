# BỘ BÀI THỰC HÀNH MAVEN & CI/CD (TUẦN 9)

**Sinh viên:** Vũ Hồng Huy  
**MSSV:** 25020625  

## Cấu trúc dự án
- `Bai1` – `Bai10`: 10 dự án Maven độc lập tương ứng với 10 bài tập.
- `.github/workflows/`: Toàn bộ GitHub Actions workflows đặt tại thư mục gốc repository.

## Hướng dẫn chạy cục bộ
```bash
cd Bai1   # hoặc Bai2 ... Bai10
mvn clean verify
```
Với **Bài 8**, chạy đóng gói và thực thi trực tiếp:
```bash
cd Bai8
mvn clean package
java -jar target/executable-app-1.0.0.jar
```

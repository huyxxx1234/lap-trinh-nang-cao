# Bài 9: Triển khai Logging chuyên nghiệp

- Loại bỏ toàn bộ `System.out.println()`.
- Sử dụng SLF4J + Logback với Parameterized Logging (`{}`) để tránh nối chuỗi không cần thiết khi mức log bị tắt.
- Phân tách mức độ log: `INFO` cho các mốc xử lý thành công, `ERROR` kèm stacktrace ngoại lệ khi chia cho 0.
- Cấu hình `ConsoleAppender` và `FileAppender` trong `src/main/resources/logback.xml` ghi đồng thời ra console và `logs/application.log`.

# Bài 2: Code Quality - Checkstyle (BankSystem)

- Tích hợp `maven-checkstyle-plugin` 3.3.1 với bộ quy tắc `google_checks.xml` vào pha `verify`.
- Refactor toàn bộ mã nguồn theo Google Java Style (thụt lề 2 dấu cách, Javadoc đầy đủ, đặt tên biến/hàm đúng chuẩn).
- Triển khai SLF4J/Logback với các mức log:
  - `INFO`: ghi nhận các mốc vòng đời và giao dịch thành công (`transactionId`, `amount`, `newBalance`).
  - `WARN`: cảnh báo dữ liệu đầu vào bất thường nhưng hệ thống xử lý an toàn (số tiền `<= 0`).
  - `ERROR`: ghi nhận lỗi nghiệp vụ nghiêm trọng hoặc ngoại lệ (khởi tạo số dư âm, rút vượt số dư). Tuyệt đối không log thông tin nhạy cảm (mật khẩu, PIN).

# Bài 8: Đóng gói sản phẩm thực thi

- Cấu hình `maven-jar-plugin` 3.4.1 khai báo `<mainClass>com.student.App</mainClass>` trong `META-INF/MANIFEST.MF`.
- Chạy `mvn clean package` và thực thi độc lập bằng `java -jar target/executable-app-1.0.0.jar`.
- **Ý nghĩa thư mục `target`:** Là thư mục đầu ra mặc định của Maven chứa toàn bộ mã bytecode đã biên dịch (`classes/`), kết quả kiểm thử (`surefire-reports/`) và tệp đóng gói cuối cùng (`.jar`). Lệnh `mvn clean` sẽ xóa sạch thư mục này trước khi build mới.
- **Ý nghĩa pha `package`:** Là một pha trong Maven Default Lifecycle, thực hiện đóng gói mã đã biên dịch và kiểm thử thành định dạng phân phối (như `.jar` hoặc `.war`) sau khi các pha trước đó (`validate`, `compile`, `test`) đã chạy thành công.

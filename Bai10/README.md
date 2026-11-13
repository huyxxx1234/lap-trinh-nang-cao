# Bài 10: The Broken Pipeline

## Phân tích 3 lỗi gốc trong dự án ban đầu
1. **Lỗi 1 (`Bai10/pom.xml`, dependency `logback-classic`):** Khai báo `<version>9.9.9</version>` không tồn tại trên Maven Central -> Maven báo lỗi `Could not find artifact ch.qos.logback:logback-classic:jar:9.9.9`. Khắc phục: đổi thành `1.4.11`.
2. **Lỗi 2 (`.github/workflows/ci.yml`, job `build`):** Thiếu bước `uses: actions/checkout@v4` trước khi chạy `mvn package` -> Runner không có mã nguồn và báo lỗi `The goal you specified requires a project to execute but there is no POM in this directory`. Khắc phục: thêm `uses: actions/checkout@v4`.
3. **Lỗi 3 (`Bai10/pom.xml`, plugin `maven-surefire-plugin`):** Phiên bản `2.12.4` quá cũ, không hỗ trợ JUnit Platform / JUnit Jupiter 5.9.2 nên không thực thi bài test nào (`Tests run: 0`). Khắc phục: nâng lên `3.2.5`.

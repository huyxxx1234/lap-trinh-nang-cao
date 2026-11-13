# Bài 5: Test Coverage & Quality Enforcement (JaCoCo)

- Tích hợp `jacoco-maven-plugin` 0.8.12 với quy tắc bắt buộc `LINE` coverage >= 80% tại pha `verify`.
- Workflow `.github/workflows/bai5-jacoco.yml` xuất báo cáo HTML tại `Bai5/target/site/jacoco/index.html` và lưu trữ qua `actions/upload-artifact@v4`.

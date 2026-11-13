# Bài 3: CI/CD Automation với GitHub Actions

- Workflow `.github/workflows/bai3-ci.yml` kích hoạt khi `push` và `pull_request`.
- Thực thi `mvn --batch-mode --no-transfer-progress clean package` (chạy qua các pha `compile`, `test`, `package`).
- Upload tệp `Bai3/target/*.jar` lên GitHub Actions Artifacts bằng `actions/upload-artifact@v4`.

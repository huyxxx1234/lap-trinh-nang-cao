# Bài 7: Automated Code Review via Pull Request

- Workflow `.github/workflows/bai7-pr-quality.yml` tự động chạy khi có `pull_request` hướng vào nhánh `main`.
- Chạy `mvn clean verify` (bao gồm `checkstyle:check` với `google_checks.xml`).
- Tự động phân tích file báo cáo `Bai7/target/checkstyle-result.xml` và đăng bình luận trực tiếp (inline review comments) vào từng dòng vi phạm trên Pull Request kèm nhận xét tổng hợp.
- Kết hợp Branch Protection Rules trên nhánh `main` để khóa nút Merge khi job `quality` chưa pass.

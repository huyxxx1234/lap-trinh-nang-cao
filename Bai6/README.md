# Bài 6: CI/CD Pipeline Optimization & Caching

- Cấu hình `cache: maven` trong `actions/setup-java@v4` ở `.github/workflows/bai6-maven-cache.yml`.
- Lần push đầu tiên sẽ lưu thư mục `~/.m2/repository` vào GitHub Cache; lần push thứ hai sẽ khôi phục trực tiếp từ cache (`Cache restored from key...`), rút ngắn thời gian tải dependency.
.

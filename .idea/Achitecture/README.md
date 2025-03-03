# Kiến trúc Monolithic

## 1. Giới thiệu
Kiến trúc Monolithic là mô hình trong đó toàn bộ ứng dụng được xây dựng như một khối duy nhất. Tất cả các thành phần như UI, logic nghiệp vụ, database,... đều nằm trong cùng một codebase và được deploy dưới dạng một package duy nhất.

## 2. Ưu điểm
- ✅ **Dễ phát triển, triển khai, debug**
- ✅ **Hiệu suất tốt cho các ứng dụng nhỏ**
- ✅ **Tiết kiệm tài nguyên hơn so với kiến trúc phân tán**

## 3. Nhược điểm
- ❌ **Khó mở rộng khi ứng dụng lớn dần**
- ❌ **Cập nhật hoặc thay đổi một phần có thể ảnh hưởng đến toàn bộ hệ thống**
- ❌ **Khó sử dụng công nghệ mới khi hệ thống đã phát triển lớn**  

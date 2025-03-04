# REGEX - Biểu thức chính quy trong Java

## Các phương thức quan trọng

- **`matches()`**: Kiểm tra toàn bộ chuỗi có khớp với regex không.
- **`find()`**: Tìm đoạn chuỗi khớp với regex.
- **`group()`**: Lấy phần khớp trong chuỗi.
- **`start()`**: Vị trí bắt đầu của phần khớp với biểu thức regex.
- **`end()`**: Vị trí kết thúc của phần khớp với biểu thức regex.
- **`replaceAll()`**: Thay thế tất cả các phần khớp với regex.

---

## Các biểu thức regex phổ biến

| Regex | Ý nghĩa                                  |
|------|------------------------------------------|
| `\d` | Bất kỳ chữ số nào (0-9)                  |
| `\D` | Không phải số                            |
| `+`  | Xuất hiện 1 hoặc nhiều lần               |
| `[-]` | Khoảng dữ liệu                           |
| `()` | Chia nhóm                                |
| `\w` | Chữ cái, chữ số, dấu gạch dưới           |
| `\W` | Không phải chữ cái, chữ số, dấu gạch dưới |
| `\s` | Khoảng trắng                             |
| `\S` | Không phải khoảng trắng                  |
| `.`  | Khớp với mọi ký tự trừ xuống dòng        |
| `\?` | Khớp với dấu hỏi `?`                     |
| `*`  | Xuất hiện 0 hoặc nhiều lần               |
| `?`  | Xuất hiện 0 hoặc 1 lần                   |
| `{n}` | Xuất hiện chính xác `n` lần              |
| `{n,}` | Xuất hiện ít nhất `n` lần                |
| `|` | Hoặc |

---

## Ví dụ sử dụng Regex trong Java

### Kiểm tra chuỗi có khớp với regex không

```java
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Hello123";
        String regex = "[A-Za-z]+\\d+";

        boolean isMatch = Pattern.matches(regex, text);
        System.out.println("Chuỗi có hợp lệ không? " + isMatch);
    }
}
```
### Tìm tất cả số điện thoại trong chuỗi
```java
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String text = "SĐT: 0987654321 và 0123456789";
        String regex = "\\d{10}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Tìm thấy số: " + matcher.group());
        }
    }
}

```
### Thay thế số bằng X
```java
public class Main {
    public static void main(String[] args) {
        String text = "SĐT: 0905123456, 0987654321";
        String result = text.replaceAll("\\d", "X");
        System.out.println(result);
    }
}

```
### ✅ Output:
```textmate
SĐT: XXXXXXXXXX, XXXXXXXXXX;
```
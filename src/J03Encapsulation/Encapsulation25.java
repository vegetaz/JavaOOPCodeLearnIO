package J03Encapsulation;
/*
Date
- day, month, year là các thuộc tính chỉ ngày, tháng, năm của đối tượng Date.
- Date(day: int, month: int, year: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
- setDate(day: int, month: int, year: int) là phương thức dùng để thay đổi giá trị cho các thuộc tính.
- display() là phương thức dùng để hiển thị thông tin về ngày của đối tượng theo định dạng "dd/MM/yyyy". Ví dụ:
- Nếu day = 1, month = 7, year = 1997 thì khi gọi phương thức display() màn hình sẽ hiển thị ra "01/07/1997"
- Nếu day = 8, month = 12, year = 2003 thì khi gọi phương thức display() màn hình sẽ hiển thị ra "08/12/1997"
- Các phương thức khác là các setter và getter bạn đã biết.
- Để đơn giản, bạn không cần quan tâm tới ngày, tháng, năm của lớp Date có hợp lệ hay không.
*/
public class Encapsulation25 {
    public static void main(String[] args) {
        Date d = new Date(1, 1, 1997);
        d.display();
        d.setDate(12, 12, 2004);
        d.display();
        d.setMonth(3);
        d.display();
    }
}
class Date {
    private int day;
    private int month;
    private int year;

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void display() {
        String day = this.day + "";
        String month = this.month + "";
        String year = this.year + "";
        if (day.length() == 1) {
            day = "0" + day;
        }
        if (month.length() == 1) {
            month = "0" + month;
        }
        System.out.println(day + "/" + month + "/" + year);
    }
}

package J03Encapsulation;
/*
Time
- Time là lớp được dùng để lưu thông tin về giờ, phút, giây.
- hour, minute, second lần lượt là các thuộc tính chỉ giờ, phút, giây của lớp Time.
- Time(hour: int, minute: int, second: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
- setTime(hour: int, minute: int, second: int) là phương thức dùng để thay đổi giá trị của các thuộc tính hour, minute, second.
- nextSecond() là phương thức tăng thời gian của đối tượng lên 1 giây. Ví dụ:
- Giá trị của các thuộc tính trước và sau khi gọi phương thức nextSecond() là hour = 7, minute = 7, second = 40 và hour = 7, minute = 7, second = 41.
- Giá trị của các thuộc tính trước và sau khi gọi phương thức nextSecond() là hour = 23, minute = 59, second = 59 và hour = 0, minute = 0, second = 0.
- Giá trị của các thuộc tính trước và sau khi gọi phương thức nextSecond() là hour = 7, minute = 59, second = 59 và hour = 8, minute = 0, second = 0.
- previousSecond() là phương thức giảm thời gian của đối tượng đi 1 giây. Ví dụ:
- Giá trị của các thuộc tính trước và sau khi gọi phương thức previousSecond() là hour = 7, minute = 7, second = 7 và hour = 7, minute = 7, second = 6.
- Giá trị của các thuộc tính trước và sau khi gọi phương thức previousSecond() là hour = 0, minute = 0, second = 0 và hour = 23, minute = 59, second = 59.
- display() là phương thức dùng để hiển thị ra màn hình thông tin về thời gian của đối tượng dưới định dạng "HH:mm:ss". Ví dụ:
- Nếu hour = 1, minute = 8, second = 45 thì sau khi gọi phương thức display() màn hình sẽ hiển thị ra: "01:08:45"
- Nếu hour = 23, minute = 5, second = 7 thì sau khi gọi phương thức display() màn hình sẽ hiển thị ra: "23:05:07"
- Các phương thức còn lại là các setter và getter mà bạn đã biết.
*/
public class Encapsulation26 {
    public static void main(String[] args) {
        Time t = new Time(12, 1, 1);
        t.display();
        t.setTime(23, 59, 59);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(7, 0, 0);
        t.display();
        t.previousSecond();
        t.display();
    }
}
class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void previousSecond() {
        if (hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
            return;
        }
        if (minute == 0 && second == 0) {
            hour--;
            minute = 59;
            second = 59;
            return;
        }
        if (second == 0) {
            minute--;
            second = 59;
            return;
        }
        second--;
    }

    public void nextSecond() {
        if (hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
            return;
        }
        if (minute == 59 && second == 59) {
            hour++;
            minute = 0;
            second = 0;
            return;
        }
        if (second == 59) {
            minute++;
            second = 0;
            return;
        }
        second++;
    }

    void display() {
        String hour = this.hour < 10 ? "0" + Integer.toString(this.hour) : Integer.toString(this.hour);
        String minute = this.minute < 10 ? "0" + Integer.toString(this.minute) : Integer.toString(this.minute);
        String second = this.second < 10 ? "0" + Integer.toString(this.second) : Integer.toString(this.second);
        System.out.println(hour + ":" + minute + ":" + second);
    }
}

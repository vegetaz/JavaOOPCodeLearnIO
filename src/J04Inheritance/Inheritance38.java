package J04Inheritance;
/*
Các loại kế thừa trong Java:
    https://codelearn.io/Media/Default/Users/TuanLQ7/Java_OOP/Untitled.png

Về bản chất, khi một lớp không kế thừa lớp nào thì lớp đó sẽ được kế thừa trực tiếp từ lớp Object giống như đơn kế thừa.
Nhưng nếu lớp đó có kế thừa từ một lớp khác lớp Object thì lớp đó sẽ không được kế thừa trực tiếp từ lớp Object nữa mà là theo kế thừa nhiều cấp.
*/
public class Inheritance38 {
    public static void main(String[] args) {
        System.out.println("Tất cả các lớp trong Java đều được kế thừa từ lớp Object, \n" +
                "mà Java là ngôn ngữ không hỗ trợ đa kế thừa, vậy tại sao một lớp vừa có thể kế thừa lớp Object, \n" +
                "vừa có thể kế thừa lớp khác?");
        System.out.println();
        System.out.println("\tDo lớp đó không kế thừa trực tiếp từ lớp Object mà kế thừa qua nhiều cấp");
    }
}

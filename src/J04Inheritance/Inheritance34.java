package J04Inheritance;
/*
Để ghi đè phương thức của lớp cha thì phương thức của lớp con phải có phạm vi truy cập bằng hoặc rộng hơn phạm vị truy cập của phương thức ở lớp cha.
Trong bài này phạm vi truy cập của phương thức ở lớp con là default và của lớp cha là protected mà default có phạm vi truy cập hẹp hơn protected
nên chương trình sẽ không biên dịch được. Xem lại bảng mô tả các phạm vi truy cập:

Phạm vi truy cập	Truy cập bên trong class?	Truy cập bên trong package?	Truy cập bên ngoài package bởi class con?	Truy cập bên ngoài class và không thuộc class con?
private	                        Y	                            N	                            N 	                                                N
default	                        Y	                            Y	                            N	                                                N
protected	                    Y	                            Y	                            Y	                                                N
public	                        Y	                            Y	                            Y	                                                Y

Từ bảng này có thể sắp xếp các phạm vi truy cập theo thứ tự sau: private -> default -> protected -> public
*/
public class Inheritance34 {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.display();
    }
}
class SuperClass{
    protected void display() {
        System.out.println("Hello from SuperClass");
    }
}

class SubClass extends SuperClass{
    @Override
    public void display() {
        System.out.println("Hello from SubClass");
    }
}

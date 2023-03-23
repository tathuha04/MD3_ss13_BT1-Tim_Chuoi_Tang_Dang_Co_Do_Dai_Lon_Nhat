package rikkei.academy;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            //
            LinkedList<Character> list = new LinkedList<>();
            //thêm thứ tự thứ i vào list
            list.add(string.charAt(i));
            for (int j = 0; j < string.length(); j++) {
                //kiểm tra kí tự tiếp theo có > kí tụ cuối cùng trong list hay không
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            //so sánh kích thước của list trung gian và list chứa chuỗi tăng dần có kích thước lớn nhất
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);// gán max bằng list trung gian
            }
            list.clear();
        }
        //hiển thị chuỗi tăng dần dài nhất
        for (Character ch : max
        ) {
            System.out.println(ch);
        }

    }
}
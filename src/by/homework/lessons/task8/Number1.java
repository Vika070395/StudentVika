package by.homework.lessons.task8;

public class Number1 {

    public static String returnStrings(String str1, String str2) {
            if (str1.endsWith(str2)) {
                return str1.substring(0,str1.indexOf(str2));
            } else {
                return str1.toUpperCase();
            }
        }

        public static void main(String[] args) {

           String result = returnStrings("Я работаю и изучаю JAVA", "и изучаю JAVA");
          System.out.println(result);
       }
    }


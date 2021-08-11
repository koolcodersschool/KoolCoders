package day8_string_manipulation.lesson1;

public class StringIndexOf {
    public static void main(String[] args) {

        String word = "github";

        System.out.println(word.indexOf('g')); //0
        System.out.println(word.indexOf("b")); //5
        System.out.println(word.indexOf("th")); //2

        String technologies = "java,c++,python,tomcat,aws";
        System.out.println(technologies.indexOf("java"));


        int java, c, python, tomcat, aws;
        java = technologies.indexOf("java");
        c = technologies.indexOf("c++");
        python = technologies.indexOf("python");
        tomcat = technologies.indexOf("tomcat");
        aws = technologies.indexOf("aws");

        int html = technologies.indexOf("html");

        System.out.println("java = " + java);
        System.out.println("c = " + c);
        System.out.println("python = " + python);
        System.out.println("tomcat = " + tomcat);
        System.out.println("aws = " + aws);
        System.out.println("html = " + html);

        //technologies -> how can I check if "c++" is in the technologies String
        //contains
        //indexOf result is > -1

        if (technologies.contains("c++")){
            System.out.println("c++ is there");
        }else{
            System.out.println("c++ is not present");
        }

        if (technologies.indexOf("c++") > -1){
            System.out.println("c++ is there");
        }else{
            System.out.println("c++ is not present");
        }

        int firstComma = technologies.indexOf(",");
        System.out.println("firstComma = " + firstComma);
        //int lastComma = technologies.indexOf(",a");
        int lastComma = technologies.lastIndexOf(","); // lastIndexOf -> finds last comma in this case
        System.out.println("lastComma = " + lastComma);

        System.out.println(technologies.indexOf("," ,5)); // it says that find comma but start looking for from index 5

        int secondComma = technologies.indexOf(",",5);
        System.out.println("secondComma = " + secondComma);

        int thirdComma = technologies.indexOf(",",secondComma + 1);
        System.out.println("thirdComma = " + thirdComma);


        String url = "www.cybertekschool.okta.com";

        int firstDot = url.indexOf(".");
        int secondDot = url.indexOf(".",firstDot + 1);
        int lastDot = url.lastIndexOf(".");
        System.out.println("firstDot = " + firstDot);
        System.out.println("secondDot = " + secondDot);
        System.out.println("lastDot = " + lastDot);

        System.out.println(url.indexOf(".", url.indexOf(".") + 1));

    }
}

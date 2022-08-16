public class Strings {
    public static void main(String[] args) {
        String myName = "Anna";
        int length = myName.length();
        System.out.println("My name is " + myName);
        System.out.println("It has " + length + " characters");
        System.out.println(myName.toUpperCase());
        boolean containsNN = myName.contains("nn");
        String light = "Many hands make light work.";
        System.out.println(light.contains("hand"));
        System.out.println(light.startsWith("Some"));
        System.out.println(light.startsWith("many"));
        System.out.println(light.startsWith("Many"));
        System.out.println(light.endsWith("k."));
        System.out.println(light.charAt(2));
        System.out.println(light.indexOf("s"));
        System.out.println(light.replace("light","heavy"));
        System.out.println(light.substring(5));
        System.out.println(light.substring(5,10));

        String name1 = "Dale McGovern";
        String name2 = "Dale Smethurst";
        String firstName1 = name1.substring(0,4);
        String firstName2 = name2.substring(0,4);
        boolean theyAreTheSame = firstName1.equals(firstName2);
        System.out.println(theyAreTheSame);

        String tomorrow;
        String today = "Wednesday";
        if (today.equals("Wednesday")){
            tomorrow = "Thursday";
        }
        else{
            tomorrow = "I don't know";
        }
        System.out.println(tomorrow);
        
        String tomorrow2 = today.equals("Wednesday") ? "Thursday" : "I don't know";
        System.out.println(tomorrow2);

        String students = "Ioan,Heidi,Gloire,Duane,Mary";
        String[] names = students.split(",");
    }
}

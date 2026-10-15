public class PrimitiveTypesAndIf {
    public static void main(String[] args) {
        int studyMinutes = 90;
        double targetHours = 1.5;
        char level = 'B';
        boolean completed = studyMinutes >= targetHours * 60;
        String subject = "Java";

        System.out.println("과목: " + subject);
        System.out.println("공부 시간: " + studyMinutes + "분");
        System.out.println("목표 시간: " + targetHours + "시간");

        if (completed && level == 'A') {
            System.out.println("목표를 달성하고 이해도도 높아요.");
        } else if (completed) {
            System.out.println("목표 공부 시간을 달성했어요.");
        } else {
            System.out.println("조금 더 공부해 봐요.");
        }
    }
}

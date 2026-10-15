public class ArrayBasics {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 100};
        scores[2] = 80;

        int total = 0;
        for (int index = 0; index < scores.length; index++) {
            System.out.println((index + 1) + "번째 점수: " + scores[index]);
            total += scores[index];
        }

        double average = (double) total / scores.length;
        System.out.println("점수 개수: " + scores.length);
        System.out.println("합계: " + total);
        System.out.println("평균: " + average);
    }
}

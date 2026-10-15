public class LoopsAndControlFlow {
    public static void main(String[] args) {
        int totalMinutes = 0;

        for (int day = 1; day <= 7; day++) {
            if (day == 3) {
                System.out.println(day + "일째는 쉬는 날이라 건너뜁니다.");
                continue;
            }

            totalMinutes += 30;
            System.out.println(day + "일째까지 누적: " + totalMinutes + "분");

            if (totalMinutes >= 120) {
                System.out.println("목표 시간에 도달해서 반복을 끝냅니다.");
                break;
            }
        }

        int remaining = 3;
        while (remaining > 0) {
            System.out.println("남은 횟수: " + remaining);
            remaining--;
        }
        System.out.println("반복 종료");
    }
}

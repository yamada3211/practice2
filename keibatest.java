package keiba;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class keibatest {
    static String uma1 = "ライラック";
    static String uma2 = "カラテ";
    static String uma3 = "ダノンザキッド";
    static String uma4 = "ボッケリーニ";
    static String uma5 = "イクイノックス";
    static String uma6 = "スルーセブンシーズ";
    static String uma7 = "プラダリア";

    public static void main(String[] args) {
        List<String> horseList = new ArrayList<>();
        horseList.add(uma1);
        horseList.add(uma2);
        horseList.add(uma3);
        horseList.add(uma4);
        horseList.add(uma5);
        horseList.add(uma6);
        horseList.add(uma7);

        Scanner scanner = new Scanner(System.in);
        List<String> selectedHorses = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("本命か対抗か穴かを入力してください (" + (i + 1) + " / 3):");
            String selection = scanner.next();
            String horse = selectHorse(horseList, selection);
            if (horse != null) {
                selectedHorses.add(horse);
                horseList.remove(horse);
            } else {
                System.out.println("選択が無効です。再度入力してください。");
                i--;
            }
        }

        System.out.println("選ばれた3頭の馬は:");
        for (String horse : selectedHorses) {
            System.out.println(horse);
        }
    }

    public static String selectHorse(List<String> horseList, String selection) {
        Random random = new Random();
        List<String> availableHorses = new ArrayList<>(horseList);
        switch (selection) {
            case "本命":
                break;
            case "対抗":
                availableHorses.remove(uma1); // 本命として選ばれた馬を対抗から除外する
                break;
            case "穴":
                availableHorses.remove(uma1); // 本命として選ばれた馬を穴から除外する
                availableHorses.remove(uma2); // 対抗として選ばれた馬を穴から除外する
                break;
            default:
                return null; // 無効な選択の場合はnullを返す
        }
        if (availableHorses.isEmpty()) {
            return null; // 選択可能な馬がない場合はnullを返す
        }
        int index = random.nextInt(availableHorses.size());
        return availableHorses.get(index);
    }
}

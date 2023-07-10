package keiba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hose {

	static String uma1 = "ライラック";
	static String uma2 = "カラテ";
	static String uma3 = "ダノンザキッド";
	static String uma4 = "ボッケリーニ";
	static String uma5 = "イクイノックス";
	static String uma6 = "スルーセブンシーズ";
	static String uma7 = "プラダリア";

	static List<String> horseList = new ArrayList<>();

	public Hose()	{

		horseList.add(uma1);
		horseList.add(uma2);
		horseList.add(uma3);
		horseList.add(uma4);
		horseList.add(uma5);
		horseList.add(uma6);
		horseList.add(uma7);
	}

	public static void uma() {
		Random random = new Random();
		int min = 0;
		int max = horseList.size() -1;
		int ran = random.nextInt(max - min + 1) + min;
		String select = horseList.get(ran);
		horseList.remove(ran);
		System.out.println(select);
		
}
}

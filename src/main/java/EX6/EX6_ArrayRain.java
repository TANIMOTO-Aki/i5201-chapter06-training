import java.io.*;

public class EX6_ArrayRain {
    public static void main(String[] args) throws IOException {
        /* 変数・配列宣言 */
        int[] Months = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] Deys = new int[12];

        /* 入力準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        /* 日数を入力 */
        System.out.println("雨天の日数を入力？");
        for (int i = 0; i < Deys.length; i++) {
            System.out.print(Months[i] + "月？ ");
            Deys[i] = Integer.parseInt(br.readLine());
        }

        /* グラフの表示 */
        System.out.println("雨天の日数グラフ");
        for (int i = 0; i < Months.length; i++) {
            System.out.print(Months[i] + "月" + "\t");
            for (int j = 0; j <= Deys[i]; j++) {
                System.out.print("*");
            }
            System.out.println("　" + Deys[i]);
        }
    }
}

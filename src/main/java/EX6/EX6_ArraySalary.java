public class EX6_ArraySalary {
    public static void main(String[] args) {
        /* 宣言と初期化 */
        String[] arrayName = new String[] {"小暮次郎","川村麻衣","北上義徳",
                                           "佐野洋子","松原雅彦"};
        int[] arrayMoney = new int[] {184000,175000,261000,163000,226000};
        double[] arrayRatio = new double[arrayMoney.length];
        int total = 0;

        /* 計算 */
        for (int i = 0; i < arrayMoney.length; i++) {
            total += arrayMoney[i];
        }
        for (int i = 0; i < arrayRatio.length; i++) {
            arrayRatio[i] = (double)arrayMoney[i] / total * 100;
        }

        /* 表示 */
        System.out.println("★　給料の状況　★");
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(arrayName[i] + "\t" + arrayMoney[i] + "\t" + "約" + Math.round(arrayRatio[i]) + "%");
        }
        System.out.println("給料合計" + "\t" + total);
    }    
}

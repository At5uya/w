import java.util.Arrays;

public class Array{
    public static void main(String[] args) {
        String scheise = ("54032\n" +
                "64433\n" +
                "71758\n" +
                "133884\n" +
                "76994\n" +
                "99596\n" +
                "90491\n" +
                "89188\n" +
                "142280\n" +
                "127352\n" +
                "62127\n" +
                "79849\n" +
                "96049\n" +
                "56527\n" +
                "148029\n" +
                "81386\n" +
                "149827\n" +
                "105377\n" +
                "91970\n" +
                "98708\n" +
                "88611\n" +
                "99785\n" +
                "99229\n" +
                "88460\n" +
                "80396\n" +
                "70097\n" +
                "91784\n" +
                "81733\n" +
                "75671\n" +
                "106787\n" +
                "77196\n" +
                "132234\n" +
                "98698\n" +
                "115243\n" +
                "119574\n" +
                "142851\n" +
                "58964\n" +
                "137814\n" +
                "127695\n" +
                "92139\n" +
                "106277\n" +
                "51240\n" +
                "121351\n" +
                "78316\n" +
                "129472\n" +
                "65201\n" +
                "116068\n" +
                "72803\n" +
                "52582\n" +
                "135433\n" +
                "87619\n" +
                "68096\n" +
                "116952\n" +
                "106437\n" +
                "70517\n" +
                "69840\n" +
                "89863\n" +
                "134618\n" +
                "83823\n" +
                "113436\n" +
                "103779\n" +
                "134819\n" +
                "107928\n" +
                "138503\n" +
                "82509\n" +
                "90104\n" +
                "98001\n" +
                "76202\n" +
                "136238\n" +
                "66426\n" +
                "74030\n" +
                "55075\n" +
                "124163\n" +
                "57133\n" +
                "79908\n" +
                "109977\n" +
                "66903\n" +
                "125400\n" +
                "130961\n" +
                "149293\n" +
                "99203\n" +
                "120307\n" +
                "142403\n" +
                "50262\n" +
                "52854\n" +
                "70851\n" +
                "142213\n" +
                "77567\n" +
                "149144\n" +
                "144582\n" +
                "58138\n" +
                "61765\n" +
                "116209\n" +
                "128192\n" +
                "137436\n" +
                "101406\n" +
                "69037\n" +
                "107389\n" +
                "112389\n" +
                "124402");
        String[] you = scheise.split("\n");

        int cum = Arrays.stream(you)
                .mapToInt(Integer::parseInt)
                .map(x -> (int) (Math.floor(x/3)) -2)
                .sum();
        System.out.print(cum);
    }
}
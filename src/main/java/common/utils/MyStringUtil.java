package common.utils;

import org.junit.Test;

/**
 * Created by Administrator on 2017/3/21.
 */
public class MyStringUtil {

    public static String[] getStringArr(String fuzzyInfo) {
        String fuzzyInfoTrimed = fuzzyInfo.trim();
        String regex = "\\s+";
        String[] stringArrAll = fuzzyInfoTrimed.split(regex);
//        只取前三个作为要模糊查询的信息
        String[] stringArr = new String[3];
        for (int i = 0;i < 3;i++) {
            stringArr[i] = stringArrAll[i];
        }
        return stringArr;
    }

    @Test
    public void testArr() {
        String fuzzyInfo = "   张三   教授   24    男人  哈哈  ";
        String[] stringArr = MyStringUtil.getStringArr(fuzzyInfo);
        for (int i = 0;i < stringArr.length;i++) {
            if (i == stringArr.length - 1) {
                System.out.println(stringArr[stringArr.length - 1]);
            } else {
                System.out.println(stringArr[i] + ",");
            }
        }


    }


}

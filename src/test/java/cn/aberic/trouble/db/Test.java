/*
 * MIT License
 *
 * Copyright (c) 2018 Aberic Yang
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package cn.aberic.trouble.db;

import cn.aberic.trouble.db.block.TroubleBlock;
import cn.aberic.trouble.db.block.TroubleBlockBody;
import cn.aberic.trouble.db.block.TroubleBlockHeader;
import cn.aberic.trouble.db.core.TDConfig;
import cn.aberic.trouble.db.core.TDManager;
import cn.aberic.trouble.db.tool.Code;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Aberic on 2018/10/8 19:20
 * @see ClassLoader#defineClass(byte[], int, int)
 * @since 1.0
 */
public class Test {

    public static void main(String[] args) {
//        HashRangeMap<String, String> map = new HashRangeMap<>(1);
//        map.putM("1", "2");
//        map.putM("2", "2");
//        map.putM("3", "2");
//        map.putM("4", "2");
//        map.putM("5", "2");
//        map.putM("6", "2");

//        String s1 = Integer.toHexString(1);
//        String s2 = Integer.toHexString(100);
//        String s3 = Integer.toHexString(10000);
//        String s4 = Integer.toHexString(1000000);
//        String s5 = Integer.toHexString(100000000);
//        String s6 = Integer.toHexString(1000000000);
//        String s7 = Integer.toHexString(Integer.MAX_VALUE);
//        int i1 = Integer.parseInt(s1, 16);
//        int i2 = Integer.parseInt(s2, 16);
//        int i3 = Integer.parseInt(s3, 16);
//        int i4 = Integer.parseInt(s4, 16);
//        int i5 = Integer.parseInt(s5, 16);
//        int i6 = Integer.parseInt(s6, 16);
//        int i7 = Integer.parseInt(s7, 16);
//        System.out.println(1 + " - " + s1 + " - " + i1);
//        System.out.println(100 + " - " + s2 + " - " + i2);
//        System.out.println(10000 + " - " + s3 + " - " + i3);
//        System.out.println(1000000 + " - " + s4 + " - " + i4);
//        System.out.println(100000000 + " - " + s5 + " - " + i5);
//        System.out.println(1000000000 + " - " + s6 + " - " + i6);
//        System.out.println(Integer.MAX_VALUE + " - " + s7 + " - " + i7);
//        System.out.println();
//        System.out.println(Integer.toHexString(0));
//        System.out.println(Integer.toHexString(1));
//        System.out.println(Integer.toHexString(254));
//        System.out.println(Integer.toHexString(255));

//        int x = new Random().nextInt(245) + 16;
//        int y = 271 - x;
//        System.out.println("x = " + x + "| y = " + y + "| x + y = " + (x + y));
//        System.out.println(Integer.toHexString(x) + " | hash = " + getIntHash(x));
//        System.out.println(Integer.toHexString(y) + " | hash = " + getIntHash(y));

//        int hashInt = Integer.MAX_VALUE;
//        String hash = getIntHash(hashInt);
//        System.out.println(hashInt + " | " + Integer.toHexString(hashInt) + " | hash = " + hash + "| int = " + parseToInt(hash));
//
//        System.out.println("94 / 3 = " + 94 / 3);
//        System.out.println("95 / 3 = " + 95 / 3);
//
//        System.out.println("Math.pow(2,1) = " + (int) Math.pow(2, 1));
//        System.out.println("Math.pow(2,2) = " + (int) Math.pow(2, 2));
//        System.out.println("Math.pow(2,3) = " + (int) Math.pow(2, 3));
//        System.out.println("Math.pow(2,4) = " + (int) Math.pow(2, 4));

// ====================================================================================================================================
//
//        TDManager<TroubleBlock> manager = new TDManager<>();
//        manager.createMTable("test");
//        TroubleBlock block = new TroubleBlock(null, null);
//        manager.putM("test", 1, block);
//        manager.getM("test", 1);

        TDConfig config = new TDConfig()
                .setTree(3, 100);
        long startTime, estimatedTime;
        TDManager.obtain().config(config);
        // manager.createMTable("haha");
        TDManager.obtain().createDTable("index");
        // HashMemoryMap<Integer, Integer> map = new HashMemoryMap<>(3, 100);
//        HashIntegerMap<Integer> map = new HashIntegerMap<>();
//        TreeMemoryMap<Integer> map = new TreeMemoryMap<>();
//        HashMap<Integer, Integer> hashMap = new HashMap<>();

//        startTime = System.currentTimeMillis();
//        for (int i = 1; i <= 20000000; i++) {
//            map.putM(i, i);
//        }
//        estimatedTime = System.currentTimeMillis() - startTime;
//        System.out.println("TreeMemoryMap putM 耗时 = " + estimatedTime);
//
//        startTime = System.currentTimeMillis();
//        for (int i = 1; i <= 20000000; i++) {
//            // System.out.println("map.getM(" + i + ") = " + map.getM(i));
//            map.getM(i);
//        }
//        estimatedTime = System.currentTimeMillis() - startTime;
//        System.out.println("TreeMemoryMap getM 耗时 = " + estimatedTime);
//        System.out.println("map.size() = " + map.size());
//        System.out.println("map.isEmpty() = " + map.isEmpty());
//
//        System.out.println("=============================================================");
//
//        startTime = System.currentTimeMillis();
//        for (int i = 1; i <= 20000000; i++) {
//            hashMap.putM(i, i);
//        }
//        estimatedTime = System.currentTimeMillis() - startTime;
//        System.out.println("HashMap putM 耗时 = " + estimatedTime);
//
//        startTime = System.currentTimeMillis();
//        for (int i = 1; i <= 20000000; i++) {
//            // System.out.println("map.getM(" + i + ") = " + map.getM(i));
//            hashMap.getM(i);
//        }
//        estimatedTime = System.currentTimeMillis() - startTime;
//        System.out.println("HashMap getM 耗时 = " + estimatedTime);

// ====================================================================================================================================

        for (int i = 1; i <= 5000000; i *= 3) {
            TDManager.obtain().putD("index", i, new TroubleBlock<>(new TroubleBlockHeader(), new TroubleBlockBody(new ArrayList())));
        }
        for (int i = 1; i <= 5000000; i *= 3) {
            System.out.println("map.getD(" + i + ") = " + TDManager.obtain().getD("index", i) + " | map.containsKey(" + i + ") = " + TDManager.obtain().containsDKey("index", i));
        }
        for (int i = 1; i <= 5000000; i *= 2) {
            System.out.println("map.getD(" + i + ") = " + TDManager.obtain().getD("index", i) + " | map.containsKey(" + i + ") = " + TDManager.obtain().containsDKey("index", i));
        }
//        for (int i = 1; i <= 5000000; i *= 2) {
//            System.out.println("map.getD(" + i + ") = " + manager.getD("index", i) + " | map.containsKey(" + i + ") = " + manager.containsDKey("index", i));
//        }

// ====================================================================================================================================

// ====================================================================================================================================

//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            if (i % 10000 == 0) {
//                System.out.println("i = " + i + " 耗时 = " + (System.currentTimeMillis() - startTime));
//            }
//            DBExec.obtain().put("" + i, "" + i);
//        }
//        System.out.println("耗时 = " + (System.currentTimeMillis() - startTime));



//        startTime = System.currentTimeMillis();
//        for (int i = 1; i <= 1000000; i++) {
//            if (i % 10000 == 0) {
//                System.out.println("i = " + i + " 耗时 = " + (System.currentTimeMillis() - startTime));
//            }
//            manager.putD("index", i, i);
//        }
//        System.out.println("耗时 = " + (System.currentTimeMillis() - startTime));
//
//        startTime = System.currentTimeMillis();
//        for (int i = 1; i <= 1000000; i++) {
//            if (i % 10000 == 0) {
//                System.out.println("i = " + i + " 耗时 = " + (System.currentTimeMillis() - startTime));
//            }
//            manager.getD("index", i);
//        }
//        System.out.println("耗时 = " + (System.currentTimeMillis() - startTime));

// ====================================================================================================================================


//        for (int i = 1; i <= 5000000; i*=3) {
//            map.putM(i + "a", i);
//        }
//        for (int i = 1; i <= 5000000; i*=3) {
//            System.out.println("map.getM(" + i + ") = " + map.getM(i + "a") + " | map.containsMKey(" + i + ") = " + map.containsMKey(i + "a"));
//        }
//        for (int i = 1; i <= 5000000; i*=2) {
//            System.out.println("map.getM(" + i + ") = " + map.getM(i + "a") + " | map.containsMKey(" + i + ") = " + map.containsMKey(i + "a"));
//        }

// ====================================================================================================================================



//        map.putM(158, 158);
//        map.putM(157, "b");
//        map.putM(158, "c");
//        map.putM(159, "d");
//        map.putM(160, "e");
//
//        System.out.println();
//        System.out.println("map.getM(148) = " + map.getM(148));
//        System.out.println("map.getM(157) = " + map.getM(157));
//        System.out.println("map.getM(158) = " + map.getM(158));
//        System.out.println("map.getM(159) = " + map.getM(159));
//        System.out.println("map.getM(160) = " + map.getM(160));

//        System.out.println("1 / 4 = " + 1 / 4);
//        System.out.println("3 / 4 = " + 3 / 4);
//        System.out.println("5 / 4 = " + 5 / 4);
//        System.out.println("7 / 4 = " + 7 / 4);
//        System.out.println("9 / 4 = " + 9 / 4);


// ====================================================================================================================================
//        System.out.println("int hash 19860501 = " + Code.int2Hash(19630715));
//        System.out.println("hash int " + Code.int2Hash(19630715) + " = " + Code.hash2Int(Code.int2Hash(19630715)));
// ====================================================================================================================================

    }

    /**
     * 补位符 - z -zi
     *
     * @param i
     * @return
     */
    private static String getIntHash(int i) {
        String s = Integer.toHexString(i);
        StringBuilder sb = new StringBuilder();
        int lastLength = 16 - s.length();
        if (lastLength % 2 == 0) { // 偶数
            int pair = (lastLength - 2) >> 1;
            sb.append(get(pair, i)).append("zi").append(s);

//            for (int m = pair; m > 0; m--) {
//                int x = new Random().nextInt(245) + 16;
//                int y = 271 - x;
//                sb.append(Integer.toHexString(x)).append(Integer.toHexString(y));
//            }
//            sb.append(encode(sb.toString())).append(s);
        } else { // 奇数
            int pair = (lastLength - 1) >> 1;
            sb.append(get(pair, i)).append("z").append(s);


//            for (int m = pair; m > 0; m--) {
//                int x = new Random().nextInt(245) + 16;
//                int y = 271 - x;
//                sb.append(Integer.toHexString(x)).append(Integer.toHexString(y));
//            }
//            sb.append(encode(sb.toString())).append("z").append(s);
        }
        return sb.toString();
    }

    private static String get(int pair, int i) {
        StringBuilder sb = new StringBuilder();
        if (Integer.MAX_VALUE - i < 11) {
            i = 0;
        }
        for (int m = pair; m > 0; m--) {
            while ((i % 100) < 16) {
                i++;
            }
            i += 11;
            sb.append(Integer.toHexString(i % 100));
        }
        return encode(sb.toString());
    }

    private static int parseToInt(String hash) {
        if (hash.contains("zi")) {
            return Integer.parseInt(hash.split("zi")[1], 16);
        } else {
            return Integer.parseInt(hash.split("z")[1], 16);
        }
    }

    /**
     * 对应表
     * ---------------------------------------------------------------
     * | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | a | b | c | d | e | f |
     * ---------------------------------------------------------------
     * | y | x | w | v | u | t | s | r | q | p | o | n | m | l | k | j |
     * ---------------------------------------------------------------
     *
     * @param str
     * @return
     */
    private static String encode(String str) {
        return str
                .replace("0", "y")
                .replace("1", "x")
                .replace("2", "w")
                .replace("3", "v")
                .replace("4", "u")
                .replace("5", "t")
                .replace("6", "s")
                .replace("7", "r")
                .replace("8", "q")
                .replace("9", "p")
                .replace("a", "o")
                .replace("b", "n")
                .replace("c", "m")
                .replace("d", "l")
                .replace("e", "k")
                .replace("f", "j");
    }

//    /**
//     * 对应表
//     * ---------------------------------------------------------------
//     * | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | a | b | c | d | e | f |
//     * ---------------------------------------------------------------
//     * | y | x | w | v | u | t | s | r | q | p | o | n | m | l | k | j |
//     * ---------------------------------------------------------------
//     *
//     * @param str
//     * @return
//     */
//    private static String decode(String str) {
//        return str
//                .replace("y", "0")
//                .replace("x", "1")
//                .replace("w", "2")
//                .replace("v", "3")
//                .replace("u", "4")
//                .replace("t", "5")
//                .replace("s", "6")
//                .replace("r", "7")
//                .replace("q", "8")
//                .replace("p", "9")
//                .replace("o", "a")
//                .replace("n", "b")
//                .replace("m", "c")
//                .replace("l", "d")
//                .replace("k", "e")
//                .replace("j", "f");
//    }

}

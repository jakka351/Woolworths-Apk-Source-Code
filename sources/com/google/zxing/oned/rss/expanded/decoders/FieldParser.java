package com.google.zxing.oned.rss.expanded.decoders;

import YU.a;
import com.google.zxing.NotFoundException;

/* loaded from: classes6.dex */
final class FieldParser {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f16194a;
    public static final Object[][] b;
    public static final Object[][] c;
    public static final Object[][] d;
    public static final Object[][] e;

    static {
        Object obj = new Object();
        f16194a = obj;
        b = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", obj, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", obj, 20}, new Object[]{"22", obj, 29}, new Object[]{"30", obj, 8}, new Object[]{"37", obj, 8}, new Object[]{"90", obj, 30}, new Object[]{"91", obj, 30}, new Object[]{"92", obj, 30}, new Object[]{"93", obj, 30}, new Object[]{"94", obj, 30}, new Object[]{"95", obj, 30}, new Object[]{"96", obj, 30}, new Object[]{"97", obj, 30}, new Object[]{"98", obj, 30}, new Object[]{"99", obj, 30}};
        c = new Object[][]{new Object[]{"240", obj, 30}, new Object[]{"241", obj, 30}, new Object[]{"242", obj, 6}, new Object[]{"250", obj, 30}, new Object[]{"251", obj, 30}, new Object[]{"253", obj, 17}, new Object[]{"254", obj, 20}, new Object[]{"400", obj, 30}, new Object[]{"401", obj, 30}, new Object[]{"402", 17}, new Object[]{"403", obj, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj, 20}, new Object[]{"421", obj, 15}, new Object[]{"422", 3}, new Object[]{"423", obj, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        d = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj, 15}, new Object[]{"391", obj, 18}, new Object[]{"392", obj, 15}, new Object[]{"393", obj, 18}, new Object[]{"703", obj, 30}};
        e = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", obj, 20}, new Object[]{"8003", obj, 30}, new Object[]{"8004", obj, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj, 30}, new Object[]{"8008", obj, 12}, new Object[]{"8018", 18}, new Object[]{"8020", obj, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", obj, 70}, new Object[]{"8200", obj, 70}};
    }

    public static String a(String str) throws NotFoundException {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw NotFoundException.f;
        }
        String strSubstring = str.substring(0, 2);
        int i = 0;
        while (true) {
            Object obj = f16194a;
            if (i >= 24) {
                if (str.length() < 3) {
                    throw NotFoundException.f;
                }
                String strSubstring2 = str.substring(0, 3);
                for (int i2 = 0; i2 < 23; i2++) {
                    Object[] objArr = c[i2];
                    if (objArr[0].equals(strSubstring2)) {
                        Object obj2 = objArr[1];
                        return obj2 == obj ? c(3, ((Integer) objArr[2]).intValue(), str) : b(3, ((Integer) obj2).intValue(), str);
                    }
                }
                for (int i3 = 0; i3 < 57; i3++) {
                    Object[] objArr2 = d[i3];
                    if (objArr2[0].equals(strSubstring2)) {
                        Object obj3 = objArr2[1];
                        return obj3 == obj ? c(4, ((Integer) objArr2[2]).intValue(), str) : b(4, ((Integer) obj3).intValue(), str);
                    }
                }
                if (str.length() < 4) {
                    throw NotFoundException.f;
                }
                String strSubstring3 = str.substring(0, 4);
                for (int i4 = 0; i4 < 18; i4++) {
                    Object[] objArr3 = e[i4];
                    if (objArr3[0].equals(strSubstring3)) {
                        Object obj4 = objArr3[1];
                        return obj4 == obj ? c(4, ((Integer) objArr3[2]).intValue(), str) : b(4, ((Integer) obj4).intValue(), str);
                    }
                }
                throw NotFoundException.f;
            }
            Object[] objArr4 = b[i];
            if (objArr4[0].equals(strSubstring)) {
                Object obj5 = objArr4[1];
                return obj5 == obj ? c(2, ((Integer) objArr4[2]).intValue(), str) : b(2, ((Integer) obj5).intValue(), str);
            }
            i++;
        }
    }

    public static String b(int i, int i2, String str) throws NotFoundException {
        if (str.length() < i) {
            throw NotFoundException.f;
        }
        String strSubstring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            throw NotFoundException.f;
        }
        String strSubstring2 = str.substring(i, i3);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String strA = a(str.substring(i3));
        return strA == null ? str2 : a.g(str2, strA);
    }

    public static String c(int i, int i2, String str) throws NotFoundException {
        String strSubstring = str.substring(0, i);
        int iMin = Math.min(str.length(), i2 + i);
        String strSubstring2 = str.substring(i, iMin);
        String str2 = "(" + strSubstring + ')' + strSubstring2;
        String strA = a(str.substring(iMin));
        return strA == null ? str2 : a.g(str2, strA);
    }
}

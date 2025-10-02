package com.behaviosec.rl;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes4.dex */
public class uuxuuuu {
    public static int e0065eeee0065e = 1;
    public static int ee0065eee0065e = 2;
    public static int eee0065ee0065e = 0;
    public static int eeeeee0065e = 49;
    private static List<uuuuxuu> j006A006A006A006A006Aj = null;
    private static int j006Ajjjj006A = 0;
    public static boolean jj006A006A006A006Aj = true;
    private static char[] jj006Ajjj006A;
    private static List<uuxuuxu> jjjjjj006A;

    public static class uuuuuxu extends uuxuuxu {
        public static int e00650065eee00650065 = 0;
        public static int e0065e0065ee00650065 = 2;
        public static int ee0065eee00650065 = 82;
        public static int eee0065ee00650065 = 1;

        public static int ee00650065ee00650065() {
            return 31;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuxuuxu
        public String p00700070ppppp(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072) + (uuxuuuu.pp00700070pppp()[i % uuxuuuu.pp00700070pppp().length] ^ ((i * c2) + (c + c))));
                if ((ee00650065ee00650065() * (ee00650065ee00650065() + eee0065ee00650065)) % e0065e0065ee00650065 != e00650065eee00650065) {
                    ee0065eee00650065 = ee00650065ee00650065();
                    e00650065eee00650065 = ee00650065ee00650065();
                }
                int i2 = ee0065eee00650065;
                if (((eee0065ee00650065 + i2) * i2) % e0065e0065ee00650065 != e00650065eee00650065) {
                    ee0065eee00650065 = 61;
                    e00650065eee00650065 = ee00650065ee00650065();
                }
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static abstract class uuuuxuu {
        public abstract String pp0070ppppp(String str, char c);
    }

    public static class uuuxuuu extends uuuuxuu {
        public static int e0065e00650065e0065e = 1;
        public static int ee006500650065e0065e = 2;
        public static int eee00650065e0065e = 18;
        public static int eeeee00650065e;

        public static int e0065006500650065e0065e() {
            return 35;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuuuxuu
        public String pp0070ppppp(String str, char c) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = eee00650065e0065e;
            if (((e0065e00650065e0065e + i) * i) % ee006500650065e0065e != eeeee00650065e) {
                eee00650065e0065e = e0065006500650065e0065e();
                eeeee00650065e = e0065006500650065e0065e();
            }
            int i2 = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                iArr[i2] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(c + c + i2 + uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072));
                i2++;
                int i3 = eee00650065e0065e;
                if (((e0065e00650065e0065e + i3) * i3) % ee006500650065e0065e != 0) {
                    eee00650065e0065e = e0065006500650065e0065e();
                    e0065e00650065e0065e = 25;
                }
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class uuuxuxu extends uuxuuxu {
        public static int e006500650065e006500650065 = 82;
        public static int e0065e0065e006500650065 = 1;
        public static int ee00650065e006500650065 = 2;
        public static int eee0065e006500650065;

        public static int e00650065ee006500650065() {
            return 15;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuxuuxu
        public String p00700070ppppp(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                if ((e00650065ee006500650065() * (e00650065ee006500650065() + e0065e0065e006500650065)) % ee00650065e006500650065 != eee0065e006500650065) {
                    eee0065e006500650065 = e00650065ee006500650065();
                }
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(((c + i) + uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072)) - c2);
                i++;
            }
            String str2 = new String(iArr, 0, i);
            int i2 = e006500650065e006500650065;
            if (((e0065e0065e006500650065 + i2) * i2) % ee00650065e006500650065 != 0) {
                e006500650065e006500650065 = e00650065ee006500650065();
                eee0065e006500650065 = e00650065ee006500650065();
            }
            return str2;
        }
    }

    public static class uuuxxuu extends uuuuxuu {
        public static int e0065006500650065ee0065 = 30;
        public static int e00650065ee0065e0065 = 0;
        public static int e0065eee0065e0065 = 2;
        public static int eeeee0065e0065 = 1;

        public static int ee0065ee0065e0065() {
            return 84;
        }

        public static int eee0065e0065e0065() {
            return 2;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuuuxuu
        public String pp0070ppppp(String str, char c) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                int i2 = e0065006500650065ee0065;
                if (((eeeee0065e0065 + i2) * i2) % e0065eee0065e0065 != 0) {
                    e0065006500650065ee0065 = ee0065ee0065e0065();
                    eeeee0065e0065 = ee0065ee0065e0065();
                }
                int iRr0072r007200720072 = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072) + (c ^ i));
                int i3 = e0065006500650065ee0065;
                if (((eeeee0065e0065 + i3) * i3) % eee0065e0065e0065() != e00650065ee0065e0065) {
                    e0065006500650065ee0065 = ee0065ee0065e0065();
                    e00650065ee0065e0065 = ee0065ee0065e0065();
                }
                iArr[i] = iRr0072r007200720072;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static abstract class uuxuuxu {
        public abstract String p00700070ppppp(String str, char c, char c2);
    }

    public static class uuxuxuu extends uuxuuxu {
        public static int e006500650065eee0065 = 77;
        public static int e0065ee0065ee0065 = 2;
        public static int eeee0065ee0065 = 1;

        @Override // com.behaviosec.rl.uuxuuuu.uuxuuxu
        public String p00700070ppppp(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                int iRrr0072007200720072 = uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072);
                int i2 = e006500650065eee0065;
                if (((eeee0065ee0065 + i2) * i2) % e0065ee0065ee0065 != 0) {
                    e006500650065eee0065 = 26;
                    eeee0065ee0065 = 79;
                }
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072((iRrr0072007200720072 - (c + i)) + c2);
                i++;
                int i3 = e006500650065eee0065;
                if (((eeee0065ee0065 + i3) * i3) % e0065ee0065ee0065 != 0) {
                    e006500650065eee0065 = 92;
                    eeee0065ee0065 = 48;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uuxxuuu extends uuxuuxu {
        public static int e006500650065e00650065e = 0;
        public static int e0065ee006500650065e = 2;
        public static int ee00650065e00650065e = 39;
        public static int eeee006500650065e = 1;

        public static int e00650065e006500650065e() {
            return 1;
        }

        public static int ee0065e006500650065e() {
            return 91;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuxuuxu
        public String p00700070ppppp(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072) - (uuxuuuu.pp00700070pppp()[i % uuxuuuu.pp00700070pppp().length] ^ ((i * c2) + c)));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uuxxuxu extends uuuuxuu {
        public static int g00670067ggggg = 2;
        public static int g0067g0067gggg = 1;
        public static int g0067gggggg = 25;
        public static int ggg0067gggg;

        public static int gg00670067gggg() {
            return 69;
        }

        public static int gg0067ggggg() {
            return 1;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuuuxuu
        public String pp0070ppppp(String str, char c) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                int iRrr0072007200720072 = uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072);
                int i2 = g0067gggggg;
                if (((g0067g0067gggg + i2) * i2) % g00670067ggggg != ggg0067gggg) {
                    g0067gggggg = gg00670067gggg();
                    ggg0067gggg = 36;
                }
                int iRr0072r007200720072 = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(iRrr0072007200720072 - (c ^ i));
                int i3 = g0067gggggg;
                if (((gg0067ggggg() + i3) * i3) % g00670067ggggg != 0) {
                    g0067gggggg = 24;
                    g00670067ggggg = 16;
                }
                iArr[i] = iRr0072r007200720072;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uuxxxuu extends uuuuxuu {
        public static int e00650065e00650065e0065 = 1;
        public static int e0065e006500650065e0065 = 80;
        public static int eee006500650065e0065 = 2;

        public static int ee0065e00650065e0065() {
            return 40;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuuuxuu
        public String pp0070ppppp(String str, char c) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = e0065e006500650065e0065;
            if (((e00650065e00650065e0065 + i) * i) % eee006500650065e0065 != 0) {
                e0065e006500650065e0065 = 70;
                e00650065e00650065e0065 = 46;
            }
            int i2 = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                int iRr0072r007200720072 = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(a.a(c, c, c, i2, uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072)));
                int iEe0065e00650065e0065 = ee0065e00650065e0065();
                if (((e00650065e00650065e0065 + iEe0065e00650065e0065) * iEe0065e00650065e0065) % eee006500650065e0065 != 0) {
                    e00650065e00650065e0065 = 93;
                }
                iArr[i2] = iRr0072r007200720072;
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class uxuuuxu extends uuxuuxu {
        public static int e006500650065ee00650065 = 70;
        public static int eeee0065e00650065 = 1;

        public static int e00650065e0065e00650065() {
            return 0;
        }

        public static int e0065ee0065e00650065() {
            return 2;
        }

        public static int ee0065e0065e00650065() {
            return 8;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuxuuxu
        public String p00700070ppppp(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(c + i + uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072) + c2);
                int i2 = e006500650065ee00650065;
                if (((eeee0065e00650065 + i2) * i2) % e0065ee0065e00650065() != 0) {
                    e006500650065ee00650065 = 93;
                    eeee0065e00650065 = ee0065e0065e00650065();
                }
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uxuuxuu extends uuxuuxu {
        public static int e00650065eeee0065 = 1;
        public static int e0065eeeee0065 = 74;
        public static int ee0065eeee0065 = 0;
        public static int eee0065eee0065 = 2;

        public static int e0065e0065eee0065() {
            return 86;
        }

        public static int ee00650065eee0065() {
            return 1;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuxuuxu
        public String p00700070ppppp(String str, char c, char c2) {
            int i = e0065eeeee0065;
            if (((e00650065eeee0065 + i) * i) % eee0065eee0065 != ee0065eeee0065) {
                e0065eeeee0065 = e0065e0065eee0065();
                ee0065eeee0065 = e0065e0065eee0065();
            }
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i2 = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                iArr[i2] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072) + ((i2 * c2) ^ c));
                i2++;
                int i3 = e0065eeeee0065;
                if (((ee00650065eee0065() + i3) * i3) % eee0065eee0065 != 0) {
                    e0065eeeee0065 = e0065e0065eee0065();
                    ee0065eeee0065 = e0065e0065eee0065();
                }
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class uxuxuuu extends uuuuxuu {
        public static int e0065eee00650065e = 37;
        public static int ee0065ee00650065e = 0;
        public static int eee0065e00650065e = 2;

        public static int e00650065ee00650065e() {
            return 1;
        }

        public static int e0065e0065e00650065e() {
            return 71;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuuuxuu
        public String pp0070ppppp(String str, char c) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                if (((e00650065ee00650065e() + e0065eee00650065e) * e0065eee00650065e) % eee0065e00650065e != ee0065ee00650065e) {
                    e0065eee00650065e = 18;
                    ee0065ee00650065e = 13;
                }
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072) - (c + i));
                i++;
                if (((e00650065ee00650065e() + e0065eee00650065e) * e0065eee00650065e) % eee0065e00650065e != ee0065ee00650065e) {
                    e0065eee00650065e = 0;
                    ee0065ee00650065e = e0065e0065e00650065e();
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uxuxuxu extends uuuuxuu {
        public static int e0065ee0065006500650065 = 0;
        public static int ee006500650065006500650065 = 2;
        public static int ee0065e0065006500650065 = 1;
        public static int eeee0065006500650065 = 97;

        public static int e00650065e0065006500650065() {
            return 2;
        }

        public static int e0065e00650065006500650065() {
            return 1;
        }

        public static int eee00650065006500650065() {
            return 30;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuuuxuu
        public String pp0070ppppp(String str, char c) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(c + i + uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072));
                i++;
            }
            String str2 = new String(iArr, 0, i);
            int i2 = eeee0065006500650065;
            if (((e0065e00650065006500650065() + i2) * i2) % ee006500650065006500650065 != 0) {
                eeee0065006500650065 = eee00650065006500650065();
                e0065ee0065006500650065 = 59;
            }
            return str2;
        }
    }

    public static class uxuxxuu extends uuuuxuu {
        public static int e006500650065e0065e0065 = 1;
        public static int e0065e0065e0065e0065 = 84;
        public static int ee00650065e0065e0065 = 0;
        public static int eeee00650065e0065 = 2;

        public static int e0065ee00650065e0065() {
            return 84;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuuuxuu
        public String pp0070ppppp(String str, char c) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072) + (uuxuuuu.pp00700070pppp()[i % uuxuuuu.pp00700070pppp().length] ^ ((c + c) + i)));
                i++;
            }
            String str2 = new String(iArr, 0, i);
            int i2 = e0065e0065e0065e0065;
            if (((e006500650065e0065e0065 + i2) * i2) % eeee00650065e0065 != ee00650065e0065e0065) {
                int iE0065ee00650065e0065 = e0065ee00650065e0065();
                e0065e0065e0065e0065 = iE0065ee00650065e0065;
                ee00650065e0065e0065 = 74;
                if (((e006500650065e0065e0065 + iE0065ee00650065e0065) * iE0065ee00650065e0065) % eeee00650065e0065 != 0) {
                    e0065e0065e0065e0065 = e0065ee00650065e0065();
                    ee00650065e0065e0065 = 89;
                }
            }
            return str2;
        }
    }

    public static class uxxuuuu extends uuuuxuu {
        public static int e006500650065ee0065e = 34;
        public static int e0065ee0065e0065e = 2;
        public static int eeee0065e0065e = 1;

        public static int e00650065e0065e0065e() {
            return 42;
        }

        public static int ee0065e0065e0065e() {
            return 0;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuuuxuu
        public String pp0070ppppp(String str, char c) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int i2 = e006500650065ee0065e;
                if (((eeee0065e0065e + i2) * i2) % e0065ee0065e0065e != ee0065e0065e0065e()) {
                    e006500650065ee0065e = e00650065e0065e0065e();
                    eeee0065e0065e = e00650065e0065e0065e();
                }
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                int iRrr0072007200720072 = uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072);
                char c2 = uuxuuuu.pp00700070pppp()[i % uuxuuuu.pp00700070pppp().length];
                int i3 = e006500650065ee0065e;
                if (((eeee0065e0065e + i3) * i3) % e0065ee0065e0065e != 0) {
                    e006500650065ee0065e = 96;
                    eeee0065e0065e = 15;
                }
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(iRrr0072007200720072 - (c2 ^ (c + i)));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uxxuuxu extends uuxuuxu {
        public static int e0065006500650065e00650065 = 2;
        public static int e0065e00650065e00650065 = 0;
        public static int eee00650065e00650065 = 37;
        public static int eeeee006500650065 = 1;

        public static int e0065eee006500650065() {
            return 2;
        }

        public static int ee006500650065e00650065() {
            return 1;
        }

        public static int ee0065ee006500650065() {
            return 6;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuxuuxu
        public String p00700070ppppp(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072) - ((i * c2) ^ c));
                i++;
                int iEe006500650065e00650065 = eee00650065e00650065 + ee006500650065e00650065();
                int i2 = eee00650065e00650065;
                if (((eeeee006500650065 + i2) * i2) % e0065eee006500650065() != 0) {
                    eee00650065e00650065 = ee0065ee006500650065();
                    e0065e00650065e00650065 = ee0065ee006500650065();
                }
                if ((iEe006500650065e00650065 * i2) % e0065006500650065e00650065 != e0065e00650065e00650065) {
                    eee00650065e00650065 = 36;
                    e0065e00650065e00650065 = 28;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uxxuxuu extends uuuuxuu {
        public static int e00650065e0065ee0065 = 1;
        public static int ee0065e0065ee0065 = 50;

        public static int e0065e00650065ee0065() {
            return 1;
        }

        public static int ee006500650065ee0065() {
            return 88;
        }

        public static int eee00650065ee0065() {
            return 2;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuuuxuu
        public String pp0070ppppp(String str, char c) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                int iRrr0072007200720072 = uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072);
                int i2 = c + c + c;
                int i3 = ee0065e0065ee0065;
                if (((e00650065e0065ee0065 + i3) * i3) % eee00650065ee0065() != 0) {
                    ee0065e0065ee0065 = 96;
                    e00650065e0065ee0065 = 93;
                }
                int iRr0072r007200720072 = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(iRrr0072007200720072 - (i2 + i));
                int i4 = ee0065e0065ee0065;
                if (((e0065e00650065ee0065() + i4) * i4) % eee00650065ee0065() != 0) {
                    ee0065e0065ee0065 = ee006500650065ee0065();
                    e00650065e0065ee0065 = 90;
                }
                iArr[i] = iRr0072r007200720072;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uxxxuuu extends uuxuuxu {
        public static int e0065e0065006500650065e = 1;
        public static int ee00650065006500650065e = 2;
        public static int eee0065006500650065e = 42;

        public static int e006500650065006500650065e() {
            return 0;
        }

        public static int eeeeeee0065() {
            return 29;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuxuuxu
        public String p00700070ppppp(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                int iRrr0072007200720072 = uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072);
                int i2 = eee0065006500650065e;
                if (((e0065e0065006500650065e + i2) * i2) % ee00650065006500650065e != 0) {
                    eee0065006500650065e = 79;
                    e0065e0065006500650065e = 83;
                }
                iArr[i] = uxuuxxuVarPpp00700070ppp.rr0072r007200720072((iRrr0072007200720072 - (c + i)) - c2);
                i++;
            }
            String str2 = new String(iArr, 0, i);
            int i3 = eee0065006500650065e;
            if (((e0065e0065006500650065e + i3) * i3) % ee00650065006500650065e != e006500650065006500650065e()) {
                eee0065006500650065e = 88;
                e0065e0065006500650065e = eeeeeee0065();
            }
            return str2;
        }
    }

    public static class uxxxxuu extends uuuuxuu {
        public static int e00650065006500650065e0065 = 1;
        public static int ee0065006500650065e0065 = 34;
        public static int eeeeee00650065 = 2;

        public static int e0065eeee00650065() {
            return 61;
        }

        @Override // com.behaviosec.rl.uuxuuuu.uuuuxuu
        public String pp0070ppppp(String str, char c) {
            int[] iArr = new int[str.length()];
            uxuuuuu uxuuuuuVar = new uxuuuuu(str);
            int i = 0;
            while (uxuuuuuVar.p0070pppppp()) {
                int iRr00720072007200720072 = uxuuuuuVar.rr00720072007200720072();
                uxuuxxu uxuuxxuVarPpp00700070ppp = uxuuxxu.ppp00700070ppp(iRr00720072007200720072);
                int iRr0072r007200720072 = uxuuxxuVarPpp00700070ppp.rr0072r007200720072(uxuuxxuVarPpp00700070ppp.rrr0072007200720072(iRr00720072007200720072) - ((c + c) + i));
                int i2 = ee0065006500650065e0065;
                if (((e00650065006500650065e0065 + i2) * i2) % eeeeee00650065 != 0) {
                    ee0065006500650065e0065 = 41;
                    e00650065006500650065e0065 = e0065eeee00650065();
                }
                iArr[i] = iRr0072r007200720072;
                i++;
                int i3 = ee0065006500650065e0065;
                if (((e00650065006500650065e0065 + i3) * i3) % eeeeee00650065 != 0) {
                    ee0065006500650065e0065 = e0065eeee00650065();
                    e00650065006500650065e0065 = 20;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    static {
        int i = eeeeee0065e;
        if (((e0065eeee0065e + i) * i) % ee00650065ee0065e() != eee0065ee0065e) {
            eeeeee0065e = 65;
            eee0065ee0065e = e00650065eee0065e();
        }
        if (((e0065eeee0065e + i) * i) % ee0065eee0065e != 0) {
            eeeeee0065e = e00650065eee0065e();
            eee0065ee0065e = 63;
        }
        j006Ajjjj006A = 116;
    }

    public static int e00650065eee0065e() {
        return 74;
    }

    public static int e0065e0065ee0065e() {
        return 1;
    }

    public static int ee00650065ee0065e() {
        return 2;
    }

    private static String p007000700070pppp(String str, char c, char c2, char c3) {
        p0070pp0070ppp();
        try {
            uuxuuxu uuxuuxuVar = jjjjjj006A.get(c3);
            int i = eeeeee0065e;
            if (((e0065eeee0065e + i) * i) % ee0065eee0065e != 0) {
                int iE00650065eee0065e = e00650065eee0065e();
                if (((e0065e0065ee0065e() + iE00650065eee0065e) * iE00650065eee0065e) % ee00650065ee0065e() != 0) {
                    eeeeee0065e = 0;
                    eee0065ee0065e = e00650065eee0065e();
                }
                eeeeee0065e = 25;
                eee0065ee0065e = e00650065eee0065e();
            }
            return uuxuuxuVar.p00700070ppppp(str, c, c2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static void p0070p0070pppp(int i) {
        int i2 = eeeeee0065e;
        if (((e0065eeee0065e + i2) * i2) % ee0065eee0065e != 0) {
            int iE00650065eee0065e = e00650065eee0065e();
            eeeeee0065e = iE00650065eee0065e;
            e0065eeee0065e = 5;
            if (((iE00650065eee0065e + 5) * iE00650065eee0065e) % ee0065eee0065e != eee0065ee0065e) {
                eeeeee0065e = 50;
                eee0065ee0065e = 12;
            }
        }
        if (i > 128 || i < 0) {
            i = 0;
        }
        j006Ajjjj006A = i;
    }

    private static synchronized void p0070pp0070ppp() {
        try {
            if (jj006A006A006A006Aj) {
                jj006A006A006A006Aj = false;
                char[] cArr = new char[46];
                cArr[0] = 0;
                cArr[1] = 25237;
                cArr[2] = 25127;
                cArr[3] = 25031;
                cArr[4] = 24443;
                cArr[5] = 24359;
                cArr[6] = 24203;
                cArr[7] = 23671;
                cArr[8] = 23593;
                try {
                    cArr[9] = 22993;
                    cArr[10] = 22871;
                    cArr[11] = 22769;
                    cArr[12] = 22691;
                    cArr[13] = 22573;
                    cArr[14] = 21683;
                    cArr[15] = 21589;
                    cArr[16] = 21517;
                    cArr[17] = 21407;
                    cArr[18] = 21319;
                    cArr[19] = 20183;
                    cArr[20] = 20113;
                    cArr[21] = 19267;
                    cArr[22] = 19181;
                    cArr[23] = 18541;
                    cArr[24] = 18451;
                    cArr[25] = 18367;
                    cArr[26] = 18269;
                    cArr[27] = 17419;
                    cArr[28] = 17341;
                    cArr[29] = 17231;
                    cArr[30] = 17123;
                    cArr[31] = 17029;
                    cArr[32] = 16937;
                    cArr[33] = 16843;
                    cArr[34] = 15803;
                    cArr[35] = 15733;
                    cArr[36] = 15643;
                    cArr[37] = 15551;
                    cArr[38] = 14249;
                    cArr[39] = 14143;
                    cArr[40] = 14011;
                    cArr[41] = 13907;
                    cArr[42] = 13829;
                    int i = eeeeee0065e;
                    if (((e0065eeee0065e + i) * i) % ee0065eee0065e != 0) {
                        eeeeee0065e = e00650065eee0065e();
                        eee0065ee0065e = 60;
                    }
                    cArr[43] = 13723;
                    cArr[44] = 13669;
                    cArr[45] = 13553;
                    jj006Ajjj006A = cArr;
                    j006A006A006A006A006Aj = new ArrayList(10);
                    jjjjjj006A = new ArrayList(8);
                    j006A006A006A006A006Aj.add(new uxuxuuu());
                    j006A006A006A006A006Aj.add(new uxxxxuu());
                    j006A006A006A006A006Aj.add(new uxxuxuu());
                    j006A006A006A006A006Aj.add(new uxuxuxu());
                    j006A006A006A006A006Aj.add(new uuuxuuu());
                    j006A006A006A006A006Aj.add(new uuxxxuu());
                    List<uuuuxuu> list = j006A006A006A006A006Aj;
                    int i2 = eeeeee0065e;
                    if (((e0065eeee0065e + i2) * i2) % ee0065eee0065e != eee0065ee0065e) {
                        eeeeee0065e = 79;
                        eee0065ee0065e = 47;
                    }
                    list.add(new uuuxxuu());
                    j006A006A006A006A006Aj.add(new uuxxuxu());
                    j006A006A006A006A006Aj.add(new uxxuuuu());
                    j006A006A006A006A006Aj.add(new uxuxxuu());
                    jjjjjj006A.add(new uuxuxuu());
                    jjjjjj006A.add(new uuuxuxu());
                    jjjjjj006A.add(new uxxxuuu());
                    jjjjjj006A.add(new uxuuuxu());
                    jjjjjj006A.add(new uxuuxuu());
                    jjjjjj006A.add(new uxxuuxu());
                    jjjjjj006A.add(new uuxxuuu());
                    jjjjjj006A.add(new uuuuuxu());
                    Collections.shuffle(j006A006A006A006A006Aj, new Random(j006Ajjjj006A));
                    Collections.shuffle(jjjjjj006A, new Random(j006Ajjjj006A));
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static /* synthetic */ char[] pp00700070pppp() {
        int iE00650065eee0065e = e00650065eee0065e();
        if (((e0065eeee0065e + iE00650065eee0065e) * iE00650065eee0065e) % ee0065eee0065e != 0) {
            eeeeee0065e = e00650065eee0065e();
            eee0065ee0065e = e00650065eee0065e();
        }
        char[] cArr = jj006Ajjj006A;
        int i = eeeeee0065e;
        if (((e0065eeee0065e + i) * i) % ee0065eee0065e != eee0065ee0065e) {
            eeeeee0065e = 6;
            eee0065ee0065e = e00650065eee0065e();
        }
        return cArr;
    }

    public static String pp0070p0070ppp(String str, char c, char c2, char c3) {
        int i = eeeeee0065e;
        if (((e0065eeee0065e + i) * i) % ee0065eee0065e != eee0065ee0065e) {
            if (((e0065e0065ee0065e() + i) * eeeeee0065e) % ee0065eee0065e != eee0065ee0065e) {
                eeeeee0065e = e00650065eee0065e();
                eee0065ee0065e = e00650065eee0065e();
            }
            eeeeee0065e = e00650065eee0065e();
            eee0065ee0065e = e00650065eee0065e();
        }
        return p007000700070pppp(str, c, c2, c3).intern();
    }

    private static String ppp0070pppp(String str, char c, char c2) {
        p0070pp0070ppp();
        int iE0065e0065ee0065e = eeeeee0065e + e0065e0065ee0065e();
        int i = eeeeee0065e;
        if (((e0065eeee0065e + i) * i) % ee00650065ee0065e() != eee0065ee0065e) {
            eeeeee0065e = e00650065eee0065e();
            eee0065ee0065e = 41;
        }
        if ((iE0065e0065ee0065e * i) % ee0065eee0065e != eee0065ee0065e) {
            eeeeee0065e = e00650065eee0065e();
            eee0065ee0065e = 61;
        }
        try {
            return j006A006A006A006A006Aj.get(c2).pp0070ppppp(str, c);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String pppp0070ppp(String str, char c, char c2) {
        String strPpp0070pppp = ppp0070pppp(str, c, c2);
        int iE0065e0065ee0065e = e0065e0065ee0065e() + eeeeee0065e;
        int i = eeeeee0065e;
        int i2 = ee0065eee0065e;
        if ((iE0065e0065ee0065e * i) % i2 != eee0065ee0065e) {
            if (YU.a.z(i, e0065eeee0065e, i, i2) != 0) {
                eeeeee0065e = 79;
                eee0065ee0065e = 76;
            }
            eeeeee0065e = e00650065eee0065e();
            eee0065ee0065e = 43;
        }
        return strPpp0070pppp.intern();
    }
}

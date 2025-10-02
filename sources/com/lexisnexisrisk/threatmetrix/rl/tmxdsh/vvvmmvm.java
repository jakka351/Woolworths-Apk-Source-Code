package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes6.dex */
public class vvvmmvm {
    private static List<vmmvmmm> p00700070p00700070p = null;
    private static int p0070p007000700070p = 0;
    private static char[] pp0070007000700070p = null;
    public static boolean pp0070p00700070p = false;
    private static List<vmvvvmm> ppp007000700070p = null;
    public static int s00730073s00730073s = 2;
    public static int s0073ss00730073s = 0;
    public static int ss0073s00730073s = 1;
    public static int ssss00730073s = 34;

    public static class aagaaaa extends vmmvmmm {
        public static int y00790079y007900790079 = 0;
        public static int y0079y0079007900790079 = 2;
        public static int yy0079y007900790079 = 54;
        public static int yyy0079007900790079 = 1;

        public static int k006Bkkkkk() {
            return 2;
        }

        public static int yy00790079007900790079() {
            return 72;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmmvmmm
        public String n006En006Ennn(String str, char c) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int i2 = yy0079y007900790079;
                if (((yyy0079007900790079 + i2) * i2) % k006Bkkkkk() != 0) {
                    yy0079y007900790079 = yy00790079007900790079();
                    y00790079y007900790079 = yy00790079007900790079();
                }
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                iArr[i] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn) - (vvvmmvm.n006Enn006Enn()[i % vvvmmvm.n006Enn006Enn().length] ^ (c + i)));
                int i3 = yy0079y007900790079;
                if (((yyy0079007900790079 + i3) * i3) % y0079y0079007900790079 != y00790079y007900790079) {
                    yy0079y007900790079 = 85;
                    y00790079y007900790079 = yy00790079007900790079();
                }
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class agaaaaa extends vmmvmmm {
        public static int y007900790079y00790079 = 1;
        public static int y0079y0079y00790079 = 88;
        public static int yy00790079y00790079 = 0;
        public static int yyyy007900790079 = 2;

        public static int y0079yy007900790079() {
            return 16;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmmvmmm
        public String n006En006Ennn(String str, char c) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                iArr[i] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(c + c + i + vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn));
                i++;
                int i2 = y0079y0079y00790079;
                if (((y007900790079y00790079 + i2) * i2) % yyyy007900790079 != yy00790079y00790079) {
                    y0079y0079y00790079 = y0079yy007900790079();
                    yy00790079y00790079 = y0079yy007900790079();
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class vmmmmvm extends vmvvvmm {
        public static int s00730073s0073s0073 = 1;
        public static int s0073ss0073s0073 = 20;
        public static int sss00730073s0073 = 2;

        public static int s0073s00730073s0073() {
            return 1;
        }

        public static int ss0073s0073s0073() {
            return 0;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmvvvmm
        public String nn006E006Ennn(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                int iH0068h0068006800680068 = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(((c + i) + vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn)) - c2);
                int i2 = s0073ss0073s0073;
                if (((s00730073s0073s0073 + i2) * i2) % sss00730073s0073 != ss0073s0073s0073()) {
                    s0073ss0073s0073 = 59;
                    s00730073s0073s0073 = 70;
                }
                int i3 = s0073ss0073s0073;
                if (((s0073s00730073s0073() + i3) * i3) % sss00730073s0073 != 0) {
                    s0073ss0073s0073 = 4;
                    s00730073s0073s0073 = 9;
                }
                iArr[i] = iH0068h0068006800680068;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class vmmmvmm extends vmmvmmm {
        public static int y0079007900790079yy = 1;
        public static int y0079y00790079yy = 58;
        public static int yy007900790079yy = 0;
        public static int yyyyy0079y = 2;

        public static int y0079yyy0079y() {
            return 34;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmmvmmm
        public String n006En006Ennn(String str, char c) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = 0;
            while (true) {
                boolean zN006E006E006E006Enn = aggaaaaVar.n006E006E006E006Enn();
                int i2 = y0079y00790079yy;
                if (((y0079007900790079yy + i2) * i2) % yyyyy0079y != 0) {
                    y0079y00790079yy = y0079yyy0079y();
                    yy007900790079yy = 13;
                }
                if (!zN006E006E006E006Enn) {
                    return new String(iArr, 0, i);
                }
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                iArr[i] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn) + (c ^ i));
                i++;
                int i3 = y0079y00790079yy;
                if (((y0079007900790079yy + i3) * i3) % yyyyy0079y != yy007900790079yy) {
                    y0079y00790079yy = y0079yyy0079y();
                    yy007900790079yy = y0079yyy0079y();
                }
            }
        }
    }

    public static abstract class vmmvmmm {
        public abstract String n006En006Ennn(String str, char c);
    }

    public static class vmmvvmm extends vmvvvmm {
        public static int s007300730073s00730073 = 76;
        public static int s0073ss007300730073 = 1;
        public static int ss0073s007300730073 = 2;
        public static int ssss007300730073;

        public static int s00730073s007300730073() {
            return 16;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmvvvmm
        public String nn006E006Ennn(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                int i2 = s007300730073s00730073;
                if (((s0073ss007300730073 + i2) * i2) % ss0073s007300730073 != ssss007300730073) {
                    s007300730073s00730073 = s00730073s007300730073();
                    ssss007300730073 = 88;
                }
                int iN006Ennnnn = vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn);
                int i3 = s007300730073s00730073;
                if (((s0073ss007300730073 + i3) * i3) % ss0073s007300730073 != ssss007300730073) {
                    s007300730073s00730073 = 30;
                    ssss007300730073 = s00730073s007300730073();
                }
                iArr[i] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(iN006Ennnnn + (vvvmmvm.n006Enn006Enn()[i % vvvmmvm.n006Enn006Enn().length] ^ ((i * c2) + (c + c))));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class vmvmmmm extends vmvvvmm {
        public static int y0079y00790079y0079 = 1;
        public static int yy007900790079y0079 = 2;
        public static int yyy00790079y0079 = 59;

        public static int y0079007900790079y0079() {
            return 17;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmvvvmm
        public String nn006E006Ennn(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = yyy00790079y0079;
            if (((y0079y00790079y0079 + i) * i) % yy007900790079y0079 != 0) {
                yyy00790079y0079 = 86;
                y0079y00790079y0079 = 56;
            }
            int i2 = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                int iN006Ennnnn = vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn);
                char[] cArrN006Enn006Enn = vvvmmvm.n006Enn006Enn();
                int length = i2 % vvvmmvm.n006Enn006Enn().length;
                int iY0079007900790079y0079 = y0079007900790079y0079();
                if (((y0079y00790079y0079 + iY0079007900790079y0079) * iY0079007900790079y0079) % yy007900790079y0079 != 0) {
                    yyy00790079y0079 = y0079007900790079y0079();
                    y0079y00790079y0079 = y0079007900790079y0079();
                }
                iArr[i2] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(iN006Ennnnn - (cArrN006Enn006Enn[length] ^ ((i2 * c2) + c)));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class vmvmmvm extends vmmvmmm {
        public static int s00730073007300730073s = 42;
        public static int s0073ssss0073 = 1;
        public static int ss0073sss0073 = 2;
        public static int ssssss0073;

        public static int s00730073sss0073() {
            return 27;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmmvmmm
        public String n006En006Ennn(String str, char c) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                int i2 = s00730073007300730073s;
                if (((s0073ssss0073 + i2) * i2) % ss0073sss0073 != ssssss0073) {
                    s00730073007300730073s = 27;
                    ssssss0073 = s00730073sss0073();
                }
                int iN006Ennnnn = vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn);
                int i3 = s00730073007300730073s;
                if (((s0073ssss0073 + i3) * i3) % ss0073sss0073 != 0) {
                    s00730073007300730073s = s00730073sss0073();
                    ssssss0073 = s00730073sss0073();
                }
                iArr[i] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(iN006Ennnnn - (c ^ i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class vmvmvmm extends vmmvmmm {
        public static int y007900790079yyy = 0;
        public static int y00790079yyyy = 63;
        public static int y0079y0079yyy = 2;
        public static int yyy0079yyy = 1;

        public static int yy00790079yyy() {
            return 13;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmmvmmm
        public String n006En006Ennn(String str, char c) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                iArr[i] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(a.a(c, c, c, i, vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn)));
                i++;
                int i2 = y00790079yyyy;
                if (((yyy0079yyy + i2) * i2) % y0079y0079yyy != 0) {
                    y00790079yyyy = yy00790079yyy();
                    yyy0079yyy = 14;
                }
            }
            String str2 = new String(iArr, 0, i);
            int i3 = y00790079yyyy;
            if (((yyy0079yyy + i3) * i3) % y0079y0079yyy != y007900790079yyy) {
                y00790079yyyy = 51;
                y007900790079yyy = 52;
            }
            return str2;
        }
    }

    public static class vmvvmmm extends vmvvvmm {
        public static int y0079y007900790079y = 37;
        public static int yy0079007900790079y = 1;
        public static int yy0079y00790079y = 0;
        public static int yyy007900790079y = 2;

        public static int y00790079y00790079y() {
            return 1;
        }

        public static int y0079yy00790079y() {
            return 75;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmvvvmm
        public String nn006E006Ennn(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = y0079y007900790079y;
            if (((yy0079007900790079y + i) * i) % yyy007900790079y != 0) {
                y0079y007900790079y = 72;
                yy0079y00790079y = 83;
            }
            int i2 = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                iArr[i2] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068((vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn) - (c + i2)) + c2);
                i2++;
                if (((y0079yy00790079y() + y00790079y00790079y()) * y0079yy00790079y()) % yyy007900790079y != yy0079y00790079y) {
                    yy0079y00790079y = y0079yy00790079y();
                }
            }
            return new String(iArr, 0, i2);
        }
    }

    public static abstract class vmvvvmm {
        public abstract String nn006E006Ennn(String str, char c, char c2);
    }

    public static class vvmmmmm extends vmmvmmm {
        public static int y00790079yy00790079 = 2;
        public static int y0079yyy00790079 = 0;
        public static int yy0079yy00790079 = 1;
        public static int yyyyy00790079 = 10;

        public static int yyy0079y00790079() {
            return 97;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmmvmmm
        public String n006En006Ennn(String str, char c) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = yyyyy00790079;
            if (((yy0079yy00790079 + i) * i) % y00790079yy00790079 != 0) {
                yyyyy00790079 = 91;
                y0079yyy00790079 = 32;
            }
            int i2 = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                iArr[i2] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn) - (c + i2));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class vvmmmvm extends vmmvmmm {
        public static int s007300730073ss0073 = 2;
        public static int s0073s0073ss0073 = 0;
        public static int ss00730073ss0073 = 1;
        public static int ssss0073s0073 = 37;

        public static int sss0073ss0073() {
            return 88;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmmvmmm
        public String n006En006Ennn(String str, char c) {
            int[] iArr = new int[str.length()];
            int i = ssss0073s0073;
            if (((ss00730073ss0073 + i) * i) % s007300730073ss0073 != s0073s0073ss0073) {
                ssss0073s0073 = sss0073ss0073();
                s0073s0073ss0073 = sss0073ss0073();
            }
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i2 = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                if ((sss0073ss0073() * (sss0073ss0073() + ss00730073ss0073)) % s007300730073ss0073 != s0073s0073ss0073) {
                    s0073s0073ss0073 = 67;
                }
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                iArr[i2] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(c + i2 + vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class vvmmvmm extends vmmvmmm {
        public static int y00790079y0079yy = 2;
        public static int y0079yy0079yy = 0;
        public static int yy0079y0079yy = 1;
        public static int yyyy0079yy = 78;

        public static int yyy00790079yy() {
            return 86;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmmvmmm
        public String n006En006Ennn(String str, char c) {
            int length = str.length();
            int i = yyyy0079yy;
            if (((yy0079y0079yy + i) * i) % y00790079y0079yy != y0079yy0079yy) {
                yyyy0079yy = 8;
                y0079yy0079yy = yyy00790079yy();
            }
            int[] iArr = new int[length];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i2 = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                int iH0068h0068006800680068 = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn) + (vvvmmvm.n006Enn006Enn()[i2 % vvvmmvm.n006Enn006Enn().length] ^ ((c + c) + i2)));
                int i3 = yyyy0079yy;
                if (((yy0079y0079yy + i3) * i3) % y00790079y0079yy != y0079yy0079yy) {
                    yyyy0079yy = yyy00790079yy();
                    y0079yy0079yy = 11;
                }
                iArr[i2] = iH0068h0068006800680068;
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class vvmvmmm extends vmvvvmm {
        public static int y00790079007900790079y = 27;
        public static int yy0079yyy0079 = 2;
        public static int yyy0079yy0079 = 1;
        public static int yyyyyy0079;

        public static int y00790079yyy0079() {
            return 86;
        }

        public static int y0079yyyy0079() {
            return 1;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmvvvmm
        public String nn006E006Ennn(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                int iN006Ennnnn = vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn);
                int iY0079yyyy0079 = y0079yyyy0079() + y00790079007900790079y;
                int i2 = y00790079007900790079y;
                int i3 = iY0079yyyy0079 * i2;
                if (((yyy0079yy0079 + i2) * i2) % yy0079yyy0079 != 0) {
                    y00790079007900790079y = 12;
                    yyyyyy0079 = y00790079yyy0079();
                }
                if (i3 % yy0079yyy0079 != yyyyyy0079) {
                    y00790079007900790079y = 19;
                    yyyyyy0079 = y00790079yyy0079();
                }
                iArr[i] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(iN006Ennnnn + ((i * c2) ^ c));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class vvmvvmm extends vmvvvmm {
        public static int s00730073ss00730073 = 30;
        public static int s0073s0073s00730073 = 2;
        public static int sss0073s00730073 = 1;

        public static int ss00730073s00730073() {
            return 51;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmvvvmm
        public String nn006E006Ennn(String str, char c, char c2) {
            int i = s00730073ss00730073;
            if (((sss0073s00730073 + i) * i) % s0073s0073s00730073 != 0) {
                s00730073ss00730073 = 97;
                sss0073s00730073 = ss00730073s00730073();
            }
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i2 = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                int i3 = s00730073ss00730073;
                if (((sss0073s00730073 + i3) * i3) % s0073s0073s00730073 != 0) {
                    s00730073ss00730073 = 99;
                    sss0073s00730073 = ss00730073s00730073();
                }
                iArr[i2] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(c + i2 + vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn) + c2);
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class vvvmmmm extends vmvvvmm {
        public static int y0079y0079yy0079 = 26;
        public static int yy00790079yy0079 = 0;
        public static int yy0079y0079y0079 = 1;
        public static int yyyy0079y0079 = 2;

        public static int y007900790079yy0079() {
            return 1;
        }

        public static int y00790079y0079y0079() {
            return 2;
        }

        public static int y0079yy0079y0079() {
            return 1;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmvvvmm
        public String nn006E006Ennn(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                int iN006Ennnnn = vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn);
                int i2 = y0079y0079yy0079;
                if (((yy0079y0079y0079 + i2) * i2) % y00790079y0079y0079() != yy00790079yy0079) {
                    y0079y0079yy0079 = y0079yy0079y0079();
                    yy00790079yy0079 = y0079yy0079y0079();
                }
                iArr[i] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068((iN006Ennnnn - (c + i)) - c2);
                if (((y007900790079yy0079() + y0079y0079yy0079) * y0079y0079yy0079) % yyyy0079y0079 != yy00790079yy0079) {
                    y0079y0079yy0079 = y0079yy0079y0079();
                    yy00790079yy0079 = y0079yy0079y0079();
                }
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class vvvmvmm extends vmmvmmm {
        public static int s0073s0073007300730073 = 1;
        public static int ss00730073007300730073 = 2;
        public static int sss0073007300730073 = 25;

        public static int y0079yyyyy() {
            return 1;
        }

        public static int yy0079yyyy() {
            return 51;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmmvmmm
        public String n006En006Ennn(String str, char c) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = sss0073007300730073;
            if (((s0073s0073007300730073 + i) * i) % ss00730073007300730073 != 0) {
                sss0073007300730073 = 77;
                s0073s0073007300730073 = 90;
            }
            int i2 = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                int iH0068h0068006800680068 = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn) - ((c + c) + i2));
                int i3 = sss0073007300730073;
                if (((y0079yyyyy() + i3) * i3) % ss00730073007300730073 != 0) {
                    sss0073007300730073 = yy0079yyyy();
                    s0073s0073007300730073 = yy0079yyyy();
                }
                iArr[i2] = iH0068h0068006800680068;
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class vvvvmmm extends vmmvmmm {
        public static int y007900790079y0079y = 1;
        public static int y00790079yy0079y = 0;
        public static int yy0079yy0079y = 21;
        public static int yyyy00790079y = 2;

        public static int y0079y0079y0079y() {
            return 2;
        }

        public static int yy00790079y0079y() {
            return 85;
        }

        public static int yyy0079y0079y() {
            return 1;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmmvmmm
        public String n006En006Ennn(String str, char c) {
            int[] iArr = new int[str.length()];
            aggaaaa aggaaaaVar = new aggaaaa(str);
            int i = yy0079yy0079y;
            if (((y007900790079y0079y + i) * i) % yyyy00790079y != 0) {
                yy0079yy0079y = yy00790079y0079y();
                y00790079yy0079y = yy00790079y0079y();
            }
            int i2 = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                iArr[i2] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn) - (((c + c) + c) + i2));
                i2++;
                if (((yyy0079y0079y() + yy0079yy0079y) * yy0079yy0079y) % y0079y0079y0079y() != y00790079yy0079y) {
                    yy0079yy0079y = 73;
                    y00790079yy0079y = yy00790079y0079y();
                }
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class vvvvvmm extends vmvvvmm {
        public static int s0073007300730073s0073 = 0;
        public static int s0073sss00730073 = 2;
        public static int ss0073ss00730073 = 58;
        public static int sssss00730073 = 1;

        public static int ss007300730073s0073() {
            return 10;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmmvm.vmvvvmm
        public String nn006E006Ennn(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            int i = ss0073ss00730073;
            if (((sssss00730073 + i) * i) % s0073sss00730073 != 0) {
                ss0073ss00730073 = ss007300730073s0073();
                s0073007300730073s0073 = ss007300730073s0073();
            }
            aggaaaa aggaaaaVar = new aggaaaa(str);
            if ((ss007300730073s0073() * (ss007300730073s0073() + sssss00730073)) % s0073sss00730073 != s0073007300730073s0073) {
                s0073007300730073s0073 = ss007300730073s0073();
            }
            int i2 = 0;
            while (aggaaaaVar.n006E006E006E006Enn()) {
                int iNn006E006E006Enn = aggaaaaVar.nn006E006E006Enn();
                vmvvmvm vmvvmvmVarN006E006Ennnn = vmvvmvm.n006E006Ennnn(iNn006E006E006Enn);
                iArr[i2] = vmvvmvmVarN006E006Ennnn.h0068h0068006800680068(vmvvmvmVarN006E006Ennnn.n006Ennnnn(iNn006E006E006Enn) - ((i2 * c2) ^ c));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    static {
        int i = ssss00730073s;
        if (((ss0073s00730073s + i) * i) % s00730073s00730073s != 0) {
            ssss00730073s = sss007300730073s();
            s0073ss00730073s = 2;
        }
        pp0070p00700070p = true;
        int i2 = ssss00730073s;
        if (((ss0073s00730073s + i2) * i2) % s00730073s00730073s != 0) {
            ssss00730073s = sss007300730073s();
            s0073ss00730073s = sss007300730073s();
        }
        p0070p007000700070p = 61;
    }

    private static String n006E006E006Ennn(String str, char c, char c2) {
        nnn006E006Enn();
        try {
            String strN006En006Ennn = p00700070p00700070p.get(c2).n006En006Ennn(str, c);
            int i = ssss00730073s;
            if (((ss0073s00730073s + i) * i) % s00730073s00730073s != ss0073007300730073s()) {
                int i2 = ssss00730073s;
                if (((ss0073s00730073s + i2) * i2) % s00730073s00730073s != 0) {
                    ssss00730073s = sss007300730073s();
                    s0073ss00730073s = 70;
                }
                ssss00730073s = sss007300730073s();
                s0073ss00730073s = sss007300730073s();
            }
            return strN006En006Ennn;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String n006E006En006Enn(String str, char c, char c2) {
        int i = ssss00730073s;
        if (((ss0073s00730073s + i) * i) % s00730073s00730073s != s0073ss00730073s) {
            ssss00730073s = 89;
            s0073ss00730073s = sss007300730073s();
        }
        return n006E006E006Ennn(str, c, c2).intern();
    }

    public static String n006En006E006Enn(String str, char c, char c2, char c3) {
        String strNn006En006Enn = nn006En006Enn(str, c, c2, c3);
        int i = ssss00730073s;
        if (((ss0073s00730073s + i) * i) % s0073s007300730073s() != 0) {
            ssss00730073s = 15;
            s0073ss00730073s = 8;
        }
        int i2 = ssss00730073s;
        if (((ss0073s00730073s + i2) * i2) % s00730073s00730073s != s0073ss00730073s) {
            ssss00730073s = sss007300730073s();
            s0073ss00730073s = 31;
        }
        return strNn006En006Enn.intern();
    }

    public static /* synthetic */ char[] n006Enn006Enn() {
        if ((sss007300730073s() * (sss007300730073s() + ss0073s00730073s)) % s00730073s00730073s != ss0073007300730073s()) {
            ssss00730073s = 57;
            s0073ss00730073s = sss007300730073s();
        }
        char[] cArr = pp0070007000700070p;
        int i = ssss00730073s;
        if (((ss0073s00730073s + i) * i) % s00730073s00730073s != s0073ss00730073s) {
            ssss00730073s = sss007300730073s();
            s0073ss00730073s = 73;
        }
        return cArr;
    }

    private static String nn006En006Enn(String str, char c, char c2, char c3) {
        nnn006E006Enn();
        try {
            return ppp007000700070p.get(c3).nn006E006Ennn(str, c, c2);
        } catch (Exception unused) {
            int i = ssss00730073s;
            int i2 = ss0073s00730073s;
            int i3 = s00730073s00730073s;
            int i4 = ((i + i2) * i) % i3;
            int i5 = s0073ss00730073s;
            if (YU.a.z(i, i2, i, i3) != i5) {
                ssss00730073s = 85;
                s0073ss00730073s = sss007300730073s();
            }
            if (i4 == i5) {
                return "";
            }
            ssss00730073s = sss007300730073s();
            s0073ss00730073s = 12;
            return "";
        }
    }

    private static synchronized void nnn006E006Enn() {
        try {
            try {
                if (pp0070p00700070p) {
                    pp0070p00700070p = false;
                    char[] cArr = new char[46];
                    cArr[0] = 0;
                    cArr[1] = 25237;
                    cArr[2] = 25127;
                    cArr[3] = 25031;
                    cArr[4] = 24443;
                    cArr[5] = 24359;
                    try {
                        cArr[6] = 24203;
                        cArr[7] = 23671;
                        cArr[8] = 23593;
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
                        int i = ssss00730073s;
                        if (((ss0073s00730073s + i) * i) % s00730073s00730073s != s0073ss00730073s) {
                            ssss00730073s = sss007300730073s();
                            s0073ss00730073s = 71;
                        }
                        cArr[24] = 18451;
                        int i2 = ssss00730073s;
                        if (((ss0073s00730073s + i2) * i2) % s00730073s00730073s != 0) {
                            ssss00730073s = 85;
                            s0073ss00730073s = 36;
                        }
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
                        cArr[43] = 13723;
                        cArr[44] = 13669;
                        cArr[45] = 13553;
                        pp0070007000700070p = cArr;
                        p00700070p00700070p = new ArrayList(10);
                        ppp007000700070p = new ArrayList(8);
                        p00700070p00700070p.add(new vvmmmmm());
                        p00700070p00700070p.add(new vvvmvmm());
                        p00700070p00700070p.add(new vvvvmmm());
                        p00700070p00700070p.add(new vvmmmvm());
                        p00700070p00700070p.add(new agaaaaa());
                        p00700070p00700070p.add(new vmvmvmm());
                        p00700070p00700070p.add(new vmmmvmm());
                        p00700070p00700070p.add(new vmvmmvm());
                        List<vmmvmmm> list = p00700070p00700070p;
                        aagaaaa aagaaaaVar = new aagaaaa();
                        int i3 = ssss00730073s;
                        if (((ss0073s00730073s + i3) * i3) % s00730073s00730073s != s0073ss00730073s) {
                            ssss00730073s = sss007300730073s();
                            s0073ss00730073s = sss007300730073s();
                        }
                        list.add(aagaaaaVar);
                        p00700070p00700070p.add(new vvmmvmm());
                        ppp007000700070p.add(new vmvvmmm());
                        ppp007000700070p.add(new vmmmmvm());
                        ppp007000700070p.add(new vvvmmmm());
                        ppp007000700070p.add(new vvmvvmm());
                        ppp007000700070p.add(new vvmvmmm());
                        ppp007000700070p.add(new vvvvvmm());
                        ppp007000700070p.add(new vmvmmmm());
                        ppp007000700070p.add(new vmmvvmm());
                        Collections.shuffle(p00700070p00700070p, new Random(p0070p007000700070p));
                        Collections.shuffle(ppp007000700070p, new Random(p0070p007000700070p));
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void nnnn006Enn(int i) {
        if (i > 128 || i < 0) {
            i = 0;
        }
        int i2 = ssss00730073s;
        if (((ss0073s00730073s + i2) * i2) % s00730073s00730073s != s0073ss00730073s) {
            ssss00730073s = sss007300730073s();
            s0073ss00730073s = 74;
        }
        p0070p007000700070p = i;
    }

    public static int s0073s007300730073s() {
        return 2;
    }

    public static int ss0073007300730073s() {
        return 0;
    }

    public static int sss007300730073s() {
        return 7;
    }
}

package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes6.dex */
public class jxxjjxx {
    private static List<uuuhuuu> l006C006C006Cl006C006C = null;
    private static int l006Cll006C006C006C = 0;
    public static boolean ll006C006Cl006C006C = false;
    private static char[] ll006Cl006C006C006C = null;
    private static List<jjjjxxx> llll006C006C006C = null;
    public static int s00730073007300730073s0073 = 7;
    public static int s00730073sss00730073 = 2;
    public static int s0073ssss00730073 = 1;
    public static int ssssss00730073;

    public static abstract class jjjjxxx {
        public abstract String s0073s007300730073ss(String str, char c, char c2);
    }

    public static class jjjxjxx extends uuuhuuu {
        public static int s007300730073ss00730073 = 1;
        public static int ss00730073ss00730073 = 72;
        public static int ss0073s0073s00730073 = 0;
        public static int ssss0073s00730073 = 2;

        public static int s0073ss0073s00730073() {
            return 74;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.uuuhuuu
        public String sss007300730073ss(String str, char c) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = ss00730073ss00730073;
            if (((s007300730073ss00730073 + i) * i) % ssss0073s00730073 != 0) {
                ss00730073ss00730073 = s0073ss0073s00730073();
                s007300730073ss00730073 = s0073ss0073s00730073();
            }
            int i2 = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int iSsss00730073ss = jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s);
                int i3 = ss00730073ss00730073;
                if (((s007300730073ss00730073 + i3) * i3) % ssss0073s00730073 != ss0073s0073s00730073) {
                    ss00730073ss00730073 = 61;
                    ss0073s0073s00730073 = s0073ss0073s00730073();
                }
                iArr[i2] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(iSsss00730073ss - (c ^ i2));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class jjjxxxx extends uuuhuuu {
        public static int j006A006Aj006Ajjj = 1;
        public static int j006Aj006A006Ajjj = 0;
        public static int j006Ajj006Ajjj = 61;
        public static int jjj006A006Ajjj = 2;

        public static int j006A006A006A006Ajjj() {
            return 26;
        }

        public static int jj006A006A006Ajjj() {
            return 1;
        }

        public static int jj006Aj006Ajjj() {
            return 0;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.uuuhuuu
        public String sss007300730073ss(String str, char c) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int iA = a.a(c, c, c, i, jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s));
                if (((jj006A006A006Ajjj() + j006Ajj006Ajjj) * j006Ajj006Ajjj) % jjj006A006Ajjj != j006Aj006A006Ajjj) {
                    j006Ajj006Ajjj = 81;
                    j006Aj006A006Ajjj = j006A006A006A006Ajjj();
                }
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(iA);
                i++;
            }
            String str2 = new String(iArr, 0, i);
            int i2 = j006Ajj006Ajjj;
            if (((j006A006Aj006Ajjj + i2) * i2) % jjj006A006Ajjj != jj006Aj006Ajjj()) {
                j006Ajj006Ajjj = 76;
                j006A006Aj006Ajjj = 24;
            }
            return str2;
        }
    }

    public static class jjxjxxx extends jjjjxxx {
        public static int j006Ajjjjjj = 1;
        public static int jj006Ajjjjj = 2;
        public static int ss007300730073007300730073 = 87;

        public static int j006A006Ajjjjj() {
            return 60;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.jjjjxxx
        public String s0073s007300730073ss(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int iSs00730073s0073ss = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s) + (jxxjjxx.ssssss0073s()[i % jxxjjxx.ssssss0073s().length] ^ ((i * c2) + (c + c))));
                int i2 = ss007300730073007300730073;
                if (((j006Ajjjjjj + i2) * i2) % jj006Ajjjjj != 0) {
                    ss007300730073007300730073 = j006A006Ajjjjj();
                    j006Ajjjjjj = j006A006Ajjjjj();
                }
                iArr[i] = iSs00730073s0073ss;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class jjxxjxx extends jjjjxxx {
        public static int s0073007300730073s00730073 = 36;
        public static int s0073sss007300730073 = 1;
        public static int ss0073ss007300730073 = 2;
        public static int sssss007300730073;

        public static int s00730073ss007300730073() {
            return 64;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.jjjjxxx
        public String s0073s007300730073ss(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int iSsss00730073ss = jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s);
                int i2 = s0073007300730073s00730073;
                if (((s0073sss007300730073 + i2) * i2) % ss0073ss007300730073 != sssss007300730073) {
                    s0073007300730073s00730073 = 19;
                    sssss007300730073 = s00730073ss007300730073();
                }
                if (((i2 + s0073sss007300730073) * s0073007300730073s00730073) % ss0073ss007300730073 != sssss007300730073) {
                    s0073007300730073s00730073 = 66;
                    sssss007300730073 = 40;
                }
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(((c + i) + iSsss00730073ss) - c2);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class jjxxxxx extends uuuhuuu {
        public static int j006A006A006Aj006Ajj = 2;
        public static int j006Aj006Aj006Ajj = 0;
        public static int jj006A006Aj006Ajj = 1;
        public static int jjj006Aj006Ajj = 41;

        public static int jjjj006A006Ajj() {
            return 80;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.uuuhuuu
        public String sss007300730073ss(String str, char c) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = jjj006Aj006Ajj;
            if (((jj006A006Aj006Ajj + i) * i) % j006A006A006Aj006Ajj != 0) {
                jjj006Aj006Ajj = jjjj006A006Ajj();
                j006Aj006Aj006Ajj = jjjj006A006Ajj();
            }
            int i2 = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                iArr[i2] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s) + (c ^ i2));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class jxjjxxx extends jjjjxxx {
        public static int s0073s00730073007300730073 = 2;
        public static int s0073ss0073007300730073 = 34;
        public static int ss0073s0073007300730073 = 1;

        public static int s00730073s0073007300730073() {
            return 2;
        }

        public static int sss00730073007300730073() {
            return 1;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.jjjjxxx
        public String s0073s007300730073ss(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(c + i + jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s) + c2);
                i++;
                int i2 = s0073ss0073007300730073;
                if (((ss0073s0073007300730073 + i2) * i2) % s00730073s0073007300730073() != 0) {
                    int iSss00730073007300730073 = sss00730073007300730073();
                    s0073ss0073007300730073 = iSss00730073007300730073;
                    ss0073s0073007300730073 = 70;
                    if (((iSss00730073007300730073 + 70) * iSss00730073007300730073) % s0073s00730073007300730073 != 0) {
                        s0073ss0073007300730073 = sss00730073007300730073();
                        ss0073s0073007300730073 = 32;
                    }
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class jxjxjxx extends uuuhuuu {
        public static int s00730073s0073s00730073 = 68;
        public static int s0073s00730073s00730073 = 2;
        public static int sss00730073s00730073 = 1;

        public static int ss007300730073s00730073() {
            return 24;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.uuuhuuu
        public String sss007300730073ss(String str, char c) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = s00730073s0073s00730073;
            if (((sss00730073s00730073 + i) * i) % s0073s00730073s00730073 != 0) {
                s00730073s0073s00730073 = 46;
                sss00730073s00730073 = 76;
            }
            int i2 = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                iArr[i2] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(c + i2 + jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s));
                i2++;
                int i3 = s00730073s0073s00730073;
                if (((sss00730073s00730073 + i3) * i3) % s0073s00730073s00730073 != 0) {
                    s00730073s0073s00730073 = ss007300730073s00730073();
                    sss00730073s00730073 = ss007300730073s00730073();
                }
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class jxjxxxx extends uuuhuuu {
        public static int j006Ajjj006Ajj = 1;
        public static int jj006Ajj006Ajj = 2;
        public static int jjjjj006Ajj = 41;

        public static int j006A006Ajj006Ajj() {
            return 98;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.uuuhuuu
        public String sss007300730073ss(String str, char c) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = jjjjj006Ajj;
            if (((j006Ajjj006Ajj + i) * i) % jj006Ajj006Ajj != 0) {
                jjjjj006Ajj = 3;
                j006Ajjj006Ajj = j006A006Ajj006Ajj();
            }
            int i2 = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int i3 = jjjjj006Ajj;
                if (((j006Ajjj006Ajj + i3) * i3) % jj006Ajj006Ajj != 0) {
                    jjjjj006Ajj = j006A006Ajj006Ajj();
                    j006Ajjj006Ajj = 12;
                }
                iArr[i2] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s) + (jxxjjxx.ssssss0073s()[i2 % jxxjjxx.ssssss0073s().length] ^ ((c + c) + i2)));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class jxxjxxx extends uuuhuuu {
        public static int j006Aj006Ajjjj = 1;
        public static int jj006A006Ajjjj = 2;
        public static int jjj006Ajjjj = 78;
        public static int jjjj006Ajjj;

        public static int j006A006A006Ajjjj() {
            return 94;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.uuuhuuu
        public String sss007300730073ss(String str, char c) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int iSsss00730073ss = jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s);
                int i2 = c + c + i;
                int i3 = jjj006Ajjjj;
                int i4 = j006Aj006Ajjjj;
                int i5 = jj006A006Ajjjj;
                if (((i3 + i4) * i3) % i5 != jjjj006Ajjj) {
                    jjj006Ajjjj = 2;
                    jjjj006Ajjj = 19;
                }
                if (YU.a.z(i3, i4, i3, i5) != 0) {
                    jjj006Ajjjj = j006A006A006Ajjjj();
                    j006Aj006Ajjjj = 79;
                }
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(iSsss00730073ss - i2);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class jxxxjxx extends jjjjxxx {
        public static int s0073s0073s007300730073 = 1;
        public static int ss00730073s007300730073 = 2;
        public static int sss0073s007300730073 = 85;

        public static int s007300730073s007300730073() {
            return 65;
        }

        public static int ssss0073007300730073() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.jjjjxxx
        public String s0073s007300730073ss(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int i2 = sss0073s007300730073;
                if (((s0073s0073s007300730073 + i2) * i2) % ss00730073s007300730073 != 0) {
                    sss0073s007300730073 = 8;
                    int iS007300730073s007300730073 = s007300730073s007300730073();
                    s0073s0073s007300730073 = iS007300730073s007300730073;
                    int i3 = sss0073s007300730073;
                    if (((iS007300730073s007300730073 + i3) * i3) % ssss0073007300730073() != 0) {
                        sss0073s007300730073 = 5;
                        s0073s0073s007300730073 = 2;
                    }
                }
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s) - ((i * c2) ^ c));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uhhhuuu extends uuuhuuu {
        public static int j006A006Aj006A006A006Aj = 1;
        public static int jj006Aj006A006A006Aj = 2;
        public static int jjjj006A006A006Aj;

        public static int j006A006A006Aj006A006Aj() {
            return 25;
        }

        public static int j006Ajj006A006A006Aj() {
            return 1;
        }

        public static int jjj006A006A006A006Aj() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.uuuhuuu
        public String sss007300730073ss(String str, char c) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int iJ006A006A006Aj006A006Aj = j006A006A006Aj006A006Aj();
                if (((j006A006Aj006A006A006Aj + iJ006A006A006Aj006A006Aj) * iJ006A006A006Aj006A006Aj) % jjj006A006A006A006Aj() != 0) {
                    jjjj006A006A006Aj = j006A006A006Aj006A006Aj();
                }
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s) - (c + i));
                i++;
                if (((j006A006A006Aj006A006Aj() + j006Ajj006A006A006Aj()) * j006A006A006Aj006A006Aj()) % jj006Aj006A006A006Aj != jjjj006A006A006Aj) {
                    jjjj006A006A006Aj = j006A006A006Aj006A006Aj();
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uhhuuuu extends jjjjxxx {
        public static int j006Aj006Ajj006Aj = 0;
        public static int j006Ajj006Aj006Aj = 2;
        public static int jj006A006Ajj006Aj = 1;
        public static int jjj006Ajj006Aj = 47;

        public static int j006A006A006Ajj006Aj() {
            return 2;
        }

        public static int jjjj006Aj006Aj() {
            return 56;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.jjjjxxx
        public String s0073s007300730073ss(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                int i2 = jjj006Ajj006Aj;
                if (((jj006A006Ajj006Aj + i2) * i2) % j006Ajj006Aj006Aj != j006Aj006Ajj006Aj) {
                    jjj006Ajj006Aj = jjjj006Aj006Aj();
                    j006Aj006Ajj006Aj = 22;
                }
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s) + ((i * c2) ^ c));
                i++;
                int i3 = jjj006Ajj006Aj;
                if (((jj006A006Ajj006Aj + i3) * i3) % j006A006A006Ajj006Aj() != j006Aj006Ajj006Aj) {
                    jjj006Ajj006Aj = jjjj006Aj006Aj();
                    j006Aj006Ajj006Aj = jjjj006Aj006Aj();
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uhuhuuu extends jjjjxxx {
        public static int j006A006Aj006Aj006Aj = 0;
        public static int j006Aj006A006Aj006Aj = 2;
        public static int jj006Aj006Aj006Aj = 67;
        public static int jjj006A006Aj006Aj = 1;

        public static int j006A006A006A006Aj006Aj() {
            return 1;
        }

        public static int jj006A006A006Aj006Aj() {
            return 58;
        }

        public static int jjjjj006A006Aj() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.jjjjxxx
        public String s0073s007300730073ss(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                int i2 = jj006Aj006Aj006Aj;
                if (((jjj006A006Aj006Aj + i2) * i2) % j006Aj006A006Aj006Aj != j006A006Aj006Aj006Aj) {
                    jj006Aj006Aj006Aj = jj006A006A006Aj006Aj();
                    j006A006Aj006Aj006Aj = jj006A006A006Aj006Aj();
                }
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss((jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s) - (c + i)) - c2);
                i++;
            }
            String str2 = new String(iArr, 0, i);
            if (((j006A006A006A006Aj006Aj() + jj006Aj006Aj006Aj) * jj006Aj006Aj006Aj) % jjjjj006A006Aj() != j006A006Aj006Aj006Aj) {
                jj006Aj006Aj006Aj = jj006A006A006Aj006Aj();
                j006A006Aj006Aj006Aj = jj006A006A006Aj006Aj();
            }
            return str2;
        }
    }

    public static class uhuuhuu extends uuuhuuu {
        public static int j006A006Ajjjj006A = 83;
        public static int j006Aj006Ajjj006A = 1;
        public static int jj006A006Ajjj006A = 2;
        public static int jjj006Ajjj006A;

        public static int j006A006A006Ajjj006A() {
            return 51;
        }

        public static int jjjj006Ajj006A() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.uuuhuuu
        public String sss007300730073ss(String str, char c) {
            int length = str.length();
            int i = j006A006Ajjjj006A;
            if (((j006Aj006Ajjj006A + i) * i) % jjjj006Ajj006A() != 0) {
                j006A006Ajjjj006A = j006A006A006Ajjj006A();
                jjj006Ajjj006A = j006A006A006Ajjj006A();
            }
            int[] iArr = new int[length];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i2 = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int i3 = j006A006Ajjjj006A;
                if (((j006Aj006Ajjj006A + i3) * i3) % jj006A006Ajjj006A != jjj006Ajjj006A) {
                    j006A006Ajjjj006A = j006A006A006Ajjj006A();
                    jjj006Ajjj006A = j006A006A006Ajjj006A();
                }
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                iArr[i2] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s) - (jxxjjxx.ssssss0073s()[i2 % jxxjjxx.ssssss0073s().length] ^ (c + i2)));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class uhuuuuu extends uuuhuuu {
        public static int j006A006Aj006A006Ajj = 1;
        public static int j006Aj006A006A006Ajj = 80;
        public static int jj006Aj006A006Ajj = 0;
        public static int jjj006A006A006Ajj = 2;

        public static int j006Ajj006A006Ajj() {
            return 31;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.uuuhuuu
        public String sss007300730073ss(String str, char c) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int iSsss00730073ss = jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s);
                if (((j006Ajj006A006Ajj() + j006A006Aj006A006Ajj) * j006Ajj006A006Ajj()) % jjj006A006A006Ajj != jj006Aj006A006Ajj) {
                    jj006Aj006A006Ajj = j006Ajj006A006Ajj();
                    int i2 = j006Aj006A006A006Ajj;
                    if (((j006A006Aj006A006Ajj + i2) * i2) % jjj006A006A006Ajj != 0) {
                        j006Aj006A006A006Ajj = 17;
                        jj006Aj006A006Ajj = j006Ajj006A006Ajj();
                    }
                }
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(iSsss00730073ss - (((c + c) + c) + i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uuhhuuu extends jjjjxxx {
        public static int j006A006Ajj006A006Aj = 1;
        public static int j006Ajjj006A006Aj = 63;
        public static int jj006A006Aj006A006Aj = 2;
        public static int jj006Ajj006A006Aj;

        public static int j006Aj006Aj006A006Aj() {
            return 48;
        }

        public static int jjj006Aj006A006Aj() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.jjjjxxx
        public String s0073s007300730073ss(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int iSsss00730073ss = jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s);
                char c3 = jxxjjxx.ssssss0073s()[i % jxxjjxx.ssssss0073s().length];
                int i2 = j006Ajjj006A006Aj;
                if (((j006A006Ajj006A006Aj + i2) * i2) % jj006A006Aj006A006Aj != 0) {
                    j006Ajjj006A006Aj = j006Aj006Aj006A006Aj();
                    jj006Ajj006A006Aj = j006Aj006Aj006A006Aj();
                }
                int i3 = j006Ajjj006A006Aj;
                if (((j006A006Ajj006A006Aj + i3) * i3) % jjj006Aj006A006Aj() != jj006Ajj006A006Aj) {
                    j006Ajjj006A006Aj = j006Aj006Aj006A006Aj();
                    jj006Ajj006A006Aj = 42;
                }
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(iSsss00730073ss - (c3 ^ ((i * c2) + c)));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class uuhuuuu extends jjjjxxx {
        public static int j006A006A006A006A006Ajj = 0;
        public static int j006Ajjjj006Aj = 2;
        public static int jj006A006A006A006Ajj = 20;
        public static int jjjjjj006Aj = 1;

        public static int j006A006Ajjj006Aj() {
            return 1;
        }

        public static int jj006Ajjj006Aj() {
            return 92;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.jjjjxxx
        public String s0073s007300730073ss(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int iSsss00730073ss = jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s);
                int i2 = jj006A006A006A006Ajj;
                if (((j006A006Ajjj006Aj() + i2) * i2) % j006Ajjjj006Aj != 0) {
                    jj006A006A006A006Ajj = jj006Ajjj006Aj();
                    j006A006A006A006A006Ajj = 49;
                }
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss((iSsss00730073ss - (c + i)) + c2);
                i++;
                int i3 = jj006A006A006A006Ajj;
                if (((jjjjjj006Aj + i3) * i3) % j006Ajjjj006Aj != j006A006A006A006A006Ajj) {
                    jj006A006A006A006Ajj = jj006Ajjj006Aj();
                    j006A006A006A006A006Ajj = jj006Ajjj006Aj();
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static abstract class uuuhuuu {
        public abstract String sss007300730073ss(String str, char c);
    }

    public static class uuuuhuu extends uuuhuuu {
        public static int j006A006A006A006A006A006Aj = 1;
        public static int j006Aj006A006A006A006Aj = 77;
        public static int jj006A006A006A006A006Aj = 0;
        public static int jjjjjjj006A = 2;

        public static int j006Ajjjjj006A() {
            return 70;
        }

        public static int jj006Ajjjj006A() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.uuuhuuu
        public String sss007300730073ss(String str, char c) {
            int[] iArr = new int[str.length()];
            uuhuhuu uuhuhuuVar = new uuhuhuu(str);
            int i = 0;
            while (uuhuhuuVar.ss00730073ss0073s()) {
                int i2 = j006Aj006A006A006A006Aj;
                if (((j006A006A006A006A006A006Aj + i2) * i2) % jjjjjjj006A != jj006A006A006A006A006Aj) {
                    j006Aj006A006A006A006Aj = 59;
                    jj006A006A006A006A006Aj = j006Ajjjjj006A();
                }
                int iS0073s0073ss0073s = uuhuhuuVar.s0073s0073ss0073s();
                jjjjjxx jjjjjxxVarSs0073s00730073ss = jjjjjxx.ss0073s00730073ss(iS0073s0073ss0073s);
                int i3 = j006Aj006A006A006A006Aj;
                if (((j006A006A006A006A006A006Aj + i3) * i3) % jj006Ajjjj006A() != 0) {
                    j006Aj006A006A006A006Aj = j006Ajjjjj006A();
                    jj006A006A006A006A006Aj = 49;
                }
                iArr[i] = jjjjjxxVarSs0073s00730073ss.ss00730073s0073ss(c + c + i + jjjjjxxVarSs0073s00730073ss.ssss00730073ss(iS0073s0073ss0073s));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    static {
        int i = s00730073007300730073s0073;
        if (((s0073ssss00730073 + i) * i) % s00730073sss00730073 != ssssss00730073) {
            s00730073007300730073s0073 = sss0073ss00730073();
            ssssss00730073 = sss0073ss00730073();
        }
        ll006C006Cl006C006C = true;
        l006Cll006C006C006C = 92;
        if (((s0073s0073ss00730073() + s00730073007300730073s0073) * s00730073007300730073s0073) % ss0073sss00730073() != ssssss00730073) {
            s00730073007300730073s0073 = sss0073ss00730073();
            ssssss00730073 = sss0073ss00730073();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s00730073007300730073ss(int r2) {
        /*
            r0 = 128(0x80, float:1.794E-43)
            if (r2 > r0) goto L2e
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.s00730073007300730073s0073
            int r1 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.s0073ssss00730073
            int r1 = r1 + r0
            int r1 = r1 * r0
            int r0 = ss0073sss00730073()
            int r1 = r1 % r0
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.ssssss00730073
            if (r1 == r0) goto L2c
            r0 = 91
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.s00730073007300730073s0073 = r0
            int r1 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.s0073ssss00730073
            int r1 = r1 + r0
            int r1 = r1 * r0
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.s00730073sss00730073
            int r1 = r1 % r0
            if (r1 == 0) goto L28
            r0 = 56
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.s00730073007300730073s0073 = r0
            r0 = 45
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.ssssss00730073 = r0
        L28:
            r0 = 44
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.ssssss00730073 = r0
        L2c:
            if (r2 >= 0) goto L2f
        L2e:
            r2 = 0
        L2f:
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.l006Cll006C006C006C = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jxxjjxx.s00730073007300730073ss(int):void");
    }

    private static synchronized void s00730073sss0073s() {
        try {
            if (ll006C006Cl006C006C) {
                ll006C006Cl006C006C = false;
                ll006Cl006C006C006C = new char[]{0, 25237, 25127, 25031, 24443, 24359, 24203, 23671, 23593, 22993, 22871, 22769, 22691, 22573, 21683, 21589, 21517, 21407, 21319, 20183, 20113, 19267, 19181, 18541, 18451, 18367, 18269, 17419, 17341, 17231, 17123, 17029, 16937, 16843, 15803, 15733, 15643, 15551, 14249, 14143, 14011, 13907, 13829, 13723, 13669, 13553};
                l006C006C006Cl006C006C = new ArrayList(10);
                llll006C006C006C = new ArrayList(8);
                l006C006C006Cl006C006C.add(new uhhhuuu());
                l006C006C006Cl006C006C.add(new jxxjxxx());
                int i = s00730073007300730073s0073;
                if (((s0073ssss00730073 + i) * i) % s00730073sss00730073 != ssssss00730073) {
                    s00730073007300730073s0073 = sss0073ss00730073();
                    ssssss00730073 = 43;
                }
                l006C006C006Cl006C006C.add(new uhuuuuu());
                try {
                    l006C006C006Cl006C006C.add(new jxjxjxx());
                    List<uuuhuuu> list = l006C006C006Cl006C006C;
                    int iSss0073ss00730073 = sss0073ss00730073();
                    if (((s0073ssss00730073 + iSss0073ss00730073) * iSss0073ss00730073) % s00730073sss00730073 != 0) {
                        s00730073007300730073s0073 = sss0073ss00730073();
                        ssssss00730073 = 9;
                    }
                    list.add(new uuuuhuu());
                    List<uuuhuuu> list2 = l006C006C006Cl006C006C;
                    int i2 = s00730073007300730073s0073;
                    if (((s0073ssss00730073 + i2) * i2) % s00730073sss00730073 != 0) {
                        s00730073007300730073s0073 = 95;
                        ssssss00730073 = 98;
                    }
                    list2.add(new jjjxxxx());
                    l006C006C006Cl006C006C.add(new jjxxxxx());
                    l006C006C006Cl006C006C.add(new jjjxjxx());
                    l006C006C006Cl006C006C.add(new uhuuhuu());
                    l006C006C006Cl006C006C.add(new jxjxxxx());
                    llll006C006C006C.add(new uuhuuuu());
                    llll006C006C006C.add(new jjxxjxx());
                    llll006C006C006C.add(new uhuhuuu());
                    llll006C006C006C.add(new jxjjxxx());
                    llll006C006C006C.add(new uhhuuuu());
                    llll006C006C006C.add(new jxxxjxx());
                    llll006C006C006C.add(new uuhhuuu());
                    llll006C006C006C.add(new jjxjxxx());
                    Collections.shuffle(l006C006C006Cl006C006C, new Random(l006Cll006C006C006C));
                    Collections.shuffle(llll006C006C006C, new Random(l006Cll006C006C006C));
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int s0073s0073ss00730073() {
        return 1;
    }

    private static String s0073ssss0073s(String str, char c, char c2, char c3) {
        s00730073sss0073s();
        try {
            List<jjjjxxx> list = llll006C006C006C;
            int i = s00730073007300730073s0073;
            int i2 = s0073ssss00730073;
            int i3 = s00730073sss00730073;
            int i4 = ((i + i2) * i) % i3;
            if (YU.a.z(i, i2, i, i3) != ssssss00730073) {
                s00730073007300730073s0073 = 23;
                ssssss00730073 = sss0073ss00730073();
            }
            if (i4 != 0) {
                s00730073007300730073s0073 = sss0073ss00730073();
                ssssss00730073 = 53;
            }
            return list.get(c3).s0073s007300730073ss(str, c, c2);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String ss0073007300730073ss(String str, char c, char c2) {
        s00730073sss0073s();
        int iSss0073ss00730073 = sss0073ss00730073();
        if (((s0073ssss00730073 + iSss0073ss00730073) * iSss0073ss00730073) % ss0073sss00730073() != 0) {
            s00730073007300730073s0073 = sss0073ss00730073();
            ssssss00730073 = sss0073ss00730073();
        }
        try {
            uuuhuuu uuuhuuuVar = l006C006C006Cl006C006C.get(c2);
            int i = s00730073007300730073s0073;
            if (((s0073ssss00730073 + i) * i) % ss0073sss00730073() != 0) {
                s00730073007300730073s0073 = 39;
                ssssss00730073 = sss0073ss00730073();
            }
            return uuuhuuuVar.sss007300730073ss(str, c);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int ss0073sss00730073() {
        return 2;
    }

    public static String ss0073sss0073s(String str, char c, char c2) {
        int i = s00730073007300730073s0073;
        if (((s0073ssss00730073 + i) * i) % s00730073sss00730073 != ssssss00730073) {
            s00730073007300730073s0073 = sss0073ss00730073();
            ssssss00730073 = sss0073ss00730073();
        }
        int iSss0073ss00730073 = sss0073ss00730073();
        if (((s0073ssss00730073 + iSss0073ss00730073) * iSss0073ss00730073) % s00730073sss00730073 != 0) {
            s00730073007300730073s0073 = sss0073ss00730073();
            ssssss00730073 = 32;
        }
        return ss0073007300730073ss(str, c, c2).intern();
    }

    public static int sss0073ss00730073() {
        return 5;
    }

    public static String sss0073ss0073s(String str, char c, char c2, char c3) {
        int i = s00730073007300730073s0073;
        if (((s0073ssss00730073 + i) * i) % s00730073sss00730073 != ssssss00730073) {
            s00730073007300730073s0073 = sss0073ss00730073();
            ssssss00730073 = sss0073ss00730073();
        }
        return s0073ssss0073s(str, c, c2, c3).intern();
    }

    public static /* synthetic */ char[] ssssss0073s() {
        char[] cArr = ll006Cl006C006C006C;
        int i = s00730073007300730073s0073;
        if (((s0073ssss00730073 + i) * i) % s00730073sss00730073 != 0) {
            s00730073007300730073s0073 = 69;
            ssssss00730073 = 5;
        }
        if (((s00730073007300730073s0073 + s0073s0073ss00730073()) * s00730073007300730073s0073) % s00730073sss00730073 != ssssss00730073) {
            s00730073007300730073s0073 = 7;
            ssssss00730073 = sss0073ss00730073();
        }
        return cArr;
    }
}

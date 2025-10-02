package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

import YU.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes6.dex */
public class kukuukk {
    public static int m006D006D006D006D006Dm = 2;
    public static int m006Dm006D006D006Dm = 5;
    public static int m006Dmmmm006D = 0;
    public static int mm006D006D006D006Dm = 1;
    private static List<kuukkuk> r007200720072r0072r = null;
    private static int r0072rr00720072r = 0;
    public static boolean rr00720072r0072r = true;
    private static char[] rr0072r00720072r;
    private static List<kukuuuk> rrrr00720072r;

    public static class kkkkkku extends kuukkuk {
        public static int ii0069iiii = 0;
        public static int s0073s0073007300730073 = 1;
        public static int ss00730073007300730073 = 2;
        public static int sss0073007300730073 = 51;

        public static int i0069iiiii() {
            return 88;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kuukkuk
        public String kkk006Bk006Bk(String str, char c) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (true) {
                boolean zK006B006Bkk006Bk = kkkuukkVar.k006B006Bkk006Bk();
                int i2 = sss0073007300730073;
                if (((s0073s0073007300730073 + i2) * i2) % ss00730073007300730073 != 0) {
                    sss0073007300730073 = i0069iiiii();
                    s0073s0073007300730073 = 57;
                }
                if (!zK006B006Bkk006Bk) {
                    return new String(iArr, 0, i);
                }
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                int iKk006B006B006Bkk = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(c + i + kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk));
                int i3 = sss0073007300730073;
                if (((s0073s0073007300730073 + i3) * i3) % ss00730073007300730073 != ii0069iiii) {
                    sss0073007300730073 = i0069iiiii();
                    ii0069iiii = 84;
                }
                iArr[i] = iKk006B006B006Bkk;
                i++;
            }
        }
    }

    public static class kkkkkuk extends kuukkuk {
        public static int m006D006Dmm006D006D = 45;
        public static int m006Dmmm006D006D = 1;
        public static int mm006D006Dm006D006D = 2;
        public static int mmmmm006D006D;

        public static int m006D006D006D006Dm006D() {
            return 58;
        }

        public static int m006Dm006Dm006D006D() {
            return 1;
        }

        public static int mm006Dmm006D006D() {
            return 2;
        }

        public static int mmm006Dm006D006D() {
            return 0;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kuukkuk
        public String kkk006Bk006Bk(String str, char c) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                if ((m006D006D006D006Dm006D() * (m006D006D006D006Dm006D() + m006Dmmm006D006D)) % mm006Dmm006D006D() != mmmmm006D006D) {
                    mmmmm006D006D = 70;
                }
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk) - (c + i));
                i++;
                if (((m006Dm006Dm006D006D() + m006D006Dmm006D006D) * m006D006Dmm006D006D) % mm006D006Dm006D006D != mmm006Dm006D006D()) {
                    m006D006Dmm006D006D = m006D006D006D006Dm006D();
                    mmmmm006D006D = 15;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class kkkkuuk extends kuukkuk {
        public static int s0073ss00730073s = 1;
        public static int ss0073s00730073s = 2;
        public static int sss007300730073s = 0;
        public static int ssss00730073s = 81;

        public static int s00730073s00730073s() {
            return 49;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kuukkuk
        public String kkk006Bk006Bk(String str, char c) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                if ((s00730073s00730073s() * (s00730073s00730073s() + s0073ss00730073s)) % ss0073s00730073s != sss007300730073s) {
                    ssss00730073s = 93;
                    sss007300730073s = s00730073s00730073s();
                }
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk) + (kukuukk.kkkk006B006Bk()[i % kukuukk.kkkk006B006Bk().length] ^ ((c + c) + i)));
                i++;
                int i2 = ssss00730073s;
                if (((s0073ss00730073s + i2) * i2) % ss0073s00730073s != 0) {
                    ssss00730073s = s00730073s00730073s();
                    s0073ss00730073s = 85;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class kkkukuk extends kukuuuk {
        public static int s00730073ssss = 73;
        public static int s0073s0073sss = 2;
        public static int sss0073sss = 1;

        public static int ss00730073sss() {
            return 73;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kukuuuk
        public String k006Bk006Bk006Bk(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk) + ((i * c2) ^ c));
                i++;
                int i2 = s00730073ssss;
                if (((sss0073sss + i2) * i2) % s0073s0073sss != 0) {
                    s00730073ssss = 84;
                    sss0073sss = 40;
                }
            }
            String str2 = new String(iArr, 0, i);
            int i3 = s00730073ssss;
            if (((sss0073sss + i3) * i3) % s0073s0073sss != 0) {
                s00730073ssss = 91;
                sss0073sss = ss00730073sss();
            }
            return str2;
        }
    }

    public static class kkkuuuk extends kukuuuk {
        public static int s0073007300730073s0073 = 2;
        public static int s0073s00730073s0073 = 4;
        public static int s0073sss00730073 = 0;
        public static int ss007300730073s0073 = 1;

        public static int sssss00730073() {
            return 55;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kukuuuk
        public String k006Bk006Bk006Bk(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                int iKkkkk006Bk = kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk);
                int i2 = s0073s00730073s0073;
                if (((ss007300730073s0073 + i2) * i2) % s0073007300730073s0073 != s0073sss00730073) {
                    s0073s00730073s0073 = 50;
                    s0073sss00730073 = sssss00730073();
                }
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(c + i + iKkkkk006Bk + c2);
                i++;
            }
            String str2 = new String(iArr, 0, i);
            int i3 = s0073s00730073s0073;
            if (((ss007300730073s0073 + i3) * i3) % s0073007300730073s0073 != 0) {
                s0073s00730073s0073 = 84;
                ss007300730073s0073 = sssss00730073();
            }
            return str2;
        }
    }

    public static class kkukkuk extends kukuuuk {
        public static int m006Dm006D006D006D006D = 0;
        public static int mm006D006D006D006D006D = 1;
        public static int mmm006D006D006D006D = 50;
        public static int s0073sssss = 2;

        public static int ss0073ssss() {
            return 6;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kukuuuk
        public String k006Bk006Bk006Bk(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int i2 = mmm006D006D006D006D;
                if (((mm006D006D006D006D006D + i2) * i2) % s0073sssss != 0) {
                    mmm006D006D006D006D = ss0073ssss();
                    m006Dm006D006D006D006D = ss0073ssss();
                }
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                int i3 = mmm006D006D006D006D;
                if (((mm006D006D006D006D006D + i3) * i3) % s0073sssss != m006Dm006D006D006D006D) {
                    mmm006D006D006D006D = ss0073ssss();
                    m006Dm006D006D006D006D = 29;
                }
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk((kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk) - (c + i)) - c2);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class kkukuuk extends kuukkuk {
        public static int s00730073sss0073 = 0;
        public static int s0073s0073ss0073 = 2;
        public static int ss0073sss0073 = 81;
        public static int sss0073ss0073 = 1;

        public static int ss00730073ss0073() {
            return 88;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kuukkuk
        public String kkk006Bk006Bk(String str, char c) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int i2 = ss0073sss0073;
                if (((sss0073ss0073 + i2) * i2) % s0073s0073ss0073 != s00730073sss0073) {
                    ss0073sss0073 = 16;
                    s00730073sss0073 = ss00730073ss0073();
                }
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                int iKkkkk006Bk = kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk);
                int i3 = ss0073sss0073;
                if (((sss0073ss0073 + i3) * i3) % s0073s0073ss0073 != 0) {
                    ss0073sss0073 = 70;
                    s00730073sss0073 = ss00730073ss0073();
                }
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(iKkkkk006Bk - ((c + c) + i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class kkuukuk extends kuukkuk {
        public static int s0073s00730073ss = 67;
        public static int ss007300730073ss = 0;
        public static int ss0073ss0073s = 1;
        public static int sssss0073s = 2;

        public static int s0073007300730073ss() {
            return 1;
        }

        public static int s0073sss0073s() {
            return 54;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kuukkuk
        public String kkk006Bk006Bk(String str, char c) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                int iKkkkk006Bk = kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk);
                int iS0073007300730073ss = s0073007300730073ss() + s0073s00730073ss;
                int i2 = s0073s00730073ss;
                int i3 = sssss0073s;
                int i4 = (iS0073007300730073ss * i2) % i3;
                int i5 = ss007300730073ss;
                if (i4 != i5) {
                    if (a.z(i2, ss0073ss0073s, i2, i3) != i5) {
                        s0073s00730073ss = s0073sss0073s();
                        ss007300730073ss = 4;
                    }
                    s0073s00730073ss = 54;
                    ss007300730073ss = s0073sss0073s();
                }
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(iKkkkk006Bk - (((c + c) + c) + i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class kkuuukk extends kuukkuk {
        public static int m006D006D006Dmm006D = 2;
        public static int m006Dmm006Dm006D = 0;
        public static int mm006D006Dmm006D = 1;
        public static int mmmm006Dm006D = 96;

        public static int m006Dm006Dmm006D() {
            return 0;
        }

        public static int mm006Dm006Dm006D() {
            return 1;
        }

        public static int mmm006Dmm006D() {
            return 94;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kuukkuk
        public String kkk006Bk006Bk(String str, char c) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            if ((mmm006Dmm006D() * (mmm006Dmm006D() + mm006D006Dmm006D)) % m006D006D006Dmm006D != m006Dm006Dmm006D()) {
                mm006D006Dmm006D = 76;
            }
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                if (((mm006Dm006Dm006D() + mmmm006Dm006D) * mmmm006Dm006D) % m006D006D006Dmm006D != m006Dmm006Dm006D) {
                    mmmm006Dm006D = mmm006Dmm006D();
                    m006Dmm006Dm006D = mmm006Dmm006D();
                }
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk) - (kukuukk.kkkk006B006Bk()[i % kukuukk.kkkk006B006Bk().length] ^ (c + i)));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class kkuuuuk extends kukuuuk {
        public static int s00730073ss00730073 = 0;
        public static int s0073s0073s00730073 = 2;
        public static int ss0073ss00730073 = 44;
        public static int sss0073s00730073 = 1;

        public static int ss00730073s00730073() {
            return 80;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kukuuuk
        public String k006Bk006Bk006Bk(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (true) {
                int i2 = ss0073ss00730073;
                if (((sss0073s00730073 + i2) * i2) % s0073s0073s00730073 != s00730073ss00730073) {
                    ss0073ss00730073 = ss00730073s00730073();
                    s00730073ss00730073 = 30;
                }
                if (!kkkuukkVar.k006B006Bkk006Bk()) {
                    return new String(iArr, 0, i);
                }
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                int iKkkkk006Bk = kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk);
                int i3 = ss0073ss00730073;
                if (((sss0073s00730073 + i3) * i3) % s0073s0073s00730073 != s00730073ss00730073) {
                    ss0073ss00730073 = 85;
                    s00730073ss00730073 = ss00730073s00730073();
                }
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(iKkkkk006Bk - ((i * c2) ^ c));
                i++;
            }
        }
    }

    public static class kukkkku extends kuukkuk {
        public static int i00690069iiii = 61;
        public static int i0069i0069iii = 1;
        public static int ii00690069iii = 2;
        public static int iii0069iii;

        public static int i006900690069iii() {
            return 6;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kuukkuk
        public String kkk006Bk006Bk(String str, char c) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = i00690069iiii;
            if (((i0069i0069iii + i) * i) % ii00690069iii != iii0069iii) {
                i00690069iiii = i006900690069iii();
                iii0069iii = 6;
            }
            int i2 = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                int iKk006B006B006Bkk = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk) - (c ^ i2));
                int i3 = i00690069iiii;
                if (((i0069i0069iii + i3) * i3) % ii00690069iii != iii0069iii) {
                    i00690069iiii = 97;
                    iii0069iii = 23;
                }
                iArr[i2] = iKk006B006B006Bkk;
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class kukkkuk extends kukuuuk {
        public static int m006D006D006Dm006D006D = 10;
        public static int m006Dmm006D006D006D = 1;
        public static int mm006Dm006D006D006D = 2;
        public static int mmmm006D006D006D;

        public static int m006D006Dm006D006D006D() {
            return 51;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kukuuuk
        public String k006Bk006Bk006Bk(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = m006D006D006Dm006D006D;
            if (((m006Dmm006D006D006D + i) * i) % mm006Dm006D006D006D != mmmm006D006D006D) {
                m006D006D006Dm006D006D = 84;
                mmmm006D006D006D = m006D006Dm006D006D006D();
            }
            int i2 = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                iArr[i2] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk) - (kukuukk.kkkk006B006Bk()[i2 % kukuukk.kkkk006B006Bk().length] ^ ((i2 * c2) + c)));
                i2++;
            }
            String str2 = new String(iArr, 0, i2);
            int i3 = m006D006D006Dm006D006D;
            if (((m006Dmm006D006D006D + i3) * i3) % mm006Dm006D006D006D != mmmm006D006D006D) {
                m006D006D006Dm006D006D = m006D006Dm006D006D006D();
                mmmm006D006D006D = 78;
            }
            return str2;
        }
    }

    public static class kukkuuk extends kuukkuk {
        public static int s00730073007300730073s = 1;
        public static int s0073ssss0073 = 92;
        public static int ss0073007300730073s = 0;
        public static int ssssss0073 = 2;

        public static int s0073s007300730073s() {
            return 78;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kuukkuk
        public String kkk006Bk006Bk(String str, char c) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                int iKkkkk006Bk = kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk);
                int iS0073s007300730073s = s0073s007300730073s() * (s0073s007300730073s() + s00730073007300730073s);
                int i2 = ssssss0073;
                if (iS0073s007300730073s % i2 != ss0073007300730073s) {
                    ss0073007300730073s = 85;
                    int i3 = s0073ssss0073;
                    if (a.z(i3, s00730073007300730073s, i3, i2) != 85) {
                        s0073ssss0073 = 7;
                        ss0073007300730073s = 92;
                    }
                }
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(c, c, c, i, iKkkkk006Bk));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class kukukuk extends kukuuuk {
        public static int s00730073s0073ss = 0;
        public static int s0073ss0073ss = 2;
        public static int ss0073s0073ss = 77;
        public static int ssss0073ss = 1;

        public static int s007300730073sss() {
            return 15;
        }

        public static int sss00730073ss() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kukuuuk
        public String k006Bk006Bk006Bk(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = ss0073s0073ss;
            if (((ssss0073ss + i) * i) % sss00730073ss() != s00730073s0073ss) {
                ss0073s0073ss = 21;
                s00730073s0073ss = s007300730073sss();
            }
            int i2 = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                iArr[i2] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk((kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk) - (c + i2)) + c2);
                i2++;
                int iS007300730073sss = s007300730073sss();
                if (((ssss0073ss + iS007300730073sss) * iS007300730073sss) % s0073ss0073ss != 0) {
                    ssss0073ss = 89;
                }
            }
            return new String(iArr, 0, i2);
        }
    }

    public static abstract class kukuuuk {
        public abstract String k006Bk006Bk006Bk(String str, char c, char c2);
    }

    public static abstract class kuukkuk {
        public abstract String kkk006Bk006Bk(String str, char c);
    }

    public static class kuukuuk extends kukuuuk {
        public static int s007300730073ss0073 = 42;
        public static int s0073ss0073s0073 = 1;
        public static int ss0073s0073s0073 = 2;
        public static int ssss0073s0073;

        public static int s00730073s0073s0073() {
            return 66;
        }

        public static int sss00730073s0073() {
            return 0;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kukuuuk
        public String k006Bk006Bk006Bk(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = s007300730073ss0073;
            if (((s0073ss0073s0073 + i) * i) % ss0073s0073s0073 != ssss0073s0073) {
                s007300730073ss0073 = s00730073s0073s0073();
                ssss0073s0073 = 38;
            }
            int i2 = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                int i3 = s007300730073ss0073;
                if (((s0073ss0073s0073 + i3) * i3) % ss0073s0073s0073 != sss00730073s0073()) {
                    s007300730073ss0073 = 17;
                    ssss0073s0073 = s00730073s0073s0073();
                }
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                iArr[i2] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk) + (kukuukk.kkkk006B006Bk()[i2 % kukuukk.kkkk006B006Bk().length] ^ ((i2 * c2) + (c + c))));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class kuuukuk extends kuukkuk {
        public static int s00730073ss0073s = 49;
        public static int ss00730073s0073s = 2;
        public static int sss0073s0073s = 1;

        public static int s007300730073s0073s() {
            return 66;
        }

        public static int s0073s0073s0073s() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kuukkuk
        public String kkk006Bk006Bk(String str, char c) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                int iKkkkk006Bk = kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk);
                int i2 = c ^ i;
                int i3 = s00730073ss0073s;
                if (((sss0073s0073s + i3) * i3) % ss00730073s0073s != 0) {
                    s00730073ss0073s = s007300730073s0073s();
                    sss0073s0073s = s007300730073s0073s();
                }
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(iKkkkk006Bk + i2);
                i++;
            }
            String str2 = new String(iArr, 0, i);
            int i4 = s00730073ss0073s;
            if (((sss0073s0073s + i4) * i4) % s0073s0073s0073s() != 0) {
                s00730073ss0073s = 39;
                sss0073s0073s = 97;
            }
            return str2;
        }
    }

    public static class kuuuukk extends kuukkuk {
        public static int m006D006Dm006Dm006D = 30;
        public static int m006Dm006D006Dm006D = 2;
        public static int mmm006D006Dm006D = 1;

        public static int mm006D006D006Dm006D() {
            return 45;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kuukkuk
        public String kkk006Bk006Bk(String str, char c) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                int iKkkkk006Bk = kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk);
                int i2 = m006D006Dm006Dm006D;
                if (((mmm006D006Dm006D + i2) * i2) % m006Dm006D006Dm006D != 0) {
                    m006D006Dm006Dm006D = mm006D006D006Dm006D();
                    mmm006D006Dm006D = mm006D006D006Dm006D();
                }
                int iKk006B006B006Bkk = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(c + c + i + iKkkkk006Bk);
                int i3 = m006D006Dm006Dm006D;
                if (((mmm006D006Dm006D + i3) * i3) % m006Dm006D006Dm006D != 0) {
                    m006D006Dm006Dm006D = 8;
                    mmm006D006Dm006D = mm006D006D006Dm006D();
                }
                iArr[i] = iKk006B006B006Bkk;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class kuuuuuk extends kukuuuk {
        public static int s007300730073s00730073 = 94;
        public static int s0073ss007300730073 = 1;
        public static int ss0073s007300730073 = 2;
        public static int ssss007300730073;

        public static int s00730073s007300730073() {
            return 64;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kukuukk.kukuuuk
        public String k006Bk006Bk006Bk(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            kkkuukk kkkuukkVar = new kkkuukk(str);
            int i = 0;
            while (kkkuukkVar.k006B006Bkk006Bk()) {
                int iKk006Bkk006Bk = kkkuukkVar.kk006Bkk006Bk();
                kkkukku kkkukkuVarKk006B006B006B006Bk = kkkukku.kk006B006B006B006Bk(iKk006Bkk006Bk);
                iArr[i] = kkkukkuVarKk006B006B006B006Bk.kk006B006B006Bkk(((c + i) + kkkukkuVarKk006B006B006B006Bk.kkkkk006Bk(iKk006Bkk006Bk)) - c2);
                i++;
                int i2 = s007300730073s00730073;
                if (((s0073ss007300730073 + i2) * i2) % ss0073s007300730073 != ssss007300730073) {
                    s007300730073s00730073 = s00730073s007300730073();
                    ssss007300730073 = s00730073s007300730073();
                }
            }
            String str2 = new String(iArr, 0, i);
            int i3 = s007300730073s00730073;
            if (((s0073ss007300730073 + i3) * i3) % ss0073s007300730073 != ssss007300730073) {
                s007300730073s00730073 = s00730073s007300730073();
                ssss007300730073 = 94;
            }
            return str2;
        }
    }

    static {
        int i = m006Dm006D006D006Dm;
        if (((mm006D006D006D006Dm + i) * i) % mm006Dmmm006D() != m006Dmmmm006D) {
            m006Dm006D006D006Dm = mmmmmm006D();
            m006Dmmmm006D = mmmmmm006D();
        }
        r0072rr00720072r = 103;
        int i2 = m006Dm006D006D006Dm;
        if (((mm006D006D006D006Dm + i2) * i2) % m006D006D006D006D006Dm != 0) {
            m006Dm006D006D006Dm = 17;
            m006Dmmmm006D = 51;
        }
    }

    public static void k006B006B006Bk006Bk(int i) {
        if (i > 128) {
            i = 0;
        } else if (i < 0) {
            int i2 = m006Dm006D006D006Dm;
            if (((mm006D006D006D006Dm + i2) * i2) % m006D006D006D006D006Dm != 0) {
                m006Dm006D006D006Dm = mmmmmm006D();
                mm006D006D006D006Dm = 81;
            }
            i = 0;
        }
        r0072rr00720072r = i;
    }

    private static synchronized void k006B006Bk006B006Bk() {
        try {
            int i = m006Dm006D006D006Dm;
            if (((mm006D006D006D006Dm + i) * i) % m006D006D006D006D006Dm != 0) {
                m006Dm006D006D006Dm = mmmmmm006D();
                m006Dmmmm006D = mmmmmm006D();
            }
            if (rr00720072r0072r) {
                rr00720072r0072r = false;
                int i2 = m006Dm006D006D006Dm;
                if (((mm006D006D006D006Dm + i2) * i2) % mm006Dmmm006D() != m006Dmmmm006D) {
                    m006Dm006D006D006Dm = 35;
                    m006Dmmmm006D = mmmmmm006D();
                }
                int i3 = m006Dm006D006D006Dm;
                if (((mm006D006D006D006Dm + i3) * i3) % m006D006D006D006D006Dm != m006Dmmmm006D) {
                    m006Dm006D006D006Dm = 15;
                    m006Dmmmm006D = 74;
                }
                rr0072r00720072r = new char[]{0, 25237, 25127, 25031, 24443, 24359, 24203, 23671, 23593, 22993, 22871, 22769, 22691, 22573, 21683, 21589, 21517, 21407, 21319, 20183, 20113, 19267, 19181, 18541, 18451, 18367, 18269, 17419, 17341, 17231, 17123, 17029, 16937, 16843, 15803, 15733, 15643, 15551, 14249, 14143, 14011, 13907, 13829, 13723, 13669, 13553};
                r007200720072r0072r = new ArrayList(10);
                rrrr00720072r = new ArrayList(8);
                r007200720072r0072r.add(new kkkkkuk());
                r007200720072r0072r.add(new kkukuuk());
                r007200720072r0072r.add(new kkuukuk());
                r007200720072r0072r.add(new kkkkkku());
                r007200720072r0072r.add(new kuuuukk());
                r007200720072r0072r.add(new kukkuuk());
                r007200720072r0072r.add(new kuuukuk());
                r007200720072r0072r.add(new kukkkku());
                r007200720072r0072r.add(new kkuuukk());
                r007200720072r0072r.add(new kkkkuuk());
                rrrr00720072r.add(new kukukuk());
                rrrr00720072r.add(new kuuuuuk());
                rrrr00720072r.add(new kkukkuk());
                rrrr00720072r.add(new kkkuuuk());
                rrrr00720072r.add(new kkkukuk());
                rrrr00720072r.add(new kkuuuuk());
                rrrr00720072r.add(new kukkkuk());
                rrrr00720072r.add(new kuukuuk());
                Collections.shuffle(r007200720072r0072r, new Random(r0072rr00720072r));
                Collections.shuffle(rrrr00720072r, new Random(r0072rr00720072r));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static String k006Bkk006B006Bk(String str, char c, char c2, char c3) {
        k006B006Bk006B006Bk();
        try {
            kukuuuk kukuuukVar = rrrr00720072r.get(c3);
            int i = m006Dm006D006D006Dm;
            int i2 = mm006D006D006D006Dm;
            int i3 = i + i2;
            if (((i2 + i) * i) % m006D006D006D006D006Dm != m006Dmmmm006D) {
                m006Dm006D006D006Dm = 95;
                m006Dmmmm006D = 35;
            }
            if ((i3 * m006Dm006D006D006Dm) % mm006Dmmm006D() != m006Dmmmm006D) {
                m006Dm006D006D006Dm = mmmmmm006D();
                m006Dmmmm006D = 96;
            }
            return kukuuukVar.k006Bk006Bk006Bk(str, c, c2);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String kk006B006Bk006Bk(String str, char c, char c2) {
        k006B006Bk006B006Bk();
        try {
            kuukkuk kuukkukVar = r007200720072r0072r.get(c2);
            int i = m006Dm006D006D006Dm;
            if (((mm006D006D006D006Dm + i) * i) % m006D006D006D006D006Dm != m006Dmmmm006D) {
                m006Dm006D006D006Dm = 56;
                m006Dmmmm006D = 90;
            }
            return kuukkukVar.kkk006Bk006Bk(str, c);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String kk006Bk006B006Bk(String str, char c, char c2) {
        int i = m006Dm006D006D006Dm;
        int i2 = mm006D006D006D006Dm;
        int i3 = m006D006D006D006D006Dm;
        if (((i + i2) * i) % i3 != 0) {
            if (a.z(i, i2, i, i3) != 0) {
                m006Dm006D006D006Dm = 4;
                m006Dmmmm006D = mmmmmm006D();
            }
            m006Dm006D006D006Dm = mmmmmm006D();
            m006Dmmmm006D = 53;
        }
        return kk006B006Bk006Bk(str, c, c2).intern();
    }

    public static String kkk006B006B006Bk(String str, char c, char c2, char c3) {
        if (((m006D006Dmmm006D() + m006Dm006D006D006Dm) * m006Dm006D006D006Dm) % m006D006D006D006D006Dm != m006Dmmmm006D) {
            m006Dm006D006D006Dm = 33;
            m006Dmmmm006D = mmmmmm006D();
            int i = m006Dm006D006D006Dm;
            if (((mm006D006D006D006Dm + i) * i) % m006D006D006D006D006Dm != 0) {
                m006Dm006D006D006Dm = 9;
                m006Dmmmm006D = mmmmmm006D();
            }
        }
        return k006Bkk006B006Bk(str, c, c2, c3).intern();
    }

    public static /* synthetic */ char[] kkkk006B006Bk() {
        char[] cArr = rr0072r00720072r;
        if (((m006D006Dmmm006D() + m006Dm006D006D006Dm) * m006Dm006D006D006Dm) % m006D006D006D006D006Dm != m006Dmmmm006D) {
            int iMmmmmm006D = mmmmmm006D();
            int i = m006Dm006D006D006Dm;
            if (((mm006D006D006D006Dm + i) * i) % m006D006D006D006D006Dm != 0) {
                m006Dm006D006D006Dm = mmmmmm006D();
                m006Dmmmm006D = mmmmmm006D();
            }
            m006Dm006D006D006Dm = iMmmmmm006D;
            m006Dmmmm006D = mmmmmm006D();
        }
        return cArr;
    }

    public static int m006D006Dmmm006D() {
        return 1;
    }

    public static int mm006Dmmm006D() {
        return 2;
    }

    public static int mmmmmm006D() {
        return 67;
    }
}

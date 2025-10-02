package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes6.dex */
public class qqqqbbb {
    private static int k006B006Bkkk006B = 0;
    private static List<lnllnll> k006Bkkkk006B = null;
    private static List<qbqbbbb> kk006Bkkk006B = null;
    private static char[] kkk006Bkk006B = null;
    public static boolean kkkkkk006B = true;
    public static int l006C006Clll006C = 2;
    public static int l006Cllll006C = 0;
    public static int ll006Clll006C = 1;
    public static int llllll006C = 99;

    public static class llllnll extends qbqbbbb {
        public static int h006800680068hh0068 = 59;
        public static int h0068hh0068h0068 = 1;
        public static int hh0068h0068h0068 = 2;
        public static int hhhh0068h0068;

        public static int h00680068h0068h0068() {
            return 32;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.qbqbbbb
        public String qqqq0071q0071(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                int iQ0071qqqq0071 = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071) + ((i * c2) ^ c));
                int i2 = h006800680068hh0068;
                if (((h0068hh0068h0068 + i2) * i2) % hh0068h0068h0068 != hhhh0068h0068) {
                    h006800680068hh0068 = 52;
                    hhhh0068h0068 = h00680068h0068h0068();
                }
                int i3 = h006800680068hh0068;
                if (((h0068hh0068h0068 + i3) * i3) % hh0068h0068h0068 != 0) {
                    h006800680068hh0068 = h00680068h0068h0068();
                    hhhh0068h0068 = h00680068h0068h0068();
                }
                iArr[i] = iQ0071qqqq0071;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class lllnlll extends lnllnll {
        public static int h0068h0068h0068h = 2;
        public static int h0068hhh0068h = 14;
        public static int hh0068hh0068h = 1;
        public static int hhh0068h0068h;

        public static int h00680068hh0068h() {
            return 2;
        }

        public static int hh00680068h0068h() {
            return 30;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.lnllnll
        public String q007100710071qq0071(String str, char c) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                int iQ00710071qqq0071 = qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071);
                int i2 = h0068hhh0068h;
                if (((hh0068hh0068h + i2) * i2) % h00680068hh0068h() != 0) {
                    h0068hhh0068h = 45;
                    hh0068hh0068h = 31;
                }
                int iQ0071qqqq0071 = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(iQ00710071qqq0071 + (qqqqbbb.q00710071q0071q0071()[i % qqqqbbb.q00710071q0071q0071().length] ^ ((c + c) + i)));
                int i3 = h0068hhh0068h;
                if (((hh0068hh0068h + i3) * i3) % h0068h0068h0068h != hhh0068h0068h) {
                    h0068hhh0068h = 64;
                    hhh0068h0068h = hh00680068h0068h();
                }
                iArr[i] = iQ0071qqqq0071;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class lllnnll extends lnllnll {
        public static int h0068hh006800680068 = 72;
        public static int hh00680068h00680068 = 0;
        public static int hhhh006800680068 = 2;

        public static int h006800680068h00680068() {
            return 1;
        }

        public static int h0068h0068h00680068() {
            return 52;
        }

        public static int hh0068h006800680068() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.lnllnll
        public String q007100710071qq0071(String str, char c) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            if ((h0068h0068h00680068() * (h006800680068h00680068() + h0068h0068h00680068())) % hhhh006800680068 != hh00680068h00680068) {
                int i = h0068hh006800680068;
                if (((h006800680068h00680068() + i) * i) % hh0068h006800680068() != 0) {
                    h0068hh006800680068 = h0068h0068h00680068();
                    hh00680068h00680068 = h0068h0068h00680068();
                }
                hh00680068h00680068 = 1;
            }
            int i2 = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                iArr[i2] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071) - (c + i2));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class llnllll extends lnllnll {
        public static int h006800680068hhh = 46;
        public static int h00680068h0068hh = 0;
        public static int h0068hh0068hh = 2;
        public static int hhhh0068hh = 1;

        public static int hh0068h0068hh() {
            return 64;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.lnllnll
        public String q007100710071qq0071(String str, char c) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                int i2 = h006800680068hhh;
                if (((hhhh0068hh + i2) * i2) % h0068hh0068hh != h00680068h0068hh) {
                    h006800680068hhh = 58;
                    h00680068h0068hh = 54;
                }
                iArr[i] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071) - ((c + c) + i));
                int i3 = h006800680068hhh;
                if (((hhhh0068hh + i3) * i3) % h0068hh0068hh != 0) {
                    h006800680068hhh = 18;
                    hhhh0068hh = hh0068h0068hh();
                }
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class llnlnll extends qbqbbbb {
        public static int h0068h00680068h0068 = 1;
        public static int hh006800680068h0068 = 2;
        public static int hhh00680068h0068 = 35;

        public static int h0068006800680068h0068() {
            return 9;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.qbqbbbb
        public String qqqq0071q0071(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                int iQ00710071qqq0071 = qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071);
                int iH0068006800680068h0068 = h0068006800680068h0068();
                if (((h0068h00680068h0068 + iH0068006800680068h0068) * iH0068006800680068h0068) % hh006800680068h0068 != 0) {
                    hhh00680068h0068 = h0068006800680068h0068();
                    h0068h00680068h0068 = h0068006800680068h0068();
                }
                int iQ0071qqqq0071 = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071((iQ00710071qqq0071 - (c + i)) - c2);
                int i2 = hhh00680068h0068;
                if (((h0068h00680068h0068 + i2) * i2) % hh006800680068h0068 != 0) {
                    hhh00680068h0068 = 62;
                    h0068h00680068h0068 = 88;
                }
                iArr[i] = iQ0071qqqq0071;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class llnnlll extends lnllnll {
        public static int h0068hhhh0068 = 2;
        public static int hh0068006800680068h = 1;
        public static int hhh006800680068h = 5;

        public static int h00680068006800680068h() {
            return 2;
        }

        public static int h0068h006800680068h() {
            return 0;
        }

        public static int hhhhhh0068() {
            return 61;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.lnllnll
        public String q007100710071qq0071(String str, char c) {
            int i = hhh006800680068h;
            if (((hh0068006800680068h + i) * i) % h00680068006800680068h() != h0068h006800680068h()) {
                hhh006800680068h = 35;
                hh0068006800680068h = hhhhhh0068();
            }
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i2 = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                iArr[i2] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071) - (((c + c) + c) + i2));
                i2++;
                int i3 = hhh006800680068h;
                if (((hh0068006800680068h + i3) * i3) % h0068hhhh0068 != 0) {
                    hhh006800680068h = 43;
                    hh0068006800680068h = 62;
                }
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class llnnnll extends lnllnll {
        public static int c00630063cccc = 1;
        public static int c0063ccccc = 89;
        public static int cc0063cccc = 0;
        public static int ccc0063ccc = 2;

        public static int c0063c0063ccc() {
            return 89;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.lnllnll
        public String q007100710071qq0071(String str, char c) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                int iQ00710071qqq0071 = qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071);
                char[] cArrQ00710071q0071q0071 = qqqqbbb.q00710071q0071q0071();
                char[] cArrQ00710071q0071q00712 = qqqqbbb.q00710071q0071q0071();
                int i2 = c0063ccccc;
                if (((c00630063cccc + i2) * i2) % ccc0063ccc != 0) {
                    c0063ccccc = c0063c0063ccc();
                    cc0063cccc = c0063c0063ccc();
                }
                iArr[i] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(iQ00710071qqq0071 - (cArrQ00710071q0071q0071[i % cArrQ00710071q0071q00712.length] ^ (c + i)));
                i++;
                int i3 = c0063ccccc;
                if (((c00630063cccc + i3) * i3) % ccc0063ccc != cc0063cccc) {
                    c0063ccccc = c0063c0063ccc();
                    cc0063cccc = 28;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class lnlllll extends qbqbbbb {
        public static int h00680068hhhh = 35;
        public static int h0068h0068hhh = 2;
        public static int hhh0068hhh = 1;

        public static int hh00680068hhh() {
            return 49;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.qbqbbbb
        public String qqqq0071q0071(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                int iQ0071qqqq0071 = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071) + (qqqqbbb.q00710071q0071q0071()[i % qqqqbbb.q00710071q0071q0071().length] ^ ((i * c2) + (c + c))));
                int i2 = h00680068hhhh;
                if (((hhh0068hhh + i2) * i2) % h0068h0068hhh != 0) {
                    h00680068hhhh = hh00680068hhh();
                    hhh0068hhh = hh00680068hhh();
                }
                iArr[i] = iQ0071qqqq0071;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static abstract class lnllnll {
        public abstract String q007100710071qq0071(String str, char c);
    }

    public static class lnlnlll extends lnllnll {
        public static int h006800680068h0068h = 38;
        public static int h00680068h00680068h = 0;
        public static int h0068hh00680068h = 2;
        public static int hhhh00680068h = 1;

        public static int hh0068h00680068h() {
            return 7;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.lnllnll
        public String q007100710071qq0071(String str, char c) {
            int length = str.length();
            int i = h006800680068h0068h;
            if (((hhhh00680068h + i) * i) % h0068hh00680068h != h00680068h00680068h) {
                h006800680068h0068h = hh0068h00680068h();
                h00680068h00680068h = hh0068h00680068h();
            }
            int[] iArr = new int[length];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i2 = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                int i3 = h006800680068h0068h;
                if (((hhhh00680068h + i3) * i3) % h0068hh00680068h != 0) {
                    h006800680068h0068h = hh0068h00680068h();
                    hhhh00680068h = 55;
                }
                iArr[i2] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071) + (c ^ i2));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class lnlnnll extends lnllnll {
        public static int h00680068h006800680068 = 33;
        public static int h0068h0068006800680068 = 2;
        public static int hhh0068006800680068 = 1;

        public static int hh00680068006800680068() {
            return 47;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.lnllnll
        public String q007100710071qq0071(String str, char c) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (true) {
                boolean zQ0071qqq00710071 = lnnnnllVar.q0071qqq00710071();
                int i2 = h00680068h006800680068;
                if (((hhh0068006800680068 + i2) * i2) % h0068h0068006800680068 != 0) {
                    h00680068h006800680068 = 12;
                    hhh0068006800680068 = hh00680068006800680068();
                }
                if (!zQ0071qqq00710071) {
                    return new String(iArr, 0, i);
                }
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                iArr[i] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(c + c + i + qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071));
                i++;
                int iHh00680068006800680068 = hh00680068006800680068();
                if (((hhh0068006800680068 + iHh00680068006800680068) * iHh00680068006800680068) % h0068h0068006800680068 != 0) {
                    h00680068h006800680068 = 13;
                    hhh0068006800680068 = 58;
                }
            }
        }
    }

    public static class lnnllll extends lnllnll {
        public static int h0068006800680068hh = 2;
        public static int hh006800680068hh = 1;
        public static int hhhhh0068h = 70;

        public static int h0068h00680068hh() {
            return 0;
        }

        public static int hhh00680068hh() {
            return 54;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.lnllnll
        public String q007100710071qq0071(String str, char c) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                iArr[i] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(a.a(c, c, c, i, qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071)));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class lnnlnll extends qbqbbbb {
        public static int h00680068hh00680068 = 2;
        public static int h0068hhh00680068 = 0;
        public static int hh0068hh00680068 = 1;
        public static int hhhhh00680068 = 33;

        public static int hhh0068h00680068() {
            return 56;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.qbqbbbb
        public String qqqq0071q0071(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                int iQ00710071qqq0071 = qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071);
                char[] cArrQ00710071q0071q0071 = qqqqbbb.q00710071q0071q0071();
                char[] cArrQ00710071q0071q00712 = qqqqbbb.q00710071q0071q0071();
                int i2 = hhhhh00680068;
                if (((hh0068hh00680068 + i2) * i2) % h00680068hh00680068 != 0) {
                    hhhhh00680068 = hhh0068h00680068();
                    h0068hhh00680068 = 90;
                }
                int iQ0071qqqq0071 = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(iQ00710071qqq0071 - (cArrQ00710071q0071q0071[i % cArrQ00710071q0071q00712.length] ^ ((i * c2) + c)));
                int i3 = hhhhh00680068;
                if (((hh0068hh00680068 + i3) * i3) % h00680068hh00680068 != h0068hhh00680068) {
                    hhhhh00680068 = 39;
                    h0068hhh00680068 = 73;
                }
                iArr[i] = iQ0071qqqq0071;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class lnnnlll extends qbqbbbb {
        public static int h00680068hhh0068 = 0;
        public static int h0068h0068hh0068 = 2;
        public static int hh0068hhh0068 = 51;
        public static int hhh0068hh0068 = 1;

        public static int hh00680068hh0068() {
            return 60;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.qbqbbbb
        public String qqqq0071q0071(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int i2 = hh0068hhh0068;
                int i3 = hhh0068hh0068;
                int i4 = h0068h0068hh0068;
                int i5 = ((i2 + i3) * i2) % i4;
                int i6 = h00680068hhh0068;
                if (i5 != i6) {
                    if (YU.a.z(i2, i3, i2, i4) != i6) {
                        hh0068hhh0068 = hh00680068hh0068();
                        h00680068hhh0068 = hh00680068hh0068();
                    }
                    hh0068hhh0068 = 20;
                    h00680068hhh0068 = 43;
                }
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                iArr[i] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071((qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071) - (c + i)) + c2);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class qbbqbbb extends qbqbbbb {
        public static int l006Clll006C006C = 43;
        public static int ll006C006Cl006C006C = 1;
        public static int ll006Cll006C006C = 0;
        public static int lll006Cl006C006C = 2;

        public static int l006C006Cll006C006C() {
            return 1;
        }

        public static int l006Cl006Cl006C006C() {
            return 82;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.qbqbbbb
        public String qqqq0071q0071(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                if (((l006C006Cll006C006C() + l006Clll006C006C) * l006Clll006C006C) % lll006Cl006C006C != ll006Cll006C006C) {
                    l006Clll006C006C = l006Cl006Cl006C006C();
                    ll006Cll006C006C = 49;
                }
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                iArr[i] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(((c + i) + qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071)) - c2);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static abstract class qbqbbbb {
        public abstract String qqqq0071q0071(String str, char c, char c2);
    }

    public static class qbqqbbb extends lnllnll {
        public static int l006Cll006Cl006C = 1;
        public static int ll006Cl006Cl006C = 2;
        public static int llll006Cl006C = 50;

        public static int l006C006Cl006Cl006C() {
            return 57;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.lnllnll
        public String q007100710071qq0071(String str, char c) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                int iQ0071qqqq0071 = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071) - (c ^ i));
                int i2 = llll006Cl006C;
                if (((l006Cll006Cl006C + i2) * i2) % ll006Cl006Cl006C != 0) {
                    int iL006C006Cl006Cl006C = l006C006Cl006Cl006C();
                    llll006Cl006C = iL006C006Cl006Cl006C;
                    l006Cll006Cl006C = 76;
                    if (((iL006C006Cl006Cl006C + 76) * iL006C006Cl006Cl006C) % ll006Cl006Cl006C != 0) {
                        llll006Cl006C = l006C006Cl006Cl006C();
                        l006Cll006Cl006C = l006C006Cl006Cl006C();
                    }
                }
                iArr[i] = iQ0071qqqq0071;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class qqbbbbb extends qbqbbbb {
        public static int l006C006Cl006C006C006C = 71;
        public static int l006Cl006C006C006C006C = 1;
        public static int ll006C006C006C006C006C = 2;
        public static int lll006C006C006C006C;

        public static int h0068hhhhh() {
            return 91;
        }

        public static int hh0068hhhh() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.qbqbbbb
        public String qqqq0071q0071(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (true) {
                int i2 = l006C006Cl006C006C006C;
                if (((l006Cl006C006C006C006C + i2) * i2) % ll006C006C006C006C006C != lll006C006C006C006C) {
                    l006C006Cl006C006C006C = h0068hhhhh();
                    lll006C006C006C006C = 43;
                }
                if (!lnnnnllVar.q0071qqq00710071()) {
                    return new String(iArr, 0, i);
                }
                int i3 = l006C006Cl006C006C006C;
                if (((l006Cl006C006C006C006C + i3) * i3) % hh0068hhhh() != 0) {
                    l006C006Cl006C006C006C = 44;
                    lll006C006C006C006C = 60;
                }
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                iArr[i] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(c + i + qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071) + c2);
                i++;
            }
        }
    }

    public static class qqbqbbb extends lnllnll {
        public static int l006C006C006C006Cl006C = 2;
        public static int l006Cl006C006Cl006C = 0;
        public static int ll006C006C006Cl006C = 1;
        public static int lll006C006Cl006C = 58;

        public static int lllll006C006C() {
            return 49;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.lnllnll
        public String q007100710071qq0071(String str, char c) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = lll006C006Cl006C;
            if (((ll006C006C006Cl006C + i) * i) % l006C006C006C006Cl006C != 0) {
                lll006C006Cl006C = lllll006C006C();
                l006Cl006C006Cl006C = 76;
            }
            int i2 = lll006C006Cl006C;
            if (((ll006C006C006Cl006C + i2) * i2) % l006C006C006C006Cl006C != l006Cl006C006Cl006C) {
                lll006C006Cl006C = 61;
                l006Cl006C006Cl006C = lllll006C006C();
            }
            int i3 = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                iArr[i3] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(c + i3 + qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071));
                i3++;
            }
            return new String(iArr, 0, i3);
        }
    }

    public static class qqqbbbb extends qbqbbbb {
        public static int l006C006C006Cl006C006C = 32;
        public static int l006Cll006C006C006C = 1;
        public static int ll006Cl006C006C006C = 2;
        public static int llll006C006C006C;

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.qbqbbbb
        public String qqqq0071q0071(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            lnnnnll lnnnnllVar = new lnnnnll(str);
            int i = 0;
            while (lnnnnllVar.q0071qqq00710071()) {
                int i2 = l006C006C006Cl006C006C;
                if (((l006Cll006C006C006C + i2) * i2) % ll006Cl006C006C006C != 0) {
                    l006C006C006Cl006C006C = 26;
                    llll006C006C006C = 66;
                }
                int iQqqqq00710071 = lnnnnllVar.qqqqq00710071();
                qbqbqbb qbqbqbbVarQ0071q0071qq0071 = qbqbqbb.q0071q0071qq0071(iQqqqq00710071);
                int iQ00710071qqq0071 = qbqbqbbVarQ0071q0071qq0071.q00710071qqq0071(iQqqqq00710071);
                int i3 = l006C006C006Cl006C006C;
                if (((l006Cll006C006C006C + i3) * i3) % ll006Cl006C006C006C != llll006C006C006C) {
                    l006C006C006Cl006C006C = 68;
                    llll006C006C006C = 96;
                }
                iArr[i] = qbqbqbbVarQ0071q0071qq0071.q0071qqqq0071(iQ00710071qqq0071 - ((i * c2) ^ c));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    static {
        int i = llllll006C;
        if (((ll006Clll006C + i) * i) % l006C006Clll006C != l006Cllll006C) {
            llllll006C = lll006Cll006C();
            l006Cllll006C = lll006Cll006C();
        }
        k006B006Bkkk006B = 47;
        int iLll006Cll006C = lll006Cll006C();
        if (((ll006Clll006C + iLll006Cll006C) * iLll006Cll006C) % l006C006Clll006C != 0) {
            llllll006C = lll006Cll006C();
            l006Cllll006C = lll006Cll006C();
        }
    }

    public static int l006C006C006Cll006C() {
        return 0;
    }

    public static int l006Cl006Cll006C() {
        return 1;
    }

    public static int ll006C006Cll006C() {
        return 2;
    }

    public static int lll006Cll006C() {
        return 88;
    }

    public static String q0071007100710071q0071(String str, char c, char c2, char c3) {
        int i = llllll006C;
        if (((ll006Clll006C + i) * i) % l006C006Clll006C != l006C006C006Cll006C()) {
            llllll006C = lll006Cll006C();
            l006Cllll006C = 50;
        }
        if (((llllll006C + l006Cl006Cll006C()) * llllll006C) % ll006C006Cll006C() != l006Cllll006C) {
            llllll006C = lll006Cll006C();
            l006Cllll006C = lll006Cll006C();
        }
        return qqq00710071q0071(str, c, c2, c3).intern();
    }

    public static /* synthetic */ char[] q00710071q0071q0071() {
        int iL006Cl006Cll006C = (l006Cl006Cll006C() + llllll006C) * llllll006C;
        int i = l006C006Clll006C;
        if (iL006Cl006Cll006C % i != l006Cllll006C) {
            llllll006C = 2;
            l006Cllll006C = 60;
        }
        char[] cArr = kkk006Bkk006B;
        int i2 = llllll006C;
        if (YU.a.z(i2, ll006Clll006C, i2, i) != l006Cllll006C) {
            llllll006C = 56;
            l006Cllll006C = lll006Cll006C();
        }
        return cArr;
    }

    public static String q0071q00710071q0071(String str, char c, char c2) {
        int i = llllll006C;
        if (((ll006Clll006C + i) * i) % l006C006Clll006C != l006Cllll006C) {
            llllll006C = 11;
            l006Cllll006C = 81;
        }
        return q0071qq0071q0071(str, c, c2).intern();
    }

    private static String q0071qq0071q0071(String str, char c, char c2) {
        qq007100710071q0071();
        try {
            lnllnll lnllnllVar = k006Bkkkk006B.get(c2);
            int i = llllll006C;
            if (((l006Cl006Cll006C() + i) * i) % l006C006Clll006C != 0) {
                llllll006C = lll006Cll006C();
                l006Cllll006C = 54;
            }
            String strQ007100710071qq0071 = lnllnllVar.q007100710071qq0071(str, c);
            if (((l006Cl006Cll006C() + llllll006C) * llllll006C) % ll006C006Cll006C() != l006Cllll006C) {
                llllll006C = lll006Cll006C();
                l006Cllll006C = 85;
            }
            return strQ007100710071qq0071;
        } catch (Exception unused) {
            return "";
        }
    }

    private static synchronized void qq007100710071q0071() {
        try {
            if (kkkkkk006B) {
                kkkkkk006B = false;
                int i = llllll006C;
                if (((ll006Clll006C + i) * i) % l006C006Clll006C != 0) {
                    llllll006C = lll006Cll006C();
                    l006Cllll006C = lll006Cll006C();
                }
                kkk006Bkk006B = new char[]{0, 25237, 25127, 25031, 24443, 24359, 24203, 23671, 23593, 22993, 22871, 22769, 22691, 22573, 21683, 21589, 21517, 21407, 21319, 20183, 20113, 19267, 19181, 18541, 18451, 18367, 18269, 17419, 17341, 17231, 17123, 17029, 16937, 16843, 15803, 15733, 15643, 15551, 14249, 14143, 14011, 13907, 13829, 13723, 13669, 13553};
                k006Bkkkk006B = new ArrayList(10);
                ArrayList arrayList = new ArrayList(8);
                int i2 = llllll006C;
                if (((ll006Clll006C + i2) * i2) % l006C006Clll006C != 0) {
                    llllll006C = 78;
                    l006Cllll006C = lll006Cll006C();
                }
                kk006Bkkk006B = arrayList;
                k006Bkkkk006B.add(new lllnnll());
                List<lnllnll> list = k006Bkkkk006B;
                int i3 = llllll006C;
                if (((ll006Clll006C + i3) * i3) % l006C006Clll006C != l006Cllll006C) {
                    llllll006C = 65;
                    l006Cllll006C = 58;
                }
                list.add(new llnllll());
                k006Bkkkk006B.add(new llnnlll());
                k006Bkkkk006B.add(new qqbqbbb());
                k006Bkkkk006B.add(new lnlnnll());
                k006Bkkkk006B.add(new lnnllll());
                k006Bkkkk006B.add(new lnlnlll());
                k006Bkkkk006B.add(new qbqqbbb());
                k006Bkkkk006B.add(new llnnnll());
                k006Bkkkk006B.add(new lllnlll());
                kk006Bkkk006B.add(new lnnnlll());
                kk006Bkkk006B.add(new qbbqbbb());
                kk006Bkkk006B.add(new llnlnll());
                kk006Bkkk006B.add(new qqbbbbb());
                kk006Bkkk006B.add(new llllnll());
                kk006Bkkk006B.add(new qqqbbbb());
                kk006Bkkk006B.add(new lnnlnll());
                kk006Bkkk006B.add(new lnlllll());
                Collections.shuffle(k006Bkkkk006B, new Random(k006B006Bkkk006B));
                Collections.shuffle(kk006Bkkk006B, new Random(k006B006Bkkk006B));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void qq0071q0071q0071(int r2) {
        /*
            r0 = 128(0x80, float:1.794E-43)
            if (r2 > r0) goto L1d
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.llllll006C
            int r1 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.ll006Clll006C
            int r1 = r1 + r0
            int r1 = r1 * r0
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.l006C006Clll006C
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            int r0 = lll006Cll006C()
            com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.llllll006C = r0
            int r0 = lll006Cll006C()
            com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.l006Cllll006C = r0
        L1b:
            if (r2 >= 0) goto L1e
        L1d:
            r2 = 0
        L1e:
            com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.k006B006Bkkk006B = r2
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.llllll006C
            int r0 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.ll006Clll006C
            int r0 = r0 + r2
            int r0 = r0 * r2
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.l006C006Clll006C
            int r0 = r0 % r2
            int r2 = com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.l006Cllll006C
            if (r0 == r2) goto L37
            r2 = 31
            com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.llllll006C = r2
            int r2 = lll006Cll006C()
            com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.l006Cllll006C = r2
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxauth.qqqqbbb.qq0071q0071q0071(int):void");
    }

    private static String qqq00710071q0071(String str, char c, char c2, char c3) {
        qq007100710071q0071();
        try {
            return kk006Bkkk006B.get(c3).qqqq0071q0071(str, c, c2);
        } catch (Exception unused) {
            return "";
        }
    }
}

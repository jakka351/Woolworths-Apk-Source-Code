package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import YU.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes6.dex */
public class xlxllxl {
    public static boolean b00620062006200620062b = false;
    private static char[] b00620062bbb0062 = null;
    private static List<xlxllll> b0062bbbb0062 = null;
    private static int bb0062bbb0062 = 0;
    private static List<xllxxll> bbbbbb0062 = null;
    public static int p00700070p007000700070 = 0;
    public static int p0070p0070007000700070 = 2;
    public static int pp0070p007000700070 = 35;
    public static int ppp0070007000700070 = 1;

    public static class jjkjjjj extends xllxxll {
        public static int g00670067006700670067g = 0;
        public static int g0067g006700670067g = 1;
        public static int gg0067006700670067g = 2;
        public static int ggg006700670067g = 89;

        public static int gggggg0067() {
            return 62;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xllxxll
        public String r0072007200720072rr(String str, char c) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(c + i + jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr));
                i++;
                int i2 = ggg006700670067g;
                if (((g0067g006700670067g + i2) * i2) % gg0067006700670067g != 0) {
                    ggg006700670067g = 61;
                    g0067g006700670067g = 63;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class jkjjjjj extends xlxllll {
        public static int g006700670067g0067g = 1;
        public static int g0067gg00670067g = 2;
        public static int gg0067g00670067g = 0;
        public static int gggg00670067g = 1;

        public static int g00670067g00670067g() {
            return 40;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xlxllll
        public String rrrrr0072r(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int iR00720072r0072rr = jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr);
                int i2 = c + i;
                int i3 = g006700670067g0067g;
                if (((gggg00670067g + i3) * i3) % g0067gg00670067g != gg0067g00670067g) {
                    g006700670067g0067g = 69;
                    gg0067g00670067g = g00670067g00670067g();
                }
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr((iR00720072r0072rr + i2) - c2);
                i++;
                int i4 = g006700670067g0067g;
                if (((gggg00670067g + i4) * i4) % g0067gg00670067g != 0) {
                    g006700670067g0067g = 14;
                    gggg00670067g = 27;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class jkkjjjj extends xllxxll {
        public static int g0067gggg0067 = 2;
        public static int gg0067ggg0067 = 0;
        public static int ggg0067gg0067 = 2;

        public static int g00670067ggg0067() {
            return 1;
        }

        public static int g0067g0067gg0067() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xllxxll
        public String r0072007200720072rr(String str, char c) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                if (((g00670067ggg0067() + g0067gggg0067) * g0067gggg0067) % ggg0067gg0067 != gg0067ggg0067) {
                    g0067gggg0067 = g0067g0067gg0067();
                    gg0067ggg0067 = 52;
                }
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int iR00720072r0072rr = jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr);
                int i2 = g0067gggg0067;
                if (((g00670067ggg0067() + i2) * i2) % ggg0067gg0067 != 0) {
                    g0067gggg0067 = g0067g0067gg0067();
                    gg0067ggg0067 = 3;
                }
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(iR00720072r0072rr - (c ^ i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class xllllxl extends xllxxll {
        public static int d00640064d0064dd = 2;
        public static int d0064dd0064dd = 8;
        public static int dd0064d0064dd = 1;

        public static int ddd00640064dd() {
            return 90;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xllxxll
        public String r0072007200720072rr(String str, char c) {
            int i = d0064dd0064dd;
            if (((dd0064d0064dd + i) * i) % d00640064d0064dd != 0) {
                d0064dd0064dd = 9;
                dd0064d0064dd = 6;
            }
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i2 = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int i3 = d0064dd0064dd;
                if (((dd0064d0064dd + i3) * i3) % d00640064d0064dd != 0) {
                    d0064dd0064dd = ddd00640064dd();
                    dd0064d0064dd = 31;
                }
                iArr[i2] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(c + c + i2 + jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class xlllxll extends xllxxll {
        public static int d0064d0064d00640064 = 1;
        public static int d0064ddd00640064 = 75;
        public static int dd00640064d00640064 = 2;
        public static int ddd0064d00640064;

        public static int d00640064dd00640064() {
            return 2;
        }

        public static int dd0064dd00640064() {
            return 1;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xllxxll
        public String r0072007200720072rr(String str, char c) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int i2 = d0064ddd00640064;
                int iDd0064dd00640064 = dd0064dd00640064() + i2;
                int i3 = d0064ddd00640064;
                if (((d0064d0064d00640064 + i3) * i3) % dd00640064d00640064 != ddd0064d00640064) {
                    d0064ddd00640064 = 13;
                    ddd0064d00640064 = 6;
                }
                if ((i2 * iDd0064dd00640064) % d00640064dd00640064() != 0) {
                    d0064ddd00640064 = 17;
                }
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr) + (c ^ i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class xllxlll extends xlxllll {
        public static int g00670067g0067gg = 2;
        public static int g0067gg0067gg = 0;
        public static int ggg00670067gg = 1;
        public static int gggg0067gg = 3;

        public static int gg0067g0067gg() {
            return 1;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xlxllll
        public String rrrrr0072r(String str, char c, char c2) {
            int length = str.length();
            int iGg0067g0067gg = (gg0067g0067gg() + gggg0067gg) * gggg0067gg;
            int i = g00670067g0067gg;
            if (iGg0067g0067gg % i != g0067gg0067gg) {
                gggg0067gg = 35;
                if (a.z(35, ggg00670067gg, 35, i) != 0) {
                    gggg0067gg = 36;
                    g0067gg0067gg = 32;
                }
                g0067gg0067gg = 58;
            }
            int[] iArr = new int[length];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i2 = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                iArr[i2] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr) + (xlxllxl.r00720072rr0072r()[i2 % xlxllxl.r00720072rr0072r().length] ^ ((i2 * c2) + (c + c))));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static abstract class xllxxll {
        public abstract String r0072007200720072rr(String str, char c);
    }

    public static abstract class xlxllll {
        public abstract String rrrrr0072r(String str, char c, char c2);
    }

    public static class xlxlxll extends xlxllll {
        public static int d006400640064dd0064 = 0;
        public static int d00640064d0064d0064 = 2;
        public static int dd00640064dd0064 = 37;
        public static int dddd0064d0064 = 1;

        public static int d0064dd0064d0064() {
            return 2;
        }

        public static int dd0064d0064d0064() {
            return 24;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xlxllll
        public String rrrrr0072r(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int i2 = dd00640064dd0064;
                if (((dddd0064d0064 + i2) * i2) % d00640064d0064d0064 != d006400640064dd0064) {
                    dd00640064dd0064 = dd0064d0064d0064();
                    d006400640064dd0064 = dd0064d0064d0064();
                }
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int iR0072rr0072rr = jjkkjjjVarR0072rr00720072r.r0072rr0072rr((jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr) - (c + i)) + c2);
                int i3 = dd00640064dd0064;
                if (((dddd0064d0064 + i3) * i3) % d0064dd0064d0064() != d006400640064dd0064) {
                    dd00640064dd0064 = 79;
                    d006400640064dd0064 = dd0064d0064d0064();
                }
                iArr[i] = iR0072rr0072rr;
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class xlxxlll extends xllxxll {
        public static int d0064d0064006400640064 = 50;
        public static int dd00640064006400640064 = 0;
        public static int g0067ggggg = 1;
        public static int gg0067gggg = 2;

        public static int g00670067gggg() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xllxxll
        public String r0072007200720072rr(String str, char c) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(c, c, c, i, jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr)));
                i++;
                int i2 = d0064d0064006400640064;
                if (((g0067ggggg + i2) * i2) % gg0067gggg != dd00640064006400640064) {
                    d0064d0064006400640064 = 10;
                    dd00640064006400640064 = 29;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class xlxxxll extends xlxllll {
        public static int d00640064dd0064d = 24;
        public static int d0064d0064d0064d = 1;
        public static int d0064dd00640064d = 2;
        public static int ddd0064d0064d;

        public static int d006400640064d0064d() {
            return 64;
        }

        public static int dd00640064d0064d() {
            return 2;
        }

        public static int dddd00640064d() {
            return 1;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xlxllll
        public String rrrrr0072r(String str, char c, char c2) {
            int length = str.length();
            int i = d00640064dd0064d;
            if (((dddd00640064d() + i) * i) % d0064dd00640064d != 0) {
                d00640064dd0064d = 57;
                ddd0064d0064d = 33;
            }
            int[] iArr = new int[length];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i2 = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int iR00720072r0072rr = jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr);
                char c3 = xlxllxl.r00720072rr0072r()[i2 % xlxllxl.r00720072rr0072r().length];
                int i3 = d00640064dd0064d;
                if (((d0064d0064d0064d + i3) * i3) % dd00640064d0064d() != ddd0064d0064d) {
                    d00640064dd0064d = 93;
                    ddd0064d0064d = d006400640064d0064d();
                }
                iArr[i2] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(iR00720072r0072rr - (c3 ^ ((i2 * c2) + c)));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class xxlllll extends xlxllll {
        public static int g00670067gg0067g = 1;
        public static int g0067g0067g0067g = 0;
        public static int gg0067gg0067g = 63;
        public static int ggg0067g0067g = 2;

        public static int gg00670067g0067g() {
            return 2;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xlxllll
        public String rrrrr0072r(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int iR00720072r0072rr = jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr);
                int i2 = gg0067gg0067g;
                if (((g00670067gg0067g + i2) * i2) % ggg0067g0067g != 0) {
                    gg0067gg0067g = 3;
                    g00670067gg0067g = 80;
                }
                int i3 = gg0067gg0067g;
                if (((g00670067gg0067g + i3) * i3) % gg00670067g0067g() != g0067g0067g0067g) {
                    gg0067gg0067g = 81;
                    g0067g0067g0067g = 47;
                }
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(iR00720072r0072rr - ((i * c2) ^ c));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class xxlllxl extends xllxxll {
        public static int d0064d0064ddd = 1;
        public static int dd00640064ddd = 2;
        public static int ddd0064ddd = 22;

        public static int d006400640064ddd() {
            return 97;
        }

        public static int dddd0064dd() {
            return 1;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xllxxll
        public String r0072007200720072rr(String str, char c) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr) - (xlxllxl.r00720072rr0072r()[i % xlxllxl.r00720072rr0072r().length] ^ (c + i)));
                i++;
                int i2 = ddd0064ddd;
                if (((d0064d0064ddd + i2) * i2) % dd00640064ddd != 0) {
                    ddd0064ddd = d006400640064ddd();
                    d0064d0064ddd = 75;
                }
            }
            String str2 = new String(iArr, 0, i);
            int i3 = ddd0064ddd;
            if (((dddd0064dd() + i3) * i3) % dd00640064ddd != 0) {
                ddd0064ddd = d006400640064ddd();
                d0064d0064ddd = d006400640064ddd();
            }
            return str2;
        }
    }

    public static class xxllxll extends xllxxll {
        public static int d0064006400640064d0064 = 2;
        public static int d0064d00640064d0064 = 0;
        public static int dd006400640064d0064 = 1;
        public static int ddd00640064d0064 = 59;

        public static int ddddd00640064() {
            return 52;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xllxxll
        public String r0072007200720072rr(String str, char c) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int i2 = ddd00640064d0064;
                if (((dd006400640064d0064 + i2) * i2) % d0064006400640064d0064 != d0064d00640064d0064) {
                    ddd00640064d0064 = ddddd00640064();
                    d0064d00640064d0064 = 67;
                }
                int iR00720072r0072rr = jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr) - (((c + c) + c) + i);
                int i3 = ddd00640064d0064;
                if (((dd006400640064d0064 + i3) * i3) % d0064006400640064d0064 != d0064d00640064d0064) {
                    ddd00640064d0064 = 8;
                    d0064d00640064d0064 = 24;
                }
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(iR00720072r0072rr);
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class xxlxlll extends xllxxll {
        public static int g006700670067ggg = 2;
        public static int g0067g0067ggg = 1;
        public static int gg00670067ggg = 2;

        public static int ggg0067ggg() {
            return 18;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xllxxll
        public String r0072007200720072rr(String str, char c) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int iGgg0067ggg = ggg0067ggg();
            if (((g0067g0067ggg + iGgg0067ggg) * iGgg0067ggg) % gg00670067ggg != 0) {
                g0067g0067ggg = 3;
            }
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int i2 = g006700670067ggg;
                if (((g0067g0067ggg + i2) * i2) % gg00670067ggg != 0) {
                    g006700670067ggg = ggg0067ggg();
                    g0067g0067ggg = 73;
                }
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr) - ((c + c) + i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class xxlxxll extends xlxllll {
        public static int d00640064d00640064d = 1;
        public static int dd0064d00640064d = 33;
        public static int ddd006400640064d = 2;

        public static int d0064d006400640064d() {
            return 16;
        }

        public static int dd0064006400640064d() {
            return 0;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xlxllll
        public String rrrrr0072r(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int iR00720072r0072rr = jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr);
                int i2 = dd0064d00640064d;
                if (((d00640064d00640064d + i2) * i2) % ddd006400640064d != 0) {
                    dd0064d00640064d = d0064d006400640064d();
                    d00640064d00640064d = d0064d006400640064d();
                }
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr((iR00720072r0072rr - (c + i)) - c2);
                i++;
                int i3 = dd0064d00640064d;
                if (((d00640064d00640064d + i3) * i3) % ddd006400640064d != dd0064006400640064d()) {
                    dd0064d00640064d = 5;
                    d00640064d00640064d = 58;
                }
            }
            return new String(iArr, 0, i);
        }
    }

    public static class xxxllll extends xlxllll {
        public static int g0067006700670067gg = 1;
        public static int g0067g00670067gg = 79;
        public static int gg006700670067gg = 0;
        public static int ggggg0067g = 2;

        public static int g0067ggg0067g() {
            return 91;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xlxllll
        public String rrrrr0072r(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = g0067g00670067gg;
            if (((g0067006700670067gg + i) * i) % ggggg0067g != gg006700670067gg) {
                g0067g00670067gg = 24;
                gg006700670067gg = g0067ggg0067g();
            }
            int i2 = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int iR00720072r0072rr = jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr);
                int i3 = g0067g00670067gg;
                if (((g0067006700670067gg + i3) * i3) % ggggg0067g != gg006700670067gg) {
                    g0067g00670067gg = g0067ggg0067g();
                    gg006700670067gg = 33;
                }
                iArr[i2] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(c + i2 + iR00720072r0072rr + c2);
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class xxxlxll extends xlxllll {
        public static int d00640064006400640064d = 42;
        public static int d0064dddd0064 = 1;
        public static int dd0064ddd0064 = 2;
        public static int ddd0064dd0064;

        public static int d00640064ddd0064() {
            return 22;
        }

        public static int d0064d0064dd0064() {
            return 2;
        }

        public static int dddddd0064() {
            return 0;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xlxllll
        public String rrrrr0072r(String str, char c, char c2) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = d00640064006400640064d;
            if (((d0064dddd0064 + i) * i) % dd0064ddd0064 != dddddd0064()) {
                d00640064006400640064d = 66;
                d0064dddd0064 = d00640064ddd0064();
            }
            int i2 = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                if ((d00640064ddd0064() * (d00640064ddd0064() + d0064dddd0064)) % d0064d0064dd0064() != ddd0064dd0064) {
                    d00640064006400640064d = d00640064ddd0064();
                    ddd0064dd0064 = 74;
                }
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                iArr[i2] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr) + ((i2 * c2) ^ c));
                i2++;
            }
            return new String(iArr, 0, i2);
        }
    }

    public static class xxxxlll extends xllxxll {
        public static int d006400640064d00640064 = 44;
        public static int d0064dd006400640064 = 1;
        public static int dd0064d006400640064 = 2;
        public static int ddd0064006400640064;

        public static int d00640064d006400640064() {
            return 72;
        }

        public static int dddd006400640064() {
            return 0;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xllxxll
        public String r0072007200720072rr(String str, char c) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                int i2 = d006400640064d00640064;
                if (((d0064dd006400640064 + i2) * i2) % dd0064d006400640064 != dddd006400640064()) {
                    d006400640064d00640064 = d00640064d006400640064();
                    d0064dd006400640064 = d00640064d006400640064();
                }
                int i3 = d006400640064d00640064;
                if (((d0064dd006400640064 + i3) * i3) % dd0064d006400640064 != ddd0064006400640064) {
                    d006400640064d00640064 = 46;
                    ddd0064006400640064 = d00640064d006400640064();
                }
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr) + (xlxllxl.r00720072rr0072r()[i % xlxllxl.r00720072rr0072r().length] ^ ((c + c) + i)));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    public static class xxxxxll extends xllxxll {
        public static int d0064006400640064dd = 2;
        public static int d0064ddd0064d = 0;
        public static int dd0064dd0064d = 1;
        public static int ddddd0064d = 71;

        public static int d0064d00640064dd() {
            return 5;
        }

        public static int dd006400640064dd() {
            return 1;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxbhs.xlxllxl.xllxxll
        public String r0072007200720072rr(String str, char c) {
            int[] iArr = new int[str.length()];
            xxxllxl xxxllxlVar = new xxxllxl(str);
            int i = 0;
            while (xxxllxlVar.rr007200720072rr()) {
                int iR0072r00720072rr = xxxllxlVar.r0072r00720072rr();
                jjkkjjj jjkkjjjVarR0072rr00720072r = jjkkjjj.r0072rr00720072r(iR0072r00720072rr);
                int iR00720072r0072rr = jjkkjjjVarR0072rr00720072r.r00720072r0072rr(iR0072r00720072rr);
                int i2 = ddddd0064d;
                if (((dd0064dd0064d + i2) * i2) % d0064006400640064dd != d0064ddd0064d) {
                    ddddd0064d = 49;
                    d0064ddd0064d = d0064d00640064dd();
                }
                iArr[i] = jjkkjjjVarR0072rr00720072r.r0072rr0072rr(iR00720072r0072rr - (c + i));
                i++;
            }
            return new String(iArr, 0, i);
        }
    }

    static {
        int i = pp0070p007000700070;
        if (((ppp0070007000700070 + i) * i) % d00640064dddd() != p00700070p007000700070) {
            pp0070p007000700070 = 19;
            p00700070p007000700070 = 47;
        }
        b00620062006200620062b = true;
        int i2 = pp0070p007000700070;
        if (((ppp0070007000700070 + i2) * i2) % p0070p0070007000700070 != p00700070p007000700070) {
            pp0070p007000700070 = 17;
            p00700070p007000700070 = 93;
        }
        bb0062bbb0062 = 28;
    }

    public static int d00640064dddd() {
        return 2;
    }

    public static int d0064ddddd() {
        return 0;
    }

    public static int dd0064dddd() {
        return 1;
    }

    public static int pp00700070007000700070() {
        return 8;
    }

    public static String r007200720072r0072r(String str, char c, char c2, char c3) {
        if ((pp00700070007000700070() * (pp00700070007000700070() + ppp0070007000700070)) % p0070p0070007000700070 != p00700070p007000700070) {
            pp0070p007000700070 = 65;
            p00700070p007000700070 = pp00700070007000700070();
        }
        String strIntern = rrr0072r0072r(str, c, c2, c3).intern();
        int i = pp0070p007000700070;
        if (((ppp0070007000700070 + i) * i) % d00640064dddd() != p00700070p007000700070) {
            pp0070p007000700070 = pp00700070007000700070();
            p00700070p007000700070 = 5;
        }
        return strIntern;
    }

    public static /* synthetic */ char[] r00720072rr0072r() {
        char[] cArr = b00620062bbb0062;
        int i = pp0070p007000700070;
        int i2 = ppp0070007000700070;
        int i3 = p0070p0070007000700070;
        if (((i + i2) * i) % i3 != 0) {
            pp0070p007000700070 = 81;
            p00700070p007000700070 = 31;
        }
        if (a.z(i, i2, i, i3) != 0) {
            pp0070p007000700070 = 8;
            p00700070p007000700070 = pp00700070007000700070();
        }
        return cArr;
    }

    public static String r0072r0072r0072r(String str, char c, char c2) {
        int iDd0064dddd = dd0064dddd() + pp0070p007000700070;
        int i = pp0070p007000700070;
        int i2 = iDd0064dddd * i;
        int i3 = p0070p0070007000700070;
        if (a.z(i, ppp0070007000700070, i, i3) != 0) {
            pp0070p007000700070 = 91;
            p00700070p007000700070 = pp00700070007000700070();
        }
        if (i2 % i3 != p00700070p007000700070) {
            pp0070p007000700070 = pp00700070007000700070();
            p00700070p007000700070 = pp00700070007000700070();
        }
        return r0072rrr0072r(str, c, c2).intern();
    }

    private static String r0072rrr0072r(String str, char c, char c2) {
        rr00720072r0072r();
        try {
            xllxxll xllxxllVar = bbbbbb0062.get(c2);
            int i = pp0070p007000700070;
            int i2 = ppp0070007000700070;
            int i3 = p0070p0070007000700070;
            if (((i + i2) * i) % i3 != p00700070p007000700070) {
                if (a.z(i, i2, i, i3) != 0) {
                    pp0070p007000700070 = pp00700070007000700070();
                    p00700070p007000700070 = 45;
                }
                pp0070p007000700070 = pp00700070007000700070();
                p00700070p007000700070 = pp00700070007000700070();
            }
            return xllxxllVar.r0072007200720072rr(str, c);
        } catch (Exception unused) {
            return "";
        }
    }

    private static synchronized void rr00720072r0072r() {
        try {
            if (b00620062006200620062b) {
                b00620062006200620062b = false;
                int i = pp0070p007000700070;
                if (((ppp0070007000700070 + i) * i) % d00640064dddd() != p00700070p007000700070) {
                    pp0070p007000700070 = 95;
                    p00700070p007000700070 = pp00700070007000700070();
                }
                b00620062bbb0062 = new char[]{0, 25237, 25127, 25031, 24443, 24359, 24203, 23671, 23593, 22993, 22871, 22769, 22691, 22573, 21683, 21589, 21517, 21407, 21319, 20183, 20113, 19267, 19181, 18541, 18451, 18367, 18269, 17419, 17341, 17231, 17123, 17029, 16937, 16843, 15803, 15733, 15643, 15551, 14249, 14143, 14011, 13907, 13829, 13723, 13669, 13553};
                bbbbbb0062 = new ArrayList(10);
                b0062bbbb0062 = new ArrayList(8);
                bbbbbb0062.add(new xxxxxll());
                bbbbbb0062.add(new xxlxlll());
                bbbbbb0062.add(new xxllxll());
                bbbbbb0062.add(new jjkjjjj());
                bbbbbb0062.add(new xllllxl());
                int i2 = pp0070p007000700070;
                if (((ppp0070007000700070 + i2) * i2) % p0070p0070007000700070 != p00700070p007000700070) {
                    int iPp00700070007000700070 = pp00700070007000700070();
                    if (((ppp0070007000700070 + iPp00700070007000700070) * iPp00700070007000700070) % p0070p0070007000700070 != 0) {
                        pp0070p007000700070 = pp00700070007000700070();
                        p00700070p007000700070 = 8;
                    }
                    pp0070p007000700070 = pp00700070007000700070();
                    p00700070p007000700070 = 33;
                }
                bbbbbb0062.add(new xlxxlll());
                bbbbbb0062.add(new xlllxll());
                bbbbbb0062.add(new jkkjjjj());
                bbbbbb0062.add(new xxlllxl());
                bbbbbb0062.add(new xxxxlll());
                b0062bbbb0062.add(new xlxlxll());
                b0062bbbb0062.add(new jkjjjjj());
                b0062bbbb0062.add(new xxlxxll());
                b0062bbbb0062.add(new xxxllll());
                b0062bbbb0062.add(new xxxlxll());
                b0062bbbb0062.add(new xxlllll());
                b0062bbbb0062.add(new xlxxxll());
                b0062bbbb0062.add(new xllxlll());
                Collections.shuffle(bbbbbb0062, new Random(bb0062bbb0062));
                Collections.shuffle(b0062bbbb0062, new Random(bb0062bbb0062));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void rr0072rr0072r(int i) {
        if (i > 128 || i < 0) {
            i = 0;
        }
        int i2 = pp0070p007000700070;
        if (((ppp0070007000700070 + i2) * i2) % p0070p0070007000700070 != p00700070p007000700070) {
            if (((dd0064dddd() + i2) * pp0070p007000700070) % p0070p0070007000700070 != d0064ddddd()) {
                pp0070p007000700070 = 71;
                p00700070p007000700070 = pp00700070007000700070();
            }
            pp0070p007000700070 = pp00700070007000700070();
            p00700070p007000700070 = 91;
        }
        bb0062bbb0062 = i;
    }

    private static String rrr0072r0072r(String str, char c, char c2, char c3) {
        rr00720072r0072r();
        try {
            xlxllll xlxllllVar = b0062bbbb0062.get(c3);
            int i = pp0070p007000700070;
            int i2 = ppp0070007000700070;
            int i3 = i + i2;
            if (((i2 + i) * i) % p0070p0070007000700070 != p00700070p007000700070) {
                pp0070p007000700070 = 88;
                p00700070p007000700070 = pp00700070007000700070();
            }
            if ((i3 * pp0070p007000700070) % p0070p0070007000700070 != p00700070p007000700070) {
                pp0070p007000700070 = pp00700070007000700070();
                p00700070p007000700070 = pp00700070007000700070();
            }
            return xlxllllVar.rrrrr0072r(str, c, c2);
        } catch (Exception unused) {
            return "";
        }
    }
}

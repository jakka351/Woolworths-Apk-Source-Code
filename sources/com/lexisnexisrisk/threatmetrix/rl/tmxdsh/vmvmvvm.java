package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

/* loaded from: classes6.dex */
public class vmvmvvm {
    public static int d006400640064dd0064 = 56;
    public static int d0064dd0064d0064 = 1;
    public static int dd0064d0064d0064 = 2;
    public static int dddd0064d0064 = 0;
    public static long g0067006700670067g0067 = 2;
    public static long g006700670067g00670067 = 10;
    public static long g00670067g006700670067 = 14;
    public static long g00670067gg00670067 = 6;
    public static boolean g0067g0067006700670067 = false;
    public static long g0067g00670067g0067 = 0;
    public static long g0067g0067g00670067 = 8;
    public static long g0067gg006700670067 = 12;
    public static long g0067ggg00670067 = 4;
    public static long gg00670067006700670067 = 0;
    public static long gg006700670067g0067 = 1;
    public static long gg00670067g00670067 = 9;
    public static long gg0067g006700670067 = 13;
    public static long gg0067gg00670067 = 5;
    public static long ggg0067006700670067 = 15;
    public static long ggg0067g00670067 = 7;
    public static long gggg006700670067 = 11;
    public static long ggggg00670067 = 3;
    public static int p0070ppppp;
    public static Object pp0070pppp;

    static {
        try {
            throw null;
        } catch (Exception unused) {
            d006400640064dd0064 = ddd00640064d0064();
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused2) {
                    d006400640064dd0064 = ddd00640064d0064();
                    while (true) {
                        try {
                            int[] iArr2 = new int[-1];
                        } catch (Exception unused3) {
                            d006400640064dd0064 = 90;
                            g0067g0067006700670067 = false;
                            gg00670067006700670067 = 16L;
                            p0070ppppp = 0;
                            pp0070pppp = new Object();
                            g0067g00670067g0067 = -1372815729589720923L;
                            gg006700670067g0067 = -7990345426070351575L;
                            g0067006700670067g0067 = -449920499692274501L;
                            ggggg00670067 = -8697345749806147196L;
                            g0067ggg00670067 = -6226108135485573884L;
                            gg0067gg00670067 = 38921549789854152L;
                            g00670067gg00670067 = -4062464398577820967L;
                            ggg0067g00670067 = -7594699216052323052L;
                            g0067g0067g00670067 = -8454540545550246903L;
                            gg00670067g00670067 = -6113502006569666790L;
                            g006700670067g00670067 = 5685599401926546666L;
                            gggg006700670067 = -7280188611996373413L;
                            g0067gg006700670067 = 3899011299555551153L;
                            gg0067g006700670067 = -4634270879549196908L;
                            g00670067g006700670067 = 6245509978926740739L;
                            ggg0067006700670067 = 3725431556385794168L;
                            return;
                        }
                    }
                }
            }
        }
    }

    public static int d00640064d0064d0064() {
        return 0;
    }

    public static int ddd00640064d0064() {
        return 76;
    }

    public static long h00680068hh00680068(int i) {
        switch (i) {
            case 0:
                return g0067g00670067g0067;
            case 1:
                return gg006700670067g0067;
            case 2:
                return g0067006700670067g0067;
            case 3:
                return ggggg00670067;
            case 4:
                return g0067ggg00670067;
            case 5:
                return gg0067gg00670067;
            case 6:
                return g00670067gg00670067;
            case 7:
                return ggg0067g00670067;
            case 8:
                return g0067g0067g00670067;
            case 9:
                return gg00670067g00670067;
            case 10:
                return g006700670067g00670067;
            case 11:
                return gggg006700670067;
            case 12:
                return g0067gg006700670067;
            case 13:
                return gg0067g006700670067;
            case 14:
                return g00670067g006700670067;
            case 15:
                long j = ggg0067006700670067;
                int i2 = d006400640064dd0064;
                if (((d0064dd0064d0064 + i2) * i2) % dd0064d0064d0064 != dddd0064d0064) {
                    d006400640064dd0064 = 27;
                    dddd0064d0064 = 93;
                }
                return j;
            default:
                return 0L;
        }
    }

    public static long h0068h0068h00680068() {
        long jH00680068hh00680068 = h00680068hh00680068(p0070ppppp);
        int i = (p0070ppppp + 1) & 15;
        p0070ppppp = i;
        long jH00680068hh006800682 = h00680068hh00680068(i);
        long j = jH00680068hh006800682 ^ (jH00680068hh006800682 << 31);
        long j2 = j ^ jH00680068hh00680068;
        hh0068hh00680068(p0070ppppp, (jH00680068hh00680068 >> 30) ^ ((j >> 11) ^ j2));
        int i2 = d006400640064dd0064;
        if (((d0064dd0064d0064 + i2) * i2) % dd0064d0064d0064 != dddd0064d0064) {
            d006400640064dd0064 = 51;
            dddd0064d0064 = ddd00640064d0064();
        }
        return h00680068hh00680068(p0070ppppp) * 1181783497276652981L;
    }

    public static void hh0068hh00680068(int i, long j) {
        switch (i) {
            case 0:
                g0067g00670067g0067 = j;
                break;
            case 1:
                gg006700670067g0067 = j;
                break;
            case 2:
                g0067006700670067g0067 = j;
                break;
            case 3:
                ggggg00670067 = j;
                break;
            case 4:
                g0067ggg00670067 = j;
                break;
            case 5:
                gg0067gg00670067 = j;
                break;
            case 6:
                g00670067gg00670067 = j;
                break;
            case 7:
                ggg0067g00670067 = j;
                break;
            case 8:
                g0067g0067g00670067 = j;
                int i2 = d006400640064dd0064;
                if (((d0064dd0064d0064 + i2) * i2) % dd0064d0064d0064 != d00640064d0064d0064()) {
                    d006400640064dd0064 = ddd00640064d0064();
                    dddd0064d0064 = 3;
                    break;
                }
                break;
            case 9:
                gg00670067g00670067 = j;
                break;
            case 10:
                g006700670067g00670067 = j;
                break;
            case 11:
                gggg006700670067 = j;
                break;
            case 12:
                g0067gg006700670067 = j;
                break;
            case 13:
                gg0067g006700670067 = j;
                break;
            case 14:
                g00670067g006700670067 = j;
                break;
            case 15:
                ggg0067006700670067 = j;
                break;
        }
    }

    public static int hhh0068h00680068() {
        if (!g0067g0067006700670067) {
            synchronized (pp0070pppp) {
                try {
                    if (!g0067g0067006700670067) {
                        for (long j = 0; j < 10; j++) {
                            gg00670067006700670067 = h0068h0068h00680068();
                        }
                        g0067g0067006700670067 = true;
                    }
                } finally {
                }
            }
        }
        return (int) gg00670067006700670067;
    }
}

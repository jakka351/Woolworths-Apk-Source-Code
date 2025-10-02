package com.behaviosec.rl;

/* loaded from: classes4.dex */
public class odooooo {
    private static final oddoooo p007000700070pp0070;
    public static int p00700070ppp0070p = 0;
    public static int p0070pppp0070p = 1;
    public static int pp0070007000700070pp = 16;
    public static int pppppp0070p = 2;

    static {
        oddoooo oddooooVar = new oddoooo();
        int i = pp0070007000700070pp;
        int i2 = p0070pppp0070p;
        if (((i + i2) * i) % pppppp0070p != 0) {
            pp0070007000700070pp = pp0070ppp0070p();
            p00700070ppp0070p = pp0070ppp0070p();
        }
        if (((i + i2) * pp0070007000700070pp) % pppppp0070p != p00700070ppp0070p) {
            pp0070007000700070pp = pp0070ppp0070p();
            p00700070ppp0070p = pp0070ppp0070p();
        }
        p007000700070pp0070 = oddooooVar;
    }

    private static void j006A006A006A006Aj006A(String str, String str2, String str3) {
        oddoooo oddooooVar = p007000700070pp0070;
        int i = pp0070007000700070pp;
        if (((p0070pppp0070p + i) * i) % pppppp0070p != 0) {
            pp0070007000700070pp = pp0070ppp0070p();
            p0070pppp0070p = pp0070ppp0070p();
        }
        int i2 = pp0070007000700070pp;
        if (((p00700070007000700070pp() + i2) * i2) % pppppp0070p != 0) {
            pp0070007000700070pp = 91;
            pppppp0070p = 62;
        }
        oddooooVar.jj006A006Aj006A006A(str, str2, str3);
    }

    public static <T extends Enum<T>> T j006Ajjj006A006A(Class<T> cls, String str) throws Exception {
        try {
            return (T) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException e) {
            oddoooo oddooooVar = p007000700070pp0070;
            String name = cls.getName();
            if (((pp0070ppp0070p() + p0070pppp0070p) * pp0070ppp0070p()) % pppppp0070p != p00700070ppp0070p) {
                int iPp0070ppp0070p = pp0070ppp0070p();
                pp0070007000700070pp = iPp0070ppp0070p;
                p00700070ppp0070p = 45;
                if (((p0070pppp0070p + iPp0070ppp0070p) * iPp0070ppp0070p) % ppp0070pp0070p() != 0) {
                    pp0070007000700070pp = 99;
                    p00700070ppp0070p = pp0070ppp0070p();
                }
            }
            String str2 = oddooooVar.jjj006Aj006A006A(name).j006A006Ajj006A006A().get(str);
            if (str2 != null) {
                return (T) Enum.valueOf(cls, str2);
            }
            throw e;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String jjjjj006A006A(String str, int i, int i2, int i3) {
        char c = (char) i;
        return i2 == -1 ? uuxuuuu.pppp0070ppp(str, c, (char) i3) : uuxuuuu.pp0070p0070ppp(str, c, (char) i2, (char) i3);
    }

    public static int p00700070007000700070pp() {
        return 1;
    }

    public static int pp0070ppp0070p() {
        return 39;
    }

    public static int ppp0070pp0070p() {
        return 2;
    }
}

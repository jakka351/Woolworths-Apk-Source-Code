package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import java.util.Map;

/* loaded from: classes6.dex */
public final class vvmmvmv {
    public static final String g0067ggggg = vvvmmvm.n006En006E006Enn("kknbgei", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496222)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587928)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587847)));
    public static int x007800780078x0078x = 0;
    public static int x00780078x00780078x = 1;
    public static int xx00780078x0078x = 40;
    public long gg0067gggg = 0;

    static {
        try {
            throw null;
        } catch (Exception unused) {
            xx00780078x0078x = 57;
        }
    }

    private long h00680068h0068hh(Map<String, Object> map, String str) {
        if (!map.containsKey(str)) {
            return 0L;
        }
        if (((xxxx00780078x() + xx00780078x0078x) * xx00780078x0078x) % x0078xx00780078x() != x007800780078x0078x) {
            xx00780078x0078x = xx0078x00780078x();
            x007800780078x0078x = xx0078x00780078x();
        }
        Long l = (Long) map.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static int x0078xx00780078x() {
        return 2;
    }

    public static int xx0078x00780078x() {
        return 31;
    }

    public static int xxxx00780078x() {
        return 1;
    }

    public void hhh00680068hh(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        int iHhhh006800680068 = vvmmvvm.hhhh006800680068();
        int i = xx00780078x0078x;
        if (((x00780078x00780078x + i) * i) % x0078xx00780078x() != x007800780078x0078x) {
            xx00780078x0078x = xx0078x00780078x();
            x007800780078x0078x = 86;
        }
        if (map.containsKey(vvvmmvm.n006E006En006Enn("\r\r\u0010\u0004\t\u0007\u000b", (char) (iHhhh006800680068 ^ (-1058496149)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258529)))) {
            this.gg0067gggg = h00680068h0068hh(map, vvvmmvm.n006En006E006Enn("\u0015\rP\rR\tM", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496212)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258398), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496242))));
        }
    }
}

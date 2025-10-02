package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqqql;
import java.util.Arrays;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class vvvmmmv {
    public static int d0064d0064ddd = 26;
    public static int dd00640064ddd = 0;
    public static int dd0064d0064dd = 1;
    public static int dddd0064dd = 2;
    public static final String gg0067g00670067g = vvvmmvm.n006E006En006Enn("NMLKJIHG", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496023)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843028)));
    public final int g00670067006700670067g;
    private final String g00670067g00670067g;
    private final long g0067g006700670067g;
    public final String gg0067006700670067g;
    private final short[] ggg006700670067g;

    private vvvmmmv() {
        this.g00670067g00670067g = "";
        this.gg0067006700670067g = "";
        this.ggg006700670067g = new short[1];
        this.g0067g006700670067g = 0L;
        this.g00670067006700670067g = 0;
    }

    public static int d006400640064ddd() {
        return 1;
    }

    public static int d0064d00640064dd() {
        return 2;
    }

    public static int d0064dd0064dd() {
        return 86;
    }

    public static int h006800680068hh0068(int i) {
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
        int i2 = d0064d0064ddd;
        if (((dd0064d0064dd + i2) * i2) % dddd0064dd != dd00640064ddd) {
            d0064d0064ddd = d0064dd0064dd();
            dd00640064ddd = d0064dd0064dd();
        }
        return (35 - iNumberOfLeadingZeros) / 4;
    }

    private void h0068h0068hh0068(@Nonnull StringBuilder sb, @Nonnull short[] sArr) {
        if (this.ggg006700670067g == null) {
            return;
        }
        int iH006800680068hh0068 = h006800680068hh0068(sArr.length);
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                d0064d0064ddd = d0064dd0064dd();
                for (int i = 0; i < sArr.length; i++) {
                    if (Arrays.binarySearch(this.ggg006700670067g, sArr[i]) >= 0) {
                        String hexString = Integer.toHexString(i);
                        sb.append(vvvmmvm.n006E006En006Enn("76543210", (char) (vmmmvvm.hh0068h006800680068() ^ 263258535), (char) (vmmmvvm.hh0068h006800680068() ^ 263258532)).substring(0, iH006800680068hh0068 - hexString.length()));
                        sb.append(hexString);
                    }
                }
                return;
            }
        }
    }

    public String hh00680068hh0068() {
        if (((d006400640064ddd() + d0064d0064ddd) * d0064d0064ddd) % dddd0064dd != dd00640064ddd) {
            d0064d0064ddd = d0064dd0064dd();
            dd00640064ddd = 28;
        }
        return this.g00670067g00670067g;
    }

    public void hhh0068hh0068(@Nonnull StringBuilder sb, @Nullable short[] sArr) {
        char cHhhh006800680068;
        char cHhh0068h00680068;
        String str;
        if (this.g00670067006700670067g > 0) {
            cHhhh006800680068 = (char) (vvmmvvm.hhhh006800680068() ^ (-1058496126));
            cHhh0068h00680068 = (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587846));
            str = "N";
        } else {
            cHhhh006800680068 = (char) (vvmmvvm.hhhh006800680068() ^ (-1058496246));
            cHhh0068h00680068 = (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587850));
            str = "l";
        }
        sb.append(vvvmmvm.n006E006En006Enn(str, cHhhh006800680068, cHhh0068h00680068));
        sb.append(vvvmmvm.n006En006E006Enn("\u0017", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843203)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843240)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843031))));
        try {
            throw null;
        } catch (Exception unused) {
            String str2 = this.g00670067g00670067g;
            if (str2 != null) {
                sb.append(str2);
            }
            if (sArr != null) {
                sb.append(vvvmmvm.n006En006E006Enn(lllqqql.c0063ccc0063c, (char) (vmmmvvm.hh0068h006800680068() ^ 263258399), (char) (vmmmvvm.hh0068h006800680068() ^ 263258460), (char) ((-1058496246) ^ vvmmvvm.hhhh006800680068())));
                h0068h0068hh0068(sb, sArr);
            }
        }
    }

    @Nonnull
    public String toString() {
        int i = d0064d0064ddd;
        if (((dd0064d0064dd + i) * i) % dddd0064dd != 0) {
            d0064d0064ddd = d0064dd0064dd();
            dd00640064ddd = d0064dd0064dd();
        }
        return this.g00670067g00670067g + vvvmmvm.n006E006En006Enn("<o?", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496120)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496243))) + this.gg0067006700670067g + vvvmmvm.n006E006En006Enn("^\u0017]", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496156)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843027))) + this.g0067g006700670067g;
    }

    public vvvmmmv(String str, String str2, short[] sArr, long j, int i) {
        this.g00670067g00670067g = str;
        this.g00670067006700670067g = i;
        this.ggg006700670067g = sArr;
        this.gg0067006700670067g = str2;
        this.g0067g006700670067g = j;
    }
}

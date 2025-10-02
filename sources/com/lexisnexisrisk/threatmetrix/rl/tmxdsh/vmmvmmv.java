package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public final class vmmvmmv {
    public static int d0064ddddd = 1;
    public static int x00780078x007800780078 = 0;
    public static int x0078x0078007800780078 = 2;
    public static int xx0078x007800780078 = 71;

    private vmmvmmv() {
    }

    public static int dd0064dddd() {
        return 2;
    }

    public static boolean h00680068hhh0068(@Nullable String str) {
        if (str == null) {
            return true;
        }
        if (((xxx0078007800780078() + xx0078x007800780078) * xx0078x007800780078) % x0078x0078007800780078 != x00780078x007800780078) {
            xx0078x007800780078 = xx00780078007800780078();
            x00780078x007800780078 = 14;
        }
        return str.isEmpty();
    }

    @Nullable
    public static String h0068hhhh0068(@Nonnull String str, @Nonnull String str2, @Nonnull String str3, boolean z) {
        String lowerCase;
        if (h00680068hhh0068(str) || h00680068hhh0068(str3)) {
            return null;
        }
        if (h00680068hhh0068(str2)) {
            return str;
        }
        if (z) {
            lowerCase = str.toLowerCase();
            str2 = str2.toLowerCase();
        } else {
            lowerCase = str;
        }
        int iIndexOf = lowerCase.indexOf(str2);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = lowerCase.indexOf(str3, iIndexOf + 1);
        return iIndexOf2 != -1 ? str.substring(iIndexOf, iIndexOf2) : str.substring(iIndexOf);
    }

    public static boolean hh0068hhh0068(@Nullable String str) {
        if (str == null) {
            return false;
        }
        boolean zIsEmpty = str.isEmpty();
        int i = xx0078x007800780078;
        if (((d0064ddddd + i) * i) % dd0064dddd() != x00780078x007800780078) {
            xx0078x007800780078 = 67;
            x00780078x007800780078 = xx00780078007800780078();
        }
        return !zIsEmpty;
    }

    public static int xx00780078007800780078() {
        return 49;
    }

    public static int xxx0078007800780078() {
        return 1;
    }
}

package com.medallia.digital.mobilesdk;

import android.os.Build;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.s0;

/* loaded from: classes.dex */
class n1 extends y5<String> {
    public n1(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : charArray) {
            if (z && Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
                z = false;
            } else {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private String s() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return str2.startsWith(str) ? a(str2) : YU.a.p(new StringBuilder(), a(str), " ", str2);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.b;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(YU.a.A("Collectors > Model: ", strS));
        return strS;
    }
}

package com.scandit.datacapture.core;

import java.util.Arrays;

/* renamed from: com.scandit.datacapture.core.z4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1183z4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19000a;
    private final C1174y4 b;
    private C1174y4 c;

    public /* synthetic */ C1183z4(String str, int i) {
        this(str);
    }

    public final void a(String str, String str2) {
        C1174y4 c1174y4 = new C1174y4(0);
        this.c.c = c1174y4;
        this.c = c1174y4;
        c1174y4.b = str2;
        c1174y4.f18994a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f19000a);
        sb.append('{');
        C1174y4 c1174y4 = this.b.c;
        String str = "";
        while (c1174y4 != null) {
            Object obj = c1174y4.b;
            sb.append(str);
            String str2 = c1174y4.f18994a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            c1174y4 = c1174y4.c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    private C1183z4(String str) {
        C1174y4 c1174y4 = new C1174y4(0);
        this.b = c1174y4;
        this.c = c1174y4;
        this.f19000a = (String) T4.a(str);
    }
}

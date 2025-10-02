package com.fasterxml.jackson.core;

import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes4.dex */
public final class Base64Variants {

    /* renamed from: a, reason: collision with root package name */
    public static final Base64Variant f14190a;
    public static final Base64Variant b;
    public static final Base64Variant c;
    public static final Base64Variant d;

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f14190a = base64Variant;
        b = new Base64Variant(base64Variant, "MIME-NO-LINEFEEDS", true, '=', base64Variant.k, Integer.MAX_VALUE);
        c = new Base64Variant(base64Variant, "PEM", true, '=', base64Variant.k, 64);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf(q2.c), '_');
        d = new Base64Variant("MODIFIED-FOR-URL", sb.toString(), false, (char) 0, Integer.MAX_VALUE);
    }
}

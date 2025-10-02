package com.google.zxing.common;

import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class StringUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16147a;
    public static final boolean b;

    static {
        String strName = Charset.defaultCharset().name();
        f16147a = strName;
        b = "SJIS".equalsIgnoreCase(strName) || "EUC_JP".equalsIgnoreCase(strName);
    }
}

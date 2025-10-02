package com.fasterxml.jackson.core;

/* loaded from: classes4.dex */
public enum JsonEncoding {
    g("UTF8", "UTF-8", false),
    h("UTF16_BE", "UTF-16BE", true),
    i("UTF16_LE", "UTF-16LE", false),
    j("UTF32_BE", "UTF-32BE", true),
    k("UTF32_LE", "UTF-32LE", false);

    public final String d;
    public final boolean e;
    public final int f;

    JsonEncoding(String str, String str2, boolean z) {
        this.d = str2;
        this.e = z;
        this.f = i;
    }
}

package com.google.zxing.common;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class DecoderResult {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16143a;
    public final String b;
    public final List c;
    public final String d;
    public Object e;
    public final int f;
    public final int g;

    public DecoderResult(byte[] bArr, String str, ArrayList arrayList, String str2) {
        this(bArr, str, arrayList, str2, -1, -1);
    }

    public DecoderResult(byte[] bArr, String str, List list, String str2, int i, int i2) {
        this.f16143a = bArr;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.f = i2;
        this.g = i;
    }
}

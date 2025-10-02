package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
final class EncoderContext {

    /* renamed from: a, reason: collision with root package name */
    public final String f16164a;
    public SymbolShapeHint b;
    public Dimension c;
    public Dimension d;
    public final StringBuilder e;
    public int f;
    public int g;
    public SymbolInfo h;
    public int i;

    public EncoderContext(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.f16164a = sb.toString();
        this.b = SymbolShapeHint.d;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    public final char a() {
        return this.f16164a.charAt(this.f);
    }

    public final boolean b() {
        return this.f < this.f16164a.length() - this.i;
    }

    public final void c(int i) {
        SymbolInfo symbolInfo = this.h;
        if (symbolInfo == null || i > symbolInfo.b) {
            this.h = SymbolInfo.f(i, this.b, this.c, this.d);
        }
    }

    public final void d(char c) {
        this.e.append(c);
    }
}

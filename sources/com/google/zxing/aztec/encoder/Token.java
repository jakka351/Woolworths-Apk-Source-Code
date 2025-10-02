package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
abstract class Token {
    public static final SimpleToken b = new SimpleToken(null, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final Token f16141a;

    public Token(Token token) {
        this.f16141a = token;
    }

    public abstract void a(BitArray bitArray, byte[] bArr);
}

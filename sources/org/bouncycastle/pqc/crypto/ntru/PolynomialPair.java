package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* loaded from: classes8.dex */
class PolynomialPair {

    /* renamed from: a, reason: collision with root package name */
    private final Polynomial f26806a;
    private final Polynomial b;

    public PolynomialPair(Polynomial polynomial, Polynomial polynomial2) {
        this.f26806a = polynomial;
        this.b = polynomial2;
    }

    public Polynomial f() {
        return this.f26806a;
    }

    public Polynomial g() {
        return this.b;
    }

    public Polynomial m() {
        return this.b;
    }

    public Polynomial r() {
        return this.f26806a;
    }
}

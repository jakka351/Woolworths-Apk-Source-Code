package org.bouncycastle.util.io.pem;

import java.io.IOException;

/* loaded from: classes8.dex */
public class PemGenerationException extends IOException {
    private Throwable cause;

    public PemGenerationException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public PemGenerationException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}

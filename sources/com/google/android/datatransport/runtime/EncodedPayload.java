package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class EncodedPayload {

    /* renamed from: a, reason: collision with root package name */
    public final Encoding f14439a;
    public final byte[] b;

    public EncodedPayload(Encoding encoding, byte[] bArr) {
        if (encoding == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f14439a = encoding;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.f14439a.equals(encodedPayload.f14439a)) {
            return Arrays.equals(this.b, encodedPayload.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14439a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f14439a + ", bytes=[...]}";
    }
}

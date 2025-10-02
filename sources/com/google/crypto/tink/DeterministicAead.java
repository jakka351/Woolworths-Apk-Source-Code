package com.google.crypto.tink;

/* loaded from: classes.dex */
public interface DeterministicAead {
    byte[] a(byte[] bArr, byte[] bArr2);

    byte[] b(byte[] bArr, byte[] bArr2);
}

package org.bouncycastle.crypto;

/* loaded from: classes8.dex */
public interface EncapsulatedSecretExtractor {
    byte[] extractSecret(byte[] bArr);

    int getEncapsulationLength();
}

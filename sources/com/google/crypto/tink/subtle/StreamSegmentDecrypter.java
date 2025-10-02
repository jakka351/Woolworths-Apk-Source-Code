package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public interface StreamSegmentDecrypter {
    void a(byte[] bArr, ByteBuffer byteBuffer);

    void b(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2);
}

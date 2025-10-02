package com.google.crypto.tink;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;

/* loaded from: classes.dex */
public interface StreamingAead {
    ReadableByteChannel a(ReadableByteChannel readableByteChannel, byte[] bArr);

    SeekableByteChannel b(byte[] bArr);

    InputStream c(InputStream inputStream, byte[] bArr);
}

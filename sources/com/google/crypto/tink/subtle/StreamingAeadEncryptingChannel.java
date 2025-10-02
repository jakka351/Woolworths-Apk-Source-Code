package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes6.dex */
class StreamingAeadEncryptingChannel implements WritableByteChannel {
    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return false;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final synchronized int write(ByteBuffer byteBuffer) {
        throw new ClosedChannelException();
    }
}

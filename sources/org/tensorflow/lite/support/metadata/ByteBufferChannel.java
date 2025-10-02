package org.tensorflow.lite.support.metadata;

/* loaded from: classes8.dex */
final class ByteBufferChannel implements SeekableByteChannelCompat {
    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }
}

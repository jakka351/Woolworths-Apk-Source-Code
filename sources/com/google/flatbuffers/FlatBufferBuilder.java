package com.google.flatbuffers;

import java.io.InputStream;

/* loaded from: classes6.dex */
public class FlatBufferBuilder {

    public static class ByteBufferBackedInputStream extends InputStream {
        @Override // java.io.InputStream
        public final int read() {
            throw null;
        }
    }

    public static abstract class ByteBufferFactory {
    }

    public static final class HeapByteBufferFactory extends ByteBufferFactory {
    }
}

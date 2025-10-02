package androidx.emoji2.text.flatbuffer;

import java.io.InputStream;

/* loaded from: classes2.dex */
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

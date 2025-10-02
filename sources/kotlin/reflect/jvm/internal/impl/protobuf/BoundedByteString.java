package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* loaded from: classes7.dex */
class BoundedByteString extends LiteralByteString {

    public class BoundedByteIterator implements ByteString.ByteIterator {
        public int d;

        public BoundedByteIterator() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d < 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public final byte nextByte() {
            int i = this.d;
            if (i >= 0) {
                throw new NoSuchElementException();
            }
            byte[] bArr = BoundedByteString.this.e;
            this.d = i + 1;
            return bArr[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final void i(int i, int i2, byte[] bArr, int i3) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        iterator();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    /* renamed from: m */
    public final ByteString.ByteIterator iterator() {
        new BoundedByteIterator();
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public final int size() {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public final byte w(int i) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public final int y() {
        throw null;
    }
}

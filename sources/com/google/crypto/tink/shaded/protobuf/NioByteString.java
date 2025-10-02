package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
final class NioByteString extends ByteString.LeafByteString {
    public final ByteBuffer g;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.NioByteString$1, reason: invalid class name */
    class AnonymousClass1 extends InputStream {
        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw null;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            throw null;
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw null;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            throw null;
        }
    }

    public NioByteString(ByteBuffer byteBuffer) {
        Charset charset = Internal.f15103a;
        this.g = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        ByteBuffer byteBufferSlice = this.g.slice();
        int iRemaining = byteBufferSlice.remaining();
        ByteString.h(0, iRemaining, byteBufferSlice.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBufferSlice.get(bArr);
        return new ByteString.LiteralByteString(bArr);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LeafByteString
    public final boolean C(ByteString byteString, int i, int i2) {
        return u(0, i2).equals(byteString.u(i, i2 + i));
    }

    public final ByteBuffer D(int i, int i2) {
        ByteBuffer byteBuffer = this.g;
        if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i - byteBuffer.position());
        byteBufferSlice.limit(i2 - byteBuffer.position());
        return byteBufferSlice;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final ByteBuffer b() {
        return this.g.asReadOnlyBuffer();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final byte d(int i) {
        try {
            return this.g.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer.remaining() != byteString.size()) {
            return false;
        }
        if (byteBuffer.remaining() == 0) {
            return true;
        }
        return obj instanceof NioByteString ? byteBuffer.equals(((NioByteString) obj).g) : obj instanceof RopeByteString ? obj.equals(this) : byteBuffer.equals(byteString.b());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final void k(int i, int i2, byte[] bArr, int i3) {
        ByteBuffer byteBufferSlice = this.g.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final boolean n() {
        Utf8.Processor processor = Utf8.f15122a;
        ByteBuffer byteBuffer = this.g;
        return processor.g(byteBuffer, 0, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final CodedInputStream q() {
        return CodedInputStream.h(this.g, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int s(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.g.get(i4);
        }
        return i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int size() {
        return this.g.remaining();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final int t(int i, int i2, int i3) {
        return Utf8.f15122a.g(this.g, i, i2, i3 + i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final ByteString u(int i, int i2) {
        try {
            return new NioByteString(D(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final String x(Charset charset) {
        byte[] bArrW;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer.hasArray()) {
            bArrW = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            bArrW = w();
            length = bArrW.length;
            iPosition = 0;
        }
        return new String(bArrW, iPosition, length, charset);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteString
    public final void z(ByteOutput byteOutput) {
        byteOutput.R(this.g.slice());
    }
}

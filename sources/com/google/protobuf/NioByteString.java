package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Utf8;
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

    /* renamed from: com.google.protobuf.NioByteString$1, reason: invalid class name */
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
        Charset charset = Internal.f16059a;
        this.g = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        ByteBuffer byteBufferSlice = this.g.slice();
        int iRemaining = byteBufferSlice.remaining();
        ByteString.i(0, iRemaining, byteBufferSlice.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBufferSlice.get(bArr);
        return new ByteString.LiteralByteString(bArr);
    }

    @Override // com.google.protobuf.ByteString
    public final void B(ByteOutput byteOutput) {
        byteOutput.R(this.g.slice());
    }

    @Override // com.google.protobuf.ByteString.LeafByteString
    public final boolean D(ByteString byteString, int i, int i2) {
        return x(0, i2).equals(byteString.x(i, i2 + i));
    }

    public final ByteBuffer E(int i, int i2) {
        ByteBuffer byteBuffer = this.g;
        if (i < byteBuffer.position() || i2 > byteBuffer.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i - byteBuffer.position());
        byteBufferSlice.limit(i2 - byteBuffer.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer b() {
        return this.g.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
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

    @Override // com.google.protobuf.ByteString
    public final byte g(int i) {
        try {
            return this.g.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final void l(int i, int i2, byte[] bArr, int i3) {
        ByteBuffer byteBufferSlice = this.g.slice();
        byteBufferSlice.position(i);
        byteBufferSlice.get(bArr, i2, i3);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean q() {
        Utf8.Processor processor = Utf8.f16094a;
        ByteBuffer byteBuffer = this.g;
        return processor.g(byteBuffer, 0, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.g.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream t() {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer.hasArray()) {
            return CodedInputStream.g(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), true);
        }
        if (byteBuffer.isDirect() && UnsafeUtil.d) {
            return new CodedInputStream.UnsafeDirectNioDecoder(byteBuffer);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return CodedInputStream.g(bArr, 0, iRemaining, true);
    }

    @Override // com.google.protobuf.ByteString
    public final int u(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.g.get(i4);
        }
        return i;
    }

    @Override // com.google.protobuf.ByteString
    public final int w(int i, int i2, int i3) {
        return Utf8.f16094a.g(this.g, i, i2, i3 + i2);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString x(int i, int i2) {
        try {
            return new NioByteString(E(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public final String z(Charset charset) {
        byte[] bArrY;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer.hasArray()) {
            bArrY = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            bArrY = y();
            length = bArrY.length;
            iPosition = 0;
        }
        return new String(bArrY, iPosition, length, charset);
    }
}

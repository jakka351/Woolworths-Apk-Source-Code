package io.grpc.protobuf.lite;

import com.google.common.base.Preconditions;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import io.grpc.Drainable;
import io.grpc.KnownLength;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
final class ProtoInputStream extends InputStream implements Drainable, KnownLength {
    public MessageLite d;
    public final Parser e;
    public ByteArrayInputStream f;

    public ProtoInputStream(MessageLite messageLite, Parser parser) {
        this.d = messageLite;
        this.e = parser;
    }

    @Override // io.grpc.Drainable
    public final int a(OutputStream outputStream) throws IOException {
        MessageLite messageLite = this.d;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            this.d.writeTo(outputStream);
            this.d = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f;
        if (byteArrayInputStream == null) {
            return 0;
        }
        ExtensionRegistryLite extensionRegistryLite = ProtoLiteUtils.f24156a;
        Preconditions.j(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                this.f = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += i;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        MessageLite messageLite = this.d;
        if (messageLite != null) {
            return messageLite.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.d != null) {
            this.f = new ByteArrayInputStream(this.d.toByteArray());
            this.d = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MessageLite messageLite = this.d;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            if (serializedSize == 0) {
                this.d = null;
                this.f = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                CodedOutputStream codedOutputStreamB0 = CodedOutputStream.b0(i, serializedSize, bArr);
                this.d.c(codedOutputStreamB0);
                if (codedOutputStreamB0.c0() == 0) {
                    this.d = null;
                    this.f = null;
                    return serializedSize;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            this.f = new ByteArrayInputStream(this.d.toByteArray());
            this.d = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}

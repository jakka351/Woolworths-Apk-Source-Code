package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes.dex */
public abstract class AbstractMessageLite implements MessageLite {

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {
        @Override // 
        public abstract Builder b();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public abstract Builder F(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public static final class LimitedInputStream extends FilterInputStream {
            public int d;

            public LimitedInputStream(ByteArrayInputStream byteArrayInputStream, int i) {
                super(byteArrayInputStream);
                this.d = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.d);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.d <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.d--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.d));
                if (jSkip >= 0) {
                    this.d = (int) (this.d - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.d;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.d -= i4;
                }
                return i4;
            }
        }
    }
}

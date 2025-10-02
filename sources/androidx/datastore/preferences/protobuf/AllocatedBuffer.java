package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

@CheckReturnValue
/* loaded from: classes2.dex */
abstract class AllocatedBuffer {

    /* renamed from: androidx.datastore.preferences.protobuf.AllocatedBuffer$1, reason: invalid class name */
    class AnonymousClass1 extends AllocatedBuffer {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.AllocatedBuffer$2, reason: invalid class name */
    class AnonymousClass2 extends AllocatedBuffer {
    }

    public static AnonymousClass1 a(ByteBuffer byteBuffer) {
        Internal.a(byteBuffer, "buffer");
        return new AnonymousClass1();
    }

    public static void b(int i, int i2, byte[] bArr) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }
}

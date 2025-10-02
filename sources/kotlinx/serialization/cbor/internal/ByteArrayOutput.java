package kotlinx.serialization.cbor.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/cbor/internal/ByteArrayOutput;", "", "kotlinx-serialization-cbor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteArrayOutput {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f24755a;
    public int b;

    public static void c(ByteArrayOutput byteArrayOutput, byte[] buffer, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = buffer.length;
        }
        byteArrayOutput.getClass();
        Intrinsics.h(buffer, "buffer");
        if (buffer.length < 0 || i < 0 || i > buffer.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            return;
        }
        byteArrayOutput.a(i);
        ArraysKt.p(byteArrayOutput.b, 0, i, buffer, byteArrayOutput.f24755a);
        byteArrayOutput.b += i;
    }

    public final void a(int i) {
        int i2 = this.b + i;
        if (i2 <= this.f24755a.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i2) << 1];
        ArraysKt.v(this.f24755a, bArr, 0, 0, 0, 14);
        this.f24755a = bArr;
    }

    public final void b(int i) {
        a(1);
        byte[] bArr = this.f24755a;
        int i2 = this.b;
        this.b = i2 + 1;
        bArr[i2] = (byte) i;
    }
}

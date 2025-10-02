package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ByteArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class ByteArrayBuilder extends PrimitiveArrayBuilder<byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f24780a;
    public int b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f24780a, this.b);
        Intrinsics.g(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void b(int i) {
        byte[] bArr = this.f24780a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            Intrinsics.g(bArrCopyOf, "copyOf(...)");
            this.f24780a = bArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }
}

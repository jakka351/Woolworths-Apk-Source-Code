package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ShortArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class ShortArrayBuilder extends PrimitiveArrayBuilder<short[]> {

    /* renamed from: a, reason: collision with root package name */
    public short[] f24819a;
    public int b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f24819a, this.b);
        Intrinsics.g(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void b(int i) {
        short[] sArr = this.f24819a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            Intrinsics.g(sArrCopyOf, "copyOf(...)");
            this.f24819a = sArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }
}

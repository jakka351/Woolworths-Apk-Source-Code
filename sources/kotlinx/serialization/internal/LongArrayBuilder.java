package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/LongArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class LongArrayBuilder extends PrimitiveArrayBuilder<long[]> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24803a;
    public int b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f24803a, this.b);
        Intrinsics.g(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void b(int i) {
        long[] jArr = this.f24803a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            Intrinsics.g(jArrCopyOf, "copyOf(...)");
            this.f24803a = jArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }
}

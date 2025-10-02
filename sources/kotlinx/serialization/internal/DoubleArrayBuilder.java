package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/DoubleArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class DoubleArrayBuilder extends PrimitiveArrayBuilder<double[]> {

    /* renamed from: a, reason: collision with root package name */
    public double[] f24791a;
    public int b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f24791a, this.b);
        Intrinsics.g(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void b(int i) {
        double[] dArr = this.f24791a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            Intrinsics.g(dArrCopyOf, "copyOf(...)");
            this.f24791a = dArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }
}

package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ULongArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lkotlin/ULongArray;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
/* loaded from: classes7.dex */
public final class ULongArrayBuilder extends PrimitiveArrayBuilder<ULongArray> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f24830a;
    public int b;

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f24830a, this.b);
        Intrinsics.g(jArrCopyOf, "copyOf(...)");
        return new ULongArray(jArrCopyOf);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void b(int i) {
        long[] jArr = this.f24830a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            Intrinsics.g(jArrCopyOf, "copyOf(...)");
            this.f24830a = jArrCopyOf;
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.b;
    }
}

package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;", "Lkotlinx/serialization/internal/ListLikeDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PrimitiveArrayDescriptor extends ListLikeDescriptor {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArrayDescriptor(SerialDescriptor primitive) {
        super(primitive);
        Intrinsics.h(primitive, "primitive");
        this.b = primitive.getB() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i, reason: from getter */
    public final String getB() {
        return this.b;
    }
}

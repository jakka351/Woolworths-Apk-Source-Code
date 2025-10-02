package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/BooleanArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/BooleanArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class BooleanArraySerializer extends PrimitiveArraySerializer<Boolean, boolean[], BooleanArrayBuilder> implements KSerializer<boolean[]> {
    public static final BooleanArraySerializer c = new BooleanArraySerializer(BooleanSerializer.f24779a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.h(zArr, "<this>");
        return zArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void f(CompositeDecoder compositeDecoder, int i, Object obj) {
        BooleanArrayBuilder builder = (BooleanArrayBuilder) obj;
        Intrinsics.h(builder, "builder");
        boolean zB = compositeDecoder.B(this.b, i);
        builder.b(builder.getB() + 1);
        boolean[] zArr = builder.f24778a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        zArr[i2] = zB;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.h(zArr, "<this>");
        BooleanArrayBuilder booleanArrayBuilder = new BooleanArrayBuilder();
        booleanArrayBuilder.f24778a = zArr;
        booleanArrayBuilder.b = zArr.length;
        booleanArrayBuilder.b(10);
        return booleanArrayBuilder;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object j() {
        return new boolean[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void k(CompositeEncoder encoder, Object obj, int i) {
        boolean[] content = (boolean[]) obj;
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.o(this.b, i2, content[i2]);
        }
    }
}

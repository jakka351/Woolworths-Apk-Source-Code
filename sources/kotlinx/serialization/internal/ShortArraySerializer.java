package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/ShortArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/ShortArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class ShortArraySerializer extends PrimitiveArraySerializer<Short, short[], ShortArrayBuilder> implements KSerializer<short[]> {
    public static final ShortArraySerializer c = new ShortArraySerializer(ShortSerializer.f24820a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.h(sArr, "<this>");
        return sArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void f(CompositeDecoder compositeDecoder, int i, Object obj) {
        ShortArrayBuilder builder = (ShortArrayBuilder) obj;
        Intrinsics.h(builder, "builder");
        short sY = compositeDecoder.y(this.b, i);
        builder.b(builder.getB() + 1);
        short[] sArr = builder.f24819a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        sArr[i2] = sY;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        Intrinsics.h(sArr, "<this>");
        ShortArrayBuilder shortArrayBuilder = new ShortArrayBuilder();
        shortArrayBuilder.f24819a = sArr;
        shortArrayBuilder.b = sArr.length;
        shortArrayBuilder.b(10);
        return shortArrayBuilder;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object j() {
        return new short[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void k(CompositeEncoder encoder, Object obj, int i) {
        short[] content = (short[]) obj;
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.A(this.b, i2, content[i2]);
        }
    }
}

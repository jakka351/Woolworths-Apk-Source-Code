package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/ULongArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ULongArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/ULong;", "Lkotlinx/serialization/internal/ULongArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
/* loaded from: classes7.dex */
public final class ULongArraySerializer extends PrimitiveArraySerializer<ULong, ULongArray, ULongArrayBuilder> implements KSerializer<ULongArray> {
    public static final ULongArraySerializer c = new ULongArraySerializer(ULongSerializer.f24831a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int d(Object obj) {
        long[] collectionSize = ((ULongArray) obj).d;
        Intrinsics.h(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void f(CompositeDecoder compositeDecoder, int i, Object obj) {
        ULongArrayBuilder builder = (ULongArrayBuilder) obj;
        Intrinsics.h(builder, "builder");
        long jI = compositeDecoder.q(this.b, i).i();
        builder.b(builder.getB() + 1);
        long[] jArr = builder.f24830a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        jArr[i2] = jI;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object g(Object obj) {
        long[] toBuilder = ((ULongArray) obj).d;
        Intrinsics.h(toBuilder, "$this$toBuilder");
        ULongArrayBuilder uLongArrayBuilder = new ULongArrayBuilder();
        uLongArrayBuilder.f24830a = toBuilder;
        uLongArrayBuilder.b = toBuilder.length;
        uLongArrayBuilder.b(10);
        return uLongArrayBuilder;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object j() {
        return new ULongArray(new long[0]);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void k(CompositeEncoder encoder, Object obj, int i) {
        long[] jArr = ((ULongArray) obj).d;
        Intrinsics.h(encoder, "encoder");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.h(this.b, i2).y(jArr[i2]);
        }
    }
}

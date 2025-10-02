package kotlinx.serialization.internal;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/UShortArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UShortArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UShort;", "Lkotlinx/serialization/internal/UShortArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
/* loaded from: classes7.dex */
public final class UShortArraySerializer extends PrimitiveArraySerializer<UShort, UShortArray, UShortArrayBuilder> implements KSerializer<UShortArray> {
    public static final UShortArraySerializer c = new UShortArraySerializer(UShortSerializer.f24833a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int d(Object obj) {
        short[] collectionSize = ((UShortArray) obj).d;
        Intrinsics.h(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void f(CompositeDecoder compositeDecoder, int i, Object obj) {
        UShortArrayBuilder builder = (UShortArrayBuilder) obj;
        Intrinsics.h(builder, "builder");
        short sL = compositeDecoder.q(this.b, i).l();
        builder.b(builder.getB() + 1);
        short[] sArr = builder.f24832a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        sArr[i2] = sL;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object g(Object obj) {
        short[] toBuilder = ((UShortArray) obj).d;
        Intrinsics.h(toBuilder, "$this$toBuilder");
        UShortArrayBuilder uShortArrayBuilder = new UShortArrayBuilder();
        uShortArrayBuilder.f24832a = toBuilder;
        uShortArrayBuilder.b = toBuilder.length;
        uShortArrayBuilder.b(10);
        return uShortArrayBuilder;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object j() {
        return new UShortArray(new short[0]);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void k(CompositeEncoder encoder, Object obj, int i) {
        short[] content = ((UShortArray) obj).d;
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.h(this.b, i2).l(content[i2]);
        }
    }
}

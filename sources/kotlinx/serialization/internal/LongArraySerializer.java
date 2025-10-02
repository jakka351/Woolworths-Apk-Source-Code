package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/LongArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/LongArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class LongArraySerializer extends PrimitiveArraySerializer<Long, long[], LongArrayBuilder> implements KSerializer<long[]> {
    public static final LongArraySerializer c = new LongArraySerializer(LongSerializer.f24804a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.h(jArr, "<this>");
        return jArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void f(CompositeDecoder compositeDecoder, int i, Object obj) {
        LongArrayBuilder builder = (LongArrayBuilder) obj;
        Intrinsics.h(builder, "builder");
        long jF = compositeDecoder.f(this.b, i);
        builder.b(builder.getB() + 1);
        long[] jArr = builder.f24803a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        jArr[i2] = jF;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.h(jArr, "<this>");
        LongArrayBuilder longArrayBuilder = new LongArrayBuilder();
        longArrayBuilder.f24803a = jArr;
        longArrayBuilder.b = jArr.length;
        longArrayBuilder.b(10);
        return longArrayBuilder;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object j() {
        return new long[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void k(CompositeEncoder encoder, Object obj, int i) {
        long[] content = (long[]) obj;
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.t(this.b, i2, content[i2]);
        }
    }
}

package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/DoubleArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "", "Lkotlinx/serialization/internal/DoubleArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class DoubleArraySerializer extends PrimitiveArraySerializer<Double, double[], DoubleArrayBuilder> implements KSerializer<double[]> {
    public static final DoubleArraySerializer c = new DoubleArraySerializer(DoubleSerializer.f24792a);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.h(dArr, "<this>");
        return dArr.length;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void f(CompositeDecoder compositeDecoder, int i, Object obj) {
        DoubleArrayBuilder builder = (DoubleArrayBuilder) obj;
        Intrinsics.h(builder, "builder");
        double D = compositeDecoder.D(this.b, i);
        builder.b(builder.getB() + 1);
        double[] dArr = builder.f24791a;
        int i2 = builder.b;
        builder.b = i2 + 1;
        dArr[i2] = D;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        Intrinsics.h(dArr, "<this>");
        DoubleArrayBuilder doubleArrayBuilder = new DoubleArrayBuilder();
        doubleArrayBuilder.f24791a = dArr;
        doubleArrayBuilder.b = dArr.length;
        doubleArrayBuilder.b(10);
        return doubleArrayBuilder;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final Object j() {
        return new double[0];
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public final void k(CompositeEncoder encoder, Object obj, int i) {
        double[] content = (double[]) obj;
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.G(this.b, i2, content[i2]);
        }
    }
}

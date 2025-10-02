package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveArrayBuilder;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Element", "Array", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Builder", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class PrimitiveArraySerializer<Element, Array, Builder extends PrimitiveArrayBuilder<Array>> extends CollectionLikeSerializer<Element, Array, Builder> {
    public final PrimitiveArrayDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveArraySerializer(KSerializer primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.h(primitiveSerializer, "primitiveSerializer");
        this.b = new PrimitiveArrayDescriptor(primitiveSerializer.getB());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object a() {
        return (PrimitiveArrayBuilder) g(j());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int b(Object obj) {
        PrimitiveArrayBuilder primitiveArrayBuilder = (PrimitiveArrayBuilder) obj;
        Intrinsics.h(primitiveArrayBuilder, "<this>");
        return primitiveArrayBuilder.getB();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return this.b;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Object h(Object obj) {
        PrimitiveArrayBuilder primitiveArrayBuilder = (PrimitiveArrayBuilder) obj;
        Intrinsics.h(primitiveArrayBuilder, "<this>");
        return primitiveArrayBuilder.a();
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public final void i(int i, Object obj, Object obj2) {
        Intrinsics.h((PrimitiveArrayBuilder) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(CompositeEncoder compositeEncoder, Object obj, int i);

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        int iD = d(obj);
        PrimitiveArrayDescriptor primitiveArrayDescriptor = this.b;
        CompositeEncoder compositeEncoderX = encoder.x(primitiveArrayDescriptor, iD);
        k(compositeEncoderX, obj, iD);
        compositeEncoderX.c(primitiveArrayDescriptor);
    }
}

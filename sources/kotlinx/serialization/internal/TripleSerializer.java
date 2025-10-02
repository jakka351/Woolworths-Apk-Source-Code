package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/TripleSerializer;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Lkotlin/Triple;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class TripleSerializer<A, B, C> implements KSerializer<Triple<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f24824a;
    public final KSerializer b;
    public final KSerializer c;
    public final SerialDescriptorImpl d = SerialDescriptorsKt.b("kotlin.Triple", new SerialDescriptor[0], new b(this, 2));

    public TripleSerializer(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        this.f24824a = kSerializer;
        this.b = kSerializer2;
        this.c = kSerializer3;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptorImpl serialDescriptorImpl = this.d;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptorImpl);
        Object obj = TuplesKt.f24825a;
        Object objO = obj;
        Object objO2 = objO;
        Object objO3 = objO2;
        while (true) {
            int iU = compositeDecoderB.u(serialDescriptorImpl);
            if (iU == -1) {
                compositeDecoderB.c(serialDescriptorImpl);
                if (objO == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objO2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objO3 != obj) {
                    return new Triple(objO, objO2, objO3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iU == 0) {
                objO = compositeDecoderB.o(serialDescriptorImpl, 0, this.f24824a, null);
            } else if (iU == 1) {
                objO2 = compositeDecoderB.o(serialDescriptorImpl, 1, this.b, null);
            } else {
                if (iU != 2) {
                    throw new SerializationException(YU.a.d(iU, "Unexpected index "));
                }
                objO3 = compositeDecoderB.o(serialDescriptorImpl, 2, this.c, null);
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return this.d;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Triple value = (Triple) obj;
        Intrinsics.h(value, "value");
        SerialDescriptorImpl serialDescriptorImpl = this.d;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptorImpl);
        compositeEncoderB.F(serialDescriptorImpl, 0, this.f24824a, value.d);
        compositeEncoderB.F(serialDescriptorImpl, 1, this.b, value.e);
        compositeEncoderB.F(serialDescriptorImpl, 2, this.c, value.f);
        compositeEncoderB.c(serialDescriptorImpl);
    }
}

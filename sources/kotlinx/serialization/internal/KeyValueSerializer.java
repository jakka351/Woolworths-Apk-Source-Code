package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/KeyValueSerializer;", "K", "V", "R", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/internal/MapEntrySerializer;", "Lkotlinx/serialization/internal/PairSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class KeyValueSerializer<K, V, R> implements KSerializer<R> {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f24801a;
    public final KSerializer b;

    public KeyValueSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f24801a = kSerializer;
        this.b = kSerializer2;
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object c(Object obj, Object obj2);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        Object obj = TuplesKt.f24825a;
        Object objO = obj;
        Object objO2 = objO;
        while (true) {
            int iU = compositeDecoderB.u(getB());
            if (iU == -1) {
                if (objO == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objO2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                Object objC = c(objO, objO2);
                compositeDecoderB.c(b);
                return objC;
            }
            if (iU == 0) {
                objO = compositeDecoderB.o(getB(), 0, this.f24801a, null);
            } else {
                if (iU != 1) {
                    throw new SerializationException(YU.a.d(iU, "Invalid index: "));
                }
                objO2 = compositeDecoderB.o(getB(), 1, this.b, null);
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CompositeEncoder compositeEncoderB = encoder.b(getB());
        compositeEncoderB.F(getB(), 0, this.f24801a, a(obj));
        compositeEncoderB.F(getB(), 1, this.b, b(obj));
        compositeEncoderB.c(getB());
    }
}

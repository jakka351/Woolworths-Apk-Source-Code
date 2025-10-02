package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractPolymorphicSerializer<T> implements KSerializer<T> {
    public DeserializationStrategy a(CompositeDecoder compositeDecoder, String str) {
        return compositeDecoder.getD().d(getF24750a(), str);
    }

    public SerializationStrategy b(Encoder encoder, Object value) {
        Intrinsics.h(value, "value");
        return encoder.getE().e(getF24750a(), value);
    }

    /* renamed from: c */
    public abstract KClass getF24750a();

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor b = getB();
        CompositeDecoder compositeDecoderB = decoder.b(b);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object objO = null;
        while (true) {
            int iU = compositeDecoderB.u(getB());
            if (iU == -1) {
                if (objO != null) {
                    compositeDecoderB.c(b);
                    return objO;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.d)).toString());
            }
            if (iU == 0) {
                objectRef.d = compositeDecoderB.j(getB(), iU);
            } else {
                if (iU != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) objectRef.d;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iU);
                    throw new SerializationException(sb.toString());
                }
                Object obj = objectRef.d;
                if (obj == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                objectRef.d = obj;
                objO = compositeDecoderB.o(getB(), iU, PolymorphicSerializerKt.a(this, compositeDecoderB, (String) obj), null);
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object value) {
        Intrinsics.h(value, "value");
        SerializationStrategy serializationStrategyB = PolymorphicSerializerKt.b(this, encoder, value);
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderB = encoder.b(b);
        compositeEncoderB.p(getB(), 0, serializationStrategyB.getB().getC());
        compositeEncoderB.F(getB(), 1, serializationStrategyB, value);
        compositeEncoderB.c(b);
    }
}

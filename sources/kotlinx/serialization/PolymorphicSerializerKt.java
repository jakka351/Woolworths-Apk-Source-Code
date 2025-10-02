package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.AbstractPolymorphicSerializerKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PolymorphicSerializerKt {
    public static final DeserializationStrategy a(AbstractPolymorphicSerializer abstractPolymorphicSerializer, CompositeDecoder compositeDecoder, String str) {
        Intrinsics.h(abstractPolymorphicSerializer, "<this>");
        DeserializationStrategy deserializationStrategyA = abstractPolymorphicSerializer.a(compositeDecoder, str);
        if (deserializationStrategyA != null) {
            return deserializationStrategyA;
        }
        AbstractPolymorphicSerializerKt.a(abstractPolymorphicSerializer.getF24750a(), str);
        throw null;
    }

    public static final SerializationStrategy b(AbstractPolymorphicSerializer abstractPolymorphicSerializer, Encoder encoder, Object value) {
        Intrinsics.h(abstractPolymorphicSerializer, "<this>");
        Intrinsics.h(value, "value");
        SerializationStrategy serializationStrategyB = abstractPolymorphicSerializer.b(encoder, value);
        if (serializationStrategyB != null) {
            return serializationStrategyB;
        }
        KClass kClassB = Reflection.f24268a.b(value.getClass());
        KClass baseClass = abstractPolymorphicSerializer.getF24750a();
        Intrinsics.h(baseClass, "baseClass");
        String strB = kClassB.B();
        if (strB == null) {
            strB = String.valueOf(kClassB);
        }
        AbstractPolymorphicSerializerKt.a(baseClass, strB);
        throw null;
    }
}

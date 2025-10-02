package kotlinx.serialization.builtins;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuiltinSerializersKt {
    public static final ReferenceArraySerializer a(KClass kClass, KSerializer elementSerializer) {
        Intrinsics.h(kClass, "kClass");
        Intrinsics.h(elementSerializer, "elementSerializer");
        return new ReferenceArraySerializer(kClass, elementSerializer);
    }

    public static final ArrayListSerializer b(KSerializer elementSerializer) {
        Intrinsics.h(elementSerializer, "elementSerializer");
        return new ArrayListSerializer(elementSerializer);
    }

    public static final LinkedHashMapSerializer c(KSerializer keySerializer, KSerializer valueSerializer) {
        Intrinsics.h(keySerializer, "keySerializer");
        Intrinsics.h(valueSerializer, "valueSerializer");
        return new LinkedHashMapSerializer(keySerializer, valueSerializer);
    }

    public static final KSerializer d(KSerializer kSerializer) {
        Intrinsics.h(kSerializer, "<this>");
        return kSerializer.getB().b() ? kSerializer : new NullableSerializer(kSerializer);
    }
}

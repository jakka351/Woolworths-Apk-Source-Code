package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes7.dex */
class TypeDeserializer$$Lambda$4 implements Function1 {
    public static final TypeDeserializer$$Lambda$4 d = new TypeDeserializer$$Lambda$4();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProtoBuf.Type it = (ProtoBuf.Type) obj;
        Intrinsics.h(it, "it");
        return Integer.valueOf(it.g.size());
    }
}

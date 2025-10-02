package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class KClassImpl$getLocalProperty$2$1$1 extends FunctionReferenceImpl implements Function2<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {
    public static final KClassImpl$getLocalProperty$2$1$1 d = new KClassImpl$getLocalProperty$2$1$1(2, MemberDeserializer.class, "loadProperty", "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MemberDeserializer p0 = (MemberDeserializer) obj;
        ProtoBuf.Property p1 = (ProtoBuf.Property) obj2;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        return p0.f(p1);
    }
}

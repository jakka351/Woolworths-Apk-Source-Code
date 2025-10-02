package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ContextAwareKt {
    public static final KClass a(SerialDescriptor serialDescriptor) {
        Intrinsics.h(serialDescriptor, "<this>");
        if (serialDescriptor instanceof ContextDescriptor) {
            return ((ContextDescriptor) serialDescriptor).b;
        }
        if (serialDescriptor instanceof SerialDescriptorForNullable) {
            return a(((SerialDescriptorForNullable) serialDescriptor).f24818a);
        }
        return null;
    }

    public static final SerialDescriptor b(SerialDescriptor descriptor, SerializersModule serializersModule) {
        KSerializer kSerializerB;
        Intrinsics.h(serializersModule, "<this>");
        Intrinsics.h(descriptor, "descriptor");
        KClass kClassA = a(descriptor);
        if (kClassA == null || (kSerializerB = serializersModule.b(kClassA, EmptyList.d)) == null) {
            return null;
        }
        return kSerializerB.getB();
    }

    public static final SerialDescriptor c(SerialDescriptorImpl serialDescriptorImpl, KClass context) {
        Intrinsics.h(context, "context");
        return new ContextDescriptor(serialDescriptorImpl, context);
    }
}

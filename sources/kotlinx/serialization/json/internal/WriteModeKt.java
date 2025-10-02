package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WriteModeKt {
    public static final SerialDescriptor a(SerialDescriptor serialDescriptor, SerializersModule module) {
        SerialDescriptor serialDescriptorA;
        Intrinsics.h(serialDescriptor, "<this>");
        Intrinsics.h(module, "module");
        if (!Intrinsics.c(serialDescriptor.getB(), SerialKind.CONTEXTUAL.f24772a)) {
            return serialDescriptor.getL() ? a(serialDescriptor.d(0), module) : serialDescriptor;
        }
        SerialDescriptor serialDescriptorB = ContextAwareKt.b(serialDescriptor, module);
        return (serialDescriptorB == null || (serialDescriptorA = a(serialDescriptorB, module)) == null) ? serialDescriptor : serialDescriptorA;
    }

    public static final WriteMode b(SerialDescriptor desc, Json json) {
        Intrinsics.h(desc, "desc");
        SerialKind b = desc.getB();
        if (b instanceof PolymorphicKind) {
            return WriteMode.i;
        }
        if (Intrinsics.c(b, StructureKind.LIST.f24775a)) {
            return WriteMode.g;
        }
        if (!Intrinsics.c(b, StructureKind.MAP.f24776a)) {
            return WriteMode.f;
        }
        SerialDescriptor serialDescriptorA = a(desc.d(0), json.b);
        SerialKind b2 = serialDescriptorA.getB();
        if ((b2 instanceof PrimitiveKind) || Intrinsics.c(b2, SerialKind.ENUM.f24773a)) {
            return WriteMode.h;
        }
        throw JsonExceptionsKt.b(serialDescriptorA);
    }
}

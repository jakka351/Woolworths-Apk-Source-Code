package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.b;
import kotlinx.serialization.modules.SerializersModuleCollector;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/PolymorphismValidator;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PolymorphismValidator implements SerializersModuleCollector {

    /* renamed from: a, reason: collision with root package name */
    public final String f24868a;

    public PolymorphismValidator(String discriminator) {
        Intrinsics.h(discriminator, "discriminator");
        this.f24868a = discriminator;
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void a(KClass kClass, Function1 function1) {
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void b(KClass kClass, Function1 function1) {
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void c(KClass kClass, KClass kClass2, KSerializer kSerializer) {
        SerialDescriptor b = kSerializer.getB();
        SerialKind b2 = b.getB();
        if ((b2 instanceof PolymorphicKind) || Intrinsics.c(b2, SerialKind.CONTEXTUAL.f24772a)) {
            throw new IllegalArgumentException("Serializer for " + kClass2.B() + " can't be registered as a subclass for polymorphic serialization because its kind " + b2 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (Intrinsics.c(b2, StructureKind.LIST.f24775a) || Intrinsics.c(b2, StructureKind.MAP.f24776a) || (b2 instanceof PrimitiveKind) || (b2 instanceof SerialKind.ENUM)) {
            throw new IllegalArgumentException("Serializer for " + kClass2.B() + " of kind " + b2 + " cannot be serialized polymorphically with class discriminator.");
        }
        int c = b.getC();
        for (int i = 0; i < c; i++) {
            String strG = b.g(i);
            if (Intrinsics.c(strG, this.f24868a)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass2 + " has property '" + strG + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void d(KClass kClass, KSerializer kSerializer) {
        e(kClass, new b(kSerializer, 3));
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final void e(KClass kClass, Function1 provider) {
        Intrinsics.h(kClass, "kClass");
        Intrinsics.h(provider, "provider");
    }
}

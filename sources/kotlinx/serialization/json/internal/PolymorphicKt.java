package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonElement;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PolymorphicKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ClassDiscriminatorMode classDiscriminatorMode = ClassDiscriminatorMode.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ClassDiscriminatorMode classDiscriminatorMode2 = ClassDiscriminatorMode.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(SerializationStrategy serializationStrategy, SerializationStrategy serializationStrategy2, String str) {
        if (serializationStrategy instanceof SealedClassSerializer) {
            SerialDescriptor b = serializationStrategy2.getB();
            Intrinsics.h(b, "<this>");
            if (Platform_commonKt.a(b).contains(str)) {
                StringBuilder sbV = YU.a.v("Sealed class '", serializationStrategy2.getB().getF24814a(), "' cannot be serialized as base class '", ((SealedClassSerializer) serializationStrategy).getB().getF24814a(), "' because it has property name that conflicts with JSON class discriminator '");
                sbV.append(str);
                sbV.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                throw new IllegalStateException(sbV.toString().toString());
            }
        }
    }

    public static final void b(SerialKind kind) {
        Intrinsics.h(kind, "kind");
        if (kind instanceof SerialKind.ENUM) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof PrimitiveKind) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof PolymorphicKind) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.h(serialDescriptor, "<this>");
        Intrinsics.h(json, "json");
        Iterator it = serialDescriptor.getD().iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof JsonClassDiscriminator) {
                return null;
            }
        }
        return json.f24836a.f;
    }

    public static final void d(String str, JsonElement jsonElement) {
        StringBuilder sbU = YU.a.u("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbU.append(Reflection.f24268a.b(jsonElement.getClass()).B());
        sbU.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new JsonEncodingException(sbU.toString());
    }
}

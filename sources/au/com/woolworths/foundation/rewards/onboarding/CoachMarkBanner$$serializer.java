package au.com.woolworths.foundation.rewards.onboarding;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/foundation/rewards/onboarding/CoachMarkBanner.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/foundation/rewards/onboarding/CoachMarkBanner;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class CoachMarkBanner$$serializer implements GeneratedSerializer<CoachMarkBanner> {

    /* renamed from: a, reason: collision with root package name */
    public static final CoachMarkBanner$$serializer f8631a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CoachMarkBanner$$serializer coachMarkBanner$$serializer = new CoachMarkBanner$$serializer();
        f8631a = coachMarkBanner$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.foundation.rewards.onboarding.CoachMarkBanner", coachMarkBanner$$serializer, 11);
        pluginGeneratedSerialDescriptor.k("bannerId", false);
        pluginGeneratedSerialDescriptor.k("campaignId", true);
        pluginGeneratedSerialDescriptor.k("iconUrl", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("initialActionLabel", false);
        pluginGeneratedSerialDescriptor.k("continueActionLabel", false);
        pluginGeneratedSerialDescriptor.k("coachMarks", false);
        pluginGeneratedSerialDescriptor.k("completed", true);
        pluginGeneratedSerialDescriptor.k("completedReported", true);
        pluginGeneratedSerialDescriptor.k("lastElementId", true);
        pluginGeneratedSerialDescriptor.k("oneOff", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = CoachMarkBanner.l;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.d(stringSerializer), lazyArr[6].getD(), booleanSerializer, booleanSerializer, stringSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = CoachMarkBanner.l;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        String strJ5 = null;
        String str = null;
        List list = null;
        String strJ6 = null;
        int i = 0;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strJ = compositeDecoderB.j(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strJ2 = compositeDecoderB.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strJ3 = compositeDecoderB.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strJ4 = compositeDecoderB.j(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strJ5 = compositeDecoderB.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) compositeDecoderB.k(serialDescriptor, 5, StringSerializer.f24821a, str);
                    i |= 32;
                    break;
                case 6:
                    list = (List) compositeDecoderB.o(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getD(), list);
                    i |= 64;
                    break;
                case 7:
                    zB = compositeDecoderB.B(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    zB2 = compositeDecoderB.B(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    strJ6 = compositeDecoderB.j(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    zB3 = compositeDecoderB.B(serialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new CoachMarkBanner(i, strJ, strJ2, strJ3, strJ4, strJ5, str, list, zB, zB2, strJ6, zB3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CoachMarkBanner value = (CoachMarkBanner) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = CoachMarkBanner.l;
        String str = value.f8630a;
        boolean z = value.k;
        String str2 = value.j;
        boolean z2 = value.i;
        boolean z3 = value.h;
        String str3 = value.b;
        compositeEncoderB.p(serialDescriptor, 0, str);
        if (compositeEncoderB.q(serialDescriptor, 1) || !Intrinsics.c(str3, "")) {
            compositeEncoderB.p(serialDescriptor, 1, str3);
        }
        compositeEncoderB.p(serialDescriptor, 2, value.c);
        compositeEncoderB.p(serialDescriptor, 3, value.d);
        compositeEncoderB.p(serialDescriptor, 4, value.e);
        compositeEncoderB.w(serialDescriptor, 5, StringSerializer.f24821a, value.f);
        compositeEncoderB.F(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getD(), value.g);
        if (compositeEncoderB.q(serialDescriptor, 7) || z3) {
            compositeEncoderB.o(serialDescriptor, 7, z3);
        }
        if (compositeEncoderB.q(serialDescriptor, 8) || z2) {
            compositeEncoderB.o(serialDescriptor, 8, z2);
        }
        if (compositeEncoderB.q(serialDescriptor, 9) || !Intrinsics.c(str2, "")) {
            compositeEncoderB.p(serialDescriptor, 9, str2);
        }
        if (compositeEncoderB.q(serialDescriptor, 10) || z) {
            compositeEncoderB.o(serialDescriptor, 10, z);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/data/SecureDollarsText.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/feature/rewards/redemptionsettings/securitypreferences/data/SecureDollarsText;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class SecureDollarsText$$serializer implements GeneratedSerializer<SecureDollarsText> {

    /* renamed from: a, reason: collision with root package name */
    public static final SecureDollarsText$$serializer f6470a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SecureDollarsText$$serializer secureDollarsText$$serializer = new SecureDollarsText$$serializer();
        f6470a = secureDollarsText$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.data.SecureDollarsText", secureDollarsText$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("loading", true);
        pluginGeneratedSerialDescriptor.k("error", true);
        pluginGeneratedSerialDescriptor.k("success", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        String strJ = null;
        boolean z = true;
        int i = 0;
        String strJ2 = null;
        String strJ3 = null;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                strJ = compositeDecoderB.j(serialDescriptor, 0);
                i |= 1;
            } else if (iU == 1) {
                strJ2 = compositeDecoderB.j(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iU != 2) {
                    throw new UnknownFieldException(iU);
                }
                strJ3 = compositeDecoderB.j(serialDescriptor, 2);
                i |= 4;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new SecureDollarsText(i, strJ, strJ2, strJ3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SecureDollarsText value = (SecureDollarsText) obj;
        Intrinsics.h(value, "value");
        String str = value.c;
        String str2 = value.b;
        String str3 = value.f6469a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        if (compositeEncoderB.q(serialDescriptor, 0) || !Intrinsics.c(str3, "")) {
            compositeEncoderB.p(serialDescriptor, 0, str3);
        }
        if (compositeEncoderB.q(serialDescriptor, 1) || !Intrinsics.c(str2, "")) {
            compositeEncoderB.p(serialDescriptor, 1, str2);
        }
        if (compositeEncoderB.q(serialDescriptor, 2) || !Intrinsics.c(str, "")) {
            compositeEncoderB.p(serialDescriptor, 2, str);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

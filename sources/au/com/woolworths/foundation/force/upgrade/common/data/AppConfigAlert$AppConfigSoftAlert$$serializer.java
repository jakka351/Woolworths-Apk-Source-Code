package au.com.woolworths.foundation.force.upgrade.common.data;

import au.com.woolworths.foundation.force.upgrade.common.data.AppConfigAlert;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert.AppConfigSoftAlert.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/foundation/force/upgrade/common/data/AppConfigAlert$AppConfigSoftAlert;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "force-upgrade-data-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class AppConfigAlert$AppConfigSoftAlert$$serializer implements GeneratedSerializer<AppConfigAlert.AppConfigSoftAlert> {

    /* renamed from: a, reason: collision with root package name */
    public static final AppConfigAlert$AppConfigSoftAlert$$serializer f8495a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AppConfigAlert$AppConfigSoftAlert$$serializer appConfigAlert$AppConfigSoftAlert$$serializer = new AppConfigAlert$AppConfigSoftAlert$$serializer();
        f8495a = appConfigAlert$AppConfigSoftAlert$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.foundation.force.upgrade.common.data.AppConfigAlert.AppConfigSoftAlert", appConfigAlert$AppConfigSoftAlert$$serializer, 4);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("message", false);
        pluginGeneratedSerialDescriptor.k("primaryActionLabel", false);
        pluginGeneratedSerialDescriptor.k("secondaryActionLabel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        boolean z = true;
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
            } else if (iU == 2) {
                strJ3 = compositeDecoderB.j(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iU != 3) {
                    throw new UnknownFieldException(iU);
                }
                strJ4 = compositeDecoderB.j(serialDescriptor, 3);
                i |= 8;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new AppConfigAlert.AppConfigSoftAlert(strJ, i, strJ2, strJ3, strJ4);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        AppConfigAlert.AppConfigSoftAlert value = (AppConfigAlert.AppConfigSoftAlert) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        compositeEncoderB.p(serialDescriptor, 0, value.f8497a);
        compositeEncoderB.p(serialDescriptor, 1, value.b);
        compositeEncoderB.p(serialDescriptor, 2, value.c);
        compositeEncoderB.p(serialDescriptor, 3, value.d);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

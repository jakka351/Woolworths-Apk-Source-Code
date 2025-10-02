package au.com.woolworths.foundation.force.upgrade.data;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/foundation/force/upgrade/data/SoftUpgradeAlertBanner.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/foundation/force/upgrade/data/SoftUpgradeAlertBanner;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class SoftUpgradeAlertBanner$$serializer implements GeneratedSerializer<SoftUpgradeAlertBanner> {

    /* renamed from: a, reason: collision with root package name */
    public static final SoftUpgradeAlertBanner$$serializer f8500a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SoftUpgradeAlertBanner$$serializer softUpgradeAlertBanner$$serializer = new SoftUpgradeAlertBanner$$serializer();
        f8500a = softUpgradeAlertBanner$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.foundation.force.upgrade.data.SoftUpgradeAlertBanner", softUpgradeAlertBanner$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("isSeen", false);
        pluginGeneratedSerialDescriptor.k(MlModel.MODEL_FILE_SUFFIX, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BooleanSerializer.f24779a, UpgradeConfig$$serializer.f8502a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        UpgradeConfig upgradeConfig = null;
        boolean z = true;
        int i = 0;
        boolean zB = false;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                zB = compositeDecoderB.B(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iU != 1) {
                    throw new UnknownFieldException(iU);
                }
                upgradeConfig = (UpgradeConfig) compositeDecoderB.o(serialDescriptor, 1, UpgradeConfig$$serializer.f8502a, upgradeConfig);
                i |= 2;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new SoftUpgradeAlertBanner(i, zB, upgradeConfig);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SoftUpgradeAlertBanner value = (SoftUpgradeAlertBanner) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        compositeEncoderB.o(serialDescriptor, 0, value.f8499a);
        compositeEncoderB.F(serialDescriptor, 1, UpgradeConfig$$serializer.f8502a, value.b);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

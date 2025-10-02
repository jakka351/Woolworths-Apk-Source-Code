package au.com.woolworths.rewards.wearos.base;

import au.com.woolworths.rewards.wearos.base.WearAppContract;
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
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/rewards/wearos/base/WearAppContract.BenefitsData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/rewards/wearos/base/WearAppContract$BenefitsData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class WearAppContract$BenefitsData$$serializer implements GeneratedSerializer<WearAppContract.BenefitsData> {

    /* renamed from: a, reason: collision with root package name */
    public static final WearAppContract$BenefitsData$$serializer f9968a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WearAppContract$BenefitsData$$serializer wearAppContract$BenefitsData$$serializer = new WearAppContract$BenefitsData$$serializer();
        f9968a = wearAppContract$BenefitsData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.rewards.wearos.base.WearAppContract.BenefitsData", wearAppContract$BenefitsData$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("redemption", false);
        pluginGeneratedSerialDescriptor.k("points", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{WearAppContract$ValueCardData$$serializer.f9973a, WearAppContract$PointsData$$serializer.f9971a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        WearAppContract.ValueCardData valueCardData = null;
        boolean z = true;
        int i = 0;
        WearAppContract.PointsData pointsData = null;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                valueCardData = (WearAppContract.ValueCardData) compositeDecoderB.o(serialDescriptor, 0, WearAppContract$ValueCardData$$serializer.f9973a, valueCardData);
                i |= 1;
            } else {
                if (iU != 1) {
                    throw new UnknownFieldException(iU);
                }
                pointsData = (WearAppContract.PointsData) compositeDecoderB.o(serialDescriptor, 1, WearAppContract$PointsData$$serializer.f9971a, pointsData);
                i |= 2;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new WearAppContract.BenefitsData(i, valueCardData, pointsData);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        WearAppContract.BenefitsData value = (WearAppContract.BenefitsData) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        compositeEncoderB.F(serialDescriptor, 0, WearAppContract$ValueCardData$$serializer.f9973a, value.f9974a);
        compositeEncoderB.F(serialDescriptor, 1, WearAppContract$PointsData$$serializer.f9971a, value.b);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

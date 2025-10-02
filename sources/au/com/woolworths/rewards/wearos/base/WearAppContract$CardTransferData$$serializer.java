package au.com.woolworths.rewards.wearos.base;

import au.com.woolworths.rewards.wearos.base.WearAppContract;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/rewards/wearos/base/WearAppContract.CardTransferData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/rewards/wearos/base/WearAppContract$CardTransferData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class WearAppContract$CardTransferData$$serializer implements GeneratedSerializer<WearAppContract.CardTransferData> {

    /* renamed from: a, reason: collision with root package name */
    public static final WearAppContract$CardTransferData$$serializer f9970a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WearAppContract$CardTransferData$$serializer wearAppContract$CardTransferData$$serializer = new WearAppContract$CardTransferData$$serializer();
        f9970a = wearAppContract$CardTransferData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.rewards.wearos.base.WearAppContract.CardTransferData", wearAppContract$CardTransferData$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("rewardsCard", false);
        pluginGeneratedSerialDescriptor.k("message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.d(WearAppContract$CardData$$serializer.f9969a), BuiltinSerializersKt.d(StringSerializer.f24821a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        WearAppContract.CardData cardData = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                cardData = (WearAppContract.CardData) compositeDecoderB.k(serialDescriptor, 0, WearAppContract$CardData$$serializer.f9969a, cardData);
                i |= 1;
            } else {
                if (iU != 1) {
                    throw new UnknownFieldException(iU);
                }
                str = (String) compositeDecoderB.k(serialDescriptor, 1, StringSerializer.f24821a, str);
                i |= 2;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new WearAppContract.CardTransferData(i, cardData, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        WearAppContract.CardTransferData value = (WearAppContract.CardTransferData) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        WearAppContract$CardData$$serializer wearAppContract$CardData$$serializer = WearAppContract$CardData$$serializer.f9969a;
        WearAppContract.CardData cardData = value.f9976a;
        String str = value.b;
        compositeEncoderB.w(serialDescriptor, 0, wearAppContract$CardData$$serializer, cardData);
        if (compositeEncoderB.q(serialDescriptor, 1) || str != null) {
            compositeEncoderB.w(serialDescriptor, 1, StringSerializer.f24821a, str);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

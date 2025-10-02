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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/rewards/wearos/base/WearAppContract.PointsData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/rewards/wearos/base/WearAppContract$PointsData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-rewards-wear_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class WearAppContract$PointsData$$serializer implements GeneratedSerializer<WearAppContract.PointsData> {

    /* renamed from: a, reason: collision with root package name */
    public static final WearAppContract$PointsData$$serializer f9971a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WearAppContract$PointsData$$serializer wearAppContract$PointsData$$serializer = new WearAppContract$PointsData$$serializer();
        f9971a = wearAppContract$PointsData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.rewards.wearos.base.WearAppContract.PointsData", wearAppContract$PointsData$$serializer, 4);
        pluginGeneratedSerialDescriptor.k(AnnotatedPrivateKey.LABEL, false);
        pluginGeneratedSerialDescriptor.k("value", false);
        pluginGeneratedSerialDescriptor.k("currentBalance", false);
        pluginGeneratedSerialDescriptor.k("goalBalance", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        IntSerializer intSerializer = IntSerializer.f24800a;
        return new KSerializer[]{stringSerializer, stringSerializer, intSerializer, intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        int i = 0;
        int iG = 0;
        int iG2 = 0;
        String strJ = null;
        String strJ2 = null;
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
                iG = compositeDecoderB.g(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iU != 3) {
                    throw new UnknownFieldException(iU);
                }
                iG2 = compositeDecoderB.g(serialDescriptor, 3);
                i |= 8;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new WearAppContract.PointsData(i, iG, iG2, strJ, strJ2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        WearAppContract.PointsData value = (WearAppContract.PointsData) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        compositeEncoderB.p(serialDescriptor, 0, value.f9977a);
        compositeEncoderB.p(serialDescriptor, 1, value.b);
        compositeEncoderB.C(2, value.c, serialDescriptor);
        compositeEncoderB.C(3, value.d, serialDescriptor);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

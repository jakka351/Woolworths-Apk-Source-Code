package au.com.woolworths.rewards.base.info;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/rewards/base/info/FeatureInfoBulletItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/rewards/base/info/FeatureInfoBulletItem;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class FeatureInfoBulletItem$$serializer implements GeneratedSerializer<FeatureInfoBulletItem> {

    /* renamed from: a, reason: collision with root package name */
    public static final FeatureInfoBulletItem$$serializer f9370a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FeatureInfoBulletItem$$serializer featureInfoBulletItem$$serializer = new FeatureInfoBulletItem$$serializer();
        f9370a = featureInfoBulletItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FeatureInfoBulletItem", featureInfoBulletItem$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("iconUrl", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("content", false);
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
        int i = 0;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
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
            } else {
                if (iU != 2) {
                    throw new UnknownFieldException(iU);
                }
                strJ3 = compositeDecoderB.j(serialDescriptor, 2);
                i |= 4;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new FeatureInfoBulletItem(i, strJ, strJ2, strJ3, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        FeatureInfoBulletItem value = (FeatureInfoBulletItem) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        FeatureInfoBulletItem.d(value, compositeEncoderB, serialDescriptor);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

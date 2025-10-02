package au.com.woolworths.foundation.force.upgrade.data;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"au/com/woolworths/foundation/force/upgrade/data/UpgradeConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/foundation/force/upgrade/data/UpgradeConfig;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "force-upgrade-api"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class UpgradeConfig$$serializer implements GeneratedSerializer<UpgradeConfig> {

    /* renamed from: a, reason: collision with root package name */
    public static final UpgradeConfig$$serializer f8502a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UpgradeConfig$$serializer upgradeConfig$$serializer = new UpgradeConfig$$serializer();
        f8502a = upgradeConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig", upgradeConfig$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("promptType", false);
        pluginGeneratedSerialDescriptor.k("prompt", false);
        pluginGeneratedSerialDescriptor.k("bffDetails", true);
        pluginGeneratedSerialDescriptor.k("detectedRegion", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UpgradeConfig.f;
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{lazyArr[0].getD(), lazyArr[1].getD(), UpgradePrompt$$serializer.f8504a, BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = UpgradeConfig.f;
        int i = 0;
        UpgradeType upgradeType = null;
        UpgradePromptType upgradePromptType = null;
        UpgradePrompt upgradePrompt = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            if (iU == -1) {
                z = false;
            } else if (iU == 0) {
                upgradeType = (UpgradeType) compositeDecoderB.o(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getD(), upgradeType);
                i |= 1;
            } else if (iU == 1) {
                upgradePromptType = (UpgradePromptType) compositeDecoderB.o(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getD(), upgradePromptType);
                i |= 2;
            } else if (iU == 2) {
                upgradePrompt = (UpgradePrompt) compositeDecoderB.o(serialDescriptor, 2, UpgradePrompt$$serializer.f8504a, upgradePrompt);
                i |= 4;
            } else if (iU == 3) {
                str = (String) compositeDecoderB.k(serialDescriptor, 3, StringSerializer.f24821a, str);
                i |= 8;
            } else {
                if (iU != 4) {
                    throw new UnknownFieldException(iU);
                }
                str2 = (String) compositeDecoderB.k(serialDescriptor, 4, StringSerializer.f24821a, str2);
                i |= 16;
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new UpgradeConfig(i, upgradeType, upgradePromptType, upgradePrompt, str, str2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        UpgradeConfig value = (UpgradeConfig) obj;
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        Lazy[] lazyArr = UpgradeConfig.f;
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[0].getD();
        UpgradeType upgradeType = value.f8501a;
        String str = value.e;
        String str2 = value.d;
        compositeEncoderB.F(serialDescriptor, 0, serializationStrategy, upgradeType);
        compositeEncoderB.F(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getD(), value.b);
        compositeEncoderB.F(serialDescriptor, 2, UpgradePrompt$$serializer.f8504a, value.c);
        if (compositeEncoderB.q(serialDescriptor, 3) || str2 != null) {
            compositeEncoderB.w(serialDescriptor, 3, StringSerializer.f24821a, str2);
        }
        if (compositeEncoderB.q(serialDescriptor, 4) || str != null) {
            compositeEncoderB.w(serialDescriptor, 4, StringSerializer.f24821a, str);
        }
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

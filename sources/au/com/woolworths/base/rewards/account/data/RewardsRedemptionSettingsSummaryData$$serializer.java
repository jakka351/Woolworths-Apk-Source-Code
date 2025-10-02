package au.com.woolworths.base.rewards.account.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.ContentCta$$serializer;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlock;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlock$$serializer;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"au/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsSummaryData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsSummaryData;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes3.dex */
public /* synthetic */ class RewardsRedemptionSettingsSummaryData$$serializer implements GeneratedSerializer<RewardsRedemptionSettingsSummaryData> {
    public static final int $stable;

    @NotNull
    public static final RewardsRedemptionSettingsSummaryData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RewardsRedemptionSettingsSummaryData$$serializer rewardsRedemptionSettingsSummaryData$$serializer = new RewardsRedemptionSettingsSummaryData$$serializer();
        INSTANCE = rewardsRedemptionSettingsSummaryData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsSummaryData", rewardsRedemptionSettingsSummaryData$$serializer, 8);
        pluginGeneratedSerialDescriptor.k(BarcodePickDeserializer.FIELD_ICON, false);
        pluginGeneratedSerialDescriptor.k(AnnotatedPrivateKey.LABEL, false);
        pluginGeneratedSerialDescriptor.k("value", false);
        pluginGeneratedSerialDescriptor.k("altText", false);
        pluginGeneratedSerialDescriptor.k("redemptionUnlock", false);
        pluginGeneratedSerialDescriptor.k("redemptionCoachMark", false);
        pluginGeneratedSerialDescriptor.k("actionUrl", false);
        pluginGeneratedSerialDescriptor.k("contentCta", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RewardsRedemptionSettingsSummaryData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{RewardsRedemptionSettingsSummaryData.$childSerializers[0].getD(), stringSerializer, stringSerializer, BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(RewardsRedemptionUnlock$$serializer.INSTANCE), BuiltinSerializersKt.d(RewardsRedemptionCoachMark$$serializer.INSTANCE), BuiltinSerializersKt.d(stringSerializer), BuiltinSerializersKt.d(ContentCta$$serializer.f4240a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final RewardsRedemptionSettingsSummaryData deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Lazy[] lazyArr = RewardsRedemptionSettingsSummaryData.$childSerializers;
        RewardsRedemptionIcon rewardsRedemptionIcon = null;
        String strJ = null;
        String strJ2 = null;
        String str = null;
        RewardsRedemptionUnlock rewardsRedemptionUnlock = null;
        RewardsRedemptionCoachMark rewardsRedemptionCoachMark = null;
        String str2 = null;
        ContentCta contentCta = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iU = compositeDecoderB.u(serialDescriptor);
            switch (iU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    rewardsRedemptionIcon = (RewardsRedemptionIcon) compositeDecoderB.o(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getD(), rewardsRedemptionIcon);
                    i |= 1;
                    break;
                case 1:
                    strJ = compositeDecoderB.j(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strJ2 = compositeDecoderB.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) compositeDecoderB.k(serialDescriptor, 3, StringSerializer.f24821a, str);
                    i |= 8;
                    break;
                case 4:
                    rewardsRedemptionUnlock = (RewardsRedemptionUnlock) compositeDecoderB.k(serialDescriptor, 4, RewardsRedemptionUnlock$$serializer.INSTANCE, rewardsRedemptionUnlock);
                    i |= 16;
                    break;
                case 5:
                    rewardsRedemptionCoachMark = (RewardsRedemptionCoachMark) compositeDecoderB.k(serialDescriptor, 5, RewardsRedemptionCoachMark$$serializer.INSTANCE, rewardsRedemptionCoachMark);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) compositeDecoderB.k(serialDescriptor, 6, StringSerializer.f24821a, str2);
                    i |= 64;
                    break;
                case 7:
                    contentCta = (ContentCta) compositeDecoderB.k(serialDescriptor, 7, ContentCta$$serializer.f4240a, contentCta);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new RewardsRedemptionSettingsSummaryData(i, rewardsRedemptionIcon, strJ, strJ2, str, rewardsRedemptionUnlock, rewardsRedemptionCoachMark, str2, contentCta, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RewardsRedemptionSettingsSummaryData value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        RewardsRedemptionSettingsSummaryData.write$Self$base_rewards_account_release(value, compositeEncoderB, serialDescriptor);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

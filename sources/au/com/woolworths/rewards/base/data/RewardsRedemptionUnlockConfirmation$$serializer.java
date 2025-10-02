package au.com.woolworths.rewards.base.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.ContentCta$$serializer;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAsset$$serializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"au/com/woolworths/rewards/base/data/RewardsRedemptionUnlockConfirmation.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockConfirmation;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated
/* loaded from: classes4.dex */
public /* synthetic */ class RewardsRedemptionUnlockConfirmation$$serializer implements GeneratedSerializer<RewardsRedemptionUnlockConfirmation> {
    public static final int $stable;

    @NotNull
    public static final RewardsRedemptionUnlockConfirmation$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RewardsRedemptionUnlockConfirmation$$serializer rewardsRedemptionUnlockConfirmation$$serializer = new RewardsRedemptionUnlockConfirmation$$serializer();
        INSTANCE = rewardsRedemptionUnlockConfirmation$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation", rewardsRedemptionUnlockConfirmation$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("iconUrl", false);
        pluginGeneratedSerialDescriptor.k("headerImage", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("content", false);
        pluginGeneratedSerialDescriptor.k("showAnimation", false);
        pluginGeneratedSerialDescriptor.k("button", false);
        pluginGeneratedSerialDescriptor.k("analyticsLabel", false);
        pluginGeneratedSerialDescriptor.k("callToAction", false);
        pluginGeneratedSerialDescriptor.k("secondaryCta", false);
        pluginGeneratedSerialDescriptor.k("showUnlock", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RewardsRedemptionUnlockConfirmation$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f24779a;
        ContentCta$$serializer contentCta$$serializer = ContentCta$$serializer.f4240a;
        KSerializer<?> kSerializerD = BuiltinSerializersKt.d(contentCta$$serializer);
        KSerializer<?> kSerializerD2 = BuiltinSerializersKt.d(contentCta$$serializer);
        KSerializer<?> kSerializerD3 = BuiltinSerializersKt.d(booleanSerializer);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        return new KSerializer[]{stringSerializer, DownloadableAsset$$serializer.f4241a, stringSerializer, stringSerializer, booleanSerializer, RewardsRedemptionUnlockButton$$serializer.INSTANCE, stringSerializer, kSerializerD, kSerializerD2, kSerializerD3};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final RewardsRedemptionUnlockConfirmation deserialize(@NotNull Decoder decoder) {
        Intrinsics.h(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderB = decoder.b(serialDescriptor);
        Boolean bool = null;
        String strJ = null;
        DownloadableAsset downloadableAsset = null;
        String strJ2 = null;
        String strJ3 = null;
        RewardsRedemptionUnlockButton rewardsRedemptionUnlockButton = null;
        String strJ4 = null;
        ContentCta contentCta = null;
        ContentCta contentCta2 = null;
        boolean z = true;
        int i = 0;
        boolean zB = false;
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
                    downloadableAsset = (DownloadableAsset) compositeDecoderB.o(serialDescriptor, 1, DownloadableAsset$$serializer.f4241a, downloadableAsset);
                    i |= 2;
                    break;
                case 2:
                    strJ2 = compositeDecoderB.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strJ3 = compositeDecoderB.j(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zB = compositeDecoderB.B(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    rewardsRedemptionUnlockButton = (RewardsRedemptionUnlockButton) compositeDecoderB.o(serialDescriptor, 5, RewardsRedemptionUnlockButton$$serializer.INSTANCE, rewardsRedemptionUnlockButton);
                    i |= 32;
                    break;
                case 6:
                    strJ4 = compositeDecoderB.j(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    contentCta = (ContentCta) compositeDecoderB.k(serialDescriptor, 7, ContentCta$$serializer.f4240a, contentCta);
                    i |= 128;
                    break;
                case 8:
                    contentCta2 = (ContentCta) compositeDecoderB.k(serialDescriptor, 8, ContentCta$$serializer.f4240a, contentCta2);
                    i |= 256;
                    break;
                case 9:
                    bool = (Boolean) compositeDecoderB.k(serialDescriptor, 9, BooleanSerializer.f24779a, bool);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iU);
            }
        }
        compositeDecoderB.c(serialDescriptor);
        return new RewardsRedemptionUnlockConfirmation(i, strJ, downloadableAsset, strJ2, strJ3, zB, rewardsRedemptionUnlockButton, strJ4, contentCta, contentCta2, bool, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RewardsRedemptionUnlockConfirmation value) {
        Intrinsics.h(encoder, "encoder");
        Intrinsics.h(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderB = encoder.b(serialDescriptor);
        RewardsRedemptionUnlockConfirmation.write$Self$base_rewards_app_release(value, compositeEncoderB, serialDescriptor);
        compositeEncoderB.c(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f24815a;
    }
}

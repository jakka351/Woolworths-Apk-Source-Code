package au.com.woolworths.base.rewards.account.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.ContentCta$$serializer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlock;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlock$$serializer;
import com.google.gson.annotations.SerializedName;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0012HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006;"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsSummaryData;", "", BarcodePickDeserializer.FIELD_ICON, "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;", AnnotatedPrivateKey.LABEL, "", "value", "altText", "redemptionUnlock", "Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlock;", "redemptionCoachMark", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionCoachMark;", "actionUrl", "contentCta", "Lau/com/woolworths/android/onesite/data/ContentCta;", "<init>", "(Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlock;Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionCoachMark;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlock;Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionCoachMark;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIcon", "()Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;", "getLabel", "()Ljava/lang/String;", "getValue", "getAltText", "getRedemptionUnlock", "()Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlock;", "getRedemptionCoachMark", "()Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionCoachMark;", "getActionUrl", "getContentCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$base_rewards_account_release", "$serializer", "Companion", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class RewardsRedemptionSettingsSummaryData {

    @SerializedName("actionUrl")
    @Nullable
    private final String actionUrl;

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName("contentCta")
    @Nullable
    private final ContentCta contentCta;

    @SerializedName("redemptionIcon")
    @MappedName
    @NotNull
    private final RewardsRedemptionIcon icon;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    @SerializedName("redemptionCoachMark")
    @Nullable
    private final RewardsRedemptionCoachMark redemptionCoachMark;

    @SerializedName("redemptionUnlock")
    @Nullable
    private final RewardsRedemptionUnlock redemptionUnlock;

    @SerializedName("value")
    @NotNull
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    @NotNull
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.a(LazyThreadSafetyMode.d, new h(10)), null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsSummaryData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsSummaryData;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RewardsRedemptionSettingsSummaryData> serializer() {
            return RewardsRedemptionSettingsSummaryData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RewardsRedemptionSettingsSummaryData(int i, RewardsRedemptionIcon rewardsRedemptionIcon, String str, String str2, String str3, RewardsRedemptionUnlock rewardsRedemptionUnlock, RewardsRedemptionCoachMark rewardsRedemptionCoachMark, String str4, ContentCta contentCta, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.a(i, 255, RewardsRedemptionSettingsSummaryData$$serializer.INSTANCE.getB());
            throw null;
        }
        this.icon = rewardsRedemptionIcon;
        this.label = str;
        this.value = str2;
        this.altText = str3;
        this.redemptionUnlock = rewardsRedemptionUnlock;
        this.redemptionCoachMark = rewardsRedemptionCoachMark;
        this.actionUrl = str4;
        this.contentCta = contentCta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return EnumsKt.b(RewardsRedemptionIcon.values(), "au.com.woolworths.base.rewards.account.data.RewardsRedemptionIcon");
    }

    public static /* synthetic */ RewardsRedemptionSettingsSummaryData copy$default(RewardsRedemptionSettingsSummaryData rewardsRedemptionSettingsSummaryData, RewardsRedemptionIcon rewardsRedemptionIcon, String str, String str2, String str3, RewardsRedemptionUnlock rewardsRedemptionUnlock, RewardsRedemptionCoachMark rewardsRedemptionCoachMark, String str4, ContentCta contentCta, int i, Object obj) {
        if ((i & 1) != 0) {
            rewardsRedemptionIcon = rewardsRedemptionSettingsSummaryData.icon;
        }
        if ((i & 2) != 0) {
            str = rewardsRedemptionSettingsSummaryData.label;
        }
        if ((i & 4) != 0) {
            str2 = rewardsRedemptionSettingsSummaryData.value;
        }
        if ((i & 8) != 0) {
            str3 = rewardsRedemptionSettingsSummaryData.altText;
        }
        if ((i & 16) != 0) {
            rewardsRedemptionUnlock = rewardsRedemptionSettingsSummaryData.redemptionUnlock;
        }
        if ((i & 32) != 0) {
            rewardsRedemptionCoachMark = rewardsRedemptionSettingsSummaryData.redemptionCoachMark;
        }
        if ((i & 64) != 0) {
            str4 = rewardsRedemptionSettingsSummaryData.actionUrl;
        }
        if ((i & 128) != 0) {
            contentCta = rewardsRedemptionSettingsSummaryData.contentCta;
        }
        String str5 = str4;
        ContentCta contentCta2 = contentCta;
        RewardsRedemptionUnlock rewardsRedemptionUnlock2 = rewardsRedemptionUnlock;
        RewardsRedemptionCoachMark rewardsRedemptionCoachMark2 = rewardsRedemptionCoachMark;
        return rewardsRedemptionSettingsSummaryData.copy(rewardsRedemptionIcon, str, str2, str3, rewardsRedemptionUnlock2, rewardsRedemptionCoachMark2, str5, contentCta2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$base_rewards_account_release(RewardsRedemptionSettingsSummaryData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.F(serialDesc, 0, (SerializationStrategy) $childSerializers[0].getD(), self.icon);
        output.p(serialDesc, 1, self.label);
        output.p(serialDesc, 2, self.value);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        output.w(serialDesc, 3, stringSerializer, self.altText);
        output.w(serialDesc, 4, RewardsRedemptionUnlock$$serializer.INSTANCE, self.redemptionUnlock);
        output.w(serialDesc, 5, RewardsRedemptionCoachMark$$serializer.INSTANCE, self.redemptionCoachMark);
        output.w(serialDesc, 6, stringSerializer, self.actionUrl);
        output.w(serialDesc, 7, ContentCta$$serializer.f4240a, self.contentCta);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RewardsRedemptionIcon getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final RewardsRedemptionUnlock getRedemptionUnlock() {
        return this.redemptionUnlock;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final RewardsRedemptionCoachMark getRedemptionCoachMark() {
        return this.redemptionCoachMark;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getActionUrl() {
        return this.actionUrl;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final ContentCta getContentCta() {
        return this.contentCta;
    }

    @NotNull
    public final RewardsRedemptionSettingsSummaryData copy(@NotNull RewardsRedemptionIcon icon, @NotNull String label, @NotNull String value, @Nullable String altText, @Nullable RewardsRedemptionUnlock redemptionUnlock, @Nullable RewardsRedemptionCoachMark redemptionCoachMark, @Nullable String actionUrl, @Nullable ContentCta contentCta) {
        Intrinsics.h(icon, "icon");
        Intrinsics.h(label, "label");
        Intrinsics.h(value, "value");
        return new RewardsRedemptionSettingsSummaryData(icon, label, value, altText, redemptionUnlock, redemptionCoachMark, actionUrl, contentCta);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsRedemptionSettingsSummaryData)) {
            return false;
        }
        RewardsRedemptionSettingsSummaryData rewardsRedemptionSettingsSummaryData = (RewardsRedemptionSettingsSummaryData) other;
        return this.icon == rewardsRedemptionSettingsSummaryData.icon && Intrinsics.c(this.label, rewardsRedemptionSettingsSummaryData.label) && Intrinsics.c(this.value, rewardsRedemptionSettingsSummaryData.value) && Intrinsics.c(this.altText, rewardsRedemptionSettingsSummaryData.altText) && Intrinsics.c(this.redemptionUnlock, rewardsRedemptionSettingsSummaryData.redemptionUnlock) && Intrinsics.c(this.redemptionCoachMark, rewardsRedemptionSettingsSummaryData.redemptionCoachMark) && Intrinsics.c(this.actionUrl, rewardsRedemptionSettingsSummaryData.actionUrl) && Intrinsics.c(this.contentCta, rewardsRedemptionSettingsSummaryData.contentCta);
    }

    @Nullable
    public final String getActionUrl() {
        return this.actionUrl;
    }

    @Nullable
    public final String getAltText() {
        return this.altText;
    }

    @Nullable
    public final ContentCta getContentCta() {
        return this.contentCta;
    }

    @NotNull
    public final RewardsRedemptionIcon getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final RewardsRedemptionCoachMark getRedemptionCoachMark() {
        return this.redemptionCoachMark;
    }

    @Nullable
    public final RewardsRedemptionUnlock getRedemptionUnlock() {
        return this.redemptionUnlock;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iC = b.c(b.c(this.icon.hashCode() * 31, 31, this.label), 31, this.value);
        String str = this.altText;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        RewardsRedemptionUnlock rewardsRedemptionUnlock = this.redemptionUnlock;
        int iHashCode2 = (iHashCode + (rewardsRedemptionUnlock == null ? 0 : rewardsRedemptionUnlock.hashCode())) * 31;
        RewardsRedemptionCoachMark rewardsRedemptionCoachMark = this.redemptionCoachMark;
        int iHashCode3 = (iHashCode2 + (rewardsRedemptionCoachMark == null ? 0 : rewardsRedemptionCoachMark.hashCode())) * 31;
        String str2 = this.actionUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ContentCta contentCta = this.contentCta;
        return iHashCode4 + (contentCta != null ? contentCta.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        RewardsRedemptionIcon rewardsRedemptionIcon = this.icon;
        String str = this.label;
        String str2 = this.value;
        String str3 = this.altText;
        RewardsRedemptionUnlock rewardsRedemptionUnlock = this.redemptionUnlock;
        RewardsRedemptionCoachMark rewardsRedemptionCoachMark = this.redemptionCoachMark;
        String str4 = this.actionUrl;
        ContentCta contentCta = this.contentCta;
        StringBuilder sb = new StringBuilder("RewardsRedemptionSettingsSummaryData(icon=");
        sb.append(rewardsRedemptionIcon);
        sb.append(", label=");
        sb.append(str);
        sb.append(", value=");
        a.B(sb, str2, ", altText=", str3, ", redemptionUnlock=");
        sb.append(rewardsRedemptionUnlock);
        sb.append(", redemptionCoachMark=");
        sb.append(rewardsRedemptionCoachMark);
        sb.append(", actionUrl=");
        sb.append(str4);
        sb.append(", contentCta=");
        sb.append(contentCta);
        sb.append(")");
        return sb.toString();
    }

    public RewardsRedemptionSettingsSummaryData(@NotNull RewardsRedemptionIcon icon, @NotNull String label, @NotNull String value, @Nullable String str, @Nullable RewardsRedemptionUnlock rewardsRedemptionUnlock, @Nullable RewardsRedemptionCoachMark rewardsRedemptionCoachMark, @Nullable String str2, @Nullable ContentCta contentCta) {
        Intrinsics.h(icon, "icon");
        Intrinsics.h(label, "label");
        Intrinsics.h(value, "value");
        this.icon = icon;
        this.label = label;
        this.value = value;
        this.altText = str;
        this.redemptionUnlock = rewardsRedemptionUnlock;
        this.redemptionCoachMark = rewardsRedemptionCoachMark;
        this.actionUrl = str2;
        this.contentCta = contentCta;
    }
}

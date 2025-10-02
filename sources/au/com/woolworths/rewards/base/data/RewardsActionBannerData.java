package au.com.woolworths.rewards.base.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.ContentCta$$serializer;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent$$serializer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000201B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u000fHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsActionBannerData;", "", "swrveCampaignCode", "", "iconUrl", "title", "primaryCta", "Lau/com/woolworths/android/onesite/data/ContentCta;", "dismissWhenActioned", "", "coachMark", "Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;ZLau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;ZLau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSwrveCampaignCode", "()Ljava/lang/String;", "getIconUrl", "getTitle", "getPrimaryCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "getDismissWhenActioned", "()Z", "getCoachMark", "()Lau/com/woolworths/foundation/rewards/onboarding/ProgressiveCoachMarkContent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$base_rewards_app_release", "Companion", "$serializer", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class RewardsActionBannerData {

    @NotNull
    private static final RewardsActionBannerData empty;

    @Nullable
    private final ProgressiveCoachMarkContent coachMark;
    private final boolean dismissWhenActioned;

    @NotNull
    private final String iconUrl;

    @NotNull
    private final ContentCta primaryCta;

    @NotNull
    private final String swrveCampaignCode;

    @NotNull
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsActionBannerData$Companion;", "", "<init>", "()V", "empty", "Lau/com/woolworths/rewards/base/data/RewardsActionBannerData;", "getEmpty", "()Lau/com/woolworths/rewards/base/data/RewardsActionBannerData;", "serializer", "Lkotlinx/serialization/KSerializer;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RewardsActionBannerData getEmpty() {
            return RewardsActionBannerData.empty;
        }

        @NotNull
        public final KSerializer<RewardsActionBannerData> serializer() {
            return RewardsActionBannerData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        String str = "";
        String str2 = "";
        String str3 = "";
        empty = new RewardsActionBannerData(str, str2, str3, new ContentCta("", "", (String) null, (Boolean) null, (AnalyticsData) null, 28, (DefaultConstructorMarker) null), false, (ProgressiveCoachMarkContent) null, 48, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ RewardsActionBannerData(int i, String str, String str2, String str3, ContentCta contentCta, boolean z, ProgressiveCoachMarkContent progressiveCoachMarkContent, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.a(i, 14, RewardsActionBannerData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.swrveCampaignCode = (i & 1) == 0 ? "" : str;
        this.iconUrl = str2;
        this.title = str3;
        this.primaryCta = contentCta;
        if ((i & 16) == 0) {
            this.dismissWhenActioned = false;
        } else {
            this.dismissWhenActioned = z;
        }
        if ((i & 32) == 0) {
            this.coachMark = null;
        } else {
            this.coachMark = progressiveCoachMarkContent;
        }
    }

    public static /* synthetic */ RewardsActionBannerData copy$default(RewardsActionBannerData rewardsActionBannerData, String str, String str2, String str3, ContentCta contentCta, boolean z, ProgressiveCoachMarkContent progressiveCoachMarkContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsActionBannerData.swrveCampaignCode;
        }
        if ((i & 2) != 0) {
            str2 = rewardsActionBannerData.iconUrl;
        }
        if ((i & 4) != 0) {
            str3 = rewardsActionBannerData.title;
        }
        if ((i & 8) != 0) {
            contentCta = rewardsActionBannerData.primaryCta;
        }
        if ((i & 16) != 0) {
            z = rewardsActionBannerData.dismissWhenActioned;
        }
        if ((i & 32) != 0) {
            progressiveCoachMarkContent = rewardsActionBannerData.coachMark;
        }
        boolean z2 = z;
        ProgressiveCoachMarkContent progressiveCoachMarkContent2 = progressiveCoachMarkContent;
        return rewardsActionBannerData.copy(str, str2, str3, contentCta, z2, progressiveCoachMarkContent2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$base_rewards_app_release(RewardsActionBannerData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.q(serialDesc, 0) || !Intrinsics.c(self.swrveCampaignCode, "")) {
            output.p(serialDesc, 0, self.swrveCampaignCode);
        }
        output.p(serialDesc, 1, self.iconUrl);
        output.p(serialDesc, 2, self.title);
        output.F(serialDesc, 3, ContentCta$$serializer.f4240a, self.primaryCta);
        if (output.q(serialDesc, 4) || self.dismissWhenActioned) {
            output.o(serialDesc, 4, self.dismissWhenActioned);
        }
        if (!output.q(serialDesc, 5) && self.coachMark == null) {
            return;
        }
        output.w(serialDesc, 5, ProgressiveCoachMarkContent$$serializer.f8633a, self.coachMark);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSwrveCampaignCode() {
        return this.swrveCampaignCode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ContentCta getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDismissWhenActioned() {
        return this.dismissWhenActioned;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ProgressiveCoachMarkContent getCoachMark() {
        return this.coachMark;
    }

    @NotNull
    public final RewardsActionBannerData copy(@NotNull String swrveCampaignCode, @NotNull String iconUrl, @NotNull String title, @NotNull ContentCta primaryCta, boolean dismissWhenActioned, @Nullable ProgressiveCoachMarkContent coachMark) {
        Intrinsics.h(swrveCampaignCode, "swrveCampaignCode");
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(primaryCta, "primaryCta");
        return new RewardsActionBannerData(swrveCampaignCode, iconUrl, title, primaryCta, dismissWhenActioned, coachMark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsActionBannerData)) {
            return false;
        }
        RewardsActionBannerData rewardsActionBannerData = (RewardsActionBannerData) other;
        return Intrinsics.c(this.swrveCampaignCode, rewardsActionBannerData.swrveCampaignCode) && Intrinsics.c(this.iconUrl, rewardsActionBannerData.iconUrl) && Intrinsics.c(this.title, rewardsActionBannerData.title) && Intrinsics.c(this.primaryCta, rewardsActionBannerData.primaryCta) && this.dismissWhenActioned == rewardsActionBannerData.dismissWhenActioned && Intrinsics.c(this.coachMark, rewardsActionBannerData.coachMark);
    }

    @Nullable
    public final ProgressiveCoachMarkContent getCoachMark() {
        return this.coachMark;
    }

    public final boolean getDismissWhenActioned() {
        return this.dismissWhenActioned;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final ContentCta getPrimaryCta() {
        return this.primaryCta;
    }

    @NotNull
    public final String getSwrveCampaignCode() {
        return this.swrveCampaignCode;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE = b.e((this.primaryCta.hashCode() + b.c(b.c(this.swrveCampaignCode.hashCode() * 31, 31, this.iconUrl), 31, this.title)) * 31, 31, this.dismissWhenActioned);
        ProgressiveCoachMarkContent progressiveCoachMarkContent = this.coachMark;
        return iE + (progressiveCoachMarkContent == null ? 0 : progressiveCoachMarkContent.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.swrveCampaignCode;
        String str2 = this.iconUrl;
        String str3 = this.title;
        ContentCta contentCta = this.primaryCta;
        boolean z = this.dismissWhenActioned;
        ProgressiveCoachMarkContent progressiveCoachMarkContent = this.coachMark;
        StringBuilder sbV = a.v("RewardsActionBannerData(swrveCampaignCode=", str, ", iconUrl=", str2, ", title=");
        sbV.append(str3);
        sbV.append(", primaryCta=");
        sbV.append(contentCta);
        sbV.append(", dismissWhenActioned=");
        sbV.append(z);
        sbV.append(", coachMark=");
        sbV.append(progressiveCoachMarkContent);
        sbV.append(")");
        return sbV.toString();
    }

    public RewardsActionBannerData(@NotNull String swrveCampaignCode, @NotNull String iconUrl, @NotNull String title, @NotNull ContentCta primaryCta, boolean z, @Nullable ProgressiveCoachMarkContent progressiveCoachMarkContent) {
        Intrinsics.h(swrveCampaignCode, "swrveCampaignCode");
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(primaryCta, "primaryCta");
        this.swrveCampaignCode = swrveCampaignCode;
        this.iconUrl = iconUrl;
        this.title = title;
        this.primaryCta = primaryCta;
        this.dismissWhenActioned = z;
        this.coachMark = progressiveCoachMarkContent;
    }

    public /* synthetic */ RewardsActionBannerData(String str, String str2, String str3, ContentCta contentCta, boolean z, ProgressiveCoachMarkContent progressiveCoachMarkContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, str3, contentCta, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : progressiveCoachMarkContent);
    }
}

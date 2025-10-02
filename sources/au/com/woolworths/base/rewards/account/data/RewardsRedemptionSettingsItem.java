package au.com.woolworths.base.rewards.account.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\f\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsItem;", "", "isSelected", "", BarcodePickDeserializer.FIELD_ICON, "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;", "title", "", "body", "confirmationMessages", "", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingMessage;", "isChangeEnabled", "cta", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingCta;", "<init>", "(ZLau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingCta;)V", "()Z", "getIcon", "()Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;", "getTitle", "()Ljava/lang/String;", "getBody", "getConfirmationMessages", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCta", "()Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingCta;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingCta;)Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingsItem;", "equals", "other", "hashCode", "", "toString", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsRedemptionSettingsItem {
    public static final int $stable = 8;

    @SerializedName("body")
    @NotNull
    private final String body;

    @SerializedName("confirmationMessages")
    @Nullable
    private final List<RewardsRedemptionSettingMessage> confirmationMessages;

    @SerializedName("cta")
    @Nullable
    private final RewardsRedemptionSettingCta cta;

    @SerializedName(BarcodePickDeserializer.FIELD_ICON)
    @NotNull
    private final RewardsRedemptionIcon icon;

    @SerializedName("isChangeEnabled")
    @Nullable
    private final Boolean isChangeEnabled;

    @SerializedName("isSelected")
    private final boolean isSelected;

    @SerializedName("title")
    @NotNull
    private final String title;

    public RewardsRedemptionSettingsItem(boolean z, @NotNull RewardsRedemptionIcon icon, @NotNull String title, @NotNull String body, @Nullable List<RewardsRedemptionSettingMessage> list, @Nullable Boolean bool, @Nullable RewardsRedemptionSettingCta rewardsRedemptionSettingCta) {
        Intrinsics.h(icon, "icon");
        Intrinsics.h(title, "title");
        Intrinsics.h(body, "body");
        this.isSelected = z;
        this.icon = icon;
        this.title = title;
        this.body = body;
        this.confirmationMessages = list;
        this.isChangeEnabled = bool;
        this.cta = rewardsRedemptionSettingCta;
    }

    public static /* synthetic */ RewardsRedemptionSettingsItem copy$default(RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem, boolean z, RewardsRedemptionIcon rewardsRedemptionIcon, String str, String str2, List list, Boolean bool, RewardsRedemptionSettingCta rewardsRedemptionSettingCta, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rewardsRedemptionSettingsItem.isSelected;
        }
        if ((i & 2) != 0) {
            rewardsRedemptionIcon = rewardsRedemptionSettingsItem.icon;
        }
        if ((i & 4) != 0) {
            str = rewardsRedemptionSettingsItem.title;
        }
        if ((i & 8) != 0) {
            str2 = rewardsRedemptionSettingsItem.body;
        }
        if ((i & 16) != 0) {
            list = rewardsRedemptionSettingsItem.confirmationMessages;
        }
        if ((i & 32) != 0) {
            bool = rewardsRedemptionSettingsItem.isChangeEnabled;
        }
        if ((i & 64) != 0) {
            rewardsRedemptionSettingCta = rewardsRedemptionSettingsItem.cta;
        }
        Boolean bool2 = bool;
        RewardsRedemptionSettingCta rewardsRedemptionSettingCta2 = rewardsRedemptionSettingCta;
        List list2 = list;
        String str3 = str;
        return rewardsRedemptionSettingsItem.copy(z, rewardsRedemptionIcon, str3, str2, list2, bool2, rewardsRedemptionSettingCta2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RewardsRedemptionIcon getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final List<RewardsRedemptionSettingMessage> component5() {
        return this.confirmationMessages;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsChangeEnabled() {
        return this.isChangeEnabled;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final RewardsRedemptionSettingCta getCta() {
        return this.cta;
    }

    @NotNull
    public final RewardsRedemptionSettingsItem copy(boolean isSelected, @NotNull RewardsRedemptionIcon icon, @NotNull String title, @NotNull String body, @Nullable List<RewardsRedemptionSettingMessage> confirmationMessages, @Nullable Boolean isChangeEnabled, @Nullable RewardsRedemptionSettingCta cta) {
        Intrinsics.h(icon, "icon");
        Intrinsics.h(title, "title");
        Intrinsics.h(body, "body");
        return new RewardsRedemptionSettingsItem(isSelected, icon, title, body, confirmationMessages, isChangeEnabled, cta);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsRedemptionSettingsItem)) {
            return false;
        }
        RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem = (RewardsRedemptionSettingsItem) other;
        return this.isSelected == rewardsRedemptionSettingsItem.isSelected && this.icon == rewardsRedemptionSettingsItem.icon && Intrinsics.c(this.title, rewardsRedemptionSettingsItem.title) && Intrinsics.c(this.body, rewardsRedemptionSettingsItem.body) && Intrinsics.c(this.confirmationMessages, rewardsRedemptionSettingsItem.confirmationMessages) && Intrinsics.c(this.isChangeEnabled, rewardsRedemptionSettingsItem.isChangeEnabled) && Intrinsics.c(this.cta, rewardsRedemptionSettingsItem.cta);
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final List<RewardsRedemptionSettingMessage> getConfirmationMessages() {
        return this.confirmationMessages;
    }

    @Nullable
    public final RewardsRedemptionSettingCta getCta() {
        return this.cta;
    }

    @NotNull
    public final RewardsRedemptionIcon getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = b.c(b.c((this.icon.hashCode() + (Boolean.hashCode(this.isSelected) * 31)) * 31, 31, this.title), 31, this.body);
        List<RewardsRedemptionSettingMessage> list = this.confirmationMessages;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isChangeEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        RewardsRedemptionSettingCta rewardsRedemptionSettingCta = this.cta;
        return iHashCode2 + (rewardsRedemptionSettingCta != null ? rewardsRedemptionSettingCta.hashCode() : 0);
    }

    @Nullable
    public final Boolean isChangeEnabled() {
        return this.isChangeEnabled;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        boolean z = this.isSelected;
        RewardsRedemptionIcon rewardsRedemptionIcon = this.icon;
        String str = this.title;
        String str2 = this.body;
        List<RewardsRedemptionSettingMessage> list = this.confirmationMessages;
        Boolean bool = this.isChangeEnabled;
        RewardsRedemptionSettingCta rewardsRedemptionSettingCta = this.cta;
        StringBuilder sb = new StringBuilder("RewardsRedemptionSettingsItem(isSelected=");
        sb.append(z);
        sb.append(", icon=");
        sb.append(rewardsRedemptionIcon);
        sb.append(", title=");
        a.B(sb, str, ", body=", str2, ", confirmationMessages=");
        sb.append(list);
        sb.append(", isChangeEnabled=");
        sb.append(bool);
        sb.append(", cta=");
        sb.append(rewardsRedemptionSettingCta);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ RewardsRedemptionSettingsItem(boolean z, RewardsRedemptionIcon rewardsRedemptionIcon, String str, String str2, List list, Boolean bool, RewardsRedemptionSettingCta rewardsRedemptionSettingCta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, rewardsRedemptionIcon, str, str2, list, bool, (i & 64) != 0 ? null : rewardsRedemptionSettingCta);
    }
}

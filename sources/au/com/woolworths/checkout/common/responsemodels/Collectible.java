package au.com.woolworths.checkout.common.responsemodels;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014¨\u0006\""}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/Collectible;", "", "campaignId", "", "brandLabel", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "thumbnailUrl", "learnMoreText", "isOptedIn", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCampaignId", "()Ljava/lang/String;", "getBrandLabel", "getTitle", "getSubtitle", "getThumbnailUrl", "getLearnMoreText", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Collectible {

    @SerializedName("Label")
    @NotNull
    private final String brandLabel;

    @SerializedName("Id")
    @NotNull
    private final String campaignId;

    @SerializedName("IsOpted")
    private final boolean isOptedIn;

    @SerializedName("Message")
    @NotNull
    private final String learnMoreText;

    @SerializedName("SubTitle")
    @NotNull
    private final String subtitle;

    @SerializedName("ImagePath")
    @NotNull
    private final String thumbnailUrl;

    @SerializedName("Title")
    @NotNull
    private final String title;

    public Collectible(@NotNull String campaignId, @NotNull String brandLabel, @NotNull String title, @NotNull String subtitle, @NotNull String thumbnailUrl, @NotNull String learnMoreText, boolean z) {
        Intrinsics.h(campaignId, "campaignId");
        Intrinsics.h(brandLabel, "brandLabel");
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(thumbnailUrl, "thumbnailUrl");
        Intrinsics.h(learnMoreText, "learnMoreText");
        this.campaignId = campaignId;
        this.brandLabel = brandLabel;
        this.title = title;
        this.subtitle = subtitle;
        this.thumbnailUrl = thumbnailUrl;
        this.learnMoreText = learnMoreText;
        this.isOptedIn = z;
    }

    public static /* synthetic */ Collectible copy$default(Collectible collectible, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = collectible.campaignId;
        }
        if ((i & 2) != 0) {
            str2 = collectible.brandLabel;
        }
        if ((i & 4) != 0) {
            str3 = collectible.title;
        }
        if ((i & 8) != 0) {
            str4 = collectible.subtitle;
        }
        if ((i & 16) != 0) {
            str5 = collectible.thumbnailUrl;
        }
        if ((i & 32) != 0) {
            str6 = collectible.learnMoreText;
        }
        if ((i & 64) != 0) {
            z = collectible.isOptedIn;
        }
        String str7 = str6;
        boolean z2 = z;
        String str8 = str5;
        String str9 = str3;
        return collectible.copy(str, str2, str9, str4, str8, str7, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBrandLabel() {
        return this.brandLabel;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getLearnMoreText() {
        return this.learnMoreText;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsOptedIn() {
        return this.isOptedIn;
    }

    @NotNull
    public final Collectible copy(@NotNull String campaignId, @NotNull String brandLabel, @NotNull String title, @NotNull String subtitle, @NotNull String thumbnailUrl, @NotNull String learnMoreText, boolean isOptedIn) {
        Intrinsics.h(campaignId, "campaignId");
        Intrinsics.h(brandLabel, "brandLabel");
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(thumbnailUrl, "thumbnailUrl");
        Intrinsics.h(learnMoreText, "learnMoreText");
        return new Collectible(campaignId, brandLabel, title, subtitle, thumbnailUrl, learnMoreText, isOptedIn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Collectible)) {
            return false;
        }
        Collectible collectible = (Collectible) other;
        return Intrinsics.c(this.campaignId, collectible.campaignId) && Intrinsics.c(this.brandLabel, collectible.brandLabel) && Intrinsics.c(this.title, collectible.title) && Intrinsics.c(this.subtitle, collectible.subtitle) && Intrinsics.c(this.thumbnailUrl, collectible.thumbnailUrl) && Intrinsics.c(this.learnMoreText, collectible.learnMoreText) && this.isOptedIn == collectible.isOptedIn;
    }

    @NotNull
    public final String getBrandLabel() {
        return this.brandLabel;
    }

    @NotNull
    public final String getCampaignId() {
        return this.campaignId;
    }

    @NotNull
    public final String getLearnMoreText() {
        return this.learnMoreText;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOptedIn) + b.c(b.c(b.c(b.c(b.c(this.campaignId.hashCode() * 31, 31, this.brandLabel), 31, this.title), 31, this.subtitle), 31, this.thumbnailUrl), 31, this.learnMoreText);
    }

    public final boolean isOptedIn() {
        return this.isOptedIn;
    }

    @NotNull
    public String toString() {
        String str = this.campaignId;
        String str2 = this.brandLabel;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.thumbnailUrl;
        String str6 = this.learnMoreText;
        boolean z = this.isOptedIn;
        StringBuilder sbV = a.v("Collectible(campaignId=", str, ", brandLabel=", str2, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", subtitle=", str4, ", thumbnailUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", learnMoreText=", str6, ", isOptedIn=");
        return a.k(")", sbV, z);
    }
}

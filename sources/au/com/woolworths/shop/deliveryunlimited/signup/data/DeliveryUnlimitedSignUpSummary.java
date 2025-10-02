package au.com.woolworths.shop.deliveryunlimited.signup.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpSummary;", "", "", "title", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "bannerAsset", "Lau/com/woolworths/base/shopapp/modules/badge/BadgeApiData;", "badge", "", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpLandingFeature;", "features", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;", "footer", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTermsMarkdown;", "termsMarkdown", "<init>", "(Ljava/lang/String;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Lau/com/woolworths/base/shopapp/modules/badge/BadgeApiData;Ljava/util/List;Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTermsMarkdown;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "b", "()Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "Lau/com/woolworths/base/shopapp/modules/badge/BadgeApiData;", "a", "()Lau/com/woolworths/base/shopapp/modules/badge/BadgeApiData;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;", "d", "()Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTermsMarkdown;", "e", "()Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTermsMarkdown;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSignUpSummary {

    @SerializedName("badge")
    @Nullable
    private final BadgeApiData badge;

    @SerializedName("bannerAsset")
    @Nullable
    private final DownloadableAsset bannerAsset;

    @SerializedName("features")
    @NotNull
    private final List<DeliveryUnlimitedSignUpLandingFeature> features;

    @SerializedName("footer")
    @NotNull
    private final DeliveryUnlimitedSignUpFooter footer;

    @SerializedName("termsMarkdown")
    @Nullable
    private final DeliveryUnlimitedSubscribeTermsMarkdown termsMarkdown;

    @SerializedName("title")
    @NotNull
    private final String title;

    public DeliveryUnlimitedSignUpSummary(@NotNull String title, @Nullable DownloadableAsset downloadableAsset, @Nullable BadgeApiData badgeApiData, @NotNull List<DeliveryUnlimitedSignUpLandingFeature> features, @NotNull DeliveryUnlimitedSignUpFooter footer, @Nullable DeliveryUnlimitedSubscribeTermsMarkdown deliveryUnlimitedSubscribeTermsMarkdown) {
        Intrinsics.h(title, "title");
        Intrinsics.h(features, "features");
        Intrinsics.h(footer, "footer");
        this.title = title;
        this.bannerAsset = downloadableAsset;
        this.badge = badgeApiData;
        this.features = features;
        this.footer = footer;
        this.termsMarkdown = deliveryUnlimitedSubscribeTermsMarkdown;
    }

    /* renamed from: a, reason: from getter */
    public final BadgeApiData getBadge() {
        return this.badge;
    }

    /* renamed from: b, reason: from getter */
    public final DownloadableAsset getBannerAsset() {
        return this.bannerAsset;
    }

    /* renamed from: c, reason: from getter */
    public final List getFeatures() {
        return this.features;
    }

    /* renamed from: d, reason: from getter */
    public final DeliveryUnlimitedSignUpFooter getFooter() {
        return this.footer;
    }

    /* renamed from: e, reason: from getter */
    public final DeliveryUnlimitedSubscribeTermsMarkdown getTermsMarkdown() {
        return this.termsMarkdown;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSignUpSummary)) {
            return false;
        }
        DeliveryUnlimitedSignUpSummary deliveryUnlimitedSignUpSummary = (DeliveryUnlimitedSignUpSummary) obj;
        return Intrinsics.c(this.title, deliveryUnlimitedSignUpSummary.title) && Intrinsics.c(this.bannerAsset, deliveryUnlimitedSignUpSummary.bannerAsset) && Intrinsics.c(this.badge, deliveryUnlimitedSignUpSummary.badge) && Intrinsics.c(this.features, deliveryUnlimitedSignUpSummary.features) && Intrinsics.c(this.footer, deliveryUnlimitedSignUpSummary.footer) && Intrinsics.c(this.termsMarkdown, deliveryUnlimitedSignUpSummary.termsMarkdown);
    }

    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        DownloadableAsset downloadableAsset = this.bannerAsset;
        int iHashCode2 = (iHashCode + (downloadableAsset == null ? 0 : downloadableAsset.hashCode())) * 31;
        BadgeApiData badgeApiData = this.badge;
        int iHashCode3 = (this.footer.hashCode() + b.d((iHashCode2 + (badgeApiData == null ? 0 : badgeApiData.hashCode())) * 31, 31, this.features)) * 31;
        DeliveryUnlimitedSubscribeTermsMarkdown deliveryUnlimitedSubscribeTermsMarkdown = this.termsMarkdown;
        return iHashCode3 + (deliveryUnlimitedSubscribeTermsMarkdown != null ? deliveryUnlimitedSubscribeTermsMarkdown.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryUnlimitedSignUpSummary(title=" + this.title + ", bannerAsset=" + this.bannerAsset + ", badge=" + this.badge + ", features=" + this.features + ", footer=" + this.footer + ", termsMarkdown=" + this.termsMarkdown + ")";
    }
}

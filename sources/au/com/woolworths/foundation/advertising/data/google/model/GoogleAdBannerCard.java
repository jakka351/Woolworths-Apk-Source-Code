package au.com.woolworths.foundation.advertising.data.google.model;

import YU.a;
import android.widget.ImageView;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.foundation.advertising.data.common.model.InteractiveAdvertisingBureauAdHeight;
import au.com.woolworths.graphql.MappedName;
import au.com.woolworths.sdui.shop.dynamicsizecard.DefaultCardHeight;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardHeight;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.gson.annotations.SerializedName;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b!\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b%\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b(\u0010\u0018R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBannerCard;", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DynamicSizeCardData;", "", "adUnitId", "templateId", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;", "nativeSize", "Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "targeting", "correlator", "imageUrl", "altText", "title", "targetId", "targetType", "stitchId", "detailId", "ctaUrl", "Lau/com/woolworths/foundation/advertising/data/common/model/InteractiveAdvertisingBureauAdHeight;", "iabSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/foundation/advertising/data/common/model/InteractiveAdvertisingBureauAdHeight;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "n", "Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;", "getNativeSize", "()Lau/com/woolworths/sdui/shop/dynamicsizecard/DefaultCardHeight;", "Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "m", "()Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "f", "getImageUrl", "a", "o", "k", "l", "j", "h", "g", "Lau/com/woolworths/foundation/advertising/data/common/model/InteractiveAdvertisingBureauAdHeight;", "i", "()Lau/com/woolworths/foundation/advertising/data/common/model/InteractiveAdvertisingBureauAdHeight;", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final /* data */ class GoogleAdBannerCard implements DynamicSizeCardData {

    @SerializedName(OutOfContextTestingActivity.AD_UNIT_KEY)
    @MappedName
    @NotNull
    private final String adUnitId;

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName("correlator")
    @Nullable
    private final String correlator;

    @SerializedName("ctaUrl")
    @Nullable
    private final String ctaUrl;

    @SerializedName("detailId")
    @Nullable
    private final String detailId;

    @SerializedName("iabSize")
    @Nullable
    private final InteractiveAdvertisingBureauAdHeight iabSize;

    @SerializedName("imageUrl")
    @Nullable
    private final String imageUrl;

    @SerializedName("height")
    @MappedName
    @Nullable
    private final DefaultCardHeight nativeSize;

    @SerializedName("stitchId")
    @Nullable
    private final String stitchId;

    @SerializedName("targetId")
    @Nullable
    private final String targetId;

    @SerializedName("targetType")
    @Nullable
    private final String targetType;

    @SerializedName("targeting")
    @Nullable
    private final GoogleAdCustomTargeting targeting;

    @SerializedName("nativeCustomTemplateId")
    @MappedName
    @NotNull
    private final String templateId;

    @SerializedName("title")
    @Nullable
    private final String title;

    public GoogleAdBannerCard(@NotNull String adUnitId, @NotNull String templateId, @Nullable DefaultCardHeight defaultCardHeight, @Nullable GoogleAdCustomTargeting googleAdCustomTargeting, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable InteractiveAdvertisingBureauAdHeight interactiveAdvertisingBureauAdHeight) {
        Intrinsics.h(adUnitId, "adUnitId");
        Intrinsics.h(templateId, "templateId");
        this.adUnitId = adUnitId;
        this.templateId = templateId;
        this.nativeSize = defaultCardHeight;
        this.targeting = googleAdCustomTargeting;
        this.correlator = str;
        this.imageUrl = str2;
        this.altText = str3;
        this.title = str4;
        this.targetId = str5;
        this.targetType = str6;
        this.stitchId = str7;
        this.detailId = str8;
        this.ctaUrl = str9;
        this.iabSize = interactiveAdvertisingBureauAdHeight;
    }

    public static GoogleAdBannerCard d(GoogleAdBannerCard googleAdBannerCard, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InteractiveAdvertisingBureauAdHeight interactiveAdvertisingBureauAdHeight) {
        String adUnitId = googleAdBannerCard.adUnitId;
        String templateId = googleAdBannerCard.templateId;
        DefaultCardHeight defaultCardHeight = googleAdBannerCard.nativeSize;
        GoogleAdCustomTargeting googleAdCustomTargeting = googleAdBannerCard.targeting;
        String str9 = googleAdBannerCard.correlator;
        googleAdBannerCard.getClass();
        Intrinsics.h(adUnitId, "adUnitId");
        Intrinsics.h(templateId, "templateId");
        return new GoogleAdBannerCard(adUnitId, templateId, defaultCardHeight, googleAdCustomTargeting, str9, str, str2, str3, str4, str5, str6, str7, str8, interactiveAdvertisingBureauAdHeight);
    }

    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
    public final ImageView.ScaleType b() {
        ImageView.ScaleType scaleType;
        return (this.iabSize == null || (scaleType = ImageView.ScaleType.FIT_XY) == null) ? ImageView.ScaleType.CENTER_CROP : scaleType;
    }

    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
    public final int c() {
        return this.iabSize != null ? R.dimen.iab_banner_width : R.dimen.dynamic_height_card_default_width;
    }

    /* renamed from: e, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleAdBannerCard)) {
            return false;
        }
        GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) obj;
        return Intrinsics.c(this.adUnitId, googleAdBannerCard.adUnitId) && Intrinsics.c(this.templateId, googleAdBannerCard.templateId) && this.nativeSize == googleAdBannerCard.nativeSize && Intrinsics.c(this.targeting, googleAdBannerCard.targeting) && Intrinsics.c(this.correlator, googleAdBannerCard.correlator) && Intrinsics.c(this.imageUrl, googleAdBannerCard.imageUrl) && Intrinsics.c(this.altText, googleAdBannerCard.altText) && Intrinsics.c(this.title, googleAdBannerCard.title) && Intrinsics.c(this.targetId, googleAdBannerCard.targetId) && Intrinsics.c(this.targetType, googleAdBannerCard.targetType) && Intrinsics.c(this.stitchId, googleAdBannerCard.stitchId) && Intrinsics.c(this.detailId, googleAdBannerCard.detailId) && Intrinsics.c(this.ctaUrl, googleAdBannerCard.ctaUrl) && this.iabSize == googleAdBannerCard.iabSize;
    }

    /* renamed from: f, reason: from getter */
    public final String getCorrelator() {
        return this.correlator;
    }

    /* renamed from: g, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
    public final DynamicSizeCardHeight getHeight() {
        InteractiveAdvertisingBureauAdHeight interactiveAdvertisingBureauAdHeight = this.iabSize;
        if (interactiveAdvertisingBureauAdHeight != null) {
            return interactiveAdvertisingBureauAdHeight;
        }
        DefaultCardHeight defaultCardHeight = this.nativeSize;
        return defaultCardHeight != null ? defaultCardHeight : DefaultCardHeight.SMALL;
    }

    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: h, reason: from getter */
    public final String getDetailId() {
        return this.detailId;
    }

    @Override // au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData
    public final int hashCode() {
        int iC = b.c(this.adUnitId.hashCode() * 31, 31, this.templateId);
        DefaultCardHeight defaultCardHeight = this.nativeSize;
        int iHashCode = (iC + (defaultCardHeight == null ? 0 : defaultCardHeight.hashCode())) * 31;
        GoogleAdCustomTargeting googleAdCustomTargeting = this.targeting;
        int iHashCode2 = (iHashCode + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
        String str = this.correlator;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.altText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.targetId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.targetType;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.stitchId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.detailId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.ctaUrl;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        InteractiveAdvertisingBureauAdHeight interactiveAdvertisingBureauAdHeight = this.iabSize;
        return iHashCode11 + (interactiveAdvertisingBureauAdHeight != null ? interactiveAdvertisingBureauAdHeight.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final InteractiveAdvertisingBureauAdHeight getIabSize() {
        return this.iabSize;
    }

    /* renamed from: j, reason: from getter */
    public final String getStitchId() {
        return this.stitchId;
    }

    /* renamed from: k, reason: from getter */
    public final String getTargetId() {
        return this.targetId;
    }

    /* renamed from: l, reason: from getter */
    public final String getTargetType() {
        return this.targetType;
    }

    /* renamed from: m, reason: from getter */
    public final GoogleAdCustomTargeting getTargeting() {
        return this.targeting;
    }

    /* renamed from: n, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* renamed from: o, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final String toString() {
        String str = this.adUnitId;
        String str2 = this.templateId;
        DefaultCardHeight defaultCardHeight = this.nativeSize;
        GoogleAdCustomTargeting googleAdCustomTargeting = this.targeting;
        String str3 = this.correlator;
        String str4 = this.imageUrl;
        String str5 = this.altText;
        String str6 = this.title;
        String str7 = this.targetId;
        String str8 = this.targetType;
        String str9 = this.stitchId;
        String str10 = this.detailId;
        String str11 = this.ctaUrl;
        InteractiveAdvertisingBureauAdHeight interactiveAdvertisingBureauAdHeight = this.iabSize;
        StringBuilder sbV = a.v("GoogleAdBannerCard(adUnitId=", str, ", templateId=", str2, ", nativeSize=");
        sbV.append(defaultCardHeight);
        sbV.append(", targeting=");
        sbV.append(googleAdCustomTargeting);
        sbV.append(", correlator=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", imageUrl=", str4, ", altText=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", title=", str6, ", targetId=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", targetType=", str8, ", stitchId=");
        androidx.constraintlayout.core.state.a.B(sbV, str9, ", detailId=", str10, ", ctaUrl=");
        sbV.append(str11);
        sbV.append(", iabSize=");
        sbV.append(interactiveAdvertisingBureauAdHeight);
        sbV.append(")");
        return sbV.toString();
    }
}

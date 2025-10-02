package au.com.woolworths.foundation.advertising.data.google.model;

import YU.a;
import au.com.woolworths.foundation.advertising.data.common.model.InteractiveAdvertisingBureauAdHeight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBanner;", "", "", "imageUrl", "altText", "Lau/com/woolworths/foundation/advertising/data/common/model/InteractiveAdvertisingBureauAdHeight;", "iabSize", "title", "targetId", "targetType", "stitchId", "detailId", "ctaUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/foundation/advertising/data/common/model/InteractiveAdvertisingBureauAdHeight;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "a", "Lau/com/woolworths/foundation/advertising/data/common/model/InteractiveAdvertisingBureauAdHeight;", "d", "()Lau/com/woolworths/foundation/advertising/data/common/model/InteractiveAdvertisingBureauAdHeight;", "i", "g", "h", "f", "c", "b", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GoogleAdBanner {

    @SerializedName("altText")
    @Nullable
    private final String altText;

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

    @SerializedName("stitchId")
    @Nullable
    private final String stitchId;

    @SerializedName("targetId")
    @Nullable
    private final String targetId;

    @SerializedName("targetType")
    @Nullable
    private final String targetType;

    @SerializedName("title")
    @Nullable
    private final String title;

    public GoogleAdBanner(@Nullable String str, @Nullable String str2, @Nullable InteractiveAdvertisingBureauAdHeight interactiveAdvertisingBureauAdHeight, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.imageUrl = str;
        this.altText = str2;
        this.iabSize = interactiveAdvertisingBureauAdHeight;
        this.title = str3;
        this.targetId = str4;
        this.targetType = str5;
        this.stitchId = str6;
        this.detailId = str7;
        this.ctaUrl = str8;
    }

    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: b, reason: from getter */
    public final String getCtaUrl() {
        return this.ctaUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getDetailId() {
        return this.detailId;
    }

    /* renamed from: d, reason: from getter */
    public final InteractiveAdvertisingBureauAdHeight getIabSize() {
        return this.iabSize;
    }

    /* renamed from: e, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleAdBanner)) {
            return false;
        }
        GoogleAdBanner googleAdBanner = (GoogleAdBanner) obj;
        return Intrinsics.c(this.imageUrl, googleAdBanner.imageUrl) && Intrinsics.c(this.altText, googleAdBanner.altText) && this.iabSize == googleAdBanner.iabSize && Intrinsics.c(this.title, googleAdBanner.title) && Intrinsics.c(this.targetId, googleAdBanner.targetId) && Intrinsics.c(this.targetType, googleAdBanner.targetType) && Intrinsics.c(this.stitchId, googleAdBanner.stitchId) && Intrinsics.c(this.detailId, googleAdBanner.detailId) && Intrinsics.c(this.ctaUrl, googleAdBanner.ctaUrl);
    }

    /* renamed from: f, reason: from getter */
    public final String getStitchId() {
        return this.stitchId;
    }

    /* renamed from: g, reason: from getter */
    public final String getTargetId() {
        return this.targetId;
    }

    /* renamed from: h, reason: from getter */
    public final String getTargetType() {
        return this.targetType;
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.altText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        InteractiveAdvertisingBureauAdHeight interactiveAdvertisingBureauAdHeight = this.iabSize;
        int iHashCode3 = (iHashCode2 + (interactiveAdvertisingBureauAdHeight == null ? 0 : interactiveAdvertisingBureauAdHeight.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.targetType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stitchId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.detailId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.ctaUrl;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final String toString() {
        String str = this.imageUrl;
        String str2 = this.altText;
        InteractiveAdvertisingBureauAdHeight interactiveAdvertisingBureauAdHeight = this.iabSize;
        String str3 = this.title;
        String str4 = this.targetId;
        String str5 = this.targetType;
        String str6 = this.stitchId;
        String str7 = this.detailId;
        String str8 = this.ctaUrl;
        StringBuilder sbV = a.v("GoogleAdBanner(imageUrl=", str, ", altText=", str2, ", iabSize=");
        sbV.append(interactiveAdvertisingBureauAdHeight);
        sbV.append(", title=");
        sbV.append(str3);
        sbV.append(", targetId=");
        androidx.constraintlayout.core.state.a.B(sbV, str4, ", targetType=", str5, ", stitchId=");
        androidx.constraintlayout.core.state.a.B(sbV, str6, ", detailId=", str7, ", ctaUrl=");
        return a.o(sbV, str8, ")");
    }
}

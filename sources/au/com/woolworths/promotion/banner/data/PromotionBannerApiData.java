package au.com.woolworths.promotion.banner.data;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/promotion/banner/data/PromotionBannerApiData;", "Landroid/os/Parcelable;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "banner", "Lau/com/woolworths/promotion/banner/data/PromotionContent;", "promotionContent", "<init>", "(Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;Lau/com/woolworths/promotion/banner/data/PromotionContent;)V", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "a", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "Lau/com/woolworths/promotion/banner/data/PromotionContent;", "b", "()Lau/com/woolworths/promotion/banner/data/PromotionContent;", "promotion-banner_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PromotionBannerApiData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PromotionBannerApiData> CREATOR = new Creator();

    @SerializedName("banner")
    @NotNull
    private final InsetBannerApiData banner;

    @SerializedName("promotionContent")
    @Nullable
    private final PromotionContent promotionContent;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromotionBannerApiData> {
        @Override // android.os.Parcelable.Creator
        public final PromotionBannerApiData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PromotionBannerApiData((InsetBannerApiData) parcel.readParcelable(PromotionBannerApiData.class.getClassLoader()), (PromotionContent) parcel.readParcelable(PromotionBannerApiData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionBannerApiData[] newArray(int i) {
            return new PromotionBannerApiData[i];
        }
    }

    public PromotionBannerApiData(@NotNull InsetBannerApiData banner, @Nullable PromotionContent promotionContent) {
        Intrinsics.h(banner, "banner");
        this.banner = banner;
        this.promotionContent = promotionContent;
    }

    /* renamed from: a, reason: from getter */
    public final InsetBannerApiData getBanner() {
        return this.banner;
    }

    /* renamed from: b, reason: from getter */
    public final PromotionContent getPromotionContent() {
        return this.promotionContent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionBannerApiData)) {
            return false;
        }
        PromotionBannerApiData promotionBannerApiData = (PromotionBannerApiData) obj;
        return Intrinsics.c(this.banner, promotionBannerApiData.banner) && Intrinsics.c(this.promotionContent, promotionBannerApiData.promotionContent);
    }

    public final int hashCode() {
        int iHashCode = this.banner.hashCode() * 31;
        PromotionContent promotionContent = this.promotionContent;
        return iHashCode + (promotionContent == null ? 0 : promotionContent.hashCode());
    }

    public final String toString() {
        return "PromotionBannerApiData(banner=" + this.banner + ", promotionContent=" + this.promotionContent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.banner, i);
        dest.writeParcelable(this.promotionContent, i);
    }
}

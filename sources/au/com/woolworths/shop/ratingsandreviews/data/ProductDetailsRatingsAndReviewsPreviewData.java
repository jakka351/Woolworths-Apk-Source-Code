package au.com.woolworths.shop.ratingsandreviews.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratingsandreviews/data/ProductDetailsRatingsAndReviewsPreviewData;", "Landroid/os/Parcelable;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsRatingsAndReviewsPreviewData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductDetailsRatingsAndReviewsPreviewData> CREATOR = new Creator();
    public final RatingsAndReviewsPreviewData d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductDetailsRatingsAndReviewsPreviewData> {
        @Override // android.os.Parcelable.Creator
        public final ProductDetailsRatingsAndReviewsPreviewData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductDetailsRatingsAndReviewsPreviewData(parcel.readInt() == 0 ? null : RatingsAndReviewsPreviewData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ProductDetailsRatingsAndReviewsPreviewData[] newArray(int i) {
            return new ProductDetailsRatingsAndReviewsPreviewData[i];
        }
    }

    public ProductDetailsRatingsAndReviewsPreviewData(RatingsAndReviewsPreviewData ratingsAndReviewsPreviewData) {
        this.d = ratingsAndReviewsPreviewData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductDetailsRatingsAndReviewsPreviewData) && Intrinsics.c(this.d, ((ProductDetailsRatingsAndReviewsPreviewData) obj).d);
    }

    public final int hashCode() {
        RatingsAndReviewsPreviewData ratingsAndReviewsPreviewData = this.d;
        if (ratingsAndReviewsPreviewData == null) {
            return 0;
        }
        return ratingsAndReviewsPreviewData.d.hashCode();
    }

    public final String toString() {
        return "ProductDetailsRatingsAndReviewsPreviewData(ratingsAndReviewsPreview=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        RatingsAndReviewsPreviewData ratingsAndReviewsPreviewData = this.d;
        if (ratingsAndReviewsPreviewData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ratingsAndReviewsPreviewData.writeToParcel(dest, i);
        }
    }
}

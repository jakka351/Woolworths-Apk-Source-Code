package au.com.woolworths.product.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lau/com/woolworths/product/details/models/ProductRatingsAndReviewsSummaryData;", "Landroid/os/Parcelable;", "averageRatings", "", "displayRatings", "maximumRating", "", "ratingText", "Lau/com/woolworths/product/details/models/RatingTextData;", "cta", "Lau/com/woolworths/product/details/models/CtaData;", "<init>", "(DDILau/com/woolworths/product/details/models/RatingTextData;Lau/com/woolworths/product/details/models/CtaData;)V", "getAverageRatings", "()D", "getDisplayRatings", "getMaximumRating", "()I", "getRatingText", "()Lau/com/woolworths/product/details/models/RatingTextData;", "getCta", "()Lau/com/woolworths/product/details/models/CtaData;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductRatingsAndReviewsSummaryData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ProductRatingsAndReviewsSummaryData> CREATOR = new Creator();
    private final double averageRatings;

    @Nullable
    private final CtaData cta;
    private final double displayRatings;
    private final int maximumRating;

    @NotNull
    private final RatingTextData ratingText;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductRatingsAndReviewsSummaryData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductRatingsAndReviewsSummaryData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ProductRatingsAndReviewsSummaryData(parcel.readDouble(), parcel.readDouble(), parcel.readInt(), RatingTextData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CtaData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductRatingsAndReviewsSummaryData[] newArray(int i) {
            return new ProductRatingsAndReviewsSummaryData[i];
        }
    }

    public ProductRatingsAndReviewsSummaryData(double d, double d2, int i, @NotNull RatingTextData ratingText, @Nullable CtaData ctaData) {
        Intrinsics.h(ratingText, "ratingText");
        this.averageRatings = d;
        this.displayRatings = d2;
        this.maximumRating = i;
        this.ratingText = ratingText;
        this.cta = ctaData;
    }

    public static /* synthetic */ ProductRatingsAndReviewsSummaryData copy$default(ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData, double d, double d2, int i, RatingTextData ratingTextData, CtaData ctaData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = productRatingsAndReviewsSummaryData.averageRatings;
        }
        double d3 = d;
        if ((i2 & 2) != 0) {
            d2 = productRatingsAndReviewsSummaryData.displayRatings;
        }
        double d4 = d2;
        if ((i2 & 4) != 0) {
            i = productRatingsAndReviewsSummaryData.maximumRating;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            ratingTextData = productRatingsAndReviewsSummaryData.ratingText;
        }
        RatingTextData ratingTextData2 = ratingTextData;
        if ((i2 & 16) != 0) {
            ctaData = productRatingsAndReviewsSummaryData.cta;
        }
        return productRatingsAndReviewsSummaryData.copy(d3, d4, i3, ratingTextData2, ctaData);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAverageRatings() {
        return this.averageRatings;
    }

    /* renamed from: component2, reason: from getter */
    public final double getDisplayRatings() {
        return this.displayRatings;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaximumRating() {
        return this.maximumRating;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final RatingTextData getRatingText() {
        return this.ratingText;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final CtaData getCta() {
        return this.cta;
    }

    @NotNull
    public final ProductRatingsAndReviewsSummaryData copy(double averageRatings, double displayRatings, int maximumRating, @NotNull RatingTextData ratingText, @Nullable CtaData cta) {
        Intrinsics.h(ratingText, "ratingText");
        return new ProductRatingsAndReviewsSummaryData(averageRatings, displayRatings, maximumRating, ratingText, cta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductRatingsAndReviewsSummaryData)) {
            return false;
        }
        ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData = (ProductRatingsAndReviewsSummaryData) other;
        return Double.compare(this.averageRatings, productRatingsAndReviewsSummaryData.averageRatings) == 0 && Double.compare(this.displayRatings, productRatingsAndReviewsSummaryData.displayRatings) == 0 && this.maximumRating == productRatingsAndReviewsSummaryData.maximumRating && Intrinsics.c(this.ratingText, productRatingsAndReviewsSummaryData.ratingText) && Intrinsics.c(this.cta, productRatingsAndReviewsSummaryData.cta);
    }

    public final double getAverageRatings() {
        return this.averageRatings;
    }

    @Nullable
    public final CtaData getCta() {
        return this.cta;
    }

    public final double getDisplayRatings() {
        return this.displayRatings;
    }

    public final int getMaximumRating() {
        return this.maximumRating;
    }

    @NotNull
    public final RatingTextData getRatingText() {
        return this.ratingText;
    }

    public int hashCode() {
        int iHashCode = (this.ratingText.hashCode() + b.a(this.maximumRating, a.a(this.displayRatings, Double.hashCode(this.averageRatings) * 31, 31), 31)) * 31;
        CtaData ctaData = this.cta;
        return iHashCode + (ctaData == null ? 0 : ctaData.hashCode());
    }

    @NotNull
    public String toString() {
        double d = this.averageRatings;
        double d2 = this.displayRatings;
        int i = this.maximumRating;
        RatingTextData ratingTextData = this.ratingText;
        CtaData ctaData = this.cta;
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(d, "ProductRatingsAndReviewsSummaryData(averageRatings=", ", displayRatings=");
        sbN.append(d2);
        sbN.append(", maximumRating=");
        sbN.append(i);
        sbN.append(", ratingText=");
        sbN.append(ratingTextData);
        sbN.append(", cta=");
        sbN.append(ctaData);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeDouble(this.averageRatings);
        dest.writeDouble(this.displayRatings);
        dest.writeInt(this.maximumRating);
        this.ratingText.writeToParcel(dest, flags);
        CtaData ctaData = this.cta;
        if (ctaData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            ctaData.writeToParcel(dest, flags);
        }
    }
}

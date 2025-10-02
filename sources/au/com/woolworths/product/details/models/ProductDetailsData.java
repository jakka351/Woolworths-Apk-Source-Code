package au.com.woolworths.product.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lau/com/woolworths/product/details/models/ProductDetailsData;", "Lau/com/woolworths/android/onesite/navigation/Activities$LegacyProductDetails$ExtraProductDetailsData;", "feed", "", "Landroid/os/Parcelable;", "imageList", "Lau/com/woolworths/product/details/models/ProductImage;", "productReviewData", "Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsPreviewData;", "<init>", "(Ljava/util/List;Ljava/util/List;Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsPreviewData;)V", "getFeed", "()Ljava/util/List;", "getImageList", "getProductReviewData", "()Lau/com/woolworths/shop/ratingsandreviews/data/RatingsAndReviewsPreviewData;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsData implements Activities.LegacyProductDetails.ExtraProductDetailsData {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ProductDetailsData> CREATOR = new Creator();

    @NotNull
    private final List<Parcelable> feed;

    @NotNull
    private final List<ProductImage> imageList;

    @Nullable
    private final RatingsAndReviewsPreviewData productReviewData;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductDetailsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductDetailsData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iA = 0;
            while (iA != i) {
                iA = a.a(ProductDetailsData.class, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = androidx.compose.ui.input.pointer.a.e(ProductImage.CREATOR, parcel, arrayList2, iE, 1);
            }
            return new ProductDetailsData(arrayList, arrayList2, (RatingsAndReviewsPreviewData) parcel.readParcelable(ProductDetailsData.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductDetailsData[] newArray(int i) {
            return new ProductDetailsData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductDetailsData(@NotNull List<? extends Parcelable> feed, @NotNull List<ProductImage> imageList, @Nullable RatingsAndReviewsPreviewData ratingsAndReviewsPreviewData) {
        Intrinsics.h(feed, "feed");
        Intrinsics.h(imageList, "imageList");
        this.feed = feed;
        this.imageList = imageList;
        this.productReviewData = ratingsAndReviewsPreviewData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductDetailsData copy$default(ProductDetailsData productDetailsData, List list, List list2, RatingsAndReviewsPreviewData ratingsAndReviewsPreviewData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = productDetailsData.feed;
        }
        if ((i & 2) != 0) {
            list2 = productDetailsData.imageList;
        }
        if ((i & 4) != 0) {
            ratingsAndReviewsPreviewData = productDetailsData.productReviewData;
        }
        return productDetailsData.copy(list, list2, ratingsAndReviewsPreviewData);
    }

    @NotNull
    public final List<Parcelable> component1() {
        return this.feed;
    }

    @NotNull
    public final List<ProductImage> component2() {
        return this.imageList;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final RatingsAndReviewsPreviewData getProductReviewData() {
        return this.productReviewData;
    }

    @NotNull
    public final ProductDetailsData copy(@NotNull List<? extends Parcelable> feed, @NotNull List<ProductImage> imageList, @Nullable RatingsAndReviewsPreviewData productReviewData) {
        Intrinsics.h(feed, "feed");
        Intrinsics.h(imageList, "imageList");
        return new ProductDetailsData(feed, imageList, productReviewData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDetailsData)) {
            return false;
        }
        ProductDetailsData productDetailsData = (ProductDetailsData) other;
        return Intrinsics.c(this.feed, productDetailsData.feed) && Intrinsics.c(this.imageList, productDetailsData.imageList) && Intrinsics.c(this.productReviewData, productDetailsData.productReviewData);
    }

    @NotNull
    public final List<Parcelable> getFeed() {
        return this.feed;
    }

    @NotNull
    public final List<ProductImage> getImageList() {
        return this.imageList;
    }

    @Nullable
    public final RatingsAndReviewsPreviewData getProductReviewData() {
        return this.productReviewData;
    }

    public int hashCode() {
        int iD = b.d(this.feed.hashCode() * 31, 31, this.imageList);
        RatingsAndReviewsPreviewData ratingsAndReviewsPreviewData = this.productReviewData;
        return iD + (ratingsAndReviewsPreviewData == null ? 0 : ratingsAndReviewsPreviewData.d.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProductDetailsData(feed=" + this.feed + ", imageList=" + this.imageList + ", productReviewData=" + this.productReviewData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        Iterator itU = a.u(this.feed, dest);
        while (itU.hasNext()) {
            dest.writeParcelable((Parcelable) itU.next(), flags);
        }
        Iterator itU2 = a.u(this.imageList, dest);
        while (itU2.hasNext()) {
            ((ProductImage) itU2.next()).writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.productReviewData, flags);
    }

    public /* synthetic */ ProductDetailsData(List list, List list2, RatingsAndReviewsPreviewData ratingsAndReviewsPreviewData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? null : ratingsAndReviewsPreviewData);
    }
}

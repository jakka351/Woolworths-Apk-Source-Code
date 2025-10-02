package au.com.woolworths.product.productbottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productbottomsheet/UpdateProductInCartExtras;", "Landroid/os/Parcelable;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateProductInCartExtras implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UpdateProductInCartExtras> CREATOR = new Creator();
    public final String d;
    public final float e;
    public final ProductBottomSheetActionType f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final TrackingMetadata k;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UpdateProductInCartExtras> {
        @Override // android.os.Parcelable.Creator
        public final UpdateProductInCartExtras createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new UpdateProductInCartExtras(parcel.readString(), parcel.readFloat(), ProductBottomSheetActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (TrackingMetadata) parcel.readParcelable(UpdateProductInCartExtras.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UpdateProductInCartExtras[] newArray(int i) {
            return new UpdateProductInCartExtras[i];
        }
    }

    public /* synthetic */ UpdateProductInCartExtras(String str, float f, ProductBottomSheetActionType productBottomSheetActionType, String str2, String str3, String str4, int i) {
        this(str, f, productBottomSheetActionType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) == 0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProductInCartExtras)) {
            return false;
        }
        UpdateProductInCartExtras updateProductInCartExtras = (UpdateProductInCartExtras) obj;
        return Intrinsics.c(this.d, updateProductInCartExtras.d) && Float.compare(this.e, updateProductInCartExtras.e) == 0 && this.f == updateProductInCartExtras.f && Intrinsics.c(this.g, updateProductInCartExtras.g) && Intrinsics.c(this.h, updateProductInCartExtras.h) && Intrinsics.c(this.i, updateProductInCartExtras.i) && this.j == updateProductInCartExtras.j && Intrinsics.c(this.k, updateProductInCartExtras.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + a.b(this.e, this.d.hashCode() * 31, 31)) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iE = b.e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j);
        TrackingMetadata trackingMetadata = this.k;
        return iE + (trackingMetadata != null ? trackingMetadata.d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateProductInCartExtras(articleId=");
        sb.append(this.d);
        sb.append(", quantity=");
        sb.append(this.e);
        sb.append(", actionType=");
        sb.append(this.f);
        sb.append(", adId=");
        sb.append(this.g);
        sb.append(", source=");
        androidx.constraintlayout.core.state.a.B(sb, this.h, ", offerId=", this.i, ", shouldBeBoosted=");
        sb.append(this.j);
        sb.append(", trackingMetadata=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeFloat(this.e);
        dest.writeString(this.f.name());
        dest.writeString(this.g);
        dest.writeString(this.h);
        dest.writeString(this.i);
        dest.writeInt(this.j ? 1 : 0);
        dest.writeParcelable(this.k, i);
    }

    public UpdateProductInCartExtras(String articleId, float f, ProductBottomSheetActionType actionType, String str, String str2, String str3, boolean z, TrackingMetadata trackingMetadata) {
        Intrinsics.h(articleId, "articleId");
        Intrinsics.h(actionType, "actionType");
        this.d = articleId;
        this.e = f;
        this.f = actionType;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = z;
        this.k = trackingMetadata;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UpdateProductInCartExtras(ProductCard data, float f, ProductBottomSheetActionType productBottomSheetActionType) {
        Intrinsics.h(data, "data");
        String productId = data.getProductId();
        String adId = data.getAdId();
        String source = data.getSource();
        RewardsOfferInfo rewardsOfferInfo = data.getRewardsOfferInfo();
        String d = rewardsOfferInfo != null ? rewardsOfferInfo.getD() : null;
        RewardsOfferInfo rewardsOfferInfo2 = data.getRewardsOfferInfo();
        this(productId, f, productBottomSheetActionType, adId, source, d, (rewardsOfferInfo2 != null ? rewardsOfferInfo2.getN() : null) == RewardsOfferStatus.NOT_ACTIVATED, ProductAnalyticsExtKt.h(data, null, null, 7));
    }
}

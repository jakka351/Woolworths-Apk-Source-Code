package au.com.woolworths.product.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lau/com/woolworths/product/details/models/HealthierOption;", "Landroid/os/Parcelable;", "productCard", "Lau/com/woolworths/product/models/ProductCard;", "healthStarRating", "Lau/com/woolworths/product/details/models/ImageContent;", "<init>", "(Lau/com/woolworths/product/models/ProductCard;Lau/com/woolworths/product/details/models/ImageContent;)V", "getProductCard", "()Lau/com/woolworths/product/models/ProductCard;", "setProductCard", "(Lau/com/woolworths/product/models/ProductCard;)V", "getHealthStarRating", "()Lau/com/woolworths/product/details/models/ImageContent;", "setHealthStarRating", "(Lau/com/woolworths/product/details/models/ImageContent;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HealthierOption implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<HealthierOption> CREATOR = new Creator();

    @Nullable
    private ImageContent healthStarRating;

    @NotNull
    private ProductCard productCard;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HealthierOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthierOption createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new HealthierOption((ProductCard) parcel.readParcelable(HealthierOption.class.getClassLoader()), parcel.readInt() == 0 ? null : ImageContent.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthierOption[] newArray(int i) {
            return new HealthierOption[i];
        }
    }

    public HealthierOption(@NotNull ProductCard productCard, @Nullable ImageContent imageContent) {
        Intrinsics.h(productCard, "productCard");
        this.productCard = productCard;
        this.healthStarRating = imageContent;
    }

    public static /* synthetic */ HealthierOption copy$default(HealthierOption healthierOption, ProductCard productCard, ImageContent imageContent, int i, Object obj) {
        if ((i & 1) != 0) {
            productCard = healthierOption.productCard;
        }
        if ((i & 2) != 0) {
            imageContent = healthierOption.healthStarRating;
        }
        return healthierOption.copy(productCard, imageContent);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductCard getProductCard() {
        return this.productCard;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ImageContent getHealthStarRating() {
        return this.healthStarRating;
    }

    @NotNull
    public final HealthierOption copy(@NotNull ProductCard productCard, @Nullable ImageContent healthStarRating) {
        Intrinsics.h(productCard, "productCard");
        return new HealthierOption(productCard, healthStarRating);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthierOption)) {
            return false;
        }
        HealthierOption healthierOption = (HealthierOption) other;
        return Intrinsics.c(this.productCard, healthierOption.productCard) && Intrinsics.c(this.healthStarRating, healthierOption.healthStarRating);
    }

    @Nullable
    public final ImageContent getHealthStarRating() {
        return this.healthStarRating;
    }

    @NotNull
    public final ProductCard getProductCard() {
        return this.productCard;
    }

    public int hashCode() {
        int iHashCode = this.productCard.hashCode() * 31;
        ImageContent imageContent = this.healthStarRating;
        return iHashCode + (imageContent == null ? 0 : imageContent.hashCode());
    }

    public final void setHealthStarRating(@Nullable ImageContent imageContent) {
        this.healthStarRating = imageContent;
    }

    public final void setProductCard(@NotNull ProductCard productCard) {
        Intrinsics.h(productCard, "<set-?>");
        this.productCard = productCard;
    }

    @NotNull
    public String toString() {
        return "HealthierOption(productCard=" + this.productCard + ", healthStarRating=" + this.healthStarRating + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.productCard, flags);
        ImageContent imageContent = this.healthStarRating;
        if (imageContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageContent.writeToParcel(dest, flags);
        }
    }
}

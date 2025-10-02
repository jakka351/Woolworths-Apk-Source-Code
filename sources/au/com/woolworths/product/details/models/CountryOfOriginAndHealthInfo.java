package au.com.woolworths.product.details.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lau/com/woolworths/product/details/models/CountryOfOriginAndHealthInfo;", "Landroid/os/Parcelable;", "countryOfOrigin", "Lau/com/woolworths/product/details/models/ImageContent;", "healthStarRating", "<init>", "(Lau/com/woolworths/product/details/models/ImageContent;Lau/com/woolworths/product/details/models/ImageContent;)V", "getCountryOfOrigin", "()Lau/com/woolworths/product/details/models/ImageContent;", "getHealthStarRating", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CountryOfOriginAndHealthInfo implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<CountryOfOriginAndHealthInfo> CREATOR = new Creator();

    @Nullable
    private final ImageContent countryOfOrigin;

    @Nullable
    private final ImageContent healthStarRating;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryOfOriginAndHealthInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountryOfOriginAndHealthInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new CountryOfOriginAndHealthInfo(parcel.readInt() == 0 ? null : ImageContent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ImageContent.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CountryOfOriginAndHealthInfo[] newArray(int i) {
            return new CountryOfOriginAndHealthInfo[i];
        }
    }

    public CountryOfOriginAndHealthInfo(@Nullable ImageContent imageContent, @Nullable ImageContent imageContent2) {
        this.countryOfOrigin = imageContent;
        this.healthStarRating = imageContent2;
    }

    public static /* synthetic */ CountryOfOriginAndHealthInfo copy$default(CountryOfOriginAndHealthInfo countryOfOriginAndHealthInfo, ImageContent imageContent, ImageContent imageContent2, int i, Object obj) {
        if ((i & 1) != 0) {
            imageContent = countryOfOriginAndHealthInfo.countryOfOrigin;
        }
        if ((i & 2) != 0) {
            imageContent2 = countryOfOriginAndHealthInfo.healthStarRating;
        }
        return countryOfOriginAndHealthInfo.copy(imageContent, imageContent2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ImageContent getCountryOfOrigin() {
        return this.countryOfOrigin;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ImageContent getHealthStarRating() {
        return this.healthStarRating;
    }

    @NotNull
    public final CountryOfOriginAndHealthInfo copy(@Nullable ImageContent countryOfOrigin, @Nullable ImageContent healthStarRating) {
        return new CountryOfOriginAndHealthInfo(countryOfOrigin, healthStarRating);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryOfOriginAndHealthInfo)) {
            return false;
        }
        CountryOfOriginAndHealthInfo countryOfOriginAndHealthInfo = (CountryOfOriginAndHealthInfo) other;
        return Intrinsics.c(this.countryOfOrigin, countryOfOriginAndHealthInfo.countryOfOrigin) && Intrinsics.c(this.healthStarRating, countryOfOriginAndHealthInfo.healthStarRating);
    }

    @Nullable
    public final ImageContent getCountryOfOrigin() {
        return this.countryOfOrigin;
    }

    @Nullable
    public final ImageContent getHealthStarRating() {
        return this.healthStarRating;
    }

    public int hashCode() {
        ImageContent imageContent = this.countryOfOrigin;
        int iHashCode = (imageContent == null ? 0 : imageContent.hashCode()) * 31;
        ImageContent imageContent2 = this.healthStarRating;
        return iHashCode + (imageContent2 != null ? imageContent2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CountryOfOriginAndHealthInfo(countryOfOrigin=" + this.countryOfOrigin + ", healthStarRating=" + this.healthStarRating + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        ImageContent imageContent = this.countryOfOrigin;
        if (imageContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageContent.writeToParcel(dest, flags);
        }
        ImageContent imageContent2 = this.healthStarRating;
        if (imageContent2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imageContent2.writeToParcel(dest, flags);
        }
    }
}

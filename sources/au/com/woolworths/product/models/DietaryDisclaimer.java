package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/product/models/DietaryDisclaimer;", "Landroid/os/Parcelable;", "insetBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "dietaryInfo", "Lau/com/woolworths/product/models/DietaryInfo;", "<init>", "(Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;Lau/com/woolworths/product/models/DietaryInfo;)V", "getInsetBanner", "()Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "getDietaryInfo", "()Lau/com/woolworths/product/models/DietaryInfo;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DietaryDisclaimer implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<DietaryDisclaimer> CREATOR = new Creator();

    @SerializedName("dietaryInfo")
    @Nullable
    private final DietaryInfo dietaryInfo;

    @SerializedName("insetBanner")
    @NotNull
    private final InsetBannerApiData insetBanner;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DietaryDisclaimer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DietaryDisclaimer createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new DietaryDisclaimer((InsetBannerApiData) parcel.readParcelable(DietaryDisclaimer.class.getClassLoader()), parcel.readInt() == 0 ? null : DietaryInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DietaryDisclaimer[] newArray(int i) {
            return new DietaryDisclaimer[i];
        }
    }

    public DietaryDisclaimer(@NotNull InsetBannerApiData insetBanner, @Nullable DietaryInfo dietaryInfo) {
        Intrinsics.h(insetBanner, "insetBanner");
        this.insetBanner = insetBanner;
        this.dietaryInfo = dietaryInfo;
    }

    public static /* synthetic */ DietaryDisclaimer copy$default(DietaryDisclaimer dietaryDisclaimer, InsetBannerApiData insetBannerApiData, DietaryInfo dietaryInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            insetBannerApiData = dietaryDisclaimer.insetBanner;
        }
        if ((i & 2) != 0) {
            dietaryInfo = dietaryDisclaimer.dietaryInfo;
        }
        return dietaryDisclaimer.copy(insetBannerApiData, dietaryInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InsetBannerApiData getInsetBanner() {
        return this.insetBanner;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final DietaryInfo getDietaryInfo() {
        return this.dietaryInfo;
    }

    @NotNull
    public final DietaryDisclaimer copy(@NotNull InsetBannerApiData insetBanner, @Nullable DietaryInfo dietaryInfo) {
        Intrinsics.h(insetBanner, "insetBanner");
        return new DietaryDisclaimer(insetBanner, dietaryInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DietaryDisclaimer)) {
            return false;
        }
        DietaryDisclaimer dietaryDisclaimer = (DietaryDisclaimer) other;
        return Intrinsics.c(this.insetBanner, dietaryDisclaimer.insetBanner) && Intrinsics.c(this.dietaryInfo, dietaryDisclaimer.dietaryInfo);
    }

    @Nullable
    public final DietaryInfo getDietaryInfo() {
        return this.dietaryInfo;
    }

    @NotNull
    public final InsetBannerApiData getInsetBanner() {
        return this.insetBanner;
    }

    public int hashCode() {
        int iHashCode = this.insetBanner.hashCode() * 31;
        DietaryInfo dietaryInfo = this.dietaryInfo;
        return iHashCode + (dietaryInfo == null ? 0 : dietaryInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "DietaryDisclaimer(insetBanner=" + this.insetBanner + ", dietaryInfo=" + this.dietaryInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.insetBanner, flags);
        DietaryInfo dietaryInfo = this.dietaryInfo;
        if (dietaryInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dietaryInfo.writeToParcel(dest, flags);
        }
    }
}

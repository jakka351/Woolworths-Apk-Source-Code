package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lau/com/woolworths/product/models/InStoreAvailabilityInfo;", "Landroid/os/Parcelable;", "button", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "status", "", "infoSheet", "Lau/com/woolworths/product/models/InfoSheet;", "<init>", "(Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;Ljava/lang/String;Lau/com/woolworths/product/models/InfoSheet;)V", "getButton", "()Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "getStatus", "()Ljava/lang/String;", "getInfoSheet", "()Lau/com/woolworths/product/models/InfoSheet;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InStoreAvailabilityInfo implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<InStoreAvailabilityInfo> CREATOR = new Creator();

    @SerializedName("button")
    @NotNull
    private final ButtonApiData button;

    @SerializedName("infoSheet")
    @Nullable
    private final InfoSheet infoSheet;

    @SerializedName("status")
    @Nullable
    private final String status;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InStoreAvailabilityInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InStoreAvailabilityInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InStoreAvailabilityInfo((ButtonApiData) parcel.readParcelable(InStoreAvailabilityInfo.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : InfoSheet.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InStoreAvailabilityInfo[] newArray(int i) {
            return new InStoreAvailabilityInfo[i];
        }
    }

    public InStoreAvailabilityInfo(@NotNull ButtonApiData button, @Nullable String str, @Nullable InfoSheet infoSheet) {
        Intrinsics.h(button, "button");
        this.button = button;
        this.status = str;
        this.infoSheet = infoSheet;
    }

    public static /* synthetic */ InStoreAvailabilityInfo copy$default(InStoreAvailabilityInfo inStoreAvailabilityInfo, ButtonApiData buttonApiData, String str, InfoSheet infoSheet, int i, Object obj) {
        if ((i & 1) != 0) {
            buttonApiData = inStoreAvailabilityInfo.button;
        }
        if ((i & 2) != 0) {
            str = inStoreAvailabilityInfo.status;
        }
        if ((i & 4) != 0) {
            infoSheet = inStoreAvailabilityInfo.infoSheet;
        }
        return inStoreAvailabilityInfo.copy(buttonApiData, str, infoSheet);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonApiData getButton() {
        return this.button;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final InfoSheet getInfoSheet() {
        return this.infoSheet;
    }

    @NotNull
    public final InStoreAvailabilityInfo copy(@NotNull ButtonApiData button, @Nullable String status, @Nullable InfoSheet infoSheet) {
        Intrinsics.h(button, "button");
        return new InStoreAvailabilityInfo(button, status, infoSheet);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InStoreAvailabilityInfo)) {
            return false;
        }
        InStoreAvailabilityInfo inStoreAvailabilityInfo = (InStoreAvailabilityInfo) other;
        return Intrinsics.c(this.button, inStoreAvailabilityInfo.button) && Intrinsics.c(this.status, inStoreAvailabilityInfo.status) && Intrinsics.c(this.infoSheet, inStoreAvailabilityInfo.infoSheet);
    }

    @NotNull
    public final ButtonApiData getButton() {
        return this.button;
    }

    @Nullable
    public final InfoSheet getInfoSheet() {
        return this.infoSheet;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.button.hashCode() * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InfoSheet infoSheet = this.infoSheet;
        return iHashCode2 + (infoSheet != null ? infoSheet.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InStoreAvailabilityInfo(button=" + this.button + ", status=" + this.status + ", infoSheet=" + this.infoSheet + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.button, flags);
        dest.writeString(this.status);
        InfoSheet infoSheet = this.infoSheet;
        if (infoSheet == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            infoSheet.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ InStoreAvailabilityInfo(ButtonApiData buttonApiData, String str, InfoSheet infoSheet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonApiData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : infoSheet);
    }
}

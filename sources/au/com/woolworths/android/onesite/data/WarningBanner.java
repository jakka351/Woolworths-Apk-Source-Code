package au.com.woolworths.android.onesite.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/android/onesite/data/WarningBanner;", "Landroid/os/Parcelable;", "", "iconUrl", "errorText", "backgroundColor", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getIconUrl", "()Ljava/lang/String;", "getErrorText", "getBackgroundColor", "getErrorCode", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WarningBanner implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WarningBanner> CREATOR = new Creator();

    @SerializedName("backgroundColor")
    @Nullable
    private final String backgroundColor;

    @SerializedName("errorCode")
    @Nullable
    private final String errorCode;

    @SerializedName("errorText")
    @Nullable
    private final String errorText;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WarningBanner> {
        @Override // android.os.Parcelable.Creator
        public final WarningBanner createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new WarningBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WarningBanner[] newArray(int i) {
            return new WarningBanner[i];
        }
    }

    public WarningBanner(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.iconUrl = str;
        this.errorText = str2;
        this.backgroundColor = str3;
        this.errorCode = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningBanner)) {
            return false;
        }
        WarningBanner warningBanner = (WarningBanner) obj;
        return Intrinsics.c(this.iconUrl, warningBanner.iconUrl) && Intrinsics.c(this.errorText, warningBanner.errorText) && Intrinsics.c(this.backgroundColor, warningBanner.backgroundColor) && Intrinsics.c(this.errorCode, warningBanner.errorCode);
    }

    public final int hashCode() {
        String str = this.iconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorCode;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.iconUrl;
        String str2 = this.errorText;
        return a.l(YU.a.v("WarningBanner(iconUrl=", str, ", errorText=", str2, ", backgroundColor="), this.backgroundColor, ", errorCode=", this.errorCode, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.iconUrl);
        dest.writeString(this.errorText);
        dest.writeString(this.backgroundColor);
        dest.writeString(this.errorCode);
    }
}

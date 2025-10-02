package au.com.woolworths.foundation.shop.bottomsheet;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/FinchInfoItem;", "Landroid/os/Parcelable;", "", "iconUrl", "title", lqlqqlq.mmm006Dm006Dm, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "a", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FinchInfoItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FinchInfoItem> CREATOR = new Creator();

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("iconUrl")
    @NotNull
    private final String iconUrl;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FinchInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final FinchInfoItem createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new FinchInfoItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FinchInfoItem[] newArray(int i) {
            return new FinchInfoItem[i];
        }
    }

    public FinchInfoItem(@NotNull String iconUrl, @NotNull String title, @NotNull String description) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(title, "title");
        Intrinsics.h(description, "description");
        this.iconUrl = iconUrl;
        this.title = title;
        this.description = description;
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinchInfoItem)) {
            return false;
        }
        FinchInfoItem finchInfoItem = (FinchInfoItem) obj;
        return Intrinsics.c(this.iconUrl, finchInfoItem.iconUrl) && Intrinsics.c(this.title, finchInfoItem.title) && Intrinsics.c(this.description, finchInfoItem.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + b.c(this.iconUrl.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        String str = this.iconUrl;
        String str2 = this.title;
        return a.o(a.v("FinchInfoItem(iconUrl=", str, ", title=", str2, ", description="), this.description, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.iconUrl);
        dest.writeString(this.title);
        dest.writeString(this.description);
    }
}

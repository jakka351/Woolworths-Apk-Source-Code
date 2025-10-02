package au.com.woolworths.base.shopapp.data.models;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/base/shopapp/data/models/InfoSectionItem;", "Landroid/os/Parcelable;", "", "title", lqlqqlq.mmm006Dm006Dm, "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "b", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InfoSectionItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InfoSectionItem> CREATOR = new Creator();

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("imageUrl")
    @NotNull
    private final String imageUrl;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InfoSectionItem> {
        @Override // android.os.Parcelable.Creator
        public final InfoSectionItem createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new InfoSectionItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final InfoSectionItem[] newArray(int i) {
            return new InfoSectionItem[i];
        }
    }

    public InfoSectionItem(@NotNull String title, @NotNull String description, @NotNull String imageUrl) {
        Intrinsics.h(title, "title");
        Intrinsics.h(description, "description");
        Intrinsics.h(imageUrl, "imageUrl");
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
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
        if (!(obj instanceof InfoSectionItem)) {
            return false;
        }
        InfoSectionItem infoSectionItem = (InfoSectionItem) obj;
        return Intrinsics.c(this.title, infoSectionItem.title) && Intrinsics.c(this.description, infoSectionItem.description) && Intrinsics.c(this.imageUrl, infoSectionItem.imageUrl);
    }

    public final int hashCode() {
        return this.imageUrl.hashCode() + b.c(this.title.hashCode() * 31, 31, this.description);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.description;
        return a.o(a.v("InfoSectionItem(title=", str, ", description=", str2, ", imageUrl="), this.imageUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.imageUrl);
    }
}

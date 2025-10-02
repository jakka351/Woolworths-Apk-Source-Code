package au.com.woolworths.feature.shop.banners.imagetextbanner.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/banners/imagetextbanner/data/ImageTextBanner;", "Landroid/os/Parcelable;", "", "imageUrl", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "banners_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ImageTextBanner implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ImageTextBanner> CREATOR = new Creator();

    @SerializedName("imageUrl")
    @NotNull
    private final String imageUrl;

    @SerializedName("message")
    @NotNull
    private final String message;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageTextBanner> {
        @Override // android.os.Parcelable.Creator
        public final ImageTextBanner createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ImageTextBanner(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageTextBanner[] newArray(int i) {
            return new ImageTextBanner[i];
        }
    }

    public ImageTextBanner(@NotNull String imageUrl, @NotNull String message) {
        Intrinsics.h(imageUrl, "imageUrl");
        Intrinsics.h(message, "message");
        this.imageUrl = imageUrl;
        this.message = message;
    }

    /* renamed from: a, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageTextBanner)) {
            return false;
        }
        ImageTextBanner imageTextBanner = (ImageTextBanner) obj;
        return Intrinsics.c(this.imageUrl, imageTextBanner.imageUrl) && Intrinsics.c(this.message, imageTextBanner.message);
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.imageUrl.hashCode() * 31);
    }

    public final String toString() {
        return a.j("ImageTextBanner(imageUrl=", this.imageUrl, ", message=", this.message, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.imageUrl);
        dest.writeString(this.message);
    }
}

package au.com.woolworths.shop.deliveryunlimited.signup.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;", "Landroid/os/Parcelable;", "", TextBundle.TEXT_ENTRY, "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscribeLink implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeliveryUnlimitedSubscribeLink> CREATOR = new Creator();

    @SerializedName(TextBundle.TEXT_ENTRY)
    @NotNull
    private final String text;

    @SerializedName("url")
    @NotNull
    private final String url;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryUnlimitedSubscribeLink> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSubscribeLink createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new DeliveryUnlimitedSubscribeLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSubscribeLink[] newArray(int i) {
            return new DeliveryUnlimitedSubscribeLink[i];
        }
    }

    public DeliveryUnlimitedSubscribeLink(@NotNull String text, @NotNull String url) {
        Intrinsics.h(text, "text");
        Intrinsics.h(url, "url");
        this.text = text;
        this.url = url;
    }

    /* renamed from: a, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSubscribeLink)) {
            return false;
        }
        DeliveryUnlimitedSubscribeLink deliveryUnlimitedSubscribeLink = (DeliveryUnlimitedSubscribeLink) obj;
        return Intrinsics.c(this.text, deliveryUnlimitedSubscribeLink.text) && Intrinsics.c(this.url, deliveryUnlimitedSubscribeLink.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return a.j("DeliveryUnlimitedSubscribeLink(text=", this.text, ", url=", this.url, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.text);
        dest.writeString(this.url);
    }
}

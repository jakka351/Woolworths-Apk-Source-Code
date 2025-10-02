package au.com.woolworths.shop.deliveryunlimited.signup.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpLandingFeature;", "Landroid/os/Parcelable;", "", "title", "iconUrl", lqlqqlq.mmm006Dm006Dm, "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "a", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;", "c", "()Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSignUpLandingFeature implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeliveryUnlimitedSignUpLandingFeature> CREATOR = new Creator();

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName("link")
    @Nullable
    private final DeliveryUnlimitedSubscribeLink link;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryUnlimitedSignUpLandingFeature> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpLandingFeature createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new DeliveryUnlimitedSignUpLandingFeature(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DeliveryUnlimitedSubscribeLink.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpLandingFeature[] newArray(int i) {
            return new DeliveryUnlimitedSignUpLandingFeature[i];
        }
    }

    public DeliveryUnlimitedSignUpLandingFeature(@NotNull String title, @Nullable String str, @NotNull String description, @Nullable DeliveryUnlimitedSubscribeLink deliveryUnlimitedSubscribeLink) {
        Intrinsics.h(title, "title");
        Intrinsics.h(description, "description");
        this.title = title;
        this.iconUrl = str;
        this.description = description;
        this.link = deliveryUnlimitedSubscribeLink;
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
    public final DeliveryUnlimitedSubscribeLink getLink() {
        return this.link;
    }

    /* renamed from: d, reason: from getter */
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
        if (!(obj instanceof DeliveryUnlimitedSignUpLandingFeature)) {
            return false;
        }
        DeliveryUnlimitedSignUpLandingFeature deliveryUnlimitedSignUpLandingFeature = (DeliveryUnlimitedSignUpLandingFeature) obj;
        return Intrinsics.c(this.title, deliveryUnlimitedSignUpLandingFeature.title) && Intrinsics.c(this.iconUrl, deliveryUnlimitedSignUpLandingFeature.iconUrl) && Intrinsics.c(this.description, deliveryUnlimitedSignUpLandingFeature.description) && Intrinsics.c(this.link, deliveryUnlimitedSignUpLandingFeature.link);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.iconUrl;
        int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.description);
        DeliveryUnlimitedSubscribeLink deliveryUnlimitedSubscribeLink = this.link;
        return iC + (deliveryUnlimitedSubscribeLink != null ? deliveryUnlimitedSubscribeLink.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.iconUrl;
        String str3 = this.description;
        DeliveryUnlimitedSubscribeLink deliveryUnlimitedSubscribeLink = this.link;
        StringBuilder sbV = a.v("DeliveryUnlimitedSignUpLandingFeature(title=", str, ", iconUrl=", str2, ", description=");
        sbV.append(str3);
        sbV.append(", link=");
        sbV.append(deliveryUnlimitedSubscribeLink);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.iconUrl);
        dest.writeString(this.description);
        DeliveryUnlimitedSubscribeLink deliveryUnlimitedSubscribeLink = this.link;
        if (deliveryUnlimitedSubscribeLink == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deliveryUnlimitedSubscribeLink.writeToParcel(dest, i);
        }
    }
}

package au.com.woolworths.shop.deliveryunlimited.signup.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;", "Landroid/os/Parcelable;", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "button", "", "disclaimer", "<init>", "(Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;Ljava/lang/String;)V", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "a", "()Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSignUpFooter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeliveryUnlimitedSignUpFooter> CREATOR = new Creator();

    @SerializedName("button")
    @NotNull
    private final ButtonApiData button;

    @SerializedName("disclaimer")
    @NotNull
    private final String disclaimer;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryUnlimitedSignUpFooter> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpFooter createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new DeliveryUnlimitedSignUpFooter((ButtonApiData) parcel.readParcelable(DeliveryUnlimitedSignUpFooter.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpFooter[] newArray(int i) {
            return new DeliveryUnlimitedSignUpFooter[i];
        }
    }

    public DeliveryUnlimitedSignUpFooter(@NotNull ButtonApiData button, @NotNull String disclaimer) {
        Intrinsics.h(button, "button");
        Intrinsics.h(disclaimer, "disclaimer");
        this.button = button;
        this.disclaimer = disclaimer;
    }

    /* renamed from: a, reason: from getter */
    public final ButtonApiData getButton() {
        return this.button;
    }

    /* renamed from: b, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSignUpFooter)) {
            return false;
        }
        DeliveryUnlimitedSignUpFooter deliveryUnlimitedSignUpFooter = (DeliveryUnlimitedSignUpFooter) obj;
        return Intrinsics.c(this.button, deliveryUnlimitedSignUpFooter.button) && Intrinsics.c(this.disclaimer, deliveryUnlimitedSignUpFooter.disclaimer);
    }

    public final int hashCode() {
        return this.disclaimer.hashCode() + (this.button.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryUnlimitedSignUpFooter(button=" + this.button + ", disclaimer=" + this.disclaimer + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.button, i);
        dest.writeString(this.disclaimer);
    }
}

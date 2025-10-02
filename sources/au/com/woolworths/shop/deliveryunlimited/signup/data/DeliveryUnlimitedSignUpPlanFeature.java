package au.com.woolworths.shop.deliveryunlimited.signup.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlanFeature;", "Landroid/os/Parcelable;", "", "iconUrl", lqlqqlq.mmm006Dm006Dm, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSignUpPlanFeature implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeliveryUnlimitedSignUpPlanFeature> CREATOR = new Creator();

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryUnlimitedSignUpPlanFeature> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpPlanFeature createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new DeliveryUnlimitedSignUpPlanFeature(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpPlanFeature[] newArray(int i) {
            return new DeliveryUnlimitedSignUpPlanFeature[i];
        }
    }

    public DeliveryUnlimitedSignUpPlanFeature(@Nullable String str, @NotNull String description) {
        Intrinsics.h(description, "description");
        this.iconUrl = str;
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSignUpPlanFeature)) {
            return false;
        }
        DeliveryUnlimitedSignUpPlanFeature deliveryUnlimitedSignUpPlanFeature = (DeliveryUnlimitedSignUpPlanFeature) obj;
        return Intrinsics.c(this.iconUrl, deliveryUnlimitedSignUpPlanFeature.iconUrl) && Intrinsics.c(this.description, deliveryUnlimitedSignUpPlanFeature.description);
    }

    public final int hashCode() {
        String str = this.iconUrl;
        return this.description.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return a.j("DeliveryUnlimitedSignUpPlanFeature(iconUrl=", this.iconUrl, ", description=", this.description, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.iconUrl);
        dest.writeString(this.description);
    }
}

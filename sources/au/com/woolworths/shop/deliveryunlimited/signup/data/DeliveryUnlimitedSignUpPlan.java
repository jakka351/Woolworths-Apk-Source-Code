package au.com.woolworths.shop.deliveryunlimited.signup.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlan;", "Landroid/os/Parcelable;", "", "identifier", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "", "price", "Lau/com/woolworths/base/shopapp/modules/badge/BadgeApiData;", "badge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILau/com/woolworths/base/shopapp/modules/badge/BadgeApiData;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "d", "I", "c", "()I", "Lau/com/woolworths/base/shopapp/modules/badge/BadgeApiData;", "a", "()Lau/com/woolworths/base/shopapp/modules/badge/BadgeApiData;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSignUpPlan implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeliveryUnlimitedSignUpPlan> CREATOR = new Creator();

    @SerializedName("badge")
    @Nullable
    private final BadgeApiData badge;

    @SerializedName("identifier")
    @NotNull
    private final String identifier;

    @SerializedName("price")
    private final int price;

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @NotNull
    private final String subtitle;

    @SerializedName("planTitle")
    @MappedName
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryUnlimitedSignUpPlan> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpPlan createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new DeliveryUnlimitedSignUpPlan(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (BadgeApiData) parcel.readParcelable(DeliveryUnlimitedSignUpPlan.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpPlan[] newArray(int i) {
            return new DeliveryUnlimitedSignUpPlan[i];
        }
    }

    public DeliveryUnlimitedSignUpPlan(@NotNull String identifier, @NotNull String title, @NotNull String subtitle, int i, @Nullable BadgeApiData badgeApiData) {
        Intrinsics.h(identifier, "identifier");
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        this.identifier = identifier;
        this.title = title;
        this.subtitle = subtitle;
        this.price = i;
        this.badge = badgeApiData;
    }

    /* renamed from: a, reason: from getter */
    public final BadgeApiData getBadge() {
        return this.badge;
    }

    /* renamed from: b, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: c, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSignUpPlan)) {
            return false;
        }
        DeliveryUnlimitedSignUpPlan deliveryUnlimitedSignUpPlan = (DeliveryUnlimitedSignUpPlan) obj;
        return Intrinsics.c(this.identifier, deliveryUnlimitedSignUpPlan.identifier) && Intrinsics.c(this.title, deliveryUnlimitedSignUpPlan.title) && Intrinsics.c(this.subtitle, deliveryUnlimitedSignUpPlan.subtitle) && this.price == deliveryUnlimitedSignUpPlan.price && Intrinsics.c(this.badge, deliveryUnlimitedSignUpPlan.badge);
    }

    public final int hashCode() {
        int iA = b.a(this.price, b.c(b.c(this.identifier.hashCode() * 31, 31, this.title), 31, this.subtitle), 31);
        BadgeApiData badgeApiData = this.badge;
        return iA + (badgeApiData == null ? 0 : badgeApiData.hashCode());
    }

    public final String toString() {
        String str = this.identifier;
        String str2 = this.title;
        String str3 = this.subtitle;
        int i = this.price;
        BadgeApiData badgeApiData = this.badge;
        StringBuilder sbV = a.v("DeliveryUnlimitedSignUpPlan(identifier=", str, ", title=", str2, ", subtitle=");
        a.x(i, str3, ", price=", ", badge=", sbV);
        sbV.append(badgeApiData);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.identifier);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeInt(this.price);
        dest.writeParcelable(this.badge, i);
    }
}

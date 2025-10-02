package au.com.woolworths.shop.deliveryunlimited.signup.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTermItem;", "Landroid/os/Parcelable;", "", "title", "", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;", "link", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscribeTermItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeliveryUnlimitedSubscribeTermItem> CREATOR = new Creator();

    @SerializedName("links")
    @MappedName
    @NotNull
    private final List<DeliveryUnlimitedSubscribeLink> link;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryUnlimitedSubscribeTermItem> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSubscribeTermItem createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(DeliveryUnlimitedSubscribeLink.CREATOR, parcel, arrayList, iE, 1);
            }
            return new DeliveryUnlimitedSubscribeTermItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSubscribeTermItem[] newArray(int i) {
            return new DeliveryUnlimitedSubscribeTermItem[i];
        }
    }

    public DeliveryUnlimitedSubscribeTermItem(@NotNull String title, @NotNull List<DeliveryUnlimitedSubscribeLink> link) {
        Intrinsics.h(title, "title");
        Intrinsics.h(link, "link");
        this.title = title;
        this.link = link;
    }

    /* renamed from: a, reason: from getter */
    public final List getLink() {
        return this.link;
    }

    /* renamed from: b, reason: from getter */
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
        if (!(obj instanceof DeliveryUnlimitedSubscribeTermItem)) {
            return false;
        }
        DeliveryUnlimitedSubscribeTermItem deliveryUnlimitedSubscribeTermItem = (DeliveryUnlimitedSubscribeTermItem) obj;
        return Intrinsics.c(this.title, deliveryUnlimitedSubscribeTermItem.title) && Intrinsics.c(this.link, deliveryUnlimitedSubscribeTermItem.link);
    }

    public final int hashCode() {
        return this.link.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.i("DeliveryUnlimitedSubscribeTermItem(title=", this.title, ", link=", ")", this.link);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.link, dest);
        while (itU.hasNext()) {
            ((DeliveryUnlimitedSubscribeLink) itU.next()).writeToParcel(dest, i);
        }
    }
}

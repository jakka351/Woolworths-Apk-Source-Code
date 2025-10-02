package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeVariant;", "Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeVariantBase;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeVariant implements ShoppingModeVariantBase {

    @NotNull
    public static final Parcelable.Creator<ShoppingModeVariant> CREATOR = new Creator();
    public final ShoppingModeIdData d;
    public final String e;
    public final String f;
    public final ShoppingModeVariantStateData g;
    public final DeliveryWindowStatusData h;
    public final PriceBase i;
    public final Object j;
    public final BadgeApiData k;
    public final String l;
    public final Integer m;
    public final List n;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShoppingModeVariant> {
        @Override // android.os.Parcelable.Creator
        public final ShoppingModeVariant createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.h(parcel, "parcel");
            ShoppingModeIdData shoppingModeIdDataValueOf = ShoppingModeIdData.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            ShoppingModeVariantStateData shoppingModeVariantStateDataValueOf = ShoppingModeVariantStateData.valueOf(parcel.readString());
            DeliveryWindowStatusData deliveryWindowStatusDataValueOf = parcel.readInt() == 0 ? null : DeliveryWindowStatusData.valueOf(parcel.readString());
            PriceBase priceBase = (PriceBase) parcel.readParcelable(ShoppingModeVariant.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(Condition.CREATOR, parcel, arrayList2, iE, 1);
            }
            BadgeApiData badgeApiDataCreateFromParcel = parcel.readInt() == 0 ? null : BadgeApiData.CREATOR.createFromParcel(parcel);
            int iA = 0;
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                while (iA != i2) {
                    iA = au.com.woolworths.android.onesite.a.a(ShoppingModeVariant.class, parcel, arrayList3, iA, 1);
                }
                arrayList = arrayList3;
            }
            return new ShoppingModeVariant(shoppingModeIdDataValueOf, string, string2, shoppingModeVariantStateDataValueOf, deliveryWindowStatusDataValueOf, priceBase, arrayList2, badgeApiDataCreateFromParcel, string3, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShoppingModeVariant[] newArray(int i) {
            return new ShoppingModeVariant[i];
        }
    }

    public ShoppingModeVariant(ShoppingModeIdData id, String title, String subtitle, ShoppingModeVariantStateData state, DeliveryWindowStatusData deliveryWindowStatusData, PriceBase priceBase, List list, BadgeApiData badgeApiData, String str, Integer num, List list2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(state, "state");
        this.d = id;
        this.e = title;
        this.f = subtitle;
        this.g = state;
        this.h = deliveryWindowStatusData;
        this.i = priceBase;
        this.j = list;
        this.k = badgeApiData;
        this.l = str;
        this.m = num;
        this.n = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeVariant)) {
            return false;
        }
        ShoppingModeVariant shoppingModeVariant = (ShoppingModeVariant) obj;
        return this.d == shoppingModeVariant.d && Intrinsics.c(this.e, shoppingModeVariant.e) && Intrinsics.c(this.f, shoppingModeVariant.f) && this.g == shoppingModeVariant.g && this.h == shoppingModeVariant.h && Intrinsics.c(this.i, shoppingModeVariant.i) && this.j.equals(shoppingModeVariant.j) && Intrinsics.c(this.k, shoppingModeVariant.k) && Intrinsics.c(this.l, shoppingModeVariant.l) && Intrinsics.c(this.m, shoppingModeVariant.m) && Intrinsics.c(this.n, shoppingModeVariant.n);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f)) * 31;
        DeliveryWindowStatusData deliveryWindowStatusData = this.h;
        int iHashCode2 = (iHashCode + (deliveryWindowStatusData == null ? 0 : deliveryWindowStatusData.hashCode())) * 31;
        PriceBase priceBase = this.i;
        int iE = android.support.v4.media.session.a.e((iHashCode2 + (priceBase == null ? 0 : priceBase.hashCode())) * 31, 31, this.j);
        BadgeApiData badgeApiData = this.k;
        int iHashCode3 = (iE + (badgeApiData == null ? 0 : badgeApiData.hashCode())) * 31;
        String str = this.l;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.m;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.n;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShoppingModeVariant(id=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", status=");
        sb.append(this.h);
        sb.append(", price=");
        sb.append(this.i);
        sb.append(", conditions=");
        sb.append(this.j);
        sb.append(", badge=");
        sb.append(this.k);
        sb.append(", footnote=");
        sb.append(this.l);
        sb.append(", expressDeliveryStoreId=");
        sb.append(this.m);
        sb.append(", fulfilmentWindows=");
        return android.support.v4.media.session.a.t(sb, this.n, ")");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g.name());
        DeliveryWindowStatusData deliveryWindowStatusData = this.h;
        if (deliveryWindowStatusData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(deliveryWindowStatusData.name());
        }
        dest.writeParcelable(this.i, i);
        ?? r2 = this.j;
        dest.writeInt(r2.size());
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            ((Condition) it.next()).writeToParcel(dest, i);
        }
        BadgeApiData badgeApiData = this.k;
        if (badgeApiData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            badgeApiData.writeToParcel(dest, i);
        }
        dest.writeString(this.l);
        Integer num = this.m;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        List list = this.n;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable((Parcelable) it2.next(), i);
        }
    }
}

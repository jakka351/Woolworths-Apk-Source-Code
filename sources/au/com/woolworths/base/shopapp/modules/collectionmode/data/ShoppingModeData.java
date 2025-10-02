package au.com.woolworths.base.shopapp.modules.collectionmode.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeData;", "Lau/com/woolworths/base/shopapp/modules/collectionmode/data/ShoppingModeBase;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShoppingModeData implements ShoppingModeBase {

    @NotNull
    public static final Parcelable.Creator<ShoppingModeData> CREATOR = new Creator();
    public final ShoppingModeTypeData d;
    public final String e;
    public final ArrayList f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShoppingModeData> {
        @Override // android.os.Parcelable.Creator
        public final ShoppingModeData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            ShoppingModeTypeData shoppingModeTypeDataValueOf = ShoppingModeTypeData.valueOf(parcel.readString());
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(ShoppingModeData.class, parcel, arrayList, iA, 1);
            }
            return new ShoppingModeData(shoppingModeTypeDataValueOf, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShoppingModeData[] newArray(int i) {
            return new ShoppingModeData[i];
        }
    }

    public ShoppingModeData(ShoppingModeTypeData type, String title, ArrayList arrayList) {
        Intrinsics.h(type, "type");
        Intrinsics.h(title, "title");
        this.d = type;
        this.e = title;
        this.f = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingModeData)) {
            return false;
        }
        ShoppingModeData shoppingModeData = (ShoppingModeData) obj;
        return this.d == shoppingModeData.d && Intrinsics.c(this.e, shoppingModeData.e) && this.f.equals(shoppingModeData.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShoppingModeData(type=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", variants=");
        return android.support.v4.media.session.a.q(")", sb, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        ArrayList arrayList = this.f;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), i);
        }
    }
}

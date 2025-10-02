package au.com.woolworths.android.onesite.products.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/products/models/ListExtras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ListExtras implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ListExtras> CREATOR = new Creator();
    public final ListLaunchSource d;
    public final int e;
    public final List f;
    public final int g;
    public final boolean h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ListExtras> {
        @Override // android.os.Parcelable.Creator
        public final ListExtras createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            ListLaunchSource listLaunchSourceCreateFromParcel = ListLaunchSource.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iE = 0;
            while (true) {
                if (iE == i2) {
                    break;
                }
                iE = a.e(ScanNGoCartProductInfo.CREATOR, parcel, arrayList, iE, 1);
            }
            return new ListExtras(listLaunchSourceCreateFromParcel, i, arrayList, parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ListExtras[] newArray(int i) {
            return new ListExtras[i];
        }
    }

    public /* synthetic */ ListExtras(int i) {
        this(ListLaunchSource.d, -1, EmptyList.d, 0, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListExtras)) {
            return false;
        }
        ListExtras listExtras = (ListExtras) obj;
        return this.d == listExtras.d && this.e == listExtras.e && Intrinsics.c(this.f, listExtras.f) && this.g == listExtras.g && this.h == listExtras.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + b.a(this.g, b.d(b.a(this.e, this.d.hashCode() * 31, 31), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListExtras(listLaunchSource=");
        sb.append(this.d);
        sb.append(", sngStoreId=");
        sb.append(this.e);
        sb.append(", sngCartProductInfoList=");
        sb.append(this.f);
        sb.append(", sngCartQuantity=");
        sb.append(this.g);
        sb.append(", listAutoCheckOff=");
        return YU.a.k(")", sb, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        this.d.writeToParcel(dest, i);
        dest.writeInt(this.e);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.f, dest);
        while (itU.hasNext()) {
            ((ScanNGoCartProductInfo) itU.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.g);
        dest.writeInt(this.h ? 1 : 0);
    }

    public ListExtras(ListLaunchSource listLaunchSource, int i, List sngCartProductInfoList, int i2, boolean z) {
        Intrinsics.h(listLaunchSource, "listLaunchSource");
        Intrinsics.h(sngCartProductInfoList, "sngCartProductInfoList");
        this.d = listLaunchSource;
        this.e = i;
        this.f = sngCartProductInfoList;
        this.g = i2;
        this.h = z;
    }
}

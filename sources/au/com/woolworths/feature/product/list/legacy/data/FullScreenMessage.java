package au.com.woolworths.feature.product.list.legacy.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/data/FullScreenMessage;", "Lau/com/woolworths/feature/product/list/legacy/data/CustomMessage;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FullScreenMessage implements CustomMessage, Parcelable {

    @NotNull
    public static final Parcelable.Creator<FullScreenMessage> CREATOR = new Creator();
    public final String d;
    public final String e;
    public final DownloadableAsset f;
    public final ArrayList g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FullScreenMessage> {
        @Override // android.os.Parcelable.Creator
        public final FullScreenMessage createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            DownloadableAsset downloadableAsset = (DownloadableAsset) parcel.readParcelable(FullScreenMessage.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(FullScreenMessage.class, parcel, arrayList, iA, 1);
            }
            return new FullScreenMessage(string, string2, downloadableAsset, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FullScreenMessage[] newArray(int i) {
            return new FullScreenMessage[i];
        }
    }

    public FullScreenMessage(String str, String str2, DownloadableAsset downloadableAsset, ArrayList arrayList) {
        this.d = str;
        this.e = str2;
        this.f = downloadableAsset;
        this.g = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullScreenMessage)) {
            return false;
        }
        FullScreenMessage fullScreenMessage = (FullScreenMessage) obj;
        return Intrinsics.c(this.d, fullScreenMessage.d) && Intrinsics.c(this.e, fullScreenMessage.e) && Intrinsics.c(this.f, fullScreenMessage.f) && this.g.equals(fullScreenMessage.g);
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DownloadableAsset downloadableAsset = this.f;
        return this.g.hashCode() + ((iHashCode2 + (downloadableAsset != null ? downloadableAsset.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("FullScreenMessage(title=", this.d, ", description=", this.e, ", messageAsset=");
        sbV.append(this.f);
        sbV.append(", buttons=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        ArrayList arrayList = this.g;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), i);
        }
    }
}

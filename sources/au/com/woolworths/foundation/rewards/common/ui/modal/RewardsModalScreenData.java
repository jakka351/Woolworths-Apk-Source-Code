package au.com.woolworths.foundation.rewards.common.ui.modal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.rewards.base.info.FeatureInfoFooter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/common/ui/modal/RewardsModalScreenData;", "Landroid/os/Parcelable;", "common-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsModalScreenData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardsModalScreenData> CREATOR = new Creator();
    public final DownloadableAsset d;
    public final String e;
    public final String f;
    public final List g;
    public final FeatureInfoFooter h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsModalScreenData> {
        @Override // android.os.Parcelable.Creator
        public final RewardsModalScreenData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            DownloadableAsset downloadableAsset = (DownloadableAsset) parcel.readParcelable(RewardsModalScreenData.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = a.a(RewardsModalScreenData.class, parcel, arrayList, iA, 1);
            }
            return new RewardsModalScreenData(downloadableAsset, string, string2, arrayList, (FeatureInfoFooter) parcel.readParcelable(RewardsModalScreenData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsModalScreenData[] newArray(int i) {
            return new RewardsModalScreenData[i];
        }
    }

    public RewardsModalScreenData(DownloadableAsset downloadableAsset, String title, String summary, List infoItems, FeatureInfoFooter featureInfoFooter) {
        Intrinsics.h(title, "title");
        Intrinsics.h(summary, "summary");
        Intrinsics.h(infoItems, "infoItems");
        this.d = downloadableAsset;
        this.e = title;
        this.f = summary;
        this.g = infoItems;
        this.h = featureInfoFooter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsModalScreenData)) {
            return false;
        }
        RewardsModalScreenData rewardsModalScreenData = (RewardsModalScreenData) obj;
        return Intrinsics.c(this.d, rewardsModalScreenData.d) && Intrinsics.c(this.e, rewardsModalScreenData.e) && Intrinsics.c(this.f, rewardsModalScreenData.f) && Intrinsics.c(this.g, rewardsModalScreenData.g) && Intrinsics.c(this.h, rewardsModalScreenData.h);
    }

    public final int hashCode() {
        DownloadableAsset downloadableAsset = this.d;
        int iD = b.d(b.c(b.c((downloadableAsset == null ? 0 : downloadableAsset.hashCode()) * 31, 31, this.e), 31, this.f), 31, this.g);
        FeatureInfoFooter featureInfoFooter = this.h;
        return iD + (featureInfoFooter != null ? featureInfoFooter.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RewardsModalScreenData(headerImage=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", summary=");
        a.B(sb, this.f, ", infoItems=", this.g, ", footer=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Iterator itU = a.u(this.g, dest);
        while (itU.hasNext()) {
            dest.writeParcelable((Parcelable) itU.next(), i);
        }
        dest.writeParcelable(this.h, i);
    }
}

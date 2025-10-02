package au.com.woolworths.foundation.rewards.offers.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
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
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferMechanics;", "Landroid/os/Parcelable;", "", "displayLastUpdated", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferMechanicsSeparatorIcon;", "separator", "", "selectedIndex", "", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferMechanicItem;", "mechanicsItems", "<init>", "(Ljava/lang/String;Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferMechanicsSeparatorIcon;ILjava/util/List;)V", "Ljava/lang/String;", "getDisplayLastUpdated", "()Ljava/lang/String;", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferMechanicsSeparatorIcon;", "b", "()Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferMechanicsSeparatorIcon;", "I", "getSelectedIndex", "()I", "Ljava/util/List;", "a", "()Ljava/util/List;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsOfferMechanics implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardsOfferMechanics> CREATOR = new Creator();

    @SerializedName("displayLastUpdated")
    @Nullable
    private final String displayLastUpdated;

    @SerializedName("items")
    @MappedName
    @NotNull
    private final List<RewardsOfferMechanicItem> mechanicsItems;

    @SerializedName("selectedIndex")
    private final int selectedIndex;

    @SerializedName("separator")
    @NotNull
    private final RewardsOfferMechanicsSeparatorIcon separator;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsOfferMechanics> {
        @Override // android.os.Parcelable.Creator
        public final RewardsOfferMechanics createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            RewardsOfferMechanicsSeparatorIcon rewardsOfferMechanicsSeparatorIconCreateFromParcel = RewardsOfferMechanicsSeparatorIcon.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iE = 0;
            while (iE != i2) {
                iE = a.e(RewardsOfferMechanicItem.CREATOR, parcel, arrayList, iE, 1);
            }
            return new RewardsOfferMechanics(string, rewardsOfferMechanicsSeparatorIconCreateFromParcel, i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsOfferMechanics[] newArray(int i) {
            return new RewardsOfferMechanics[i];
        }
    }

    public RewardsOfferMechanics(@Nullable String str, @NotNull RewardsOfferMechanicsSeparatorIcon separator, int i, @NotNull List<RewardsOfferMechanicItem> mechanicsItems) {
        Intrinsics.h(separator, "separator");
        Intrinsics.h(mechanicsItems, "mechanicsItems");
        this.displayLastUpdated = str;
        this.separator = separator;
        this.selectedIndex = i;
        this.mechanicsItems = mechanicsItems;
    }

    /* renamed from: a, reason: from getter */
    public final List getMechanicsItems() {
        return this.mechanicsItems;
    }

    /* renamed from: b, reason: from getter */
    public final RewardsOfferMechanicsSeparatorIcon getSeparator() {
        return this.separator;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOfferMechanics)) {
            return false;
        }
        RewardsOfferMechanics rewardsOfferMechanics = (RewardsOfferMechanics) obj;
        return Intrinsics.c(this.displayLastUpdated, rewardsOfferMechanics.displayLastUpdated) && this.separator == rewardsOfferMechanics.separator && this.selectedIndex == rewardsOfferMechanics.selectedIndex && Intrinsics.c(this.mechanicsItems, rewardsOfferMechanics.mechanicsItems);
    }

    public final int hashCode() {
        String str = this.displayLastUpdated;
        return this.mechanicsItems.hashCode() + b.a(this.selectedIndex, (this.separator.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        return "RewardsOfferMechanics(displayLastUpdated=" + this.displayLastUpdated + ", separator=" + this.separator + ", selectedIndex=" + this.selectedIndex + ", mechanicsItems=" + this.mechanicsItems + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.displayLastUpdated);
        this.separator.writeToParcel(dest, i);
        dest.writeInt(this.selectedIndex);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.mechanicsItems, dest);
        while (itU.hasNext()) {
            ((RewardsOfferMechanicItem) itU.next()).writeToParcel(dest, i);
        }
    }
}

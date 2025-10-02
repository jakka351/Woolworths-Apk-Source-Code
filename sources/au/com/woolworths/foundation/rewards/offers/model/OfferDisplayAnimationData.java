package au.com.woolworths.foundation.rewards.offers.model;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.graphql.MappedValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDisplayAnimationData;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferDisplayAnimationData implements Parcelable {

    @MappedValue
    @SerializedName("BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP")
    public static final OfferDisplayAnimationData BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP;

    @NotNull
    public static final Parcelable.Creator<OfferDisplayAnimationData> CREATOR;
    public static final OfferDisplayAnimationData d;
    public static final /* synthetic */ OfferDisplayAnimationData[] e;
    public static final /* synthetic */ EnumEntries f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfferDisplayAnimationData> {
        @Override // android.os.Parcelable.Creator
        public final OfferDisplayAnimationData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return OfferDisplayAnimationData.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OfferDisplayAnimationData[] newArray(int i) {
            return new OfferDisplayAnimationData[i];
        }
    }

    static {
        OfferDisplayAnimationData offerDisplayAnimationData = new OfferDisplayAnimationData("BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP", 0);
        BOX_WITH_SPARKLES_CONFETTI_AND_BOW_ON_TOP = offerDisplayAnimationData;
        OfferDisplayAnimationData offerDisplayAnimationData2 = new OfferDisplayAnimationData("UNKNOWN", 1);
        d = offerDisplayAnimationData2;
        OfferDisplayAnimationData[] offerDisplayAnimationDataArr = {offerDisplayAnimationData, offerDisplayAnimationData2};
        e = offerDisplayAnimationDataArr;
        f = EnumEntriesKt.a(offerDisplayAnimationDataArr);
        CREATOR = new Creator();
    }

    private OfferDisplayAnimationData(String str, int i) {
    }

    public static OfferDisplayAnimationData valueOf(String str) {
        return (OfferDisplayAnimationData) Enum.valueOf(OfferDisplayAnimationData.class, str);
    }

    public static OfferDisplayAnimationData[] values() {
        return (OfferDisplayAnimationData[]) e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}

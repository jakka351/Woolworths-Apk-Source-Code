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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferActivationAnimationData;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONFETTI", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfferActivationAnimationData implements Parcelable {

    @MappedValue
    @SerializedName("CONFETTI")
    public static final OfferActivationAnimationData CONFETTI;

    @NotNull
    public static final Parcelable.Creator<OfferActivationAnimationData> CREATOR;
    public static final OfferActivationAnimationData d;
    public static final /* synthetic */ OfferActivationAnimationData[] e;
    public static final /* synthetic */ EnumEntries f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfferActivationAnimationData> {
        @Override // android.os.Parcelable.Creator
        public final OfferActivationAnimationData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return OfferActivationAnimationData.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OfferActivationAnimationData[] newArray(int i) {
            return new OfferActivationAnimationData[i];
        }
    }

    static {
        OfferActivationAnimationData offerActivationAnimationData = new OfferActivationAnimationData("CONFETTI", 0);
        CONFETTI = offerActivationAnimationData;
        OfferActivationAnimationData offerActivationAnimationData2 = new OfferActivationAnimationData("UNKNOWN", 1);
        d = offerActivationAnimationData2;
        OfferActivationAnimationData[] offerActivationAnimationDataArr = {offerActivationAnimationData, offerActivationAnimationData2};
        e = offerActivationAnimationDataArr;
        f = EnumEntriesKt.a(offerActivationAnimationDataArr);
        CREATOR = new Creator();
    }

    private OfferActivationAnimationData(String str, int i) {
    }

    public static OfferActivationAnimationData valueOf(String str) {
        return (OfferActivationAnimationData) Enum.valueOf(OfferActivationAnimationData.class, str);
    }

    public static OfferActivationAnimationData[] values() {
        return (OfferActivationAnimationData[]) e.clone();
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

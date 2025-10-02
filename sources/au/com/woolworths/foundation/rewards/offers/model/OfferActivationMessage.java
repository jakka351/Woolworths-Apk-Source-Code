package au.com.woolworths.foundation.rewards.offers.model;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferActivationMessage;", "Landroid/os/Parcelable;", "", "title", "message", "buttonLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "a", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OfferActivationMessage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OfferActivationMessage> CREATOR = new Creator();

    @SerializedName("buttonLabel")
    @NotNull
    private final String buttonLabel;

    @SerializedName("message")
    @Nullable
    private final String message;

    @SerializedName("title")
    @Nullable
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfferActivationMessage> {
        @Override // android.os.Parcelable.Creator
        public final OfferActivationMessage createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new OfferActivationMessage(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OfferActivationMessage[] newArray(int i) {
            return new OfferActivationMessage[i];
        }
    }

    public OfferActivationMessage(@Nullable String str, @Nullable String str2, @NotNull String buttonLabel) {
        Intrinsics.h(buttonLabel, "buttonLabel");
        this.title = str;
        this.message = str2;
        this.buttonLabel = buttonLabel;
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
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
        if (!(obj instanceof OfferActivationMessage)) {
            return false;
        }
        OfferActivationMessage offerActivationMessage = (OfferActivationMessage) obj;
        return Intrinsics.c(this.title, offerActivationMessage.title) && Intrinsics.c(this.message, offerActivationMessage.message) && Intrinsics.c(this.buttonLabel, offerActivationMessage.buttonLabel);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        return this.buttonLabel.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.message;
        return a.o(a.v("OfferActivationMessage(title=", str, ", message=", str2, ", buttonLabel="), this.buttonLabel, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.message);
        dest.writeString(this.buttonLabel);
    }
}

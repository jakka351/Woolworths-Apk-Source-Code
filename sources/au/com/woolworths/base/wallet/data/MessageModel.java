package au.com.woolworths.base.wallet.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.navigation.Activities;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/base/wallet/data/MessageModel;", "Landroid/os/Parcelable;", "Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletViewSchemeCard$ExtraMessageModel;", "", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "message", "footerText", "Lau/com/woolworths/base/wallet/data/MessageModelCta;", "primaryCta", "secondaryCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/base/wallet/data/MessageModelCta;Lau/com/woolworths/base/wallet/data/MessageModelCta;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getMessage", "getFooterText", "Lau/com/woolworths/base/wallet/data/MessageModelCta;", "getPrimaryCta", "()Lau/com/woolworths/base/wallet/data/MessageModelCta;", "getSecondaryCta", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MessageModel implements Parcelable, Activities.RewardsWalletViewSchemeCard.ExtraMessageModel {

    @NotNull
    public static final Parcelable.Creator<MessageModel> CREATOR = new Creator();

    @SerializedName("footerText")
    @Nullable
    private final String footerText;

    @SerializedName("message")
    @Nullable
    private final String message;

    @SerializedName("primaryCta")
    @Nullable
    private final MessageModelCta primaryCta;

    @SerializedName("secondaryCta")
    @Nullable
    private final MessageModelCta secondaryCta;

    @SerializedName(NotificationMessage.NOTIF_KEY_SUB_TITLE)
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @Nullable
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageModel> {
        @Override // android.os.Parcelable.Creator
        public final MessageModel createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new MessageModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MessageModelCta.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MessageModelCta.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessageModel[] newArray(int i) {
            return new MessageModel[i];
        }
    }

    public MessageModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageModel)) {
            return false;
        }
        MessageModel messageModel = (MessageModel) obj;
        return Intrinsics.c(this.title, messageModel.title) && Intrinsics.c(this.subtitle, messageModel.subtitle) && Intrinsics.c(this.message, messageModel.message) && Intrinsics.c(this.footerText, messageModel.footerText) && Intrinsics.c(this.primaryCta, messageModel.primaryCta) && Intrinsics.c(this.secondaryCta, messageModel.secondaryCta);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.footerText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MessageModelCta messageModelCta = this.primaryCta;
        int iHashCode5 = (iHashCode4 + (messageModelCta == null ? 0 : messageModelCta.hashCode())) * 31;
        MessageModelCta messageModelCta2 = this.secondaryCta;
        return iHashCode5 + (messageModelCta2 != null ? messageModelCta2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.message;
        String str4 = this.footerText;
        MessageModelCta messageModelCta = this.primaryCta;
        MessageModelCta messageModelCta2 = this.secondaryCta;
        StringBuilder sbV = a.v("MessageModel(title=", str, ", subtitle=", str2, ", message=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", footerText=", str4, ", primaryCta=");
        sbV.append(messageModelCta);
        sbV.append(", secondaryCta=");
        sbV.append(messageModelCta2);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.message);
        dest.writeString(this.footerText);
        MessageModelCta messageModelCta = this.primaryCta;
        if (messageModelCta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            messageModelCta.writeToParcel(dest, i);
        }
        MessageModelCta messageModelCta2 = this.secondaryCta;
        if (messageModelCta2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            messageModelCta2.writeToParcel(dest, i);
        }
    }

    public MessageModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable MessageModelCta messageModelCta, @Nullable MessageModelCta messageModelCta2) {
        this.title = str;
        this.subtitle = str2;
        this.message = str3;
        this.footerText = str4;
        this.primaryCta = messageModelCta;
        this.secondaryCta = messageModelCta2;
    }

    public /* synthetic */ MessageModel(String str, String str2, String str3, String str4, MessageModelCta messageModelCta, MessageModelCta messageModelCta2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : messageModelCta, (i & 32) != 0 ? null : messageModelCta2);
    }
}

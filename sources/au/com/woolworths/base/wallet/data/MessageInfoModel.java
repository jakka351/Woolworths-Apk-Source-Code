package au.com.woolworths.base.wallet.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/base/wallet/data/MessageInfoModel;", "Landroid/os/Parcelable;", "", "title", "message", "iconUrl", "Lau/com/woolworths/base/wallet/data/MessageModelCta;", "primaryCta", "secondaryCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/base/wallet/data/MessageModelCta;Lau/com/woolworths/base/wallet/data/MessageModelCta;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getMessage", "getIconUrl", "Lau/com/woolworths/base/wallet/data/MessageModelCta;", "getPrimaryCta", "()Lau/com/woolworths/base/wallet/data/MessageModelCta;", "getSecondaryCta", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MessageInfoModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageInfoModel> CREATOR = new Creator();

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("primaryCta")
    @Nullable
    private final MessageModelCta primaryCta;

    @SerializedName("secondaryCta")
    @Nullable
    private final MessageModelCta secondaryCta;

    @SerializedName("title")
    @Nullable
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageInfoModel> {
        @Override // android.os.Parcelable.Creator
        public final MessageInfoModel createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new MessageInfoModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MessageModelCta.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MessageModelCta.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessageInfoModel[] newArray(int i) {
            return new MessageInfoModel[i];
        }
    }

    public MessageInfoModel(@Nullable String str, @NotNull String message, @Nullable String str2, @Nullable MessageModelCta messageModelCta, @Nullable MessageModelCta messageModelCta2) {
        Intrinsics.h(message, "message");
        this.title = str;
        this.message = message;
        this.iconUrl = str2;
        this.primaryCta = messageModelCta;
        this.secondaryCta = messageModelCta2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfoModel)) {
            return false;
        }
        MessageInfoModel messageInfoModel = (MessageInfoModel) obj;
        return Intrinsics.c(this.title, messageInfoModel.title) && Intrinsics.c(this.message, messageInfoModel.message) && Intrinsics.c(this.iconUrl, messageInfoModel.iconUrl) && Intrinsics.c(this.primaryCta, messageInfoModel.primaryCta) && Intrinsics.c(this.secondaryCta, messageInfoModel.secondaryCta);
    }

    public final int hashCode() {
        String str = this.title;
        int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
        String str2 = this.iconUrl;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        MessageModelCta messageModelCta = this.primaryCta;
        int iHashCode2 = (iHashCode + (messageModelCta == null ? 0 : messageModelCta.hashCode())) * 31;
        MessageModelCta messageModelCta2 = this.secondaryCta;
        return iHashCode2 + (messageModelCta2 != null ? messageModelCta2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.message;
        String str3 = this.iconUrl;
        MessageModelCta messageModelCta = this.primaryCta;
        MessageModelCta messageModelCta2 = this.secondaryCta;
        StringBuilder sbV = a.v("MessageInfoModel(title=", str, ", message=", str2, ", iconUrl=");
        sbV.append(str3);
        sbV.append(", primaryCta=");
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
        dest.writeString(this.message);
        dest.writeString(this.iconUrl);
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

    public /* synthetic */ MessageInfoModel(String str, String str2, String str3, MessageModelCta messageModelCta, MessageModelCta messageModelCta2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : messageModelCta, (i & 16) != 0 ? null : messageModelCta2);
    }
}

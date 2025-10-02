package au.com.woolworths.base.wallet.data;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/base/wallet/data/MessageInfoPageModel;", "Landroid/os/Parcelable;", "Lau/com/woolworths/base/wallet/data/MessageModelCta;", "primaryCta", "Lau/com/woolworths/base/wallet/data/MessageInfoModel;", "messageInfo", "<init>", "(Lau/com/woolworths/base/wallet/data/MessageModelCta;Lau/com/woolworths/base/wallet/data/MessageInfoModel;)V", "Lau/com/woolworths/base/wallet/data/MessageModelCta;", "getPrimaryCta", "()Lau/com/woolworths/base/wallet/data/MessageModelCta;", "Lau/com/woolworths/base/wallet/data/MessageInfoModel;", "getMessageInfo", "()Lau/com/woolworths/base/wallet/data/MessageInfoModel;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MessageInfoPageModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MessageInfoPageModel> CREATOR = new Creator();

    @SerializedName("messageInfo")
    @Nullable
    private final MessageInfoModel messageInfo;

    @SerializedName("primaryCta")
    @Nullable
    private final MessageModelCta primaryCta;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageInfoPageModel> {
        @Override // android.os.Parcelable.Creator
        public final MessageInfoPageModel createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new MessageInfoPageModel(parcel.readInt() == 0 ? null : MessageModelCta.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MessageInfoModel.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessageInfoPageModel[] newArray(int i) {
            return new MessageInfoPageModel[i];
        }
    }

    public MessageInfoPageModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfoPageModel)) {
            return false;
        }
        MessageInfoPageModel messageInfoPageModel = (MessageInfoPageModel) obj;
        return Intrinsics.c(this.primaryCta, messageInfoPageModel.primaryCta) && Intrinsics.c(this.messageInfo, messageInfoPageModel.messageInfo);
    }

    public final int hashCode() {
        MessageModelCta messageModelCta = this.primaryCta;
        int iHashCode = (messageModelCta == null ? 0 : messageModelCta.hashCode()) * 31;
        MessageInfoModel messageInfoModel = this.messageInfo;
        return iHashCode + (messageInfoModel != null ? messageInfoModel.hashCode() : 0);
    }

    public final String toString() {
        return "MessageInfoPageModel(primaryCta=" + this.primaryCta + ", messageInfo=" + this.messageInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        MessageModelCta messageModelCta = this.primaryCta;
        if (messageModelCta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            messageModelCta.writeToParcel(dest, i);
        }
        MessageInfoModel messageInfoModel = this.messageInfo;
        if (messageInfoModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            messageInfoModel.writeToParcel(dest, i);
        }
    }

    public MessageInfoPageModel(@Nullable MessageModelCta messageModelCta, @Nullable MessageInfoModel messageInfoModel) {
        this.primaryCta = messageModelCta;
        this.messageInfo = messageInfoModel;
    }

    public /* synthetic */ MessageInfoPageModel(MessageModelCta messageModelCta, MessageInfoModel messageInfoModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : messageModelCta, (i & 2) != 0 ? null : messageInfoModel);
    }
}

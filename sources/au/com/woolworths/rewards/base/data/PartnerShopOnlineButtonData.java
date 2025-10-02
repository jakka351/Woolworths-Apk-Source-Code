package au.com.woolworths.rewards.base.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/rewards/base/data/PartnerShopOnlineButtonData;", "Landroid/os/Parcelable;", "title", "", "url", "customMessage", "Lau/com/woolworths/rewards/base/data/PartnerCustomMessage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/rewards/base/data/PartnerCustomMessage;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "getCustomMessage", "()Lau/com/woolworths/rewards/base/data/PartnerCustomMessage;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PartnerShopOnlineButtonData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PartnerShopOnlineButtonData> CREATOR = new Creator();

    @SerializedName("customMessage")
    @Nullable
    private final PartnerCustomMessage customMessage;

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("url")
    @NotNull
    private final String url;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PartnerShopOnlineButtonData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnerShopOnlineButtonData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new PartnerShopOnlineButtonData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PartnerCustomMessage.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PartnerShopOnlineButtonData[] newArray(int i) {
            return new PartnerShopOnlineButtonData[i];
        }
    }

    public PartnerShopOnlineButtonData(@NotNull String title, @NotNull String url, @Nullable PartnerCustomMessage partnerCustomMessage) {
        Intrinsics.h(title, "title");
        Intrinsics.h(url, "url");
        this.title = title;
        this.url = url;
        this.customMessage = partnerCustomMessage;
    }

    public static /* synthetic */ PartnerShopOnlineButtonData copy$default(PartnerShopOnlineButtonData partnerShopOnlineButtonData, String str, String str2, PartnerCustomMessage partnerCustomMessage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerShopOnlineButtonData.title;
        }
        if ((i & 2) != 0) {
            str2 = partnerShopOnlineButtonData.url;
        }
        if ((i & 4) != 0) {
            partnerCustomMessage = partnerShopOnlineButtonData.customMessage;
        }
        return partnerShopOnlineButtonData.copy(str, str2, partnerCustomMessage);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final PartnerCustomMessage getCustomMessage() {
        return this.customMessage;
    }

    @NotNull
    public final PartnerShopOnlineButtonData copy(@NotNull String title, @NotNull String url, @Nullable PartnerCustomMessage customMessage) {
        Intrinsics.h(title, "title");
        Intrinsics.h(url, "url");
        return new PartnerShopOnlineButtonData(title, url, customMessage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerShopOnlineButtonData)) {
            return false;
        }
        PartnerShopOnlineButtonData partnerShopOnlineButtonData = (PartnerShopOnlineButtonData) other;
        return Intrinsics.c(this.title, partnerShopOnlineButtonData.title) && Intrinsics.c(this.url, partnerShopOnlineButtonData.url) && Intrinsics.c(this.customMessage, partnerShopOnlineButtonData.customMessage);
    }

    @Nullable
    public final PartnerCustomMessage getCustomMessage() {
        return this.customMessage;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iC = b.c(this.title.hashCode() * 31, 31, this.url);
        PartnerCustomMessage partnerCustomMessage = this.customMessage;
        return iC + (partnerCustomMessage == null ? 0 : partnerCustomMessage.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.url;
        PartnerCustomMessage partnerCustomMessage = this.customMessage;
        StringBuilder sbV = a.v("PartnerShopOnlineButtonData(title=", str, ", url=", str2, ", customMessage=");
        sbV.append(partnerCustomMessage);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.url);
        PartnerCustomMessage partnerCustomMessage = this.customMessage;
        if (partnerCustomMessage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            partnerCustomMessage.writeToParcel(dest, flags);
        }
    }
}

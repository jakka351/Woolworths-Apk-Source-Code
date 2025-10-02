package au.com.woolworths.foundation.rewards.offers.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferMechanicItem;", "Landroid/os/Parcelable;", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsCalendarIcon;", BarcodePickDeserializer.FIELD_ICON, "", "caption", "altText", "title", "<init>", "(Lau/com/woolworths/foundation/rewards/offers/model/RewardsCalendarIcon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsCalendarIcon;", "c", "()Lau/com/woolworths/foundation/rewards/offers/model/RewardsCalendarIcon;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "d", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsOfferMechanicItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardsOfferMechanicItem> CREATOR = new Creator();

    @SerializedName("altText")
    @Nullable
    private final String altText;

    @SerializedName("caption")
    @NotNull
    private final String caption;

    @SerializedName(BarcodePickDeserializer.FIELD_ICON)
    @NotNull
    private final RewardsCalendarIcon icon;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsOfferMechanicItem> {
        @Override // android.os.Parcelable.Creator
        public final RewardsOfferMechanicItem createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsOfferMechanicItem(RewardsCalendarIcon.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsOfferMechanicItem[] newArray(int i) {
            return new RewardsOfferMechanicItem[i];
        }
    }

    public RewardsOfferMechanicItem(@NotNull RewardsCalendarIcon icon, @NotNull String caption, @Nullable String str, @NotNull String title) {
        Intrinsics.h(icon, "icon");
        Intrinsics.h(caption, "caption");
        Intrinsics.h(title, "title");
        this.icon = icon;
        this.caption = caption;
        this.altText = str;
        this.title = title;
    }

    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: b, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* renamed from: c, reason: from getter */
    public final RewardsCalendarIcon getIcon() {
        return this.icon;
    }

    /* renamed from: d, reason: from getter */
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
        if (!(obj instanceof RewardsOfferMechanicItem)) {
            return false;
        }
        RewardsOfferMechanicItem rewardsOfferMechanicItem = (RewardsOfferMechanicItem) obj;
        return this.icon == rewardsOfferMechanicItem.icon && Intrinsics.c(this.caption, rewardsOfferMechanicItem.caption) && Intrinsics.c(this.altText, rewardsOfferMechanicItem.altText) && Intrinsics.c(this.title, rewardsOfferMechanicItem.title);
    }

    public final int hashCode() {
        int iC = b.c(this.icon.hashCode() * 31, 31, this.caption);
        String str = this.altText;
        return this.title.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        RewardsCalendarIcon rewardsCalendarIcon = this.icon;
        String str = this.caption;
        String str2 = this.altText;
        String str3 = this.title;
        StringBuilder sb = new StringBuilder("RewardsOfferMechanicItem(icon=");
        sb.append(rewardsCalendarIcon);
        sb.append(", caption=");
        sb.append(str);
        sb.append(", altText=");
        return a.l(sb, str2, ", title=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        this.icon.writeToParcel(dest, i);
        dest.writeString(this.caption);
        dest.writeString(this.altText);
        dest.writeString(this.title);
    }
}

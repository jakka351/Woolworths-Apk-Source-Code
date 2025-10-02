package au.com.woolworths.shop.deliveryunlimited.signup.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR%\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlanType;", "Landroid/os/Parcelable;", "", "title", "defaultPlanSelection", "", "", "Lkotlinx/parcelize/RawValue;", "feed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSignUpPlanType implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeliveryUnlimitedSignUpPlanType> CREATOR = new Creator();

    @SerializedName("defaultPlanSelection")
    @Nullable
    private final String defaultPlanSelection;

    @SerializedName("feed")
    @NotNull
    private final List<Object> feed;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryUnlimitedSignUpPlanType> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpPlanType createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readValue(DeliveryUnlimitedSignUpPlanType.class.getClassLoader()));
            }
            return new DeliveryUnlimitedSignUpPlanType(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpPlanType[] newArray(int i) {
            return new DeliveryUnlimitedSignUpPlanType[i];
        }
    }

    public DeliveryUnlimitedSignUpPlanType(@NotNull String title, @Nullable String str, @NotNull List<? extends Object> feed) {
        Intrinsics.h(title, "title");
        Intrinsics.h(feed, "feed");
        this.title = title;
        this.defaultPlanSelection = str;
        this.feed = feed;
    }

    /* renamed from: a, reason: from getter */
    public final String getDefaultPlanSelection() {
        return this.defaultPlanSelection;
    }

    /* renamed from: b, reason: from getter */
    public final List getFeed() {
        return this.feed;
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
        if (!(obj instanceof DeliveryUnlimitedSignUpPlanType)) {
            return false;
        }
        DeliveryUnlimitedSignUpPlanType deliveryUnlimitedSignUpPlanType = (DeliveryUnlimitedSignUpPlanType) obj;
        return Intrinsics.c(this.title, deliveryUnlimitedSignUpPlanType.title) && Intrinsics.c(this.defaultPlanSelection, deliveryUnlimitedSignUpPlanType.defaultPlanSelection) && Intrinsics.c(this.feed, deliveryUnlimitedSignUpPlanType.feed);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.defaultPlanSelection;
        return this.feed.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.defaultPlanSelection;
        return a.t(YU.a.v("DeliveryUnlimitedSignUpPlanType(title=", str, ", defaultPlanSelection=", str2, ", feed="), this.feed, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.defaultPlanSelection);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.feed, dest);
        while (itU.hasNext()) {
            dest.writeValue(itU.next());
        }
    }
}

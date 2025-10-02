package au.com.woolworths.shop.deliveryunlimited.signup.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTerms;", "Landroid/os/Parcelable;", "", "title", "", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeTermItem;", "terms", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "button", "Lau/com/woolworths/analytics/model/AnalyticsData;", "impressionAnalytics", "<init>", "(Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "a", "()Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "b", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSubscribeTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeliveryUnlimitedSubscribeTerms> CREATOR = new Creator();

    @SerializedName("button")
    @NotNull
    private final ButtonApiData button;

    @SerializedName("impressionAnalytics")
    @Nullable
    private final AnalyticsData impressionAnalytics;

    @SerializedName("terms")
    @NotNull
    private final List<DeliveryUnlimitedSubscribeTermItem> terms;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryUnlimitedSubscribeTerms> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSubscribeTerms createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(DeliveryUnlimitedSubscribeTermItem.CREATOR, parcel, arrayList, iE, 1);
            }
            return new DeliveryUnlimitedSubscribeTerms(string, arrayList, (ButtonApiData) parcel.readParcelable(DeliveryUnlimitedSubscribeTerms.class.getClassLoader()), (AnalyticsData) parcel.readParcelable(DeliveryUnlimitedSubscribeTerms.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSubscribeTerms[] newArray(int i) {
            return new DeliveryUnlimitedSubscribeTerms[i];
        }
    }

    public DeliveryUnlimitedSubscribeTerms(@NotNull String title, @NotNull List<DeliveryUnlimitedSubscribeTermItem> terms, @NotNull ButtonApiData button, @Nullable AnalyticsData analyticsData) {
        Intrinsics.h(title, "title");
        Intrinsics.h(terms, "terms");
        Intrinsics.h(button, "button");
        this.title = title;
        this.terms = terms;
        this.button = button;
        this.impressionAnalytics = analyticsData;
    }

    /* renamed from: a, reason: from getter */
    public final ButtonApiData getButton() {
        return this.button;
    }

    /* renamed from: b, reason: from getter */
    public final AnalyticsData getImpressionAnalytics() {
        return this.impressionAnalytics;
    }

    /* renamed from: c, reason: from getter */
    public final List getTerms() {
        return this.terms;
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
        if (!(obj instanceof DeliveryUnlimitedSubscribeTerms)) {
            return false;
        }
        DeliveryUnlimitedSubscribeTerms deliveryUnlimitedSubscribeTerms = (DeliveryUnlimitedSubscribeTerms) obj;
        return Intrinsics.c(this.title, deliveryUnlimitedSubscribeTerms.title) && Intrinsics.c(this.terms, deliveryUnlimitedSubscribeTerms.terms) && Intrinsics.c(this.button, deliveryUnlimitedSubscribeTerms.button) && Intrinsics.c(this.impressionAnalytics, deliveryUnlimitedSubscribeTerms.impressionAnalytics);
    }

    public final int hashCode() {
        int iHashCode = (this.button.hashCode() + b.d(this.title.hashCode() * 31, 31, this.terms)) * 31;
        AnalyticsData analyticsData = this.impressionAnalytics;
        return iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode());
    }

    public final String toString() {
        String str = this.title;
        List<DeliveryUnlimitedSubscribeTermItem> list = this.terms;
        ButtonApiData buttonApiData = this.button;
        AnalyticsData analyticsData = this.impressionAnalytics;
        StringBuilder sbS = au.com.woolworths.android.onesite.a.s("DeliveryUnlimitedSubscribeTerms(title=", str, ", terms=", ", button=", list);
        sbS.append(buttonApiData);
        sbS.append(", impressionAnalytics=");
        sbS.append(analyticsData);
        sbS.append(")");
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.terms, dest);
        while (itU.hasNext()) {
            ((DeliveryUnlimitedSubscribeTermItem) itU.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.button, i);
        dest.writeParcelable(this.impressionAnalytics, i);
    }
}

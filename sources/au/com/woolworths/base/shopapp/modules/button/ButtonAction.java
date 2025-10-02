package au.com.woolworths.base.shopapp.modules.button;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.analytics.model.AnalyticsData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/button/ButtonAction;", "Landroid/os/Parcelable;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "analytics", "<init>", "(Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Lau/com/woolworths/analytics/model/AnalyticsData;", "a", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ButtonAction> CREATOR = new Creator();

    @SerializedName("analytics")
    @Nullable
    private final AnalyticsData analytics;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonAction> {
        @Override // android.os.Parcelable.Creator
        public final ButtonAction createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ButtonAction((AnalyticsData) parcel.readParcelable(ButtonAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonAction[] newArray(int i) {
            return new ButtonAction[i];
        }
    }

    public ButtonAction(@Nullable AnalyticsData analyticsData) {
        this.analytics = analyticsData;
    }

    /* renamed from: a, reason: from getter */
    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ButtonAction) && Intrinsics.c(this.analytics, ((ButtonAction) obj).analytics);
    }

    public final int hashCode() {
        AnalyticsData analyticsData = this.analytics;
        if (analyticsData == null) {
            return 0;
        }
        return analyticsData.hashCode();
    }

    public final String toString() {
        return "ButtonAction(analytics=" + this.analytics + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeParcelable(this.analytics, i);
    }
}

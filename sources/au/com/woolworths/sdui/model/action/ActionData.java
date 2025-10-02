package au.com.woolworths.sdui.model.action;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.analytics.model.AnalyticsData;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/sdui/model/action/ActionData;", "Landroid/os/Parcelable;", "", UrlHandler.ACTION, "Lau/com/woolworths/sdui/model/action/ActionType;", "type", "id", "Lau/com/woolworths/analytics/model/AnalyticsData;", "analytics", "<init>", "(Ljava/lang/String;Lau/com/woolworths/sdui/model/action/ActionType;Ljava/lang/String;Lau/com/woolworths/analytics/model/AnalyticsData;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lau/com/woolworths/sdui/model/action/ActionType;", "d", "()Lau/com/woolworths/sdui/model/action/ActionType;", "getId", "Lau/com/woolworths/analytics/model/AnalyticsData;", "c", "()Lau/com/woolworths/analytics/model/AnalyticsData;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ActionData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActionData> CREATOR = new Creator();

    @SerializedName(UrlHandler.ACTION)
    @NotNull
    private final String action;

    @SerializedName("analytics")
    @Nullable
    private final AnalyticsData analytics;

    @SerializedName("id")
    @Nullable
    private final String id;

    @SerializedName("type")
    @NotNull
    private final ActionType type;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ActionData> {
        @Override // android.os.Parcelable.Creator
        public final ActionData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new ActionData(parcel.readString(), ActionType.valueOf(parcel.readString()), parcel.readString(), (AnalyticsData) parcel.readParcelable(ActionData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionData[] newArray(int i) {
            return new ActionData[i];
        }
    }

    public ActionData(@NotNull String action, @NotNull ActionType type, @Nullable String str, @Nullable AnalyticsData analyticsData) {
        Intrinsics.h(action, "action");
        Intrinsics.h(type, "type");
        this.action = action;
        this.type = type;
        this.id = str;
        this.analytics = analyticsData;
    }

    public static ActionData a(ActionData actionData, AnalyticsData analyticsData) {
        String action = actionData.action;
        ActionType type = actionData.type;
        String str = actionData.id;
        actionData.getClass();
        Intrinsics.h(action, "action");
        Intrinsics.h(type, "type");
        return new ActionData(action, type, str, analyticsData);
    }

    /* renamed from: b, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: c, reason: from getter */
    public final AnalyticsData getAnalytics() {
        return this.analytics;
    }

    /* renamed from: d, reason: from getter */
    public final ActionType getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionData)) {
            return false;
        }
        ActionData actionData = (ActionData) obj;
        return Intrinsics.c(this.action, actionData.action) && this.type == actionData.type && Intrinsics.c(this.id, actionData.id) && Intrinsics.c(this.analytics, actionData.analytics);
    }

    public final int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.action.hashCode() * 31)) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsData analyticsData = this.analytics;
        return iHashCode2 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        return "ActionData(action=" + this.action + ", type=" + this.type + ", id=" + this.id + ", analytics=" + this.analytics + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.action);
        dest.writeString(this.type.name());
        dest.writeString(this.id);
        dest.writeParcelable(this.analytics, i);
    }
}

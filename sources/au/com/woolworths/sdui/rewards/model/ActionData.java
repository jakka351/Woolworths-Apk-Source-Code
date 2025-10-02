package au.com.woolworths.sdui.rewards.model;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.rewards.base.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/sdui/rewards/model/ActionData;", "Landroid/os/Parcelable;", "Companion", "$serializer", "rewards-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class ActionData implements Parcelable {
    public final String d;
    public final ActionType e;
    public final String f;
    public final AnalyticsData g;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<ActionData> CREATOR = new Creator();
    public static final Lazy[] h = {null, LazyKt.a(LazyThreadSafetyMode.d, new d(8)), null, null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/sdui/rewards/model/ActionData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/sdui/rewards/model/ActionData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "rewards-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ActionData> serializer() {
            return ActionData$$serializer.f10025a;
        }
    }

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

    public /* synthetic */ ActionData(int i, String str, ActionType actionType, String str2, AnalyticsData analyticsData) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, ActionData$$serializer.f10025a.getDescriptor());
            throw null;
        }
        this.d = str;
        this.e = actionType;
        this.f = str2;
        this.g = analyticsData;
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
        return Intrinsics.c(this.d, actionData.d) && this.e == actionData.e && Intrinsics.c(this.f, actionData.f) && Intrinsics.c(this.g, actionData.g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsData analyticsData = this.g;
        return iHashCode2 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        return "ActionData(action=" + this.d + ", type=" + this.e + ", id=" + this.f + ", analytics=" + this.g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e.name());
        dest.writeString(this.f);
        dest.writeParcelable(this.g, i);
    }

    public ActionData(String action, ActionType type, String str, AnalyticsData analyticsData) {
        Intrinsics.h(action, "action");
        Intrinsics.h(type, "type");
        this.d = action;
        this.e = type;
        this.f = str;
        this.g = analyticsData;
    }
}

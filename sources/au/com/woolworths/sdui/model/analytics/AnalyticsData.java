package au.com.woolworths.sdui.model.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.rewards.base.d;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NonReadyForUseAnalyticsApi
@Parcelize
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0085\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b \u0010\u0018R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lau/com/woolworths/sdui/model/analytics/AnalyticsData;", "Landroid/os/Parcelable;", "", "appSection", "screenName", "screenType", "eventCategory", "eventLabel", "eventValue", "eventAction", "eventDescription", "tealiumEvent", "", "Lau/com/woolworths/sdui/model/analytics/AnalyticsExtraContent;", "extraContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Ljava/lang/String;", "getAppSection", "()Ljava/lang/String;", "getScreenName", "getScreenType", "getEventCategory", "getEventLabel", "getEventValue", "getEventAction", "getEventDescription", "getTealiumEvent", "Ljava/util/List;", "getExtraContent", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class AnalyticsData implements Parcelable {

    @SerializedName("appSection")
    @Nullable
    private final String appSection;

    @SerializedName("eventAction")
    @Nullable
    private final String eventAction;

    @SerializedName("eventCategory")
    @Nullable
    private final String eventCategory;

    @SerializedName("eventDescription")
    @Nullable
    private final String eventDescription;

    @SerializedName("eventLabel")
    @Nullable
    private final String eventLabel;

    @SerializedName("eventValue")
    @Nullable
    private final String eventValue;

    @SerializedName("extraContent")
    @Nullable
    private final List<AnalyticsExtraContent> extraContent;

    @SerializedName("screenName")
    @Nullable
    private final String screenName;

    @SerializedName("screenType")
    @Nullable
    private final String screenType;

    @SerializedName("tealiumEvent")
    @Nullable
    private final String tealiumEvent;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AnalyticsData> CREATOR = new Creator();
    public static final Lazy[] d = {null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.d, new d(6))};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/sdui/model/analytics/AnalyticsData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/sdui/model/analytics/AnalyticsData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<AnalyticsData> serializer() {
            return AnalyticsData$$serializer.f10007a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsData> {
        @Override // android.os.Parcelable.Creator
        public final AnalyticsData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = a.e(AnalyticsExtraContent.CREATOR, parcel, arrayList2, iE, 1);
                }
                arrayList = arrayList2;
            }
            return new AnalyticsData(string, string2, string3, string4, string5, string6, string7, string8, string9, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AnalyticsData[] newArray(int i) {
            return new AnalyticsData[i];
        }
    }

    public AnalyticsData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 1023, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void a(AnalyticsData analyticsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.q(serialDescriptor, 0) || analyticsData.appSection != null) {
            compositeEncoder.w(serialDescriptor, 0, StringSerializer.f24821a, analyticsData.appSection);
        }
        if (compositeEncoder.q(serialDescriptor, 1) || analyticsData.screenName != null) {
            compositeEncoder.w(serialDescriptor, 1, StringSerializer.f24821a, analyticsData.screenName);
        }
        if (compositeEncoder.q(serialDescriptor, 2) || analyticsData.screenType != null) {
            compositeEncoder.w(serialDescriptor, 2, StringSerializer.f24821a, analyticsData.screenType);
        }
        if (compositeEncoder.q(serialDescriptor, 3) || analyticsData.eventCategory != null) {
            compositeEncoder.w(serialDescriptor, 3, StringSerializer.f24821a, analyticsData.eventCategory);
        }
        if (compositeEncoder.q(serialDescriptor, 4) || analyticsData.eventLabel != null) {
            compositeEncoder.w(serialDescriptor, 4, StringSerializer.f24821a, analyticsData.eventLabel);
        }
        if (compositeEncoder.q(serialDescriptor, 5) || analyticsData.eventValue != null) {
            compositeEncoder.w(serialDescriptor, 5, StringSerializer.f24821a, analyticsData.eventValue);
        }
        if (compositeEncoder.q(serialDescriptor, 6) || analyticsData.eventAction != null) {
            compositeEncoder.w(serialDescriptor, 6, StringSerializer.f24821a, analyticsData.eventAction);
        }
        if (compositeEncoder.q(serialDescriptor, 7) || analyticsData.eventDescription != null) {
            compositeEncoder.w(serialDescriptor, 7, StringSerializer.f24821a, analyticsData.eventDescription);
        }
        if (compositeEncoder.q(serialDescriptor, 8) || analyticsData.tealiumEvent != null) {
            compositeEncoder.w(serialDescriptor, 8, StringSerializer.f24821a, analyticsData.tealiumEvent);
        }
        if (!compositeEncoder.q(serialDescriptor, 9) && analyticsData.extraContent == null) {
            return;
        }
        compositeEncoder.w(serialDescriptor, 9, (SerializationStrategy) d[9].getD(), analyticsData.extraContent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsData)) {
            return false;
        }
        AnalyticsData analyticsData = (AnalyticsData) obj;
        return Intrinsics.c(this.appSection, analyticsData.appSection) && Intrinsics.c(this.screenName, analyticsData.screenName) && Intrinsics.c(this.screenType, analyticsData.screenType) && Intrinsics.c(this.eventCategory, analyticsData.eventCategory) && Intrinsics.c(this.eventLabel, analyticsData.eventLabel) && Intrinsics.c(this.eventValue, analyticsData.eventValue) && Intrinsics.c(this.eventAction, analyticsData.eventAction) && Intrinsics.c(this.eventDescription, analyticsData.eventDescription) && Intrinsics.c(this.tealiumEvent, analyticsData.tealiumEvent) && Intrinsics.c(this.extraContent, analyticsData.extraContent);
    }

    public final int hashCode() {
        String str = this.appSection;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.screenName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.screenType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eventCategory;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eventLabel;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eventValue;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.eventAction;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.eventDescription;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tealiumEvent;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<AnalyticsExtraContent> list = this.extraContent;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.appSection;
        String str2 = this.screenName;
        String str3 = this.screenType;
        String str4 = this.eventCategory;
        String str5 = this.eventLabel;
        String str6 = this.eventValue;
        String str7 = this.eventAction;
        String str8 = this.eventDescription;
        String str9 = this.tealiumEvent;
        List<AnalyticsExtraContent> list = this.extraContent;
        StringBuilder sbV = YU.a.v("AnalyticsData(appSection=", str, ", screenName=", str2, ", screenType=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", eventCategory=", str4, ", eventLabel=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", eventValue=", str6, ", eventAction=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", eventDescription=", str8, ", tealiumEvent=");
        sbV.append(str9);
        sbV.append(", extraContent=");
        sbV.append(list);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.appSection);
        dest.writeString(this.screenName);
        dest.writeString(this.screenType);
        dest.writeString(this.eventCategory);
        dest.writeString(this.eventLabel);
        dest.writeString(this.eventValue);
        dest.writeString(this.eventAction);
        dest.writeString(this.eventDescription);
        dest.writeString(this.tealiumEvent);
        List<AnalyticsExtraContent> list = this.extraContent;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<AnalyticsExtraContent> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i);
        }
    }

    public /* synthetic */ AnalyticsData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.appSection = null;
        } else {
            this.appSection = str;
        }
        if ((i & 2) == 0) {
            this.screenName = null;
        } else {
            this.screenName = str2;
        }
        if ((i & 4) == 0) {
            this.screenType = null;
        } else {
            this.screenType = str3;
        }
        if ((i & 8) == 0) {
            this.eventCategory = null;
        } else {
            this.eventCategory = str4;
        }
        if ((i & 16) == 0) {
            this.eventLabel = null;
        } else {
            this.eventLabel = str5;
        }
        if ((i & 32) == 0) {
            this.eventValue = null;
        } else {
            this.eventValue = str6;
        }
        if ((i & 64) == 0) {
            this.eventAction = null;
        } else {
            this.eventAction = str7;
        }
        if ((i & 128) == 0) {
            this.eventDescription = null;
        } else {
            this.eventDescription = str8;
        }
        if ((i & 256) == 0) {
            this.tealiumEvent = null;
        } else {
            this.tealiumEvent = str9;
        }
        if ((i & 512) == 0) {
            this.extraContent = null;
        } else {
            this.extraContent = list;
        }
    }

    public AnalyticsData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<AnalyticsExtraContent> list) {
        this.appSection = str;
        this.screenName = str2;
        this.screenType = str3;
        this.eventCategory = str4;
        this.eventLabel = str5;
        this.eventValue = str6;
        this.eventAction = str7;
        this.eventDescription = str8;
        this.tealiumEvent = str9;
        this.extraContent = list;
    }

    public /* synthetic */ AnalyticsData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : list);
    }
}

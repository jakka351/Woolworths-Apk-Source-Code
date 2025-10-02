package au.com.woolworths.analytics.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.viewmodel.compose.a;
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

@Parcelize
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b%\u0010\u001dR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lau/com/woolworths/analytics/model/AnalyticsData;", "Landroid/os/Parcelable;", "Lau/com/woolworths/analytics/model/EventConfig;", "eventConfig", "", "appSection", "screenName", "screenType", "eventCategory", "eventLabel", "eventValue", "eventAction", "eventDescription", "tealiumEvent", "", "Lau/com/woolworths/analytics/model/AnalyticsExtraContent;", "extraContent", "<init>", "(Lau/com/woolworths/analytics/model/EventConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILau/com/woolworths/analytics/model/EventConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lau/com/woolworths/analytics/model/EventConfig;", "e", "()Lau/com/woolworths/analytics/model/EventConfig;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "j", "k", "d", "g", "h", "c", "f", "l", "Ljava/util/List;", "i", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes.dex */
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

    @SerializedName("eventConfig")
    @Nullable
    private final EventConfig eventConfig;

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
    public static final Lazy[] d = {null, null, null, null, null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.d, new a(2))};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/analytics/model/AnalyticsData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/analytics/model/AnalyticsData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        @NotNull
        public final KSerializer<AnalyticsData> serializer() {
            return AnalyticsData$$serializer.f4018a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<AnalyticsData> {
        @Override // android.os.Parcelable.Creator
        public final AnalyticsData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            ArrayList arrayList = null;
            EventConfig eventConfigCreateFromParcel = parcel.readInt() == 0 ? null : EventConfig.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = androidx.compose.ui.input.pointer.a.e(AnalyticsExtraContent.CREATOR, parcel, arrayList, iE, 1);
                }
            }
            return new AnalyticsData(eventConfigCreateFromParcel, string, string2, string3, string4, string5, string6, string7, string8, string9, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AnalyticsData[] newArray(int i) {
            return new AnalyticsData[i];
        }
    }

    public AnalyticsData() {
        this((EventConfig) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AnalyticsData a(AnalyticsData analyticsData, String str, String str2, String str3, ArrayList arrayList, int i) {
        EventConfig eventConfig = analyticsData.eventConfig;
        String str4 = analyticsData.appSection;
        String str5 = analyticsData.screenName;
        String str6 = analyticsData.screenType;
        String str7 = analyticsData.eventCategory;
        if ((i & 32) != 0) {
            str = analyticsData.eventLabel;
        }
        String str8 = str;
        if ((i & 64) != 0) {
            str2 = analyticsData.eventValue;
        }
        String str9 = str2;
        String str10 = analyticsData.eventAction;
        String str11 = (i & 256) != 0 ? analyticsData.eventDescription : str3;
        String str12 = analyticsData.tealiumEvent;
        List list = (i & 1024) != 0 ? analyticsData.extraContent : arrayList;
        analyticsData.getClass();
        return new AnalyticsData(eventConfig, str4, str5, str6, str7, str8, str9, str10, str11, str12, list);
    }

    public static final /* synthetic */ void m(AnalyticsData analyticsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.q(serialDescriptor, 0) || analyticsData.eventConfig != null) {
            compositeEncoder.w(serialDescriptor, 0, EventConfig$$serializer.f4020a, analyticsData.eventConfig);
        }
        if (compositeEncoder.q(serialDescriptor, 1) || analyticsData.appSection != null) {
            compositeEncoder.w(serialDescriptor, 1, StringSerializer.f24821a, analyticsData.appSection);
        }
        if (compositeEncoder.q(serialDescriptor, 2) || analyticsData.screenName != null) {
            compositeEncoder.w(serialDescriptor, 2, StringSerializer.f24821a, analyticsData.screenName);
        }
        if (compositeEncoder.q(serialDescriptor, 3) || analyticsData.screenType != null) {
            compositeEncoder.w(serialDescriptor, 3, StringSerializer.f24821a, analyticsData.screenType);
        }
        if (compositeEncoder.q(serialDescriptor, 4) || analyticsData.eventCategory != null) {
            compositeEncoder.w(serialDescriptor, 4, StringSerializer.f24821a, analyticsData.eventCategory);
        }
        if (compositeEncoder.q(serialDescriptor, 5) || analyticsData.eventLabel != null) {
            compositeEncoder.w(serialDescriptor, 5, StringSerializer.f24821a, analyticsData.eventLabel);
        }
        if (compositeEncoder.q(serialDescriptor, 6) || analyticsData.eventValue != null) {
            compositeEncoder.w(serialDescriptor, 6, StringSerializer.f24821a, analyticsData.eventValue);
        }
        if (compositeEncoder.q(serialDescriptor, 7) || analyticsData.eventAction != null) {
            compositeEncoder.w(serialDescriptor, 7, StringSerializer.f24821a, analyticsData.eventAction);
        }
        if (compositeEncoder.q(serialDescriptor, 8) || analyticsData.eventDescription != null) {
            compositeEncoder.w(serialDescriptor, 8, StringSerializer.f24821a, analyticsData.eventDescription);
        }
        if (compositeEncoder.q(serialDescriptor, 9) || analyticsData.tealiumEvent != null) {
            compositeEncoder.w(serialDescriptor, 9, StringSerializer.f24821a, analyticsData.tealiumEvent);
        }
        if (!compositeEncoder.q(serialDescriptor, 10) && analyticsData.extraContent == null) {
            return;
        }
        compositeEncoder.w(serialDescriptor, 10, (SerializationStrategy) d[10].getD(), analyticsData.extraContent);
    }

    /* renamed from: b, reason: from getter */
    public final String getAppSection() {
        return this.appSection;
    }

    /* renamed from: c, reason: from getter */
    public final String getEventAction() {
        return this.eventAction;
    }

    /* renamed from: d, reason: from getter */
    public final String getEventCategory() {
        return this.eventCategory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final EventConfig getEventConfig() {
        return this.eventConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsData)) {
            return false;
        }
        AnalyticsData analyticsData = (AnalyticsData) obj;
        return Intrinsics.c(this.eventConfig, analyticsData.eventConfig) && Intrinsics.c(this.appSection, analyticsData.appSection) && Intrinsics.c(this.screenName, analyticsData.screenName) && Intrinsics.c(this.screenType, analyticsData.screenType) && Intrinsics.c(this.eventCategory, analyticsData.eventCategory) && Intrinsics.c(this.eventLabel, analyticsData.eventLabel) && Intrinsics.c(this.eventValue, analyticsData.eventValue) && Intrinsics.c(this.eventAction, analyticsData.eventAction) && Intrinsics.c(this.eventDescription, analyticsData.eventDescription) && Intrinsics.c(this.tealiumEvent, analyticsData.tealiumEvent) && Intrinsics.c(this.extraContent, analyticsData.extraContent);
    }

    /* renamed from: f, reason: from getter */
    public final String getEventDescription() {
        return this.eventDescription;
    }

    /* renamed from: g, reason: from getter */
    public final String getEventLabel() {
        return this.eventLabel;
    }

    /* renamed from: h, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }

    public final int hashCode() {
        EventConfig eventConfig = this.eventConfig;
        int iHashCode = (eventConfig == null ? 0 : eventConfig.hashCode()) * 31;
        String str = this.appSection;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.screenName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.screenType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eventCategory;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eventLabel;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eventValue;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.eventAction;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.eventDescription;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tealiumEvent;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<AnalyticsExtraContent> list = this.extraContent;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final List getExtraContent() {
        return this.extraContent;
    }

    /* renamed from: j, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* renamed from: k, reason: from getter */
    public final String getScreenType() {
        return this.screenType;
    }

    /* renamed from: l, reason: from getter */
    public final String getTealiumEvent() {
        return this.tealiumEvent;
    }

    public final String toString() {
        EventConfig eventConfig = this.eventConfig;
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
        StringBuilder sb = new StringBuilder("AnalyticsData(eventConfig=");
        sb.append(eventConfig);
        sb.append(", appSection=");
        sb.append(str);
        sb.append(", screenName=");
        androidx.constraintlayout.core.state.a.B(sb, str2, ", screenType=", str3, ", eventCategory=");
        androidx.constraintlayout.core.state.a.B(sb, str4, ", eventLabel=", str5, ", eventValue=");
        androidx.constraintlayout.core.state.a.B(sb, str6, ", eventAction=", str7, ", eventDescription=");
        androidx.constraintlayout.core.state.a.B(sb, str8, ", tealiumEvent=", str9, ", extraContent=");
        return android.support.v4.media.session.a.t(sb, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        EventConfig eventConfig = this.eventConfig;
        if (eventConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            eventConfig.writeToParcel(dest, i);
        }
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

    public /* synthetic */ AnalyticsData(int i, EventConfig eventConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.eventConfig = null;
        } else {
            this.eventConfig = eventConfig;
        }
        if ((i & 2) == 0) {
            this.appSection = null;
        } else {
            this.appSection = str;
        }
        if ((i & 4) == 0) {
            this.screenName = null;
        } else {
            this.screenName = str2;
        }
        if ((i & 8) == 0) {
            this.screenType = null;
        } else {
            this.screenType = str3;
        }
        if ((i & 16) == 0) {
            this.eventCategory = null;
        } else {
            this.eventCategory = str4;
        }
        if ((i & 32) == 0) {
            this.eventLabel = null;
        } else {
            this.eventLabel = str5;
        }
        if ((i & 64) == 0) {
            this.eventValue = null;
        } else {
            this.eventValue = str6;
        }
        if ((i & 128) == 0) {
            this.eventAction = null;
        } else {
            this.eventAction = str7;
        }
        if ((i & 256) == 0) {
            this.eventDescription = null;
        } else {
            this.eventDescription = str8;
        }
        if ((i & 512) == 0) {
            this.tealiumEvent = null;
        } else {
            this.tealiumEvent = str9;
        }
        if ((i & 1024) == 0) {
            this.extraContent = null;
        } else {
            this.extraContent = list;
        }
    }

    public AnalyticsData(@Nullable EventConfig eventConfig, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable List<AnalyticsExtraContent> list) {
        this.eventConfig = eventConfig;
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

    public /* synthetic */ AnalyticsData(EventConfig eventConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : eventConfig, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : list);
    }
}

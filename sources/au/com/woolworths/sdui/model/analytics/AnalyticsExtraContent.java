package au.com.woolworths.sdui.model.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import au.com.woolworths.rewards.base.d;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@NonReadyForUseAnalyticsApi
@Parcelize
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/sdui/model/analytics/AnalyticsExtraContent;", "Landroid/os/Parcelable;", "", "key", "value", "", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getValue", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class AnalyticsExtraContent implements Parcelable {

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("value")
    @Nullable
    private final String value;

    @SerializedName("values")
    @Nullable
    private final List<String> values;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AnalyticsExtraContent> CREATOR = new Creator();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.d, new d(7))};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/sdui/model/analytics/AnalyticsExtraContent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/sdui/model/analytics/AnalyticsExtraContent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<AnalyticsExtraContent> serializer() {
            return AnalyticsExtraContent$$serializer.f10008a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsExtraContent> {
        @Override // android.os.Parcelable.Creator
        public final AnalyticsExtraContent createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new AnalyticsExtraContent(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AnalyticsExtraContent[] newArray(int i) {
            return new AnalyticsExtraContent[i];
        }
    }

    public /* synthetic */ AnalyticsExtraContent(int i, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, AnalyticsExtraContent$$serializer.f10008a.getB());
            throw null;
        }
        this.key = str;
        this.value = str2;
        this.values = list;
    }

    public static final /* synthetic */ void a(AnalyticsExtraContent analyticsExtraContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.p(serialDescriptor, 0, analyticsExtraContent.key);
        compositeEncoder.w(serialDescriptor, 1, StringSerializer.f24821a, analyticsExtraContent.value);
        compositeEncoder.w(serialDescriptor, 2, (SerializationStrategy) d[2].getD(), analyticsExtraContent.values);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsExtraContent)) {
            return false;
        }
        AnalyticsExtraContent analyticsExtraContent = (AnalyticsExtraContent) obj;
        return Intrinsics.c(this.key, analyticsExtraContent.key) && Intrinsics.c(this.value, analyticsExtraContent.value) && Intrinsics.c(this.values, analyticsExtraContent.values);
    }

    public final int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.values;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.key;
        String str2 = this.value;
        return a.t(YU.a.v("AnalyticsExtraContent(key=", str, ", value=", str2, ", values="), this.values, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.key);
        dest.writeString(this.value);
        dest.writeStringList(this.values);
    }

    public AnalyticsExtraContent(@NotNull String key, @Nullable String str, @Nullable List<String> list) {
        Intrinsics.h(key, "key");
        this.key = key;
        this.value = str;
        this.values = list;
    }
}

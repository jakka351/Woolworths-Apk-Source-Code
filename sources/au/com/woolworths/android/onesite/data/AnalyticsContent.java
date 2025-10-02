package au.com.woolworths.android.onesite.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/android/onesite/data/AnalyticsContent;", "Landroid/os/Parcelable;", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getValue", "Companion", "$serializer", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class AnalyticsContent implements Parcelable {

    @SerializedName("key")
    @NotNull
    private final String key;

    @SerializedName("value")
    @Nullable
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<AnalyticsContent> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/data/AnalyticsContent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/android/onesite/data/AnalyticsContent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<AnalyticsContent> serializer() {
            return AnalyticsContent$$serializer.f4239a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsContent> {
        @Override // android.os.Parcelable.Creator
        public final AnalyticsContent createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new AnalyticsContent(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AnalyticsContent[] newArray(int i) {
            return new AnalyticsContent[i];
        }
    }

    public /* synthetic */ AnalyticsContent(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, AnalyticsContent$$serializer.f4239a.getB());
            throw null;
        }
        this.key = str;
        this.value = str2;
    }

    public static final /* synthetic */ void a(AnalyticsContent analyticsContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.p(serialDescriptor, 0, analyticsContent.key);
        compositeEncoder.w(serialDescriptor, 1, StringSerializer.f24821a, analyticsContent.value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsContent)) {
            return false;
        }
        AnalyticsContent analyticsContent = (AnalyticsContent) obj;
        return Intrinsics.c(this.key, analyticsContent.key) && Intrinsics.c(this.value, analyticsContent.value);
    }

    public final int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        String str = this.value;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.j("AnalyticsContent(key=", this.key, ", value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.key);
        dest.writeString(this.value);
    }

    public AnalyticsContent(@NotNull String key, @Nullable String str) {
        Intrinsics.h(key, "key");
        this.key = key;
        this.value = str;
    }
}

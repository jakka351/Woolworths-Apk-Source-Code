package au.com.woolworths.analytics.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.input.pointer.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u000eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/analytics/model/EventConfig;", "Landroid/os/Parcelable;", "", "forceBundle", "<init>", "(Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class EventConfig implements Parcelable {

    @SerializedName("forceBundle")
    @Nullable
    private final Boolean forceBundle;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<EventConfig> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/analytics/model/EventConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/analytics/model/EventConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<EventConfig> serializer() {
            return EventConfig$$serializer.f4020a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EventConfig> {
        @Override // android.os.Parcelable.Creator
        public final EventConfig createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.h(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EventConfig(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final EventConfig[] newArray(int i) {
            return new EventConfig[i];
        }
    }

    public /* synthetic */ EventConfig(int i, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 == (i & 1)) {
            this.forceBundle = bool;
        } else {
            PluginExceptionsKt.a(i, 1, EventConfig$$serializer.f4020a.getB());
            throw null;
        }
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getForceBundle() {
        return this.forceBundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EventConfig) && Intrinsics.c(this.forceBundle, ((EventConfig) obj).forceBundle);
    }

    public final int hashCode() {
        Boolean bool = this.forceBundle;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return a.k(this.forceBundle, "EventConfig(forceBundle=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        Boolean bool = this.forceBundle;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public EventConfig(@Nullable Boolean bool) {
        this.forceBundle = bool;
    }
}

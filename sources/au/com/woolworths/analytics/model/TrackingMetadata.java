package au.com.woolworths.analytics.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.layout.a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/analytics/model/TrackingMetadata;", "Landroid/os/Parcelable;", "Companion", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TrackingMetadata implements Parcelable {
    public final HashMap d = new HashMap();
    public final a e = new a(2);
    public static final Companion f = new Companion();

    @NotNull
    public static final Parcelable.Creator<TrackingMetadata> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/analytics/model/TrackingMetadata$Companion;", "", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static TrackingMetadata a(TrackableValue key, Object value) {
            Intrinsics.h(key, "key");
            Intrinsics.h(value, "value");
            TrackingMetadata trackingMetadata = new TrackingMetadata();
            trackingMetadata.b(key, value);
            return trackingMetadata;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TrackingMetadata> {
        @Override // android.os.Parcelable.Creator
        public final TrackingMetadata createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            parcel.readInt();
            return new TrackingMetadata();
        }

        @Override // android.os.Parcelable.Creator
        public final TrackingMetadata[] newArray(int i) {
            return new TrackingMetadata[i];
        }
    }

    public final void a(TrackingMetadata trackingMetadata) {
        Intrinsics.h(trackingMetadata, "trackingMetadata");
        this.d.putAll(MapsKt.q(trackingMetadata.d));
    }

    public final void b(TrackableValue key, Object value) {
        Intrinsics.h(key, "key");
        Intrinsics.h(value, "value");
        this.d.put(key.d, value);
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.d.entrySet()) {
            map.put((String) entry.getKey(), entry.getValue());
        }
        return map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TrackingMetadata)) {
            return false;
        }
        HashMap map = this.d;
        a aVar = this.e;
        return Intrinsics.c(MapsKt.t(map, aVar).toString(), MapsKt.t(((TrackingMetadata) obj).d, aVar).toString());
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return CollectionsKt.M(this.d.entrySet(), "\n", null, null, new androidx.navigation.a(18), 30);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeInt(1);
    }
}

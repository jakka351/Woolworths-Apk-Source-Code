package androidx.core.location;

import android.location.GnssStatus;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi
@RestrictTo
/* loaded from: classes2.dex */
class GnssStatusWrapper extends GnssStatusCompat {

    /* renamed from: a, reason: collision with root package name */
    public final GnssStatus f2438a;

    @RequiresApi
    public static class Api26Impl {
    }

    @RequiresApi
    public static class Api30Impl {
    }

    public GnssStatusWrapper(GnssStatus gnssStatus) {
        gnssStatus.getClass();
        this.f2438a = gnssStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GnssStatusWrapper) {
            return this.f2438a.equals(((GnssStatusWrapper) obj).f2438a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2438a.hashCode();
    }
}

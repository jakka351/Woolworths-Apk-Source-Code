package androidx.core.location;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.TimeUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class LocationRequestCompat {

    public static class Api19Impl {
    }

    @RequiresApi
    public static class Api31Impl {
    }

    public static final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Quality {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocationRequestCompat) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
    }

    public final int hashCode() {
        int i = (int) 0;
        return (i * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[@");
        Object obj = TimeUtils.f2465a;
        synchronized (obj) {
            if (TimeUtils.b.length < 0) {
                TimeUtils.b = new char[0];
            }
            char[] cArr = TimeUtils.b;
            cArr[0] = '0';
            sb.append(cArr, 0, 1);
        }
        sb.append(", duration=");
        synchronized (obj) {
            if (TimeUtils.b.length < 0) {
                TimeUtils.b = new char[0];
            }
            char[] cArr2 = TimeUtils.b;
            cArr2[0] = '0';
            sb.append(cArr2, 0, 1);
        }
        sb.append(", maxUpdates=0");
        if (BitmapDescriptorFactory.HUE_RED > 0.0d) {
            sb.append(", minUpdateDistance=0.0");
        }
        sb.append(']');
        return sb.toString();
    }
}

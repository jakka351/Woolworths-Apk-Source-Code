package androidx.core.location;

import android.location.Location;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class LocationCompat {

    @RequiresApi
    public static class Api26Impl {
    }

    @RequiresApi
    public static class Api28Impl {
    }

    @RequiresApi
    public static class Api29Impl {
    }

    @RequiresApi
    public static class Api31Impl {
        public static boolean a(Location location) {
            return location.isMock();
        }
    }

    @RequiresApi
    public static class Api33Impl {
    }

    @RequiresApi
    public static class Api34Impl {
    }

    public static boolean a(Location location) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.a(location) : location.isFromMockProvider();
    }
}

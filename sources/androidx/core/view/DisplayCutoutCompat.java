package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class DisplayCutoutCompat {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2476a;

    @RequiresApi
    public static class Api28Impl {
    }

    @RequiresApi
    public static class Api29Impl {
    }

    @RequiresApi
    public static class Api30Impl {
        public static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    @RequiresApi
    public static class Api31Impl {
    }

    @RequiresApi
    public static class Api33Impl {
    }

    public DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.f2476a = displayCutout;
    }

    public final androidx.core.graphics.Insets a() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.Insets.d(Api30Impl.a(this.f2476a)) : androidx.core.graphics.Insets.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2476a, ((DisplayCutoutCompat) obj).f2476a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f2476a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2476a + "}";
    }
}

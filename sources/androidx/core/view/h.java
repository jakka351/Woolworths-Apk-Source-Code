package androidx.core.view;

import android.graphics.Insets;
import android.media.RouteDiscoveryPreference;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ RouteDiscoveryPreference.Builder f(List list) {
        return new RouteDiscoveryPreference.Builder(list, false);
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds i(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation j(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation k(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void m() {
    }
}

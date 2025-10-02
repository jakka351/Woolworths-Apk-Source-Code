package androidx.core.view.insets;

import android.view.animation.PathInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public abstract class Protection {

    /* renamed from: a, reason: collision with root package name */
    public Object f2520a;

    public static class Attributes {

        public interface Callback {
        }
    }

    static {
        new PathInterpolator(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        new PathInterpolator(0.6f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
        new PathInterpolator(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f);
        new PathInterpolator(0.4f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);
    }

    public void a(int i) {
    }
}

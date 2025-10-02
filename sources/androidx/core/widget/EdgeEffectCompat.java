package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.RequiresApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class EdgeEffectCompat {

    @RequiresApi
    public static class Api21Impl {
        public static void a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    @RequiresApi
    public static class Api31Impl {
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    @Deprecated
    public EdgeEffectCompat(Context context) {
        new EdgeEffect(context);
    }

    public static float a(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.b(edgeEffect) : BitmapDescriptorFactory.HUE_RED;
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.c(edgeEffect, f, f2);
        }
        Api21Impl.a(edgeEffect, f, f2);
        return f;
    }
}

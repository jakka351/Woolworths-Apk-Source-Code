package androidx.vectordrawable.graphics.drawable;

import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@RestrictTo
/* loaded from: classes2.dex */
public class PathInterpolatorCompat implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        throw null;
    }
}

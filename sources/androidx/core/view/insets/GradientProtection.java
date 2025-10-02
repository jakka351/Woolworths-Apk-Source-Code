package androidx.core.view.insets;

import android.view.animation.PathInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class GradientProtection extends Protection {
    public static final float[] c;
    public int b;

    static {
        float[] fArr = new float[100];
        c = fArr;
        PathInterpolator pathInterpolator = new PathInterpolator(0.42f, BitmapDescriptorFactory.HUE_RED, 0.58f, 1.0f);
        int length = fArr.length - 1;
        for (int i = length; i >= 0; i--) {
            c[i] = pathInterpolator.getInterpolation((length - i) / length);
        }
    }

    @Override // androidx.core.view.insets.Protection
    public final void a(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        throw null;
    }
}

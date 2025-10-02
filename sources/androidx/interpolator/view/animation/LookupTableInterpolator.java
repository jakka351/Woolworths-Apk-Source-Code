package androidx.interpolator.view.animation;

import YU.a;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class LookupTableInterpolator implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f2777a;
    public final float b;

    public LookupTableInterpolator(float[] fArr) {
        this.f2777a = fArr;
        this.b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr = this.f2777a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.b;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return a.a(fArr[iMin + 1], f4, f3, f4);
    }
}

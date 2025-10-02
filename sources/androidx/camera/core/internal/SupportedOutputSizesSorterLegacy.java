package androidx.camera.core.internal;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.utils.CameraOrientationUtil;

/* loaded from: classes2.dex */
class SupportedOutputSizesSorterLegacy {

    /* renamed from: a, reason: collision with root package name */
    public final int f532a;
    public final int b;
    public final Rational c;
    public final boolean d;

    public SupportedOutputSizesSorterLegacy(CameraInfoInternal cameraInfoInternal, Rational rational) {
        this.f532a = cameraInfoInternal.i();
        this.b = cameraInfoInternal.d();
        this.c = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.d = z;
    }

    public final Size a(ImageOutputConfig imageOutputConfig) {
        int iS = imageOutputConfig.s(0);
        Size sizeN = imageOutputConfig.n();
        if (sizeN != null) {
            int iA = CameraOrientationUtil.a(CameraOrientationUtil.b(iS), this.f532a, 1 == this.b);
            if (iA == 90 || iA == 270) {
                return new Size(sizeN.getHeight(), sizeN.getWidth());
            }
        }
        return sizeN;
    }
}

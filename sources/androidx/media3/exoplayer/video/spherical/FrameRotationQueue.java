package androidx.media3.exoplayer.video.spherical;

import android.opengl.Matrix;
import androidx.media3.common.util.TimedValueQueue;

/* loaded from: classes2.dex */
final class FrameRotationQueue {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3210a = new float[16];
    public final float[] b = new float[16];
    public final TimedValueQueue c = new TimedValueQueue();
    public boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }
}

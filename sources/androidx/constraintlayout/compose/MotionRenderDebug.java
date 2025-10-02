package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.state.WidgetFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/MotionRenderDebug;", "", "Companion", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MotionRenderDebug {

    /* renamed from: a, reason: collision with root package name */
    public float[] f2252a;
    public float[] b;
    public Path c;
    public Paint d;
    public Paint e;
    public int f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Landroidx/constraintlayout/compose/MotionRenderDebug$Companion;", "", "", "DEBUG_PATH_TICKS_PER_MS", "I", "DEBUG_SHOW_NONE", "DEBUG_SHOW_PATH", "DEBUG_SHOW_PROGRESS", "MAX_KEY_FRAMES", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public final void a(Canvas canvas, int i, Motion motion, int i2, int i3) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        MotionWidget motionWidget = motion.f2269a;
        if (motionWidget != null) {
            WidgetFrame widgetFrame = motionWidget.f2271a;
            int i4 = widgetFrame.d;
            int i5 = widgetFrame.e;
        }
        int i6 = i - 1;
        for (int i7 = 1; i7 < i6; i7++) {
            float[] fArr = this.b;
            int i8 = i7 * 2;
            float f = fArr[i8];
            float f2 = fArr[i8 + 1];
            Path path = this.c;
            Intrinsics.e(path);
            path.reset();
            Path path2 = this.c;
            Intrinsics.e(path2);
            float f3 = 10;
            path2.moveTo(f, f2 + f3);
            Path path3 = this.c;
            Intrinsics.e(path3);
            path3.lineTo(f + f3, f2);
            Path path4 = this.c;
            Intrinsics.e(path4);
            path4.lineTo(f, f2 - f3);
            Path path5 = this.c;
            Intrinsics.e(path5);
            path5.lineTo(f - f3, f2);
            Path path6 = this.c;
            Intrinsics.e(path6);
            path6.close();
            Path path7 = this.c;
            Intrinsics.e(path7);
            canvas.drawPath(path7, paint2);
        }
        float[] fArr2 = this.f2252a;
        Intrinsics.e(fArr2);
        if (fArr2.length > 1) {
            float[] fArr3 = this.f2252a;
            Intrinsics.e(fArr3);
            float f4 = fArr3[0];
            float[] fArr4 = this.f2252a;
            Intrinsics.e(fArr4);
            canvas.drawCircle(f4, fArr4[1], 8.0f, paint);
            float[] fArr5 = this.f2252a;
            Intrinsics.e(fArr5);
            Intrinsics.e(this.f2252a);
            float f5 = fArr5[r11.length - 2];
            float[] fArr6 = this.f2252a;
            Intrinsics.e(fArr6);
            float[] fArr7 = this.f2252a;
            Intrinsics.e(fArr7);
            canvas.drawCircle(f5, fArr6[fArr7.length - 1], 8.0f, paint);
        }
    }
}

package androidx.core.view;

import android.content.Context;
import android.view.VelocityTracker;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes2.dex */
public class DifferentialMotionFlingController {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2475a;
    public final DifferentialMotionFlingTarget b;
    public VelocityTracker c;
    public float d;
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public final int[] h = {Integer.MAX_VALUE, 0};

    @VisibleForTesting
    public interface DifferentialVelocityProvider {
    }

    @VisibleForTesting
    public interface FlingVelocityThresholdCalculator {
    }

    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        this.f2475a = context;
        this.b = differentialMotionFlingTarget;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.MotionEvent r28, int r29) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.DifferentialMotionFlingController.a(android.view.MotionEvent, int):void");
    }
}

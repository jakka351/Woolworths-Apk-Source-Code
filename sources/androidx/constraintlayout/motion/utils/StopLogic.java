package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* loaded from: classes2.dex */
public class StopLogic extends MotionInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final StopLogicEngine f2328a;
    public SpringStopEngine b;
    public StopEngine c;

    public StopLogic() {
        StopLogicEngine stopLogicEngine = new StopLogicEngine();
        this.f2328a = stopLogicEngine;
        this.c = stopLogicEngine;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public final float a() {
        return this.c.a();
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}

package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;

/* loaded from: classes2.dex */
public class MotionWidget implements TypedValues {

    /* renamed from: a, reason: collision with root package name */
    public WidgetFrame f2271a;
    public final Motion b;
    public final PropertySet c;

    public static class Motion {

        /* renamed from: a, reason: collision with root package name */
        public String f2272a;
        public String b;
        public int c;
        public float d;
    }

    public static class PropertySet {

        /* renamed from: a, reason: collision with root package name */
        public int f2273a;
    }

    public MotionWidget(WidgetFrame widgetFrame) {
        new WidgetFrame();
        Motion motion = new Motion();
        motion.f2272a = null;
        motion.b = null;
        motion.c = -1;
        motion.d = Float.NaN;
        this.b = motion;
        PropertySet propertySet = new PropertySet();
        propertySet.f2273a = 4;
        this.c = propertySet;
        this.f2271a = widgetFrame;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean a(int i, int i2) {
        if (e(i2, i)) {
            return true;
        }
        Motion motion = this.b;
        switch (i) {
            case 606:
                motion.getClass();
                return true;
            case 607:
                motion.c = i2;
                return true;
            case 608:
                motion.getClass();
                return true;
            case 609:
                motion.getClass();
                return true;
            case 610:
                motion.getClass();
                return true;
            case 611:
                motion.getClass();
                return true;
            case 612:
                motion.getClass();
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean b(int i, boolean z) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean c(float f, int i) {
        if (e(f, i)) {
            return true;
        }
        Motion motion = this.b;
        switch (i) {
            case 600:
                motion.getClass();
                return true;
            case 601:
                motion.d = f;
                return true;
            case 602:
                motion.getClass();
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public final boolean d(int i, String str) {
        Motion motion = this.b;
        if (i == 605) {
            motion.f2272a = str;
            return true;
        }
        if (i == 603) {
            motion.b = str;
        } else {
            if (i != 604) {
                return false;
            }
            motion.getClass();
        }
        return true;
    }

    public final boolean e(float f, int i) {
        switch (i) {
            case 303:
                this.f2271a.p = f;
                return true;
            case 304:
                this.f2271a.k = f;
                return true;
            case 305:
                this.f2271a.l = f;
                return true;
            case 306:
                this.f2271a.m = f;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f2271a.h = f;
                return true;
            case 309:
                this.f2271a.i = f;
                return true;
            case 310:
                this.f2271a.j = f;
                return true;
            case 311:
                this.f2271a.n = f;
                return true;
            case 312:
                this.f2271a.o = f;
                return true;
            case 313:
                this.f2271a.f = f;
                return true;
            case 314:
                this.f2271a.g = f;
                return true;
            case 315:
            case 316:
                return true;
        }
    }

    public final String toString() {
        return this.f2271a.b + ", " + this.f2271a.c + ", " + this.f2271a.d + ", " + this.f2271a.e;
    }
}

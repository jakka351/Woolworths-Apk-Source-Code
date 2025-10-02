package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public abstract class ViewOscillator extends KeyCycleOscillator {

    public static class AlphaSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    public static class CustomSet extends ViewOscillator {
        public float[] g;
        public ConstraintAttribute h;

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public final void d(Object obj) {
            this.h = (ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            float[] fArr = this.g;
            fArr[0] = a(f);
            CustomSupport.b(this.h, view, fArr);
        }
    }

    public static class ElevationSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
            view.setElevation(a(f));
        }
    }

    public static class PathRotateSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
        }
    }

    public static class ProgressSet extends ViewOscillator {
        public boolean g;

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) throws ExecutionException, IllegalAccessException, InterruptedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewOscillator", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewOscillator", "unable to setProgress", e2);
                }
            }
        }
    }

    public static class RotationSet extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
            view.setRotation(a(f));
        }
    }

    public static class RotationXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    public static class RotationYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    public static class ScaleXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    public static class ScaleYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    public static class TranslationXset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    public static class TranslationYset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    public static class TranslationZset extends ViewOscillator {
        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public final void j(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.constraintlayout.motion.utils.ViewOscillator i(java.lang.String r4) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.utils.ViewOscillator.i(java.lang.String):androidx.constraintlayout.motion.utils.ViewOscillator");
    }

    public abstract void j(View view, float f);
}

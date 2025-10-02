package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public abstract class ViewSpline extends SplineSet {

    public static class AlphaSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    public static class CustomSet extends ViewSpline {
        public SparseArray f;
        public float[] g;

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public final void c(float f, int i) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public final void e(int i) {
            SparseArray sparseArray = this.f;
            int size = sparseArray.size();
            int iC = ((ConstraintAttribute) sparseArray.valueAt(0)).c();
            double[] dArr = new double[size];
            this.g = new float[iC];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) sparseArray.valueAt(i2);
                dArr[i2] = iKeyAt * 0.01d;
                constraintAttribute.b(this.g);
                int i3 = 0;
                while (true) {
                    if (i3 < this.g.length) {
                        dArr2[i2][i3] = r7[i3];
                        i3++;
                    }
                }
            }
            this.f2287a = CurveFit.a(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f2287a.c(f, this.g);
            CustomSupport.b((ConstraintAttribute) this.f.valueAt(0), view, this.g);
        }
    }

    public static class ElevationSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setElevation(a(f));
        }
    }

    public static class PathRotate extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
        }
    }

    public static class PivotXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    public static class PivotYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    public static class ProgressSet extends ViewSpline {
        public boolean f;

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) throws ExecutionException, IllegalAccessException, InterruptedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewSpline", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewSpline", "unable to setProgress", e2);
                }
            }
        }
    }

    public static class RotationSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setRotation(a(f));
        }
    }

    public static class RotationXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    public static class RotationYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    public static class ScaleXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    public static class ScaleYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    public static class TranslationXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    public static class TranslationYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    public static class TranslationZset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public final void g(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public static ViewSpline f(String str) {
        switch (str) {
            case "progress":
                ProgressSet progressSet = new ProgressSet();
                progressSet.f = false;
                break;
        }
        return new AlphaSet();
    }

    public abstract void g(View view, float f);
}

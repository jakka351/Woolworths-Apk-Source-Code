package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {

    public static class AlphaSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            view.setAlpha(d(f, j, view, keyCache));
            return this.h;
        }
    }

    public static class CustomSet extends ViewTimeCycle {
        public String k;
        public SparseArray l;
        public SparseArray m;
        public float[] n;

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public final void b(float f, float f2, float f3, int i, int i2) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public final void c(int i) {
            SparseArray sparseArray = this.l;
            int size = sparseArray.size();
            int iC = ((ConstraintAttribute) sparseArray.valueAt(0)).c();
            double[] dArr = new double[size];
            int i2 = iC + 2;
            this.n = new float[i2];
            this.g = new float[iC];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = sparseArray.keyAt(i3);
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) sparseArray.valueAt(i3);
                float[] fArr = (float[]) this.m.valueAt(i3);
                dArr[i3] = iKeyAt * 0.01d;
                constraintAttribute.b(this.n);
                int i4 = 0;
                while (true) {
                    if (i4 < this.n.length) {
                        dArr2[i3][i4] = r10[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iC] = fArr[0];
                dArr3[iC + 1] = fArr[1];
            }
            this.f2291a = CurveFit.a(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f2291a.c(f, this.n);
            float[] fArr = this.n;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.i;
            if (Float.isNaN(this.j)) {
                float fA = keyCache.a(view, this.k);
                this.j = fA;
                if (Float.isNaN(fA)) {
                    this.j = BitmapDescriptorFactory.HUE_RED;
                }
            }
            float f4 = (float) ((((j2 * 1.0E-9d) * f2) + this.j) % 1.0d);
            this.j = f4;
            this.i = j;
            float fA2 = a(f4);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.g;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.h;
                float f5 = this.n[i];
                this.h = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fA2) + f3;
                i++;
            }
            CustomSupport.b((ConstraintAttribute) this.l.valueAt(0), view, this.g);
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                this.h = true;
            }
            return this.h;
        }
    }

    public static class ElevationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            view.setElevation(d(f, j, view, keyCache));
            return this.h;
        }
    }

    public static class PathRotate extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            return this.h;
        }
    }

    public static class ProgressSet extends ViewTimeCycle {
        public boolean k;

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) throws ExecutionException, IllegalAccessException, InterruptedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Method method;
            ProgressSet progressSet;
            if (view instanceof MotionLayout) {
                float fD = d(f, j, view, keyCache);
                progressSet = this;
                ((MotionLayout) view).setProgress(fD);
            } else {
                if (this.k) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.k = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        float fD2 = d(f, j, view, keyCache);
                        progressSet = this;
                        try {
                            method.invoke(view, Float.valueOf(fD2));
                        } catch (IllegalAccessException e) {
                            e = e;
                            Log.e("ViewTimeCycle", "unable to setProgress", e);
                            return progressSet.h;
                        } catch (InvocationTargetException e2) {
                            e = e2;
                            Log.e("ViewTimeCycle", "unable to setProgress", e);
                            return progressSet.h;
                        }
                    } catch (IllegalAccessException e3) {
                        e = e3;
                        progressSet = this;
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        progressSet = this;
                    }
                } else {
                    progressSet = this;
                }
            }
            return progressSet.h;
        }
    }

    public static class RotationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            view.setRotation(d(f, j, view, keyCache));
            return this.h;
        }
    }

    public static class RotationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            view.setRotationX(d(f, j, view, keyCache));
            return this.h;
        }
    }

    public static class RotationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            view.setRotationY(d(f, j, view, keyCache));
            return this.h;
        }
    }

    public static class ScaleXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            view.setScaleX(d(f, j, view, keyCache));
            return this.h;
        }
    }

    public static class ScaleYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            view.setScaleY(d(f, j, view, keyCache));
            return this.h;
        }
    }

    public static class TranslationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            view.setTranslationX(d(f, j, view, keyCache));
            return this.h;
        }
    }

    public static class TranslationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            view.setTranslationY(d(f, j, view, keyCache));
            return this.h;
        }
    }

    public static class TranslationZset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public final boolean f(float f, long j, View view, KeyCache keyCache) {
            view.setTranslationZ(d(f, j, view, keyCache));
            return this.h;
        }
    }

    public ViewTimeCycle() {
        this.b = 0;
        this.c = new int[10];
        this.d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
        this.g = new float[3];
        this.h = false;
        this.j = Float.NaN;
    }

    public static ViewTimeCycle e(long j, String str) {
        ViewTimeCycle rotationXset;
        switch (str) {
            case "rotationX":
                rotationXset = new RotationXset();
                break;
            case "rotationY":
                rotationXset = new RotationYset();
                break;
            case "translationX":
                rotationXset = new TranslationXset();
                break;
            case "translationY":
                rotationXset = new TranslationYset();
                break;
            case "translationZ":
                rotationXset = new TranslationZset();
                break;
            case "progress":
                ProgressSet progressSet = new ProgressSet();
                progressSet.k = false;
                rotationXset = progressSet;
                break;
            case "scaleX":
                rotationXset = new ScaleXset();
                break;
            case "scaleY":
                rotationXset = new ScaleYset();
                break;
            case "rotation":
                rotationXset = new RotationSet();
                break;
            case "elevation":
                rotationXset = new ElevationSet();
                break;
            case "transitionPathRotate":
                rotationXset = new PathRotate();
                break;
            case "alpha":
                rotationXset = new AlphaSet();
                break;
            default:
                return null;
        }
        rotationXset.i = j;
        return rotationXset;
    }

    public final float d(float f, long j, View view, KeyCache keyCache) {
        this.f2291a.c(f, this.g);
        float[] fArr = this.g;
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float fA = keyCache.a(view, this.f);
            this.j = fA;
            if (Float.isNaN(fA)) {
                this.j = BitmapDescriptorFactory.HUE_RED;
            }
        }
        float f3 = (float) (((((j - this.i) * 1.0E-9d) * f2) + this.j) % 1.0d);
        this.j = f3;
        String str = this.f;
        HashMap map = keyCache.f2279a;
        if (map.containsKey(view)) {
            HashMap map2 = (HashMap) map.get(view);
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = (float[]) map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f3;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f3});
                map.put(view, map2);
            }
        } else {
            HashMap map3 = new HashMap();
            map3.put(str, new float[]{f3});
            map.put(view, map3);
        }
        this.i = j;
        float f4 = this.g[0];
        float fA2 = (a(this.j) * f4) + this.g[2];
        if (f4 == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) {
            z = false;
        }
        this.h = z;
        return fA2;
    }

    public abstract boolean f(float f, long j, View view, KeyCache keyCache);
}

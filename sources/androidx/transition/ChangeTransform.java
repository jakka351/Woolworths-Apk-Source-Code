package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import androidx.transition.ViewGroupUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class ChangeTransform extends Transition {
    public static final String[] L = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final Property M = new AnonymousClass1(float[].class, "nonTranslations");
    public static final Property N = new AnonymousClass2(PointF.class, "translations");
    public static final boolean O = true;
    public final boolean I;
    public final boolean J;
    public final Matrix K;

    /* renamed from: androidx.transition.ChangeTransform$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<PathAnimatorMatrix, float[]> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public final void set(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
            PathAnimatorMatrix pathAnimatorMatrix2 = pathAnimatorMatrix;
            float[] fArr2 = fArr;
            System.arraycopy(fArr2, 0, pathAnimatorMatrix2.c, 0, fArr2.length);
            pathAnimatorMatrix2.a();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<PathAnimatorMatrix, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public final void set(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
            PathAnimatorMatrix pathAnimatorMatrix2 = pathAnimatorMatrix;
            PointF pointF2 = pointF;
            pathAnimatorMatrix2.getClass();
            pathAnimatorMatrix2.d = pointF2.x;
            pathAnimatorMatrix2.e = pointF2.y;
            pathAnimatorMatrix2.a();
        }
    }

    public static class GhostListener extends TransitionListenerAdapter {
        public View d;
        public GhostView e;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void a() {
            this.e.setVisibility(4);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void d() {
            this.e.setVisibility(0);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void i(Transition transition) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            transition.D(this);
            View view = this.d;
            if (Build.VERSION.SDK_INT == 28) {
                if (!GhostViewPlatform.j) {
                    try {
                        GhostViewPlatform.b();
                        Method declaredMethod = GhostViewPlatform.e.getDeclaredMethod("removeGhost", View.class);
                        GhostViewPlatform.i = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
                    }
                    GhostViewPlatform.j = true;
                }
                Method method = GhostViewPlatform.i;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused) {
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2.getCause());
                    }
                }
            } else {
                int i = GhostViewPort.j;
                GhostViewPort ghostViewPort = (GhostViewPort) view.getTag(com.woolworths.R.id.ghost_view);
                if (ghostViewPort != null) {
                    int i2 = ghostViewPort.g - 1;
                    ghostViewPort.g = i2;
                    if (i2 <= 0) {
                        ((GhostViewHolder) ghostViewPort.getParent()).removeView(ghostViewPort);
                    }
                }
            }
            view.setTag(com.woolworths.R.id.transition_transform, null);
            view.setTag(com.woolworths.R.id.parent_matrix, null);
        }
    }

    public static class Listener extends AnimatorListenerAdapter {
        public boolean d;
        public final Matrix e = new Matrix();
        public final boolean f;
        public final boolean g;
        public final View h;
        public final Transforms i;
        public final PathAnimatorMatrix j;
        public final Matrix k;

        public Listener(View view, Transforms transforms, PathAnimatorMatrix pathAnimatorMatrix, Matrix matrix, boolean z, boolean z2) {
            this.f = z;
            this.g = z2;
            this.h = view;
            this.i = transforms;
            this.j = pathAnimatorMatrix;
            this.k = matrix;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.d = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z = this.d;
            Transforms transforms = this.i;
            View view = this.h;
            if (!z) {
                if (this.f && this.g) {
                    Matrix matrix = this.e;
                    matrix.set(this.k);
                    view.setTag(com.woolworths.R.id.transition_transform, matrix);
                    float f = transforms.f3782a;
                    float f2 = transforms.b;
                    float f3 = transforms.c;
                    float f4 = transforms.d;
                    float f5 = transforms.e;
                    float f6 = transforms.f;
                    float f7 = transforms.g;
                    float f8 = transforms.h;
                    String[] strArr = ChangeTransform.L;
                    view.setTranslationX(f);
                    view.setTranslationY(f2);
                    ViewCompat.O(view, f3);
                    view.setScaleX(f4);
                    view.setScaleY(f5);
                    view.setRotationX(f6);
                    view.setRotationY(f7);
                    view.setRotation(f8);
                } else {
                    view.setTag(com.woolworths.R.id.transition_transform, null);
                    view.setTag(com.woolworths.R.id.parent_matrix, null);
                }
            }
            ViewUtils.f3800a.d(view, null);
            float f9 = transforms.f3782a;
            float f10 = transforms.b;
            float f11 = transforms.c;
            float f12 = transforms.d;
            float f13 = transforms.e;
            float f14 = transforms.f;
            float f15 = transforms.g;
            float f16 = transforms.h;
            String[] strArr2 = ChangeTransform.L;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            ViewCompat.O(view, f11);
            view.setScaleX(f12);
            view.setScaleY(f13);
            view.setRotationX(f14);
            view.setRotationY(f15);
            view.setRotation(f16);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = this.j.f3781a;
            Matrix matrix2 = this.e;
            matrix2.set(matrix);
            View view = this.h;
            view.setTag(com.woolworths.R.id.transition_transform, matrix2);
            Transforms transforms = this.i;
            float f = transforms.f3782a;
            float f2 = transforms.b;
            float f3 = transforms.c;
            float f4 = transforms.d;
            float f5 = transforms.e;
            float f6 = transforms.f;
            float f7 = transforms.g;
            float f8 = transforms.h;
            String[] strArr = ChangeTransform.L;
            view.setTranslationX(f);
            view.setTranslationY(f2);
            ViewCompat.O(view, f3);
            view.setScaleX(f4);
            view.setScaleY(f5);
            view.setRotationX(f6);
            view.setRotationY(f7);
            view.setRotation(f8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            String[] strArr = ChangeTransform.L;
            View view = this.h;
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            ViewCompat.O(view, BitmapDescriptorFactory.HUE_RED);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotationX(BitmapDescriptorFactory.HUE_RED);
            view.setRotationY(BitmapDescriptorFactory.HUE_RED);
            view.setRotation(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public static class PathAnimatorMatrix {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f3781a = new Matrix();
        public final View b;
        public final float[] c;
        public float d;
        public float e;

        public PathAnimatorMatrix(View view, float[] fArr) {
            this.b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            a();
        }

        public final void a() {
            float f = this.d;
            float[] fArr = this.c;
            fArr[2] = f;
            fArr[5] = this.e;
            Matrix matrix = this.f3781a;
            matrix.setValues(fArr);
            ViewUtils.f3800a.d(this.b, matrix);
        }
    }

    public static class Transforms {

        /* renamed from: a, reason: collision with root package name */
        public final float f3782a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public Transforms(View view) {
            this.f3782a = view.getTranslationX();
            this.b = view.getTranslationY();
            this.c = ViewCompat.p(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Transforms)) {
                return false;
            }
            Transforms transforms = (Transforms) obj;
            return transforms.f3782a == this.f3782a && transforms.b == this.b && transforms.c == this.c && transforms.d == this.d && transforms.e == this.e && transforms.f == this.f && transforms.g == this.g && transforms.h == this.h;
        }

        public final int hashCode() {
            float f = this.f3782a;
            int iFloatToIntBits = (f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f2 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.h;
            return iFloatToIntBits7 + (f8 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f8) : 0);
        }
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = true;
        this.J = true;
        this.K = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.e);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.I = !TypedArrayUtils.f(xmlPullParser, "reparentWithOverlay") ? true : typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.J = TypedArrayUtils.f(xmlPullParser, "reparent") ? typedArrayObtainStyledAttributes.getBoolean(0, true) : true;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void R(TransitionValues transitionValues) {
        View view = transitionValues.b;
        HashMap map = transitionValues.f3796a;
        if (view.getVisibility() == 8) {
            return;
        }
        map.put("android:changeTransform:parent", view.getParent());
        map.put("android:changeTransform:transforms", new Transforms(view));
        Matrix matrix = view.getMatrix();
        map.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.J) {
            Matrix matrix2 = new Matrix();
            ViewUtils.f3800a.e((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            map.put("android:changeTransform:parentMatrix", matrix2);
            map.put("android:changeTransform:intermediateMatrix", view.getTag(com.woolworths.R.id.transition_transform));
            map.put("android:changeTransform:intermediateParentMatrix", view.getTag(com.woolworths.R.id.parent_matrix));
        }
    }

    @Override // androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        R(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        R(transitionValues);
        if (O) {
            return;
        }
        ((ViewGroup) transitionValues.b.getParent()).startViewTransition(transitionValues.b);
    }

    @Override // androidx.transition.Transition
    public final Animator k(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) throws NoSuchMethodException, SecurityException {
        Object obj;
        Animator animator;
        Animator animator2;
        int i;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        Animator animator3;
        int i2;
        boolean z3;
        int i3;
        int iIntValue;
        GhostViewHolder ghostViewHolder;
        GhostView ghostView;
        GhostView ghostViewPlatform;
        TransitionValues transitionValuesP;
        if (transitionValues == null) {
            return null;
        }
        HashMap map = transitionValues.f3796a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap map2 = transitionValues2.f3796a;
        if (!map.containsKey("android:changeTransform:parent") || !map2.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeTransform:parent");
        View view = (ViewGroup) map2.get("android:changeTransform:parent");
        boolean z4 = this.J && (!(y(viewGroup2) && y(view)) ? viewGroup2 == view : !((transitionValuesP = p(viewGroup2, true)) == null || view != transitionValuesP.b));
        Matrix matrix = (Matrix) map.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            map.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) map.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            map.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z4) {
            Matrix matrix3 = (Matrix) map2.get("android:changeTransform:parentMatrix");
            transitionValues2.b.setTag(com.woolworths.R.id.parent_matrix, matrix3);
            Matrix matrix4 = this.K;
            matrix4.reset();
            matrix3.invert(matrix4);
            Matrix matrix5 = (Matrix) map.get("android:changeTransform:matrix");
            if (matrix5 == null) {
                matrix5 = new Matrix();
                map.put("android:changeTransform:matrix", matrix5);
            }
            matrix5.postConcat((Matrix) map.get("android:changeTransform:parentMatrix"));
            matrix5.postConcat(matrix4);
        }
        Matrix matrix6 = (Matrix) map.get("android:changeTransform:matrix");
        Matrix matrix7 = (Matrix) map2.get("android:changeTransform:matrix");
        if (matrix6 == null) {
            matrix6 = MatrixUtils.f3787a;
        }
        if (matrix7 == null) {
            matrix7 = MatrixUtils.f3787a;
        }
        if (matrix6.equals(matrix7)) {
            obj = "android:changeTransform:parentMatrix";
            animator = null;
        } else {
            Transforms transforms = (Transforms) map2.get("android:changeTransform:transforms");
            View view2 = transitionValues2.b;
            view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            ViewCompat.O(view2, BitmapDescriptorFactory.HUE_RED);
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setRotationX(BitmapDescriptorFactory.HUE_RED);
            view2.setRotationY(BitmapDescriptorFactory.HUE_RED);
            view2.setRotation(BitmapDescriptorFactory.HUE_RED);
            float[] fArr = new float[9];
            matrix6.getValues(fArr);
            float[] fArr2 = new float[9];
            matrix7.getValues(fArr2);
            PathAnimatorMatrix pathAnimatorMatrix = new PathAnimatorMatrix(view2, fArr);
            FloatArrayEvaluator floatArrayEvaluator = new FloatArrayEvaluator();
            floatArrayEvaluator.f3783a = new float[9];
            Matrix matrix8 = matrix7;
            Animator animatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(pathAnimatorMatrix, PropertyValuesHolder.ofObject(M, floatArrayEvaluator, fArr, fArr2), PropertyValuesHolder.ofObject(N, (TypeConverter) null, this.A.a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
            obj = "android:changeTransform:parentMatrix";
            Listener listener = new Listener(view2, transforms, pathAnimatorMatrix, matrix8, z4, this.I);
            animatorOfPropertyValuesHolder.addListener(listener);
            animatorOfPropertyValuesHolder.addPauseListener(listener);
            animator = animatorOfPropertyValuesHolder;
        }
        boolean z5 = O;
        if (z4 && animator != null && this.I) {
            View view3 = transitionValues2.b;
            Matrix matrix9 = new Matrix((Matrix) map2.get(obj));
            ViewUtils.f3800a.f(viewGroup, matrix9);
            if (Build.VERSION.SDK_INT == 28) {
                if (!GhostViewPlatform.h) {
                    try {
                        GhostViewPlatform.b();
                        Method declaredMethod = GhostViewPlatform.e.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                        GhostViewPlatform.g = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e);
                    }
                    GhostViewPlatform.h = true;
                }
                Method method = GhostViewPlatform.g;
                if (method != null) {
                    try {
                        ghostViewPlatform = new GhostViewPlatform((View) method.invoke(null, view3, viewGroup, matrix9));
                    } catch (IllegalAccessException unused) {
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2.getCause());
                    }
                    z = z5;
                    animator2 = animator;
                    ghostView = ghostViewPlatform;
                } else {
                    ghostViewPlatform = null;
                    z = z5;
                    animator2 = animator;
                    ghostView = ghostViewPlatform;
                }
            } else {
                int i4 = GhostViewPort.j;
                if (!(view3.getParent() instanceof ViewGroup)) {
                    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
                }
                int i5 = GhostViewHolder.f;
                GhostViewHolder ghostViewHolder2 = (GhostViewHolder) viewGroup.getTag(com.woolworths.R.id.ghost_view_holder);
                GhostViewPort ghostViewPort = (GhostViewPort) view3.getTag(com.woolworths.R.id.ghost_view);
                if (ghostViewPort == null || (ghostViewHolder = (GhostViewHolder) ghostViewPort.getParent()) == ghostViewHolder2) {
                    i = 0;
                } else {
                    i = ghostViewPort.g;
                    ghostViewHolder.removeView(ghostViewPort);
                    ghostViewPort = null;
                }
                if (ghostViewPort == null) {
                    ghostViewPort = new GhostViewPort(view3);
                    ghostViewPort.h = matrix9;
                    if (ghostViewHolder2 == null) {
                        ghostViewHolder2 = new GhostViewHolder(viewGroup.getContext());
                        ghostViewHolder2.setClipChildren(false);
                        ghostViewHolder2.d = viewGroup;
                        viewGroup.setTag(com.woolworths.R.id.ghost_view_holder, ghostViewHolder2);
                        ViewCompat.a(ghostViewHolder2, viewGroup);
                        ghostViewHolder2.e = true;
                    } else {
                        ViewGroup viewGroup3 = ghostViewHolder2.d;
                        if (!ghostViewHolder2.e) {
                            throw new IllegalStateException("This GhostViewHolder is detached!");
                        }
                        viewGroup3.getOverlay().remove(ghostViewHolder2);
                        viewGroup3.getOverlay().add(ghostViewHolder2);
                    }
                    ViewUtils.a(ghostViewHolder2, ghostViewHolder2.getLeft(), ghostViewHolder2.getTop(), viewGroup.getWidth() + ghostViewHolder2.getLeft(), viewGroup.getHeight() + ghostViewHolder2.getTop());
                    ViewUtils.a(ghostViewPort, ghostViewPort.getLeft(), ghostViewPort.getTop(), viewGroup.getWidth() + ghostViewPort.getLeft(), viewGroup.getHeight() + ghostViewPort.getTop());
                    ArrayList arrayList3 = new ArrayList();
                    GhostViewHolder.a(ghostViewPort.f, arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    int childCount = ghostViewHolder2.getChildCount() - 1;
                    int i6 = 0;
                    while (i6 <= childCount) {
                        int i7 = (i6 + childCount) / 2;
                        int i8 = childCount;
                        GhostViewHolder.a(((GhostViewPort) ghostViewHolder2.getChildAt(i7)).f, arrayList4);
                        if (arrayList3.isEmpty() || arrayList4.isEmpty()) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            z2 = z5;
                            animator3 = animator;
                        } else {
                            z2 = z5;
                            animator3 = animator;
                            if (arrayList3.get(0) != arrayList4.get(0)) {
                                arrayList = arrayList3;
                            } else {
                                int iMin = Math.min(arrayList3.size(), arrayList4.size());
                                int i9 = 1;
                                while (true) {
                                    if (i9 < iMin) {
                                        View view4 = (View) arrayList3.get(i9);
                                        arrayList = arrayList3;
                                        View view5 = (View) arrayList4.get(i9);
                                        if (view4 != view5) {
                                            ViewGroup viewGroup4 = (ViewGroup) view4.getParent();
                                            int childCount2 = viewGroup4.getChildCount();
                                            if (view4.getZ() == view5.getZ()) {
                                                arrayList2 = arrayList4;
                                                int i10 = 0;
                                                while (i10 < childCount2) {
                                                    int i11 = childCount2;
                                                    i2 = i7;
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        iIntValue = ViewGroupUtils.Api29Impl.a(viewGroup4, i10);
                                                        i3 = i10;
                                                    } else {
                                                        if (!ViewGroupUtils.c) {
                                                            try {
                                                                Class cls = Integer.TYPE;
                                                                Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                                                                ViewGroupUtils.b = declaredMethod2;
                                                                z3 = true;
                                                                try {
                                                                    declaredMethod2.setAccessible(true);
                                                                } catch (NoSuchMethodException unused2) {
                                                                }
                                                            } catch (NoSuchMethodException unused3) {
                                                                z3 = true;
                                                            }
                                                            ViewGroupUtils.c = z3;
                                                        }
                                                        Method method2 = ViewGroupUtils.b;
                                                        if (method2 != null) {
                                                            try {
                                                                i3 = i10;
                                                                try {
                                                                    iIntValue = ((Integer) method2.invoke(viewGroup4, Integer.valueOf(viewGroup4.getChildCount()), Integer.valueOf(i3))).intValue();
                                                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                                                }
                                                            } catch (IllegalAccessException | InvocationTargetException unused5) {
                                                            }
                                                        } else {
                                                            i3 = i10;
                                                            iIntValue = i3;
                                                        }
                                                    }
                                                    View childAt = viewGroup4.getChildAt(iIntValue);
                                                    if (childAt != view4) {
                                                        if (childAt == view5) {
                                                            break;
                                                        }
                                                        i10 = i3 + 1;
                                                        childCount2 = i11;
                                                        i7 = i2;
                                                    }
                                                }
                                            } else if (view4.getZ() <= view5.getZ()) {
                                                arrayList2 = arrayList4;
                                                i2 = i7;
                                            }
                                        } else {
                                            i9++;
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        arrayList2 = arrayList4;
                                        i2 = i7;
                                        if (arrayList2.size() == iMin) {
                                            break;
                                        }
                                    }
                                    arrayList2.clear();
                                    arrayList3 = arrayList;
                                    z5 = z2;
                                    animator = animator3;
                                    arrayList4 = arrayList2;
                                }
                                childCount = i2 - 1;
                                arrayList2.clear();
                                arrayList3 = arrayList;
                                z5 = z2;
                                animator = animator3;
                                arrayList4 = arrayList2;
                            }
                            arrayList2 = arrayList4;
                        }
                        i2 = i7;
                        i6 = i2 + 1;
                        childCount = i8;
                        arrayList2.clear();
                        arrayList3 = arrayList;
                        z5 = z2;
                        animator = animator3;
                        arrayList4 = arrayList2;
                    }
                    z = z5;
                    animator2 = animator;
                    if (i6 < 0 || i6 >= ghostViewHolder2.getChildCount()) {
                        ghostViewHolder2.addView(ghostViewPort);
                    } else {
                        ghostViewHolder2.addView(ghostViewPort, i6);
                    }
                    ghostViewPort.g = i;
                } else {
                    z = z5;
                    animator2 = animator;
                    ghostViewPort.h = matrix9;
                }
                GhostViewPort ghostViewPort2 = ghostViewPort;
                ghostViewPort2.g++;
                ghostView = ghostViewPort2;
            }
            if (ghostView != null) {
                ghostView.a(transitionValues.b, (ViewGroup) map.get("android:changeTransform:parent"));
                Transition transition = this;
                while (true) {
                    TransitionSet transitionSet = transition.l;
                    if (transitionSet == null) {
                        break;
                    }
                    transition = transitionSet;
                }
                GhostListener ghostListener = new GhostListener();
                ghostListener.d = view3;
                ghostListener.e = ghostView;
                transition.a(ghostListener);
                if (z) {
                    View view6 = transitionValues.b;
                    if (view6 != transitionValues2.b) {
                        ViewUtils.b(view6, BitmapDescriptorFactory.HUE_RED);
                    }
                    ViewUtils.b(view3, 1.0f);
                }
            }
        } else {
            animator2 = animator;
            if (!z5) {
                viewGroup2.endViewTransition(transitionValues.b);
            }
        }
        return animator2;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return L;
    }
}

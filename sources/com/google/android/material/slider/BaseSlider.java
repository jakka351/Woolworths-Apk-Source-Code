package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.slider.BaseOnChangeListener;
import com.google.android.material.slider.BaseOnSliderTouchListener;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import com.woolworths.R;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends BaseOnChangeListener<S>, T extends BaseOnSliderTouchListener<S>> extends View {
    public static final /* synthetic */ int y0 = 0;
    public final int A;
    public final int B;
    public final int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final int P;
    public float Q;
    public MotionEvent R;
    public LabelFormatter S;
    public boolean T;
    public float U;
    public float V;
    public ArrayList W;
    public int a0;
    public int b0;
    public float c0;
    public final Paint d;
    public float[] d0;
    public final Paint e;
    public boolean e0;
    public final Paint f;
    public int f0;
    public final Paint g;
    public int g0;
    public final Paint h;
    public int h0;
    public final Paint i;
    public boolean i0;
    public final Paint j;
    public boolean j0;
    public final AccessibilityHelper k;
    public ColorStateList k0;
    public final AccessibilityManager l;
    public ColorStateList l0;
    public AccessibilityEventSender m;
    public ColorStateList m0;
    public final int n;
    public ColorStateList n0;
    public final ArrayList o;
    public ColorStateList o0;
    public final ArrayList p;
    public final Path p0;
    public final ArrayList q;
    public final RectF q0;
    public boolean r;
    public final RectF r0;
    public ValueAnimator s;
    public final MaterialShapeDrawable s0;
    public ValueAnimator t;
    public Drawable t0;
    public final int u;
    public List u0;
    public final int v;
    public float v0;
    public final int w;
    public int w0;
    public final int x;
    public final a x0;
    public final int y;
    public final int z;

    /* renamed from: com.google.android.material.slider.BaseSlider$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14650a;

        static {
            int[] iArr = new int[FullCornerDirection.values().length];
            f14650a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14650a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14650a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14650a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class AccessibilityEventSender implements Runnable {
        public int d = -1;

        public AccessibilityEventSender() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.k.x(this.d, 4);
        }
    }

    public static class AccessibilityHelper extends ExploreByTouchHelper {
        public final BaseSlider q;
        public final Rect r;

        public AccessibilityHelper(BaseSlider baseSlider) {
            super(baseSlider);
            this.r = new Rect();
            this.q = baseSlider;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final int n(float f, float f2) {
            int i = 0;
            while (true) {
                BaseSlider baseSlider = this.q;
                if (i >= baseSlider.getValues().size()) {
                    return -1;
                }
                Rect rect = this.r;
                baseSlider.w(i, rect);
                if (rect.contains((int) f, (int) f2)) {
                    return i;
                }
                i++;
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void o(ArrayList arrayList) {
            for (int i = 0; i < this.q.getValues().size(); i++) {
                arrayList.add(Integer.valueOf(i));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final boolean s(int i, int i2, Bundle bundle) {
            BaseSlider baseSlider = this.q;
            if (!baseSlider.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                }
                float f = bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
                int i3 = BaseSlider.y0;
                if (!baseSlider.u(f, i)) {
                    return false;
                }
                baseSlider.x();
                baseSlider.postInvalidate();
                p(i);
                return true;
            }
            int i4 = BaseSlider.y0;
            float fRound = baseSlider.c0;
            if (fRound == BitmapDescriptorFactory.HUE_RED) {
                fRound = 1.0f;
            }
            if ((baseSlider.V - baseSlider.U) / fRound > 20) {
                fRound *= Math.round(r1 / r4);
            }
            if (i2 == 8192) {
                fRound = -fRound;
            }
            if (baseSlider.l()) {
                fRound = -fRound;
            }
            if (!baseSlider.u(MathUtils.a(baseSlider.getValues().get(i).floatValue() + fRound, baseSlider.getValueFrom(), baseSlider.getValueTo()), i)) {
                return false;
            }
            baseSlider.x();
            baseSlider.postInvalidate();
            p(i);
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void u(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
            accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.t);
            BaseSlider baseSlider = this.q;
            List<Float> values = baseSlider.getValues();
            float fFloatValue = values.get(i).floatValue();
            float valueFrom = baseSlider.getValueFrom();
            float valueTo = baseSlider.getValueTo();
            if (baseSlider.isEnabled()) {
                if (fFloatValue > valueFrom) {
                    accessibilityNodeInfoCompat.a(8192);
                }
                if (fFloatValue < valueTo) {
                    accessibilityNodeInfoCompat.a(4096);
                }
            }
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
            accessibilityNodeInfoCompat.l(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (baseSlider.getContentDescription() != null) {
                sb.append(baseSlider.getContentDescription());
                sb.append(",");
            }
            String strG = baseSlider.g(fFloatValue);
            String string = baseSlider.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = i == baseSlider.getValues().size() - 1 ? baseSlider.getContext().getString(R.string.material_slider_range_end) : i == 0 ? baseSlider.getContext().getString(R.string.material_slider_range_start) : "";
            }
            Locale locale = Locale.US;
            sb.append(string + ", " + strG);
            accessibilityNodeInfoCompat.p(sb.toString());
            Rect rect = this.r;
            baseSlider.w(i, rect);
            accessibilityNodeInfo.setBoundsInParent(rect);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FullCornerDirection {
        public static final FullCornerDirection d;
        public static final FullCornerDirection e;
        public static final FullCornerDirection f;
        public static final /* synthetic */ FullCornerDirection[] g;

        /* JADX INFO: Fake field, exist only in values array */
        FullCornerDirection EF0;

        static {
            FullCornerDirection fullCornerDirection = new FullCornerDirection("BOTH", 0);
            FullCornerDirection fullCornerDirection2 = new FullCornerDirection("LEFT", 1);
            d = fullCornerDirection2;
            FullCornerDirection fullCornerDirection3 = new FullCornerDirection("RIGHT", 2);
            e = fullCornerDirection3;
            FullCornerDirection fullCornerDirection4 = new FullCornerDirection("NONE", 3);
            f = fullCornerDirection4;
            g = new FullCornerDirection[]{fullCornerDirection, fullCornerDirection2, fullCornerDirection3, fullCornerDirection4};
        }

        public static FullCornerDirection valueOf(String str) {
            return (FullCornerDirection) Enum.valueOf(FullCornerDirection.class, str);
        }

        public static FullCornerDirection[] values() {
            return (FullCornerDirection[]) g.clone();
        }
    }

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new AnonymousClass1();
        public float d;
        public float e;
        public ArrayList f;
        public float g;
        public boolean h;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            public final SliderState createFromParcel(Parcel parcel) {
                SliderState sliderState = new SliderState(parcel);
                sliderState.d = parcel.readFloat();
                sliderState.e = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                sliderState.f = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                sliderState.g = parcel.readFloat();
                sliderState.h = parcel.createBooleanArray()[0];
                return sliderState;
            }

            @Override // android.os.Parcelable.Creator
            public final SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.d);
            parcel.writeFloat(this.e);
            parcel.writeList(this.f);
            parcel.writeFloat(this.g);
            parcel.writeBooleanArray(new boolean[]{this.h});
        }
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    public final void A() {
        boolean z;
        int iMax = Math.max(this.C, Math.max(this.F + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.I));
        boolean z2 = true;
        if (iMax == this.D) {
            z = false;
        } else {
            this.D = iMax;
            z = true;
        }
        int iMax2 = Math.max(Math.max(Math.max((this.H / 2) - this.w, 0), Math.max((this.F - this.x) / 2, 0)), Math.max(Math.max(this.f0 - this.y, 0), Math.max(this.g0 - this.z, 0))) + this.v;
        if (this.G == iMax2) {
            z2 = false;
        } else {
            this.G = iMax2;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (isLaidOut()) {
                this.h0 = Math.max(getWidth() - (this.G * 2), 0);
                m();
            }
        }
        if (z) {
            requestLayout();
        } else if (z2) {
            postInvalidate();
        }
    }

    public final void B() {
        if (this.j0) {
            float f = this.U;
            float f2 = this.V;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + this.U + ") must be smaller than valueTo(" + this.V + ")");
            }
            if (f2 <= f) {
                throw new IllegalStateException("valueTo(" + this.V + ") must be greater than valueFrom(" + this.U + ")");
            }
            if (this.c0 > BitmapDescriptorFactory.HUE_RED && !C(f2)) {
                float f3 = this.c0;
                float f4 = this.U;
                float f5 = this.V;
                StringBuilder sb = new StringBuilder("The stepSize(");
                sb.append(f3);
                sb.append(") must be 0, or a factor of the valueFrom(");
                sb.append(f4);
                sb.append(")-valueTo(");
                throw new IllegalStateException(android.support.v4.media.session.a.j(f5, ") range", sb));
            }
            Iterator it = this.W.iterator();
            while (it.hasNext()) {
                Float f6 = (Float) it.next();
                if (f6.floatValue() < this.U || f6.floatValue() > this.V) {
                    float f7 = this.U;
                    float f8 = this.V;
                    StringBuilder sb2 = new StringBuilder("Slider value(");
                    sb2.append(f6);
                    sb2.append(") must be greater or equal to valueFrom(");
                    sb2.append(f7);
                    sb2.append("), and lower or equal to valueTo(");
                    throw new IllegalStateException(android.support.v4.media.session.a.j(f8, ")", sb2));
                }
                if (this.c0 > BitmapDescriptorFactory.HUE_RED && !C(f6.floatValue())) {
                    float f9 = this.U;
                    float f10 = this.c0;
                    throw new IllegalStateException("Value(" + f6 + ") must be equal to valueFrom(" + f9 + ") plus a multiple of stepSize(" + f10 + ") when using stepSize(" + f10 + ")");
                }
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f11 = this.c0;
            if (f11 > BitmapDescriptorFactory.HUE_RED && minSeparation > BitmapDescriptorFactory.HUE_RED) {
                if (this.w0 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + this.c0 + ")");
                }
                if (minSeparation < f11 || !j(minSeparation)) {
                    float f12 = this.c0;
                    StringBuilder sb3 = new StringBuilder("minSeparation(");
                    sb3.append(minSeparation);
                    sb3.append(") must be greater or equal and a multiple of stepSize(");
                    sb3.append(f12);
                    sb3.append(") when using stepSize(");
                    throw new IllegalStateException(android.support.v4.media.session.a.j(f12, ")", sb3));
                }
            }
            float f13 = this.c0;
            if (f13 != BitmapDescriptorFactory.HUE_RED) {
                if (((int) f13) != f13) {
                    Log.w("BaseSlider", "Floating point value used for stepSize(" + f13 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f14 = this.U;
                if (((int) f14) != f14) {
                    Log.w("BaseSlider", "Floating point value used for valueFrom(" + f14 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f15 = this.V;
                if (((int) f15) != f15) {
                    Log.w("BaseSlider", "Floating point value used for valueTo(" + f15 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.j0 = false;
        }
    }

    public final boolean C(float f) {
        return j(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.U)), MathContext.DECIMAL64).doubleValue());
    }

    public final float D(float f) {
        return (p(f) * this.h0) + this.G;
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.H, this.I);
        } else {
            float fMax = Math.max(this.H, this.I) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public final int b() {
        int i = this.D / 2;
        int i2 = this.E;
        return i + ((i2 == 1 || i2 == 3) ? ((TooltipDrawable) this.o.get(0)).getIntrinsicHeight() : 0);
    }

    public final ValueAnimator c(boolean z) {
        int iC;
        TimeInterpolator timeInterpolatorD;
        float fFloatValue = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.t : this.s;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, z ? 1.0f : 0.0f);
        if (z) {
            iC = MotionUtils.c(getContext(), R.attr.motionDurationMedium4, 83);
            timeInterpolatorD = MotionUtils.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.e);
        } else {
            iC = MotionUtils.c(getContext(), R.attr.motionDurationShort3, 117);
            timeInterpolatorD = MotionUtils.d(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, AnimationUtils.c);
        }
        valueAnimatorOfFloat.setDuration(iC);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorD);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.BaseSlider.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                BaseSlider baseSlider = BaseSlider.this;
                Iterator it = baseSlider.o.iterator();
                while (it.hasNext()) {
                    TooltipDrawable tooltipDrawable = (TooltipDrawable) it.next();
                    tooltipDrawable.Q = 1.2f;
                    tooltipDrawable.O = fFloatValue2;
                    tooltipDrawable.P = fFloatValue2;
                    tooltipDrawable.R = AnimationUtils.b(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.19f, 1.0f, fFloatValue2);
                    tooltipDrawable.invalidateSelf();
                }
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                baseSlider.postInvalidateOnAnimation();
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void d(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.G + ((int) (p(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.k.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.d.setColor(i(this.o0));
        this.e.setColor(i(this.n0));
        this.h.setColor(i(this.m0));
        this.i.setColor(i(this.l0));
        this.j.setColor(i(this.n0));
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            TooltipDrawable tooltipDrawable = (TooltipDrawable) it.next();
            if (tooltipDrawable.isStateful()) {
                tooltipDrawable.setState(getDrawableState());
            }
        }
        MaterialShapeDrawable materialShapeDrawable = this.s0;
        if (materialShapeDrawable.isStateful()) {
            materialShapeDrawable.setState(getDrawableState());
        }
        int i = i(this.k0);
        Paint paint = this.g;
        paint.setColor(i);
        paint.setAlpha(63);
    }

    public final void e() {
        if (!this.r) {
            this.r = true;
            ValueAnimator valueAnimatorC = c(true);
            this.s = valueAnimatorC;
            this.t = null;
            valueAnimatorC.start();
        }
        ArrayList arrayList = this.o;
        Iterator it = arrayList.iterator();
        for (int i = 0; i < this.W.size() && it.hasNext(); i++) {
            if (i != this.b0) {
                s((TooltipDrawable) it.next(), ((Float) this.W.get(i)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.W.size())));
        }
        s((TooltipDrawable) it.next(), ((Float) this.W.get(this.b0)).floatValue());
    }

    public final void f() {
        if (this.r) {
            this.r = false;
            ValueAnimator valueAnimatorC = c(false);
            this.t = valueAnimatorC;
            this.s = null;
            valueAnimatorC.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    BaseSlider baseSlider = BaseSlider.this;
                    ViewOverlayImpl viewOverlayImplF = ViewUtils.f(ViewUtils.e(baseSlider));
                    Iterator it = baseSlider.o.iterator();
                    while (it.hasNext()) {
                        viewOverlayImplF.a((TooltipDrawable) it.next());
                    }
                }
            });
            this.t.start();
        }
    }

    public final String g(float f) {
        if (this.S != null) {
            return this.S.a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.k.k;
    }

    public float getMinSeparation() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public int getThumbRadius() {
        return this.H / 2;
    }

    public float getValueFrom() {
        return this.U;
    }

    public float getValueTo() {
        return this.V;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.W);
    }

    public final float[] h() {
        float fFloatValue = ((Float) this.W.get(0)).floatValue();
        float fFloatValue2 = ((Float) YU.a.c(1, this.W)).floatValue();
        if (this.W.size() == 1) {
            fFloatValue = this.U;
        }
        float fP = p(fFloatValue);
        float fP2 = p(fFloatValue2);
        return l() ? new float[]{fP2, fP} : new float[]{fP, fP2};
    }

    public final int i(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean j(double d) {
        double dDoubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.c0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    public final boolean k(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean l() {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        return getLayoutDirection() == 1;
    }

    public final void m() {
        if (this.c0 <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        B();
        int iMin = Math.min((int) (((this.V - this.U) / this.c0) + 1.0f), (this.h0 / this.A) + 1);
        float[] fArr = this.d0;
        if (fArr == null || fArr.length != iMin * 2) {
            this.d0 = new float[iMin * 2];
        }
        float f = this.h0 / (iMin - 1);
        for (int i = 0; i < iMin * 2; i += 2) {
            float[] fArr2 = this.d0;
            fArr2[i] = ((i / 2.0f) * f) + this.G;
            fArr2[i + 1] = b();
        }
    }

    public final boolean n(int i) {
        int i2 = this.b0;
        long j = i2 + i;
        long size = this.W.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.b0 = i3;
        if (i3 == i2) {
            return false;
        }
        if (this.a0 != -1) {
            this.a0 = i3;
        }
        x();
        postInvalidate();
        return true;
    }

    public final void o(int i) {
        if (l()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        n(i);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.x0);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            TooltipDrawable tooltipDrawable = (TooltipDrawable) it.next();
            ViewGroup viewGroupE = ViewUtils.e(this);
            if (viewGroupE == null) {
                tooltipDrawable.getClass();
            } else {
                tooltipDrawable.getClass();
                int[] iArr = new int[2];
                viewGroupE.getLocationOnScreen(iArr);
                tooltipDrawable.N = iArr[0];
                viewGroupE.getWindowVisibleDisplayFrame(tooltipDrawable.G);
                viewGroupE.addOnLayoutChangeListener(tooltipDrawable.F);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityEventSender accessibilityEventSender = this.m;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        this.r = false;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            TooltipDrawable tooltipDrawable = (TooltipDrawable) it.next();
            ViewOverlayImpl viewOverlayImplF = ViewUtils.f(ViewUtils.e(this));
            if (viewOverlayImplF != null) {
                viewOverlayImplF.a(tooltipDrawable);
                ViewGroup viewGroupE = ViewUtils.e(this);
                if (viewGroupE == null) {
                    tooltipDrawable.getClass();
                } else {
                    viewGroupE.removeOnLayoutChangeListener(tooltipDrawable.F);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.x0);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        AccessibilityHelper accessibilityHelper = this.k;
        if (!z) {
            this.a0 = -1;
            accessibilityHelper.j(this.b0);
            return;
        }
        if (i == 1) {
            n(Integer.MAX_VALUE);
        } else if (i == 2) {
            n(Integer.MIN_VALUE);
        } else if (i == 17) {
            o(Integer.MAX_VALUE);
        } else if (i == 66) {
            o(Integer.MIN_VALUE);
        }
        accessibilityHelper.w(this.b0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.i0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.D;
        int i4 = this.E;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + ((i4 == 1 || i4 == 3) ? ((TooltipDrawable) this.o.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.U = sliderState.d;
        this.V = sliderState.e;
        t(sliderState.f);
        this.c0 = sliderState.g;
        if (sliderState.h) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.d = this.U;
        sliderState.e = this.V;
        sliderState.f = new ArrayList(this.W);
        sliderState.g = this.c0;
        sliderState.h = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.h0 = Math.max(i - (this.G * 2), 0);
        m();
        x();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        ViewOverlayImpl viewOverlayImplF;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (viewOverlayImplF = ViewUtils.f(ViewUtils.e(this))) == null) {
            return;
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            viewOverlayImplF.a((TooltipDrawable) it.next());
        }
    }

    public final float p(float f) {
        float f2 = this.U;
        float f3 = (f - f2) / (this.V - f2);
        return l() ? 1.0f - f3 : f3;
    }

    public final void q() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((BaseOnSliderTouchListener) it.next()).a(this);
        }
    }

    public boolean r() {
        if (this.a0 != -1) {
            return true;
        }
        float f = this.v0;
        if (l()) {
            f = 1.0f - f;
        }
        float f2 = this.V;
        float f3 = this.U;
        float fA = YU.a.a(f2, f3, f, f3);
        float fD = D(fA);
        this.a0 = 0;
        float fAbs = Math.abs(((Float) this.W.get(0)).floatValue() - fA);
        for (int i = 1; i < this.W.size(); i++) {
            float fAbs2 = Math.abs(((Float) this.W.get(i)).floatValue() - fA);
            float fD2 = D(((Float) this.W.get(i)).floatValue());
            if (Float.compare(fAbs2, fAbs) > 0) {
                break;
            }
            boolean z = !l() ? fD2 - fD >= BitmapDescriptorFactory.HUE_RED : fD2 - fD <= BitmapDescriptorFactory.HUE_RED;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.a0 = i;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fD2 - fD) < this.u) {
                        this.a0 = -1;
                        return false;
                    }
                    if (z) {
                        this.a0 = i;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.a0 != -1;
    }

    public final void s(TooltipDrawable tooltipDrawable, float f) {
        String strG = g(f);
        if (!TextUtils.equals(tooltipDrawable.B, strG)) {
            tooltipDrawable.B = strG;
            tooltipDrawable.E.e = true;
            tooltipDrawable.invalidateSelf();
        }
        int iP = (this.G + ((int) (p(f) * this.h0))) - (tooltipDrawable.getIntrinsicWidth() / 2);
        int iB = b() - ((this.I / 2) + this.P);
        tooltipDrawable.setBounds(iP, iB - tooltipDrawable.getIntrinsicHeight(), tooltipDrawable.getIntrinsicWidth() + iP, iB);
        Rect rect = new Rect(tooltipDrawable.getBounds());
        DescendantOffsetUtils.c(ViewUtils.e(this), this, rect);
        tooltipDrawable.setBounds(rect);
        ViewUtils.f(ViewUtils.e(this)).b(tooltipDrawable);
    }

    public void setActiveThumbIndex(int i) {
        this.a0 = i;
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.t0 = drawableNewDrawable;
        this.u0.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.W.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.b0 = i;
        this.k.w(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i == this.J) {
            return;
        }
        this.J = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.J);
        } else {
            postInvalidate();
        }
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.k0)) {
            return;
        }
        this.k0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int i = i(colorStateList);
        Paint paint = this.g;
        paint.setColor(i);
        paint.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.E != i) {
            this.E = i;
            requestLayout();
        }
    }

    public void setSeparationUnit(int i) {
        this.w0 = i;
        this.j0 = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            if (this.c0 != f) {
                this.c0 = f;
                this.j0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        float f2 = this.U;
        float f3 = this.V;
        StringBuilder sb = new StringBuilder("The stepSize(");
        sb.append(f);
        sb.append(") must be 0, or a factor of the valueFrom(");
        sb.append(f2);
        sb.append(")-valueTo(");
        throw new IllegalArgumentException(android.support.v4.media.session.a.j(f3, ") range", sb));
    }

    public void setThumbElevation(float f) {
        this.s0.l(f);
    }

    public void setThumbHeight(int i) {
        if (i == this.I) {
            return;
        }
        this.I = i;
        this.s0.setBounds(0, 0, this.H, i);
        Drawable drawable = this.t0;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        A();
    }

    public void setThumbRadius(int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.s0.s(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeWidth(float f) {
        this.s0.t(f);
        postInvalidate();
    }

    public void setThumbTrackGapSize(int i) {
        if (this.K == i) {
            return;
        }
        this.K = i;
        invalidate();
    }

    public void setThumbWidth(int i) {
        if (i == this.H) {
            return;
        }
        this.H = i;
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        CornerTreatment cornerTreatmentA = MaterialShapeUtils.a(0);
        builder.f14637a = cornerTreatmentA;
        builder.b = cornerTreatmentA;
        builder.c = cornerTreatmentA;
        builder.d = cornerTreatmentA;
        builder.b(this.H / 2.0f);
        ShapeAppearanceModel shapeAppearanceModelA = builder.a();
        MaterialShapeDrawable materialShapeDrawable = this.s0;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA);
        materialShapeDrawable.setBounds(0, 0, this.H, this.I);
        Drawable drawable = this.t0;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        A();
    }

    public void setTickActiveRadius(int i) {
        if (this.f0 != i) {
            this.f0 = i;
            this.i.setStrokeWidth(i * 2);
            A();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.l0)) {
            return;
        }
        this.l0 = colorStateList;
        this.i.setColor(i(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(int i) {
        if (this.g0 != i) {
            this.g0 = i;
            this.h.setStrokeWidth(i * 2);
            A();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.m0)) {
            return;
        }
        this.m0 = colorStateList;
        this.h.setColor(i(colorStateList));
        invalidate();
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.n0)) {
            return;
        }
        this.n0 = colorStateList;
        this.e.setColor(i(colorStateList));
        this.j.setColor(i(this.n0));
        invalidate();
    }

    public void setTrackHeight(int i) {
        if (this.F != i) {
            this.F = i;
            this.d.setStrokeWidth(i);
            this.e.setStrokeWidth(this.F);
            A();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.o0)) {
            return;
        }
        this.o0 = colorStateList;
        this.d.setColor(i(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(int i) {
        if (this.O == i) {
            return;
        }
        this.O = i;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        if (this.N == i) {
            return;
        }
        this.N = i;
        this.j.setStrokeWidth(i);
        invalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        t(arrayList);
    }

    public final void t(ArrayList arrayList) {
        ViewGroup viewGroupE;
        int resourceId;
        ViewOverlayImpl viewOverlayImplF;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.W.size() == arrayList.size() && this.W.equals(arrayList)) {
            return;
        }
        this.W = arrayList;
        this.j0 = true;
        this.b0 = 0;
        x();
        ArrayList arrayList2 = this.o;
        if (arrayList2.size() > this.W.size()) {
            List<TooltipDrawable> listSubList = arrayList2.subList(this.W.size(), arrayList2.size());
            for (TooltipDrawable tooltipDrawable : listSubList) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                if (isAttachedToWindow() && (viewOverlayImplF = ViewUtils.f(ViewUtils.e(this))) != null) {
                    viewOverlayImplF.a(tooltipDrawable);
                    ViewGroup viewGroupE2 = ViewUtils.e(this);
                    if (viewGroupE2 == null) {
                        tooltipDrawable.getClass();
                    } else {
                        viewGroupE2.removeOnLayoutChangeListener(tooltipDrawable.F);
                    }
                }
            }
            listSubList.clear();
        }
        while (arrayList2.size() < this.W.size()) {
            Context context = getContext();
            int i = this.n;
            TooltipDrawable tooltipDrawable2 = new TooltipDrawable(context, i);
            TypedArray typedArrayD = ThemeEnforcement.d(tooltipDrawable2.C, null, com.google.android.material.R.styleable.k0, 0, i, new int[0]);
            Context context2 = tooltipDrawable2.C;
            tooltipDrawable2.M = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z = typedArrayD.getBoolean(8, true);
            tooltipDrawable2.L = z;
            if (z) {
                ShapeAppearanceModel.Builder builderG = tooltipDrawable2.d.f14634a.g();
                builderG.k = tooltipDrawable2.y();
                tooltipDrawable2.setShapeAppearanceModel(builderG.a());
            } else {
                tooltipDrawable2.M = 0;
            }
            CharSequence text = typedArrayD.getText(6);
            boolean zEquals = TextUtils.equals(tooltipDrawable2.B, text);
            TextDrawableHelper textDrawableHelper = tooltipDrawable2.E;
            if (!zEquals) {
                tooltipDrawable2.B = text;
                textDrawableHelper.e = true;
                tooltipDrawable2.invalidateSelf();
            }
            TextAppearance textAppearance = (!typedArrayD.hasValue(0) || (resourceId = typedArrayD.getResourceId(0, 0)) == 0) ? null : new TextAppearance(context2, resourceId);
            if (textAppearance != null && typedArrayD.hasValue(1)) {
                textAppearance.j = MaterialResources.a(context2, typedArrayD, 1);
            }
            textDrawableHelper.c(textAppearance, context2);
            tooltipDrawable2.m(ColorStateList.valueOf(typedArrayD.getColor(7, ColorUtils.c(ColorUtils.e(MaterialColors.d(context2, R.attr.colorOnBackground, TooltipDrawable.class.getCanonicalName()), 153), ColorUtils.e(MaterialColors.d(context2, android.R.attr.colorBackground, TooltipDrawable.class.getCanonicalName()), 229)))));
            tooltipDrawable2.s(ColorStateList.valueOf(MaterialColors.d(context2, R.attr.colorSurface, TooltipDrawable.class.getCanonicalName())));
            tooltipDrawable2.H = typedArrayD.getDimensionPixelSize(2, 0);
            tooltipDrawable2.I = typedArrayD.getDimensionPixelSize(4, 0);
            tooltipDrawable2.J = typedArrayD.getDimensionPixelSize(5, 0);
            tooltipDrawable2.K = typedArrayD.getDimensionPixelSize(3, 0);
            typedArrayD.recycle();
            arrayList2.add(tooltipDrawable2);
            WeakHashMap weakHashMap2 = ViewCompat.f2488a;
            if (isAttachedToWindow() && (viewGroupE = ViewUtils.e(this)) != null) {
                int[] iArr = new int[2];
                viewGroupE.getLocationOnScreen(iArr);
                tooltipDrawable2.N = iArr[0];
                viewGroupE.getWindowVisibleDisplayFrame(tooltipDrawable2.G);
                viewGroupE.addOnLayoutChangeListener(tooltipDrawable2.F);
            }
        }
        int i2 = arrayList2.size() == 1 ? 0 : 1;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((TooltipDrawable) it.next()).t(i2);
        }
        Iterator it2 = this.p.iterator();
        while (it2.hasNext()) {
            BaseOnChangeListener baseOnChangeListener = (BaseOnChangeListener) it2.next();
            Iterator it3 = this.W.iterator();
            while (it3.hasNext()) {
                baseOnChangeListener.a(this, ((Float) it3.next()).floatValue(), false);
            }
        }
        postInvalidate();
    }

    public final boolean u(float f, int i) {
        this.b0 = i;
        if (Math.abs(f - ((Float) this.W.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.w0 == 0) {
            if (minSeparation == BitmapDescriptorFactory.HUE_RED) {
                minSeparation = 0.0f;
            } else {
                float f2 = this.U;
                minSeparation = YU.a.a(f2, this.V, (minSeparation - this.G) / this.h0, f2);
            }
        }
        if (l()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.W.set(i, Float.valueOf(MathUtils.a(f, i3 < 0 ? this.U : minSeparation + ((Float) this.W.get(i3)).floatValue(), i2 >= this.W.size() ? this.V : ((Float) this.W.get(i2)).floatValue() - minSeparation)));
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((BaseOnChangeListener) it.next()).a(this, ((Float) this.W.get(i)).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.l;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            AccessibilityEventSender accessibilityEventSender = this.m;
            if (accessibilityEventSender == null) {
                this.m = new AccessibilityEventSender();
            } else {
                removeCallbacks(accessibilityEventSender);
            }
            AccessibilityEventSender accessibilityEventSender2 = this.m;
            accessibilityEventSender2.d = i;
            postDelayed(accessibilityEventSender2, 200L);
        }
        return true;
    }

    public final void v() {
        double dRound;
        float f = this.v0;
        float f2 = this.c0;
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            dRound = Math.round(f * r1) / ((int) ((this.V - this.U) / f2));
        } else {
            dRound = f;
        }
        if (l()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.V;
        u((float) ((dRound * (f3 - r1)) + this.U), this.a0);
    }

    public final void w(int i, Rect rect) {
        int iP = this.G + ((int) (p(getValues().get(i).floatValue()) * this.h0));
        int iB = b();
        int iMax = Math.max(this.H / 2, this.B / 2);
        int iMax2 = Math.max(this.I / 2, this.B / 2);
        rect.set(iP - iMax, iB - iMax2, iP + iMax, iB + iMax2);
    }

    public final void x() {
        if (!(getBackground() instanceof RippleDrawable) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iP = (int) ((p(((Float) this.W.get(this.b0)).floatValue()) * this.h0) + this.G);
            int iB = b();
            int i = this.J;
            background.setHotspotBounds(iP - i, iB - i, iP + i, iB + i);
        }
    }

    public final void y() {
        int i = this.E;
        if (i == 0 || i == 1) {
            if (this.a0 == -1 || !isEnabled()) {
                f();
                return;
            } else {
                e();
                return;
            }
        }
        if (i == 2) {
            f();
            return;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.E);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            ViewUtils.e(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                e();
                return;
            }
        }
        f();
    }

    public final void z(Canvas canvas, Paint paint, RectF rectF, FullCornerDirection fullCornerDirection) {
        float f;
        float f2 = this.F / 2.0f;
        int iOrdinal = fullCornerDirection.ordinal();
        if (iOrdinal == 1) {
            f = this.O;
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                f2 = this.O;
            }
            f = f2;
        } else {
            f = f2;
            f2 = this.O;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        Path path = this.p0;
        path.reset();
        if (rectF.width() >= f2 + f) {
            path.addRoundRect(rectF, new float[]{f2, f2, f, f, f, f, f2, f2}, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = Math.min(f2, f);
        float fMax = Math.max(f2, f);
        canvas.save();
        path.addRoundRect(rectF, fMin, fMin, Path.Direction.CW);
        canvas.clipPath(path);
        int iOrdinal2 = fullCornerDirection.ordinal();
        RectF rectF2 = this.r0;
        if (iOrdinal2 == 1) {
            float f3 = rectF.left;
            rectF2.set(f3, rectF.top, (2.0f * fMax) + f3, rectF.bottom);
        } else if (iOrdinal2 != 2) {
            rectF2.set(rectF.centerX() - fMax, rectF.top, rectF.centerX() + fMax, rectF.bottom);
        } else {
            float f4 = rectF.right;
            rectF2.set(f4 - (2.0f * fMax), rectF.top, f4, rectF.bottom);
        }
        canvas.drawRoundRect(rectF2, fMax, fMax, paint);
        canvas.restore();
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.material.slider.a] */
    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084152), attributeSet, i);
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = false;
        this.L = -1;
        this.M = -1;
        this.T = false;
        this.W = new ArrayList();
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = BitmapDescriptorFactory.HUE_RED;
        this.e0 = true;
        this.i0 = false;
        this.p0 = new Path();
        this.q0 = new RectF();
        this.r0 = new RectF();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.s0 = materialShapeDrawable;
        this.u0 = Collections.EMPTY_LIST;
        this.w0 = 0;
        this.x0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.a
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i2 = BaseSlider.y0;
                this.d.y();
            }
        };
        Context context2 = getContext();
        this.d = new Paint();
        this.e = new Paint();
        Paint paint = new Paint(1);
        this.f = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.g = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.h = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.i = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.j = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Resources resources = context2.getResources();
        this.C = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.v = dimensionPixelOffset;
        this.G = dimensionPixelOffset;
        this.w = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.y = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.z = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.A = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.P = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        ThemeEnforcement.a(context2, attributeSet, i, 2132084152);
        int[] iArr = com.google.android.material.R.styleable.b0;
        ThemeEnforcement.b(context2, attributeSet, iArr, i, 2132084152, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132084152);
        this.n = typedArrayObtainStyledAttributes.getResourceId(8, 2132084186);
        this.U = typedArrayObtainStyledAttributes.getFloat(3, BitmapDescriptorFactory.HUE_RED);
        this.V = typedArrayObtainStyledAttributes.getFloat(4, 1.0f);
        setValues(Float.valueOf(this.U));
        this.c0 = typedArrayObtainStyledAttributes.getFloat(2, BitmapDescriptorFactory.HUE_RED);
        this.B = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(9, (float) Math.ceil(ViewUtils.d(48, getContext()))));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(24);
        int i2 = zHasValue ? 24 : 26;
        int i3 = zHasValue ? 24 : 25;
        ColorStateList colorStateListA = MaterialResources.a(context2, typedArrayObtainStyledAttributes, i2);
        setTrackInactiveTintList(colorStateListA == null ? ResourcesCompat.b(R.color.material_slider_inactive_track_color, context2.getTheme(), context2.getResources()) : colorStateListA);
        ColorStateList colorStateListA2 = MaterialResources.a(context2, typedArrayObtainStyledAttributes, i3);
        setTrackActiveTintList(colorStateListA2 == null ? ResourcesCompat.b(R.color.material_slider_active_track_color, context2.getTheme(), context2.getResources()) : colorStateListA2);
        materialShapeDrawable.m(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 10));
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            setThumbStrokeColor(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 14));
        }
        setThumbStrokeWidth(typedArrayObtainStyledAttributes.getDimension(15, BitmapDescriptorFactory.HUE_RED));
        ColorStateList colorStateListA3 = MaterialResources.a(context2, typedArrayObtainStyledAttributes, 5);
        setHaloTintList(colorStateListA3 == null ? ResourcesCompat.b(R.color.material_slider_halo_color, context2.getTheme(), context2.getResources()) : colorStateListA3);
        this.e0 = typedArrayObtainStyledAttributes.getBoolean(23, true);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(18);
        int i4 = zHasValue2 ? 18 : 20;
        int i5 = zHasValue2 ? 18 : 19;
        ColorStateList colorStateListA4 = MaterialResources.a(context2, typedArrayObtainStyledAttributes, i4);
        setTickInactiveTintList(colorStateListA4 == null ? ResourcesCompat.b(R.color.material_slider_inactive_tick_marks_color, context2.getTheme(), context2.getResources()) : colorStateListA4);
        ColorStateList colorStateListA5 = MaterialResources.a(context2, typedArrayObtainStyledAttributes, i5);
        setTickActiveTintList(colorStateListA5 == null ? ResourcesCompat.b(R.color.material_slider_active_tick_marks_color, context2.getTheme(), context2.getResources()) : colorStateListA5);
        setThumbTrackGapSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(16, 0));
        setTrackStopIndicatorSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(29, 0));
        setTrackInsideCornerSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(28, 0));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0) * 2;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, dimensionPixelSize);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        setThumbElevation(typedArrayObtainStyledAttributes.getDimension(11, BitmapDescriptorFactory.HUE_RED));
        setTrackHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 0));
        setTickActiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(21, this.N / 2));
        setTickInactiveRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(22, this.N / 2));
        setLabelBehavior(typedArrayObtainStyledAttributes.getInt(7, 0));
        if (!typedArrayObtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        materialShapeDrawable.r(2);
        this.u = ViewConfiguration.get(context2).getScaledTouchSlop();
        AccessibilityHelper accessibilityHelper = new AccessibilityHelper(this);
        this.k = accessibilityHelper;
        ViewCompat.A(this, accessibilityHelper);
        this.l = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(@NonNull List<Float> list) {
        t(new ArrayList(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.t0 = null;
        this.u0 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.u0;
            Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
            a(drawableNewDrawable);
            list.add(drawableNewDrawable);
        }
        postInvalidate();
    }
}

package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.timepicker.ClockHandView;
import com.woolworths.R;
import java.util.Arrays;

/* loaded from: classes6.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    public final ClockHandView g;
    public final Rect h;
    public final RectF i;
    public final Rect j;
    public final SparseArray k;
    public final AccessibilityDelegateCompat l;
    public final int[] m;
    public final float[] n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public String[] s;
    public float t;
    public final ColorStateList u;

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public final void c(float f, boolean z) {
        if (Math.abs(this.t - f) > 0.001f) {
            this.t = f;
            e();
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void d() {
        super.d();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.k;
            if (i >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i)).setVisibility(0);
            i++;
        }
    }

    public final void e() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.g.q;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.k;
            int size = sparseArray.size();
            rect = this.h;
            rectF = this.i;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.j);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.m, this.n, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    public final void f(int i, String[] strArr) {
        this.s = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        SparseArray sparseArray = this.k;
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.s.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.s.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.s[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                ViewCompat.A(textView, this.l);
                textView.setTextColor(this.u);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.s[i2]));
                }
            }
        }
        ClockHandView clockHandView = this.g;
        if (clockHandView.l && !z) {
            clockHandView.x = 1;
        }
        clockHandView.l = z;
        clockHandView.invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).n(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(1, this.s.length, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.r / Math.max(Math.max(this.p / displayMetrics.heightPixels, this.q / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @SuppressLint
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Rect();
        this.i = new RectF();
        this.j = new Rect();
        this.k = new SparseArray();
        this.n = new float[]{BitmapDescriptorFactory.HUE_RED, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.m, i, 2132084174);
        Resources resources = getResources();
        ColorStateList colorStateListA = MaterialResources.a(context, typedArrayObtainStyledAttributes, 1);
        this.u = colorStateListA;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.g = clockHandView;
        this.o = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.m = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.m.add(this);
        int defaultColor = ResourcesCompat.b(R.color.material_timepicker_clockface, context.getTheme(), context.getResources()).getDefaultColor();
        ColorStateList colorStateListA2 = MaterialResources.a(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                ClockFaceView clockFaceView = ClockFaceView.this;
                if (!clockFaceView.isShown()) {
                    return true;
                }
                clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
                int height = ((clockFaceView.getHeight() / 2) - clockFaceView.g.n) - clockFaceView.o;
                if (height != clockFaceView.e) {
                    clockFaceView.e = height;
                    clockFaceView.d();
                    ClockHandView clockHandView2 = clockFaceView.g;
                    clockHandView2.w = clockFaceView.e;
                    clockHandView2.invalidate();
                }
                return true;
            }
        });
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.l = new AccessibilityDelegateCompat() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
                this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo.setTraversalAfter((View) ClockFaceView.this.k.get(iIntValue - 1));
                }
                accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 1, iIntValue, 1, false, view.isSelected()));
                accessibilityNodeInfoCompat.m(true);
                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.g);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean g(View view, int i2, Bundle bundle) {
                if (i2 != 16) {
                    return super.g(view, i2, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                ClockFaceView clockFaceView = ClockFaceView.this;
                view.getHitRect(clockFaceView.h);
                float fCenterX = clockFaceView.h.centerX();
                float fCenterY = clockFaceView.h.centerY();
                clockFaceView.g.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                clockFaceView.g.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        f(0, strArr);
        this.p = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.q = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.r = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}

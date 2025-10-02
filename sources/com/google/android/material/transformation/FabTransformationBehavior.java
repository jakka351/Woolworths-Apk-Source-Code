package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

@Deprecated
/* loaded from: classes6.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect f;
    public final RectF g;
    public final RectF h;
    public final int[] i;
    public float j;
    public float k;

    public static class FabTransformationSpec {

        /* renamed from: a, reason: collision with root package name */
        public MotionSpec f14676a;
        public Positioning b;
    }

    public FabTransformationBehavior() {
        this.f = new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new int[2];
    }

    public static Pair A(float f, float f2, boolean z, FabTransformationSpec fabTransformationSpec) {
        MotionTiming motionTimingF;
        MotionTiming motionTimingF2;
        if (f == BitmapDescriptorFactory.HUE_RED || f2 == BitmapDescriptorFactory.HUE_RED) {
            motionTimingF = fabTransformationSpec.f14676a.f("translationXLinear");
            motionTimingF2 = fabTransformationSpec.f14676a.f("translationYLinear");
        } else if ((!z || f2 >= BitmapDescriptorFactory.HUE_RED) && (z || f2 <= BitmapDescriptorFactory.HUE_RED)) {
            motionTimingF = fabTransformationSpec.f14676a.f("translationXCurveDownwards");
            motionTimingF2 = fabTransformationSpec.f14676a.f("translationYCurveDownwards");
        } else {
            motionTimingF = fabTransformationSpec.f14676a.f("translationXCurveUpwards");
            motionTimingF2 = fabTransformationSpec.f14676a.f("translationYCurveUpwards");
        }
        return new Pair(motionTimingF, motionTimingF2);
    }

    public static float D(FabTransformationSpec fabTransformationSpec, MotionTiming motionTiming, float f) {
        long j = motionTiming.f14511a;
        long j2 = motionTiming.b;
        MotionTiming motionTimingF = fabTransformationSpec.f14676a.f("expansion");
        return AnimationUtils.a(f, BitmapDescriptorFactory.HUE_RED, motionTiming.b().getInterpolation((((motionTimingF.f14511a + motionTimingF.b) + 17) - j) / j2));
    }

    public final float B(View view, View view2, Positioning positioning) {
        RectF rectF = this.g;
        E(view, rectF);
        rectF.offset(this.j, this.k);
        RectF rectF2 = this.h;
        E(view2, rectF2);
        positioning.getClass();
        return (rectF2.centerX() - rectF.centerX()) + BitmapDescriptorFactory.HUE_RED;
    }

    public final float C(View view, View view2, Positioning positioning) {
        RectF rectF = this.g;
        E(view, rectF);
        rectF.offset(this.j, this.k);
        RectF rectF2 = this.h;
        E(view2, rectF2);
        positioning.getClass();
        return (rectF2.centerY() - rectF.centerY()) + BitmapDescriptorFactory.HUE_RED;
    }

    public final void E(View view, RectF rectF) {
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.i);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract FabTransformationSpec F(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean h(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void i(CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.h == 0) {
            layoutParams.h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0343  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.AnimatorSet z(final android.view.View r28, final android.view.View r29, final boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.z(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new int[2];
    }
}

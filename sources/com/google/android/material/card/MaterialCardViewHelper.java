package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes6.dex */
class MaterialCardViewHelper {
    public static final double y = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f14530a;
    public final MaterialShapeDrawable c;
    public final MaterialShapeDrawable d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public ShapeAppearanceModel m;
    public ColorStateList n;
    public RippleDrawable o;
    public LayerDrawable p;
    public MaterialShapeDrawable q;
    public boolean s;
    public ValueAnimator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;
    public final Rect b = new Rect();
    public boolean r = false;
    public float x = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: com.google.android.material.card.MaterialCardViewHelper$1, reason: invalid class name */
    class AnonymousClass1 extends InsetDrawable {
        @Override // android.graphics.drawable.Drawable
        public final int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public MaterialCardViewHelper(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.f14530a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, 2132084094);
        this.c = materialShapeDrawable;
        materialShapeDrawable.k(materialCardView.getContext());
        materialShapeDrawable.p(-12303292);
        ShapeAppearanceModel.Builder builderG = materialShapeDrawable.d.f14634a.g();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.h, i, com.woolworths.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            builderG.b(typedArrayObtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED));
        }
        this.d = new MaterialShapeDrawable();
        h(builderG.a());
        this.u = MotionUtils.d(materialCardView.getContext(), com.woolworths.R.attr.motionEasingLinearInterpolator, AnimationUtils.f14504a);
        this.v = MotionUtils.c(materialCardView.getContext(), com.woolworths.R.attr.motionDurationShort2, nlnlnnn.xxx00780078x0078);
        this.w = MotionUtils.c(materialCardView.getContext(), com.woolworths.R.attr.motionDurationShort1, nlnlnnn.xxx00780078x0078);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(CornerTreatment cornerTreatment, float f) {
        return cornerTreatment instanceof RoundedCornerTreatment ? (float) ((1.0d - y) * f) : cornerTreatment instanceof CutCornerTreatment ? f / 2.0f : BitmapDescriptorFactory.HUE_RED;
    }

    public final float a() {
        CornerTreatment cornerTreatment = this.m.f14636a;
        MaterialShapeDrawable materialShapeDrawable = this.c;
        return Math.max(Math.max(b(cornerTreatment, materialShapeDrawable.i()), b(this.m.b, materialShapeDrawable.d.f14634a.f.a(materialShapeDrawable.g()))), Math.max(b(this.m.c, materialShapeDrawable.d.f14634a.g.a(materialShapeDrawable.g())), b(this.m.d, materialShapeDrawable.d.f14634a.h.a(materialShapeDrawable.g()))));
    }

    public final LayerDrawable c() {
        if (this.o == null) {
            this.q = new MaterialShapeDrawable(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, com.woolworths.R.id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    public final Drawable d(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.f14530a;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            boolean zI = i();
            float fA = BitmapDescriptorFactory.HUE_RED;
            int iCeil2 = (int) Math.ceil(maxCardElevation + (zI ? a() : 0.0f));
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (i()) {
                fA = a();
            }
            iCeil = (int) Math.ceil(maxCardElevation2 + fA);
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new AnonymousClass1(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.p != null) {
            MaterialCardView materialCardView = this.f14530a;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                boolean zI = i();
                float fA = BitmapDescriptorFactory.HUE_RED;
                iCeil = (int) Math.ceil((maxCardElevation + (zI ? a() : 0.0f)) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (i()) {
                    fA = a();
                }
                iCeil2 = (int) Math.ceil((maxCardElevation2 + fA) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.g;
            int i6 = (i5 & 8388613) == 8388613 ? ((i - this.e) - this.f) - iCeil2 : this.e;
            int i7 = (i5 & 80) == 80 ? this.e : ((i2 - this.e) - this.f) - iCeil;
            int i8 = (i5 & 8388613) == 8388613 ? this.e : ((i - this.e) - this.f) - iCeil2;
            int i9 = (i5 & 80) == 80 ? ((i2 - this.e) - this.f) - iCeil : this.e;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i8;
                i3 = i6;
            } else {
                i3 = i8;
                i4 = i6;
            }
            this.p.setLayerInset(2, i4, i9, i3, i7);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            float f = BitmapDescriptorFactory.HUE_RED;
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                if (z2) {
                    f = 1.0f;
                }
                this.x = f;
                return;
            }
            if (z2) {
                f = 1.0f;
            }
            float f2 = z2 ? 1.0f - this.x : this.x;
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.x, f);
            this.t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ColorDrawable colorDrawable = MaterialCardViewHelper.z;
                    MaterialCardViewHelper materialCardViewHelper = this.d;
                    materialCardViewHelper.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    materialCardViewHelper.j.setAlpha((int) (255.0f * fFloatValue));
                    materialCardViewHelper.x = fFloatValue;
                }
            });
            this.t.setInterpolator(this.u);
            this.t.setDuration((long) ((z2 ? this.v : this.w) * f2));
            this.t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            drawableMutate.setTintList(this.l);
            f(this.f14530a.m, false);
        } else {
            this.j = z;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.woolworths.R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(ShapeAppearanceModel shapeAppearanceModel) {
        this.m = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.c;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable.z = !materialShapeDrawable.d.f14634a.f(materialShapeDrawable.g());
        MaterialShapeDrawable materialShapeDrawable2 = this.d;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.q;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f14530a;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        MaterialShapeDrawable materialShapeDrawable = this.c;
        return materialShapeDrawable.d.f14634a.f(materialShapeDrawable.g()) && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f14530a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable drawableC = j() ? c() : this.d;
        this.i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f14530a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r6 = this;
            com.google.android.material.card.MaterialCardView r0 = r6.f14530a
            boolean r1 = r0.getPreventCornerOverlap()
            r2 = 0
            if (r1 == 0) goto L1a
            com.google.android.material.shape.MaterialShapeDrawable r1 = r6.c
            com.google.android.material.shape.MaterialShapeDrawable$MaterialShapeDrawableState r3 = r1.d
            com.google.android.material.shape.ShapeAppearanceModel r3 = r3.f14634a
            android.graphics.RectF r1 = r1.g()
            boolean r1 = r3.f(r1)
            if (r1 != 0) goto L1a
            goto L20
        L1a:
            boolean r1 = r6.i()
            if (r1 == 0) goto L25
        L20:
            float r1 = r6.a()
            goto L26
        L25:
            r1 = r2
        L26:
            boolean r3 = r0.getPreventCornerOverlap()
            if (r3 == 0) goto L3e
            boolean r3 = r0.getUseCompatPadding()
            if (r3 == 0) goto L3e
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = com.google.android.material.card.MaterialCardViewHelper.y
            double r2 = r2 - r4
            float r4 = r0.getCardViewRadius()
            double r4 = (double) r4
            double r2 = r2 * r4
            float r2 = (float) r2
        L3e:
            float r1 = r1 - r2
            int r1 = (int) r1
            android.graphics.Rect r2 = r6.b
            int r3 = r2.left
            int r3 = r3 + r1
            int r4 = r2.top
            int r4 = r4 + r1
            int r5 = r2.right
            int r5 = r5 + r1
            int r2 = r2.bottom
            int r2 = r2 + r1
            r0.f(r3, r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardViewHelper.l():void");
    }

    public final void m() {
        boolean z2 = this.r;
        MaterialCardView materialCardView = this.f14530a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.i));
    }
}

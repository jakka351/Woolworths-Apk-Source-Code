package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/SpringDotsIndicator;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "", "setDotIndicatorColor", "(I)V", "setStrokeDotsIndicatorColor", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "getType", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "type", "Companion", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class SpringDotsIndicator extends BaseDotsIndicator {
    public final ViewGroup k;
    public final float l;
    public int m;
    public int n;
    public final float o;
    public final float p;
    public final float q;
    public final SpringAnimation r;
    public final LinearLayout s;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/SpringDotsIndicator$Companion;", "", "", "DEFAULT_DAMPING_RATIO", "F", "", "DEFAULT_STIFFNESS", "I", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
    }

    @JvmOverloads
    public SpringDotsIndicator(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void a(final int i) {
        ViewGroup viewGroupH = h(true);
        viewGroupH.setOnClickListener(new View.OnClickListener() { // from class: com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator$addDot$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpringDotsIndicator springDotsIndicator = this.d;
                Callback.g(view);
                try {
                    if (springDotsIndicator.getDotsClickable()) {
                        BaseDotsIndicator.Pager pager = springDotsIndicator.getPager();
                        int count = pager != null ? pager.getCount() : 0;
                        int i2 = i;
                        if (i2 < count) {
                            BaseDotsIndicator.Pager pager2 = springDotsIndicator.getPager();
                            Intrinsics.e(pager2);
                            pager2.b(i2);
                        }
                    }
                } finally {
                    Callback.h();
                }
            }
        });
        View viewFindViewById = viewGroupH.findViewById(com.woolworths.R.id.spring_dot);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.d.add((ImageView) viewFindViewById);
        this.s.addView(viewGroupH);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final OnPageChangeListenerHelper b() {
        return new OnPageChangeListenerHelper() { // from class: com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator$buildOnPageChangedListener$1
            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public final int a() {
                return this.c.d.size();
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public final void c(float f, int i, int i2) {
                SpringDotsIndicator springDotsIndicator = this.c;
                float dotsSpacing = (springDotsIndicator.getDotsSpacing() * 2) + springDotsIndicator.getDotsSize();
                Object obj = springDotsIndicator.d.get(i);
                Intrinsics.g(obj, "dots[selectedPosition]");
                if (((ImageView) obj).getParent() == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                float left = (dotsSpacing * f) + ((ViewGroup) r5).getLeft();
                SpringAnimation springAnimation = springDotsIndicator.r;
                if (springAnimation != null) {
                    springAnimation.c(left);
                }
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public final void d(int i) {
            }
        };
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void d(int i) {
        Object obj = this.d.get(i);
        Intrinsics.g(obj, "dots[index]");
        i((View) obj, true);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void g() {
        this.s.removeViewAt(r0.getChildCount() - 1);
        this.d.remove(r0.size() - 1);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    @NotNull
    public BaseDotsIndicator.Type getType() {
        return BaseDotsIndicator.Type.SPRING;
    }

    public final ViewGroup h(boolean z) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(com.woolworths.R.layout.spring_dot_layout, (ViewGroup) this, false);
        if (viewInflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        ImageView imageView = (ImageView) viewGroup.findViewById(com.woolworths.R.id.spring_dot);
        imageView.setBackgroundResource(z ? com.woolworths.R.drawable.spring_dot_stroke_background : com.woolworths.R.drawable.spring_dot_background);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int dotsSize = (int) (z ? getDotsSize() : this.q);
        layoutParams2.height = dotsSize;
        layoutParams2.width = dotsSize;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
        i(imageView, z);
        return viewGroup;
    }

    public final void i(View view, boolean z) {
        View viewFindViewById = view.findViewById(com.woolworths.R.id.spring_dot);
        Intrinsics.g(viewFindViewById, "dotView.findViewById<View>(R.id.spring_dot)");
        Drawable background = viewFindViewById.getBackground();
        if (background == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.l, this.m);
        } else {
            gradientDrawable.setColor(this.n);
        }
        gradientDrawable.setCornerRadius(getDotsCornerRadius());
    }

    public final void setDotIndicatorColor(int color) {
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            this.n = color;
            i(viewGroup, false);
        }
    }

    public final void setStrokeDotsIndicatorColor(int color) {
        this.m = color;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ImageView v = (ImageView) it.next();
            Intrinsics.g(v, "v");
            i(v, true);
        }
    }

    @JvmOverloads
    public SpringDotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpringDotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        this.s = linearLayout;
        float fC = c(24.0f);
        setClipToPadding(false);
        int i2 = (int) fC;
        setPadding(i2, 0, i2, 0);
        linearLayout.setOrientation(0);
        addView(linearLayout, -2, -2);
        float fC2 = c(2.0f);
        this.l = fC2;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.woolworths.R.attr.colorPrimary, typedValue, true);
        int i3 = typedValue.data;
        this.n = i3;
        this.m = i3;
        float f = nlnlnnn.xxx00780078x0078;
        this.o = f;
        this.p = 0.5f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.b);
            Intrinsics.g(typedArrayObtainStyledAttributes, "getContext().obtainStyle…able.SpringDotsIndicator)");
            int color = typedArrayObtainStyledAttributes.getColor(2, this.n);
            this.n = color;
            this.m = typedArrayObtainStyledAttributes.getColor(6, color);
            this.o = typedArrayObtainStyledAttributes.getFloat(8, f);
            this.p = typedArrayObtainStyledAttributes.getFloat(0, 0.5f);
            this.l = typedArrayObtainStyledAttributes.getDimension(7, fC2);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.q = getDotsSize();
        if (isInEditMode()) {
            for (int i4 = 0; i4 < 5; i4++) {
                a(i4);
            }
            addView(h(false));
        }
        BaseDotsIndicator.Pager pager = getPager();
        if (pager == null || !pager.isEmpty()) {
            View view = this.k;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.k);
            }
            ViewGroup viewGroupH = h(false);
            this.k = viewGroupH;
            addView(viewGroupH);
            this.r = new SpringAnimation(this.k, DynamicAnimation.m);
            SpringForce springForce = new SpringForce(BitmapDescriptorFactory.HUE_RED);
            springForce.a(this.p);
            springForce.b(this.o);
            SpringAnimation springAnimation = this.r;
            Intrinsics.e(springAnimation);
            springAnimation.t = springForce;
        }
    }

    public /* synthetic */ SpringDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

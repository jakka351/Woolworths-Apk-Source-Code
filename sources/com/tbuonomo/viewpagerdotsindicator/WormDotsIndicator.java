package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/WormDotsIndicator;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "", "setDotIndicatorColor", "(I)V", "setStrokeDotsIndicatorColor", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "getType", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "type", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class WormDotsIndicator extends BaseDotsIndicator {
    public final ImageView k;
    public final ViewGroup l;
    public final int m;
    public int n;
    public int o;
    public final SpringAnimation p;
    public final SpringAnimation q;
    public final LinearLayout r;

    @JvmOverloads
    public WormDotsIndicator(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void a(final int i) {
        ViewGroup viewGroupH = h(true);
        viewGroupH.setOnClickListener(new View.OnClickListener() { // from class: com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator$addDot$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WormDotsIndicator wormDotsIndicator = this.d;
                Callback.g(view);
                try {
                    if (wormDotsIndicator.getDotsClickable()) {
                        BaseDotsIndicator.Pager pager = wormDotsIndicator.getPager();
                        int count = pager != null ? pager.getCount() : 0;
                        int i2 = i;
                        if (i2 < count) {
                            BaseDotsIndicator.Pager pager2 = wormDotsIndicator.getPager();
                            Intrinsics.e(pager2);
                            pager2.b(i2);
                        }
                    }
                } finally {
                    Callback.h();
                }
            }
        });
        View viewFindViewById = viewGroupH.findViewById(com.woolworths.R.id.worm_dot);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.d.add((ImageView) viewFindViewById);
        this.r.addView(viewGroupH);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final OnPageChangeListenerHelper b() {
        return new OnPageChangeListenerHelper() { // from class: com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator$buildOnPageChangedListener$1
            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public final int a() {
                return this.c.d.size();
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public final void c(float f, int i, int i2) {
                float dotsSize;
                WormDotsIndicator wormDotsIndicator = this.c;
                Object obj = wormDotsIndicator.d.get(i);
                Intrinsics.g(obj, "dots[selectedPosition]");
                ViewParent parent = ((ImageView) obj).getParent();
                if (parent == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                float left = ((ViewGroup) parent).getLeft();
                ArrayList arrayList = wormDotsIndicator.d;
                if (i2 != -1) {
                    i = i2;
                }
                Object obj2 = arrayList.get(i);
                Intrinsics.g(obj2, "dots[if (nextPosition ==…sition else nextPosition]");
                ViewParent parent2 = ((ImageView) obj2).getParent();
                if (parent2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
                float left2 = ((ViewGroup) parent2).getLeft();
                if (f >= BitmapDescriptorFactory.HUE_RED && f <= 0.1f) {
                    dotsSize = wormDotsIndicator.getDotsSize();
                } else if (f < 0.1f || f > 0.9f) {
                    dotsSize = wormDotsIndicator.getDotsSize();
                    left = left2;
                } else {
                    dotsSize = wormDotsIndicator.getDotsSize() + (left2 - left);
                }
                SpringAnimation springAnimation = wormDotsIndicator.p;
                if (springAnimation != null) {
                    springAnimation.c(left);
                }
                SpringAnimation springAnimation2 = wormDotsIndicator.q;
                if (springAnimation2 != null) {
                    springAnimation2.c(dotsSize);
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
        this.r.removeViewAt(r0.getChildCount() - 1);
        this.d.remove(r0.size() - 1);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    @NotNull
    public BaseDotsIndicator.Type getType() {
        return BaseDotsIndicator.Type.WORM;
    }

    public final ViewGroup h(boolean z) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(com.woolworths.R.layout.worm_dot_layout, (ViewGroup) this, false);
        if (viewInflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        viewGroup.setLayoutDirection(0);
        View viewFindViewById = viewGroup.findViewById(com.woolworths.R.id.worm_dot);
        viewFindViewById.setBackgroundResource(z ? com.woolworths.R.drawable.worm_dot_stroke_background : com.woolworths.R.drawable.worm_dot_background);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int dotsSize = (int) getDotsSize();
        layoutParams2.height = dotsSize;
        layoutParams2.width = dotsSize;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
        i(viewFindViewById, z);
        return viewGroup;
    }

    public final void i(View view, boolean z) {
        Drawable background = view.getBackground();
        if (background == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke(this.m, this.o);
        } else {
            gradientDrawable.setColor(this.n);
        }
        gradientDrawable.setCornerRadius(getDotsCornerRadius());
    }

    public final void setDotIndicatorColor(int color) {
        ImageView imageView = this.k;
        if (imageView != null) {
            this.n = color;
            Intrinsics.e(imageView);
            i(imageView, false);
        }
    }

    public final void setStrokeDotsIndicatorColor(int color) {
        this.o = color;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ImageView v = (ImageView) it.next();
            Intrinsics.g(v, "v");
            i(v, true);
        }
    }

    @JvmOverloads
    public WormDotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WormDotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        this.r = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        Context context2 = getContext();
        Intrinsics.g(context2, "context");
        Resources resources = context2.getResources();
        Intrinsics.g(resources, "context.resources");
        int i2 = (int) (resources.getDisplayMetrics().density * 24);
        setPadding(i2, 0, i2, 0);
        setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        Context context3 = getContext();
        Intrinsics.g(context3, "context");
        Resources resources2 = context3.getResources();
        Intrinsics.g(resources2, "context.resources");
        int i3 = (int) (resources2.getDisplayMetrics().density * 2);
        this.m = i3;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.woolworths.R.attr.colorPrimary, typedValue, true);
        int i4 = typedValue.data;
        this.n = i4;
        this.o = i4;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.c);
            Intrinsics.g(typedArrayObtainStyledAttributes, "getContext().obtainStyle…leable.WormDotsIndicator)");
            int color = typedArrayObtainStyledAttributes.getColor(1, this.n);
            this.n = color;
            this.o = typedArrayObtainStyledAttributes.getColor(5, color);
            this.m = (int) typedArrayObtainStyledAttributes.getDimension(6, i3);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            for (int i5 = 0; i5 < 5; i5++) {
                a(i5);
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
            this.l = viewGroupH;
            this.k = (ImageView) viewGroupH.findViewById(com.woolworths.R.id.worm_dot);
            addView(this.l);
            this.p = new SpringAnimation(this.l, DynamicAnimation.m);
            SpringForce springForce = new SpringForce(BitmapDescriptorFactory.HUE_RED);
            springForce.a(1.0f);
            springForce.b(300.0f);
            SpringAnimation springAnimation = this.p;
            Intrinsics.e(springAnimation);
            springAnimation.t = springForce;
            this.q = new SpringAnimation(this.l, new FloatPropertyCompat<View>() { // from class: com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator$setUpDotIndicator$floatPropertyCompat$1
                @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
                public final float a(Object obj) {
                    View object = (View) obj;
                    Intrinsics.h(object, "object");
                    Intrinsics.e(this.f19118a.k);
                    return r2.getLayoutParams().width;
                }

                @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
                public final void b(Object obj, float f) {
                    View object = (View) obj;
                    Intrinsics.h(object, "object");
                    WormDotsIndicator wormDotsIndicator = this.f19118a;
                    ImageView imageView = wormDotsIndicator.k;
                    Intrinsics.e(imageView);
                    imageView.getLayoutParams().width = (int) f;
                    ImageView imageView2 = wormDotsIndicator.k;
                    Intrinsics.e(imageView2);
                    imageView2.requestLayout();
                }
            });
            SpringForce springForce2 = new SpringForce(BitmapDescriptorFactory.HUE_RED);
            springForce2.a(1.0f);
            springForce2.b(300.0f);
            SpringAnimation springAnimation2 = this.q;
            Intrinsics.e(springAnimation2);
            springAnimation2.t = springForce2;
        }
    }

    public /* synthetic */ WormDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

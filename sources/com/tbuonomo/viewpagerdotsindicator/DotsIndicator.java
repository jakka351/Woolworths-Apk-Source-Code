package com.tbuonomo.viewpagerdotsindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rR*\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/DotsIndicator;", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "", "setSelectedPointColor", "(I)V", "value", "o", "I", "getSelectedDotColor", "()I", "setSelectedDotColor", "selectedDotColor", "Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "getType", "()Lcom/tbuonomo/viewpagerdotsindicator/BaseDotsIndicator$Type;", "type", "Companion", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class DotsIndicator extends BaseDotsIndicator {
    public final LinearLayout k;
    public final float l;
    public final boolean m;
    public final float n;

    /* renamed from: o, reason: from kotlin metadata */
    public int selectedDotColor;
    public final ArgbEvaluator p;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tbuonomo/viewpagerdotsindicator/DotsIndicator$Companion;", "", "", "DEFAULT_WIDTH_FACTOR", "F", "viewpagerdotsindicator_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
    }

    @JvmOverloads
    public DotsIndicator(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void a(final int i) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(com.woolworths.R.layout.dot_layout, (ViewGroup) this, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(com.woolworths.R.id.dot);
        Intrinsics.g(imageView, "imageView");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        viewInflate.setLayoutDirection(0);
        int dotsSize = (int) getDotsSize();
        layoutParams2.height = dotsSize;
        layoutParams2.width = dotsSize;
        layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
        DotsGradientDrawable dotsGradientDrawable = new DotsGradientDrawable();
        dotsGradientDrawable.setCornerRadius(getDotsCornerRadius());
        if (isInEditMode()) {
            dotsGradientDrawable.setColor(i == 0 ? this.selectedDotColor : getDotsColor());
        } else {
            BaseDotsIndicator.Pager pager = getPager();
            Intrinsics.e(pager);
            dotsGradientDrawable.setColor(pager.a() == i ? this.selectedDotColor : getDotsColor());
        }
        imageView.setBackgroundDrawable(dotsGradientDrawable);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.tbuonomo.viewpagerdotsindicator.DotsIndicator$addDot$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DotsIndicator dotsIndicator = this.d;
                Callback.g(view);
                try {
                    if (dotsIndicator.getDotsClickable()) {
                        BaseDotsIndicator.Pager pager2 = dotsIndicator.getPager();
                        int count = pager2 != null ? pager2.getCount() : 0;
                        int i2 = i;
                        if (i2 < count) {
                            BaseDotsIndicator.Pager pager3 = dotsIndicator.getPager();
                            Intrinsics.e(pager3);
                            pager3.b(i2);
                        }
                    }
                } finally {
                    Callback.h();
                }
            }
        });
        int i2 = (int) (this.n * 0.8f);
        viewInflate.setPadding(i2, viewInflate.getPaddingTop(), i2, viewInflate.getPaddingBottom());
        int i3 = (int) (this.n * 2);
        viewInflate.setPadding(viewInflate.getPaddingLeft(), i3, viewInflate.getPaddingRight(), i3);
        imageView.setElevation(this.n);
        this.d.add(imageView);
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            linearLayout.addView(viewInflate);
        } else {
            Intrinsics.p("linearLayout");
            throw null;
        }
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final OnPageChangeListenerHelper b() {
        return new OnPageChangeListenerHelper() { // from class: com.tbuonomo.viewpagerdotsindicator.DotsIndicator$buildOnPageChangedListener$1
            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public final int a() {
                return this.c.d.size();
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00d1  */
            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void c(float r9, int r10, int r11) {
                /*
                    r8 = this;
                    com.tbuonomo.viewpagerdotsindicator.DotsIndicator r0 = r8.c
                    android.animation.ArgbEvaluator r1 = r0.p
                    java.util.ArrayList r2 = r0.d
                    java.lang.Object r3 = r2.get(r10)
                    java.lang.String r4 = "dots[selectedPosition]"
                    kotlin.jvm.internal.Intrinsics.g(r3, r4)
                    android.widget.ImageView r3 = (android.widget.ImageView) r3
                    float r4 = r0.getDotsSize()
                    float r5 = r0.getDotsSize()
                    float r6 = r0.l
                    r7 = 1
                    float r7 = (float) r7
                    float r6 = r6 - r7
                    float r6 = r6 * r5
                    float r4 = YU.a.a(r7, r9, r6, r4)
                    int r4 = (int) r4
                    android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
                    r5.width = r4
                    r3.requestLayout()
                    java.lang.String r4 = "$this$isInBounds"
                    kotlin.jvm.internal.Intrinsics.h(r2, r4)
                    int r4 = r2.size()
                    if (r11 >= 0) goto L3a
                    goto Led
                L3a:
                    if (r4 <= r11) goto Led
                    java.lang.Object r11 = r2.get(r11)
                    java.lang.String r2 = "dots[nextPosition]"
                    kotlin.jvm.internal.Intrinsics.g(r11, r2)
                    android.widget.ImageView r11 = (android.widget.ImageView) r11
                    float r2 = r0.getDotsSize()
                    float r4 = r0.getDotsSize()
                    float r5 = r0.l
                    float r5 = r5 - r7
                    float r5 = r5 * r4
                    float r5 = r5 * r9
                    float r5 = r5 + r2
                    int r2 = (int) r5
                    android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
                    r4.width = r2
                    r11.requestLayout()
                    android.graphics.drawable.Drawable r2 = r3.getBackground()
                    java.lang.String r3 = "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable"
                    if (r2 == 0) goto Le7
                    com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable r2 = (com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable) r2
                    android.graphics.drawable.Drawable r11 = r11.getBackground()
                    if (r11 == 0) goto Le1
                    com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable r11 = (com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable) r11
                    int r3 = r0.getSelectedDotColor()
                    int r4 = r0.getDotsColor()
                    if (r3 == r4) goto Led
                    int r3 = r0.getSelectedDotColor()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    int r4 = r0.getDotsColor()
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    java.lang.Object r3 = r1.evaluate(r9, r3, r4)
                    java.lang.String r4 = "null cannot be cast to non-null type kotlin.Int"
                    if (r3 == 0) goto Ldb
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    int r5 = r0.getDotsColor()
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    int r6 = r0.getSelectedDotColor()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    java.lang.Object r9 = r1.evaluate(r9, r5, r6)
                    if (r9 == 0) goto Ld5
                    java.lang.Integer r9 = (java.lang.Integer) r9
                    int r9 = r9.intValue()
                    r11.setColor(r9)
                    boolean r9 = r0.m
                    if (r9 == 0) goto Ld1
                    com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$Pager r9 = r0.getPager()
                    kotlin.jvm.internal.Intrinsics.e(r9)
                    int r9 = r9.a()
                    if (r10 > r9) goto Ld1
                    int r9 = r0.getSelectedDotColor()
                    r2.setColor(r9)
                    goto Led
                Ld1:
                    r2.setColor(r3)
                    goto Led
                Ld5:
                    java.lang.NullPointerException r9 = new java.lang.NullPointerException
                    r9.<init>(r4)
                    throw r9
                Ldb:
                    java.lang.NullPointerException r9 = new java.lang.NullPointerException
                    r9.<init>(r4)
                    throw r9
                Le1:
                    java.lang.NullPointerException r9 = new java.lang.NullPointerException
                    r9.<init>(r3)
                    throw r9
                Le7:
                    java.lang.NullPointerException r9 = new java.lang.NullPointerException
                    r9.<init>(r3)
                    throw r9
                Led:
                    r0.invalidate()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tbuonomo.viewpagerdotsindicator.DotsIndicator$buildOnPageChangedListener$1.c(float, int, int):void");
            }

            @Override // com.tbuonomo.viewpagerdotsindicator.OnPageChangeListenerHelper
            public final void d(int i) {
                DotsIndicator dotsIndicator = this.c;
                Object obj = dotsIndicator.d.get(i);
                Intrinsics.g(obj, "dots[position]");
                View view = (View) obj;
                view.getLayoutParams().width = (int) dotsIndicator.getDotsSize();
                view.requestLayout();
                dotsIndicator.d(i);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r4) {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.d
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r1 = "dots[index]"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r2 = r1 instanceof com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable
            if (r2 != 0) goto L16
            r1 = 0
        L16:
            com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable r1 = (com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable) r1
            if (r1 == 0) goto L46
            com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$Pager r2 = r3.getPager()
            kotlin.jvm.internal.Intrinsics.e(r2)
            int r2 = r2.a()
            if (r4 == r2) goto L41
            boolean r2 = r3.m
            if (r2 == 0) goto L39
            com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator$Pager r2 = r3.getPager()
            kotlin.jvm.internal.Intrinsics.e(r2)
            int r2 = r2.a()
            if (r4 >= r2) goto L39
            goto L41
        L39:
            int r4 = r3.getDotsColor()
            r1.setColor(r4)
            goto L46
        L41:
            int r4 = r3.selectedDotColor
            r1.setColor(r4)
        L46:
            r0.setBackgroundDrawable(r1)
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tbuonomo.viewpagerdotsindicator.DotsIndicator.d(int):void");
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    public final void g() {
        LinearLayout linearLayout = this.k;
        if (linearLayout == null) {
            Intrinsics.p("linearLayout");
            throw null;
        }
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        this.d.remove(r0.size() - 1);
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    @Override // com.tbuonomo.viewpagerdotsindicator.BaseDotsIndicator
    @NotNull
    public BaseDotsIndicator.Type getType() {
        return BaseDotsIndicator.Type.DEFAULT;
    }

    public final void setSelectedDotColor(int i) {
        this.selectedDotColor = i;
        f();
    }

    @Deprecated
    public final void setSelectedPointColor(int color) {
        setSelectedDotColor(color);
    }

    @JvmOverloads
    public DotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DotsIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.p = new ArgbEvaluator();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.k = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.k;
        if (linearLayout2 != null) {
            addView(linearLayout2, -2, -2);
            this.l = 2.5f;
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19117a);
                Intrinsics.g(typedArrayObtainStyledAttributes, "context.obtainStyledAttr….styleable.DotsIndicator)");
                setSelectedDotColor(typedArrayObtainStyledAttributes.getColor(8, -16711681));
                float f = typedArrayObtainStyledAttributes.getFloat(6, 2.5f);
                this.l = f;
                if (f < 1) {
                    this.l = 2.5f;
                }
                this.m = typedArrayObtainStyledAttributes.getBoolean(7, false);
                this.n = typedArrayObtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
                typedArrayObtainStyledAttributes.recycle();
            }
            if (isInEditMode()) {
                for (int i2 = 0; i2 < 5; i2++) {
                    a(i2);
                }
                e();
                return;
            }
            return;
        }
        Intrinsics.p("linearLayout");
        throw null;
    }

    public /* synthetic */ DotsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

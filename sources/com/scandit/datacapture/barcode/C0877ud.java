package com.scandit.datacapture.barcode;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* renamed from: com.scandit.datacapture.barcode.ud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0877ud extends FrameLayout {
    private List b;
    private Animator c;
    private boolean d;
    private InterfaceC0802qd e;
    private final GestureDetector f;

    public /* synthetic */ C0877ud(Context context) {
        this(context, null, 0);
    }

    public final List a() {
        return this.b;
    }

    public final int c() {
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i = S5.j;
        int iB = G5.b() + height;
        int size = this.b.size();
        int i2 = C5.j;
        return Math.max(0, iB - ((G5.b() + B5.a()) * size));
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.h(ev, "ev");
        return this.f.onTouchEvent(ev);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        b(this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0877ud(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        setChildrenDrawingOrderEnabled(true);
        int i2 = S5.j;
        setPadding(G5.b(), G5.b(), G5.b(), G5.b());
        this.b = EmptyList.d;
        this.d = true;
        this.f = new GestureDetector(context, new C0854td(this));
    }

    public final void a(List value) {
        Intrinsics.h(value, "value");
        this.b = value;
        b(value);
    }

    public final InterfaceC0802qd b() {
        return this.e;
    }

    private final void b(List list) {
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i = S5.j;
        float fB = G5.b() + height;
        int i2 = C5.j;
        int iMin = Math.min((int) Math.ceil(fB / (G5.b() + B5.a())), list.size());
        int childCount = getChildCount() - iMin;
        if (childCount > 0) {
            removeViews(iMin, childCount);
        }
        boolean z = this.d;
        for (int i3 = 0; i3 < iMin; i3++) {
            C5 c5A = a(i3);
            AbstractC0611f.a(c5A, a(i3, iMin, z, 0));
            c5A.a((C0914x5) list.get(i3));
        }
    }

    public final void a(R5 r5) {
        this.e = r5;
    }

    public final void a(boolean z) {
        this.d = z;
        b(this.b);
    }

    public final void a(Function1 onAnimationUpdate, Function0 onAnimationEnd) {
        Intrinsics.h(onAnimationUpdate, "onAnimationUpdate");
        Intrinsics.h(onAnimationEnd, "onAnimationEnd");
        if (this.d) {
            this.d = false;
            int iC = c();
            IntRange intRangeO = RangesKt.o(0, getChildCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
            IntProgressionIterator it = intRangeO.iterator();
            while (it.f) {
                int iNextInt = it.nextInt();
                View childAt = getChildAt(iNextInt);
                Intrinsics.f(childAt, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.cards.CardView");
                arrayList.add(AbstractC0611f.b((C5) childAt, a(iNextInt, getChildCount(), false, iC)));
            }
            a(arrayList, onAnimationUpdate, onAnimationEnd);
        }
    }

    public final void a(IntRange visibleIndices, int i, int i2, Function1 onAnimationUpdate, Function0 onAnimationEnd) {
        Intrinsics.h(visibleIndices, "visibleIndices");
        Intrinsics.h(onAnimationUpdate, "onAnimationUpdate");
        Intrinsics.h(onAnimationEnd, "onAnimationEnd");
        if (this.d) {
            return;
        }
        this.d = true;
        int i3 = 0;
        boolean z = i2 != visibleIndices.d;
        ArrayList arrayListI0 = CollectionsKt.I0(visibleIndices);
        if (z) {
            arrayListI0.add(0, Integer.valueOf(i2));
        }
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i4 = S5.j;
        float fB = G5.b() + height;
        int i5 = C5.j;
        int iMin = Math.min((int) Math.ceil(fB / (G5.b() + B5.a())), this.b.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListI0, 10));
        Iterator it = arrayListI0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i6 = i3 + 1;
            if (i3 >= 0) {
                int iIntValue = ((Number) next).intValue();
                C5 c5A = a(i3);
                int i7 = z ? i3 - 1 : i3;
                c5A.a((C0914x5) this.b.get(iIntValue));
                float f = (i3 == 0 && z) ? BitmapDescriptorFactory.HUE_RED : 1.0f;
                float fFloatValue = ((Number) C5.h.getD()).floatValue();
                int i8 = S5.j;
                AbstractC0611f.a(c5A, new C0527b(f, fFloatValue, 1.0f, (i7 * (B5.a() + G5.b())) + i));
                arrayList.add(AbstractC0611f.b(c5A, a(i3, iMin)));
                it = it;
                i3 = i6;
            } else {
                CollectionsKt.z0();
                throw null;
            }
        }
        a(arrayList, onAnimationUpdate, onAnimationEnd);
    }

    public final void a(int i, Function0 onAnimationEnd) {
        Intrinsics.h(onAnimationEnd, "onAnimationEnd");
        if (this.d) {
            if (i == 0) {
                ((Q5) onAnimationEnd).invoke();
                return;
            }
            int size = this.b.size();
            if (size > 3) {
                size = 3;
            }
            C5 c5A = a(0);
            c5A.a((C0914x5) this.b.get(i));
            float fFloatValue = ((Number) C5.h.getD()).floatValue();
            int height = getHeight() - (B5.a() * 2);
            int i2 = S5.j;
            AbstractC0611f.a(c5A, new C0527b(BitmapDescriptorFactory.HUE_RED, fFloatValue, 1.0f, height - (G5.b() * (size + 1))));
            int size2 = this.b.size();
            int i3 = 0;
            while (i3 < size2) {
                int i4 = i3 + 1;
                C5 c5A2 = a(i4);
                c5A2.a((C0914x5) this.b.get(i3));
                AbstractC0611f.a(c5A2, a(i3, size, true, 0));
                i3 = i4;
            }
            IntRange intRangeO = RangesKt.o(0, getChildCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
            IntProgressionIterator it = intRangeO.iterator();
            while (it.f) {
                int iNextInt = it.nextInt();
                View childAt = getChildAt(iNextInt);
                Intrinsics.f(childAt, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.cards.CardView");
                arrayList.add(AbstractC0611f.b((C5) childAt, a(iNextInt, size, true, 0)));
            }
            a(arrayList, C0832sd.f18007a, onAnimationEnd);
        }
    }

    public static final void a(C0877ud c0877ud) {
        c0877ud.b(c0877ud.b);
    }

    private final void a(final ArrayList arrayList, final Function1 function1, Function0 function0) {
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
        this.c = null;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.4f, BitmapDescriptorFactory.HUE_RED, 0.2f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.scandit.datacapture.barcode.sf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0877ud.a(arrayList, function1, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C0817rd(this, function0));
        valueAnimatorOfFloat.start();
        this.c = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Collection animations, Function1 onAnimationUpdate, ValueAnimator it) {
        Intrinsics.h(animations, "$animations");
        Intrinsics.h(onAnimationUpdate, "$onAnimationUpdate");
        Intrinsics.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        Float f = (Float) animatedValue;
        Iterator it2 = animations.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(f);
        }
        onAnimationUpdate.invoke(f);
    }

    private final C0527b a(int i, int i2) {
        int iMin = Math.min(i2, 3);
        if (i < iMin) {
            int i3 = (iMin - 1) - i;
            float f = i;
            float fFloatValue = ((Number) C5.h.getD()).floatValue() - (0.75f * f);
            float f2 = 1.0f - (0.25f * f);
            float f3 = 1.0f - (f * 0.05f);
            int height = getHeight() - B5.a();
            int i4 = S5.j;
            return new C0527b(f2, fFloatValue, f3, ((height - (G5.b() * i3)) - getPaddingBottom()) - getPaddingTop());
        }
        int height2 = getHeight();
        int i5 = C5.j;
        return new C0527b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.85f, (height2 - B5.a()) - getPaddingBottom());
    }

    private final C0527b a(int i, int i2, boolean z, int i3) {
        if (z) {
            return a(i, i2);
        }
        float fFloatValue = ((Number) C5.h.getD()).floatValue();
        int i4 = S5.j;
        return new C0527b(1.0f, fFloatValue, 1.0f, (i * (B5.a() + G5.b())) + i3);
    }

    private final C5 a(int i) {
        if (i < getChildCount()) {
            View childAt = getChildAt(i);
            Intrinsics.f(childAt, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.cards.CardView");
            return (C5) childAt;
        }
        Context context = getContext();
        Intrinsics.g(context, "context");
        C5 c5 = new C5(context);
        c5.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        c5.setClickable(true);
        addView(c5, i);
        return c5;
    }
}

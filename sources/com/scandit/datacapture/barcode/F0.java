package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class F0 extends FrameLayout {
    private Function1 b;
    private List c;
    private final ArrayDeque d;
    private final ArrayDeque e;
    private int f;
    private int g;
    private boolean h;

    public /* synthetic */ F0(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$--Lcom-scandit-datacapture-barcode-R0-, reason: not valid java name */
    public static /* synthetic */ void m271instrumented$0$a$LcomscanditdatacapturebarcodeR0(F0 f0, View view) {
        Callback.g(view);
        try {
            a(f0, view);
        } finally {
            Callback.h();
        }
    }

    public final void a(List value) {
        R0 r0A;
        Intrinsics.h(value, "value");
        this.c = value;
        this.e.clear();
        this.d.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.f(childAt, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindDotView");
            R0 r0 = (R0) childAt;
            if (r0.g()) {
                this.e.addLast(r0);
            } else {
                this.d.addLast(r0);
            }
        }
        Iterator it = value.iterator();
        while (it.hasNext()) {
            C0847t6 c0847t6 = (C0847t6) it.next();
            boolean z = true;
            if (c0847t6.b() == null) {
                ArrayDeque arrayDeque = this.e;
                r0A = (R0) (arrayDeque.isEmpty() ? null : arrayDeque.removeFirst());
                if (r0A == null) {
                    r0A = a();
                    r0A.a(true);
                }
            } else {
                ArrayDeque arrayDeque2 = this.d;
                r0A = (R0) (arrayDeque2.isEmpty() ? null : arrayDeque2.removeFirst());
                if (r0A == null) {
                    r0A = a();
                    if (this.h) {
                        r0A.start();
                    }
                }
            }
            r0A.setVisibility(0);
            if (c0847t6.b() != null) {
                z = false;
            }
            r0A.a(z);
            r0A.b(this.f);
            r0A.a(this.g);
            r0A.setTranslationX(c0847t6.c().x - (r0A.getMinimumWidth() / 2.0f));
            r0A.setTranslationY(c0847t6.c().y - (r0A.getMinimumHeight() / 2.0f));
            r0A.setTag(c0847t6);
        }
        while (true) {
            ArrayDeque arrayDeque3 = this.d;
            if (arrayDeque3.f <= 2) {
                break;
            } else {
                removeView((View) arrayDeque3.removeLast());
            }
        }
        while (true) {
            ArrayDeque arrayDeque4 = this.e;
            if (arrayDeque4.f <= 2) {
                break;
            } else {
                removeView((View) arrayDeque4.removeLast());
            }
        }
        Iterator<E> it2 = this.d.iterator();
        while (it2.hasNext()) {
            ((R0) it2.next()).setVisibility(8);
        }
        Iterator<E> it3 = this.e.iterator();
        while (it3.hasNext()) {
            ((R0) it3.next()).setVisibility(8);
        }
        this.d.clear();
        this.e.clear();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        setClipChildren(false);
        this.c = EmptyList.d;
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.f = -1;
        this.g = -16776961;
        this.h = true;
    }

    public final List b() {
        return this.c;
    }

    public final void b(int i) {
        this.g = i;
    }

    public final void a(int i) {
        this.f = i;
    }

    public final void a(boolean z) {
        this.h = z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            R0 r0 = childAt instanceof R0 ? (R0) childAt : null;
            if (r0 != null) {
                if (z && !r0.g()) {
                    r0.start();
                } else {
                    r0.stop();
                }
            }
        }
    }

    public final void a(Function1 function1) {
        this.b = function1;
    }

    private final R0 a() {
        Context context = getContext();
        Intrinsics.g(context, "context");
        R0 r0 = new R0(context, null, 0);
        r0.setOnClickListener(new df(this, 3));
        addView(r0);
        return r0;
    }

    private static final void a(F0 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        Object tag = view.getTag();
        C0847t6 c0847t6 = tag instanceof C0847t6 ? (C0847t6) tag : null;
        BarcodeFindItem barcodeFindItemB = c0847t6 != null ? c0847t6.b() : null;
        Function1 function1 = this$0.b;
        if (function1 != null) {
            function1.invoke(barcodeFindItemB);
        }
    }
}

package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import au.com.woolworths.shop.checkout.ui.content.c;
import com.google.firebase.perf.metrics.a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {
    public final Handler d = new Handler(Looper.getMainLooper());
    public final AtomicReference e;
    public final a f;

    /* renamed from: com.google.firebase.perf.util.FirstDrawDoneListener$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver();
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public FirstDrawDoneListener(View view, a aVar) {
        this.e = new AtomicReference(view);
        this.f = aVar;
    }

    public static void a(View view, a aVar) {
        view.getViewTreeObserver().addOnDrawListener(new FirstDrawDoneListener(view, aVar));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.e.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new c(1, this, view));
        this.d.postAtFrontOfQueue(this.f);
    }
}

package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public class PreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    public final Handler d = new Handler(Looper.getMainLooper());
    public final AtomicReference e;
    public final a f;
    public final a g;

    public PreDrawListener(View view, a aVar, a aVar2) {
        this.e = new AtomicReference(view);
        this.f = aVar;
        this.g = aVar2;
    }

    public static void a(View view, a aVar, a aVar2) {
        view.getViewTreeObserver().addOnPreDrawListener(new PreDrawListener(view, aVar, aVar2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.e.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        a aVar = this.f;
        Handler handler = this.d;
        handler.post(aVar);
        handler.postAtFrontOfQueue(this.g);
        return true;
    }
}

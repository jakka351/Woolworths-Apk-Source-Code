package curtains.internal;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcurtains/internal/NextDrawListener;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Companion", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class NextDrawListener implements ViewTreeObserver.OnDrawListener, View.OnAttachStateChangeListener {
    public boolean d;
    public final View e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcurtains/internal/NextDrawListener$Companion;", "", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
    }

    public NextDrawListener(View view) {
        Intrinsics.h(view, "view");
        Intrinsics.h(null, "onDrawCallback");
        this.e = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.e.removeOnAttachStateChangeListener(this);
        ((Handler) HandlersKt.f23763a.getD()).post(new Runnable() { // from class: curtains.internal.NextDrawListener.onDraw.1
            @Override // java.lang.Runnable
            public final void run() {
                NextDrawListener nextDrawListener = NextDrawListener.this;
                ViewTreeObserver viewTreeObserver = nextDrawListener.e.getViewTreeObserver();
                Intrinsics.g(viewTreeObserver, "viewTreeObserver");
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnDrawListener(nextDrawListener);
                }
            }
        });
        throw null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Intrinsics.h(view, "view");
        view.getViewTreeObserver().addOnDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.h(view, "view");
        view.getViewTreeObserver().removeOnDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
    }
}

package leakcanary.internal;

import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/internal/ReferenceCleaner;", "Landroid/os/MessageQueue$IdleHandler;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "plumber-android-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class ReferenceCleaner implements MessageQueue.IdleHandler, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener {
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (view2 == null) {
            return;
        }
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
        Looper.myQueue().removeIdleHandler(this);
        view2.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.i(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.i(v, "v");
        v.removeOnAttachStateChangeListener(this);
        Looper.myQueue().removeIdleHandler(this);
        Looper.myQueue().addIdleHandler(this);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        try {
            throw null;
        } catch (Throwable unused) {
            return false;
        }
    }
}

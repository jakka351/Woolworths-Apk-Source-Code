package curtains.internal;

import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.WeakHashMap;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcurtains/internal/WindowCallbackWrapper;", "Lcurtains/internal/FixedWindowCallback;", "Companion", "curtains_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class WindowCallbackWrapper extends FixedWindowCallback {
    public static final Object d;
    public static final Object e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcurtains/internal/WindowCallbackWrapper$Companion;", "", "Ljava/util/WeakHashMap;", "Landroid/view/Window;", "Ljava/lang/ref/WeakReference;", "Lcurtains/internal/WindowCallbackWrapper;", "callbackCache", "Ljava/util/WeakHashMap;", "listenersLock", "Ljava/lang/Object;", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        d = LazyKt.a(lazyThreadSafetyMode, WindowCallbackWrapper$Companion$jetpackWrapperClass$2.h);
        e = LazyKt.a(lazyThreadSafetyMode, WindowCallbackWrapper$Companion$jetpackWrappedField$2.h);
        new WeakHashMap();
    }

    @Override // curtains.internal.FixedWindowCallback, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        throw null;
    }

    @Override // curtains.internal.FixedWindowCallback, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        throw null;
    }

    @Override // curtains.internal.FixedWindowCallback, android.view.Window.Callback
    public final void onContentChanged() {
        throw null;
    }

    @Override // curtains.internal.FixedWindowCallback, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        throw null;
    }
}

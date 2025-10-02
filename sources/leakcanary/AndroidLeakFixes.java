package leakcanary;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import curtains.Curtains;
import curtains.OnRootViewRemovedListener;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import leakcanary.internal.HandlersKt;
import leakcanary.internal.ObjectsKt$NO_OP_HANDLER$1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lleakcanary/AndroidLeakFixes;", "", "Companion", "plumber-android-core_release"}, k = 1, mv = {1, 4, 1})
@SuppressLint
/* loaded from: classes.dex */
public abstract class AndroidLeakFixes {
    public static final /* synthetic */ AndroidLeakFixes[] e = {new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.MEDIA_SESSION_LEGACY_HELPER
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.TEXT_LINE_POOL
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.USER_MANAGER
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.FLUSH_HANDLER_THREADS
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
            if (Build.VERSION.SDK_INT >= 31) {
                return;
            }
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            Lazy lazy = AndroidLeakFixes.f;
            Looper looper = ((Handler) lazy.getD()).getLooper();
            Intrinsics.d(looper, "backgroundHandler.looper");
            Thread thread = looper.getThread();
            if (thread == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.os.HandlerThread");
            }
            linkedHashSet.add(Integer.valueOf(((HandlerThread) thread).getThreadId()));
            ((Handler) lazy.getD()).postDelayed(new Runnable() { // from class: leakcanary.AndroidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1
                @Override // java.lang.Runnable
                public final void run() {
                    LinkedHashSet linkedHashSet2;
                    AndroidLeakFixes[] androidLeakFixesArr = AndroidLeakFixes.e;
                    Thread threadCurrentThread = Thread.currentThread();
                    Intrinsics.d(threadCurrentThread, "Thread.currentThread()");
                    ThreadGroup threadGroup = threadCurrentThread.getThreadGroup();
                    if (threadGroup == null) {
                        Intrinsics.n();
                        throw null;
                    }
                    while (threadGroup.getParent() != null) {
                        threadGroup = threadGroup.getParent();
                        Intrinsics.d(threadGroup, "rootGroup.parent");
                    }
                    Thread[] threadArr = new Thread[threadGroup.activeCount()];
                    while (threadGroup.enumerate(threadArr, true) == threadArr.length) {
                        threadArr = new Thread[threadArr.length * 2];
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Thread thread2 : threadArr) {
                        HandlerThread handlerThread = thread2 instanceof HandlerThread ? (HandlerThread) thread2 : null;
                        if (handlerThread != null) {
                            arrayList.add(handlerThread);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        linkedHashSet2 = linkedHashSet;
                        if (!zHasNext) {
                            break;
                        }
                        HandlerThread handlerThread2 = (HandlerThread) it.next();
                        int threadId = handlerThread2.getThreadId();
                        Pair pair = (threadId == -1 || linkedHashSet2.contains(Integer.valueOf(threadId))) ? null : new Pair(Integer.valueOf(threadId), handlerThread2);
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Pair pair2 = (Pair) it2.next();
                        int iIntValue = ((Number) pair2.d).intValue();
                        HandlerThread handlerThread3 = (HandlerThread) pair2.e;
                        Looper looper2 = handlerThread3.getLooper();
                        if (looper2 != null) {
                            linkedHashSet2.add(Integer.valueOf(iIntValue));
                            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            booleanRef.d = true;
                            Handler handler = new Handler(looper2);
                            AndroidLeakFixes[] androidLeakFixesArr2 = AndroidLeakFixes.e;
                            final AndroidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1$run$1$3 androidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1$run$1$3 = new AndroidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1$run$1$3(handlerThread3, booleanRef, handler);
                            try {
                                handler.post(new Runnable() { // from class: leakcanary.AndroidLeakFixes$Companion$onEachIdle$1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: leakcanary.AndroidLeakFixes$Companion$onEachIdle$1.1
                                            @Override // android.os.MessageQueue.IdleHandler
                                            public final boolean queueIdle() {
                                                androidLeakFixes$FLUSH_HANDLER_THREADS$apply$flushNewHandlerThread$1$run$1$3.invoke();
                                                return true;
                                            }
                                        });
                                    }
                                });
                            } catch (RuntimeException unused) {
                            }
                        }
                    }
                    AndroidLeakFixes[] androidLeakFixesArr3 = AndroidLeakFixes.e;
                    ((Handler) AndroidLeakFixes.f.getD()).postDelayed(this, 3000L);
                }
            }, 2000L);
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.ACCESSIBILITY_NODE_INFO
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.CONNECTIVITY_MANAGER
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.SAMSUNG_CLIPBOARD_MANAGER
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
            Intrinsics.c(Build.MANUFACTURER, "samsung");
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.BUBBLE_POPUP
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
            Intrinsics.c(Build.MANUFACTURER, "LGE");
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.LAST_HOVERED_VIEW
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
            Intrinsics.c(Build.MANUFACTURER, "samsung");
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.ACTIVITY_MANAGER
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
            Intrinsics.c(Build.MANUFACTURER, "samsung");
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.VIEW_LOCATION_HOLDER
        @Override // leakcanary.AndroidLeakFixes
        public final void a(final Application application) {
            if (Build.VERSION.SDK_INT != 28) {
                return;
            }
            Curtains.a().add(new OnRootViewRemovedListener() { // from class: leakcanary.ViewLocationHolderLeakFix$applyFix$1
                @Override // curtains.OnRootViewsChangedListener
                public final void a(View it, boolean z) {
                    Intrinsics.i(it, "view");
                    if (z) {
                        return;
                    }
                    Intrinsics.i(it, "it");
                    Lazy lazy = HandlersKt.f24885a;
                    Looper mainLooper = Looper.getMainLooper();
                    Intrinsics.d(mainLooper, "Looper.getMainLooper()");
                    if (mainLooper.getThread() == Thread.currentThread()) {
                        ViewLocationHolderLeakFix.a(application);
                    } else {
                        ((Handler) HandlersKt.f24885a.getD()).post(new Runnable() { // from class: leakcanary.ViewLocationHolderLeakFix$applyFix$1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ViewLocationHolderLeakFix.a(application);
                            }
                        });
                    }
                }
            });
            application.registerActivityLifecycleCallbacks(new ViewLocationHolderLeakFix$applyFix$2(application));
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.IMM_FOCUSED_VIEW
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
        }
    }, new IMM_CUR_ROOT_VIEW(), new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.SPELL_CHECKER
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
        }
    }, new AndroidLeakFixes() { // from class: leakcanary.AndroidLeakFixes.PERMISSION_CONTROLLER_MANAGER
        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            try {
                application.getSystemService("permission_controller");
            } catch (Exception unused) {
            }
        }
    }};
    public static final Lazy f = LazyKt.b(AndroidLeakFixes$Companion$backgroundHandler$2.h);
    public boolean d;

    /* JADX INFO: Fake field, exist only in values array */
    AndroidLeakFixes EF2;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0007"}, d2 = {"Lleakcanary/AndroidLeakFixes$Companion;", "", "", "LG", "Ljava/lang/String;", "SAMSUNG", "WindowDelegateCallback", "plumber-android-core_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/AndroidLeakFixes$Companion$WindowDelegateCallback;", "Lleakcanary/FixedWindowCallback;", "plumber-android-core_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes7.dex */
        public static final class WindowDelegateCallback extends FixedWindowCallback {
            public final ArrayList e;
            public final Window.Callback f;

            public WindowDelegateCallback(Window.Callback callback) {
                super(callback);
                this.f = callback;
                this.e = new ArrayList();
            }

            @Override // leakcanary.FixedWindowCallback, android.view.Window.Callback
            public final void onContentChanged() {
                CollectionsKt.g0(this.e, AndroidLeakFixes$Companion$WindowDelegateCallback$onContentChanged$1.h);
                this.f.onContentChanged();
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/AndroidLeakFixes$IMM_CUR_ROOT_VIEW;", "Lleakcanary/AndroidLeakFixes;", "plumber-android-core_release"}, k = 1, mv = {1, 4, 1})
    public static final class IMM_CUR_ROOT_VIEW extends AndroidLeakFixes {
        public static final /* synthetic */ int g = 0;

        public IMM_CUR_ROOT_VIEW() {
            super("IMM_CUR_ROOT_VIEW", 12);
        }

        @Override // leakcanary.AndroidLeakFixes
        public final void a(Application application) {
            if (Build.VERSION.SDK_INT >= 29) {
                return;
            }
            try {
                Object systemService = application.getSystemService("input_method");
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                }
                final InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                final Field declaredField = InputMethodManager.class.getDeclaredField("mCurRootView");
                declaredField.setAccessible(true);
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: leakcanary.AndroidLeakFixes$IMM_CUR_ROOT_VIEW$apply$1
                    public final /* synthetic */ Application.ActivityLifecycleCallbacks d;

                    {
                        Object objNewProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, ObjectsKt$NO_OP_HANDLER$1.f24886a);
                        if (objNewProxyInstance == null) {
                            throw new TypeCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
                        }
                        this.d = (Application.ActivityLifecycleCallbacks) objNewProxyInstance;
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity p0, Bundle bundle) {
                        Intrinsics.i(p0, "p0");
                        this.d.onActivityCreated(p0, bundle);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void onActivityDestroyed(android.app.Activity r10) {
                        /*
                            r9 = this;
                            android.view.inputmethod.InputMethodManager r0 = r3
                            java.lang.reflect.Field r1 = r2
                            java.lang.String r2 = "activity"
                            kotlin.jvm.internal.Intrinsics.i(r10, r2)
                            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L68
                            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L68
                            r3 = 0
                            r4 = 1
                            if (r2 == 0) goto L2a
                            android.view.Window r5 = r10.getWindow()     // Catch: java.lang.Throwable -> L68
                            if (r5 == 0) goto L2a
                            android.view.Window r5 = r10.getWindow()     // Catch: java.lang.Throwable -> L68
                            java.lang.String r6 = "activity.window"
                            kotlin.jvm.internal.Intrinsics.d(r5, r6)     // Catch: java.lang.Throwable -> L68
                            android.view.View r5 = r5.getDecorView()     // Catch: java.lang.Throwable -> L68
                            if (r5 != r2) goto L2a
                            r5 = r4
                            goto L2b
                        L2a:
                            r5 = r3
                        L2b:
                            r6 = 0
                            if (r2 == 0) goto L5b
                            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> L68
                            if (r2 == 0) goto L5b
                            leakcanary.AndroidLeakFixes$IMM_CUR_ROOT_VIEW r7 = r9.e     // Catch: java.lang.Throwable -> L68
                            int r8 = leakcanary.AndroidLeakFixes.IMM_CUR_ROOT_VIEW.g     // Catch: java.lang.Throwable -> L68
                            r7.getClass()     // Catch: java.lang.Throwable -> L68
                            r7 = r2
                        L3c:
                            boolean r8 = r7 instanceof android.app.Application     // Catch: java.lang.Throwable -> L68
                            if (r8 == 0) goto L41
                            goto L5b
                        L41:
                            boolean r8 = r7 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L68
                            if (r8 == 0) goto L48
                            android.app.Activity r7 = (android.app.Activity) r7     // Catch: java.lang.Throwable -> L68
                            goto L5c
                        L48:
                            boolean r8 = r7 instanceof android.content.ContextWrapper     // Catch: java.lang.Throwable -> L68
                            if (r8 == 0) goto L5b
                            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7     // Catch: java.lang.Throwable -> L68
                            android.content.Context r7 = r7.getBaseContext()     // Catch: java.lang.Throwable -> L68
                            if (r7 != r2) goto L55
                            goto L5b
                        L55:
                            java.lang.String r8 = "baseContext"
                            kotlin.jvm.internal.Intrinsics.d(r7, r8)     // Catch: java.lang.Throwable -> L68
                            goto L3c
                        L5b:
                            r7 = r6
                        L5c:
                            if (r7 != r10) goto L5f
                            r3 = r4
                        L5f:
                            if (r5 != 0) goto L65
                            if (r3 == 0) goto L64
                            goto L65
                        L64:
                            return
                        L65:
                            r1.set(r0, r6)     // Catch: java.lang.Throwable -> L68
                        L68:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: leakcanary.AndroidLeakFixes$IMM_CUR_ROOT_VIEW$apply$1.onActivityDestroyed(android.app.Activity):void");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity p0) {
                        Intrinsics.i(p0, "p0");
                        this.d.onActivityPaused(p0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity p0) {
                        Intrinsics.i(p0, "p0");
                        this.d.onActivityResumed(p0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity p0, Bundle p1) {
                        Intrinsics.i(p0, "p0");
                        Intrinsics.i(p1, "p1");
                        this.d.onActivitySaveInstanceState(p0, p1);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity p0) {
                        Intrinsics.i(p0, "p0");
                        this.d.onActivityStarted(p0);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity p0) {
                        Intrinsics.i(p0, "p0");
                        this.d.onActivityStopped(p0);
                    }
                });
                Curtains.a().add(new OnRootViewRemovedListener() { // from class: leakcanary.AndroidLeakFixes$IMM_CUR_ROOT_VIEW$apply$2
                    @Override // curtains.OnRootViewsChangedListener
                    public final void a(View removedRootView, boolean z) throws IllegalAccessException, IllegalArgumentException {
                        Intrinsics.i(removedRootView, "view");
                        if (z) {
                            return;
                        }
                        Intrinsics.i(removedRootView, "removedRootView");
                        Field field = declaredField;
                        InputMethodManager inputMethodManager2 = inputMethodManager;
                        if (((View) field.get(inputMethodManager2)) == removedRootView) {
                            field.set(inputMethodManager2, null);
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static AndroidLeakFixes valueOf(String str) {
        return (AndroidLeakFixes) Enum.valueOf(AndroidLeakFixes.class, str);
    }

    public static AndroidLeakFixes[] values() {
        return (AndroidLeakFixes[]) e.clone();
    }

    public abstract void a(Application application);
}

package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.layout.SidecarAdapter;
import androidx.window.layout.SidecarCompat;
import androidx.window.layout.SidecarWindowBackend;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "DistinctElementCallback", "DistinctSidecarElementCallback", "FirstAttachAdapter", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SidecarCompat implements ExtensionInterfaceCompat {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f3880a;
    public final SidecarAdapter b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public ExtensionInterfaceCompat.ExtensionCallbackInterface e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/SidecarCompat$Companion;", "", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public static SidecarInterface b(Context context) {
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public static Version c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                Version version = Version.i;
                return Version.Companion.a(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctElementCallback;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {

        /* renamed from: a, reason: collision with root package name */
        public final SidecarWindowBackend.ExtensionListenerImpl f3881a;
        public final ReentrantLock b = new ReentrantLock();
        public final WeakHashMap c = new WeakHashMap();

        public DistinctElementCallback(SidecarWindowBackend.ExtensionListenerImpl extensionListenerImpl) {
            this.f3881a = extensionListenerImpl;
        }

        public final void a(Activity activity, WindowLayoutInfo windowLayoutInfo) {
            WeakHashMap weakHashMap = this.c;
            Intrinsics.h(activity, "activity");
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                if (windowLayoutInfo.equals((WindowLayoutInfo) weakHashMap.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                Iterator it = SidecarWindowBackend.this.b.iterator();
                while (it.hasNext()) {
                    SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = (SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) it.next();
                    if (windowLayoutChangeCallbackWrapper.f3886a.equals(activity)) {
                        windowLayoutChangeCallbackWrapper.c = windowLayoutInfo;
                        windowLayoutChangeCallbackWrapper.b.accept(windowLayoutInfo);
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* renamed from: a, reason: collision with root package name */
        public final SidecarAdapter f3882a;
        public final SidecarInterface.SidecarCallback b;
        public final ReentrantLock c;
        public SidecarDeviceState d;
        public final WeakHashMap e;

        public DistinctSidecarElementCallback(SidecarAdapter sidecarAdapter, SidecarInterface.SidecarCallback sidecarCallback) {
            Intrinsics.h(sidecarAdapter, "sidecarAdapter");
            this.f3882a = sidecarAdapter;
            this.b = sidecarCallback;
            this.c = new ReentrantLock();
            this.e = new WeakHashMap();
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            if (androidx.window.layout.SidecarAdapter.Companion.b(r2) == androidx.window.layout.SidecarAdapter.Companion.b(r4)) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onDeviceStateChanged(@org.jetbrains.annotations.NotNull androidx.window.sidecar.SidecarDeviceState r4) {
            /*
                r3 = this;
                java.lang.String r0 = "newDeviceState"
                kotlin.jvm.internal.Intrinsics.h(r4, r0)
                java.util.concurrent.locks.ReentrantLock r0 = r3.c
                r0.lock()
                androidx.window.layout.SidecarAdapter r1 = r3.f3882a     // Catch: java.lang.Throwable -> L34
                androidx.window.sidecar.SidecarDeviceState r2 = r3.d     // Catch: java.lang.Throwable -> L34
                r1.getClass()     // Catch: java.lang.Throwable -> L34
                boolean r1 = kotlin.jvm.internal.Intrinsics.c(r2, r4)     // Catch: java.lang.Throwable -> L34
                if (r1 == 0) goto L18
                goto L25
            L18:
                if (r2 != 0) goto L1b
                goto L29
            L1b:
                int r1 = androidx.window.layout.SidecarAdapter.Companion.b(r2)     // Catch: java.lang.Throwable -> L34
                int r2 = androidx.window.layout.SidecarAdapter.Companion.b(r4)     // Catch: java.lang.Throwable -> L34
                if (r1 != r2) goto L29
            L25:
                r0.unlock()
                return
            L29:
                r3.d = r4     // Catch: java.lang.Throwable -> L34
                androidx.window.sidecar.SidecarInterface$SidecarCallback r1 = r3.b     // Catch: java.lang.Throwable -> L34
                r1.onDeviceStateChanged(r4)     // Catch: java.lang.Throwable -> L34
                r0.unlock()
                return
            L34:
                r4 = move-exception
                r0.unlock()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.DistinctSidecarElementCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
        }

        public void onWindowLayoutChanged(@NotNull IBinder token, @NotNull SidecarWindowLayoutInfo newLayout) {
            Intrinsics.h(token, "token");
            Intrinsics.h(newLayout, "newLayout");
            synchronized (this.c) {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = (SidecarWindowLayoutInfo) this.e.get(token);
                this.f3882a.getClass();
                if (Intrinsics.c(sidecarWindowLayoutInfo, newLayout) ? true : sidecarWindowLayoutInfo == null ? false : SidecarAdapter.b(SidecarAdapter.Companion.c(sidecarWindowLayoutInfo), SidecarAdapter.Companion.c(newLayout))) {
                    return;
                }
                this.b.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/SidecarCompat$FirstAttachAdapter;", "Landroid/view/View$OnAttachStateChangeListener;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {
        public final SidecarCompat d;
        public final WeakReference e;

        public FirstAttachAdapter(SidecarCompat sidecarCompat, Activity activity) {
            this.d = sidecarCompat;
            this.e = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            Intrinsics.h(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.e.get();
            IBinder iBinderA = Companion.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.d.d(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            Intrinsics.h(view, "view");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        @SuppressLint
        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterface;
            Intrinsics.h(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = SidecarCompat.this.c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = Companion.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterface = sidecarCompat.f3880a) != null) {
                    windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinderA);
                }
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.e;
                if (extensionCallbackInterface != null) {
                    ((DistinctElementCallback) extensionCallbackInterface).a(activity, sidecarCompat.b.c(windowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint
        public void onWindowLayoutChanged(@NotNull IBinder windowToken, @NotNull SidecarWindowLayoutInfo newLayout) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.h(windowToken, "windowToken");
            Intrinsics.h(newLayout, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.c.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarCompat sidecarCompat = SidecarCompat.this;
            SidecarAdapter sidecarAdapter = sidecarCompat.b;
            SidecarInterface sidecarInterface = sidecarCompat.f3880a;
            SidecarDeviceState deviceState = sidecarInterface == null ? null : sidecarInterface.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            WindowLayoutInfo windowLayoutInfoC = sidecarAdapter.c(newLayout, deviceState);
            ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = SidecarCompat.this.e;
            if (extensionCallbackInterface == null) {
                return;
            }
            ((DistinctElementCallback) extensionCallbackInterface).a(activity, windowLayoutInfoC);
        }
    }

    public SidecarCompat(@NotNull Context context) {
        Intrinsics.h(context, "context");
        SidecarInterface sidecarInterfaceB = Companion.b(context);
        SidecarAdapter sidecarAdapter = new SidecarAdapter();
        this.f3880a = sidecarInterfaceB;
        this.b = sidecarAdapter;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public final void a(Activity activity) {
        IBinder iBinderA = Companion.a(activity);
        if (iBinderA != null) {
            d(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public final void b(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder iBinderA = Companion.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f3880a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        LinkedHashMap linkedHashMap = this.d;
        activity.unregisterComponentCallbacks((ComponentCallbacks) linkedHashMap.get(activity));
        linkedHashMap.remove(activity);
        LinkedHashMap linkedHashMap2 = this.c;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinderA);
        if (!z || (sidecarInterface = this.f3880a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final WindowLayoutInfo c(Activity activity) {
        IBinder iBinderA = Companion.a(activity);
        if (iBinderA == null) {
            return new WindowLayoutInfo(EmptyList.d);
        }
        SidecarInterface sidecarInterface = this.f3880a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinderA);
        SidecarInterface sidecarInterface2 = this.f3880a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return this.b.c(windowLayoutInfo, deviceState);
    }

    public final void d(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f3880a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f3880a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.e;
        if (extensionCallbackInterface != null) {
            ((DistinctElementCallback) extensionCallbackInterface).a(activity, c(activity));
        }
        LinkedHashMap linkedHashMap2 = this.d;
        if (linkedHashMap2.get(activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration newConfig) {
                    Intrinsics.h(newConfig, "newConfig");
                    SidecarCompat sidecarCompat = this.d;
                    ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface2 = sidecarCompat.e;
                    if (extensionCallbackInterface2 == null) {
                        return;
                    }
                    Activity activity2 = activity;
                    ((SidecarCompat.DistinctElementCallback) extensionCallbackInterface2).a(activity2, sidecarCompat.c(activity2));
                }

                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                }
            };
            linkedHashMap2.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    public final void e(SidecarWindowBackend.ExtensionListenerImpl extensionListenerImpl) {
        this.e = new DistinctElementCallback(extensionListenerImpl);
        SidecarInterface sidecarInterface = this.f3880a;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.b, new TranslatingCallback()));
    }

    public final boolean f() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f3880a;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!Intrinsics.c(returnType, cls5)) {
                throw new NoSuchMethodException(Intrinsics.m(returnType, "Illegal return type for 'setSidecarCallback': "));
            }
            SidecarInterface sidecarInterface2 = this.f3880a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f3880a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f3880a;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 == null ? null : method2.getReturnType();
            if (!Intrinsics.c(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(Intrinsics.m(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
            }
            SidecarInterface sidecarInterface5 = this.f3880a;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 == null ? null : method3.getReturnType();
            if (!Intrinsics.c(returnType3, cls5)) {
                throw new NoSuchMethodException(Intrinsics.m(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
            }
            SidecarInterface sidecarInterface6 = this.f3880a;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 == null ? null : method4.getReturnType();
            if (!Intrinsics.c(returnType4, cls5)) {
                throw new NoSuchMethodException(Intrinsics.m(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            Intrinsics.g(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (arrayList.equals((List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}

package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.layout.ExtensionInterfaceCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend;", "Landroidx/window/layout/WindowBackend;", "Companion", "ExtensionListenerImpl", "WindowLayoutChangeCallbackWrapper", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SidecarWindowBackend implements WindowBackend {
    public static volatile SidecarWindowBackend c;
    public static final ReentrantLock d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final ExtensionInterfaceCompat f3884a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$Companion;", "", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "Landroidx/window/layout/SidecarWindowBackend;", "globalInstance", "Landroidx/window/layout/SidecarWindowBackend;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$ExtensionListenerImpl;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @VisibleForTesting
    public final class ExtensionListenerImpl implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        public ExtensionListenerImpl() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/SidecarWindowBackend$WindowLayoutChangeCallbackWrapper;", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class WindowLayoutChangeCallbackWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f3886a;
        public final a b;
        public WindowLayoutInfo c;

        public WindowLayoutChangeCallbackWrapper(Activity activity, androidx.arch.core.executor.a aVar, a aVar2) {
            this.f3886a = activity;
            this.b = aVar2;
        }
    }

    public SidecarWindowBackend(SidecarCompat sidecarCompat) {
        this.f3884a = sidecarCompat;
        if (sidecarCompat == null) {
            return;
        }
        sidecarCompat.e(new ExtensionListenerImpl());
    }

    @Override // androidx.window.layout.WindowBackend
    public final void a(Activity activity, androidx.arch.core.executor.a aVar, a aVar2) {
        WindowLayoutInfo windowLayoutInfo;
        Object next;
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            ExtensionInterfaceCompat extensionInterfaceCompat = this.f3884a;
            if (extensionInterfaceCompat == null) {
                aVar2.accept(new WindowLayoutInfo(EmptyList.d));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((WindowLayoutChangeCallbackWrapper) it.next()).f3886a.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = new WindowLayoutChangeCallbackWrapper(activity, aVar, aVar2);
            copyOnWriteArrayList.add(windowLayoutChangeCallbackWrapper);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    windowLayoutInfo = null;
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (activity.equals(((WindowLayoutChangeCallbackWrapper) next).f3886a)) {
                            break;
                        }
                    }
                }
                WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper2 = (WindowLayoutChangeCallbackWrapper) next;
                if (windowLayoutChangeCallbackWrapper2 != null) {
                    windowLayoutInfo = windowLayoutChangeCallbackWrapper2.c;
                }
                if (windowLayoutInfo != null) {
                    windowLayoutChangeCallbackWrapper.c = windowLayoutInfo;
                    windowLayoutChangeCallbackWrapper.b.accept(windowLayoutInfo);
                }
            } else {
                extensionInterfaceCompat.a(activity);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowBackend
    public final void b(Consumer callback) {
        Intrinsics.h(callback, "callback");
        synchronized (d) {
            try {
                if (this.f3884a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper = (WindowLayoutChangeCallbackWrapper) it.next();
                    if (windowLayoutChangeCallbackWrapper.b == callback) {
                        arrayList.add(windowLayoutChangeCallbackWrapper);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((WindowLayoutChangeCallbackWrapper) it2.next()).f3886a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((WindowLayoutChangeCallbackWrapper) it3.next()).f3886a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    ExtensionInterfaceCompat extensionInterfaceCompat = this.f3884a;
                    if (extensionInterfaceCompat != null) {
                        extensionInterfaceCompat.b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

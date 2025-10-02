package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend;", "Landroidx/window/layout/WindowBackend;", "MulticastConsumer", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f3873a;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;", "Ljava/util/function/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @SuppressLint
    public static final class MulticastConsumer implements Consumer<androidx.window.extensions.layout.WindowLayoutInfo> {
        public final Activity d;
        public WindowLayoutInfo f;
        public final ReentrantLock e = new ReentrantLock();
        public final LinkedHashSet g = new LinkedHashSet();

        public MulticastConsumer(Activity activity) {
            this.d = activity;
        }

        public final void a(a aVar) {
            ReentrantLock reentrantLock = this.e;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.f;
                if (windowLayoutInfo != null) {
                    aVar.accept(windowLayoutInfo);
                }
                this.g.add(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // java.util.function.Consumer
        public final void accept(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
            androidx.window.extensions.layout.WindowLayoutInfo value = windowLayoutInfo;
            Intrinsics.h(value, "value");
            ReentrantLock reentrantLock = this.e;
            reentrantLock.lock();
            try {
                this.f = ExtensionsWindowLayoutInfoAdapter.b(this.d, value);
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((androidx.core.util.Consumer) it.next()).accept(this.f);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public ExtensionWindowLayoutInfoBackend(WindowLayoutComponent windowLayoutComponent) {
        this.f3873a = windowLayoutComponent;
    }

    @Override // androidx.window.layout.WindowBackend
    public final void a(Activity activity, androidx.arch.core.executor.a aVar, a aVar2) {
        Unit unit;
        LinkedHashMap linkedHashMap = this.c;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(activity);
            LinkedHashMap linkedHashMap2 = this.d;
            if (multicastConsumer == null) {
                unit = null;
            } else {
                multicastConsumer.a(aVar2);
                linkedHashMap2.put(aVar2, activity);
                unit = Unit.f24250a;
            }
            if (unit == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                linkedHashMap.put(activity, multicastConsumer2);
                linkedHashMap2.put(aVar2, activity);
                multicastConsumer2.a(aVar2);
                this.f3873a.addWindowLayoutInfoListener(activity, multicastConsumer2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowBackend
    public final void b(androidx.core.util.Consumer callback) {
        Intrinsics.h(callback, "callback");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.d.get(callback);
            if (activity == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.c.get(activity);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.g;
            ReentrantLock reentrantLock2 = multicastConsumer.e;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(callback);
                reentrantLock2.unlock();
                if (linkedHashSet.isEmpty()) {
                    this.f3873a.removeWindowLayoutInfoListener(multicastConsumer);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}

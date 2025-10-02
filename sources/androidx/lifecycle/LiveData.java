package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import com.woolworths.scanlibrary.ui.tap.tapon.TapOnFragment;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2792a;
    public final SafeIterableMap b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final Runnable j;

    public class AlwaysActiveObserver extends LiveData<T>.ObserverWrapper {
        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean d() {
            return true;
        }
    }

    public class LifecycleBoundObserver extends LiveData<T>.ObserverWrapper implements LifecycleEventObserver {
        public final LifecycleOwner h;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, Observer observer) {
            super(observer);
            this.h = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            LifecycleOwner lifecycleOwner2 = this.h;
            Lifecycle.State stateB = lifecycleOwner2.getLifecycle().getD();
            if (stateB == Lifecycle.State.d) {
                LiveData.this.k(this.d);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateB) {
                a(d());
                state = stateB;
                stateB = lifecycleOwner2.getLifecycle().getD();
            }
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final void b() {
            this.h.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean c(LifecycleOwner lifecycleOwner) {
            return this.h == lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.ObserverWrapper
        public final boolean d() {
            return this.h.getLifecycle().getD().a(Lifecycle.State.g);
        }
    }

    public abstract class ObserverWrapper {
        public final Observer d;
        public boolean e;
        public int f = -1;

        public ObserverWrapper(Observer observer) {
            this.d = observer;
        }

        public final void a(boolean z) {
            if (z == this.e) {
                return;
            }
            this.e = z;
            int i = z ? 1 : -1;
            LiveData liveData = LiveData.this;
            int i2 = liveData.c;
            liveData.c = i + i2;
            if (!liveData.d) {
                liveData.d = true;
                while (true) {
                    try {
                        int i3 = liveData.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            liveData.h();
                        } else if (z3) {
                            liveData.i();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        liveData.d = false;
                        throw th;
                    }
                }
                liveData.d = false;
            }
            if (this.e) {
                liveData.d(this);
            }
        }

        public void b() {
        }

        public boolean c(LifecycleOwner lifecycleOwner) {
            return false;
        }

        public abstract boolean d();
    }

    public LiveData(Object obj) {
        this.f2792a = new Object();
        this.b = new SafeIterableMap();
        this.c = 0;
        this.f = k;
        this.j = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                synchronized (LiveData.this.f2792a) {
                    obj2 = LiveData.this.f;
                    LiveData.this.f = LiveData.k;
                }
                LiveData.this.m(obj2);
            }
        };
        this.e = obj;
        this.g = 0;
    }

    public static void b(String str) {
        if (!ArchTaskExecutor.d().f199a.b()) {
            throw new IllegalStateException(YU.a.h("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void c(ObserverWrapper observerWrapper) {
        if (observerWrapper.e) {
            if (!observerWrapper.d()) {
                observerWrapper.a(false);
                return;
            }
            int i = observerWrapper.f;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            observerWrapper.f = i2;
            observerWrapper.d.onChanged(this.e);
        }
    }

    public final void d(ObserverWrapper observerWrapper) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (observerWrapper != null) {
                c(observerWrapper);
                observerWrapper = null;
            } else {
                SafeIterableMap safeIterableMap = this.b;
                safeIterableMap.getClass();
                SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
                safeIterableMap.f.put(iteratorWithAdditions, Boolean.FALSE);
                while (iteratorWithAdditions.hasNext()) {
                    c((ObserverWrapper) ((Map.Entry) iteratorWithAdditions.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object e() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void f(LifecycleOwner lifecycleOwner, Observer observer) {
        b("observe");
        if (lifecycleOwner.getLifecycle().getD() == Lifecycle.State.d) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lifecycleOwner, observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.b.d(observer, lifecycleBoundObserver);
        if (observerWrapper != null && !observerWrapper.c(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapper != null) {
            return;
        }
        lifecycleOwner.getLifecycle().a(lifecycleBoundObserver);
    }

    public final void g(Observer observer) {
        b("observeForever");
        AlwaysActiveObserver alwaysActiveObserver = new AlwaysActiveObserver(observer);
        ObserverWrapper observerWrapper = (ObserverWrapper) this.b.d(observer, alwaysActiveObserver);
        if (observerWrapper instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (observerWrapper != null) {
            return;
        }
        alwaysActiveObserver.a(true);
    }

    public void h() {
    }

    public void i() {
    }

    public void j(Object obj) {
        boolean z;
        synchronized (this.f2792a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            ArchTaskExecutor.d().c(this.j);
        }
    }

    public void k(Observer observer) {
        b("removeObserver");
        ObserverWrapper observerWrapper = (ObserverWrapper) this.b.g(observer);
        if (observerWrapper == null) {
            return;
        }
        observerWrapper.b();
        observerWrapper.a(false);
    }

    public final void l(TapOnFragment tapOnFragment) {
        b("removeObservers");
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((ObserverWrapper) entry.getValue()).c(tapOnFragment)) {
                k((Observer) entry.getKey());
            }
        }
    }

    public void m(Object obj) {
        b("setValue");
        this.g++;
        this.e = obj;
        d(null);
    }

    public LiveData() {
        this.f2792a = new Object();
        this.b = new SafeIterableMap();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new Runnable() { // from class: androidx.lifecycle.LiveData.1
            @Override // java.lang.Runnable
            public final void run() {
                Object obj2;
                synchronized (LiveData.this.f2792a) {
                    obj2 = LiveData.this.f;
                    LiveData.this.f = LiveData.k;
                }
                LiveData.this.m(obj2);
            }
        };
        this.e = obj;
        this.g = -1;
    }
}

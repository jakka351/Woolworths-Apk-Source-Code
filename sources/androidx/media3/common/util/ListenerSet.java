package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

@UnstableApi
/* loaded from: classes2.dex */
public final class ListenerSet<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Clock f2911a;
    public final HandlerWrapper b;
    public final IterationFinishedEvent c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public interface Event<T> {
        void invoke(Object obj);
    }

    public interface IterationFinishedEvent<T> {
        void b(Object obj, FlagSet flagSet);
    }

    public static final class ListenerHolder<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2912a;
        public FlagSet.Builder b = new FlagSet.Builder();
        public boolean c;
        public boolean d;

        public ListenerHolder(Object obj) {
            this.f2912a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ListenerHolder.class != obj.getClass()) {
                return false;
            }
            return this.f2912a.equals(((ListenerHolder) obj).f2912a);
        }

        public final int hashCode() {
            return this.f2912a.hashCode();
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new ListenerHolder(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        HandlerWrapper handlerWrapper = this.b;
        if (!handlerWrapper.a()) {
            handlerWrapper.g(handlerWrapper.b(1));
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(final int i, final Event event) {
        g();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: androidx.media3.common.util.a
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    ListenerSet.ListenerHolder listenerHolder = (ListenerSet.ListenerHolder) it.next();
                    if (!listenerHolder.d) {
                        int i2 = i;
                        if (i2 != -1) {
                            listenerHolder.b.a(i2);
                        }
                        listenerHolder.c = true;
                        event.invoke(listenerHolder.f2912a);
                    }
                }
            }
        });
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ListenerHolder listenerHolder = (ListenerHolder) it.next();
            IterationFinishedEvent iterationFinishedEvent = this.c;
            listenerHolder.d = true;
            if (listenerHolder.c) {
                listenerHolder.c = false;
                iterationFinishedEvent.b(listenerHolder.f2912a, listenerHolder.b.b());
            }
        }
        this.d.clear();
    }

    public final void e(Player.Listener listener) {
        g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ListenerHolder listenerHolder = (ListenerHolder) it.next();
            if (listenerHolder.f2912a.equals(listener)) {
                listenerHolder.d = true;
                if (listenerHolder.c) {
                    listenerHolder.c = false;
                    this.c.b(listenerHolder.f2912a, listenerHolder.b.b());
                }
                copyOnWriteArraySet.remove(listenerHolder);
            }
        }
    }

    public final void f(int i, Event event) {
        c(i, event);
        b();
    }

    public final void g() {
        if (this.i) {
            Assertions.f(Thread.currentThread() == this.b.h().getThread());
        }
    }

    public ListenerSet(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent iterationFinishedEvent, boolean z) {
        this.f2911a = clock;
        this.d = copyOnWriteArraySet;
        this.c = iterationFinishedEvent;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = clock.b(looper, new Handler.Callback() { // from class: androidx.media3.common.util.b
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                ListenerSet listenerSet = this.d;
                Iterator it = listenerSet.d.iterator();
                while (it.hasNext()) {
                    ListenerSet.ListenerHolder listenerHolder = (ListenerSet.ListenerHolder) it.next();
                    ListenerSet.IterationFinishedEvent iterationFinishedEvent2 = listenerSet.c;
                    if (!listenerHolder.d && listenerHolder.c) {
                        FlagSet flagSetB = listenerHolder.b.b();
                        listenerHolder.b = new FlagSet.Builder();
                        listenerHolder.c = false;
                        iterationFinishedEvent2.b(listenerHolder.f2912a, flagSetB);
                    }
                    if (listenerSet.b.a()) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.i = z;
    }
}

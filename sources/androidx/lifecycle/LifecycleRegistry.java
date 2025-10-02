package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "ObserverWithState", "Companion", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class LifecycleRegistry extends Lifecycle {
    public final boolean b;
    public FastSafeIterableMap c = new FastSafeIterableMap();
    public Lifecycle.State d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final MutableStateFlow j;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ObserverWithState {

        /* renamed from: a, reason: collision with root package name */
        public Lifecycle.State f2790a;
        public LifecycleEventObserver b;

        public final void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State stateA = event.a();
            Lifecycle.State state1 = this.f2790a;
            Intrinsics.h(state1, "state1");
            if (stateA.compareTo(state1) < 0) {
                state1 = stateA;
            }
            this.f2790a = state1;
            this.b.T(lifecycleOwner, event);
            this.f2790a = stateA;
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
        this.b = z;
        Lifecycle.State state = Lifecycle.State.e;
        this.d = state;
        this.i = new ArrayList();
        this.e = new WeakReference(lifecycleOwner);
        this.j = StateFlowKt.a(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(LifecycleObserver observer) {
        LifecycleEventObserver reflectiveGenericLifecycleObserver;
        LifecycleOwner lifecycleOwner;
        Intrinsics.h(observer, "observer");
        e("addObserver");
        Lifecycle.State state = this.d;
        Lifecycle.State state2 = Lifecycle.State.d;
        if (state != state2) {
            state2 = Lifecycle.State.e;
        }
        ObserverWithState observerWithState = new ObserverWithState();
        HashMap map = Lifecycling.f2791a;
        boolean z = observer instanceof LifecycleEventObserver;
        boolean z2 = observer instanceof DefaultLifecycleObserver;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) observer, (LifecycleEventObserver) observer);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) observer, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (LifecycleEventObserver) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (Lifecycling.b(cls) == 2) {
                Object obj = Lifecycling.b.get(cls);
                Intrinsics.e(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(Lifecycling.a((Constructor) list.get(0), observer));
                } else {
                    int size = list.size();
                    GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
                    for (int i = 0; i < size; i++) {
                        generatedAdapterArr[i] = Lifecycling.a((Constructor) list.get(i), observer);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(observer);
            }
        }
        observerWithState.b = reflectiveGenericLifecycleObserver;
        observerWithState.f2790a = state2;
        if (((ObserverWithState) this.c.d(observer, observerWithState)) == null && (lifecycleOwner = (LifecycleOwner) this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            Lifecycle.State stateD = d(observer);
            this.f++;
            while (observerWithState.f2790a.compareTo(stateD) < 0 && this.c.h.containsKey(observer)) {
                Lifecycle.State state3 = observerWithState.f2790a;
                ArrayList arrayList = this.i;
                arrayList.add(state3);
                Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                Lifecycle.State state4 = observerWithState.f2790a;
                companion.getClass();
                Intrinsics.h(state4, "state");
                int iOrdinal = state4.ordinal();
                Lifecycle.Event event = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_START : Lifecycle.Event.ON_CREATE;
                if (event == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.f2790a);
                }
                observerWithState.a(lifecycleOwner, event);
                arrayList.remove(arrayList.size() - 1);
                stateD = d(observer);
            }
            if (!z3) {
                i();
            }
            this.f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: b, reason: from getter */
    public final Lifecycle.State getD() {
        return this.d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void c(LifecycleObserver observer) {
        Intrinsics.h(observer, "observer");
        e("removeObserver");
        this.c.g(observer);
    }

    public final Lifecycle.State d(LifecycleObserver lifecycleObserver) {
        ObserverWithState observerWithState;
        Map.Entry entryH = this.c.h(lifecycleObserver);
        Lifecycle.State state = (entryH == null || (observerWithState = (ObserverWithState) entryH.getValue()) == null) ? null : observerWithState.f2790a;
        ArrayList arrayList = this.i;
        Lifecycle.State state2 = arrayList.isEmpty() ? null : (Lifecycle.State) YU.a.c(1, arrayList);
        Lifecycle.State state1 = this.d;
        Intrinsics.h(state1, "state1");
        if (state == null || state.compareTo(state1) >= 0) {
            state = state1;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public final void e(String str) {
        if (this.b && !ArchTaskExecutor.d().f199a.b()) {
            throw new IllegalStateException(YU.a.h("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void f(Lifecycle.Event event) {
        Intrinsics.h(event, "event");
        e("handleLifecycleEvent");
        g(event.a());
    }

    public final void g(Lifecycle.State next) {
        if (this.d == next) {
            return;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.e.get();
        Lifecycle.State current = this.d;
        Intrinsics.h(current, "current");
        Intrinsics.h(next, "next");
        if (current == Lifecycle.State.e && next == Lifecycle.State.d) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.f + "' to be moved to '" + next + "' in component " + lifecycleOwner).toString());
        }
        Lifecycle.State state = Lifecycle.State.d;
        if (current == state && current != next) {
            throw new IllegalStateException(("State is '" + state + "' and cannot be moved to `" + next + "` in component " + lifecycleOwner).toString());
        }
        this.d = next;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        i();
        this.g = false;
        if (this.d == state) {
            this.c = new FastSafeIterableMap();
        }
    }

    public final void h(Lifecycle.State state) {
        Intrinsics.h(state, "state");
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r8.h = false;
        r8.j.setValue(r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.LifecycleRegistry.i():void");
    }
}

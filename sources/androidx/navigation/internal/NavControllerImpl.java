package androidx.navigation.internal;

import android.os.Bundle;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavController;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.SupportingPane;
import androidx.navigation.internal.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.TakeWhileSequence;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/internal/NavControllerImpl;", "", "Companion", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NavControllerImpl {
    public final SharedFlowImpl A;

    /* renamed from: a, reason: collision with root package name */
    public final NavController f3510a;
    public final androidx.navigation.b b;
    public NavGraph c;
    public Bundle d;
    public Bundle[] e;
    public final ArrayDeque f = new ArrayDeque();
    public final MutableStateFlow g;
    public final StateFlow h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public LifecycleOwner o;
    public NavControllerViewModel p;
    public final ArrayList q;
    public Lifecycle.State r;
    public final androidx.compose.material3.internal.a s;
    public final NavigatorProvider t;
    public final LinkedHashMap u;
    public Function1 v;
    public d w;
    public final LinkedHashMap x;
    public int y;
    public final ArrayList z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"Landroidx/navigation/internal/NavControllerImpl$Companion;", "", "", "TAG", "Ljava/lang/String;", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "KEY_BACK_STACK", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NavControllerImpl(NavController navController, androidx.navigation.b bVar) {
        this.f3510a = navController;
        this.b = bVar;
        EmptyList emptyList = EmptyList.d;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(emptyList);
        this.g = mutableStateFlowA;
        this.h = FlowKt.b(mutableStateFlowA);
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(emptyList);
        this.i = mutableStateFlowA2;
        this.j = FlowKt.b(mutableStateFlowA2);
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.q = new ArrayList();
        this.r = Lifecycle.State.e;
        this.s = new androidx.compose.material3.internal.a(this, 3);
        this.t = new NavigatorProvider();
        this.u = new LinkedHashMap();
        this.x = new LinkedHashMap();
        this.z = new ArrayList();
        this.A = SharedFlowKt.b(1, 0, BufferOverflow.e, 2);
    }

    public static NavDestination d(int i, NavDestination navDestination, NavDestination navDestination2, boolean z) {
        if (navDestination.e.e == i && (navDestination2 == null || (navDestination.equals(navDestination2) && Intrinsics.c(navDestination.f, navDestination2.f)))) {
            return navDestination;
        }
        NavGraph navGraph = navDestination instanceof NavGraph ? (NavGraph) navDestination : null;
        if (navGraph == null) {
            navGraph = navDestination.f;
            Intrinsics.e(navGraph);
        }
        return navGraph.j.d(i, navGraph, navDestination2, z);
    }

    public static /* synthetic */ void n(NavControllerImpl navControllerImpl, NavBackStackEntry navBackStackEntry) {
        navControllerImpl.m(navBackStackEntry, false, new ArrayDeque());
    }

    public final void a(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list) {
        Object objPrevious;
        Object objPrevious2;
        NavContext navContext = this.f3510a.c;
        NavDestination navDestination2 = navBackStackEntry.e;
        boolean z = navDestination2 instanceof FloatingWindow;
        ArrayDeque arrayDeque = this.f;
        if (!z) {
            while (!arrayDeque.isEmpty() && (((NavBackStackEntry) arrayDeque.last()).e instanceof FloatingWindow) && l(((NavBackStackEntry) arrayDeque.last()).e.e.e, true, false)) {
            }
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        Object obj = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination3 = navDestination2;
            do {
                Intrinsics.e(navDestination3);
                navDestination3 = navDestination3.f;
                if (navDestination3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        } else {
                            objPrevious2 = listIterator.previous();
                            if (Intrinsics.c(((NavBackStackEntry) objPrevious2).e, navDestination3)) {
                                break;
                            }
                        }
                    }
                    NavBackStackEntry navBackStackEntryA = (NavBackStackEntry) objPrevious2;
                    if (navBackStackEntryA == null) {
                        navBackStackEntryA = NavBackStackEntry.Companion.a(navContext, navDestination3, bundle, h(), this.p);
                    }
                    arrayDeque2.addFirst(navBackStackEntryA);
                    if (!arrayDeque.isEmpty() && ((NavBackStackEntry) arrayDeque.last()).e == navDestination3) {
                        n(this, (NavBackStackEntry) arrayDeque.last());
                    }
                }
                if (navDestination3 == null) {
                    break;
                }
            } while (navDestination3 != navDestination);
        }
        NavDestination navDestination4 = arrayDeque2.isEmpty() ? navDestination2 : ((NavBackStackEntry) arrayDeque2.first()).e;
        while (navDestination4 != null && c(navDestination4.e.e, navDestination4) != navDestination4) {
            navDestination4 = navDestination4.f;
            if (navDestination4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator2.previous();
                        if (Intrinsics.c(((NavBackStackEntry) objPrevious).e, navDestination4)) {
                            break;
                        }
                    }
                }
                NavBackStackEntry navBackStackEntryA2 = (NavBackStackEntry) objPrevious;
                if (navBackStackEntryA2 == null) {
                    navBackStackEntryA2 = NavBackStackEntry.Companion.a(navContext, navDestination4, navDestination4.d(bundle2), h(), this.p);
                }
                arrayDeque2.addFirst(navBackStackEntryA2);
            }
        }
        if (!arrayDeque2.isEmpty()) {
            navDestination2 = ((NavBackStackEntry) arrayDeque2.first()).e;
        }
        while (!arrayDeque.isEmpty() && (((NavBackStackEntry) arrayDeque.last()).e instanceof NavGraph)) {
            NavDestination navDestination5 = ((NavBackStackEntry) arrayDeque.last()).e;
            Intrinsics.f(navDestination5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            SparseArrayCompat sparseArrayCompat = ((NavGraph) navDestination5).j.b;
            int i = navDestination2.e.e;
            sparseArrayCompat.getClass();
            if (SparseArrayCompatKt.b(sparseArrayCompat, i) != null) {
                break;
            } else {
                n(this, (NavBackStackEntry) arrayDeque.last());
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) arrayDeque.i();
        if (navBackStackEntry2 == null) {
            navBackStackEntry2 = (NavBackStackEntry) arrayDeque2.i();
        }
        if (!Intrinsics.c(navBackStackEntry2 != null ? navBackStackEntry2.e : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                NavDestination navDestination6 = ((NavBackStackEntry) objPrevious3).e;
                NavGraph navGraph = this.c;
                Intrinsics.e(navGraph);
                if (Intrinsics.c(navDestination6, navGraph)) {
                    obj = objPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryA3 = (NavBackStackEntry) obj;
            if (navBackStackEntryA3 == null) {
                NavGraph navGraph2 = this.c;
                Intrinsics.e(navGraph2);
                NavGraph navGraph3 = this.c;
                Intrinsics.e(navGraph3);
                navBackStackEntryA3 = NavBackStackEntry.Companion.a(navContext, navGraph2, navGraph3.d(bundle), h(), this.p);
            }
            arrayDeque2.addFirst(navBackStackEntryA3);
        }
        Iterator<E> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) it.next();
            Object obj2 = this.u.get(this.t.b(navBackStackEntry3.e.d));
            if (obj2 == null) {
                throw new IllegalStateException(YU.a.o(new StringBuilder("NavigatorBackStack for "), navDestination.d, " should already be created").toString());
            }
            ((NavController.NavControllerNavigatorState) obj2).i(navBackStackEntry3);
        }
        arrayDeque.addAll(arrayDeque2);
        arrayDeque.addLast(navBackStackEntry);
        Iterator it2 = CollectionsKt.d0(navBackStackEntry, arrayDeque2).iterator();
        while (it2.hasNext()) {
            NavBackStackEntry navBackStackEntry4 = (NavBackStackEntry) it2.next();
            NavGraph navGraph4 = navBackStackEntry4.e.f;
            if (navGraph4 != null) {
                j(navBackStackEntry4, e(navGraph4.e.e));
            }
        }
    }

    public final boolean b() {
        ArrayDeque arrayDeque;
        while (true) {
            arrayDeque = this.f;
            if (arrayDeque.isEmpty() || !(((NavBackStackEntry) arrayDeque.last()).e instanceof NavGraph)) {
                break;
            }
            n(this, (NavBackStackEntry) arrayDeque.last());
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) arrayDeque.k();
        ArrayList arrayList = this.z;
        if (navBackStackEntry != null) {
            arrayList.add(navBackStackEntry);
        }
        this.y++;
        s();
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList arrayListJ0 = CollectionsKt.J0(arrayList);
            arrayList.clear();
            Iterator it = arrayListJ0.iterator();
            while (it.hasNext()) {
                NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it.next();
                Iterator it2 = this.q.iterator();
                while (it2.hasNext()) {
                    ((NavController.OnDestinationChangedListener) it2.next()).a(this.f3510a, navBackStackEntry2.e, navBackStackEntry2.k.a());
                }
                this.A.f(navBackStackEntry2);
            }
            this.g.f(CollectionsKt.J0(arrayDeque));
            this.i.f(o());
        }
        return navBackStackEntry != null;
    }

    public final NavDestination c(int i, NavDestination navDestination) {
        NavDestination navDestination2;
        NavGraph navGraph = this.c;
        if (navGraph == null) {
            return null;
        }
        if (navGraph.e.e == i) {
            if (navDestination == null) {
                return navGraph;
            }
            if (Intrinsics.c(navGraph, navDestination) && navDestination.f == null) {
                return this.c;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f.k();
        if (navBackStackEntry == null || (navDestination2 = navBackStackEntry.e) == null) {
            navDestination2 = this.c;
            Intrinsics.e(navDestination2);
        }
        return d(i, navDestination2, navDestination, false);
    }

    public final NavBackStackEntry e(int i) {
        Object objPrevious;
        ArrayDeque arrayDeque = this.f;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((NavBackStackEntry) objPrevious).e.e.e == i) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder sbR = YU.a.r(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbR.append(f());
        throw new IllegalArgumentException(sbR.toString().toString());
    }

    public final NavDestination f() {
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f.k();
        if (navBackStackEntry != null) {
            return navBackStackEntry.e;
        }
        return null;
    }

    public final NavGraph g() {
        NavGraph navGraph = this.c;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.f(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return navGraph;
    }

    public final Lifecycle.State h() {
        return this.o == null ? Lifecycle.State.f : this.r;
    }

    public final NavGraph i() {
        NavDestination navDestination;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.f.k();
        if (navBackStackEntry == null || (navDestination = navBackStackEntry.e) == null) {
            navDestination = this.c;
            Intrinsics.e(navDestination);
        }
        NavGraph navGraph = navDestination instanceof NavGraph ? (NavGraph) navDestination : null;
        if (navGraph != null) {
            return navGraph;
        }
        NavGraph navGraph2 = navDestination.f;
        Intrinsics.e(navGraph2);
        return navGraph2;
    }

    public final void j(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.k.put(navBackStackEntry, navBackStackEntry2);
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(navBackStackEntry2) == null) {
            linkedHashMap.put(navBackStackEntry2, new AtomicInt());
        }
        Object obj = linkedHashMap.get(navBackStackEntry2);
        Intrinsics.e(obj);
        ((AtomicInt) obj).f3506a.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(androidx.navigation.NavDestination r26, android.os.Bundle r27, androidx.navigation.NavOptions r28) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.internal.NavControllerImpl.k(androidx.navigation.NavDestination, android.os.Bundle, androidx.navigation.NavOptions):void");
    }

    public final boolean l(int i, boolean z, boolean z2) {
        NavDestination navDestination;
        NavControllerImpl navControllerImpl;
        boolean z3;
        ArrayDeque arrayDeque = this.f;
        final int i2 = 0;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.l0(arrayDeque).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            navDestination = ((NavBackStackEntry) it.next()).e;
            String str = navDestination.d;
            NavDestinationImpl navDestinationImpl = navDestination.e;
            Navigator navigatorB = this.t.b(str);
            if (z || navDestinationImpl.e != i) {
                arrayList.add(navigatorB);
            }
            if (navDestinationImpl.e == i) {
                break;
            }
        }
        if (navDestination == null) {
            int i3 = NavDestination.i;
            Log.Companion.a("Ignoring popBackStack to destination " + NavDestination.Companion.a(this.f3510a.c, i) + " as it was not found on the current back stack");
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                navControllerImpl = this;
                z3 = z2;
                break;
            }
            Navigator navigator = (Navigator) it2.next();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            NavBackStackEntry popUpTo = (NavBackStackEntry) arrayDeque.last();
            navControllerImpl = this;
            z3 = z2;
            d dVar = new d(booleanRef2, booleanRef, navControllerImpl, z3, arrayDeque2);
            Intrinsics.h(navigator, "navigator");
            Intrinsics.h(popUpTo, "popUpTo");
            navControllerImpl.w = dVar;
            navigator.i(popUpTo, z3);
            navControllerImpl.w = null;
            if (!booleanRef2.d) {
                break;
            }
            z2 = z3;
        }
        if (z3) {
            final int i4 = 1;
            LinkedHashMap linkedHashMap = navControllerImpl.m;
            if (!z) {
                TakeWhileSequence.AnonymousClass1 anonymousClass1 = new TakeWhileSequence.AnonymousClass1();
                while (anonymousClass1.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((NavDestination) anonymousClass1.next()).e.e);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) arrayDeque2.i();
                    linkedHashMap.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.f3475a.f3508a : null);
                }
            }
            if (!arrayDeque2.isEmpty()) {
                NavBackStackEntryStateImpl navBackStackEntryStateImpl = ((NavBackStackEntryState) arrayDeque2.first()).f3475a;
                TakeWhileSequence.AnonymousClass1 anonymousClass12 = new TakeWhileSequence.AnonymousClass1();
                while (anonymousClass12.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((NavDestination) anonymousClass12.next()).e.e), navBackStackEntryStateImpl.f3508a);
                }
                if (linkedHashMap.values().contains(navBackStackEntryStateImpl.f3508a)) {
                    navControllerImpl.n.put(navBackStackEntryStateImpl.f3508a, arrayDeque2);
                }
            }
        }
        navControllerImpl.b.invoke();
        return booleanRef.d;
    }

    public final void m(NavBackStackEntry popUpTo, boolean z, ArrayDeque arrayDeque) {
        NavControllerViewModel navControllerViewModel;
        StateFlow stateFlow;
        Set set;
        Intrinsics.h(popUpTo, "popUpTo");
        ArrayDeque arrayDeque2 = this.f;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) arrayDeque2.last();
        if (!Intrinsics.c(navBackStackEntry, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.e + ", which is not the top of the back stack (" + navBackStackEntry.e + ')').toString());
        }
        CollectionsKt.j0(arrayDeque2);
        NavController.NavControllerNavigatorState navControllerNavigatorState = (NavController.NavControllerNavigatorState) this.u.get(this.t.b(navBackStackEntry.e.d));
        boolean z2 = true;
        if ((navControllerNavigatorState == null || (stateFlow = navControllerNavigatorState.f) == null || (set = (Set) stateFlow.getValue()) == null || !set.contains(navBackStackEntry)) && !this.l.containsKey(navBackStackEntry)) {
            z2 = false;
        }
        Lifecycle.State state = navBackStackEntry.k.k.d;
        Lifecycle.State state2 = Lifecycle.State.f;
        if (state.compareTo(state2) >= 0) {
            if (z) {
                navBackStackEntry.a(state2);
                arrayDeque.addFirst(new NavBackStackEntryState(navBackStackEntry));
            }
            if (z2) {
                navBackStackEntry.a(state2);
            } else {
                navBackStackEntry.a(Lifecycle.State.d);
                r(navBackStackEntry);
            }
        }
        if (z || z2 || (navControllerViewModel = this.p) == null) {
            return;
        }
        String backStackEntryId = navBackStackEntry.i;
        Intrinsics.h(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = (ViewModelStore) navControllerViewModel.e.remove(backStackEntryId);
        if (viewModelStore != null) {
            viewModelStore.a();
        }
    }

    public final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.u.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((NavController.NavControllerNavigatorState) it.next()).f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if (!arrayList.contains(navBackStackEntry) && navBackStackEntry.k.l.compareTo(Lifecycle.State.g) < 0) {
                    arrayList2.add(obj);
                }
            }
            CollectionsKt.h(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<E> it2 = this.f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) next;
            if (!arrayList.contains(navBackStackEntry2) && navBackStackEntry2.k.l.compareTo(Lifecycle.State.g) >= 0) {
                arrayList3.add(next);
            }
        }
        CollectionsKt.h(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((NavBackStackEntry) next2).e instanceof NavGraph)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    public final boolean p(int i, Bundle bundle, NavOptions navOptions) {
        NavDestination navDestinationG;
        NavBackStackEntry navBackStackEntry;
        NavDestination navDestination;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.m;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        CollectionsKt.f0(linkedHashMap.values(), new androidx.navigation.fragment.d(str, 1));
        ArrayDeque arrayDeque = (ArrayDeque) TypeIntrinsics.b(this.n).remove(str);
        NavContext navContext = this.f3510a.c;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.f.k();
        if (navBackStackEntry2 == null || (navDestinationG = navBackStackEntry2.e) == null) {
            navDestinationG = g();
        }
        if (arrayDeque != null) {
            Iterator<E> it = arrayDeque.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                NavDestination navDestinationD = d(navBackStackEntryState.f3475a.b, navDestinationG, null, true);
                if (navDestinationD == null) {
                    int i2 = NavDestination.i;
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.Companion.a(navContext, navBackStackEntryState.f3475a.b) + " cannot be found from the current destination " + navDestinationG).toString());
                }
                arrayList.add(navBackStackEntryState.a(navContext, navDestinationD, h(), this.p));
                navDestinationG = navDestinationD;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((NavBackStackEntry) next).e instanceof NavGraph)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) it3.next();
            List list = (List) CollectionsKt.P(arrayList2);
            if (Intrinsics.c((list == null || (navBackStackEntry = (NavBackStackEntry) CollectionsKt.O(list)) == null || (navDestination = navBackStackEntry.e) == null) ? null : navDestination.d, navBackStackEntry3.e.d)) {
                list.add(navBackStackEntry3);
            } else {
                arrayList2.add(CollectionsKt.Z(navBackStackEntry3));
            }
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            Navigator navigator = this.t.b(((NavBackStackEntry) CollectionsKt.D(list2)).e.d);
            Bundle bundle2 = bundle;
            f fVar = new f(booleanRef, arrayList, new Ref.IntRef(), this, bundle2, 0);
            Intrinsics.h(navigator, "navigator");
            this.v = fVar;
            navigator.d(list2, navOptions);
            this.v = null;
            bundle = bundle2;
        }
        return booleanRef.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.navigation.NavGraph r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 1301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.internal.NavControllerImpl.q(androidx.navigation.NavGraph, android.os.Bundle):void");
    }

    public final void r(NavBackStackEntry child) {
        Intrinsics.h(child, "child");
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.k.remove(child);
        if (navBackStackEntry == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.l;
        AtomicInt atomicInt = (AtomicInt) linkedHashMap.get(navBackStackEntry);
        Integer numValueOf = atomicInt != null ? Integer.valueOf(atomicInt.f3506a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavController.NavControllerNavigatorState navControllerNavigatorState = (NavController.NavControllerNavigatorState) this.u.get(this.t.b(navBackStackEntry.e.d));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.b(navBackStackEntry);
            }
            linkedHashMap.remove(navBackStackEntry);
        }
    }

    public final void s() {
        AtomicInt atomicInt;
        StateFlow stateFlow;
        Set set;
        ArrayList arrayListJ0 = CollectionsKt.J0(this.f);
        if (arrayListJ0.isEmpty()) {
            return;
        }
        NavDestination navDestination = ((NavBackStackEntry) CollectionsKt.O(arrayListJ0)).e;
        ArrayList arrayListZ = CollectionsKt.Z(navDestination);
        if (navDestination instanceof SupportingPane) {
            boolean z = navDestination instanceof FloatingWindow;
            Iterator it = CollectionsKt.x(CollectionsKt.l0(arrayListJ0), 1).iterator();
            while (it.hasNext()) {
                NavDestination navDestination2 = ((NavBackStackEntry) it.next()).e;
                if (z && !(navDestination2 instanceof FloatingWindow) && !(navDestination2 instanceof NavGraph)) {
                    break;
                }
                arrayListZ.add(navDestination2);
                if (!(navDestination2 instanceof SupportingPane) && !(navDestination2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (CollectionsKt.O(arrayListZ) instanceof FloatingWindow) {
            Iterator it2 = CollectionsKt.l0(arrayListJ0).iterator();
            while (it2.hasNext()) {
                NavDestination navDestination3 = ((NavBackStackEntry) it2.next()).e;
                arrayList.add(navDestination3);
                if (!(navDestination3 instanceof FloatingWindow) && !(navDestination3 instanceof SupportingPane) && !(navDestination3 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : CollectionsKt.l0(arrayListJ0)) {
            Lifecycle.State state = navBackStackEntry.k.l;
            NavDestination navDestination4 = navBackStackEntry.e;
            NavDestination navDestination5 = (NavDestination) CollectionsKt.F(arrayListZ);
            if (navDestination5 != null && navDestination5.e.e == navDestination4.e.e) {
                Lifecycle.State state2 = Lifecycle.State.h;
                if (state != state2) {
                    NavController.NavControllerNavigatorState navControllerNavigatorState = (NavController.NavControllerNavigatorState) this.u.get(this.t.b(navBackStackEntry.e.d));
                    if (Intrinsics.c((navControllerNavigatorState == null || (stateFlow = navControllerNavigatorState.f) == null || (set = (Set) stateFlow.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE) || ((atomicInt = (AtomicInt) this.l.get(navBackStackEntry)) != null && atomicInt.f3506a.get() == 0)) {
                        map.put(navBackStackEntry, Lifecycle.State.g);
                    } else {
                        map.put(navBackStackEntry, state2);
                    }
                }
                NavDestination navDestination6 = (NavDestination) CollectionsKt.F(arrayList);
                if (navDestination6 != null && navDestination6.e.e == navDestination4.e.e) {
                    CollectionsKt.h0(arrayList);
                }
                CollectionsKt.h0(arrayListZ);
                NavGraph navGraph = navDestination4.f;
                if (navGraph != null) {
                    arrayListZ.add(navGraph);
                }
            } else if (arrayList.isEmpty() || navDestination4.e.e != ((NavDestination) CollectionsKt.D(arrayList)).e.e) {
                navBackStackEntry.a(Lifecycle.State.f);
            } else {
                NavDestination navDestination7 = (NavDestination) CollectionsKt.h0(arrayList);
                if (state == Lifecycle.State.h) {
                    navBackStackEntry.a(Lifecycle.State.g);
                } else {
                    Lifecycle.State state3 = Lifecycle.State.g;
                    if (state != state3) {
                        map.put(navBackStackEntry, state3);
                    }
                }
                NavGraph navGraph2 = navDestination7.f;
                if (navGraph2 != null && !arrayList.contains(navGraph2)) {
                    arrayList.add(navGraph2);
                }
            }
        }
        Iterator it3 = arrayListJ0.iterator();
        while (it3.hasNext()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it3.next();
            Lifecycle.State state4 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state4 != null) {
                navBackStackEntry2.a(state4);
            } else {
                navBackStackEntry2.k.c();
            }
        }
    }
}

package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.internal.SynchronizedObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavigatorState;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class NavigatorState {

    /* renamed from: a, reason: collision with root package name */
    public final SynchronizedObject f3492a = new SynchronizedObject();
    public final MutableStateFlow b;
    public final MutableStateFlow c;
    public boolean d;
    public final StateFlow e;
    public final StateFlow f;

    public NavigatorState() {
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(EmptyList.d);
        this.b = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(EmptySet.d);
        this.c = mutableStateFlowA2;
        this.e = FlowKt.b(mutableStateFlowA);
        this.f = FlowKt.b(mutableStateFlowA2);
    }

    public abstract NavBackStackEntry a(NavDestination navDestination, Bundle bundle);

    public void b(NavBackStackEntry entry) {
        Intrinsics.h(entry, "entry");
        MutableStateFlow mutableStateFlow = this.c;
        mutableStateFlow.setValue(SetsKt.d((Set) mutableStateFlow.getValue(), entry));
    }

    public final void c(NavBackStackEntry navBackStackEntry) {
        int iNextIndex;
        synchronized (this.f3492a) {
            try {
                ArrayList arrayListJ0 = CollectionsKt.J0((Collection) this.e.getValue());
                ListIterator listIterator = arrayListJ0.listIterator(arrayListJ0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (Intrinsics.c(((NavBackStackEntry) listIterator.previous()).i, navBackStackEntry.i)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                arrayListJ0.set(iNextIndex, navBackStackEntry);
                this.b.setValue(arrayListJ0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(NavBackStackEntry navBackStackEntry, boolean z) {
        synchronized (this.f3492a) {
            try {
                MutableStateFlow mutableStateFlow = this.b;
                Iterable iterable = (Iterable) mutableStateFlow.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (Intrinsics.c((NavBackStackEntry) obj, navBackStackEntry)) {
                        break;
                    } else {
                        arrayList.add(obj);
                    }
                }
                mutableStateFlow.setValue(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(NavBackStackEntry navBackStackEntry, boolean z) {
        Object objPrevious;
        MutableStateFlow mutableStateFlow = this.c;
        Iterable iterable = (Iterable) mutableStateFlow.getValue();
        boolean z2 = iterable instanceof Collection;
        StateFlow stateFlow = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == navBackStackEntry) {
                    Iterable iterable2 = (Iterable) stateFlow.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                        }
                    }
                    return;
                }
            }
        }
        mutableStateFlow.setValue(SetsKt.h((Set) mutableStateFlow.getValue(), navBackStackEntry));
        List list = (List) stateFlow.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
            if (!Intrinsics.c(navBackStackEntry2, navBackStackEntry) && ((List) stateFlow.getValue()).lastIndexOf(navBackStackEntry2) < ((List) stateFlow.getValue()).lastIndexOf(navBackStackEntry)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry3 != null) {
            mutableStateFlow.setValue(SetsKt.h((Set) mutableStateFlow.getValue(), navBackStackEntry3));
        }
        d(navBackStackEntry, z);
    }

    public void f(NavBackStackEntry entry) {
        Intrinsics.h(entry, "entry");
        MutableStateFlow mutableStateFlow = this.c;
        mutableStateFlow.setValue(SetsKt.h((Set) mutableStateFlow.getValue(), entry));
    }

    public void g(NavBackStackEntry backStackEntry) {
        Intrinsics.h(backStackEntry, "backStackEntry");
        synchronized (this.f3492a) {
            MutableStateFlow mutableStateFlow = this.b;
            mutableStateFlow.setValue(CollectionsKt.d0(backStackEntry, (Collection) mutableStateFlow.getValue()));
        }
    }

    public final void h(NavBackStackEntry backStackEntry) {
        Intrinsics.h(backStackEntry, "backStackEntry");
        MutableStateFlow mutableStateFlow = this.c;
        Iterable iterable = (Iterable) mutableStateFlow.getValue();
        boolean z = iterable instanceof Collection;
        StateFlow stateFlow = this.e;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) stateFlow.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((NavBackStackEntry) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.P((List) stateFlow.getValue());
        if (navBackStackEntry != null) {
            mutableStateFlow.setValue(SetsKt.h((Set) mutableStateFlow.getValue(), navBackStackEntry));
        }
        mutableStateFlow.setValue(SetsKt.h((Set) mutableStateFlow.getValue(), backStackEntry));
        g(backStackEntry);
    }
}

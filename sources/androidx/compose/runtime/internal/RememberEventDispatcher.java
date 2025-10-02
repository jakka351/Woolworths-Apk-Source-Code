package androidx.compose.runtime.internal;

import androidx.collection.MutableIntList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RememberEventDispatcher implements RememberManager {

    /* renamed from: a, reason: collision with root package name */
    public final Set f1690a;
    public final MutableVector b;
    public MutableVector c;
    public final MutableVector d;
    public final MutableVector e;
    public MutableScatterSet f;
    public MutableScatterMap g;
    public final ArrayList h;
    public final MutableIntList i;
    public final MutableIntList j;
    public ArrayList k;

    public RememberEventDispatcher(Set set) {
        this.f1690a = set;
        MutableVector mutableVector = new MutableVector(new RememberObserverHolder[16], 0);
        this.b = mutableVector;
        this.c = mutableVector;
        this.d = new MutableVector(new Object[16], 0);
        this.e = new MutableVector(new Function0[16], 0);
        this.h = new ArrayList();
        this.i = new MutableIntList();
        this.j = new MutableIntList();
    }

    public final void a() {
        Set set = this.f1690a;
        if (set.isEmpty()) {
            return;
        }
        android.os.Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                RememberObserver rememberObserver = (RememberObserver) it.next();
                it.remove();
                rememberObserver.g();
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    public final void b() {
        c(Integer.MIN_VALUE);
        MutableVector mutableVector = this.d;
        int i = mutableVector.f;
        Set set = this.f1690a;
        if (i != 0) {
            android.os.Trace.beginSection("Compose:onForgotten");
            try {
                MutableScatterSet mutableScatterSet = this.f;
                int i2 = mutableVector.f;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = mutableVector.d[i2];
                    if (obj instanceof RememberObserverHolder) {
                        RememberObserver rememberObserver = ((RememberObserverHolder) obj).f1662a;
                        set.remove(rememberObserver);
                        rememberObserver.i();
                    }
                    if (obj instanceof ComposeNodeLifecycleCallback) {
                        if (mutableScatterSet == null || !mutableScatterSet.b(obj)) {
                            ((ComposeNodeLifecycleCallback) obj).c();
                        } else {
                            ((ComposeNodeLifecycleCallback) obj).a();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MutableVector mutableVector2 = this.b;
        if (mutableVector2.f != 0) {
            android.os.Trace.beginSection("Compose:onRemembered");
            try {
                Object[] objArr = mutableVector2.d;
                int i3 = mutableVector2.f;
                for (int i4 = 0; i4 < i3; i4++) {
                    RememberObserver rememberObserver2 = ((RememberObserverHolder) objArr[i4]).f1662a;
                    set.remove(rememberObserver2);
                    rememberObserver2.c();
                }
            } finally {
                android.os.Trace.endSection();
            }
        }
    }

    public final void c(int i) {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        int i2 = 0;
        ArrayList arrayListZ = null;
        int i3 = 0;
        MutableIntList mutableIntList = null;
        MutableIntList mutableIntList2 = null;
        while (true) {
            MutableIntList mutableIntList3 = this.j;
            if (i3 >= mutableIntList3.b) {
                break;
            }
            if (i <= mutableIntList3.a(i3)) {
                Object objRemove = arrayList.remove(i3);
                int iE = mutableIntList3.e(i3);
                int iE2 = this.i.e(i3);
                if (arrayListZ == null) {
                    arrayListZ = CollectionsKt.Z(objRemove);
                    mutableIntList2 = new MutableIntList();
                    mutableIntList2.c(iE);
                    mutableIntList = new MutableIntList();
                    mutableIntList.c(iE2);
                } else {
                    Intrinsics.f(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    Intrinsics.f(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayListZ.add(objRemove);
                    mutableIntList2.c(iE);
                    mutableIntList.c(iE2);
                }
            } else {
                i3++;
            }
        }
        if (arrayListZ != null) {
            Intrinsics.f(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            Intrinsics.f(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayListZ.size() - 1;
            while (i2 < size) {
                int i4 = i2 + 1;
                int size2 = arrayListZ.size();
                for (int i5 = i4; i5 < size2; i5++) {
                    int iA = mutableIntList2.a(i2);
                    int iA2 = mutableIntList2.a(i5);
                    if (iA < iA2 || (iA2 == iA && mutableIntList.a(i2) < mutableIntList.a(i5))) {
                        RememberEventDispatcherKt.a(i2, i5, arrayListZ);
                        RememberEventDispatcherKt.b(mutableIntList, i2, i5);
                        RememberEventDispatcherKt.b(mutableIntList2, i2, i5);
                    }
                }
                i2 = i4;
            }
            MutableVector mutableVector = this.d;
            mutableVector.e(mutableVector.f, arrayListZ);
        }
    }

    public final void d(int i, int i2, int i3, Object obj) {
        c(i);
        if (i3 < 0 || i3 >= i) {
            this.d.c(obj);
            return;
        }
        this.h.add(obj);
        this.i.c(i2);
        this.j.c(i3);
    }

    public final void e(RememberObserverHolder rememberObserverHolder) {
        this.c.c(rememberObserverHolder);
    }
}

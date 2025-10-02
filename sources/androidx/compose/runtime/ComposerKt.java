package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "message", "", "d", "(Ljava/lang/String;)Ljava/lang/Void;", "", "c", "(Ljava/lang/String;)V", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final OpaqueKey f1628a = new OpaqueKey("provider");
    public static final OpaqueKey b = new OpaqueKey("provider");
    public static final OpaqueKey c = new OpaqueKey("compositionLocalMap");
    public static final OpaqueKey d = new OpaqueKey("providers");
    public static final OpaqueKey e = new OpaqueKey("reference");
    public static final a f = new a();

    public static final void a(int i, int i2, ArrayList arrayList) {
        int iG = g(i, arrayList);
        if (iG < 0) {
            iG = -(iG + 1);
        }
        while (iG < arrayList.size() && ((Invalidation) arrayList.get(iG)).b < i2) {
            arrayList.remove(iG);
        }
    }

    public static final void b(SlotReader slotReader, ArrayList arrayList, int i) {
        boolean zJ = slotReader.j(i);
        int[] iArr = slotReader.b;
        if (zJ) {
            arrayList.add(slotReader.l(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            b(slotReader, arrayList, i3);
        }
    }

    public static final void c(@NotNull String str) {
        throw new ComposeRuntimeError(YU.a.h("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @NotNull
    public static final Void d(@NotNull String str) {
        throw new ComposeRuntimeError(YU.a.h("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void e(SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
        int iO;
        int[] iArr = slotWriter.b;
        int i = slotWriter.t;
        int iF = slotWriter.f(slotWriter.q(slotWriter.s(i) + i), iArr);
        for (int iF2 = slotWriter.f(slotWriter.q(slotWriter.t), slotWriter.b); iF2 < iF; iF2++) {
            Object obj = slotWriter.c[slotWriter.g(iF2)];
            int iC = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberEventDispatcher.d(slotWriter.o() - iF2, -1, -1, (ComposeNodeLifecycleCallback) obj);
            } else if (obj instanceof RememberObserverHolder) {
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                if (!(rememberObserverHolder.f1662a instanceof ReusableRememberObserver)) {
                    i(slotWriter, iF2, obj);
                    int iO2 = slotWriter.o() - iF2;
                    Anchor anchor = rememberObserverHolder.b;
                    if (anchor == null || !anchor.a()) {
                        iO = -1;
                    } else {
                        iC = slotWriter.c(anchor);
                        iO = slotWriter.o() - slotWriter.O(iC);
                    }
                    rememberEventDispatcher.d(iO2, iC, iO, rememberObserverHolder);
                }
            } else if (obj instanceof RecomposeScopeImpl) {
                i(slotWriter, iF2, obj);
                ((RecomposeScopeImpl) obj).d();
            }
        }
    }

    public static final MovableContentState f(final ControlledComposition controlledComposition, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter, Applier applier) {
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        SlotTable slotTable = new SlotTable();
        if (slotWriter.e != null) {
            slotTable.k();
        }
        if (slotWriter.f != null) {
            slotTable.n = new MutableIntObjectMap();
        }
        int i = slotWriter.t;
        if (applier != null && slotWriter.D(i) > 0) {
            int iE = slotWriter.v;
            while (iE > 0 && !slotWriter.w(iE)) {
                iE = slotWriter.E(iE, slotWriter.b);
            }
            if (iE >= 0 && slotWriter.w(iE)) {
                Object objC = slotWriter.C(iE);
                int i2 = iE + 1;
                int iS = slotWriter.s(iE) + iE;
                int iD = 0;
                while (i2 < iS) {
                    int iS2 = slotWriter.s(i2) + i2;
                    if (iS2 > i) {
                        break;
                    }
                    iD += slotWriter.w(i2) ? 1 : slotWriter.D(i2);
                    i2 = iS2;
                }
                int iD2 = slotWriter.w(i) ? 1 : slotWriter.D(i);
                applier.i(objC);
                applier.b(iD, iD2);
                applier.j();
            }
        }
        SlotWriter slotWriterM = slotTable.m();
        try {
            slotWriterM.d();
            slotWriterM.Q(movableContentStateReference.getF1647a(), 126665345, composer$Companion$Empty$1, false);
            SlotWriter.x(slotWriterM);
            slotWriterM.S(movableContentStateReference.getB());
            List listB = slotWriter.B(movableContentStateReference.getE(), slotWriterM);
            slotWriterM.K();
            slotWriterM.i();
            slotWriterM.j();
            slotWriterM.e(true);
            MovableContentState movableContentState = new MovableContentState(slotTable);
            List list = listB;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Anchor anchor = (Anchor) listB.get(i3);
                    if (slotTable.n(anchor)) {
                        int iJ = slotTable.j(anchor);
                        int iD3 = SlotTableKt.d(iJ, slotTable.d);
                        int i4 = iJ + 1;
                        if (((i4 < slotTable.e ? slotTable.d[(i4 * 5) + 4] : slotTable.f.length) - iD3 > 0 ? slotTable.f[iD3] : composer$Companion$Empty$1) instanceof RecomposeScopeImpl) {
                            RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1
                                @Override // androidx.compose.runtime.RecomposeScopeOwner
                                public final void a(Object obj) {
                                }

                                @Override // androidx.compose.runtime.RecomposeScopeOwner
                                public final void h() {
                                }

                                @Override // androidx.compose.runtime.RecomposeScopeOwner
                                public final InvalidationResult l(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
                                    InvalidationResult invalidationResultL;
                                    ControlledComposition controlledComposition2 = controlledComposition;
                                    RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                                    if (recomposeScopeOwner2 == null || (invalidationResultL = recomposeScopeOwner2.l(recomposeScopeImpl, obj)) == null) {
                                        invalidationResultL = InvalidationResult.d;
                                    }
                                    if (invalidationResultL != InvalidationResult.d) {
                                        return invalidationResultL;
                                    }
                                    MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                                    movableContentStateReference2.f = CollectionsKt.d0(new Pair(recomposeScopeImpl, obj), (Collection) movableContentStateReference2.f);
                                    return InvalidationResult.e;
                                }
                            };
                            slotWriterM = slotTable.m();
                            try {
                                RecomposeScopeImpl.Companion.a(slotWriterM, listB, recomposeScopeOwner);
                                slotWriterM.e(true);
                                return movableContentState;
                            } finally {
                            }
                        }
                    }
                }
            }
            return movableContentState;
        } finally {
        }
    }

    public static final int g(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iJ = Intrinsics.j(((Invalidation) list.get(i3)).b, i);
            if (iJ < 0) {
                i2 = i3 + 1;
            } else {
                if (iJ <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void h(SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
        int iO;
        int[] iArr = slotWriter.b;
        int i = slotWriter.t;
        int iF = slotWriter.f(slotWriter.q(slotWriter.s(i) + i), iArr);
        for (int iF2 = slotWriter.f(slotWriter.q(slotWriter.t), slotWriter.b); iF2 < iF; iF2++) {
            Object obj = slotWriter.c[slotWriter.g(iF2)];
            int iC = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                int iO2 = slotWriter.o() - iF2;
                Object obj2 = (ComposeNodeLifecycleCallback) obj;
                MutableScatterSet mutableScatterSet = rememberEventDispatcher.f;
                if (mutableScatterSet == null) {
                    int i2 = ScatterSetKt.f701a;
                    mutableScatterSet = new MutableScatterSet();
                    rememberEventDispatcher.f = mutableScatterSet;
                }
                mutableScatterSet.m(obj2);
                rememberEventDispatcher.d(iO2, -1, -1, obj2);
            }
            if (obj instanceof RememberObserverHolder) {
                int iO3 = slotWriter.o() - iF2;
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                Anchor anchor = rememberObserverHolder.b;
                if (anchor == null || !anchor.a()) {
                    iO = -1;
                } else {
                    iC = slotWriter.c(anchor);
                    iO = slotWriter.o() - slotWriter.O(iC);
                }
                rememberEventDispatcher.d(iO3, iC, iO, rememberObserverHolder);
            }
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).d();
            }
        }
        slotWriter.H();
    }

    public static final void i(SlotWriter slotWriter, int i, Object obj) {
        int iG = slotWriter.g(i);
        Object[] objArr = slotWriter.c;
        Object obj2 = objArr[iG];
        objArr[iG] = Composer.Companion.f1624a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}

package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {

    /* renamed from: a, reason: collision with root package name */
    public int f1656a;
    public RecomposeScopeOwner b;
    public Anchor c;
    public Function2 d;
    public int e;
    public MutableObjectIntMap f;
    public MutableScatterMap g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(SlotWriter slotWriter, List list, RecomposeScopeOwner recomposeScopeOwner) {
            List list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                int iC = slotWriter.c((Anchor) list.get(i));
                int iM = slotWriter.M(slotWriter.q(iC), slotWriter.b);
                Object obj = iM < slotWriter.f(slotWriter.q(iC + 1), slotWriter.b) ? slotWriter.c[slotWriter.g(iM)] : Composer.Companion.f1624a;
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.b = recomposeScopeOwner;
                }
            }
        }
    }

    public RecomposeScopeImpl(CompositionImpl compositionImpl) {
        this.b = compositionImpl;
    }

    public static boolean a(DerivedState derivedState, MutableScatterMap mutableScatterMap) {
        Intrinsics.f(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy snapshotMutationPolicyC = derivedState.getF();
        if (snapshotMutationPolicyC == null) {
            snapshotMutationPolicyC = StructuralEqualityPolicy.f1671a;
        }
        return !snapshotMutationPolicyC.a(derivedState.A().f, mutableScatterMap.e(derivedState));
    }

    public final boolean b() {
        if (this.b != null) {
            Anchor anchor = this.c;
            if (anchor != null ? anchor.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final InvalidationResult c(Object obj) {
        InvalidationResult invalidationResultL;
        RecomposeScopeOwner recomposeScopeOwner = this.b;
        return (recomposeScopeOwner == null || (invalidationResultL = recomposeScopeOwner.l(this, obj)) == null) ? InvalidationResult.d : invalidationResultL;
    }

    public final void d() {
        RecomposeScopeOwner recomposeScopeOwner = this.b;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.h();
        }
        this.b = null;
        this.f = null;
        this.g = null;
    }

    public final void e(boolean z) {
        if (z) {
            this.f1656a |= 32;
        } else {
            this.f1656a &= -33;
        }
    }

    public final void f() {
        this.f1656a |= 1;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public final void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.b;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.l(this, null);
        }
    }
}

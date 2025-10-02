package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/StructuralEqualityPolicy;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class StructuralEqualityPolicy implements SnapshotMutationPolicy<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final StructuralEqualityPolicy f1671a = new StructuralEqualityPolicy();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final boolean a(Object obj, Object obj2) {
        return Intrinsics.c(obj, obj2);
    }

    public final String toString() {
        return "StructuralEqualityPolicy";
    }
}

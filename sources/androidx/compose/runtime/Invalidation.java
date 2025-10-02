package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Invalidation;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Invalidation {

    /* renamed from: a, reason: collision with root package name */
    public final RecomposeScopeImpl f1640a;
    public final int b;
    public Object c;

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl, int i, Object obj) {
        this.f1640a = recomposeScopeImpl;
        this.b = i;
        this.c = obj;
    }
}

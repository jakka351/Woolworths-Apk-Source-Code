package me.oriient.internal.services.dataPriorityLoader;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import me.oriient.internal.infra.utils.core.Mapable;

/* loaded from: classes7.dex */
public final class n implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Mapable f25437a;
    public final double b;
    public final Flow c;
    public final MutableStateFlow d;

    public n(Mapable mapable, double d, Flow loader, MutableStateFlow state) {
        Intrinsics.h(loader, "loader");
        Intrinsics.h(state, "state");
        this.f25437a = mapable;
        this.b = d;
        this.c = loader;
        this.d = state;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n other = (n) obj;
        Intrinsics.h(other, "other");
        return Double.compare(other.b, this.b);
    }
}

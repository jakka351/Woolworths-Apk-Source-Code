package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OffsetApplier<N> implements Applier<N> {

    /* renamed from: a, reason: collision with root package name */
    public final Applier f1651a;
    public final int b;
    public int c;

    public OffsetApplier(Applier applier, int i) {
        this.f1651a = applier;
        this.b = i;
    }

    @Override // androidx.compose.runtime.Applier
    public final void b(int i, int i2) {
        this.f1651a.b(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // androidx.compose.runtime.Applier
    public final void e(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.f1651a.e(i + i4, i2 + i4, i3);
    }

    @Override // androidx.compose.runtime.Applier
    public final void f(int i, Object obj) {
        this.f1651a.f(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // androidx.compose.runtime.Applier
    /* renamed from: g */
    public final Object getC() {
        return this.f1651a.getC();
    }

    @Override // androidx.compose.runtime.Applier
    public final void h(int i, Object obj) {
        this.f1651a.h(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final void i(Object obj) {
        this.c++;
        this.f1651a.i(obj);
    }

    @Override // androidx.compose.runtime.Applier
    public final void j() {
        if (!(this.c > 0)) {
            ComposerKt.c("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.f1651a.j();
    }
}

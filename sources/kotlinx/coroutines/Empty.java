package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/Empty;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class Empty implements Incomplete {
    public final boolean d;

    public Empty(boolean z) {
        this.d = z;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: b */
    public final NodeList getD() {
        return null;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: isActive, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    public final String toString() {
        return androidx.camera.core.impl.b.r(new StringBuilder("Empty{"), this.d ? "Active" : "New", '}');
    }
}

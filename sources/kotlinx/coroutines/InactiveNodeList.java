package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/InactiveNodeList;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class InactiveNodeList implements Incomplete {
    public final NodeList d;

    public InactiveNodeList(NodeList nodeList) {
        this.d = nodeList;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: b, reason: from getter */
    public final NodeList getD() {
        return this.d;
    }

    @Override // kotlinx.coroutines.Incomplete
    public final boolean isActive() {
        return false;
    }
}

package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "it", "Landroidx/paging/AccessorState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RemoteMediatorAccessImpl$allowRefresh$1 extends Lambda implements Function1<AccessorState<Object, Object>, Unit> {
    public static final RemoteMediatorAccessImpl$allowRefresh$1 h = new RemoteMediatorAccessImpl$allowRefresh$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AccessorState it = (AccessorState) obj;
        Intrinsics.h(it, "it");
        it.f3521a = true;
        return Unit.f24250a;
    }
}

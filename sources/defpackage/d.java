package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class d implements FlowCollector {
    public final /* synthetic */ RemoteLogImpl d;

    public d(RemoteLogImpl remoteLogImpl) {
        this.d = remoteLogImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.d.metered = ((Boolean) obj).booleanValue();
        return Unit.f24250a;
    }
}

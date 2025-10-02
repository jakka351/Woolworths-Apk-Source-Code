package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class b implements FlowCollector {
    public final /* synthetic */ RemoteLogImpl d;

    public b(RemoteLogImpl remoteLogImpl) {
        this.d = remoteLogImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objTrySendingMessagesInternal;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        RemoteLogImpl remoteLogImpl = this.d;
        remoteLogImpl.connected = zBooleanValue;
        return (remoteLogImpl.connected && (objTrySendingMessagesInternal = remoteLogImpl.trySendingMessagesInternal(continuation)) == CoroutineSingletons.d) ? objTrySendingMessagesInternal : Unit.f24250a;
    }
}

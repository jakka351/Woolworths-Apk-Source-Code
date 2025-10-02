package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManagerImpl;
import me.oriient.positioningengine.common.PositioningUpdate;

/* renamed from: me.oriient.ipssdk.realtime.ofs.x1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1747x1 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DebugInfoManagerImpl f26172a;

    public C1747x1(DebugInfoManagerImpl debugInfoManagerImpl) {
        this.f26172a = debugInfoManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        DebugInfoManagerImpl.access$updatePDRClassification(this.f26172a, ((PositioningUpdate) obj).getPdrClassification());
        return Unit.f24250a;
    }
}

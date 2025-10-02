package me.oriient.positioningengine.support;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.systemStateManager.SystemStateUpdate;

/* loaded from: classes8.dex */
public final class D implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl f26498a;

    public D(OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl) {
        this.f26498a = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        SystemStateUpdate systemStateUpdate = (SystemStateUpdate) obj;
        Object objOnSystemStateChanged = this.f26498a.onSystemStateChanged(systemStateUpdate.getState(), systemStateUpdate.getCause(), continuation);
        return objOnSystemStateChanged == CoroutineSingletons.d ? objOnSystemStateChanged : Unit.f24250a;
    }
}

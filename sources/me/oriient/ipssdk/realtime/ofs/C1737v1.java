package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManagerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.v1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1737v1 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DebugInfoManagerImpl f26160a;

    public C1737v1(DebugInfoManagerImpl debugInfoManagerImpl) {
        this.f26160a = debugInfoManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f26160a.onNewUploaderItem((DataUploaderItem) obj);
        return Unit.f24250a;
    }
}

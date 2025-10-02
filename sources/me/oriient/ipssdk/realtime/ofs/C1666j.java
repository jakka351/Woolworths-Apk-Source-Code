package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1666j implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutomaticSessionStopperImpl f26090a;

    public C1666j(AutomaticSessionStopperImpl automaticSessionStopperImpl) {
        this.f26090a = automaticSessionStopperImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objAccess$stopPositioning;
        return (((Boolean) obj).booleanValue() && (objAccess$stopPositioning = AutomaticSessionStopperImpl.access$stopPositioning(this.f26090a, continuation)) == CoroutineSingletons.d) ? objAccess$stopPositioning : Unit.f24250a;
    }
}

package me.oriient.ipssdk.realtime.ofs;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;

/* renamed from: me.oriient.ipssdk.realtime.ofs.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1643f0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final C1643f0 f26069a = new C1643f0();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        ELog eLogAccess$getELog = CoreLogic.access$getELog(coreLogic);
        String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
        Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
        eLogAccess$getELog.d(strAccess$getTAG$p, "connectivity state changed", MapsKt.j(new Pair("isConnected", bool), new Pair("isConnectedMetered", CoreLogic.access$getNetworkManager(coreLogic).isConnectionMetered().getValue())));
        Iterator it = ExtensionsKt.copyOf(CoreLogic.I).iterator();
        while (it.hasNext()) {
            ((O2) it.next()).a(zBooleanValue);
        }
        return Unit.f24250a;
    }
}

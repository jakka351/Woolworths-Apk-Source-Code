package me.oriient.ipssdk.realtime.ofs;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.ipssdk.ips.IPSDataStatusObserver;
import me.oriient.ipssdk.realtime.ips.DataManager;

/* renamed from: me.oriient.ipssdk.realtime.ofs.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1674k1 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final C1674k1 f26098a = new C1674k1();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        DataPreloadingManager.PreloadingStatusUpdate preloadingStatusUpdate = (DataPreloadingManager.PreloadingStatusUpdate) obj;
        Iterator it = DataManager.f25825a.iterator();
        while (it.hasNext()) {
            ((IPSDataStatusObserver) it.next()).onDataStatusChanged(preloadingStatusUpdate.getBuildingId(), DataManager.access$toDataStatus(DataManager.INSTANCE, preloadingStatusUpdate.getStatus()));
        }
        return Unit.f24250a;
    }
}

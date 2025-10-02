package me.oriient.ipssdk.realtime.ofs;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.ipssdk.ips.IPSDataStatusObserver;
import me.oriient.ipssdk.realtime.ips.DataManager;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;

/* renamed from: me.oriient.ipssdk.realtime.ofs.o1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1698o1 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final C1698o1 f26120a = new C1698o1();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        DataPreloadingManager.PreloadingError preloadingError = (DataPreloadingManager.PreloadingError) obj;
        Iterator it = DataManager.f25825a.iterator();
        while (it.hasNext()) {
            ((IPSDataStatusObserver) it.next()).onDataPreparationFailed(preloadingError.getBuildingId(), ExtensionsKt.toIpsError(preloadingError.getError()));
        }
        return Unit.f24250a;
    }
}

package androidx.work.impl;

import androidx.work.Configuration;
import androidx.work.impl.model.WorkGenerationalId;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                List list = (List) obj4;
                WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj3;
                Configuration configuration = (Configuration) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                String str = Schedulers.f3930a;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Scheduler) it.next()).b(workGenerationalId.f3985a);
                }
                Schedulers.b(configuration, workDatabase, list);
                break;
            default:
                DefaultScheduler defaultScheduler = (DefaultScheduler) obj4;
                TransportContext transportContext = (TransportContext) obj3;
                TransportScheduleCallback transportScheduleCallback = (TransportScheduleCallback) obj2;
                EventInternal eventInternal = (EventInternal) obj;
                Logger logger = DefaultScheduler.f;
                try {
                    TransportBackend transportBackendB = defaultScheduler.c.b(transportContext.b());
                    if (transportBackendB == null) {
                        String str2 = "Transport backend '" + transportContext.b() + "' is not registered";
                        logger.warning(str2);
                        transportScheduleCallback.g(new IllegalArgumentException(str2));
                    } else {
                        defaultScheduler.e.d(new androidx.camera.core.processing.f(7, defaultScheduler, transportContext, transportBackendB.a(eventInternal)));
                        transportScheduleCallback.g(null);
                    }
                    break;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    transportScheduleCallback.g(e);
                    return;
                }
        }
    }
}

package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.SystemClock;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo
/* loaded from: classes.dex */
public class Schedulers {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3930a = Logger.g("Schedulers");

    public static void a(WorkSpecDao workSpecDao, SystemClock systemClock, List list) {
        if (list.size() > 0) {
            systemClock.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                workSpecDao.p(jCurrentTimeMillis, ((WorkSpec) it.next()).f3990a);
            }
        }
    }

    public static void b(Configuration configuration, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDaoZ = workDatabase.z();
        workDatabase.c();
        try {
            ArrayList arrayListL = workSpecDaoZ.l();
            a(workSpecDaoZ, configuration.d, arrayListL);
            ArrayList arrayListZ = workSpecDaoZ.z(configuration.k);
            a(workSpecDaoZ, configuration.d, arrayListZ);
            arrayListZ.addAll(arrayListL);
            ArrayList arrayListW = workSpecDaoZ.w();
            workDatabase.r();
            workDatabase.l();
            if (arrayListZ.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) arrayListZ.toArray(new WorkSpec[arrayListZ.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Scheduler scheduler = (Scheduler) it.next();
                    if (scheduler.a()) {
                        scheduler.c(workSpecArr);
                    }
                }
            }
            if (arrayListW.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) arrayListW.toArray(new WorkSpec[arrayListW.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Scheduler scheduler2 = (Scheduler) it2.next();
                    if (!scheduler2.a()) {
                        scheduler2.c(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.l();
            throw th;
        }
    }
}

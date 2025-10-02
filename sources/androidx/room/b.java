package androidx.room;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.background.greedy.TimeLimiter;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.perf.config.DeviceCacheManager;
import com.tealium.dispatcher.TealiumEvent;
import com.tealium.lifecycle.Lifecycle;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Runnable command = (Runnable) this.e;
                TransactionExecutor this$0 = (TransactionExecutor) this.f;
                Intrinsics.h(command, "$command");
                Intrinsics.h(this$0, "this$0");
                try {
                    command.run();
                    return;
                } finally {
                    this$0.a();
                }
            case 1:
                ((TimeLimiter) this.e).b.a((StartStopToken) this.f, 3);
                return;
            case 2:
                List list = (List) this.e;
                ConstraintTracker constraintTracker = (ConstraintTracker) this.f;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ConstraintListener) it.next()).a(constraintTracker.e);
                }
                return;
            case 3:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.e;
                JobParameters jobParameters = (JobParameters) this.f;
                int i = JobInfoSchedulerService.d;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 4:
                DeviceCacheManager deviceCacheManager = (DeviceCacheManager) this.e;
                Context context = (Context) this.f;
                if (deviceCacheManager.f15691a != null || context == null) {
                    return;
                }
                deviceCacheManager.f15691a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            default:
                Lifecycle lifecycle = (Lifecycle) this.e;
                Map map = (Map) this.f;
                long jCurrentTimeMillis = System.currentTimeMillis();
                com.tealium.lifecycle.b bVar = lifecycle.g;
                long j = bVar.f19192a.getLong("timestamp_last_wake", Long.MIN_VALUE);
                SharedPreferences sharedPreferences = bVar.f19192a;
                int i2 = (int) ((jCurrentTimeMillis - (j > Long.MIN_VALUE ? sharedPreferences.getLong("timestamp_last_wake", Long.MIN_VALUE) : Long.MIN_VALUE)) / 1000);
                sharedPreferences.edit().putInt("count_sleep", sharedPreferences.getInt("count_sleep", 0) + 1).apply();
                sharedPreferences.getInt("count_sleep", 0);
                sharedPreferences.edit().putInt("count_total_sleep", sharedPreferences.getInt("count_total_sleep", 0) + 1).apply();
                sharedPreferences.getInt("count_total_sleep", 0);
                sharedPreferences.edit().putInt("total_seconds_awake", sharedPreferences.getInt("total_seconds_awake", 0) + i2).apply();
                sharedPreferences.edit().putInt("prior_seconds_awake", sharedPreferences.getInt("prior_seconds_awake", 0) + i2).apply();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(map);
                bVar.a("sleep");
                linkedHashMap.put("lifecycle_type", "sleep");
                linkedHashMap.put("lifecycle_secondsawake", String.valueOf(i2));
                Date date = bVar.c;
                date.setTime(jCurrentTimeMillis);
                bVar.h = bVar.b.format(date);
                sharedPreferences.edit().putLong("timestamp_last_sleep", jCurrentTimeMillis).apply();
                lifecycle.f19190a.a(new TealiumEvent("sleep", linkedHashMap));
                return;
        }
    }
}

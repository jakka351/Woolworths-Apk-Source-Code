package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes2.dex */
public final class PlatformScheduler implements Scheduler {

    public static final class PlatformSchedulerService extends JobService {
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        @Override // android.app.job.JobService
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onStartJob(android.app.job.JobParameters r11) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.scheduler.PlatformScheduler.PlatformSchedulerService.onStartJob(android.app.job.JobParameters):boolean");
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        int i = Util.f2928a;
    }
}

package com.medallia.digital.mobilesdk;

import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.impl.utils.CancelWorkRunnable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class p4 {
    protected static final String b = "mediaData";
    protected static final String c = "mediaCaptureConfig";
    protected static final String d = "isPreviewsApp";
    public static final int e = 15;
    private static final String f = "MEDALLIA_NOTIFICATIONS_WORK";
    private static final String g = "MEDALLIA_NOTIFICATIONS_BACKGROUND_WORK";
    private static p4 h;

    /* renamed from: a, reason: collision with root package name */
    private OneTimeWorkRequest f16632a;

    public static p4 d() {
        if (h == null) {
            h = new p4();
        }
        return h;
    }

    public void a() {
        if (this.f16632a != null) {
            CancelWorkRunnable.b(WorkManager.Companion.a(i4.c().d()), this.f16632a.f3911a);
        }
    }

    public void b() {
        CancelWorkRunnable.d(WorkManager.Companion.a(i4.c().d()), f);
    }

    public void c() {
        a4.e("executeRetryMechanism worker");
        WorkManager.Companion.a(i4.c().b()).a((OneTimeWorkRequest) new OneTimeWorkRequest.Builder(RetryMechanismWorker.class).a());
    }

    public void e() {
        long minutes;
        if (this.f16632a == null) {
            try {
                minutes = t0.c().a().getSdkConfiguration().getMedalliaDigitalBrain().getAndroidBackoffDelay().longValue();
            } catch (Exception unused) {
                a4.b("using default value for repeatInterval");
                minutes = 0;
            }
            if (minutes < 15) {
                minutes = 15;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (minutes > timeUnit.toMinutes(18000000L)) {
                a4.b("repeatInterval exceeds maximum value, using MAX_BACKOFF_MILLIS");
                minutes = timeUnit.toMinutes(18000000L);
            }
            OneTimeWorkRequest.Builder builder = (OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(CheckBackgroundWorker.class).d(minutes, TimeUnit.MINUTES);
            builder.d.add(g);
            this.f16632a = (OneTimeWorkRequest) builder.a();
            WorkManager.Companion.a(i4.c().d()).a(this.f16632a);
        }
    }

    public void a(long j) {
        OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder(LocalNotificationWorker.class);
        builder.d.add(f);
        WorkManager.Companion.a(i4.c().d()).a((OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) builder.f(j, TimeUnit.SECONDS)).a());
    }

    public void a(e5 e5Var, b5 b5Var, Boolean bool) throws IOException {
        a4.e("executeSubmitMediaFeedback worker");
        Data.Builder builder = new Data.Builder();
        if (e5Var != null) {
            builder.d(b, e5Var.toJsonString());
        }
        if (b5Var != null) {
            builder.d(c, b5Var.i());
        }
        bool.getClass();
        builder.f3897a.put(d, bool);
        Data dataA = builder.a();
        OneTimeWorkRequest.Builder builder2 = new OneTimeWorkRequest.Builder(SubmitMediaFeedbackWorker.class);
        builder2.c.e = dataA;
        WorkManager.Companion.a(i4.c().b()).a((OneTimeWorkRequest) builder2.a());
    }
}

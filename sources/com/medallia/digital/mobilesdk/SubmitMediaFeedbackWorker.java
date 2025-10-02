package com.medallia.digital.mobilesdk;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.work.Data;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SubmitMediaFeedbackWorker extends Worker {
    private static final String e = "1002";

    /* renamed from: a, reason: collision with root package name */
    private final Context f16367a;
    private final ListenableWorker.Result[] b;
    private final CountDownLatch c;
    private final NotificationManager d;

    public class a implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Boolean f16368a;
        final /* synthetic */ z8 b;

        public a(Boolean bool, z8 z8Var) {
            this.f16368a = bool;
            this.b = z8Var;
        }

        private void a() {
            SubmitMediaFeedbackWorker.this.b[0] = ListenableWorker.Result.a();
            SubmitMediaFeedbackWorker.this.c.countDown();
            SubmitMediaFeedbackWorker.this.a(this.b);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.c("LivingLens Submit Media Feedback failed" + h4Var.getMessage());
            a();
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            a4.e("LivingLens Submit Media Feedback successfully sent ");
            if (!this.f16368a.booleanValue()) {
                Broadcasts.h.a(Broadcasts.h.a.submitFeedback);
            }
            a4.e(YU.a.A("LivingLens Media capture response: ", str));
            a();
        }
    }

    public SubmitMediaFeedbackWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.b = new ListenableWorker.Result[]{new ListenableWorker.Result.Retry()};
        this.c = new CountDownLatch(1);
        this.f16367a = context;
        this.d = (NotificationManager) context.getSystemService("notification");
    }

    @RequiresApi
    private void a() {
        NotificationChannel notificationChannel = new NotificationChannel(e, this.f16367a.getString(R.string.channel_name), 3);
        notificationChannel.setDescription(this.f16367a.getString(R.string.channel_desc));
        this.d.createNotificationChannel(notificationChannel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.medallia.digital.mobilesdk.b5] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.medallia.digital.mobilesdk.b5] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.medallia.digital.mobilesdk.s4] */
    public ListenableWorker.Result c() throws InterruptedException {
        e5 e5Var;
        ?? r1;
        Data inputData = getInputData();
        Boolean bool = Boolean.FALSE;
        if (inputData != null) {
            try {
                e5 e5Var2 = inputData.b("mediaData") != null ? new e5(new JSONObject(inputData.b("mediaData"))) : null;
                try {
                    b5Var = inputData.b("mediaCaptureConfig") != null ? new b5(new JSONObject(inputData.b("mediaCaptureConfig"))) : null;
                    Object obj = inputData.f3896a.get("isPreviewsApp");
                    if (!(obj instanceof Boolean)) {
                        obj = bool;
                    }
                    bool = (Boolean) obj;
                    r1 = b5Var;
                    b5Var = e5Var2;
                } catch (JSONException e2) {
                    e = e2;
                    e5Var = b5Var;
                    b5Var = e5Var2;
                    a4.c("LivingLens Error getting data from getInputData()" + e.getMessage());
                    r1 = e5Var;
                    z8 z8Var = new z8(b5Var.d(), getId().toString());
                    b(z8Var);
                    s4.f().a(b5Var, r1, bool, new a(bool, z8Var));
                    this.c.await();
                    a4.b("LivingLens Return from Submit Media Feedback Worker");
                    return this.b[0];
                }
            } catch (JSONException e3) {
                e = e3;
                e5Var = null;
            }
        } else {
            r1 = 0;
        }
        z8 z8Var2 = new z8(b5Var.d(), getId().toString());
        b(z8Var2);
        s4.f().a(b5Var, r1, bool, new a(bool, z8Var2));
        try {
            this.c.await();
        } catch (InterruptedException e4) {
            a4.c(e4.getMessage());
        }
        a4.b("LivingLens Return from Submit Media Feedback Worker");
        return this.b[0];
    }

    @Override // androidx.work.Worker
    @NonNull
    public ListenableWorker.Result doWork() {
        setForegroundAsync(b());
        return c();
    }

    public void a(z8 z8Var) {
        if (z8Var == null) {
            return;
        }
        a4.b("Worker Manager Data Delete from DB? " + f1.a().a(z8Var) + " " + z8Var.a());
    }

    public boolean b(z8 z8Var) {
        if (z8Var == null) {
            return false;
        }
        a4.b("Worker Manager Data Saved in DB: " + z8Var.a());
        return f1.a().c(z8Var);
    }

    @NonNull
    private ForegroundInfo b() {
        a();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.f16367a, e);
        Context context = this.f16367a;
        int i = R.string.upload_media_file;
        builder.e = NotificationCompat.Builder.c(context.getString(i));
        builder.r(this.f16367a.getString(i));
        builder.x.icon = R.drawable.ic_black;
        builder.k(2, false);
        builder.j = -2;
        return new ForegroundInfo(0, 0, builder.b());
    }
}

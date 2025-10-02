package com.medallia.digital.mobilesdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* loaded from: classes.dex */
public class RetryMechanismWorker extends Worker {
    private static final int d = 90;

    /* renamed from: a, reason: collision with root package name */
    private final Queue<e5> f16365a;
    private final CountDownLatch b;
    private final ListenableWorker.Result[] c;

    /* loaded from: classes6.dex */
    public class a implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e5 f16366a;

        public a(e5 e5Var) {
            this.f16366a = e5Var;
        }

        private void a(e5 e5Var) throws InterruptedException {
            RetryMechanismWorker.this.f16365a.remove(e5Var);
            if (!RetryMechanismWorker.this.f16365a.isEmpty()) {
                RetryMechanismWorker retryMechanismWorker = RetryMechanismWorker.this;
                retryMechanismWorker.a((e5) retryMechanismWorker.f16365a.poll());
            } else {
                Broadcasts.h.a(Broadcasts.h.a.submitFeedback);
                RetryMechanismWorker.this.a((e5) null);
                RetryMechanismWorker.this.c[0] = ListenableWorker.Result.a();
                RetryMechanismWorker.this.b.countDown();
            }
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws InterruptedException {
            a4.c("Stored Media feedback failed to submit. MediaFeedback UUID: " + this.f16366a.b());
            a(this.f16366a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) throws InterruptedException {
            a4.b("Stored Media feedback was submitted successfully. MediaFeedback UUID: " + this.f16366a.b());
            a(this.f16366a);
        }
    }

    public RetryMechanismWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f16365a = new LinkedList();
        this.b = new CountDownLatch(1);
        this.c = new ListenableWorker.Result[]{new ListenableWorker.Result.Retry()};
    }

    public ListenableWorker.Result a() throws JSONException, InterruptedException {
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.MediaFeedback, new Object[0]);
        ArrayList<? extends b0> arrayListC2 = f1.a().c(b0.a.WorkerManager, new Object[0]);
        if (arrayListC != null && !arrayListC.isEmpty()) {
            if (arrayListC2 != null && !arrayListC2.isEmpty()) {
                Iterator<? extends b0> it = arrayListC.iterator();
                while (it.hasNext()) {
                    e5 e5Var = (e5) it.next();
                    Iterator<? extends b0> it2 = arrayListC2.iterator();
                    while (it2.hasNext()) {
                        if (e5Var.d().equals(((z8) it2.next()).a())) {
                            a4.b("Removed Feedback: " + ((e5) arrayListC.get(0)).d());
                            arrayListC.remove(e5Var);
                            CancelWorkRunnable.b(WorkManager.Companion.a(i4.c().b()), getId());
                        }
                    }
                }
            }
            if (!arrayListC.isEmpty()) {
                a4.b("Loaded Feedback: " + ((e5) arrayListC.get(0)).d());
                AnalyticsBridge.getInstance().reportMediaFeedbackRetryMechanismEvent(arrayListC.size());
                this.f16365a.addAll(arrayListC);
                f1.a().a(b0.a.MediaFeedback, Long.valueOf(System.currentTimeMillis() - 7776000000L));
                return a(this.f16365a.poll());
            }
        }
        this.b.countDown();
        try {
            this.b.await();
        } catch (InterruptedException e) {
            a4.c(e.getMessage());
        }
        return ListenableWorker.Result.a();
    }

    @Override // androidx.work.Worker
    @NonNull
    public ListenableWorker.Result doWork() {
        return a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ListenableWorker.Result a(e5 e5Var) throws InterruptedException {
        if (e5Var == null) {
            this.c[0] = ListenableWorker.Result.a();
            return this.c[0];
        }
        f1.a().a(e5Var);
        e5Var.i();
        s4.f().a(e5Var, (b5) null, Boolean.FALSE, new a(e5Var));
        try {
            this.b.await();
        } catch (InterruptedException e) {
            a4.c(e.getMessage());
        }
        return this.c[0];
    }
}

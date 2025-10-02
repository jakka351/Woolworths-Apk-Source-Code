package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.medallia.digital.mobilesdk.l8;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
abstract class c extends Service {
    static final String h = com.salesforce.marketingcloud.g.a("JobIntentService");
    static final Object i = new Object();
    static final HashMap<ComponentName, h> j = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    b f16858a;
    h b;
    a c;
    boolean d;
    boolean e;
    boolean f;
    final ArrayList<d> g = null;

    @SuppressLint
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            e eVarA;
            try {
                com.salesforce.marketingcloud.g.a(c.h, "Starting to dequeue work...", new Object[0]);
                while (!isCancelled() && (eVarA = c.this.a()) != null) {
                    String str = c.h;
                    com.salesforce.marketingcloud.g.a(str, "Processing next work: %s", eVarA);
                    c.this.a(eVarA.b());
                    com.salesforce.marketingcloud.g.a(str, "Completing work: %s", eVarA);
                    eVarA.a();
                }
                com.salesforce.marketingcloud.g.a(c.h, "Done processing work!", new Object[0]);
                return null;
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(c.h, e, "Exception thrown by JobIntentService", new Object[0]);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            c.this.e();
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r1) {
            c.this.e();
        }
    }

    public interface b {
        e a();

        IBinder b();
    }

    /* renamed from: com.salesforce.marketingcloud.c$c, reason: collision with other inner class name */
    public static final class C0354c extends h {
        private final Context d;
        private final PowerManager.WakeLock e;
        private final PowerManager.WakeLock f;
        boolean g;
        boolean h;

        public C0354c(Context context, ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // com.salesforce.marketingcloud.c.h
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f16863a);
            com.salesforce.marketingcloud.g.a(c.h, "Starting service for work: %s", intent);
            if (this.d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.g) {
                            this.g = true;
                            if (!this.h) {
                                this.e.acquire(l8.b.b);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.salesforce.marketingcloud.c.h
        public void b() {
            synchronized (this) {
                try {
                    if (!this.h) {
                        this.h = true;
                        this.f.acquire(600000L);
                        this.e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.salesforce.marketingcloud.c.h
        public void c() {
            synchronized (this) {
                this.g = false;
            }
        }

        @Override // com.salesforce.marketingcloud.c.h
        public void a() {
            synchronized (this) {
                try {
                    if (this.h) {
                        if (this.g) {
                            this.e.acquire(l8.b.b);
                        }
                        this.h = false;
                        this.f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        final Intent f16860a;
        final int b;

        public d(Intent intent, int i) {
            this.f16860a = intent;
            this.b = i;
        }

        @Override // com.salesforce.marketingcloud.c.e
        public void a() {
            com.salesforce.marketingcloud.g.a(c.h, "Stopping self: #%d", Integer.valueOf(this.b));
            c.this.stopSelf(this.b);
        }

        @Override // com.salesforce.marketingcloud.c.e
        public Intent b() {
            return this.f16860a;
        }
    }

    public interface e {
        void a();

        Intent b();
    }

    @RequiresApi
    public static final class f extends JobServiceEngine implements b {
        static final String d = com.salesforce.marketingcloud.g.a("JobServiceEngineImpl");

        /* renamed from: a, reason: collision with root package name */
        final c f16861a;
        final Object b;
        JobParameters c;

        public final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            final JobWorkItem f16862a;

            public a(JobWorkItem jobWorkItem) {
                this.f16862a = jobWorkItem;
            }

            @Override // com.salesforce.marketingcloud.c.e
            public void a() {
                synchronized (f.this.b) {
                    try {
                        JobParameters jobParameters = f.this.c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f16862a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.salesforce.marketingcloud.c.e
            public Intent b() {
                return this.f16862a.getIntent();
            }
        }

        public f(c cVar) {
            super(cVar);
            this.b = new Object();
            this.f16861a = cVar;
        }

        @Override // com.salesforce.marketingcloud.c.b
        public e a() {
            synchronized (this.b) {
                try {
                    JobParameters jobParameters = this.c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f16861a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.salesforce.marketingcloud.c.b
        public IBinder b() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            com.salesforce.marketingcloud.g.a(d, "onStartJob: %s", jobParameters);
            this.c = jobParameters;
            this.f16861a.a(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            com.salesforce.marketingcloud.g.a(d, "onStartJob: %s", jobParameters);
            boolean zB = this.f16861a.b();
            synchronized (this.b) {
                this.c = null;
            }
            return zB;
        }
    }

    @RequiresApi
    public static final class g extends h {
        private final JobInfo d;
        private final JobScheduler e;

        public g(Context context, ComponentName componentName, int i) {
            super(componentName);
            a(i);
            this.d = new JobInfo.Builder(i, this.f16863a).setOverrideDeadline(0L).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // com.salesforce.marketingcloud.c.h
        public void a(Intent intent) {
            com.salesforce.marketingcloud.g.a(c.h, "Enqueueing work: %s", intent);
            try {
                this.e.enqueue(this.d, new JobWorkItem(intent));
            } catch (Exception e) {
                com.salesforce.marketingcloud.g.b(c.h, e, "Unable to enqueue %s for work %s", Integer.valueOf(this.c), intent);
            }
        }
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f16863a;
        boolean b;
        int c;

        public h(ComponentName componentName) {
            this.f16863a = componentName;
        }

        public void a() {
        }

        public abstract void a(Intent intent);

        public void b() {
        }

        public void c() {
        }

        public void a(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else {
                if (this.c == i) {
                    return;
                }
                StringBuilder sbR = YU.a.r(i, "Given job ID ", " is different than previous ");
                sbR.append(this.c);
                throw new IllegalArgumentException(sbR.toString());
            }
        }
    }

    public e a() {
        b bVar = this.f16858a;
        if (bVar != null) {
            return bVar.a();
        }
        synchronized (this.g) {
            try {
                if (this.g.size() <= 0) {
                    return null;
                }
                return this.g.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a(@NonNull Intent intent);

    public boolean b() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.cancel(this.d);
        }
        this.e = true;
        return d();
    }

    public boolean c() {
        return this.e;
    }

    public boolean d() {
        return true;
    }

    public void e() {
        ArrayList<d> arrayList = this.g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.c = null;
                    ArrayList<d> arrayList2 = this.g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f) {
                        this.b.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        b bVar = this.f16858a;
        if (bVar == null) {
            return null;
        }
        IBinder iBinderB = bVar.b();
        com.salesforce.marketingcloud.g.a(h, "Returning engine: %s", iBinderB);
        return iBinderB;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.salesforce.marketingcloud.g.a(h, "CREATING: %s", this);
        this.f16858a = new f(this);
        this.b = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        ArrayList<d> arrayList = this.g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f = true;
                this.b.a();
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i2, int i3) {
        if (this.g == null) {
            com.salesforce.marketingcloud.g.a(h, "Ignoring start command: %s", intent);
            return 2;
        }
        this.b.c();
        com.salesforce.marketingcloud.g.a(h, "Received compat start command #%d: %s", Integer.valueOf(i3), intent);
        synchronized (this.g) {
            ArrayList<d> arrayList = this.g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i3));
            a(true);
        }
        return 3;
    }

    public static void a(@NonNull Context context, @NonNull ComponentName componentName, int i2, @NonNull Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (i) {
            h hVarA = a(context, componentName, true, i2);
            hVarA.a(i2);
            hVarA.a(intent);
        }
    }

    public void b(boolean z) {
        this.d = z;
    }

    public static void a(@NonNull Context context, @NonNull Class cls, int i2, @NonNull Intent intent) {
        a(context, new ComponentName(context, (Class<?>) cls), i2, intent);
    }

    public void a(boolean z) {
        if (this.c == null) {
            this.c = new a();
            h hVar = this.b;
            if (hVar != null && z) {
                hVar.b();
            }
            com.salesforce.marketingcloud.g.a(h, "Starting processor: %s", this.c);
            this.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public static h a(Context context, ComponentName componentName, boolean z, int i2) {
        HashMap<ComponentName, h> map = j;
        h hVar = map.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (!z) {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        g gVar = new g(context, componentName, i2);
        map.put(componentName, gVar);
        return gVar;
    }
}

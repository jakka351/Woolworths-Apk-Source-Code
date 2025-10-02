package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class zzt {
    public static final HashMap n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f14763a;
    public final zzi b;
    public boolean g;
    public final Intent h;
    public ServiceConnection l;
    public zzf m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final zzk j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.review.internal.zzk
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzt zztVar = this.f14762a;
            zztVar.b.a("reportBinderDeath", new Object[0]);
            zzo zzoVar = (zzo) zztVar.i.get();
            if (zzoVar != null) {
                zztVar.b.a("calling onBinderDied", new Object[0]);
                zzoVar.zza();
            } else {
                zztVar.b.a("%s : Binder has died.", zztVar.c);
                Iterator it = zztVar.d.iterator();
                while (it.hasNext()) {
                    zzj zzjVar = (zzj) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(zztVar.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = zzjVar.d;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                zztVar.d.clear();
            }
            synchronized (zztVar.f) {
                zztVar.e();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.core.review.internal.zzk] */
    public zzt(Context context, zzi zziVar, Intent intent) {
        this.f14763a = context;
        this.b = zziVar;
        this.h = intent;
    }

    public static void b(zzt zztVar, zzj zzjVar) {
        zzf zzfVar = zztVar.m;
        zzi zziVar = zztVar.b;
        ArrayList arrayList = zztVar.d;
        if (zzfVar != null || zztVar.g) {
            if (!zztVar.g) {
                zzjVar.run();
                return;
            } else {
                zziVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(zzjVar);
                return;
            }
        }
        zziVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(zzjVar);
        zzr zzrVar = new zzr(zztVar);
        zztVar.l = zzrVar;
        zztVar.g = true;
        if (zztVar.f14763a.bindService(zztVar.h, zzrVar, 1)) {
            return;
        }
        zziVar.a("Failed to bind to the service.", new Object[0]);
        zztVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzj zzjVar2 = (zzj) it.next();
            zzu zzuVar = new zzu("Failed to bind to the service.");
            TaskCompletionSource taskCompletionSource = zzjVar2.d;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(zzuVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(zzj zzjVar, TaskCompletionSource taskCompletionSource) {
        a().post(new zzm(this, zzjVar.d, taskCompletionSource, zzjVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new zzn(this));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}

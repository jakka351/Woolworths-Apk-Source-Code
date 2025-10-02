package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class ae {
    public static final HashMap o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f14769a;
    public final s b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final z i;
    public ServiceConnection m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final u k = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ae aeVar = this.f14777a;
            aeVar.b.b("reportBinderDeath", new Object[0]);
            y yVar = (y) aeVar.j.get();
            if (yVar != null) {
                aeVar.b.b("calling onBinderDied", new Object[0]);
                yVar.a();
            } else {
                aeVar.b.b("%s : Binder has died.", aeVar.c);
                Iterator it = aeVar.d.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).a(new RemoteException(String.valueOf(aeVar.c).concat(" : Binder has died.")));
                }
                aeVar.d.clear();
            }
            synchronized (aeVar.f) {
                aeVar.e();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.play.integrity.internal.u] */
    public ae(Context context, s sVar, String str, Intent intent, z zVar) {
        this.f14769a = context;
        this.b = sVar;
        this.c = str;
        this.h = intent;
        this.i = zVar;
    }

    public static void b(ae aeVar, t tVar) {
        IInterface iInterface = aeVar.n;
        s sVar = aeVar.b;
        ArrayList arrayList = aeVar.d;
        if (iInterface != null || aeVar.g) {
            if (!aeVar.g) {
                tVar.run();
                return;
            } else {
                sVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(tVar);
                return;
            }
        }
        sVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(tVar);
        ad adVar = new ad(aeVar);
        aeVar.m = adVar;
        aeVar.g = true;
        if (aeVar.f14769a.bindService(aeVar.h, adVar, 1)) {
            return;
        }
        sVar.b("Failed to bind to the service.", new Object[0]);
        aeVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(new af("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
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

    public final void c(t tVar, TaskCompletionSource taskCompletionSource) {
        a().post(new w(this, tVar.c(), taskCompletionSource, tVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new x(this));
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

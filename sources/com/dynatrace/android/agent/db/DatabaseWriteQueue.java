package com.dynatrace.android.agent.db;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class DatabaseWriteQueue extends Thread {
    public static final String e;
    public static volatile DatabaseWriteQueue f;
    public static final AtomicBoolean g;
    public LinkedBlockingQueue d;

    public static class DatabaseRecord {

        /* renamed from: a, reason: collision with root package name */
        public String f14115a;
        public String b;
        public Session c;
        public int d;
        public long e;
        public int f;
        public String g;
    }

    static {
        boolean z = Global.f14077a;
        e = "dtxDatabaseWriteQueue";
        g = new AtomicBoolean(false);
    }

    public static DatabaseWriteQueue b() {
        if (f == null) {
            synchronized (DatabaseWriteQueue.class) {
                try {
                    if (f == null) {
                        DatabaseWriteQueue databaseWriteQueue = new DatabaseWriteQueue();
                        databaseWriteQueue.d = new LinkedBlockingQueue();
                        databaseWriteQueue.setName(e);
                        f = databaseWriteQueue;
                    }
                } finally {
                }
            }
        }
        return f;
    }

    public final synchronized void a() {
        try {
            LinkedList linkedList = new LinkedList();
            DatabaseRecord databaseRecord = (DatabaseRecord) this.d.poll();
            while (databaseRecord != null) {
                linkedList.add(databaseRecord);
                databaseRecord = (DatabaseRecord) this.d.poll();
            }
            if (!linkedList.isEmpty()) {
                Core.g.e(linkedList, AdkSettings.l.g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() throws InterruptedException {
        g.set(false);
        synchronized (DatabaseWriteQueue.class) {
            f = null;
        }
        if (isAlive()) {
            try {
                join(1000L);
            } catch (InterruptedException e2) {
                if (Global.f14077a) {
                    Utility.i(e, e2.toString());
                }
            }
            if (isAlive() && Global.f14077a) {
                Utility.h(e, "could not stop thread " + getName());
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z = Global.f14077a;
        String str = e;
        if (z) {
            Utility.h(str, "Database write queue running ...");
        }
        while (g.get()) {
            try {
                Thread.sleep(250L);
                a();
            } catch (Exception e2) {
                if (Global.f14077a) {
                    Utility.j(str, e2.toString(), e2);
                    return;
                }
                return;
            }
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        AtomicBoolean atomicBoolean = g;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        super.start();
    }
}

package com.dynatrace.android.agent;

import android.content.SharedPreferences;
import android.net.NetworkInfo;
import androidx.camera.core.impl.b;
import com.dynatrace.android.agent.comm.HttpResponse;
import com.dynatrace.android.agent.comm.InvalidResponseException;
import com.dynatrace.android.agent.comm.MonitoringDataPacket;
import com.dynatrace.android.agent.comm.RequestExecutor;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.conf.PreferencesManager;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationManager;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.db.DataAccessObject;
import com.dynatrace.android.agent.db.DatabaseWriteQueue;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.util.Utility;
import java.io.File;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes.dex */
public class CommunicationManager {
    public static final String t;

    /* renamed from: a, reason: collision with root package name */
    public DataAccessObject f14066a;
    public RequestExecutor b;
    public Thread j;
    public Timer k;
    public ConnectionAttemptMonitor l;
    public final CalloutTable o;
    public final TimeLineProvider c = TimeLineProvider.b;
    public final Object e = new Object();
    public final Object f = new Object();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);
    public boolean m = false;
    public long n = 0;
    public AgentStateListener p = null;
    public CommunicationManagerBridge q = null;
    public boolean r = false;
    public volatile boolean s = true;
    public final WriteLock d = new WriteLock();

    /* renamed from: com.dynatrace.android.agent.CommunicationManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14067a;

        static {
            int[] iArr = new int[SendState.values().length];
            f14067a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14067a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14067a[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14067a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class DataSendTimerTask extends TimerTask {
        public DataSendTimerTask() {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x005a A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x019e A[Catch: all -> 0x0165, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x0165, blocks: (B:76:0x0153, B:78:0x015b, B:81:0x0163, B:85:0x0167, B:87:0x016f, B:89:0x0180, B:91:0x018d, B:93:0x019b, B:95:0x019e), top: B:123:0x0153 }] */
        @Override // java.util.TimerTask, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 540
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.CommunicationManager.DataSendTimerTask.run():void");
        }
    }

    public class EventSenderThread extends Thread {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventSenderThread() {
            super("dtxEventSenderThread");
            boolean z = Global.f14077a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws Throwable {
            boolean z;
            CommunicationManager.this.m = true;
            do {
                try {
                    synchronized (this) {
                        try {
                            if (!CommunicationManager.this.m) {
                                return;
                            }
                            wait();
                            CommunicationManager communicationManager = CommunicationManager.this;
                            z = communicationManager.m;
                            NetworkInfo networkInfoB = AndroidMetrics.a().b();
                            boolean z2 = networkInfoB != null && (networkInfoB.isAvailable() || networkInfoB.isConnected());
                            if (!z2 && Global.f14077a) {
                                Utility.k(AndroidMetrics.u, "Network connection is not available");
                            }
                            CommunicationManager.a(communicationManager, z2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    if (Global.f14077a) {
                        Utility.g(e, CommunicationManager.t, e.getMessage());
                        return;
                    }
                    return;
                }
            } while (z);
        }
    }

    /* loaded from: classes4.dex */
    public class PostCrashReportThread extends Thread {
        public final ServerConfiguration d;
        public final MonitoringDataPacket e;
        public final int f;
        public final boolean g;
        public final long h;
        public final long i;
        public boolean j = false;

        public PostCrashReportThread(ServerConfiguration serverConfiguration, MonitoringDataPacket monitoringDataPacket, int i, boolean z, long j, long j2) {
            setName("POST CrashReport");
            this.d = serverConfiguration;
            this.e = monitoringDataPacket;
            this.f = i;
            this.g = z;
            this.h = j;
            this.i = j2;
        }

        public static boolean a(PostCrashReportThread postCrashReportThread) {
            return postCrashReportThread.j;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            String str = CommunicationManager.t;
            this.j = CommunicationManager.this.e(this.d, this.e, this.f, this.g, this.h, this.i, false);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SendState {
        public static final SendState d;
        public static final SendState e;
        public static final SendState f;
        public static final SendState g;
        public static final /* synthetic */ SendState[] h;

        static {
            SendState sendState = new SendState("NO_DATA", 0);
            d = sendState;
            SendState sendState2 = new SendState("DATA_NOT_SENT", 1);
            e = sendState2;
            SendState sendState3 = new SendState("MORE_DATA_AVAILABLE", 2);
            f = sendState3;
            SendState sendState4 = new SendState("FINISHED", 3);
            g = sendState4;
            h = new SendState[]{sendState, sendState2, sendState3, sendState4};
        }

        public static SendState valueOf(String str) {
            return (SendState) Enum.valueOf(SendState.class, str);
        }

        public static SendState[] values() {
            return (SendState[]) h.clone();
        }
    }

    public class WriteLock {

        /* renamed from: a, reason: collision with root package name */
        public File f14068a;

        public WriteLock() {
        }
    }

    static {
        boolean z = Global.f14077a;
        t = "dtxCommunicationManager";
    }

    public CommunicationManager(CalloutTable calloutTable) {
        this.o = calloutTable;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b5 A[PHI: r0 r3 r14
  0x01b5: PHI (r0v22 com.dynatrace.android.agent.CommunicationManager$SendState) = 
  (r0v21 com.dynatrace.android.agent.CommunicationManager$SendState)
  (r0v23 com.dynatrace.android.agent.CommunicationManager$SendState)
 binds: [B:102:0x01f0, B:88:0x01b3] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r3v5 java.io.File) = (r3v2 java.io.File), (r3v6 java.io.File) binds: [B:102:0x01f0, B:88:0x01b3] A[DONT_GENERATE, DONT_INLINE]
  0x01b5: PHI (r14v18 com.dynatrace.android.agent.CommunicationManager$WriteLock) = 
  (r14v15 com.dynatrace.android.agent.CommunicationManager$WriteLock)
  (r14v20 com.dynatrace.android.agent.CommunicationManager$WriteLock)
 binds: [B:102:0x01f0, B:88:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.dynatrace.android.agent.CommunicationManager r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.CommunicationManager.a(com.dynatrace.android.agent.CommunicationManager, boolean):void");
    }

    public final void b(ServerConfiguration serverConfiguration, Session session) throws NumberFormatException {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        String str = t;
        this.f14066a.a(this.c.a(), serverConfiguration.a());
        boolean zG = true;
        try {
            boolean z = !session.g();
            RequestExecutor requestExecutor = this.b;
            int i = AdkSettings.l.c;
            requestExecutor.getClass();
            c(requestExecutor.a(serverConfiguration, z, null, i, session.b, session.c, false), session);
            if (this.k != null && (connectionAttemptMonitor = this.l) != null) {
                connectionAttemptMonitor.c(true, false);
            }
            zG = Session.a().g();
        } catch (Exception e) {
            if (Global.f14077a) {
                if (e instanceof UnknownHostException) {
                    Utility.h(str, "beacon request failed");
                    Utility.h(str, e.toString());
                } else {
                    Utility.g(e, str, "beacon request failed");
                }
            }
            d(e);
        }
        AtomicBoolean atomicBoolean = this.g;
        if (zG) {
            atomicBoolean.set(false);
        }
        if (Global.f14077a) {
            Utility.h(str, "UEM state update: UEM state: " + this.i.get() + " mForceUemUpdate: " + atomicBoolean.get());
        }
    }

    public final void c(ServerConfiguration serverConfiguration, Session session) {
        synchronized (this.e) {
            try {
                AdkSettings adkSettings = AdkSettings.l;
                ServerConfiguration serverConfiguration2 = adkSettings.g;
                if (serverConfiguration.o < serverConfiguration2.o) {
                    if (Global.f14077a) {
                        Utility.h(t, "Discard too old configuration");
                    }
                    return;
                }
                boolean z = false;
                this.i.set(serverConfiguration.g == 1);
                if (serverConfiguration.n != ServerConfiguration.Status.e) {
                    SharedPreferences.Editor editorEdit = adkSettings.d.f14093a.edit();
                    try {
                        editorEdit.putString("ServerConfig", ServerConfigurationManager.d(serverConfiguration));
                    } catch (JSONException e) {
                        if (Global.f14077a) {
                            Utility.g(e, PreferencesManager.c, "unable to generate configuration");
                        }
                        editorEdit.remove("ServerConfig");
                    }
                    editorEdit.apply();
                } else if (Global.f14077a) {
                    Utility.h(t, "Received faulty settings that will turn the agent off");
                }
                Core.b(serverConfiguration);
                boolean z2 = serverConfiguration.o > serverConfiguration2.o;
                CommunicationManagerBridge communicationManagerBridge = this.q;
                if (communicationManagerBridge != null) {
                    communicationManagerBridge.b();
                }
                AgentStateListener agentStateListener = this.p;
                if (agentStateListener != null) {
                    if (z2) {
                        agentStateListener.c();
                    }
                    if (serverConfiguration.m) {
                        this.p.b();
                    }
                }
                if (session == null || session.g()) {
                    return;
                }
                synchronized (this.f) {
                    try {
                        if (!session.g()) {
                            session.e(serverConfiguration);
                            z = true;
                        }
                    } finally {
                    }
                }
                if (z) {
                    AgentStateListener agentStateListener2 = this.p;
                    if (agentStateListener2 != null) {
                        agentStateListener2.d();
                    }
                    if (session.f()) {
                        if (Global.f14077a) {
                            Utility.h(t, "updateSessionPropertiesForEvents");
                        }
                        DatabaseWriteQueue.b().a();
                        DataAccessObject dataAccessObject = this.f14066a;
                        synchronized (dataAccessObject) {
                            try {
                                dataAccessObject.b.f(session);
                            } catch (Exception e2) {
                                if (Global.f14077a) {
                                    Utility.j(DataAccessObject.c, "can't update multiplicity", e2);
                                }
                            }
                        }
                    } else {
                        DataAccessObject dataAccessObject2 = this.f14066a;
                        long j = session.b;
                        long j2 = session.c;
                        synchronized (dataAccessObject2) {
                            try {
                                dataAccessObject2.b.getWritableDatabase().delete("Events", "visitor_id= ? AND session_id= ?", new String[]{String.valueOf(j), String.valueOf(j2)});
                            } catch (Exception e3) {
                                if (Global.f14077a) {
                                    Utility.g(e3, DataAccessObject.c, "Database error.");
                                }
                            }
                        }
                    }
                    AdkSettings.l.getClass();
                }
            } finally {
            }
        }
    }

    public final void d(Exception exc) throws NumberFormatException {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        List list;
        if (exc instanceof InvalidResponseException) {
            HttpResponse httpResponseA = ((InvalidResponseException) exc).a();
            if (httpResponseA.f14086a == 429 && (list = (List) httpResponseA.d.get("Retry-After")) != null && !list.isEmpty()) {
                try {
                    int i = Integer.parseInt((String) list.get(0));
                    this.i.set(false);
                    DatabaseWriteQueue.b().a();
                    DataAccessObject dataAccessObject = Core.g;
                    dataAccessObject.getClass();
                    try {
                        dataAccessObject.b.getWritableDatabase().delete("Events", null, null);
                    } catch (Exception e) {
                        if (Global.f14077a) {
                            Utility.j(DataAccessObject.c, "Database error.", e);
                        }
                    }
                    ConnectionAttemptMonitor connectionAttemptMonitor2 = this.l;
                    if (connectionAttemptMonitor2 != null) {
                        connectionAttemptMonitor2.d(i);
                        return;
                    }
                } catch (NumberFormatException e2) {
                    if (Global.f14077a) {
                        Utility.j(t, "can't parse Retry-After header", e2);
                    }
                }
            }
        }
        this.i.set(false);
        if (this.k == null || (connectionAttemptMonitor = this.l) == null) {
            return;
        }
        connectionAttemptMonitor.c(false, false);
    }

    public final boolean e(ServerConfiguration serverConfiguration, MonitoringDataPacket monitoringDataPacket, int i, boolean z, long j, long j2, boolean z2) throws NumberFormatException {
        boolean zA;
        ConnectionAttemptMonitor connectionAttemptMonitor;
        try {
            AdkSettings adkSettings = AdkSettings.l;
            AtomicBoolean atomicBoolean = adkSettings.b;
            AtomicBoolean atomicBoolean2 = adkSettings.f14062a;
            if (atomicBoolean.get() || atomicBoolean2.get() || !z) {
                zA = false;
            } else {
                zA = BasicSegment.a(monitoringDataPacket);
                if (zA) {
                    try {
                        atomicBoolean2.set(true);
                    } catch (Exception e) {
                        e = e;
                        if (zA) {
                            AdkSettings.l.f14062a.set(false);
                        }
                        if (Global.f14077a) {
                            boolean z3 = e instanceof UnknownHostException;
                            String str = t;
                            if (z3) {
                                Utility.h(str, "data request failed");
                                Utility.h(str, e.toString());
                            } else {
                                Utility.g(e, str, "data request failed");
                            }
                        }
                        d(e);
                        return false;
                    }
                }
            }
            RequestExecutor requestExecutor = this.b;
            StringBuilder sb = new StringBuilder(monitoringDataPacket.f14087a);
            Iterator it = monitoringDataPacket.b.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                sb.append("&");
                sb.append(str2);
            }
            ServerConfiguration serverConfigurationA = requestExecutor.a(serverConfiguration, false, sb.toString(), i, j, j2, z2);
            if (zA) {
                AdkSettings adkSettings2 = AdkSettings.l;
                adkSettings2.a(true);
                adkSettings2.f14062a.set(false);
            }
            c(serverConfigurationA, null);
            if (this.k != null && (connectionAttemptMonitor = this.l) != null) {
                connectionAttemptMonitor.c(true, false);
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            zA = false;
        }
    }

    public final void f(long j) throws InterruptedException {
        this.i.set(false);
        Thread thread = this.j;
        if (Global.f14077a) {
            String str = t;
            long id = thread.getId();
            StringBuilder sbT = b.t(j, "Shutdown allocated time: ", " ms threadId=");
            sbT.append(id);
            Utility.h(str, sbT.toString());
        }
        long jA = this.c.a();
        synchronized (thread) {
            try {
                if (!this.s) {
                    this.h.set(true);
                } else if (Global.f14077a) {
                    Utility.h(t, "Cannot force flush while still waiting for BPv4 configuration");
                }
                this.m = false;
                thread.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (thread.isAlive()) {
            try {
                thread.join(j);
            } catch (InterruptedException e) {
                if (Global.f14077a) {
                    Utility.j(t, b.l(j, "Thread to send final events Interrupted, allotted time: ", " ms"), e);
                }
            }
            if (thread.isAlive() && Global.f14077a) {
                Utility.i(t, "Thread to send final events didn't complete in allotted time:" + j + " ms");
            }
        }
        this.b.f14088a.set(0);
        if (Global.f14077a) {
            String str2 = t;
            long jA2 = this.c.a() - jA;
            long id2 = thread.getId();
            StringBuilder sbT2 = b.t(jA2, "Shutdown took: ", " ms threadID=");
            sbT2.append(id2);
            Utility.h(str2, sbT2.toString());
        }
    }

    public final synchronized void g(boolean z) {
        ConnectionAttemptMonitor connectionAttemptMonitor;
        try {
            if (this.k != null) {
                return;
            }
            if (z || (connectionAttemptMonitor = this.l) == null) {
                ConnectionAttemptMonitor connectionAttemptMonitor2 = new ConnectionAttemptMonitor();
                connectionAttemptMonitor2.f14069a = 4;
                connectionAttemptMonitor2.f = new AtomicBoolean(true);
                connectionAttemptMonitor2.b = 0L;
                connectionAttemptMonitor2.e(connectionAttemptMonitor2.b());
                this.l = connectionAttemptMonitor2;
            } else {
                synchronized (connectionAttemptMonitor) {
                    connectionAttemptMonitor.e(connectionAttemptMonitor.g);
                }
            }
            Timer timer = new Timer(t);
            this.k = timer;
            timer.schedule(new DataSendTimerTask(), this.m ? 0L : 100L, 10000L);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h() {
        try {
            Timer timer = this.k;
            if (timer != null) {
                timer.cancel();
                this.k.purge();
            }
            this.k = null;
            this.o.d();
            ConnectionAttemptMonitor connectionAttemptMonitor = this.l;
            if (connectionAttemptMonitor != null) {
                connectionAttemptMonitor.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

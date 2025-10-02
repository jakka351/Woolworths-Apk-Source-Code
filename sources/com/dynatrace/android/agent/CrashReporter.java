package com.dynatrace.android.agent;

import android.os.Looper;
import com.dynatrace.android.agent.BasicSegment;
import com.dynatrace.android.agent.CommunicationManager;
import com.dynatrace.android.agent.CommunicationManager.PostCrashReportThread;
import com.dynatrace.android.agent.comm.MonitoringDataPacket;
import com.dynatrace.android.agent.conf.InstrumentationFlavor;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.crash.CrashListener;
import com.dynatrace.android.agent.crash.StacktraceData;
import com.dynatrace.android.agent.crash.StacktraceProcessorFactory;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import com.salesforce.marketingcloud.messages.iam.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class CrashReporter implements CrashListener {
    public static final String b;

    /* renamed from: a, reason: collision with root package name */
    public final CommunicationManager f14071a;

    static {
        boolean z = Global.f14077a;
        b = "dtxCrashReporter";
    }

    public CrashReporter(CommunicationManager communicationManager) {
        this.f14071a = communicationManager;
    }

    @Override // com.dynatrace.android.agent.crash.CrashListener
    public final synchronized void a() {
    }

    @Override // com.dynatrace.android.agent.crash.CrashListener
    public final synchronized void b(Thread thread, Throwable th) {
        try {
            Session sessionC = Session.c(true);
            int i = AdkSettings.l.c;
            this.f14071a.h();
            if (sessionC.f()) {
                c(thread, th, sessionC, i);
            }
            Core.g(5000L);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(Thread thread, Throwable th, Session session, int i) throws InterruptedException, NumberFormatException {
        boolean zE;
        TimeLineProvider.b.a();
        if (Global.f14077a) {
            Utility.j(b, "Processing exception (in thread " + (thread != null ? thread.getName() : j.h) + ") ...", th);
        }
        if (!session.i.a(EventType.s)) {
            Core.d("a crash");
            return;
        }
        AdkSettings adkSettings = AdkSettings.l;
        InstrumentationFlavor instrumentationFlavor = adkSettings.f.n;
        StacktraceData stacktraceDataA = StacktraceProcessorFactory.a(th, instrumentationFlavor).a();
        String strA = stacktraceDataA.a();
        if (instrumentationFlavor == InstrumentationFlavor.REACT_NATIVE && strA != null && strA.contains("JavascriptException")) {
            Core.d("a crash");
            return;
        }
        RumEventDispatcher rumEventDispatcher = Core.s;
        if (rumEventDispatcher != null && session.k) {
            rumEventDispatcher.a();
        }
        CrashSegment crashSegment = new CrashSegment(strA, stacktraceDataA.b(), stacktraceDataA.c(), session, i, stacktraceDataA.d().a(), !session.k);
        Core.d("a crash");
        CommunicationManager communicationManager = this.f14071a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(crashSegment.f().toString());
        MonitoringDataPacket monitoringDataPacket = new MonitoringDataPacket(Core.e(session) + BasicSegment.UpdatableDataGenerator.a(session.d, session.f14113a, null), arrayList);
        boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
        boolean z2 = crashSegment.d == 0;
        ServerConfiguration serverConfiguration = adkSettings.g;
        if (z) {
            CommunicationManager.PostCrashReportThread postCrashReportThread = communicationManager.new PostCrashReportThread(serverConfiguration, monitoringDataPacket, i, z2, session.b, session.c);
            postCrashReportThread.start();
            try {
                postCrashReportThread.join(5000L);
            } catch (InterruptedException e) {
                if (Global.f14077a) {
                    Utility.j(CommunicationManager.t, "crash reporting thread problem", e);
                }
            }
            zE = CommunicationManager.PostCrashReportThread.a(postCrashReportThread);
        } else {
            zE = communicationManager.e(serverConfiguration, monitoringDataPacket, i, z2, session.b, session.c, false);
        }
        if (zE) {
            return;
        }
        crashSegment.l();
        Core.f(crashSegment, crashSegment.l);
    }
}

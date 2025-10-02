package com.dynatrace.android.agent;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.dynatrace.android.agent.CommunicationManager;
import com.dynatrace.android.agent.CommunicationManager.EventSenderThread;
import com.dynatrace.android.agent.comm.CommHandler;
import com.dynatrace.android.agent.comm.HttpConstants;
import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.comm.RequestExecutor;
import com.dynatrace.android.agent.communication.CommunicationManagerBridge;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.PreferencesManager;
import com.dynatrace.android.agent.conf.PrivacyRules;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationManager;
import com.dynatrace.android.agent.crash.CrashCatcher;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.db.DataAccessObject;
import com.dynatrace.android.agent.db.DatabaseWriteQueue;
import com.dynatrace.android.agent.events.lifecycle.AppStartActionObserverImpl;
import com.dynatrace.android.agent.events.lifecycle.FinishedActionObserver;
import com.dynatrace.android.agent.events.lifecycle.StoreActionObserver;
import com.dynatrace.android.agent.events.ragetap.RageTapObserver;
import com.dynatrace.android.agent.lifecycle.OneAgentLifecycleManagerBridge;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.agent.metrics.AppVersion;
import com.dynatrace.android.agent.metrics.ConnectionType;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.ActivityLifecycleMonitor;
import com.dynatrace.android.lifecycle.LifecycleController;
import com.dynatrace.android.lifecycle.action.LifecycleActionFactoryImpl;
import com.dynatrace.android.lifecycle.activitytracking.ActiveActivityMonitor;
import com.dynatrace.android.lifecycle.activitytracking.ActiveActivityTracker;
import com.dynatrace.android.lifecycle.activitytracking.ActivityScreenMetricsCollector;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import com.dynatrace.android.lifecycle.appstart.ActivityStateListener;
import com.dynatrace.android.lifecycle.appstart.AppStartController;
import com.dynatrace.android.lifecycle.appstart.ApplicationStartMonitor;
import com.dynatrace.android.lifecycle.appstate.ApplicationStateMonitor;
import com.dynatrace.android.lifecycle.appstate.ApplicationStateTracker;
import com.dynatrace.android.lifecycle.callback.ActivityComponentIdentifier;
import com.dynatrace.android.lifecycle.callback.ActivityLifecycleListener;
import com.dynatrace.android.lifecycle.callback.ActivityLifecycleListenerLegacy;
import com.dynatrace.android.mixed.AgentServiceLocatorImpl;
import com.dynatrace.android.ragetap.detection.RageTapDetector;
import com.dynatrace.android.ragetap.measure.TapMonitorFactory;
import com.dynatrace.android.useraction.ActionAggregatorImpl;
import com.dynatrace.android.useraction.AppStartAggregatorImpl;
import com.dynatrace.android.useraction.LoadingActionNameGenerator;
import com.dynatrace.android.window.ActivityWindowTracker;
import com.dynatrace.android.window.WindowCallbackInstrumentation;
import com.dynatrace.android.window.WindowCallbackMonitor;
import com.salesforce.marketingcloud.messages.iam.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class Core {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14070a;
    public static final ActivityLifecycleMonitor b;
    public static final ApplicationStartMonitor c;
    public static final ApplicationStateMonitor d;
    public static final ActiveActivityMonitor e;
    public static final WindowCallbackMonitor f;
    public static DataAccessObject g;
    public static BasicSegment h;
    public static long i;
    public static final CalloutTable j;
    public static final CommunicationManager k;
    public static final AtomicBoolean l;
    public static final AdkSettings m;
    public static final CrashReporter n;
    public static RageTapDetector o;
    public static CommunicationManagerBridge p;
    public static OneAgentLifecycleManagerBridge q;
    public static OneAgentStartup r;
    public static RumEventDispatcher s;

    static {
        boolean z = Global.f14077a;
        f14070a = "dtxCore";
        b = new ActivityLifecycleMonitor();
        c = new ApplicationStartMonitor();
        d = new ApplicationStateMonitor();
        e = new ActiveActivityMonitor();
        f = new WindowCallbackMonitor();
        h = null;
        i = 12L;
        CalloutTable calloutTable = new CalloutTable();
        calloutTable.c = new ArrayList();
        calloutTable.f14064a = 12;
        calloutTable.b = 0L;
        j = calloutTable;
        CommunicationManager communicationManager = new CommunicationManager(calloutTable);
        k = communicationManager;
        l = new AtomicBoolean(true);
        m = AdkSettings.l;
        n = new CrashReporter(communicationManager);
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
    }

    public static CustomSegment a(String str, int i2, long j2, DTXActionImpl dTXActionImpl, Session session, int i3, String... strArr) {
        DTXActionImpl dTXActionImpl2 = dTXActionImpl;
        boolean z = Global.f14077a;
        String str2 = f14070a;
        if (z) {
            Utility.h(str2, "Handle event name=" + str + " type=" + i2);
        }
        long j3 = j2 >= 0 ? j2 : 0L;
        CalloutTable calloutTable = j;
        CustomSegment customSegment = dTXActionImpl2;
        if (i2 != 1) {
            customSegment = dTXActionImpl2;
            if (i2 != 2) {
                if (i2 == 4) {
                    if (str != null && !str.isEmpty()) {
                        CustomSegment customSegment2 = new CustomSegment(str, 4, EventType.i, j3, session, i3, true);
                        calloutTable.b();
                        customSegment = customSegment2;
                    }
                    return null;
                }
                if (i2 == 20) {
                    if (str != null && !str.isEmpty()) {
                        CustomSegment errorSegment = new ErrorSegment(str, strArr[0], strArr[1], strArr[2], j3, session, i3, strArr[3], true);
                        calloutTable.b();
                        customSegment = errorSegment;
                    }
                    return null;
                }
                if (i2 == 21) {
                    if (str != null && !str.isEmpty()) {
                        CustomSegment crashSegment = new CrashSegment(str, strArr[0], strArr[1], session, i3, strArr[2], true);
                        calloutTable.b();
                        CrashCatcher.b(strArr[2], str, strArr[0], strArr[1]);
                        customSegment = crashSegment;
                    }
                    return null;
                }
                switch (i2) {
                    case 6:
                        if (str != null && !str.isEmpty()) {
                            CustomSegment customSegment3 = new CustomSegment(str, 6, EventType.k, j3, session, i3, true);
                            customSegment3.f14072a = Utility.e(250, strArr[0]);
                            calloutTable.b();
                            customSegment = customSegment3;
                            break;
                        }
                        return null;
                    case 7:
                        if (str != null && !str.isEmpty()) {
                            CustomSegment customSegment4 = new CustomSegment(str, 6, EventType.l, j3, session, i3, true);
                            customSegment4.f14072a = Utility.e(250, strArr[0]);
                            calloutTable.b();
                            customSegment = customSegment4;
                            break;
                        }
                        return null;
                    case 8:
                        if (str != null && !str.isEmpty()) {
                            CustomSegment customSegment5 = new CustomSegment(str, 6, EventType.j, j3, session, i3, true);
                            customSegment5.f14072a = Utility.e(250, strArr[0]);
                            calloutTable.b();
                            customSegment = customSegment5;
                            break;
                        }
                        return null;
                    case 9:
                        if (str != null && !str.isEmpty()) {
                            CustomSegment customSegment6 = new CustomSegment(str, 6, EventType.q, j3, session, i3, true ^ session.k);
                            customSegment6.f14072a = Utility.e(250, strArr[0]);
                            calloutTable.b();
                            customSegment = customSegment6;
                            break;
                        }
                        return null;
                    case 10:
                        long j4 = j3;
                        if (str != null && !str.isEmpty()) {
                            CustomSegment errorSegment2 = new ErrorSegment(str, strArr[0], strArr[1], strArr[2], j4, session, i3, strArr[3], !session.k);
                            calloutTable.b();
                            customSegment = errorSegment2;
                            break;
                        }
                        return null;
                    case 11:
                        if (str != null && !str.isEmpty()) {
                            CustomSegment crashSegment2 = new CrashSegment(str, strArr[0], strArr[1], session, i3, strArr[2], !session.k);
                            calloutTable.b();
                            CrashCatcher.b(strArr[2], str, strArr[0], strArr[1]);
                            customSegment = crashSegment2;
                            break;
                        }
                        return null;
                    case 12:
                        CustomSegment customSegment7 = new CustomSegment(str, 12, EventType.t, j3, session, i3, true);
                        calloutTable.b();
                        customSegment = customSegment7;
                        break;
                    default:
                        if (Global.f14077a) {
                            Utility.h(str2, String.format("addEvent invalid type: %d", Integer.valueOf(i2)));
                        }
                        customSegment = null;
                        break;
                }
            } else if (dTXActionImpl2 != null) {
                dTXActionImpl2.j();
                customSegment = dTXActionImpl2;
            }
        } else if (dTXActionImpl2 != null) {
            calloutTable.a(dTXActionImpl2);
            customSegment = dTXActionImpl2;
        }
        f(customSegment, i2);
        return customSegment;
    }

    public static void b(ServerConfiguration serverConfiguration) {
        AdkSettings adkSettings = m;
        adkSettings.getClass();
        if (Global.f14077a) {
            Utility.h(AdkSettings.h, "switching settings: " + serverConfiguration);
        }
        adkSettings.g = serverConfiguration;
        long j2 = (serverConfiguration.d + 9) / 10;
        i = j2;
        j.c(j2);
        if (Global.f14077a) {
            Utility.h(f14070a, "Send event timeout set to: " + j2 + " ticks");
        }
        if (serverConfiguration.m) {
            AdkSettings.l.c = serverConfiguration.l;
            CommunicationManagerBridge communicationManagerBridge = p;
            if (communicationManagerBridge != null) {
                communicationManagerBridge.a();
            }
        }
    }

    public static void c() {
        if (g == null) {
            return;
        }
        DatabaseWriteQueue.b().a();
        j.d();
        CommunicationManager communicationManager = k;
        if (communicationManager.s) {
            if (Global.f14077a) {
                Utility.h(CommunicationManager.t, "Cannot flush events while still waiting for BPv4 configuration");
            }
        } else {
            synchronized (communicationManager.j) {
                communicationManager.h.set(true);
                communicationManager.j.notify();
            }
        }
    }

    public static void d(String str) {
        ArrayList arrayList;
        Vector vector;
        if (Global.f14077a) {
            Utility.h(f14070a, Thread.currentThread().getName() + " ... force closed actions due to " + str);
        }
        String str2 = ActionThreadLocal.f14061a;
        synchronized (ActionThreadLocal.class) {
            try {
                ThreadLocal threadLocal = ActionThreadLocal.b;
                synchronized (threadLocal) {
                    vector = new Vector((Collection) threadLocal.get());
                }
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    DTXActionImpl dTXActionImpl = (DTXActionImpl) vector.get(i2);
                    if (dTXActionImpl != null && !dTXActionImpl.e) {
                        dTXActionImpl.a();
                    }
                }
            } catch (Exception e2) {
                if (Global.f14077a) {
                    Utility.g(e2, ActionThreadLocal.f14061a, "Expected exception? It depends on what you expect!");
                }
            }
        }
        String str3 = DTXAutoAction.F;
        synchronized (DTXAutoAction.class) {
            DTXAutoAction dTXAutoAction = DTXAutoAction.J;
            DTXAutoAction.J = null;
            if (dTXAutoAction != null) {
                DTXAutoAction.K.add(dTXAutoAction);
            }
        }
        List list = DTXAutoAction.K;
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((DTXAutoAction) it.next()).a();
            } catch (Exception e3) {
                if (Global.f14077a) {
                    Utility.j(DTXAutoAction.F, "GAUA close all internal errors", e3);
                }
            }
        }
    }

    public static String e(Session session) {
        BasicSegment basicSegment = h;
        StringBuilder sb = new StringBuilder("vv=3&va=8.299.1.1004&ap=");
        ScreenMetrics screenMetrics = basicSegment.f14063a.r;
        sb.append(AdkSettings.i);
        sb.append("&an=");
        sb.append(Utility.f(AdkSettings.j));
        sb.append("&ai=");
        sb.append(Utility.f(AdkSettings.k));
        AppVersion appVersion = basicSegment.f14063a.t;
        if (appVersion == null) {
            sb.append("&vb=0");
        } else {
            sb.append("&vb=");
            sb.append(appVersion.f14132a);
            String strE = Utility.e(50, appVersion.b);
            sb.append("&vn=");
            sb.append(Utility.f(strE));
        }
        sb.append("&vi=");
        sb.append(session.b);
        sb.append("&sn=");
        sb.append(session.c);
        sb.append("&ss=0&rm=");
        sb.append(basicSegment.f14063a.d);
        sb.append("&cp=");
        sb.append(Utility.f(basicSegment.f14063a.n));
        sb.append("&os=");
        sb.append(Utility.f(basicSegment.f14063a.m));
        sb.append("&mf=");
        String str = basicSegment.f14063a.e;
        if (str == null) {
            str = j.h;
        }
        sb.append(Utility.f(Utility.e(250, str)));
        sb.append("&md=");
        sb.append(Utility.f(basicSegment.f14063a.q));
        sb.append("&rj=");
        sb.append(basicSegment.f14063a.g ? "r" : "g");
        sb.append("&ul=");
        sb.append(basicSegment.f14063a.f);
        if (screenMetrics != null) {
            if (screenMetrics.f14162a > screenMetrics.b) {
                sb.append("&sw=");
                sb.append(screenMetrics.b);
                sb.append("&sh=");
                sb.append(screenMetrics.f14162a);
            } else {
                sb.append("&sw=");
                sb.append(screenMetrics.f14162a);
                sb.append("&sh=");
                sb.append(screenMetrics.b);
            }
            sb.append("&sd=");
            sb.append(screenMetrics.c);
        }
        sb.append("&pt=0");
        int i2 = basicSegment.f14063a.k;
        String str2 = i2 == 2 ? "l" : i2 == 1 ? "p" : null;
        if (str2 != null) {
            sb.append("&so=");
            sb.append(str2);
        }
        if (basicSegment.f14063a.o >= 0) {
            sb.append("&bl=");
            sb.append(basicSegment.f14063a.o);
        }
        if (basicSegment.f14063a.p != null) {
            sb.append("&fm=");
            sb.append(basicSegment.f14063a.p);
        }
        if (basicSegment.f14063a.h != null) {
            sb.append("&cr=");
            sb.append(Utility.f(basicSegment.f14063a.h));
        }
        if (basicSegment.f14063a.i != ConnectionType.OTHER) {
            sb.append("&ct=");
            sb.append(basicSegment.f14063a.i.d);
            String str3 = basicSegment.f14063a.j;
            if (str3 != null && str3.length() > 0) {
                sb.append("&np=");
                sb.append(Utility.f(basicSegment.f14063a.j));
            }
        }
        PrivacyRules privacyRules = session.i;
        basicSegment.f14063a.getClass();
        sb.append("&tt=maandroid&dl=");
        sb.append(privacyRules.f14094a.f14104a.ordinal());
        sb.append("&cl=");
        sb.append(!CrashCatcher.b ? "0" : privacyRules.f14094a.b ? "2" : "1");
        sb.append("&fv=");
        sb.append(basicSegment.c.d);
        return sb.toString();
    }

    public static void f(CustomSegment customSegment, int i2) {
        if (customSegment != null && customSegment.e && customSegment.f) {
            BasicSegment basicSegment = h;
            String str = f14070a;
            if (basicSegment != null) {
                Session session = customSegment.h;
                if (session.i.a(customSegment.j)) {
                    String string = customSegment.f().toString();
                    h.b(false);
                    String strE = e(session);
                    if (Global.f14077a) {
                        Utility.h(str, String.format("Store %dbytes", Integer.valueOf(string.length() + strE.length())));
                    }
                    DatabaseWriteQueue databaseWriteQueueB = DatabaseWriteQueue.b();
                    int i3 = customSegment.j.d;
                    long j2 = customSegment.b;
                    int i4 = customSegment.i;
                    String str2 = AdkSettings.i;
                    DatabaseWriteQueue.DatabaseRecord databaseRecord = new DatabaseWriteQueue.DatabaseRecord();
                    databaseRecord.f14115a = strE;
                    databaseRecord.b = string;
                    databaseRecord.c = session;
                    databaseRecord.d = i3;
                    databaseRecord.e = j2;
                    databaseRecord.f = i4;
                    databaseRecord.g = str2;
                    databaseWriteQueueB.d.add(databaseRecord);
                }
                AtomicInteger atomicInteger = CustomSegment.o;
                if (atomicInteger.get() == 0) {
                    atomicInteger.set(1);
                }
            } else if (Global.f14077a) {
                Utility.h(str, "discarded");
            }
            if (i2 == 2) {
                j.e(customSegment);
            }
        }
    }

    public static synchronized void g(long j2) {
        OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge;
        try {
            Global.b.set(false);
            Application application = (Application) AdkSettings.l.e;
            ApplicationStateMonitor applicationStateMonitor = d;
            ApplicationStateTracker applicationStateTracker = applicationStateMonitor.f14169a;
            if (applicationStateTracker != null) {
                application.unregisterActivityLifecycleCallbacks(applicationStateTracker);
                applicationStateMonitor.f14169a = null;
            }
            ApplicationStartMonitor applicationStartMonitor = c;
            ActivityStateListener activityStateListener = applicationStartMonitor.f14168a;
            if (activityStateListener != null) {
                application.unregisterActivityLifecycleCallbacks(activityStateListener);
                applicationStartMonitor.f14168a = null;
                applicationStartMonitor.b = null;
            }
            if (m.g.i && (oneAgentLifecycleManagerBridge = q) != null) {
                oneAgentLifecycleManagerBridge.a();
            }
            ActivityLifecycleMonitor activityLifecycleMonitor = b;
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = activityLifecycleMonitor.f14157a;
            if (activityLifecycleCallbacks != null) {
                application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                activityLifecycleMonitor.f14157a = null;
            }
            ActiveActivityMonitor activeActivityMonitor = e;
            ActiveActivityTracker activeActivityTracker = activeActivityMonitor.f14161a;
            if (activeActivityTracker != null) {
                application.unregisterActivityLifecycleCallbacks(activeActivityTracker);
                activeActivityMonitor.f14161a = null;
            }
            WindowCallbackMonitor windowCallbackMonitor = f;
            ActivityWindowTracker activityWindowTracker = windowCallbackMonitor.f14185a;
            if (activityWindowTracker != null) {
                application.unregisterActivityLifecycleCallbacks(activityWindowTracker);
                windowCallbackMonitor.f14185a = null;
            }
            o = null;
            DatabaseWriteQueue.b().c();
            k.f(j2);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:7|(2:115|8)|(1:10)(9:11|(2:13|14)|(1:35)|36|124|37|b7|54|(1:125))|19|118|20|21|122|22|31|(2:33|35)|36|124|37|b7) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r16 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (com.dynatrace.android.agent.Global.f14077a != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        com.dynatrace.android.agent.util.Utility.j(r9, "Database error.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        if (com.dynatrace.android.agent.Global.f14077a != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        com.dynatrace.android.agent.util.Utility.j(com.dynatrace.android.agent.db.DataAccessObject.c, "Database error.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(boolean r18, com.dynatrace.android.agent.conf.PrivacyRules r19, long r20) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.Core.h(boolean, com.dynatrace.android.agent.conf.PrivacyRules, long):void");
    }

    public static void i(Application application, Configuration configuration, AgentServiceLocatorImpl agentServiceLocatorImpl) throws InvalidConfigurationException {
        String string;
        ServerConfiguration serverConfigurationC;
        ServerConfiguration.Builder builder;
        OneAgentLifecycleManagerBridge oneAgentLifecycleManagerBridge;
        ApplicationInfo applicationInfo;
        configuration.getClass();
        if (Global.f14077a) {
            String str = f14070a;
            Utility.h(str, "startup configuration: " + configuration);
            String str2 = AdkSettings.h;
            try {
                applicationInfo = Build.VERSION.SDK_INT >= 33 ? application.getPackageManager().getApplicationInfo(application.getPackageName(), PackageManager.ApplicationInfoFlags.of(0L)) : application.getPackageManager().getApplicationInfo(application.getPackageName(), 0);
            } catch (Exception unused) {
                applicationInfo = null;
            }
            Utility.k(str, String.format("%s %s Target API %d Android API %d", "Dynatrace OneAgent (Android)", "8.299.1.1004", Integer.valueOf(applicationInfo != null ? applicationInfo.targetSdkVersion : 0), Integer.valueOf(Build.VERSION.SDK_INT)));
        }
        String str3 = DTXAutoAction.F;
        DTXAutoAction.G = configuration.d;
        DTXAutoAction.H = configuration.e;
        DTXAutoAction.I = configuration.f;
        AdkSettings adkSettings = m;
        adkSettings.b(configuration, application);
        PreferencesManager preferencesManager = adkSettings.d;
        String str4 = PreferencesManager.c;
        SharedPreferences sharedPreferences = preferencesManager.f14093a;
        if (sharedPreferences.contains("ServerConfig")) {
            SharedPreferences sharedPreferences2 = preferencesManager.f14093a;
            try {
                string = sharedPreferences2.getString("ServerConfig", null);
            } catch (ClassCastException unused2) {
                sharedPreferences2.edit().remove("ServerConfig").apply();
                string = null;
            }
            if (Global.f14077a) {
                Utility.h(str4, "stored configuration: " + string);
            }
            try {
                serverConfigurationC = preferencesManager.b.c(ServerConfigurationManager.d, string);
                if (serverConfigurationC.n != ServerConfiguration.Status.d) {
                    throw new InvalidConfigurationException("unexpected status code: " + serverConfigurationC.n);
                }
            } catch (Exception e2) {
                if (Global.f14077a) {
                    Utility.g(e2, str4, "can't parse stored configuration");
                }
                sharedPreferences.edit().remove("ServerConfig").apply();
            }
        } else {
            serverConfigurationC = null;
        }
        if (serverConfigurationC != null) {
            builder = serverConfigurationC.b(false);
        } else {
            builder = new ServerConfiguration.Builder();
            builder.l = 1;
        }
        builder.i = false;
        builder.o = 0L;
        builder.g = 1;
        builder.k = 1;
        builder.m = false;
        builder.h = -1;
        ServerConfiguration serverConfiguration = new ServerConfiguration(builder);
        if (serverConfiguration.i) {
            s = null;
            r = null;
            p = null;
            q = null;
        }
        b(serverConfiguration);
        m.d.f14093a.edit().remove("DTXOptInCrashes").remove("DTXDataCollectionLevel").remove("DTXCrashReplayOptedIn").remove("DTXCScreenRecordOptedIn").apply();
        PrivacyRules privacyRules = PrivacyRules.b;
        AdkSettings.i = configuration.b;
        AndroidMetrics.a();
        HttpConstants.f14085a = configuration.c.startsWith("https");
        HttpConstants.b = false;
        if (l.get()) {
            Session.j(privacyRules, false);
        } else {
            Utility.b.set(1);
            String str5 = Session.l;
            Session.h(privacyRules, TimeLineProvider.b.a()).k = false;
        }
        DataAccessObject dataAccessObject = new DataAccessObject(application);
        g = dataAccessObject;
        String str6 = configuration.b;
        synchronized (dataAccessObject) {
            try {
                dataAccessObject.b.getWritableDatabase().delete("Events", "app_id!= ?", new String[]{str6});
            } catch (Exception e3) {
                if (Global.f14077a) {
                    Utility.g(e3, DataAccessObject.c, "Database error.");
                }
            }
        }
        h = new BasicSegment(configuration.n);
        DatabaseWriteQueue.b().start();
        j.c(i);
        CommunicationManager communicationManager = k;
        DataAccessObject dataAccessObject2 = g;
        communicationManager.q = p;
        communicationManager.f14066a = dataAccessObject2;
        communicationManager.p = null;
        ServerConfiguration serverConfiguration2 = AdkSettings.l.g;
        boolean z = serverConfiguration2.i;
        communicationManager.r = z;
        if (!z) {
            communicationManager.s = false;
        }
        dataAccessObject2.a(communicationManager.c.a(), serverConfiguration2.a());
        CommHandler commHandler = new CommHandler();
        ServerConfigurationManager serverConfigurationManager = new ServerConfigurationManager(configuration.b);
        RequestExecutor requestExecutor = new RequestExecutor();
        requestExecutor.f14088a = new AtomicInteger(0);
        requestExecutor.c = configuration;
        requestExecutor.d = commHandler;
        requestExecutor.e = serverConfigurationManager;
        requestExecutor.b = configuration.c;
        communicationManager.b = requestExecutor;
        Thread thread = communicationManager.j;
        if (thread != null && thread.isAlive()) {
            try {
                communicationManager.j.interrupt();
            } catch (Exception e4) {
                if (Global.f14077a) {
                    Utility.j(CommunicationManager.t, "event sender thread problem", e4);
                }
            }
        }
        CommunicationManager.EventSenderThread eventSenderThread = communicationManager.new EventSenderThread();
        communicationManager.j = eventSenderThread;
        eventSenderThread.start();
        communicationManager.i.set(true);
        OneAgentStartup oneAgentStartup = r;
        if (oneAgentStartup != null) {
            oneAgentStartup.start();
        }
        if (configuration.i) {
            CrashCatcher.a();
            CrashReporter crashReporter = n;
            if (crashReporter != null) {
                CrashCatcher.c.add(crashReporter);
            }
        }
        if (configuration.h) {
            ActivityLifecycleMonitor activityLifecycleMonitor = b;
            TimeLineProvider timeLineProvider = TimeLineProvider.b;
            activityLifecycleMonitor.getClass();
            LifecycleController lifecycleController = new LifecycleController(new LifecycleActionFactoryImpl(), new FinishedActionObserver(), new StoreActionObserver(), new MeasurementProviderImpl(timeLineProvider), new ActionAggregatorImpl(new LoadingActionNameGenerator()));
            ActivityComponentIdentifier activityComponentIdentifier = new ActivityComponentIdentifier();
            Application.ActivityLifecycleCallbacks activityLifecycleListener = Build.VERSION.SDK_INT >= 29 ? new ActivityLifecycleListener(lifecycleController, activityComponentIdentifier) : new ActivityLifecycleListenerLegacy(lifecycleController, activityComponentIdentifier);
            activityLifecycleMonitor.f14157a = activityLifecycleListener;
            application.registerActivityLifecycleCallbacks(activityLifecycleListener);
        }
        ActiveActivityMonitor activeActivityMonitor = e;
        activeActivityMonitor.getClass();
        ActiveActivityTracker activeActivityTracker = new ActiveActivityTracker(new ActivityComponentIdentifier(), activeActivityMonitor, new ActivityScreenMetricsCollector(), activeActivityMonitor);
        activeActivityMonitor.f14161a = activeActivityTracker;
        application.registerActivityLifecycleCallbacks(activeActivityTracker);
        if (configuration.g) {
            ApplicationStartMonitor applicationStartMonitor = c;
            TimeLineProvider timeLineProvider2 = TimeLineProvider.b;
            applicationStartMonitor.getClass();
            AppStartController appStartController = new AppStartController(new MeasurementProviderImpl(timeLineProvider2), new AppStartAggregatorImpl(new LoadingActionNameGenerator()), new AppStartActionObserverImpl(), application);
            applicationStartMonitor.b = appStartController;
            applicationStartMonitor.f14168a = appStartController.e;
        }
        ApplicationStateMonitor applicationStateMonitor = d;
        applicationStateMonitor.getClass();
        ApplicationStateTracker applicationStateTracker = new ApplicationStateTracker(new ActivityComponentIdentifier());
        applicationStateMonitor.f14169a = applicationStateTracker;
        applicationStateTracker.d.add(new AppFgBgStateListener());
        application.registerActivityLifecycleCallbacks(applicationStateMonitor.f14169a);
        if (serverConfiguration.i && (oneAgentLifecycleManagerBridge = q) != null) {
            oneAgentLifecycleManagerBridge.b();
        }
        ArrayList arrayList = new ArrayList();
        if (configuration.o) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new RageTapObserver());
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
            TimeLineProvider timeLineProvider3 = TimeLineProvider.b;
            o = new RageTapDetector(arrayList2, scheduledExecutorServiceNewScheduledThreadPool, timeLineProvider3);
            arrayList.add(new TapMonitorFactory(o, timeLineProvider3));
        }
        WindowCallbackMonitor windowCallbackMonitor = f;
        windowCallbackMonitor.getClass();
        if (!arrayList.isEmpty()) {
            ActivityWindowTracker activityWindowTracker = new ActivityWindowTracker(new WindowCallbackInstrumentation(arrayList));
            windowCallbackMonitor.f14185a = activityWindowTracker;
            application.registerActivityLifecycleCallbacks(activityWindowTracker);
        }
        h(false, privacyRules, TimeLineProvider.b.a());
        k.g(true);
        Global.b.set(true);
        l.set(false);
    }
}

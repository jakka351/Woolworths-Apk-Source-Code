package com.dynatrace.android.agent.crash;

import android.os.Process;
import com.dynatrace.android.agent.CrashReporter;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class CrashCatcher {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14107a;
    public static volatile boolean b;
    public static final ArrayList c;
    public static Thread.UncaughtExceptionHandler d;
    public static Throwable e;

    public static class DTXAgentUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        public static final DTXAgentUncaughtExceptionHandler f14108a = new DTXAgentUncaughtExceptionHandler();

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            if (Global.f14077a) {
                Utility.k(CrashCatcher.f14107a, String.format("Uncaught exception occurred in %s[name=%s, id=%d, pid=%d]", thread.getClass().getName(), thread.getName(), Long.valueOf(thread.getId()), Integer.valueOf(Process.myPid())));
            }
            if (CrashCatcher.e != th) {
                CrashCatcher.e = th;
                String str = CrashCatcher.f14107a;
                String str2 = CrashReporter.b;
                if (Dynatrace.a()) {
                    Iterator it = CrashCatcher.c.iterator();
                    while (it.hasNext()) {
                        CrashListener crashListener = (CrashListener) it.next();
                        try {
                            crashListener.b(thread, th);
                        } catch (Throwable th2) {
                            if (Global.f14077a) {
                                Utility.j(str, "Failed to process an uncaught exception by " + crashListener.toString(), th2);
                            }
                        }
                    }
                } else if (Global.f14077a) {
                    Utility.k(str, "Not reporting uncaught exception due to capturing state is off");
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = CrashCatcher.d;
            if (uncaughtExceptionHandler != null) {
                if (Global.f14077a) {
                    Utility.k(CrashCatcher.f14107a, "Passing exception to ".concat(uncaughtExceptionHandler.getClass().getName()));
                }
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    static {
        boolean z = Global.f14077a;
        f14107a = "dtxCrashCatcher";
        b = false;
        c = new ArrayList();
        d = null;
        e = null;
    }

    public static void a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null && (defaultUncaughtExceptionHandler instanceof DTXAgentUncaughtExceptionHandler)) {
            if (Global.f14077a) {
                Utility.h(f14107a, "The agent crash handler is already registered.");
            }
        } else {
            d = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(DTXAgentUncaughtExceptionHandler.f14108a);
            if (Global.f14077a) {
                Utility.h(f14107a, "Registered agent crash handler");
            }
            b = true;
        }
    }

    public static void b(String str, String str2, String str3, String str4) {
        boolean zA = Dynatrace.a();
        String str5 = f14107a;
        if (!zA) {
            if (Global.f14077a) {
                Utility.k(str5, "Not reporting uncaught exception due to capturing state is off");
                return;
            }
            return;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            CrashListener crashListener = (CrashListener) it.next();
            try {
                crashListener.a();
            } catch (Throwable th) {
                if (Global.f14077a) {
                    Utility.j(str5, "Failed to process an uncaught exception by " + crashListener.toString(), th);
                }
            }
        }
    }
}

package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.ReportQueue.ReportRunnable;
import com.google.firebase.crashlytics.internal.settings.SettingsController;

/* loaded from: classes.dex */
public class DataTransportCrashlyticsReportSender {
    public static final CrashlyticsReportJsonTransform c = new CrashlyticsReportJsonTransform();
    public static final String d = c("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String e = c("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final androidx.compose.ui.graphics.colorspace.a f = new androidx.compose.ui.graphics.colorspace.a(21);

    /* renamed from: a, reason: collision with root package name */
    public final ReportQueue f15391a;
    public final Transformer b;

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, Transformer transformer) {
        this.f15391a = reportQueue;
        this.b = transformer;
    }

    public static DataTransportCrashlyticsReportSender a(Context context, SettingsController settingsController, OnDemandCounter onDemandCounter) {
        TransportRuntime.b(context);
        TransportFactory transportFactoryC = TransportRuntime.a().c(new CCTDestination(d, e));
        Encoding encoding = new Encoding("json");
        androidx.compose.ui.graphics.colorspace.a aVar = f;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(transportFactoryC.a("FIREBASE_CRASHLYTICS_REPORT", encoding, aVar), settingsController.d(), onDemandCounter), aVar);
    }

    public static String c(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public final Task b(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        TaskCompletionSource taskCompletionSource;
        ReportQueue reportQueue = this.f15391a;
        synchronized (reportQueue.f) {
            try {
                taskCompletionSource = new TaskCompletionSource();
                if (z) {
                    reportQueue.i.f15280a.getAndIncrement();
                    if (reportQueue.f.size() < reportQueue.e) {
                        Logger logger = Logger.f15258a;
                        logger.b("Enqueueing report: " + crashlyticsReportWithSessionId.d(), null);
                        logger.b("Queue size: " + reportQueue.f.size(), null);
                        reportQueue.g.execute(reportQueue.new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                        logger.b("Closing task for report: " + crashlyticsReportWithSessionId.d(), null);
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    } else {
                        reportQueue.a();
                        Logger.f15258a.b("Dropping report due to queue being full: " + crashlyticsReportWithSessionId.d(), null);
                        reportQueue.i.b.getAndIncrement();
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    }
                } else {
                    reportQueue.b(crashlyticsReportWithSessionId, taskCompletionSource);
                }
            } finally {
            }
        }
        return taskCompletionSource.getTask();
    }
}

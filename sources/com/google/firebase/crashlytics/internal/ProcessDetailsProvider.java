package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/internal/ProcessDetailsProvider;", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProcessDetailsProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final ProcessDetailsProvider f15259a = new ProcessDetailsProvider();

    public static CrashlyticsReport.Session.Event.Application.ProcessDetails a(ProcessDetailsProvider processDetailsProvider, String str, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builderA = CrashlyticsReport.Session.Event.Application.ProcessDetails.a();
        builderA.e(str);
        builderA.d(i);
        builderA.c(i2);
        builderA.b(false);
        return builderA.a();
    }

    public static ArrayList b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Intrinsics.h(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = EmptyList.d;
        }
        ArrayList arrayListB = CollectionsKt.B(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builderA = CrashlyticsReport.Session.Event.Application.ProcessDetails.a();
            builderA.e(runningAppProcessInfo.processName);
            builderA.d(runningAppProcessInfo.pid);
            builderA.c(runningAppProcessInfo.importance);
            builderA.b(Intrinsics.c(runningAppProcessInfo.processName, str));
            arrayList2.add(builderA.a());
        }
        return arrayList2;
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails c(Context context) {
        Object next;
        String processName;
        Intrinsics.h(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = b(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CrashlyticsReport.Session.Event.Application.ProcessDetails) next).c() == iMyPid) {
                break;
            }
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) next;
        if (processDetails != null) {
            return processDetails;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            Intrinsics.e(processName);
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = "";
            }
        }
        return a(this, processName, iMyPid, 0, 12);
    }
}

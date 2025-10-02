package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/ProcessDetailsProvider;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ProcessDetailsProvider {
    public static ArrayList a(Context context) {
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
            String processName = runningAppProcessInfo.processName;
            Intrinsics.g(processName, "processName");
            arrayList2.add(new ProcessDetails(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.c(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static ProcessDetails b(Context context) {
        Object next;
        String processName;
        Intrinsics.h(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProcessDetails) next).b == iMyPid) {
                break;
            }
        }
        ProcessDetails processDetails = (ProcessDetails) next;
        if (processDetails != null) {
            return processDetails;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            Intrinsics.g(processName, "myProcessName(...)");
        } else {
            processName = Application.getProcessName();
            if (processName == null && (processName = ProcessUtils.getMyProcessName()) == null) {
                processName = "";
            }
        }
        return new ProcessDetails(processName, iMyPid, 0, false);
    }
}

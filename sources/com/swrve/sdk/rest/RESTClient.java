package com.swrve.sdk.rest;

import android.util.Log;
import com.swrve.sdk.SwrveLogger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class RESTClient implements IRESTClient {
    public static final ArrayList b = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final int f19106a;

    public RESTClient(int i) {
        this.f19106a = i;
    }

    public static void d(HttpsURLConnection httpsURLConnection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = b;
        synchronized (arrayList2) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        httpsURLConnection.addRequestProperty("Swrve-Latency-Metrics", f("; ", arrayList));
    }

    public static long e(long j) {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime() - j, TimeUnit.NANOSECONDS);
    }

    public static String f(String str, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            size--;
            if (size > 0) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f8  */
    @Override // com.swrve.sdk.rest.IRESTClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r27, java.lang.String r28, com.swrve.sdk.rest.IRESTResponseListener r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.rest.RESTClient.a(java.lang.String, java.lang.String, com.swrve.sdk.rest.IRESTResponseListener):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.swrve.sdk.rest.IRESTClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r20, java.util.HashMap r21, com.swrve.sdk.rest.IRESTResponseListener r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.rest.RESTClient.b(java.lang.String, java.util.HashMap, com.swrve.sdk.rest.IRESTResponseListener):void");
    }

    public final boolean c(ArrayList arrayList, long j, ArrayList arrayList2, String str, boolean z) {
        if (j > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.format((String) it.next(), Long.valueOf(j)));
            }
            return true;
        }
        arrayList.add(str);
        if (z) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.format((String) it2.next(), Integer.valueOf(this.f19106a)));
            }
        }
        ArrayList arrayList3 = b;
        synchronized (arrayList3) {
            arrayList3.add(f(", ", arrayList));
        }
        return false;
    }

    public final void g(boolean z, String str, long j, long j2, long j3, long j4, boolean z2) {
        ArrayList arrayList = new ArrayList();
        try {
            URL url = new URL(str);
            arrayList.add("u=".concat(url.getProtocol() + "://" + url.getAuthority()));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("c=%d");
            if (c(arrayList, j, arrayList2, "c_error=1", z2)) {
                arrayList2.clear();
                arrayList2.add("sh=%d");
                arrayList2.add("sb=%d");
                if (z) {
                    if (!c(arrayList, j2, arrayList2, "sb_error=1", z2)) {
                        return;
                    } else {
                        arrayList2.clear();
                    }
                }
                arrayList2.add("rh=%d");
                if (c(arrayList, j3, arrayList2, "rh_error=1", z2)) {
                    arrayList2.clear();
                    arrayList2.add("rb=%d");
                    if (c(arrayList, j4, arrayList2, "rb_error=1", z2)) {
                        arrayList2.clear();
                        ArrayList arrayList3 = b;
                        synchronized (arrayList3) {
                            arrayList3.add(f(", ", arrayList));
                        }
                    }
                }
            }
        } catch (Exception e) {
            SwrveLogger.d(Log.getStackTraceString(e), new Object[0]);
        }
    }

    public RESTClient() {
        this.f19106a = 60000;
    }
}

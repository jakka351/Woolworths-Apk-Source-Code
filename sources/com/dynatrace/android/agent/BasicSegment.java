package com.dynatrace.android.agent;

import YU.a;
import androidx.camera.core.impl.b;
import com.dynatrace.android.agent.comm.MonitoringDataPacket;
import com.dynatrace.android.agent.conf.InstrumentationFlavor;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import java.util.Iterator;

/* loaded from: classes.dex */
public class BasicSegment {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidMetrics f14063a = AndroidMetrics.a();
    public Long b = 0L;
    public final InstrumentationFlavor c;

    public static class UpdatableDataGenerator {
        public static String a(int i, long j, String str) {
            StringBuilder sbT = b.t(j, "&tv=", "&tx=__tsNow__&mp=");
            if (i < 0) {
                i = 1;
            }
            sbT.append(i);
            if (str != null) {
                sbT.append("&sr=");
                sbT.append(str);
            }
            return sbT.toString();
        }
    }

    static {
        boolean z = Global.f14077a;
    }

    public BasicSegment(InstrumentationFlavor instrumentationFlavor) {
        this.c = instrumentationFlavor;
    }

    public static boolean a(MonitoringDataPacket monitoringDataPacket) {
        Iterator it = monitoringDataPacket.b.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).contains("&pa=0")) {
                monitoringDataPacket.f14087a = a.o(new StringBuilder(), monitoringDataPacket.f14087a, "&nu=1");
                return true;
            }
        }
        return false;
    }

    public final void b(boolean z) {
        AndroidMetrics androidMetrics = this.f14063a;
        if (z) {
            androidMetrics.d();
        }
        TimeLineProvider timeLineProvider = TimeLineProvider.b;
        if (timeLineProvider.a() - this.b.longValue() <= 5000) {
            return;
        }
        this.b = Long.valueOf(timeLineProvider.a());
        androidMetrics.e();
    }
}

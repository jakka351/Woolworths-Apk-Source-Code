package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class WakeLocks {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4003a;

    static {
        String strG = Logger.g("WakeLocks");
        Intrinsics.g(strG, "tagWithPrefix(\"WakeLocks\")");
        f4003a = strG;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (WakeLocksHolder.f4004a) {
            linkedHashMap.putAll(WakeLocksHolder.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger.e().h(f4003a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String tag) {
        Intrinsics.h(context, "context");
        Intrinsics.h(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (WakeLocksHolder.f4004a) {
        }
        Intrinsics.g(wakeLock, "wakeLock");
        return wakeLock;
    }
}

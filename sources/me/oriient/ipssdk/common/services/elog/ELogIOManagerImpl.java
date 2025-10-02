package me.oriient.ipssdk.common.services.elog;

import YU.a;
import androidx.camera.core.impl.b;
import com.salesforce.marketingcloud.storage.db.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\r"}, d2 = {"Lme/oriient/ipssdk/common/services/elog/ELogIOManagerImpl;", "Lme/oriient/ipssdk/common/services/elog/ELogIOManager;", "<init>", "()V", "", "socketId", "message", "", "incoming", "(Ljava/lang/String;Ljava/lang/String;)V", "outgoing", "resetCounters", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ELogIOManagerImpl implements ELogIOManager {
    private static int d;
    private static long e;
    private static int f;
    private static long g;

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25775a;
    private final Lazy b;
    private final Lazy c;

    public ELogIOManagerImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25775a = di.inject(reflectionFactory.b(Logger.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildData.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(int r4) {
        /*
            r0 = 0
            r1 = 1
            r2 = 100
            if (r4 > r2) goto Lc
            int r4 = r4 % 10
            if (r4 != 0) goto Lb
            return r1
        Lb:
            return r0
        Lc:
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r4 > r3) goto L15
            int r4 = r4 % r2
            if (r4 != 0) goto L14
            return r1
        L14:
            return r0
        L15:
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r4 > r2) goto L1d
            int r4 = r4 % r3
            if (r4 != 0) goto L21
            goto L20
        L1d:
            int r4 = r4 % r2
            if (r4 != 0) goto L21
        L20:
            return r1
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.common.services.elog.ELogIOManagerImpl.a(int):boolean");
    }

    @Override // me.oriient.ipssdk.common.services.elog.ELogIOManager
    public void incoming(@NotNull String socketId, @NotNull String message) {
        Intrinsics.h(socketId, "socketId");
        Intrinsics.h(message, "message");
        String strR = b.r(new StringBuilder("incoming ("), socketId, ')');
        if (StringsKt.o(message, "respTopLayerImage", false)) {
            ((ELog) this.b.getD()).io(strR, "top layer image");
            return;
        }
        if (StringsKt.o(message, "calibProgress", false)) {
            f++;
            if (g == 0) {
                g = System.currentTimeMillis();
            }
            if (a(f)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ELog eLog = (ELog) this.b.getD();
                String strM = a.m(new StringBuilder(), f, " calibration messages");
                Pair pair = new Pair("time", Long.valueOf(jCurrentTimeMillis - g));
                int i = f;
                eLog.io(strR, strM, MapsKt.j(pair, new Pair(i.e, Integer.valueOf(i > 100 ? i <= 1000 ? 100 : i <= 10000 ? 1000 : 10000 : 10))));
                g = jCurrentTimeMillis;
                return;
            }
            return;
        }
        if (!StringsKt.o(message, "positionUpdate", false)) {
            ((Logger) this.f25775a.getD()).d("Socket ".concat(socketId), message);
            return;
        }
        d++;
        if (e == 0) {
            e = System.currentTimeMillis();
        }
        if (a(d)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            ELog eLog2 = (ELog) this.b.getD();
            String strM2 = a.m(new StringBuilder(), d, " positioning messages");
            Pair pair2 = new Pair("time", Long.valueOf(jCurrentTimeMillis2 - e));
            int i2 = d;
            eLog2.io(strR, strM2, MapsKt.j(pair2, new Pair(i.e, Integer.valueOf(i2 > 100 ? i2 <= 1000 ? 100 : i2 <= 10000 ? 1000 : 10000 : 10))));
            e = jCurrentTimeMillis2;
        }
    }

    @Override // me.oriient.ipssdk.common.services.elog.ELogIOManager
    public void outgoing(@NotNull String socketId, @NotNull String message) {
        Intrinsics.h(socketId, "socketId");
        Intrinsics.h(message, "message");
        String strR = b.r(new StringBuilder("outgoing ("), socketId, ')');
        if (!StringsKt.o(message, "login", false) || ((BuildData) this.c.getD()).getDebug()) {
            ((Logger) this.f25775a.getD()).d(strR, message);
        } else {
            ((ELog) this.b.getD()).io(strR, "login attempt");
        }
    }

    @Override // me.oriient.ipssdk.common.services.elog.ELogIOManager
    public void resetCounters() {
        f = 0;
        d = 0;
        g = 0L;
        e = 0L;
    }
}

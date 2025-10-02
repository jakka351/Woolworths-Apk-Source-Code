package me.oriient.internal.services.websocket.util;

import androidx.annotation.Keep;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.salesforce.marketingcloud.storage.db.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.rest.e;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lme/oriient/internal/services/websocket/util/ELogIOManagerImpl;", "Lme/oriient/internal/services/websocket/util/ELogIOManager;", "Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/core/BuildData;", "buildData", "<init>", "(Lme/oriient/internal/services/elog/ELog;Lme/oriient/internal/infra/utils/core/BuildData;)V", "", "count", "", "shouldReportProgress", "(I)Z", "getReportStep", "(I)I", "", "socketId", "message", "", "incoming", "(Ljava/lang/String;Ljava/lang/String;)V", "outgoing", "resetCounters", "()V", "Lme/oriient/internal/services/elog/ELog;", "Lme/oriient/internal/infra/utils/core/BuildData;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Companion", "me/oriient/internal/services/websocket/util/c", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ELogIOManagerImpl implements ELogIOManager {

    @NotNull
    private static final c Companion = new c();
    private static int calibrationCounter;
    private static long calibrationTime;
    private static int positioningCounter;
    private static long positioningTime;

    @NotNull
    private final BuildData buildData;

    @NotNull
    private final ELog eLog;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    public ELogIOManagerImpl(@NotNull ELog eLog, @NotNull BuildData buildData) {
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(buildData, "buildData");
        this.eLog = eLog;
        this.buildData = buildData;
        this.logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final int getReportStep(int count) {
        if (count <= 100) {
            return 10;
        }
        if (count <= 1000) {
            return 100;
        }
        if (count <= 10000) {
            return 1000;
        }
        return ModuleDescriptor.MODULE_VERSION;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean shouldReportProgress(int r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            r2 = 100
            if (r5 > r2) goto Lc
            int r5 = r5 % 10
            if (r5 != 0) goto Lb
            return r1
        Lb:
            return r0
        Lc:
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r5 > r3) goto L15
            int r5 = r5 % r2
            if (r5 != 0) goto L14
            return r1
        L14:
            return r0
        L15:
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r5 > r2) goto L1d
            int r5 = r5 % r3
            if (r5 != 0) goto L21
            goto L20
        L1d:
            int r5 = r5 % r2
            if (r5 != 0) goto L21
        L20:
            return r1
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.websocket.util.ELogIOManagerImpl.shouldReportProgress(int):boolean");
    }

    @Override // me.oriient.internal.services.websocket.util.ELogIOManager
    public void incoming(@NotNull String socketId, @NotNull String message) {
        Intrinsics.h(socketId, "socketId");
        Intrinsics.h(message, "message");
        String strA = e.a(new StringBuilder("incoming ("), socketId, ')');
        if (StringsKt.o(message, "respTopLayerImage", false)) {
            this.eLog.io(strA, "top layer image");
            return;
        }
        if (StringsKt.o(message, "calibProgress", false)) {
            calibrationCounter++;
            if (calibrationTime == 0) {
                calibrationTime = System.currentTimeMillis();
            }
            if (shouldReportProgress(calibrationCounter)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.eLog.io(strA, YU.a.m(new StringBuilder(), calibrationCounter, " calibration messages"), MapsKt.j(new Pair("time", Long.valueOf(jCurrentTimeMillis - calibrationTime)), new Pair(i.e, Integer.valueOf(getReportStep(calibrationCounter)))));
                calibrationTime = jCurrentTimeMillis;
                return;
            }
            return;
        }
        if (!StringsKt.o(message, "positionUpdate", false)) {
            getLogger().d("Socket ".concat(socketId), message);
            return;
        }
        positioningCounter++;
        if (positioningTime == 0) {
            positioningTime = System.currentTimeMillis();
        }
        if (shouldReportProgress(positioningCounter)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.eLog.io(strA, YU.a.m(new StringBuilder(), positioningCounter, " positioning messages"), MapsKt.j(new Pair("time", Long.valueOf(jCurrentTimeMillis2 - positioningTime)), new Pair(i.e, Integer.valueOf(getReportStep(positioningCounter)))));
            positioningTime = jCurrentTimeMillis2;
        }
    }

    @Override // me.oriient.internal.services.websocket.util.ELogIOManager
    public void outgoing(@NotNull String socketId, @NotNull String message) {
        Intrinsics.h(socketId, "socketId");
        Intrinsics.h(message, "message");
        String strA = e.a(new StringBuilder("outgoing ("), socketId, ')');
        if (!StringsKt.o(message, "login", false) || this.buildData.getDebug()) {
            getLogger().d(strA, message);
        } else {
            this.eLog.io(strA, "login attempt");
        }
    }

    @Override // me.oriient.internal.services.websocket.util.ELogIOManager
    public void resetCounters() {
        calibrationCounter = 0;
        positioningCounter = 0;
        calibrationTime = 0L;
        positioningTime = 0L;
    }
}

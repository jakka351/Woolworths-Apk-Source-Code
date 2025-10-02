package me.oriient.internal.services.sensorsManager;

import android.os.Handler;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0011\u0018\u0000 z2\u00020\u0001:\u0002{|BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B[\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u001aBc\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u001bJ%\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0&2\u0006\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u001eH\u0016¢\u0006\u0004\b*\u0010+J'\u00101\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\"2\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\"2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ER\u001a\u0010\r\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010JR\u0016\u0010K\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010ER\"\u0010L\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010=\u001a\u0004\bM\u0010?\"\u0004\bN\u0010OR$\u0010Q\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR(\u0010U\u001a\u0004\u0018\u00010\u001e2\b\u0010P\u001a\u0004\u0018\u00010\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR(\u0010Y\u001a\u0004\u0018\u00010\n2\b\u0010P\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R(\u0010]\u001a\u0004\u0018\u00010\u001e2\b\u0010P\u001a\u0004\u0018\u00010\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b]\u0010V\u001a\u0004\b^\u0010XR$\u0010_\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010=\u001a\u0004\b`\u0010?R\u0016\u0010a\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010RR(\u0010c\u001a\u0004\u0018\u00010\u001e2\b\u0010b\u001a\u0004\u0018\u00010\u001e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bc\u0010V\"\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010RR\u0016\u0010g\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010=R\u0016\u0010h\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010ER\u0016\u0010i\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010ER\u0016\u0010j\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010RR\u0016\u0010k\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010RR\u001b\u0010q\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0011\u0010s\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\br\u0010TR\u0011\u0010t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020\b0v8F¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006}"}, d2 = {"Lme/oriient/internal/services/sensorsManager/OriientSensorWrapper;", "", "", "type", "Lme/oriient/internal/services/sensorsManager/OriientSensorWrapper$a;", "innatePriority", "Lme/oriient/internal/services/sensorsManager/JitterBuffer;", "eventBuffer", "Lme/oriient/internal/services/sensorsManager/a;", "emptyEvent", "", "extraPrints", "Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "<init>", "(ILme/oriient/internal/services/sensorsManager/OriientSensorWrapper$a;Lme/oriient/internal/services/sensorsManager/JitterBuffer;Lme/oriient/internal/services/sensorsManager/a;ZLme/oriient/internal/services/elog/ELog;Lme/oriient/internal/infra/utils/core/Logger;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "priority", "expectedValues", "eventsBufferSize", "bufferReportSize", "Lme/oriient/internal/services/sensorsManager/i;", "errorsListener", "(ILme/oriient/internal/services/sensorsManager/OriientSensorWrapper$a;IIIZLme/oriient/internal/services/sensorsManager/i;Lme/oriient/internal/services/elog/ELog;Lme/oriient/internal/infra/utils/core/Logger;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "(ILme/oriient/internal/services/sensorsManager/OriientSensorWrapper$a;IIIZLme/oriient/internal/services/sensorsManager/a;Lme/oriient/internal/services/sensorsManager/i;Lme/oriient/internal/services/elog/ELog;Lme/oriient/internal/infra/utils/core/Logger;Lme/oriient/internal/infra/utils/core/time/TimeProvider;)V", "Landroid/hardware/SensorEvent;", "event", "", "firstGyroTimestampNano", "Lme/oriient/internal/infra/utils/android/appState/AppState;", "appState", "", "insertEvent", "(Landroid/hardware/SensorEvent;JLme/oriient/internal/infra/utils/android/appState/AppState;)V", "count", "", "getAndRemoveFirstEvents", "(I)Ljava/util/List;", "timestamp", "getClosestEventAndRemovePriorEvents", "(J)Lme/oriient/internal/services/sensorsManager/a;", "Lme/oriient/internal/services/sensorsManager/SystemSensorManager;", "sensorManager", "sensorDelayMicro", "Landroid/os/Handler;", "sensorsDataReceiver", "turnOn", "(Lme/oriient/internal/services/sensorsManager/SystemSensorManager;ILandroid/os/Handler;)Z", "retainState", "turnOff", "(Z)V", "", "toString", "()Ljava/lang/String;", "Lme/oriient/internal/services/sensorsManager/SensorSettings;", "settings", "updateSettings", "(Lme/oriient/internal/services/sensorsManager/SensorSettings;)V", "I", "getType", "()I", "Lme/oriient/internal/services/sensorsManager/OriientSensorWrapper$a;", "getInnatePriority", "()Lme/oriient/internal/services/sensorsManager/OriientSensorWrapper$a;", "Lme/oriient/internal/services/sensorsManager/JitterBuffer;", "Lme/oriient/internal/services/sensorsManager/a;", "Z", "Lme/oriient/internal/services/elog/ELog;", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "Lme/oriient/internal/infra/utils/core/Logger;", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "receivedOneValue", "sensorDelay", "getSensorDelay", "setSensorDelay", "(I)V", "<set-?>", "actualSensorDelay", "J", "getActualSensorDelay", "()J", "lastEventUnixTimestampNano", "Ljava/lang/Long;", "getLastEventUnixTimestampNano", "()Ljava/lang/Long;", "forceCriticalPriority", "Ljava/lang/Boolean;", "getForceCriticalPriority", "()Ljava/lang/Boolean;", "sameValueThresholdMillis", "getSameValueThresholdMillis", "maxReportLatencyMicroSec", "getMaxReportLatencyMicroSec", "lastDataInsert", "value", "lastEventTimestampNano", "setLastEventTimestampNano", "(Ljava/lang/Long;)V", "timeOffsetNano", "timeJumpCounter", "didPrintNegativeTime", "didReportSuspiciousTimeDelta", "timeJumpReportThresholdNano", "timeJumpThresholdNano", "Lme/oriient/internal/services/sensorsManager/support/SensorIssuesMonitor;", "sensorIssuesMonitor$delegate", "Lkotlin/Lazy;", "getSensorIssuesMonitor", "()Lme/oriient/internal/services/sensorsManager/support/SensorIssuesMonitor;", "sensorIssuesMonitor", "getBufferSize", "bufferSize", "isBufferEmpty", "()Z", "", "getEvents", "()[Lme/oriient/internal/services/sensorsManager/a;", "events", "Companion", "me/oriient/internal/services/sensorsManager/x", "a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class OriientSensorWrapper {

    @NotNull
    private static final C1509x Companion = new C1509x();

    @NotNull
    private static final String TAG = "SensorWrapper";
    private long actualSensorDelay;
    private boolean didPrintNegativeTime;
    private boolean didReportSuspiciousTimeDelta;

    @NotNull
    private final ELog eLog;

    @NotNull
    private final C1487a emptyEvent;

    @JvmField
    @NotNull
    public final JitterBuffer eventBuffer;
    private final boolean extraPrints;

    @Nullable
    private Boolean forceCriticalPriority;

    @NotNull
    private final a innatePriority;
    private long lastDataInsert;

    @Nullable
    private Long lastEventTimestampNano;

    @Nullable
    private Long lastEventUnixTimestampNano;

    @NotNull
    private final Logger logger;
    private int maxReportLatencyMicroSec;

    @JvmField
    public boolean receivedOneValue;

    @Nullable
    private Long sameValueThresholdMillis;
    private int sensorDelay;

    /* renamed from: sensorIssuesMonitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sensorIssuesMonitor;
    private int timeJumpCounter;
    private long timeJumpReportThresholdNano;
    private long timeJumpThresholdNano;
    private long timeOffsetNano;

    @NotNull
    private final TimeProvider timeProvider;
    private final int type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CRITICAL = new a("CRITICAL", 0);
        public static final a NON_CRITICAL = new a("NON_CRITICAL", 1);
        public static final a CRITICAL_MULTI_FLOOR = new a("CRITICAL_MULTI_FLOOR", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{CRITICAL, NON_CRITICAL, CRITICAL_MULTI_FLOOR};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = EnumEntriesKt.a(aVarArr$values);
        }

        private a(String str, int i) {
        }

        @NotNull
        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public OriientSensorWrapper(int i, @NotNull a innatePriority, @NotNull JitterBuffer eventBuffer, @NotNull C1487a emptyEvent, boolean z, @NotNull ELog eLog, @NotNull Logger logger, @NotNull TimeProvider timeProvider) {
        Intrinsics.h(innatePriority, "innatePriority");
        Intrinsics.h(eventBuffer, "eventBuffer");
        Intrinsics.h(emptyEvent, "emptyEvent");
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(logger, "logger");
        Intrinsics.h(timeProvider, "timeProvider");
        this.type = i;
        this.innatePriority = innatePriority;
        this.eventBuffer = eventBuffer;
        this.emptyEvent = emptyEvent;
        this.extraPrints = z;
        this.eLog = eLog;
        this.logger = logger;
        this.timeProvider = timeProvider;
        this.sensorDelay = -1;
        this.actualSensorDelay = -1L;
        this.lastDataInsert = -1L;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.timeJumpReportThresholdNano = timeUnit.toNanos(30L);
        this.timeJumpThresholdNano = timeUnit.toNanos(60L);
        this.sensorIssuesMonitor = InternalDiKt.getDi().inject(Reflection.f24268a.b(SensorIssuesMonitor.class));
    }

    private final SensorIssuesMonitor getSensorIssuesMonitor() {
        return (SensorIssuesMonitor) this.sensorIssuesMonitor.getD();
    }

    private final void setLastEventTimestampNano(Long l) {
        Long lValueOf;
        this.lastEventTimestampNano = l;
        if (l != null) {
            lValueOf = Long.valueOf(this.timeProvider.convertSensorTimeToUnix(l.longValue()));
        } else {
            lValueOf = null;
        }
        this.lastEventUnixTimestampNano = lValueOf;
    }

    public final long getActualSensorDelay() {
        return this.actualSensorDelay;
    }

    @NotNull
    public List<C1487a> getAndRemoveFirstEvents(int count) {
        ArrayList arrayList = new ArrayList();
        if (this.extraPrints) {
            Logger logger = this.logger;
            StringBuilder sb = new StringBuilder();
            YU.a.w(this.type, count, " getAndRemoveFirstEvents() called with: count = [", "] buffer is ", sb);
            sb.append(this.eventBuffer);
            logger.d(TAG, sb.toString());
        }
        for (int i = 0; i < count; i++) {
            if (!this.eventBuffer.isEmpty()) {
                C1487a c1487aPoll = this.eventBuffer.poll();
                Intrinsics.g(c1487aPoll, "poll(...)");
                arrayList.add(c1487aPoll);
            }
        }
        if (this.extraPrints) {
            Logger logger2 = this.logger;
            StringBuilder sb2 = new StringBuilder();
            YU.a.w(this.type, count, " getAndRemoveFirstEvents() called with: count = [", "] returning ", sb2);
            sb2.append(arrayList);
            logger2.d(TAG, sb2.toString());
            Logger logger3 = this.logger;
            StringBuilder sb3 = new StringBuilder();
            YU.a.w(this.type, count, " getAndRemoveFirstEvents() called with: count = [", "] buffer after is ", sb3);
            sb3.append(this.eventBuffer);
            logger3.d(TAG, sb3.toString());
        }
        return arrayList;
    }

    public final long getBufferSize() {
        return this.eventBuffer.size();
    }

    @NotNull
    public C1487a getClosestEventAndRemovePriorEvents(long timestamp) {
        if (this.eventBuffer.isEmpty()) {
            if (this.extraPrints) {
                this.logger.d(TAG, this.type + " getNearestEventAndRemoveItAndPriorEvents() called with: timestamp = [" + timestamp + "] returning empty data");
            }
            return this.emptyEvent;
        }
        if (this.eventBuffer.size() == 1) {
            if (this.extraPrints) {
                this.logger.d(TAG, this.type + " getNearestEventAndRemoveItAndPriorEvents() called with: timestamp = [" + timestamp + "] returning only data in buffer " + this.eventBuffer.peek());
            }
            C1487a c1487aPeek = this.eventBuffer.peek();
            Intrinsics.g(c1487aPeek, "peek(...)");
            return c1487aPeek;
        }
        if (this.extraPrints) {
            this.logger.d(TAG, this.type + " getNearestEventAndRemoveItAndPriorEvents() called with: timestamp = [" + timestamp + "] buffer before: " + this.eventBuffer);
        }
        C1487a c1487aPoll = null;
        while (true) {
            if (this.eventBuffer.isEmpty()) {
                break;
            }
            c1487aPoll = this.eventBuffer.poll();
            if (this.eventBuffer.isEmpty()) {
                this.eventBuffer.addFirst(c1487aPoll);
                break;
            }
            long jAbs = Math.abs(c1487aPoll.b - timestamp);
            C1487a c1487aPeek2 = this.eventBuffer.peek();
            Intrinsics.g(c1487aPeek2, "peek(...)");
            if (Math.abs(c1487aPeek2.b - timestamp) > jAbs) {
                this.eventBuffer.addFirst(c1487aPoll);
                break;
            }
        }
        if (this.extraPrints) {
            this.logger.d(TAG, this.type + " getNearestEventAndRemoveItAndPriorEvents() called with: timestamp = [" + timestamp + "] returning " + c1487aPoll);
            this.logger.d(TAG, this.type + " getNearestEventAndRemoveItAndPriorEvents() called with: timestamp = [" + timestamp + "] buffer after: " + this.eventBuffer);
        }
        return c1487aPoll == null ? this.emptyEvent : c1487aPoll;
    }

    @NotNull
    public final ELog getELog() {
        return this.eLog;
    }

    @NotNull
    public final C1487a[] getEvents() {
        C1487a[] events = this.eventBuffer.getEvents();
        Intrinsics.g(events, "getEvents(...)");
        return events;
    }

    @Nullable
    public final Boolean getForceCriticalPriority() {
        return this.forceCriticalPriority;
    }

    @NotNull
    public final a getInnatePriority() {
        return this.innatePriority;
    }

    @Nullable
    public final Long getLastEventUnixTimestampNano() {
        return this.lastEventUnixTimestampNano;
    }

    public final int getMaxReportLatencyMicroSec() {
        return this.maxReportLatencyMicroSec;
    }

    @Nullable
    public final Long getSameValueThresholdMillis() {
        return this.sameValueThresholdMillis;
    }

    public final int getSensorDelay() {
        return this.sensorDelay;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void insertEvent(@org.jetbrains.annotations.NotNull android.hardware.SensorEvent r43, long r44, @org.jetbrains.annotations.NotNull me.oriient.internal.infra.utils.android.appState.AppState r46) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.OriientSensorWrapper.insertEvent(android.hardware.SensorEvent, long, me.oriient.internal.infra.utils.android.appState.AppState):void");
    }

    public final boolean isBufferEmpty() {
        return this.eventBuffer.isEmpty();
    }

    public final void setSensorDelay(int i) {
        this.sensorDelay = i;
    }

    @NotNull
    public String toString() {
        return YU.a.l(new StringBuilder("SensorWrapper{type="), this.type, '}');
    }

    public void turnOff(boolean retainState) {
        this.logger.d(TAG, this.type + " turnOff() called with retainState = " + retainState);
        if (retainState) {
            return;
        }
        this.eventBuffer.clear();
        if (this.type != 6) {
            this.receivedOneValue = false;
        }
        this.lastDataInsert = -1L;
        this.actualSensorDelay = -1L;
        setLastEventTimestampNano(null);
        this.timeJumpCounter = 0;
        this.timeOffsetNano = 0L;
        this.didPrintNegativeTime = false;
        this.didReportSuspiciousTimeDelta = false;
    }

    public boolean turnOn(@NotNull SystemSensorManager sensorManager, int sensorDelayMicro, @NotNull Handler sensorsDataReceiver) {
        Intrinsics.h(sensorManager, "sensorManager");
        Intrinsics.h(sensorsDataReceiver, "sensorsDataReceiver");
        this.logger.d(TAG, this.type + " turnOn() called with: sensorManager = [" + sensorManager + "], sensorDelayMicro = [" + sensorDelayMicro + "], sensorsDataReceiver = [" + sensorsDataReceiver + ']');
        return true;
    }

    public final void updateSettings(@NotNull SensorSettings settings) {
        Intrinsics.h(settings, "settings");
        this.logger.d(TAG, "updateSettings() called with(type - " + this.type + "): settings = " + settings);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.timeJumpThresholdNano = timeUnit.toNanos(settings.getCorrectionThresholdMillis());
        this.timeJumpReportThresholdNano = timeUnit.toNanos(settings.getWarningThresholdMillis());
        this.forceCriticalPriority = settings.getForceCritical();
        this.sameValueThresholdMillis = Long.valueOf(settings.getSameValueThresholdMillis());
        this.maxReportLatencyMicroSec = settings.getMaxReportLatencyMicroSec();
    }

    public OriientSensorWrapper(int i, @NotNull a priority, int i2, int i3, int i4, boolean z, @Nullable InterfaceC1495i interfaceC1495i, @NotNull ELog eLog, @NotNull Logger logger, @NotNull TimeProvider timeProvider) {
        Intrinsics.h(priority, "priority");
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(logger, "logger");
        Intrinsics.h(timeProvider, "timeProvider");
        C1487a c1487a = new C1487a(i2);
        c1487a.f25565a = i;
        c1487a.b = 0L;
        for (int i5 = 0; i5 < i2; i5++) {
            c1487a.c[i5] = 0.0f;
        }
        this(i, priority, i2, i3, i4, z, c1487a, interfaceC1495i, eLog, logger, timeProvider);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OriientSensorWrapper(int i, @NotNull a priority, int i2, int i3, int i4, boolean z, @NotNull C1487a emptyEvent, @Nullable InterfaceC1495i interfaceC1495i, @NotNull ELog eLog, @NotNull Logger logger, @NotNull TimeProvider timeProvider) {
        this(i, priority, new JitterBuffer(i3, i2, z, i, emptyEvent, interfaceC1495i, i4, eLog, logger), emptyEvent, z, eLog, logger, timeProvider);
        Intrinsics.h(priority, "priority");
        Intrinsics.h(emptyEvent, "emptyEvent");
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(logger, "logger");
        Intrinsics.h(timeProvider, "timeProvider");
    }
}

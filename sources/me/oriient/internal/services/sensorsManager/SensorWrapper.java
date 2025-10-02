package me.oriient.internal.services.sensorsManager;

import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0011\u0018\u0000 i2\u00020\u0001:\u0002j?BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u00192\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u001a\u0010\u0010\u001a\u00020\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>R\u0018\u0010@\u001a\u00060?R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bB\u0010:R\u0014\u0010D\u001a\u00020C8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010K\u001a\u00020\u00152\u0006\u0010J\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bK\u0010I\u001a\u0004\bL\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010IR\u0016\u0010Q\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00104R\"\u0010R\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u00104\u001a\u0004\bS\u00106\"\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010:R\u0016\u0010Z\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010:R\u0016\u0010[\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010IR\u0016\u0010\\\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010IR\u001b\u0010b\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0011\u0010d\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bc\u0010MR\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u001e0e8F¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006k"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorWrapper;", "", "", "type", "expectedValues", "Lme/oriient/internal/services/sensorsManager/j;", "valueConverter", "eventsBufferSize", "bufferReportSize", "", "doPrints", "Lme/oriient/internal/services/sensorsManager/i;", "errorsListener", "Lme/oriient/internal/services/sensorsManager/TimeJumpReporter;", "timeJumpReporter", "Lme/oriient/internal/services/elog/ELog;", "eLog", "<init>", "(IILme/oriient/internal/services/sensorsManager/j;IIZLme/oriient/internal/services/sensorsManager/i;Lme/oriient/internal/services/sensorsManager/TimeJumpReporter;Lme/oriient/internal/services/elog/ELog;)V", "Landroid/hardware/SensorEvent;", "event", "", "firstGyroTimestampNano", "Lme/oriient/internal/infra/utils/android/appState/AppState;", "appState", "", "insertEvent", "(Landroid/hardware/SensorEvent;JLme/oriient/internal/infra/utils/android/appState/AppState;)V", "count", "", "Lme/oriient/internal/services/sensorsManager/a;", "getAndRemoveFirstEvents", "(I)Ljava/util/List;", "timestamp", "getClosestEventAndRemovePriorEvents", "(J)Lme/oriient/internal/services/sensorsManager/a;", "Landroid/hardware/SensorManager;", "sensorManager", "sensorDelayMicro", "Landroid/os/Handler;", "sensorsDataReceiver", "turnOn", "(Landroid/hardware/SensorManager;ILandroid/os/Handler;)V", "turnOff", "()V", "", "toString", "()Ljava/lang/String;", "Lme/oriient/internal/services/sensorsManager/SensorSettings;", "settings", "updateSensorSettings", "(Lme/oriient/internal/services/sensorsManager/SensorSettings;)V", "I", "getType", "()I", "Lme/oriient/internal/services/sensorsManager/j;", "getValueConverter", "()Lme/oriient/internal/services/sensorsManager/j;", "Z", "Lme/oriient/internal/services/sensorsManager/TimeJumpReporter;", "Lme/oriient/internal/services/elog/ELog;", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "Lme/oriient/internal/services/sensorsManager/M;", "timeJumpReportHandler", "Lme/oriient/internal/services/sensorsManager/M;", "receivedOneValue", "Lme/oriient/internal/services/sensorsManager/JitterBuffer;", "eventBuffer", "Lme/oriient/internal/services/sensorsManager/JitterBuffer;", "emptyEvent", "Lme/oriient/internal/services/sensorsManager/a;", "lastDataInsert", "J", "<set-?>", "actualSensorDelay", "getActualSensorDelay", "()J", "lastEventTimestampNano", "Ljava/lang/Long;", "timeOffsetNano", "timeJumpCounter", "sensorDelay", "getSensorDelay", "setSensorDelay", "(I)V", "Lme/oriient/internal/services/sensorsManager/SensorTimeJumpData;", "sensorTimeJumpData", "Lme/oriient/internal/services/sensorsManager/SensorTimeJumpData;", "didPrintNegativeTime", "didReportSuspiciousTimeDelta", "timeJumpReportThresholdNano", "timeJumpThresholdNano", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "getBufferSize", "bufferSize", "", "getEvents", "()[Lme/oriient/internal/services/sensorsManager/a;", "events", "Companion", "me/oriient/internal/services/sensorsManager/L", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class SensorWrapper {

    @NotNull
    public static final L Companion = new L();
    private static final String TAG = "SensorWrapper";
    private long actualSensorDelay;
    private boolean didPrintNegativeTime;
    private boolean didReportSuspiciousTimeDelta;
    private final boolean doPrints;

    @NotNull
    private final ELog eLog;

    @NotNull
    private final C1487a emptyEvent;

    @JvmField
    @NotNull
    public final JitterBuffer eventBuffer;
    private long lastDataInsert;

    @Nullable
    private Long lastEventTimestampNano;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @JvmField
    public boolean receivedOneValue;
    private int sensorDelay;

    @Nullable
    private SensorTimeJumpData sensorTimeJumpData;
    private int timeJumpCounter;

    @NotNull
    private final M timeJumpReportHandler;
    private long timeJumpReportThresholdNano;

    @Nullable
    private final TimeJumpReporter timeJumpReporter;
    private long timeJumpThresholdNano;
    private long timeOffsetNano;
    private final int type;

    @NotNull
    private final InterfaceC1496j valueConverter;

    public SensorWrapper(int i, int i2, @NotNull InterfaceC1496j valueConverter, int i3, int i4, boolean z, @Nullable InterfaceC1495i interfaceC1495i, @Nullable TimeJumpReporter timeJumpReporter, @NotNull ELog eLog) {
        Intrinsics.h(valueConverter, "valueConverter");
        Intrinsics.h(eLog, "eLog");
        this.type = i;
        this.valueConverter = valueConverter;
        this.doPrints = z;
        this.timeJumpReporter = timeJumpReporter;
        this.eLog = eLog;
        this.lastDataInsert = -1L;
        this.actualSensorDelay = -1L;
        this.sensorDelay = -1;
        this.logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
        C1487a c1487a = new C1487a(i2);
        this.emptyEvent = c1487a;
        this.eventBuffer = new JitterBuffer(i3, i2, z, i, c1487a, interfaceC1495i, i4, eLog, getLogger());
        c1487a.f25565a = i;
        c1487a.b = 0L;
        for (int i5 = 0; i5 < i2; i5++) {
            this.emptyEvent.c[i5] = 0.0f;
        }
        HandlerThread handlerThread = new HandlerThread("timeJumpReporter");
        handlerThread.setPriority(1);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.e(looper);
        this.timeJumpReportHandler = new M(this, looper);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.timeJumpThresholdNano = timeUnit.toNanos(60L);
        this.timeJumpReportThresholdNano = timeUnit.toNanos(30L);
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    public final long getActualSensorDelay() {
        return this.actualSensorDelay;
    }

    @NotNull
    public List<C1487a> getAndRemoveFirstEvents(int count) {
        ArrayList arrayList = new ArrayList();
        if (this.doPrints) {
            Logger logger = getLogger();
            String TAG2 = TAG;
            Intrinsics.g(TAG2, "TAG");
            StringBuilder sb = new StringBuilder();
            YU.a.w(this.type, count, " getAndRemoveFirstEvents() called with: count = [", "] buffer is ", sb);
            sb.append(this.eventBuffer);
            logger.d(TAG2, sb.toString());
        }
        for (int i = 0; i < count; i++) {
            if (!this.eventBuffer.isEmpty()) {
                C1487a c1487aPoll = this.eventBuffer.poll();
                Intrinsics.g(c1487aPoll, "poll(...)");
                arrayList.add(c1487aPoll);
            }
        }
        if (this.doPrints) {
            Logger logger2 = getLogger();
            String TAG3 = TAG;
            Intrinsics.g(TAG3, "TAG");
            StringBuilder sb2 = new StringBuilder();
            YU.a.w(this.type, count, " getAndRemoveFirstEvents() called with: count = [", "] returning ", sb2);
            sb2.append(arrayList);
            logger2.d(TAG3, sb2.toString());
            Logger logger3 = getLogger();
            StringBuilder sb3 = new StringBuilder();
            YU.a.w(this.type, count, " getAndRemoveFirstEvents() called with: count = [", "] buffer after is ", sb3);
            sb3.append(this.eventBuffer);
            logger3.d(TAG3, sb3.toString());
        }
        return arrayList;
    }

    public final long getBufferSize() {
        return this.eventBuffer.size();
    }

    @NotNull
    public C1487a getClosestEventAndRemovePriorEvents(long timestamp) {
        if (this.eventBuffer.isEmpty()) {
            if (this.doPrints) {
                Logger logger = getLogger();
                String TAG2 = TAG;
                Intrinsics.g(TAG2, "TAG");
                logger.d(TAG2, this.type + " getNearestEventAndRemoveItAndPriorEvents() called with: timestamp = [" + timestamp + "] returning empty data");
            }
            return this.emptyEvent;
        }
        if (this.eventBuffer.size() == 1) {
            if (this.doPrints) {
                Logger logger2 = getLogger();
                String TAG3 = TAG;
                Intrinsics.g(TAG3, "TAG");
                logger2.d(TAG3, this.type + " getNearestEventAndRemoveItAndPriorEvents() called with: timestamp = [" + timestamp + "] returning only data in buffer " + this.eventBuffer.peek());
            }
            C1487a c1487aPeek = this.eventBuffer.peek();
            Intrinsics.g(c1487aPeek, "peek(...)");
            return c1487aPeek;
        }
        if (this.doPrints) {
            Logger logger3 = getLogger();
            String TAG4 = TAG;
            Intrinsics.g(TAG4, "TAG");
            logger3.d(TAG4, this.type + " getNearestEventAndRemoveItAndPriorEvents() called with: timestamp = [" + timestamp + "] buffer before: " + this.eventBuffer);
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
        if (this.doPrints) {
            Logger logger4 = getLogger();
            String TAG5 = TAG;
            Intrinsics.g(TAG5, "TAG");
            logger4.d(TAG5, this.type + " getNearestEventAndRemoveItAndPriorEvents() called with: timestamp = [" + timestamp + "] returning " + c1487aPoll);
            getLogger().d(TAG5, this.type + " getNearestEventAndRemoveItAndPriorEvents() called with: timestamp = [" + timestamp + "] buffer after: " + this.eventBuffer);
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

    public final int getSensorDelay() {
        return this.sensorDelay;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final InterfaceC1496j getValueConverter() {
        return this.valueConverter;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void insertEvent(@org.jetbrains.annotations.NotNull android.hardware.SensorEvent r27, long r28, @org.jetbrains.annotations.NotNull me.oriient.internal.infra.utils.android.appState.AppState r30) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.SensorWrapper.insertEvent(android.hardware.SensorEvent, long, me.oriient.internal.infra.utils.android.appState.AppState):void");
    }

    public final void setSensorDelay(int i) {
        this.sensorDelay = i;
    }

    @NotNull
    public String toString() {
        return YU.a.l(new StringBuilder("SensorWrapper{type="), this.type, '}');
    }

    public void turnOff() {
        Logger logger = getLogger();
        String TAG2 = TAG;
        Intrinsics.g(TAG2, "TAG");
        logger.d(TAG2, this.type + " turnOff() called");
        this.eventBuffer.clear();
        if (this.type != 6) {
            this.receivedOneValue = false;
        }
        this.lastDataInsert = -1L;
        this.actualSensorDelay = -1L;
        this.lastEventTimestampNano = null;
        this.timeJumpCounter = 0;
        this.timeOffsetNano = 0L;
        this.didPrintNegativeTime = false;
        this.didReportSuspiciousTimeDelta = false;
    }

    public void turnOn(@NotNull SensorManager sensorManager, int sensorDelayMicro, @NotNull Handler sensorsDataReceiver) {
        Intrinsics.h(sensorManager, "sensorManager");
        Intrinsics.h(sensorsDataReceiver, "sensorsDataReceiver");
        Logger logger = getLogger();
        String TAG2 = TAG;
        Intrinsics.g(TAG2, "TAG");
        logger.d(TAG2, this.type + " turnOn() called with: sensorManager = [" + sensorManager + "], sensorDelayMicro = [" + sensorDelayMicro + "], sensorsDataReceiver = [" + sensorsDataReceiver + ']');
    }

    public final void updateSensorSettings(@NotNull SensorSettings settings) {
        Intrinsics.h(settings, "settings");
        Logger logger = getLogger();
        String TAG2 = TAG;
        Intrinsics.g(TAG2, "TAG");
        logger.d(TAG2, "updateSensorSettings() called with(type - " + this.type + "): thresholds = " + settings);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.timeJumpThresholdNano = timeUnit.toNanos(settings.getCorrectionThresholdMillis());
        this.timeJumpReportThresholdNano = timeUnit.toNanos(settings.getWarningThresholdMillis());
    }
}

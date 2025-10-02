package me.oriient.internal.services.sensorsManager;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import me.oriient.internal.infra.locationManager.SystemLocationManager;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.android.appState.AppState;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.internal.services.sensorsManager.SensorsDataProvider;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes7.dex */
public class SensorsDataProviderImpl implements SensorEventListener, SensorEventListener2, TimeJumpReporter, SensorsDataProvider {
    public static final int DEFAULT_SENSOR_DATA_BUFFER_SIZE = 2000;
    private static final int GYRO_BUFFER_EXTRA_READINGS = 5;
    private static final boolean IS_MAKE_PRINTS = false;
    private static final boolean IS_MOCK_DATA = false;
    private static final int RSMP_SIZE = 50;
    private static ScheduledThreadPoolExecutor SCHEDULED_POOL_EXECUTOR = new ScheduledThreadPoolExecutor(4);
    public static final int SENSORS_DATA_BATCH_SIZE = 20;
    public static final int SENSOR_INDEX_ACCELEROMETER = 1;
    public static final int SENSOR_INDEX_GYROSCOPE = 0;
    public static final int SENSOR_INDEX_GYRO_UNCALIBRATED = 7;
    public static final int SENSOR_INDEX_LOCATION = 5;
    public static final int SENSOR_INDEX_MAGNETIC = 3;
    public static final int SENSOR_INDEX_MAGNETIC_UNCALIBRATED = 2;
    public static final int SENSOR_INDEX_PRESSURE = 6;
    public static final int SENSOR_INDEX_ROTATION = 4;
    private static final int SENSOR_TYPE_LOCATION = -1;
    private static final String TAG = "SensorsDataProviderImpl";
    private static final int TEST_SAMPLES_INTERVAL_MILLI = 100;
    private static final int TEST_SENSORS_INITIAL_TIME_DIFF = 100;

    @NonNull
    private final AppStateProvider appStateProvider;

    @NonNull
    private final ContextProvider contextProvider;

    @NonNull
    private final CoroutineContextProvider coroutineContextProvider;
    private SensorsDataProviderDelegate delegate;

    @NonNull
    private final ELog eLog;

    @NonNull
    private final ForegroundServiceMonitor foregroundServiceMonitor;
    private boolean isOn;
    private final boolean isValid;

    @NonNull
    private final SystemLocationManager locationService;

    @NonNull
    private final Logger logger;
    private int overflowCount;
    private InterfaceC1495i sensorBufferErrorsListener;
    private Handler sensorDataProcessor;
    private Handler sensorDataSender;

    @NonNull
    private SensorManager sensorManager;
    private SensorWrapper[] sensors;
    private Handler sensorsDataReceiver;

    @Nullable
    private TimeJumpReporter timeJumpReporter;

    @NonNull
    private final TimeProvider timeProvider;

    @Nullable
    private PowerManager.WakeLock wakeLock;

    @Nullable
    private Long firstGyroTimestamp = null;

    @NonNull
    private AtomicBoolean didOverflow = new AtomicBoolean(false);

    @SuppressLint
    private Map<Integer, Long> times = new HashMap();

    @NonNull
    @SuppressLint
    private Map<Integer, Long> timeDiffs = new HashMap();
    private long baseTimeDiff = 100;
    private List<ScheduledFuture<?>> mockSensors = new ArrayList();
    private long maxBatchDelay = 0;
    private long lastBatchProcessing = -1;
    private long sessionStartTimeUTC = -1;
    private boolean isPressureOn = false;

    @NonNull
    private Queue<Byte> markers = new ConcurrentLinkedQueue();
    private int sensorsDataBufferSize = 2000;
    private int maxSessionLengthMin = 1440;
    private int sensorDelayMicro = (int) TimeUnit.MILLISECONDS.toMicros(10);
    private boolean shouldNeverStopPressure = false;
    private final List<SensorManagerError> emptyList = new ArrayList();

    public SensorsDataProviderImpl(@NonNull ContextProvider contextProvider, @NonNull ELog eLog, @NonNull TimeProvider timeProvider, @NonNull SystemLocationManager systemLocationManager, @NonNull AppStateProvider appStateProvider, @NonNull ForegroundServiceMonitor foregroundServiceMonitor, @NonNull CoroutineContextProvider coroutineContextProvider, @NonNull Logger logger) {
        this.contextProvider = contextProvider;
        this.coroutineContextProvider = coroutineContextProvider;
        this.eLog = eLog;
        this.logger = logger;
        this.timeProvider = timeProvider;
        this.locationService = systemLocationManager;
        this.appStateProvider = appStateProvider;
        this.foregroundServiceMonitor = foregroundServiceMonitor;
        HandlerThread handlerThread = new HandlerThread("sensorsDataReceiver");
        handlerThread.setPriority(10);
        handlerThread.start();
        this.sensorsDataReceiver = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("sensorsDataSender");
        handlerThread2.setPriority(3);
        handlerThread2.start();
        this.sensorDataSender = new Handler(handlerThread2.getLooper());
        HandlerThread handlerThread3 = new HandlerThread("sensorsDataProcessor");
        handlerThread3.setPriority(4);
        handlerThread3.start();
        this.sensorDataProcessor = new V(this, handlerThread3.getLooper());
        SensorManager sensorManager = (SensorManager) contextProvider.getContext().getSystemService("sensor");
        this.sensorManager = sensorManager;
        if (sensorManager == null) {
            eLog.c(TAG + System.identityHashCode(this), "failed to get sensors manager");
            this.isValid = false;
            return;
        }
        this.sensorBufferErrorsListener = new O(this, eLog);
        createSensorWrappers(this.sensorsDataBufferSize);
        List<SystemSensor> missingSensors = getMissingSensors();
        if (!missingSensors.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<SystemSensor> it = missingSensors.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getDescription());
            }
            StringBuilder sb = new StringBuilder();
            String str = TAG;
            sb.append(str);
            String strA = N.a(this, sb);
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("sensors", arrayList)};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
            }
            eLog.e(strA, "missing sensors", Collections.unmodifiableMap(map));
            if (missingSensors.get(0) != SystemSensor.GYROSCOPE_UNCALIBRATED) {
                this.isValid = false;
                return;
            } else {
                StringBuilder sbS = YU.a.s(str);
                sbS.append(System.identityHashCode(this));
                logger.i(sbS.toString(), "SensorsDataProvider: running on simulator or similar device");
            }
        }
        this.isValid = true;
    }

    private int appendLocalTime(SensorWrapper sensorWrapper, C1487a c1487a, ByteBuffer byteBuffer, long j) {
        byteBuffer.putInt((int) ((c1487a.e - j) / 100000));
        return 1;
    }

    private String calculateDiffFromGyro(@NonNull List<C1487a> list, long j) {
        if (list.isEmpty()) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder("[");
        C1487a c1487a = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            C1487a c1487a2 = list.get(i);
            long jAbs = Math.abs(c1487a2.b - c1487a.b);
            if (jAbs > j) {
                sb.append(c1487a2.f25565a);
                sb.append(":");
                sb.append(jAbs);
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private String calculateInternalDiffs(@NonNull List<C1487a> list, long j) {
        if (list.isEmpty()) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder("[");
        C1487a c1487a = list.get(0);
        int i = 1;
        while (i < list.size()) {
            C1487a c1487a2 = list.get(i);
            long jAbs = Math.abs(c1487a2.b - c1487a.b);
            if (jAbs > j) {
                sb.append(c1487a2.f25565a);
                sb.append(":");
                sb.append(jAbs);
                sb.append(", ");
            }
            i++;
            c1487a = c1487a2;
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public SensorEvent createSensorEventByReflection(int i, long j) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("android.hardware.SensorEvent");
            Class cls2 = Integer.TYPE;
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(cls2);
            declaredConstructor.setAccessible(true);
            SensorEvent sensorEvent = (SensorEvent) declaredConstructor.newInstance(4);
            Constructor<?> declaredConstructor2 = Class.forName("android.hardware.Sensor").getDeclaredConstructor(null);
            declaredConstructor2.setAccessible(true);
            Sensor sensor = (Sensor) declaredConstructor2.newInstance(null);
            Method declaredMethod = sensor.getClass().getDeclaredMethod("setType", cls2);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(sensor, Integer.valueOf(i));
            sensorEvent.timestamp = j;
            sensorEvent.sensor = sensor;
            return sensorEvent;
        } catch (Exception unused) {
            this.logger.e(TAG + System.identityHashCode(this), "createSensorEventByReflection: failed to create sensor event");
            return null;
        }
    }

    private void createSensorWrappers(int i) {
        SensorWrapper[] sensorWrapperArr = new SensorWrapper[8];
        this.sensors = sensorWrapperArr;
        sensorWrapperArr[0] = new SensorWrapper(4, 3, new U(), i, 200, false, this.sensorBufferErrorsListener, this, this.eLog);
        this.sensors[1] = new SensorWrapper(1, 3, new T(), i, 200, false, this.sensorBufferErrorsListener, this, this.eLog);
        this.sensors[2] = new SensorWrapper(14, 3, new U(), i, 200, false, this.sensorBufferErrorsListener, this, this.eLog);
        this.sensors[3] = new SensorWrapper(2, 3, new U(), i, 200, false, this.sensorBufferErrorsListener, this, this.eLog);
        this.sensors[4] = new SensorWrapper(15, 4, new X(), i, 200, false, this.sensorBufferErrorsListener, this, this.eLog);
        this.sensors[5] = new C1502p(new U(), this.eLog, this.coroutineContextProvider, this.locationService);
        this.sensors[6] = new SensorWrapper(6, 2, new W(), i, 200, false, this.sensorBufferErrorsListener, this, this.eLog);
        SensorWrapper[] sensorWrapperArr2 = this.sensors;
        sensorWrapperArr2[6].receivedOneValue = true;
        sensorWrapperArr2[7] = new SensorWrapper(16, 6, new U(), i, 200, false, this.sensorBufferErrorsListener, this, this.eLog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public String getBufferSizesStr() {
        StringBuilder sb = new StringBuilder("Buffer sizes: ");
        for (SensorWrapper sensorWrapper : this.sensors) {
            sb.append(sensorWrapper.getType());
            sb.append(": ");
            sb.append(sensorWrapper.getBufferSize());
            sb.append(", ");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public String getBufferTimeStr(SensorWrapper sensorWrapper) {
        StringBuilder sb = new StringBuilder("Sensor " + sensorWrapper.getType() + " data timestamps nano: [");
        C1487a[] events = sensorWrapper.getEvents();
        for (C1487a c1487a : (C1487a[]) Arrays.copyOf(events, events.length)) {
            sb.append(c1487a.b);
            sb.append(",");
        }
        sb.append("]R:");
        sb.append(sensorWrapper.eventBuffer.getReadIndex());
        sb.append(",W:");
        sb.append(sensorWrapper.eventBuffer.getWriteIndex());
        return sb.toString();
    }

    @NonNull
    private String getMissingSensorsString() {
        StringBuilder sb = new StringBuilder("Missing sensors: ");
        List<SystemSensor> missingSensors = getMissingSensors();
        if (!missingSensors.isEmpty()) {
            Iterator<SystemSensor> it = missingSensors.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getDescription());
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getNextTimestamp(int i) {
        Long l = this.times.get(Integer.valueOf(i));
        Long l2 = this.timeDiffs.get(Integer.valueOf(i));
        long jLongValue = l2.longValue() + l.longValue();
        this.times.put(Integer.valueOf(i), Long.valueOf(jLongValue));
        return jLongValue;
    }

    private int getSensorIndexByType(int i) {
        if (i == -1) {
            return 5;
        }
        if (i == 4) {
            return 0;
        }
        int i2 = 6;
        if (i != 6) {
            i2 = 1;
            if (i != 1) {
                if (i == 2) {
                    return 3;
                }
                switch (i) {
                    case 14:
                        return 2;
                    case 15:
                        return 4;
                    case 16:
                        return 7;
                    default:
                        throw new IllegalArgumentException(YU.a.e(i, "Sensor of type ", " is not supported"));
                }
            }
        }
        return i2;
    }

    private int getSensorTypeByIndex(int i) {
        switch (i) {
            case 0:
                return 4;
            case 1:
                return 1;
            case 2:
                return 14;
            case 3:
                return 2;
            case 4:
                return 15;
            case 5:
                return -1;
            case 6:
                return 6;
            case 7:
                return 16;
            default:
                throw new IllegalArgumentException(YU.a.e(i, "Sensor at index ", " is not supported"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public String getSensorsActualSensorsDelayStr() {
        StringBuilder sb = new StringBuilder("Sensors last insert delay ms: ");
        for (SensorWrapper sensorWrapper : this.sensors) {
            sb.append(sensorWrapper.getType());
            sb.append(": ");
            sb.append(sensorWrapper.getActualSensorDelay());
            sb.append("; ");
        }
        return sb.toString();
    }

    private boolean isAtLeastOneEventFromEachSensorAndSetFirstValue(@NonNull SensorEvent sensorEvent) {
        for (SensorWrapper sensorWrapper : this.sensors) {
            if (!sensorWrapper.receivedOneValue && sensorEvent.sensor.getType() == sensorWrapper.getType()) {
                sensorWrapper.receivedOneValue = true;
            }
        }
        for (SensorWrapper sensorWrapper2 : this.sensors) {
            if (!sensorWrapper2.receivedOneValue) {
                return false;
            }
        }
        return true;
    }

    private boolean isBatchReady(@NonNull SensorWrapper sensorWrapper) {
        return sensorWrapper.eventBuffer.size() >= 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processEventsBatch$0(List list, Long l, long j, long j2) {
        SensorsDataProviderDelegate sensorsDataProviderDelegate = this.delegate;
        if (sensorsDataProviderDelegate != null) {
            sensorsDataProviderDelegate.onNewSample(new SensorsDataSample(20, list, l.longValue(), j, j2, this.sessionStartTimeUTC), this.emptyList);
        }
    }

    private void listAllSensors() {
        for (Sensor sensor : ((SensorManager) this.contextProvider.getContext().getSystemService("sensor")).getSensorList(-1)) {
            Logger logger = this.logger;
            StringBuilder sb = new StringBuilder();
            sb.append(TAG);
            logger.d(N.a(this, sb), "listAllSensors: " + sensor + ", isWakeup=" + sensor.isWakeUpSensor() + ", isDynamic=" + sensor.isDynamicSensor());
        }
    }

    private void padWithZeroes(@NonNull ByteBuffer byteBuffer, int i, int i2) {
        if (i >= i2) {
            return;
        }
        while (i < i2) {
            byteBuffer.putFloat(BitmapDescriptorFactory.HUE_RED);
            i++;
        }
        Byte bPoll = this.markers.poll();
        if (bPoll != null) {
            byteBuffer.put(byteBuffer.position() - 1, bPoll.byteValue());
        }
    }

    private void printBufferSizes() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void processEventsBatch() {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.SensorsDataProviderImpl.processEventsBatch():void");
    }

    private int processValuesAndAppendToBuffer(SensorWrapper sensorWrapper, C1487a c1487a, @NonNull ByteBuffer byteBuffer, long j) {
        byteBuffer.putInt((int) ((c1487a.b - j) / 100000));
        int i = 1;
        for (int i2 = 0; i2 < c1487a.c.length; i2++) {
            byteBuffer.putFloat(sensorWrapper.getValueConverter().a(c1487a.c, i2));
            i++;
        }
        return i;
    }

    private void runMockSensor(int i) {
        Logger logger = this.logger;
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        String strA = N.a(this, sb);
        StringBuilder sbR = YU.a.r(i, "runMockSensor() called with: sensorType = [", "] timeDiffs ");
        sbR.append(this.timeDiffs);
        sbR.append(", base ");
        sbR.append(this.baseTimeDiff);
        logger.d(strA, sbR.toString());
        this.times.put(Integer.valueOf(i), this.timeDiffs.get(Integer.valueOf(i)));
        long j = (i == 6 ? 200 : 0) + 100;
        this.mockSensors.add(SCHEDULED_POOL_EXECUTOR.scheduleAtFixedRate(new S(this, i), j, j, TimeUnit.MILLISECONDS));
    }

    private void stopMockSensors() {
        this.logger.d(TAG + System.identityHashCode(this), "stopMockSensors() called");
        Iterator<ScheduledFuture<?>> it = this.mockSensors.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
        this.mockSensors.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean turnSensorsOnImpl() {
        if (this.isOn) {
            this.logger.w(TAG + System.identityHashCode(this), "turnSensorsOnImpl: already in progress");
            return false;
        }
        this.isOn = true;
        if (this.wakeLock == null) {
            try {
                PowerManager powerManager = (PowerManager) this.contextProvider.getContext().getSystemService("power");
                if (powerManager != null) {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ipssdk:wakeLock");
                    this.wakeLock = wakeLockNewWakeLock;
                    if (wakeLockNewWakeLock != null) {
                        try {
                            wakeLockNewWakeLock.acquire(TimeUnit.MINUTES.toMillis(this.maxSessionLengthMin));
                            this.eLog.d(TAG + System.identityHashCode(this), "turnSensorsOnImpl: wakelock acquired");
                        } catch (Exception e) {
                            ELog eLog = this.eLog;
                            String str = TAG + System.identityHashCode(this);
                            String message = e.getMessage();
                            if (message == null) {
                                message = "null";
                            }
                            eLog.c(str, "turnSensorsOnImpl: failed to acquire partial wakelock", kotlin.reflect.jvm.internal.impl.types.checker.a.m(message, UtilsKt.stackTraceToStringOneLine(e)));
                            this.wakeLock = null;
                        }
                    } else {
                        this.eLog.c(TAG + System.identityHashCode(this), "turnSensorsOnImpl: failed to get partial wakelock");
                        this.wakeLock = null;
                    }
                } else {
                    this.eLog.c(TAG + System.identityHashCode(this), "turnSensorsOnImpl: failed to get partial wakelock because there is no power manager");
                }
            } catch (Exception e2) {
                ELog eLog2 = this.eLog;
                StringBuilder sb = new StringBuilder();
                sb.append(TAG);
                String strA = N.a(this, sb);
                String message2 = e2.getMessage();
                Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("errorMessage", message2 != null ? message2 : "null"), new AbstractMap.SimpleEntry("stackTrace", UtilsKt.stackTraceToStringOneLine(e2))};
                HashMap map = new HashMap(2);
                for (int i = 0; i < 2; i++) {
                    Map.Entry entry = entryArr[i];
                    Object key = entry.getKey();
                    if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
                    }
                }
                eLog2.c(strA, "error acquiring wakelock", Collections.unmodifiableMap(map));
                e2.printStackTrace();
            }
        }
        this.didOverflow.set(false);
        this.sessionStartTimeUTC = -1L;
        for (SensorWrapper sensorWrapper : this.sensors) {
            Logger logger = this.logger;
            StringBuilder sb2 = new StringBuilder();
            String str2 = TAG;
            sb2.append(str2);
            logger.d(N.a(this, sb2), "turnSensorsOnImpl: registering sensor listener " + sensorWrapper.getType());
            if (sensorWrapper.getType() == -1) {
                sensorWrapper.turnOn(this.sensorManager, sensorWrapper.getSensorDelay() + this.sensorDelayMicro, this.sensorsDataReceiver);
            } else if (this.isPressureOn && sensorWrapper.getType() == 6) {
                Logger logger2 = this.logger;
                StringBuilder sbS = YU.a.s(str2);
                sbS.append(System.identityHashCode(this));
                logger2.d(sbS.toString(), "turnSensorsOnImpl: pressure already on");
            } else {
                turnOnSensor(sensorWrapper, this.sensorManager.getDefaultSensor(sensorWrapper.getType()));
            }
        }
        this.foregroundServiceMonitor.startMonitoring();
        return true;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void addMarker(byte b) {
        this.markers.add(Byte.valueOf(b));
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void configure(int i, int i2, double d, boolean z, @NonNull Map<SystemSensor, SensorSettings> map, boolean z2) {
        SensorSettings sensorSettings;
        this.sensorsDataBufferSize = i;
        this.maxSessionLengthMin = i2;
        this.shouldNeverStopPressure = z2;
        this.sensorDelayMicro = (int) (TimeUnit.MILLISECONDS.toMicros(1L) * d);
        for (SensorWrapper sensorWrapper : this.sensors) {
            SystemSensor systemSensorFrom = SystemSensor.from(sensorWrapper.getType());
            if (systemSensorFrom != null && (sensorSettings = map.get(systemSensorFrom)) != null) {
                sensorWrapper.updateSensorSettings(sensorSettings);
            }
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public boolean getHasBarometer() {
        return this.sensorManager.getDefaultSensor(6) != null;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    @NonNull
    public List<SystemSensor> getMissingSensors() {
        SystemSensor systemSensorFrom;
        ArrayList arrayList = new ArrayList();
        SensorManager sensorManager = (SensorManager) this.contextProvider.getContext().getSystemService("sensor");
        int i = 0;
        if (sensorManager != null) {
            while (i < this.sensors.length) {
                int sensorTypeByIndex = getSensorTypeByIndex(i);
                if (sensorTypeByIndex != -1 && sensorTypeByIndex != 6 && sensorManager.getDefaultSensor(sensorTypeByIndex) == null) {
                    Logger logger = this.logger;
                    StringBuilder sb = new StringBuilder();
                    sb.append(TAG);
                    logger.e(N.a(this, sb), "getMissingSensors: missing sensor " + sensorTypeByIndex);
                    SystemSensor systemSensorFrom2 = SystemSensor.from(sensorTypeByIndex);
                    if (systemSensorFrom2 != null) {
                        arrayList.add(systemSensorFrom2);
                    }
                }
                i++;
            }
        } else {
            this.eLog.c(TAG + System.identityHashCode(this), "getMissingSensors: No sensor manager service!");
            SensorWrapper[] sensorWrapperArr = this.sensors;
            int length = sensorWrapperArr.length;
            while (i < length) {
                SensorWrapper sensorWrapper = sensorWrapperArr[i];
                if (sensorWrapper.getType() != -1 && sensorWrapper.getType() != 6 && (systemSensorFrom = SystemSensor.from(sensorWrapper.getType())) != null) {
                    arrayList.add(systemSensorFrom);
                }
                i++;
            }
        }
        return arrayList;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public int getSensorDataBatchSize() {
        return 20;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public int getSensorDataBufferSize() {
        return 2000;
    }

    @Nullable
    public SensorWrapper getSensorWrapper(int i) {
        return this.sensors[i];
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    @NonNull
    public Map<SystemSensor, SensorInformation> getSensorsInformation() {
        String str;
        String str2;
        int i;
        boolean z;
        HashMap map = new HashMap();
        for (SystemSensor systemSensor : SystemSensor.values()) {
            Sensor defaultSensor = this.sensorManager.getDefaultSensor(systemSensor.getOsSensorType());
            if (defaultSensor != null) {
                String name = defaultSensor.getName() != null ? defaultSensor.getName() : "null";
                String vendor = defaultSensor.getVendor() != null ? defaultSensor.getVendor() : "null";
                int version = defaultSensor.getVersion();
                if (defaultSensor.getFifoReservedEventCount() > 0) {
                    z = true;
                    str = name;
                    str2 = vendor;
                    i = version;
                } else {
                    str = name;
                    str2 = vendor;
                    i = version;
                    z = false;
                }
                map.put(systemSensor, new F(str, systemSensor, str2, i, z));
            }
        }
        return map;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    /* renamed from: getSessionStartTimeMilliUTC */
    public long getSessionStartTimeUTC() {
        return this.sessionStartTimeUTC;
    }

    @Override // me.oriient.internal.services.sensorsManager.TimeJumpReporter
    public boolean isEmpty() {
        TimeJumpReporter timeJumpReporter = this.timeJumpReporter;
        return timeJumpReporter == null || timeJumpReporter.isEmpty();
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    /* renamed from: isOn */
    public boolean getIsOn() {
        return this.isOn;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public boolean isValid() {
        if (this.isValid) {
            return true;
        }
        Logger logger = this.logger;
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        logger.e(N.a(this, sb), getMissingSensorsString());
        return false;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener2
    public void onFlushCompleted(Sensor sensor) {
        ELog eLog = this.eLog;
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        String strA = N.a(this, sb);
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("sensorType", Integer.valueOf(sensor.getType()))};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
            throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
        }
        eLog.d(strA, "onFlushCompleted() called", Collections.unmodifiableMap(map));
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NonNull SensorEvent sensorEvent) {
        try {
            int type = sensorEvent.sensor.getType();
            if (isAtLeastOneEventFromEachSensorAndSetFirstValue(sensorEvent) && this.isOn) {
                if (this.firstGyroTimestamp == null) {
                    if (type != 4) {
                        return;
                    } else {
                        this.firstGyroTimestamp = Long.valueOf(sensorEvent.timestamp - (this.timeProvider.getCurrentTimeGmt() - this.sessionStartTimeUTC));
                    }
                }
                int sensorIndexByType = getSensorIndexByType(type);
                this.sensors[sensorIndexByType].insertEvent(sensorEvent, this.firstGyroTimestamp.longValue(), (AppState) this.appStateProvider.getAppState().getValue());
                if (type == 4 && isBatchReady(this.sensors[sensorIndexByType])) {
                    this.sensorDataProcessor.sendEmptyMessage(0);
                }
            }
        } catch (Exception e) {
            ELog eLog = this.eLog;
            StringBuilder sb = new StringBuilder();
            String str = TAG;
            sb.append(str);
            String strA = N.a(this, sb);
            String strConcat = e.getClass().getName().concat(" in onSensorChanged");
            Integer numValueOf = Integer.valueOf(sensorEvent.sensor.getType());
            String message = e.getMessage();
            if (message == null) {
                message = "null";
            }
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("sensorType", numValueOf), new AbstractMap.SimpleEntry("errorMessage", message)};
            HashMap map = new HashMap(2);
            for (int i = 0; i < 2; i++) {
                Map.Entry entry = entryArr[i];
                Object key = entry.getKey();
                if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                    throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
                }
            }
            eLog.c(strA, strConcat, Collections.unmodifiableMap(map));
            ELog eLog2 = this.eLog;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            eLog2.c(N.a(this, sb2), UtilsKt.stackTraceToStringOneLine(e));
        }
    }

    public void overflowSensor(int i, int i2) {
    }

    @Override // me.oriient.internal.services.sensorsManager.TimeJumpReporter
    public void reportTimeJump(int i, @NotNull SensorTimeJumpData sensorTimeJumpData, @NotNull ELog eLog) {
        TimeJumpReporter timeJumpReporter = this.timeJumpReporter;
        if (timeJumpReporter != null) {
            timeJumpReporter.reportTimeJump(i, sensorTimeJumpData, eLog);
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void setDelegate(SensorsDataProviderDelegate sensorsDataProviderDelegate) {
        this.delegate = sensorsDataProviderDelegate;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void setTimeJumpReporter(@Nullable TimeJumpReporter timeJumpReporter) {
        this.timeJumpReporter = timeJumpReporter;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void turnOnSensor(int i, @Nullable Sensor sensor) {
        try {
            SensorWrapper sensorWrapper = this.sensors[i];
            if (sensor == null) {
                this.logger.w(TAG + System.identityHashCode(this), "turnOn: no sensor of type " + sensorWrapper.getType());
                return;
            }
            this.logger.d(TAG + System.identityHashCode(this), "turnOn: sensor " + sensorWrapper.getType() + " min delay is " + sensor.getMinDelay() + ", isWakeup=" + sensor.isWakeUpSensor());
            new Thread(new P(this, sensor, sensorWrapper, this)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void turnSensorsOff(boolean z, boolean z2) {
        Logger logger = this.logger;
        StringBuilder sb = new StringBuilder();
        String str = TAG;
        sb.append(str);
        logger.d(N.a(this, sb), "turnSensorsOff() called with: continueSession = [" + z + "]");
        if (!this.isValid) {
            Logger logger2 = this.logger;
            StringBuilder sbS = YU.a.s(str);
            sbS.append(System.identityHashCode(this));
            logger2.e(sbS.toString(), "turnSensorsOff: unable to use sensors. see constructor log for reason");
            return;
        }
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                try {
                    this.wakeLock.release();
                    this.eLog.d(str + System.identityHashCode(this), "wakelock released");
                } catch (Exception e) {
                    ELog eLog = this.eLog;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(TAG);
                    String strA = N.a(this, sb2);
                    String message = e.getMessage();
                    if (message == null) {
                        message = "null";
                    }
                    Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("errorMessage", message)};
                    HashMap map = new HashMap(1);
                    Map.Entry entry = entryArr[0];
                    Object key = entry.getKey();
                    if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key, entry, map, key) != null) {
                        throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key, "duplicate key: "));
                    }
                    eLog.e(strA, "turnSensorsOff: failed to release wakelock", Collections.unmodifiableMap(map));
                }
            }
            this.wakeLock = null;
        }
        this.isOn = false;
        if (!z) {
            this.firstGyroTimestamp = null;
            this.sessionStartTimeUTC = -1L;
        }
        this.sessionStartTimeUTC = -1L;
        try {
            for (SensorWrapper sensorWrapper : this.sensors) {
                if (sensorWrapper.getType() != -1 && (sensorWrapper.getType() != 6 || !this.shouldNeverStopPressure)) {
                    this.logger.d(TAG + System.identityHashCode(this), "turnSensorsOff: unregistering sensor listener " + sensorWrapper.getType());
                    this.sensorManager.unregisterListener(this, this.sensorManager.getDefaultSensor(sensorWrapper.getType()));
                }
            }
        } catch (Exception e2) {
            ELog eLog2 = this.eLog;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(TAG);
            String strA2 = N.a(this, sb3);
            String message2 = e2.getMessage();
            Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry("errorMessage", message2 != null ? message2 : "null")};
            HashMap map2 = new HashMap(1);
            Map.Entry entry2 = entryArr2[0];
            Object key2 = entry2.getKey();
            if (kotlin.reflect.jvm.internal.impl.types.checker.a.d(key2, entry2, map2, key2) != null) {
                throw new IllegalArgumentException(androidx.camera.core.impl.b.m(key2, "duplicate key: "));
            }
            eLog2.c(strA2, "turnSensorsOff: failed to unregister listener", Collections.unmodifiableMap(map2));
        }
        for (SensorWrapper sensorWrapper2 : this.sensors) {
            sensorWrapper2.turnOff();
        }
        this.foregroundServiceMonitor.stopMonitoring();
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void turnSensorsOn(boolean z, long j, @NonNull SensorsDataProvider.SessionStartListener sessionStartListener) {
        Logger logger = this.logger;
        StringBuilder sb = new StringBuilder();
        String str = TAG;
        sb.append(str);
        sb.append(System.identityHashCode(this));
        logger.d(sb.toString(), "turnSensorsOn() called");
        if (this.isValid) {
            if (turnSensorsOnImpl()) {
                this.sessionStartTimeUTC = j;
            }
            sessionStartListener.onSessionStart();
            this.overflowCount = 0;
            return;
        }
        String missingSensorsString = getMissingSensorsString();
        Logger logger2 = this.logger;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        logger2.e(N.a(this, sb2), "turnSensorsOn: " + missingSensorsString);
        sessionStartListener.onError(new SensorManagerError.InsufficientHardware(missingSensorsString));
    }

    public void turnOnSensor(@NonNull SensorWrapper sensorWrapper, @Nullable Sensor sensor) {
        if (sensor != null) {
            Logger logger = this.logger;
            StringBuilder sb = new StringBuilder();
            sb.append(TAG);
            logger.d(N.a(this, sb), "turnOn: sensor " + sensorWrapper.getType() + " min delay is " + sensor.getMinDelay() + ", isWakeup=" + sensor.isWakeUpSensor());
            new Thread(new Q(this, sensor, sensorWrapper, this)).start();
            return;
        }
        Logger logger2 = this.logger;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(TAG);
        logger2.w(N.a(this, sb2), "turnOn: no sensor of type " + sensorWrapper.getType());
    }
}

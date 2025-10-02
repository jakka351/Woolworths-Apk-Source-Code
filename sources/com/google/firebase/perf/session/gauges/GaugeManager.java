package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.processing.g;
import com.google.firebase.components.Lazy;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Keep
/* loaded from: classes.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private ApplicationProcessState applicationProcessState;
    private final ConfigResolver configResolver;
    private final Lazy<CpuGaugeCollector> cpuGaugeCollector;

    @Nullable
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final Lazy<ScheduledExecutorService> gaugeManagerExecutor;

    @Nullable
    private GaugeMetadataManager gaugeMetadataManager;
    private final Lazy<MemoryGaugeCollector> memoryGaugeCollector;

    @Nullable
    private String sessionId;
    private final TransportManager transportManager;
    private static final AndroidLogger logger = AndroidLogger.e();
    private static final GaugeManager instance = new GaugeManager();

    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15713a;

        static {
            int[] iArr = new int[ApplicationProcessState.values().length];
            f15713a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15713a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint
    private GaugeManager() {
        this(new Lazy(new com.google.firebase.components.b(2)), TransportManager.v, ConfigResolver.e(), null, new Lazy(new com.google.firebase.components.b(3)), new Lazy(new com.google.firebase.components.b(4)));
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        long jLongValue;
        int iOrdinal = applicationProcessState.ordinal();
        if (iOrdinal == 1) {
            ConfigResolver configResolver = this.configResolver;
            RemoteConfigManager remoteConfigManager = configResolver.f15670a;
            ConfigurationConstants.SessionsCpuCaptureFrequencyForegroundMs sessionsCpuCaptureFrequencyForegroundMsD = ConfigurationConstants.SessionsCpuCaptureFrequencyForegroundMs.d();
            Optional optionalJ = configResolver.j(sessionsCpuCaptureFrequencyForegroundMsD);
            if (optionalJ.b() && ConfigResolver.p(((Long) optionalJ.a()).longValue())) {
                jLongValue = ((Long) optionalJ.a()).longValue();
            } else {
                Optional<Long> optional = remoteConfigManager.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (optional.b() && ConfigResolver.p(((Long) optional.a()).longValue())) {
                    configResolver.c.e(((Long) optional.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) optional.a()).longValue();
                } else {
                    Optional optionalC = configResolver.c(sessionsCpuCaptureFrequencyForegroundMsD);
                    jLongValue = (optionalC.b() && ConfigResolver.p(((Long) optionalC.a()).longValue())) ? ((Long) optionalC.a()).longValue() : remoteConfigManager.isLastFetchFailed() ? 300L : 100L;
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            ConfigResolver configResolver2 = this.configResolver;
            configResolver2.getClass();
            ConfigurationConstants.SessionsCpuCaptureFrequencyBackgroundMs sessionsCpuCaptureFrequencyBackgroundMsD = ConfigurationConstants.SessionsCpuCaptureFrequencyBackgroundMs.d();
            Optional optionalJ2 = configResolver2.j(sessionsCpuCaptureFrequencyBackgroundMsD);
            if (optionalJ2.b() && ConfigResolver.p(((Long) optionalJ2.a()).longValue())) {
                jLongValue = ((Long) optionalJ2.a()).longValue();
            } else {
                Optional<Long> optional2 = configResolver2.f15670a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (optional2.b() && ConfigResolver.p(((Long) optional2.a()).longValue())) {
                    configResolver2.c.e(((Long) optional2.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) optional2.a()).longValue();
                } else {
                    Optional optionalC2 = configResolver2.c(sessionsCpuCaptureFrequencyBackgroundMsD);
                    jLongValue = (optionalC2.b() && ConfigResolver.p(((Long) optionalC2.a()).longValue())) ? ((Long) optionalC2.a()).longValue() : 0L;
                }
            }
        }
        if (CpuGaugeCollector.b(jLongValue)) {
            return -1L;
        }
        return jLongValue;
    }

    private GaugeMetadata getGaugeMetadata() {
        GaugeMetadata.Builder builderQ = GaugeMetadata.Q();
        long j = this.gaugeMetadataManager.c.totalMem;
        StorageUnit storageUnit = StorageUnit.f;
        builderQ.t(Utils.b(storageUnit.a(j)));
        builderQ.u(Utils.b(storageUnit.a(this.gaugeMetadataManager.f15714a.maxMemory())));
        builderQ.v(Utils.b(StorageUnit.e.a(this.gaugeMetadataManager.b.getMemoryClass())));
        return (GaugeMetadata) builderQ.m();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState) {
        long jLongValue;
        int iOrdinal = applicationProcessState.ordinal();
        if (iOrdinal == 1) {
            ConfigResolver configResolver = this.configResolver;
            RemoteConfigManager remoteConfigManager = configResolver.f15670a;
            ConfigurationConstants.SessionsMemoryCaptureFrequencyForegroundMs sessionsMemoryCaptureFrequencyForegroundMsD = ConfigurationConstants.SessionsMemoryCaptureFrequencyForegroundMs.d();
            Optional optionalJ = configResolver.j(sessionsMemoryCaptureFrequencyForegroundMsD);
            if (optionalJ.b() && ConfigResolver.p(((Long) optionalJ.a()).longValue())) {
                jLongValue = ((Long) optionalJ.a()).longValue();
            } else {
                Optional<Long> optional = remoteConfigManager.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (optional.b() && ConfigResolver.p(((Long) optional.a()).longValue())) {
                    configResolver.c.e(((Long) optional.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) optional.a()).longValue();
                } else {
                    Optional optionalC = configResolver.c(sessionsMemoryCaptureFrequencyForegroundMsD);
                    jLongValue = (optionalC.b() && ConfigResolver.p(((Long) optionalC.a()).longValue())) ? ((Long) optionalC.a()).longValue() : remoteConfigManager.isLastFetchFailed() ? 300L : 100L;
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            ConfigResolver configResolver2 = this.configResolver;
            configResolver2.getClass();
            ConfigurationConstants.SessionsMemoryCaptureFrequencyBackgroundMs sessionsMemoryCaptureFrequencyBackgroundMsD = ConfigurationConstants.SessionsMemoryCaptureFrequencyBackgroundMs.d();
            Optional optionalJ2 = configResolver2.j(sessionsMemoryCaptureFrequencyBackgroundMsD);
            if (optionalJ2.b() && ConfigResolver.p(((Long) optionalJ2.a()).longValue())) {
                jLongValue = ((Long) optionalJ2.a()).longValue();
            } else {
                Optional<Long> optional2 = configResolver2.f15670a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (optional2.b() && ConfigResolver.p(((Long) optional2.a()).longValue())) {
                    configResolver2.c.e(((Long) optional2.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) optional2.a()).longValue();
                } else {
                    Optional optionalC2 = configResolver2.c(sessionsMemoryCaptureFrequencyBackgroundMsD);
                    jLongValue = (optionalC2.b() && ConfigResolver.p(((Long) optionalC2.a()).longValue())) ? ((Long) optionalC2.a()).longValue() : 0L;
                }
            }
        }
        if (MemoryGaugeCollector.b(jLongValue)) {
            return -1L;
        }
        return jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CpuGaugeCollector lambda$new$0() {
        return new CpuGaugeCollector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MemoryGaugeCollector lambda$new$1() {
        return new MemoryGaugeCollector();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((CpuGaugeCollector) this.cpuGaugeCollector.get()).d(j, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        if (j == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((MemoryGaugeCollector) this.memoryGaugeCollector.get()).d(j, timer);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, ApplicationProcessState applicationProcessState) {
        GaugeMetric.Builder builderW = GaugeMetric.W();
        while (!((CpuGaugeCollector) this.cpuGaugeCollector.get()).f15712a.isEmpty()) {
            builderW.u((CpuMetricReading) ((CpuGaugeCollector) this.cpuGaugeCollector.get()).f15712a.poll());
        }
        while (!((MemoryGaugeCollector) this.memoryGaugeCollector.get()).b.isEmpty()) {
            builderW.t((AndroidMemoryReading) ((MemoryGaugeCollector) this.memoryGaugeCollector.get()).b.poll());
        }
        builderW.w(str);
        TransportManager transportManager = this.transportManager;
        transportManager.l.execute(new g(19, transportManager, (GaugeMetric) builderW.m(), applicationProcessState));
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((CpuGaugeCollector) this.cpuGaugeCollector.get(), (MemoryGaugeCollector) this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new GaugeMetadataManager(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        GaugeMetric.Builder builderW = GaugeMetric.W();
        builderW.w(str);
        builderW.v(getGaugeMetadata());
        GaugeMetric gaugeMetric = (GaugeMetric) builderW.m();
        TransportManager transportManager = this.transportManager;
        transportManager.l.execute(new g(19, transportManager, gaugeMetric, applicationProcessState));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, ApplicationProcessState applicationProcessState) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(applicationProcessState, perfSession.e);
        if (jStartCollectingGauges == -1) {
            logger.g("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = perfSession.d;
        this.sessionId = str;
        this.applicationProcessState = applicationProcessState;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new g(18, this, str, applicationProcessState), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.g("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        ApplicationProcessState applicationProcessState = this.applicationProcessState;
        ((CpuGaugeCollector) this.cpuGaugeCollector.get()).e();
        ((MemoryGaugeCollector) this.memoryGaugeCollector.get()).e();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new androidx.work.impl.b(4, this, str, applicationProcessState), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(CpuGaugeCollector cpuGaugeCollector, MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        cpuGaugeCollector.a(timer);
        memoryGaugeCollector.a(timer);
    }

    @VisibleForTesting
    public GaugeManager(Lazy<ScheduledExecutorService> lazy, TransportManager transportManager, ConfigResolver configResolver, GaugeMetadataManager gaugeMetadataManager, Lazy<CpuGaugeCollector> lazy2, Lazy<MemoryGaugeCollector> lazy3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = lazy;
        this.transportManager = transportManager;
        this.configResolver = configResolver;
        this.gaugeMetadataManager = gaugeMetadataManager;
        this.cpuGaugeCollector = lazy2;
        this.memoryGaugeCollector = lazy3;
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}

package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ConfigurationConstants {

    /* loaded from: classes.dex */
    public static final class CollectionDeactivated extends ConfigurationFlag<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static CollectionDeactivated f15671a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String b() {
            return "firebase_performance_collection_deactivated";
        }
    }

    /* loaded from: classes.dex */
    public static final class CollectionEnabled extends ConfigurationFlag<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static CollectionEnabled f15672a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "isEnabled";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String b() {
            return "firebase_performance_collection_enabled";
        }
    }

    /* loaded from: classes.dex */
    public static final class ExperimentTTID extends ConfigurationFlag<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static ExperimentTTID f15673a;

        public static synchronized ExperimentTTID d() {
            try {
                if (f15673a == null) {
                    f15673a = new ExperimentTTID();
                }
            } catch (Throwable th) {
                throw th;
            }
            return f15673a;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.ExperimentTTID";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String b() {
            return "experiment_app_start_ttid";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_experiment_app_start_ttid";
        }
    }

    public static final class FragmentSamplingRate extends ConfigurationFlag<Double> {

        /* renamed from: a, reason: collision with root package name */
        public static FragmentSamplingRate f15674a;

        public static synchronized FragmentSamplingRate d() {
            try {
                if (f15674a == null) {
                    f15674a = new FragmentSamplingRate();
                }
            } catch (Throwable th) {
                throw th;
            }
            return f15674a;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.FragmentSamplingRate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String b() {
            return "fragment_sampling_percentage";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_vc_fragment_sampling_rate";
        }
    }

    /* loaded from: classes.dex */
    public static final class LogSourceName extends ConfigurationFlag<String> {

        /* renamed from: a, reason: collision with root package name */
        public static LogSourceName f15675a;
        public static final Map b;

        /* renamed from: com.google.firebase.perf.config.ConfigurationConstants$LogSourceName$1, reason: invalid class name */
        public class AnonymousClass1 extends HashMap<Long, String> {
        }

        static {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.put(461L, "FIREPERF_AUTOPUSH");
            anonymousClass1.put(462L, "FIREPERF");
            anonymousClass1.put(675L, "FIREPERF_INTERNAL_LOW");
            anonymousClass1.put(676L, "FIREPERF_INTERNAL_HIGH");
            b = Collections.unmodifiableMap(anonymousClass1);
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.LogSourceName";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_log_source";
        }
    }

    /* loaded from: classes.dex */
    public static final class NetworkEventCountBackground extends ConfigurationFlag<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static NetworkEventCountBackground f15676a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.NetworkEventCountBackground";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_rl_network_event_count_bg";
        }
    }

    /* loaded from: classes.dex */
    public static final class NetworkEventCountForeground extends ConfigurationFlag<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static NetworkEventCountForeground f15677a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.NetworkEventCountForeground";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_rl_network_event_count_fg";
        }
    }

    /* loaded from: classes.dex */
    public static final class NetworkRequestSamplingRate extends ConfigurationFlag<Double> {

        /* renamed from: a, reason: collision with root package name */
        public static NetworkRequestSamplingRate f15678a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.NetworkRequestSamplingRate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_vc_network_request_sampling_rate";
        }
    }

    /* loaded from: classes.dex */
    public static final class RateLimitSec extends ConfigurationFlag<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static RateLimitSec f15679a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.TimeLimitSec";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_rl_time_limit_sec";
        }
    }

    /* loaded from: classes.dex */
    public static final class SdkDisabledVersions extends ConfigurationFlag<String> {

        /* renamed from: a, reason: collision with root package name */
        public static SdkDisabledVersions f15680a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.SdkDisabledVersions";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_disabled_android_versions";
        }
    }

    /* loaded from: classes.dex */
    public static final class SdkEnabled extends ConfigurationFlag<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static SdkEnabled f15681a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.SdkEnabled";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_enabled";
        }
    }

    public static final class SessionsCpuCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static SessionsCpuCaptureFrequencyBackgroundMs f15682a;

        public static synchronized SessionsCpuCaptureFrequencyBackgroundMs d() {
            try {
                if (f15682a == null) {
                    f15682a = new SessionsCpuCaptureFrequencyBackgroundMs();
                }
            } catch (Throwable th) {
                throw th;
            }
            return f15682a;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String b() {
            return "sessions_cpu_capture_frequency_bg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
        }
    }

    public static final class SessionsCpuCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static SessionsCpuCaptureFrequencyForegroundMs f15683a;

        public static synchronized SessionsCpuCaptureFrequencyForegroundMs d() {
            try {
                if (f15683a == null) {
                    f15683a = new SessionsCpuCaptureFrequencyForegroundMs();
                }
            } catch (Throwable th) {
                throw th;
            }
            return f15683a;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String b() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }
    }

    /* loaded from: classes.dex */
    public static final class SessionsMaxDurationMinutes extends ConfigurationFlag<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static SessionsMaxDurationMinutes f15684a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.SessionsMaxDurationMinutes";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String b() {
            return "sessions_max_length_minutes";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_session_max_duration_min";
        }
    }

    public static final class SessionsMemoryCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static SessionsMemoryCaptureFrequencyBackgroundMs f15685a;

        public static synchronized SessionsMemoryCaptureFrequencyBackgroundMs d() {
            try {
                if (f15685a == null) {
                    f15685a = new SessionsMemoryCaptureFrequencyBackgroundMs();
                }
            } catch (Throwable th) {
                throw th;
            }
            return f15685a;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String b() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }
    }

    public static final class SessionsMemoryCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static SessionsMemoryCaptureFrequencyForegroundMs f15686a;

        public static synchronized SessionsMemoryCaptureFrequencyForegroundMs d() {
            try {
                if (f15686a == null) {
                    f15686a = new SessionsMemoryCaptureFrequencyForegroundMs();
                }
            } catch (Throwable th) {
                throw th;
            }
            return f15686a;
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String b() {
            return "sessions_memory_capture_frequency_fg_ms";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_session_gauge_memory_capture_frequency_fg_ms";
        }
    }

    /* loaded from: classes.dex */
    public static final class SessionsSamplingRate extends ConfigurationFlag<Double> {

        /* renamed from: a, reason: collision with root package name */
        public static SessionsSamplingRate f15687a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.SessionSamplingRate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String b() {
            return "sessions_sampling_percentage";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_vc_session_sampling_rate";
        }
    }

    /* loaded from: classes.dex */
    public static final class TraceEventCountBackground extends ConfigurationFlag<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static TraceEventCountBackground f15688a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.TraceEventCountBackground";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_rl_trace_event_count_bg";
        }
    }

    /* loaded from: classes.dex */
    public static final class TraceEventCountForeground extends ConfigurationFlag<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static TraceEventCountForeground f15689a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.TraceEventCountForeground";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_rl_trace_event_count_fg";
        }
    }

    /* loaded from: classes.dex */
    public static final class TraceSamplingRate extends ConfigurationFlag<Double> {

        /* renamed from: a, reason: collision with root package name */
        public static TraceSamplingRate f15690a;

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String a() {
            return "com.google.firebase.perf.TraceSamplingRate";
        }

        @Override // com.google.firebase.perf.config.ConfigurationFlag
        public final String c() {
            return "fpr_vc_trace_sampling_rate";
        }
    }
}

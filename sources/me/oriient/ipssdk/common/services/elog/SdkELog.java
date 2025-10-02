package me.oriient.ipssdk.common.services.elog;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApi;
import me.oriient.internal.infra.utils.android.appState.AppState;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.OsData;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.elog.ELogCustomParamsAppender;
import me.oriient.internal.services.geofence.GeneralGeofenceStatusProvider;
import me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider;
import me.oriient.internal.services.runtimeDataProvider.UniqueSession;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.ELogConfig;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.base.rest.SdkOriientApiProvider;
import me.oriient.ipssdk.common.ofs.i0;
import me.oriient.ipssdk.common.ofs.k0;
import me.oriient.ipssdk.common.utils.SdkBuildData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002ABB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000b\u0010\u0010J;\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0011H\u0016¢\u0006\u0004\b\u000b\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\fJ7\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J;\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\fJ7\u0010\u0014\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J;\u0010\u0014\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\fJ7\u0010\u0015\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J;\u0010\u0015\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u0018\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u001aJC\u0010\u0018\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\fJ7\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001c\u0010\u0010J;\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\fJ7\u0010\u001d\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J;\u0010\u001d\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0012J\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\fJ7\u0010\u001e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0010J;\u0010\u001e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0012J'\u0010\u001e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u001e\u0010!J\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010\fJ7\u0010\"\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\b\"\u0010\u0010J;\u0010\"\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0012JA\u0010,\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J+\u00101\u001a\u00020\n2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0.2\u0006\u00100\u001a\u00020*H\u0016¢\u0006\u0004\b1\u00102J\u0018\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203H\u0096@¢\u0006\u0004\b5\u00106R$\u0010<\u001a\u00020*2\u0006\u00107\u001a\u00020*8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u0017\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lme/oriient/ipssdk/common/services/elog/SdkELog;", "Lme/oriient/internal/services/elog/ELog;", "Lme/oriient/internal/services/elog/ELogCustomParamsAppender;", "Lme/oriient/internal/services/elog/ELog$Type;", "logType", "<init>", "(Lme/oriient/internal/services/elog/ELog$Type;)V", "", "tag", "message", "", "io", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "metadata", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "v", "d", "i", "Lme/oriient/internal/services/elog/ELog$Level;", "level", "immediate", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/elog/ELog$Level;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lme/oriient/internal/services/elog/ELog$Level;)V", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lme/oriient/internal/services/elog/ELog$Level;)V", "api", "w", "e", "", "tr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "c", "url", "", com.salesforce.marketingcloud.config.a.k, "retries", "", "sendingIntervalSeconds", "queueSize", "", "considerGeofenceAlwaysInside", "configure", "(Ljava/lang/String;IIJIZ)V", "", "params", "shouldNotBeAnonymous", "appendCustomParams", "(Ljava/util/Map;Z)V", "", "exceptLastMinutes", "clearAllLogs", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "getEnableLogging", "()Z", "setEnableLogging", "(Z)V", "enableLogging", "getLevel", "()Lme/oriient/internal/services/elog/ELog$Level;", "setLevel", "(Lme/oriient/internal/services/elog/ELog$Level;)V", "me/oriient/ipssdk/common/ofs/j0", "a", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SdkELog implements ELog, ELogCustomParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    private final ELog.Type f25776a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private final Lazy h;
    private final Lazy i;
    private final Lazy j;
    private final Lazy k;
    private final Lazy l;
    private final Lazy m;
    private final Lazy n;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ELog.Type.values().length];
            try {
                iArr[ELog.Type.LOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ELog.Type.METRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @NotNull
        private final String value;
        public static final a SDK_TYPE = new a("SDK_TYPE", 0, "sdkType");
        public static final a USER_ID = new a("USER_ID", 1, "userId");
        public static final a SESSION_ID = new a("SESSION_ID", 2, "sessionId");
        public static final a SPACE_ID = new a("SPACE_ID", 3, "spaceId");
        public static final a USER_SESSION_ID = new a("USER_SESSION_ID", 4, "userSessionId");
        public static final a TIME_SINCE_USER_SESSION_START = new a("TIME_SINCE_USER_SESSION_START", 5, "timeSinceUserSessionStart");
        public static final a IS_IN_FOREGROUND = new a("IS_IN_FOREGROUND", 6, "isInForeground");
        public static final a TIME_SINCE_POSITIONING_START = new a("TIME_SINCE_POSITIONING_START", 7, "timeSincePositioningStart");
        public static final a LOGIN_SESSION_ID = new a("LOGIN_SESSION_ID", 8, "loginSessionId");
        public static final a TIME_SINCE_LOGIN_SESSION_START = new a("TIME_SINCE_LOGIN_SESSION_START", 9, "timeSinceLoginSessionStart");
        public static final a IS_POSITIONING_ACTIVE = new a("IS_POSITIONING_ACTIVE", 10, "isPositioningActive");
        public static final a IS_CALIBRATION_ACTIVE = new a("IS_CALIBRATION_ACTIVE", 11, "isCalibrationActive");

        private static final /* synthetic */ a[] $values() {
            return new a[]{SDK_TYPE, USER_ID, SESSION_ID, SPACE_ID, USER_SESSION_ID, TIME_SINCE_USER_SESSION_START, IS_IN_FOREGROUND, TIME_SINCE_POSITIONING_START, LOGIN_SESSION_ID, TIME_SINCE_LOGIN_SESSION_START, IS_POSITIONING_ACTIVE, IS_CALIBRATION_ACTIVE};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = EnumEntriesKt.a(aVarArr$values);
        }

        private a(String str, int i, String str2) {
            this.value = str2;
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

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public SdkELog(@NotNull ELog.Type logType) {
        Intrinsics.h(logType, "logType");
        this.f25776a = logType;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        Lazy lazyInject = di.inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.b = lazyInject;
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(OsData.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildData.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SdkBuildData.class));
        this.g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RuntimeDataProvider.class));
        this.h = DependencyInjectionKt.getDi().inject(reflectionFactory.b(EngineSessionDataProvider.class));
        this.i = DependencyInjectionKt.getDi().inject(reflectionFactory.b(DeviceIdProvider.class));
        this.j = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SdkOriientApiProvider.class));
        this.k = DependencyInjectionKt.getDi().inject(reflectionFactory.b(AppStateProvider.class));
        this.l = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.m = DependencyInjectionKt.getDi().inject(reflectionFactory.b(GeneralGeofenceStatusProvider.class));
        this.n = LazyKt.b(new k0(this));
        BuildersKt.c(CoroutineScopeKt.a(((CoroutineContextProvider) lazyInject.getD()).getDefault()), null, null, new i0(this, null), 3);
    }

    public static final BuildData access$getBuildData(SdkELog sdkELog) {
        return (BuildData) sdkELog.e.getD();
    }

    public static final RemoteConfigManager access$getConfigManager(SdkELog sdkELog) {
        return (RemoteConfigManager) sdkELog.c.getD();
    }

    public static final CoroutineContextProvider access$getCoroutineContextProvider(SdkELog sdkELog) {
        return (CoroutineContextProvider) sdkELog.b.getD();
    }

    public static final DeviceIdProvider access$getDeviceIdProvider(SdkELog sdkELog) {
        return (DeviceIdProvider) sdkELog.i.getD();
    }

    public static final GeneralGeofenceStatusProvider access$getGeneralGeofenceStatusProvider(SdkELog sdkELog) {
        return (GeneralGeofenceStatusProvider) sdkELog.m.getD();
    }

    public static final SdkOriientApiProvider access$getOriientApiProvider(SdkELog sdkELog) {
        return (SdkOriientApiProvider) sdkELog.j.getD();
    }

    public static final OsData access$getOsData(SdkELog sdkELog) {
        return (OsData) sdkELog.d.getD();
    }

    public static final RuntimeDataProvider access$getRuntimeDataProvider(SdkELog sdkELog) {
        return (RuntimeDataProvider) sdkELog.g.getD();
    }

    public static final void access$onConfigOrApiChanged(SdkELog sdkELog, ELogConfig eLogConfig, OriientApi oriientApi) {
        ELog.Level levelFromInt;
        ((ELog) sdkELog.n.getD()).configure(oriientApi != null ? oriientApi.getELogDestinationUrl() : null, eLogConfig.getELogLevelSendingBatchSize(), eLogConfig.getELogReportAttemptsLimit(), eLogConfig.getELogLevelSendingIntervalSeconds(), eLogConfig.getELogQueueSize(), eLogConfig.getConsiderGeofenceAlwaysInside());
        ELog eLog = (ELog) sdkELog.n.getD();
        int i = WhenMappings.$EnumSwitchMapping$0[sdkELog.f25776a.ordinal()];
        if (i == 1) {
            levelFromInt = ELog.Level.INSTANCE.fromInt(eLogConfig.getELogLevel());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            levelFromInt = ELog.Level.INSTANCE.fromInt(eLogConfig.getMetricsLevel());
        }
        eLog.setLevel(levelFromInt);
        ((ELog) sdkELog.n.getD()).setEnableLogging(eLogConfig.getShouldUseELog());
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void api(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).api(tag, message);
    }

    @Override // me.oriient.internal.services.elog.ELogCustomParamsAppender
    public void appendCustomParams(@NotNull Map<String, Object> params, boolean shouldNotBeAnonymous) {
        String id;
        Intrinsics.h(params, "params");
        if (shouldNotBeAnonymous) {
            String value = a.USER_ID.getValue();
            String currentUserId = ((RuntimeDataProvider) this.g.getD()).getCurrentUserId();
            if (currentUserId == null) {
                currentUserId = "UNDEFINED";
            }
            params.put(value, currentUserId);
            String value2 = a.LOGIN_SESSION_ID.getValue();
            UniqueSession uniqueSession = (UniqueSession) ((RuntimeDataProvider) this.g.getD()).getLoginSession().getValue();
            if (uniqueSession == null || (id = uniqueSession.getId()) == null) {
                id = "UNDEFINED";
            }
            params.put(value2, id);
            String value3 = a.TIME_SINCE_LOGIN_SESSION_START.getValue();
            UniqueSession uniqueSession2 = (UniqueSession) ((RuntimeDataProvider) this.g.getD()).getLoginSession().getValue();
            params.put(value3, uniqueSession2 != null ? Double.valueOf(((TimeProvider) this.l.getD()).timeIntervalSinceNowInSeconds(uniqueSession2.getStartTimeMillis())) : -1);
        }
        params.put(a.SESSION_ID.getValue(), String.valueOf(((EngineSessionDataProvider) this.h.getD()).getEngineSessionId()));
        params.put(a.USER_SESSION_ID.getValue(), ((RuntimeDataProvider) this.g.getD()).getUserSession().getId());
        params.put(a.TIME_SINCE_USER_SESSION_START.getValue(), Double.valueOf(((TimeProvider) this.l.getD()).timeIntervalSinceNowInSeconds(((RuntimeDataProvider) this.g.getD()).getUserSession().getStartTimeMillis())));
        params.put(a.IS_POSITIONING_ACTIVE.getValue(), Boolean.valueOf(((RuntimeDataProvider) this.g.getD()).getIsPositioningActive()));
        params.put(a.IS_CALIBRATION_ACTIVE.getValue(), Boolean.valueOf(((RuntimeDataProvider) this.g.getD()).getIsCalibrationActive()));
        params.put(a.SDK_TYPE.getValue(), ((SdkBuildData) this.f.getD()).getConfigSdkType());
        String value4 = a.SPACE_ID.getValue();
        String currentSpaceId = ((RuntimeDataProvider) this.g.getD()).getCurrentSpaceId();
        params.put(value4, currentSpaceId != null ? currentSpaceId : "UNDEFINED");
        params.put(a.IS_IN_FOREGROUND.getValue(), Boolean.valueOf(((AppStateProvider) this.k.getD()).getAppState().getValue() == AppState.FOREGROUND));
        String value5 = a.TIME_SINCE_POSITIONING_START.getValue();
        Long positioningSessionStartTimeMillis = ((EngineSessionDataProvider) this.h.getD()).getPositioningSessionStartTimeMillis();
        params.put(value5, Double.valueOf(positioningSessionStartTimeMillis != null ? ((TimeProvider) this.l.getD()).timeIntervalSinceNowInSeconds(positioningSessionStartTimeMillis.longValue()) : 0.0d));
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void c(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).c(tag, message);
    }

    @Override // me.oriient.internal.services.elog.ELog
    @Nullable
    public Object clearAllLogs(double d, @NotNull Continuation<? super Unit> continuation) {
        Object objClearAllLogs = ((ELog) this.n.getD()).clearAllLogs(d, continuation);
        return objClearAllLogs == CoroutineSingletons.d ? objClearAllLogs : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void configure(@Nullable String url, int maxBatchSize, int retries, long sendingIntervalSeconds, int queueSize, boolean considerGeofenceAlwaysInside) {
        ((ELog) this.n.getD()).configure(url, maxBatchSize, retries, sendingIntervalSeconds, queueSize, considerGeofenceAlwaysInside);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void d(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).d(tag, message);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void e(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).e(tag, message);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public boolean getEnableLogging() {
        return ((ELog) this.n.getD()).getEnableLogging();
    }

    @Override // me.oriient.internal.services.elog.ELog
    @NotNull
    public ELog.Level getLevel() {
        return ((ELog) this.n.getD()).getLevel();
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void i(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).i(tag, message);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void immediate(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata, @NotNull ELog.Level level) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(level, "level");
        ((ELog) this.n.getD()).immediate(tag, message, metadata, level);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void io(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).io(tag, message);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void setEnableLogging(boolean z) {
        ((ELog) this.n.getD()).setEnableLogging(z);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void setLevel(@NotNull ELog.Level value) {
        Intrinsics.h(value, "value");
        ((ELog) this.n.getD()).setLevel(value);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void v(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).v(tag, message);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void w(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).w(tag, message);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void api(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).api(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void c(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).c(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void d(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).d(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void e(@NotNull String tag, @NotNull String message, @NotNull Throwable tr) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(tr, "tr");
        ((ELog) this.n.getD()).e(tag, message, tr);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void i(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).i(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void immediate(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata, @NotNull ELog.Level level) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        Intrinsics.h(level, "level");
        ((ELog) this.n.getD()).immediate(tag, message, metadata, level);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void io(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).io(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void v(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).v(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void w(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).w(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void api(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        ((ELog) this.n.getD()).api(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void c(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        ((ELog) this.n.getD()).c(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void d(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        ((ELog) this.n.getD()).d(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void e(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        ((ELog) this.n.getD()).e(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void i(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        ((ELog) this.n.getD()).i(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void immediate(@NotNull String tag, @NotNull String message, @NotNull ELog.Level level) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(level, "level");
        ((ELog) this.n.getD()).immediate(tag, message, level);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void io(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        ((ELog) this.n.getD()).io(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void v(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        ((ELog) this.n.getD()).v(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void w(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        ((ELog) this.n.getD()).w(tag, message, metadata);
    }

    @Override // me.oriient.internal.services.elog.ELog
    public void e(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(metadata, "metadata");
        ((ELog) this.n.getD()).e(tag, message, metadata);
    }
}

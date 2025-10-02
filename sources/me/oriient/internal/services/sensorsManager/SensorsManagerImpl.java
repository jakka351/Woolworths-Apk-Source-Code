package me.oriient.internal.services.sensorsManager;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import me.oriient.internal.infra.locationManager.SystemLocationManager;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.infra.utils.android.HandlerFactory;
import me.oriient.internal.infra.utils.android.WakeLockFactory;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.OriientSensorWrapper;
import me.oriient.internal.services.sensorsManager.SensorFreezeMonitor;
import me.oriient.internal.services.sensorsManager.SensorsDataProvider;
import me.oriient.internal.services.sensorsManager.sensors.SensorReading;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataReading;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.internal.services.sensorsManager.sensors.SystemSensor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 Á\u00012\u00020\u0001:\nÂ\u0001Ã\u0001Ä\u0001Å\u0001\u0098\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020'0&2\u0006\u0010%\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b(\u0010)J!\u0010-\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00182\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\u001cH\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u001cH\u0002¢\u0006\u0004\b>\u0010<J\u0017\u0010?\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u001fH\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u001fH\u0002¢\u0006\u0004\bA\u0010@J\u000f\u0010B\u001a\u00020\"H\u0002¢\u0006\u0004\bB\u0010$J\u000f\u0010C\u001a\u00020\"H\u0002¢\u0006\u0004\bC\u0010$J\u0017\u0010D\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u001fH\u0002¢\u0006\u0004\bD\u0010EJ%\u0010K\u001a\u00020\"2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010O\u001a\u0002072\b\u0010N\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bO\u0010PJK\u0010Z\u001a\u0002072\u0006\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u00182\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020W0V2\u0006\u0010Y\u001a\u00020\u0018H\u0016¢\u0006\u0004\bZ\u0010[J\u0019\u0010^\u001a\u0002072\b\u0010]\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010b\u001a\u0002072\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bb\u0010cJ'\u0010g\u001a\u0002072\u0006\u0010%\u001a\u00020\u00182\u0006\u0010d\u001a\u00020I2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ!\u0010-\u001a\u0002072\u0006\u0010=\u001a\u00020\u001c2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010iJ\u001f\u0010l\u001a\u0002072\u0006\u0010j\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\u0018H\u0016¢\u0006\u0004\bl\u0010mJ\u001b\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020n0VH\u0016¢\u0006\u0004\bo\u0010pR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010qR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010rR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010sR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010uR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010vR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010wR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010xR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010yR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010zR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010{R\"\u0010|\u001a\u00020\u00188V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b|\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR&\u0010\u0080\u0001\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010{\u001a\u0005\b\u0080\u0001\u0010}\"\u0005\b\u0081\u0001\u0010\u007fR+\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u000200\u0012\u0005\u0012\u00030\u0082\u00010V8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010pR\u001f\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001R!\u0010\u0092\u0001\u001a\u00030\u008d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u0099\u0001\u001a\u00070\u0098\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bN\u0010\u009e\u0001R\u0018\u0010 \u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001b\u0010¢\u0001\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010¤\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0019\u0010¦\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010¨\u0001\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010§\u0001R!\u0010«\u0001\u001a\n\u0018\u00010©\u0001R\u00030ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0017\u0010d\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010§\u0001R\u0018\u0010\u00ad\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010{R\u0016\u0010%\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010{R\u001c\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001e\u0010²\u0001\u001a\t\u0012\u0004\u0012\u00020`0±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0019\u0010´\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010¥\u0001R\u0016\u0010Y\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010{R\u0017\u0010Q\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010¥\u0001R\u0017\u0010R\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010¥\u0001R\u0017\u0010·\u0001\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0017\u0010¹\u0001\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010¶\u0001R\u0017\u0010¼\u0001\u001a\u00020I8VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u0016\u0010¾\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010}R\u001c\u0010À\u0001\u001a\b\u0012\u0004\u0012\u0002000F8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u00102¨\u0006Æ\u0001"}, d2 = {"Lme/oriient/internal/services/sensorsManager/SensorsManagerImpl;", "Lme/oriient/internal/services/sensorsManager/SensorsManager;", "Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "contextProvider", "Lme/oriient/internal/infra/utils/android/HandlerFactory;", "handlerFactory", "Lme/oriient/internal/infra/utils/android/WakeLockFactory;", "wakeLockFactory", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/services/sensorsManager/SystemSensorManager;", "systemSensorManager", "Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "locationService", "Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "appStateProvider", "Lme/oriient/internal/services/sensorsManager/ForegroundServiceMonitor;", "foregroundServiceMonitor", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "", "extraPrints", "<init>", "(Lme/oriient/internal/services/elog/ELog;Lme/oriient/internal/infra/utils/android/ContextProvider;Lme/oriient/internal/infra/utils/android/HandlerFactory;Lme/oriient/internal/infra/utils/android/WakeLockFactory;Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;Lme/oriient/internal/infra/utils/core/time/TimeProvider;Lme/oriient/internal/services/sensorsManager/SystemSensorManager;Lme/oriient/internal/infra/locationManager/SystemLocationManager;Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;Lme/oriient/internal/services/sensorsManager/ForegroundServiceMonitor;Lme/oriient/internal/infra/utils/core/Logger;Z)V", "", "buffersSize", "", "Lme/oriient/internal/services/sensorsManager/OriientSensorWrapper;", "createSensorWrappers", "(I)[Lme/oriient/internal/services/sensorsManager/OriientSensorWrapper;", "", "getMissingSensorsString", "()Ljava/lang/String;", "isMultiFloorRequest", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "turnSensorsOnImpl", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sensorWrapper", "Landroid/hardware/Sensor;", "sensor", "turnOnSensor", "(Lme/oriient/internal/services/sensorsManager/OriientSensorWrapper;Landroid/hardware/Sensor;)Z", "", "Lme/oriient/internal/services/sensorsManager/sensors/SystemSensor;", "calcMissingSensors", "()Ljava/util/List;", "Landroid/hardware/SensorEvent;", "event", "isAtLeastOneEventFromEachSensorAndSetFirstValue", "(Landroid/hardware/SensorEvent;)Z", "", "processEventsBatch", "()V", "type", "getSensorIndexByType", "(I)I", "index", "getSensorTypeByIndex", "isSensorCritical", "(Lme/oriient/internal/services/sensorsManager/OriientSensorWrapper;)Z", "isBatchReady", "getBufferSizesStr", "getSensorsActualSensorsDelayStr", "getBufferTimeStr", "(Lme/oriient/internal/services/sensorsManager/OriientSensorWrapper;)Ljava/lang/String;", "", "Lme/oriient/internal/services/sensorsManager/a;", "samples", "", "delta", "calculateInternalDiffs", "(Ljava/util/List;J)Ljava/lang/String;", "Lme/oriient/internal/services/sensorsManager/SensorsDataProviderDelegate;", "delegate", "setDelegate", "(Lme/oriient/internal/services/sensorsManager/SensorsDataProviderDelegate;)V", "sensorsDataBufferSize", "maxSessionLengthMin", "", "sensorDelayMillis", "validateSamples", "", "Lme/oriient/internal/services/sensorsManager/SensorSettings;", "sensorSettings", "shouldNeverStopPressure", "configure", "(IIDZLjava/util/Map;Z)V", "Lme/oriient/internal/services/sensorsManager/TimeJumpReporter;", "timeJumpReporter", "setTimeJumpReporter", "(Lme/oriient/internal/services/sensorsManager/TimeJumpReporter;)V", "", "marker", "addMarker", "(B)V", "sessionStartTimeUTC", "Lme/oriient/internal/services/sensorsManager/SensorsDataProvider$SessionStartListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "turnSensorsOn", "(ZJLme/oriient/internal/services/sensorsManager/SensorsDataProvider$SessionStartListener;)V", "(ILandroid/hardware/Sensor;)V", "continueSession", "retainState", "turnSensorsOff", "(ZZ)V", "Lme/oriient/internal/services/sensorsManager/SensorFreezeMonitor$SensorData;", "getSensorsTimestamps", "()Ljava/util/Map;", "Lme/oriient/internal/services/elog/ELog;", "Lme/oriient/internal/infra/utils/android/ContextProvider;", "Lme/oriient/internal/infra/utils/android/WakeLockFactory;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "Lme/oriient/internal/services/sensorsManager/SystemSensorManager;", "Lme/oriient/internal/infra/locationManager/SystemLocationManager;", "Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "Lme/oriient/internal/services/sensorsManager/ForegroundServiceMonitor;", "Lme/oriient/internal/infra/utils/core/Logger;", "Z", "isValid", "()Z", "setValid", "(Z)V", "isOn", "setOn", "Lme/oriient/internal/services/sensorsManager/SensorInformation;", "sensorsInformation", "Ljava/util/Map;", "getSensorsInformation", "sensors", "[Lme/oriient/internal/services/sensorsManager/OriientSensorWrapper;", "Landroid/os/Handler;", "sensorsDataReceiver", "Landroid/os/Handler;", "sensorDataSender", "sensorDataProcessor", "Lkotlin/coroutines/CoroutineContext;", "turnOnSensorsCoroutineContext$delegate", "Lkotlin/Lazy;", "getTurnOnSensorsCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "turnOnSensorsCoroutineContext", "tag", "Ljava/lang/String;", "Lme/oriient/internal/services/sensorsManager/i;", "sensorBufferErrorsListener", "Lme/oriient/internal/services/sensorsManager/i;", "Lme/oriient/internal/services/sensorsManager/g0;", "systemSensorListener", "Lme/oriient/internal/services/sensorsManager/g0;", "Lme/oriient/internal/services/sensorsManager/y;", "sampleValidator", "Lme/oriient/internal/services/sensorsManager/y;", "Lme/oriient/internal/services/sensorsManager/SensorsDataProviderDelegate;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "didOverflow", "Ljava/util/concurrent/atomic/AtomicBoolean;", "firstGyroTimestamp", "Ljava/lang/Long;", "overflowCount", "I", "maxBatchDelay", "J", "lastBatchProcessing", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "isPressureOn", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataReading;", "lastDistinctSensorsReading", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataReading;", "Ljava/util/Queue;", "markers", "Ljava/util/Queue;", "sensorDelayMicro", "getSensorDataBufferSize", "()I", "sensorDataBufferSize", "getSensorDataBatchSize", "sensorDataBatchSize", "getSessionStartTimeMilliUTC", "()J", "sessionStartTimeMilliUTC", "getHasBarometer", "hasBarometer", "getMissingSensors", "missingSensors", "Companion", "me/oriient/internal/services/sensorsManager/a0", "me/oriient/internal/services/sensorsManager/b0", "me/oriient/internal/services/sensorsManager/e0", "me/oriient/internal/services/sensorsManager/f0", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SensorsManagerImpl implements SensorsManager {

    @Deprecated
    public static final int DEFAULT_SENSOR_DATA_BUFFER_SIZE = 2000;
    private static final int GYRO_BUFFER_EXTRA_READINGS = 5;

    @Deprecated
    public static final int SENSORS_DATA_BATCH_SIZE = 20;

    @Deprecated
    public static final int SENSOR_INDEX_ACCELEROMETER = 1;

    @Deprecated
    public static final int SENSOR_INDEX_GYROSCOPE = 0;

    @Deprecated
    public static final int SENSOR_INDEX_GYRO_UNCALIBRATED = 7;

    @Deprecated
    public static final int SENSOR_INDEX_LOCATION = 5;

    @Deprecated
    public static final int SENSOR_INDEX_MAGNETIC = 3;

    @Deprecated
    public static final int SENSOR_INDEX_MAGNETIC_UNCALIBRATED = 2;

    @Deprecated
    public static final int SENSOR_INDEX_PRESSURE = 6;

    @Deprecated
    public static final int SENSOR_INDEX_ROTATION = 4;
    private static final int SENSOR_TYPE_LOCATION = -1;

    @NotNull
    private static final String TAG = "SensorsManager";

    @NotNull
    private final AppStateProvider appStateProvider;

    @NotNull
    private final ContextProvider contextProvider;

    @NotNull
    private final CoroutineContextProvider coroutineContextProvider;

    @Nullable
    private SensorsDataProviderDelegate delegate;

    @NotNull
    private final AtomicBoolean didOverflow;

    @NotNull
    private final ELog eLog;
    private final boolean extraPrints;

    @Nullable
    private Long firstGyroTimestamp;

    @NotNull
    private final ForegroundServiceMonitor foregroundServiceMonitor;
    private boolean isMultiFloorRequest;
    private boolean isOn;
    private boolean isPressureOn;
    private boolean isValid;
    private long lastBatchProcessing;

    @Nullable
    private SensorsDataReading lastDistinctSensorsReading;

    @NotNull
    private final SystemLocationManager locationService;

    @NotNull
    private final Logger logger;

    @NotNull
    private final Queue<Byte> markers;
    private long maxBatchDelay;
    private int maxSessionLengthMin;
    private int overflowCount;

    @NotNull
    private InterfaceC1510y sampleValidator;

    @NotNull
    private final InterfaceC1495i sensorBufferErrorsListener;

    @NotNull
    private final Handler sensorDataProcessor;

    @NotNull
    private final Handler sensorDataSender;
    private int sensorDelayMicro;
    private OriientSensorWrapper[] sensors;
    private int sensorsDataBufferSize;

    @NotNull
    private final Handler sensorsDataReceiver;

    @NotNull
    private final Map<SystemSensor, SensorInformation> sensorsInformation;
    private long sessionStartTimeUTC;
    private boolean shouldNeverStopPressure;

    @NotNull
    private final g0 systemSensorListener;

    @NotNull
    private final SystemSensorManager systemSensorManager;

    @NotNull
    private final String tag;

    @NotNull
    private final TimeProvider timeProvider;

    /* renamed from: turnOnSensorsCoroutineContext$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy turnOnSensorsCoroutineContext;

    @Nullable
    private PowerManager.WakeLock wakeLock;

    @NotNull
    private final WakeLockFactory wakeLockFactory;

    @NotNull
    private static final a0 Companion = new a0();

    @NotNull
    private static final ExecutorCoroutineDispatcher SCHEDULED_POOL_EXECUTOR = new ExecutorCoroutineDispatcherImpl(new ScheduledThreadPoolExecutor(4));

    public SensorsManagerImpl(@NotNull ELog eLog, @NotNull ContextProvider contextProvider, @NotNull HandlerFactory handlerFactory, @NotNull WakeLockFactory wakeLockFactory, @NotNull CoroutineContextProvider coroutineContextProvider, @NotNull TimeProvider timeProvider, @NotNull SystemSensorManager systemSensorManager, @NotNull SystemLocationManager locationService, @NotNull AppStateProvider appStateProvider, @NotNull ForegroundServiceMonitor foregroundServiceMonitor, @NotNull Logger logger, boolean z) {
        String str;
        String str2;
        int i;
        boolean z2;
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(contextProvider, "contextProvider");
        Intrinsics.h(handlerFactory, "handlerFactory");
        Intrinsics.h(wakeLockFactory, "wakeLockFactory");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(systemSensorManager, "systemSensorManager");
        Intrinsics.h(locationService, "locationService");
        Intrinsics.h(appStateProvider, "appStateProvider");
        Intrinsics.h(foregroundServiceMonitor, "foregroundServiceMonitor");
        Intrinsics.h(logger, "logger");
        this.eLog = eLog;
        this.contextProvider = contextProvider;
        this.wakeLockFactory = wakeLockFactory;
        this.coroutineContextProvider = coroutineContextProvider;
        this.timeProvider = timeProvider;
        this.systemSensorManager = systemSensorManager;
        this.locationService = locationService;
        this.appStateProvider = appStateProvider;
        this.foregroundServiceMonitor = foregroundServiceMonitor;
        this.logger = logger;
        this.extraPrints = z;
        this.sensorsDataReceiver = handlerFactory.createHandler("sensorsDataReceiver", 10);
        this.sensorDataSender = handlerFactory.createHandler("sensorsDataSender", 3);
        this.turnOnSensorsCoroutineContext = LazyKt.b(new j0(this));
        this.tag = TAG + System.identityHashCode(this);
        this.sensorBufferErrorsListener = new e0(this);
        this.systemSensorListener = new g0(this);
        this.sampleValidator = new C1503q();
        this.didOverflow = new AtomicBoolean(false);
        this.lastBatchProcessing = -1L;
        this.sessionStartTimeUTC = -1L;
        this.markers = new ConcurrentLinkedQueue();
        this.sensorDelayMicro = (int) TimeUnit.MILLISECONDS.toMicros(10L);
        this.sensorsDataBufferSize = 2000;
        this.maxSessionLengthMin = 1440;
        Looper looper = handlerFactory.createHandlerThread("sensorsDataProcessor", 4).getLooper();
        Intrinsics.e(looper);
        this.sensorDataProcessor = new b0(this, looper);
        EnumEntries<SystemSensor> entries = SystemSensor.getEntries();
        ArrayList arrayList = new ArrayList();
        for (SystemSensor systemSensor : entries) {
            if (this.systemSensorManager.getDefaultSensor(systemSensor.getOsSensorType()) != null) {
                arrayList.add(systemSensor);
            }
        }
        int iH = MapsKt.h(CollectionsKt.s(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            SystemSensor systemSensor2 = (SystemSensor) next;
            Sensor defaultSensor = this.systemSensorManager.getDefaultSensor(systemSensor2.getOsSensorType());
            Intrinsics.e(defaultSensor);
            String name = defaultSensor.getName();
            name = name == null ? "null" : name;
            String vendor = defaultSensor.getVendor();
            String str3 = vendor != null ? vendor : "null";
            int version = defaultSensor.getVersion();
            if (defaultSensor.getFifoReservedEventCount() > 0) {
                str = name;
                str2 = str3;
                i = version;
                z2 = true;
            } else {
                str = name;
                str2 = str3;
                i = version;
                z2 = false;
            }
            linkedHashMap.put(next, new F(str, systemSensor2, str2, i, z2));
        }
        this.sensorsInformation = linkedHashMap;
        if (!this.systemSensorManager.getIsOk()) {
            this.eLog.c(this.tag, "failed to get sensors manager");
            setValid(false);
            return;
        }
        this.eLog.i(TAG, "sensor batching support", new Y(this));
        this.sensors = createSensorWrappers(this.sensorsDataBufferSize);
        List<SystemSensor> missingSensors = getMissingSensors();
        if (!missingSensors.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = missingSensors.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((SystemSensor) it2.next()).getDescription());
            }
            this.eLog.e(this.tag, "missing sensors", new Z(missingSensors));
            if (missingSensors.get(0) != SystemSensor.GYROSCOPE_UNCALIBRATED) {
                setValid(false);
                return;
            }
            this.logger.i(this.tag, "SensorsDataProvider: running on simulator or similar device");
        }
        setValid(true);
    }

    private final List<SystemSensor> calcMissingSensors() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (this.systemSensorManager.getIsOk()) {
            OriientSensorWrapper[] oriientSensorWrapperArr = this.sensors;
            if (oriientSensorWrapperArr == null) {
                Intrinsics.p("sensors");
                throw null;
            }
            int length = oriientSensorWrapperArr.length;
            while (i < length) {
                int sensorTypeByIndex = getSensorTypeByIndex(i);
                if (sensorTypeByIndex != -1 && sensorTypeByIndex != 6 && this.systemSensorManager.getDefaultSensor(sensorTypeByIndex) == null) {
                    this.logger.e(this.tag, "getMissingSensors: missing sensor " + sensorTypeByIndex);
                    SystemSensor.Companion.getClass();
                    SystemSensor systemSensorA = me.oriient.internal.services.sensorsManager.sensors.b.a(sensorTypeByIndex);
                    if (systemSensorA != null) {
                        arrayList.add(systemSensorA);
                    }
                }
                i++;
            }
        } else {
            this.eLog.c(this.tag, "getMissingSensors: No sensor manager service!");
            OriientSensorWrapper[] oriientSensorWrapperArr2 = this.sensors;
            if (oriientSensorWrapperArr2 == null) {
                Intrinsics.p("sensors");
                throw null;
            }
            int length2 = oriientSensorWrapperArr2.length;
            while (i < length2) {
                OriientSensorWrapper oriientSensorWrapper = oriientSensorWrapperArr2[i];
                if (oriientSensorWrapper.getType() != -1 && oriientSensorWrapper.getType() != 6) {
                    me.oriient.internal.services.sensorsManager.sensors.b bVar = SystemSensor.Companion;
                    int type = oriientSensorWrapper.getType();
                    bVar.getClass();
                    SystemSensor systemSensorA2 = me.oriient.internal.services.sensorsManager.sensors.b.a(type);
                    if (systemSensorA2 != null) {
                        arrayList.add(systemSensorA2);
                    }
                }
                i++;
            }
        }
        return arrayList;
    }

    private final String calculateInternalDiffs(List<C1487a> samples, long delta) {
        if (samples.isEmpty()) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder("[");
        C1487a c1487a = samples.get(0);
        int size = samples.size();
        int i = 1;
        while (i < size) {
            C1487a c1487a2 = samples.get(i);
            long jAbs = Math.abs(c1487a2.b - c1487a.b);
            if (jAbs > delta) {
                sb.append(c1487a2.f25565a);
                sb.append(":");
                sb.append(jAbs);
                sb.append(", ");
            }
            i++;
            c1487a = c1487a2;
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    private final OriientSensorWrapper[] createSensorWrappers(int buffersSize) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        OriientSensorWrapper.a aVar = OriientSensorWrapper.a.CRITICAL;
        linkedHashMap.put(0, new OriientSensorWrapper(4, aVar, 3, buffersSize, 200, this.extraPrints, this.sensorBufferErrorsListener, this.eLog, this.logger, this.timeProvider));
        linkedHashMap.put(1, new OriientSensorWrapper(1, aVar, 3, buffersSize, 200, this.extraPrints, this.sensorBufferErrorsListener, this.eLog, this.logger, this.timeProvider));
        OriientSensorWrapper.a aVar2 = OriientSensorWrapper.a.NON_CRITICAL;
        linkedHashMap.put(2, new OriientSensorWrapper(14, aVar2, 3, buffersSize, 200, this.extraPrints, this.sensorBufferErrorsListener, this.eLog, this.logger, this.timeProvider));
        linkedHashMap.put(3, new OriientSensorWrapper(2, aVar, 3, buffersSize, 200, this.extraPrints, this.sensorBufferErrorsListener, this.eLog, this.logger, this.timeProvider));
        linkedHashMap.put(4, new OriientSensorWrapper(15, aVar, 4, buffersSize, 200, this.extraPrints, this.sensorBufferErrorsListener, this.eLog, this.logger, this.timeProvider));
        linkedHashMap.put(5, new C1508w(this.extraPrints, this.eLog, this.locationService, this.coroutineContextProvider, this.logger, this.timeProvider));
        OriientSensorWrapper oriientSensorWrapper = new OriientSensorWrapper(6, OriientSensorWrapper.a.CRITICAL_MULTI_FLOOR, 2, buffersSize, 200, this.extraPrints, this.sensorBufferErrorsListener, this.eLog, this.logger, this.timeProvider);
        oriientSensorWrapper.receivedOneValue = true;
        linkedHashMap.put(6, oriientSensorWrapper);
        linkedHashMap.put(7, new OriientSensorWrapper(16, aVar2, 6, buffersSize, 200, this.extraPrints, this.sensorBufferErrorsListener, this.eLog, this.logger, this.timeProvider));
        List listU0 = CollectionsKt.u0(new h0(), linkedHashMap.entrySet());
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listU0, 10));
        Iterator it = listU0.iterator();
        while (it.hasNext()) {
            arrayList.add((OriientSensorWrapper) ((Map.Entry) it.next()).getValue());
        }
        return (OriientSensorWrapper[]) arrayList.toArray(new OriientSensorWrapper[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getBufferSizesStr() {
        StringBuilder sb = new StringBuilder("Buffer sizes: ");
        OriientSensorWrapper[] oriientSensorWrapperArr = this.sensors;
        if (oriientSensorWrapperArr == null) {
            Intrinsics.p("sensors");
            throw null;
        }
        for (OriientSensorWrapper oriientSensorWrapper : oriientSensorWrapperArr) {
            sb.append(oriientSensorWrapper.getType());
            sb.append(": ");
            sb.append(oriientSensorWrapper.getBufferSize());
            sb.append(", ");
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getBufferTimeStr(OriientSensorWrapper sensor) {
        StringBuilder sb = new StringBuilder("Sensor data timestamps nano: [");
        C1487a[] events = sensor.getEvents();
        Object[] objArrCopyOf = Arrays.copyOf(events, events.length);
        Intrinsics.g(objArrCopyOf, "copyOf(...)");
        for (Object obj : objArrCopyOf) {
            sb.append(((C1487a) obj).b);
            sb.append(",");
        }
        sb.append("]R:");
        sb.append(sensor.eventBuffer.getReadIndex());
        sb.append(",W:");
        sb.append(sensor.eventBuffer.getWriteIndex());
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getMissingSensorsString() {
        StringBuilder sb = new StringBuilder("Missing sensors: ");
        List<SystemSensor> missingSensors = getMissingSensors();
        if (!missingSensors.isEmpty()) {
            Iterator<SystemSensor> it = missingSensors.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getDescription());
                sb.append(", ");
            }
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSensorIndexByType(int type) {
        if (type == -1) {
            return 5;
        }
        if (type == 4) {
            return 0;
        }
        int i = 6;
        if (type != 6) {
            i = 1;
            if (type != 1) {
                if (type == 2) {
                    return 3;
                }
                switch (type) {
                    case 14:
                        return 2;
                    case 15:
                        return 4;
                    case 16:
                        return 7;
                    default:
                        throw new IllegalArgumentException(YU.a.e(type, "Sensor of type ", " is not supported"));
                }
            }
        }
        return i;
    }

    private final int getSensorTypeByIndex(int index) {
        switch (index) {
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
                throw new IllegalArgumentException(YU.a.e(index, "Sensor at index ", " is not supported"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSensorsActualSensorsDelayStr() {
        StringBuilder sb = new StringBuilder("Sensors last insert delay ms: ");
        OriientSensorWrapper[] oriientSensorWrapperArr = this.sensors;
        if (oriientSensorWrapperArr == null) {
            Intrinsics.p("sensors");
            throw null;
        }
        for (OriientSensorWrapper oriientSensorWrapper : oriientSensorWrapperArr) {
            sb.append(oriientSensorWrapper.getType());
            sb.append(": ");
            sb.append(oriientSensorWrapper.getActualSensorDelay());
            sb.append("; ");
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineContext getTurnOnSensorsCoroutineContext() {
        return (CoroutineContext) this.turnOnSensorsCoroutineContext.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAtLeastOneEventFromEachSensorAndSetFirstValue(SensorEvent event) {
        OriientSensorWrapper[] oriientSensorWrapperArr = this.sensors;
        if (oriientSensorWrapperArr == null) {
            Intrinsics.p("sensors");
            throw null;
        }
        for (OriientSensorWrapper oriientSensorWrapper : oriientSensorWrapperArr) {
            if (!oriientSensorWrapper.receivedOneValue && event.sensor.getType() == oriientSensorWrapper.getType()) {
                if (this.extraPrints) {
                    this.logger.d(this.tag, "sensor " + oriientSensorWrapper.getType() + " received a first value");
                }
                oriientSensorWrapper.receivedOneValue = true;
            }
        }
        OriientSensorWrapper[] oriientSensorWrapperArr2 = this.sensors;
        if (oriientSensorWrapperArr2 == null) {
            Intrinsics.p("sensors");
            throw null;
        }
        for (OriientSensorWrapper oriientSensorWrapper2 : oriientSensorWrapperArr2) {
            if (!oriientSensorWrapper2.receivedOneValue) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBatchReady(OriientSensorWrapper sensor) {
        return sensor.eventBuffer.size() >= 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSensorCritical(OriientSensorWrapper sensorWrapper) {
        Boolean forceCriticalPriority = sensorWrapper.getForceCriticalPriority();
        if (forceCriticalPriority != null) {
            return forceCriticalPriority.booleanValue();
        }
        if (sensorWrapper.getInnatePriority() != OriientSensorWrapper.a.CRITICAL) {
            return this.isMultiFloorRequest && sensorWrapper.getInnatePriority() == OriientSensorWrapper.a.CRITICAL_MULTI_FLOOR;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processEventsBatch() throws Throwable {
        long j;
        long j2;
        Long l = this.firstGyroTimestamp;
        if (l == null) {
            this.logger.w(this.tag, "processEventsBatch: No gyro timestamp");
            return;
        }
        long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
        long j3 = this.lastBatchProcessing;
        if (j3 == -1) {
            this.lastBatchProcessing = currentTimeMillis;
        } else {
            long j4 = currentTimeMillis - j3;
            if (j4 > this.maxBatchDelay) {
                this.maxBatchDelay = j4;
            }
            this.lastBatchProcessing = currentTimeMillis;
        }
        try {
            if (this.extraPrints) {
                this.logger.d(this.tag, "processEventsBatch() called");
            }
            OriientSensorWrapper[] oriientSensorWrapperArr = this.sensors;
            String str = "sensors";
            if (oriientSensorWrapperArr == null) {
                Intrinsics.p("sensors");
                throw null;
            }
            int i = 0;
            if (oriientSensorWrapperArr[0].getBufferSize() < 20) {
                return;
            }
            if (this.extraPrints) {
                this.logger.d(this.tag, getBufferSizesStr());
            }
            OriientSensorWrapper[] oriientSensorWrapperArr2 = this.sensors;
            if (oriientSensorWrapperArr2 == null) {
                Intrinsics.p("sensors");
                throw null;
            }
            List<C1487a> andRemoveFirstEvents = oriientSensorWrapperArr2[0].getAndRemoveFirstEvents(20);
            if (this.extraPrints) {
                this.logger.e(this.tag, "gyro diffs " + calculateInternalDiffs(andRemoveFirstEvents, 1000000L));
            }
            Throwable th = null;
            ArrayList arrayList = new ArrayList();
            int size = andRemoveFirstEvents.size();
            int i2 = 0;
            while (i2 < size) {
                C1487a c1487a = andRemoveFirstEvents.get(i2);
                Throwable th2 = th;
                SensorReading.GyroscopeReading gyroscopeReading = new SensorReading.GyroscopeReading(c1487a, this.timeProvider);
                OriientSensorWrapper[] oriientSensorWrapperArr3 = this.sensors;
                if (oriientSensorWrapperArr3 == null) {
                    Intrinsics.p(str);
                    throw th2;
                }
                int i3 = size;
                SensorReading.GyroscopeUncalibratedReading gyroscopeUncalibratedReading = new SensorReading.GyroscopeUncalibratedReading(oriientSensorWrapperArr3[7].getClosestEventAndRemovePriorEvents(c1487a.b), this.timeProvider);
                OriientSensorWrapper[] oriientSensorWrapperArr4 = this.sensors;
                if (oriientSensorWrapperArr4 == null) {
                    Intrinsics.p(str);
                    throw th2;
                }
                SensorReading.GameRotationVectorReading gameRotationVectorReading = new SensorReading.GameRotationVectorReading(oriientSensorWrapperArr4[4].getClosestEventAndRemovePriorEvents(c1487a.b), this.timeProvider);
                OriientSensorWrapper[] oriientSensorWrapperArr5 = this.sensors;
                if (oriientSensorWrapperArr5 == null) {
                    Intrinsics.p(str);
                    throw th2;
                }
                int i4 = i2;
                SensorReading.AccelerometerReading accelerometerReading = new SensorReading.AccelerometerReading(oriientSensorWrapperArr5[1].getClosestEventAndRemovePriorEvents(c1487a.b), this.timeProvider);
                OriientSensorWrapper[] oriientSensorWrapperArr6 = this.sensors;
                if (oriientSensorWrapperArr6 == null) {
                    Intrinsics.p(str);
                    throw th2;
                }
                SensorReading.MagneticFieldReading magneticFieldReading = new SensorReading.MagneticFieldReading(oriientSensorWrapperArr6[3].getClosestEventAndRemovePriorEvents(c1487a.b), this.timeProvider);
                OriientSensorWrapper[] oriientSensorWrapperArr7 = this.sensors;
                if (oriientSensorWrapperArr7 == null) {
                    Intrinsics.p(str);
                    throw th2;
                }
                String str2 = str;
                SensorReading.MagneticFieldUncalibratedReading magneticFieldUncalibratedReading = new SensorReading.MagneticFieldUncalibratedReading(oriientSensorWrapperArr7[2].getClosestEventAndRemovePriorEvents(c1487a.b), this.timeProvider);
                OriientSensorWrapper[] oriientSensorWrapperArr8 = this.sensors;
                if (oriientSensorWrapperArr8 == null) {
                    Intrinsics.p(str2);
                    throw th2;
                }
                SensorReading.PressureReading pressureReading = new SensorReading.PressureReading(oriientSensorWrapperArr8[6].getClosestEventAndRemovePriorEvents(c1487a.b), this.timeProvider);
                OriientSensorWrapper[] oriientSensorWrapperArr9 = this.sensors;
                if (oriientSensorWrapperArr9 == null) {
                    Intrinsics.p(str2);
                    throw th2;
                }
                arrayList.add(new SensorsDataReading(gyroscopeReading, gyroscopeUncalibratedReading, gameRotationVectorReading, accelerometerReading, magneticFieldReading, magneticFieldUncalibratedReading, pressureReading, new SensorReading.LocationReading(oriientSensorWrapperArr9[5].getClosestEventAndRemovePriorEvents(c1487a.b), this.timeProvider), this.markers.poll(), this.sessionStartTimeUTC));
                i2 = i4 + 1;
                th = th2;
                size = i3;
                str = str2;
                i = 0;
            }
            try {
                j = andRemoveFirstEvents.get(i).b;
                try {
                    j2 = andRemoveFirstEvents.get(andRemoveFirstEvents.size() - 1).b;
                } catch (Exception e) {
                    e = e;
                    this.eLog.c(this.tag, "failed to calculate start and end times of batch", MapsKt.i(new Pair("errorMessage", e.getMessage())));
                    j2 = -1;
                    SensorsDataSample sensorsDataSample = new SensorsDataSample(20, arrayList, l.longValue(), j, j2, this.sessionStartTimeUTC);
                    this.sensorDataSender.post(new androidx.camera.core.processing.g(24, this, sensorsDataSample, this.sampleValidator.a(sensorsDataSample)));
                }
            } catch (Exception e2) {
                e = e2;
                j = -1;
            }
            SensorsDataSample sensorsDataSample2 = new SensorsDataSample(20, arrayList, l.longValue(), j, j2, this.sessionStartTimeUTC);
            this.sensorDataSender.post(new androidx.camera.core.processing.g(24, this, sensorsDataSample2, this.sampleValidator.a(sensorsDataSample2)));
        } catch (Exception e3) {
            this.eLog.c(this.tag, e3.getClass().getName().concat(" in processEventsBatch"), MapsKt.i(new Pair("errorMessage", e3.getMessage())));
            this.eLog.c(this.tag, UtilsKt.stackTraceToStringOneLine(e3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void processEventsBatch$lambda$21(SensorsManagerImpl this$0, SensorsDataSample sample, List errorList) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(sample, "$sample");
        Intrinsics.h(errorList, "$errorList");
        SensorsDataProviderDelegate sensorsDataProviderDelegate = this$0.delegate;
        if (sensorsDataProviderDelegate != null) {
            sensorsDataProviderDelegate.onNewSample(sample, errorList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x013b -> B:44:0x013e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object turnSensorsOnImpl(boolean r18, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<java.lang.Boolean, me.oriient.internal.services.sensorsManager.SensorManagerError>> r19) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.sensorsManager.SensorsManagerImpl.turnSensorsOnImpl(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void addMarker(byte marker) {
        this.markers.add(Byte.valueOf(marker));
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void configure(int sensorsDataBufferSize, int maxSessionLengthMin, double sensorDelayMillis, boolean validateSamples, @NotNull Map<SystemSensor, SensorSettings> sensorSettings, boolean shouldNeverStopPressure) {
        InterfaceC1510y c1503q;
        SensorSettings sensorSettings2;
        Intrinsics.h(sensorSettings, "sensorSettings");
        this.sensorsDataBufferSize = sensorsDataBufferSize;
        this.maxSessionLengthMin = maxSessionLengthMin;
        this.sensorDelayMicro = (int) (TimeUnit.MILLISECONDS.toMicros(1L) * sensorDelayMillis);
        this.shouldNeverStopPressure = shouldNeverStopPressure;
        if (validateSamples) {
            c1503q = new A(this.logger, this.timeProvider, new f0(this));
        } else {
            if (validateSamples) {
                throw new NoWhenBranchMatchedException();
            }
            c1503q = new C1503q();
        }
        this.sampleValidator = c1503q;
        OriientSensorWrapper[] oriientSensorWrapperArr = this.sensors;
        if (oriientSensorWrapperArr == null) {
            Intrinsics.p("sensors");
            throw null;
        }
        for (OriientSensorWrapper oriientSensorWrapper : oriientSensorWrapperArr) {
            me.oriient.internal.services.sensorsManager.sensors.b bVar = SystemSensor.Companion;
            int type = oriientSensorWrapper.getType();
            bVar.getClass();
            SystemSensor systemSensorA = me.oriient.internal.services.sensorsManager.sensors.b.a(type);
            if (systemSensorA != null && (sensorSettings2 = sensorSettings.get(systemSensorA)) != null) {
                oriientSensorWrapper.updateSettings(sensorSettings2);
            }
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public boolean getHasBarometer() {
        return this.systemSensorManager.getDefaultSensor(6) != null;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    @NotNull
    public List<SystemSensor> getMissingSensors() {
        return calcMissingSensors();
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public int getSensorDataBatchSize() {
        return 20;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public int getSensorDataBufferSize() {
        return 2000;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    @NotNull
    public Map<SystemSensor, SensorInformation> getSensorsInformation() {
        return this.sensorsInformation;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsManager, me.oriient.internal.services.sensorsManager.B
    @NotNull
    public Map<Integer, SensorFreezeMonitor.SensorData> getSensorsTimestamps() {
        OriientSensorWrapper[] oriientSensorWrapperArr = this.sensors;
        if (oriientSensorWrapperArr == null) {
            Intrinsics.p("sensors");
            throw null;
        }
        int iH = MapsKt.h(oriientSensorWrapperArr.length);
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (OriientSensorWrapper oriientSensorWrapper : oriientSensorWrapperArr) {
            linkedHashMap.put(Integer.valueOf(oriientSensorWrapper.getType()), new SensorFreezeMonitor.SensorData(oriientSensorWrapper.isBufferEmpty(), oriientSensorWrapper.getLastEventUnixTimestampNano()));
        }
        return linkedHashMap;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    /* renamed from: getSessionStartTimeMilliUTC, reason: from getter */
    public long getSessionStartTimeUTC() {
        return this.sessionStartTimeUTC;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    /* renamed from: isOn, reason: from getter */
    public boolean getIsOn() {
        return this.isOn;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public boolean isValid() {
        if (!this.isValid) {
            this.logger.e(this.tag, getMissingSensorsString());
        }
        return this.isValid;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void setDelegate(@Nullable SensorsDataProviderDelegate delegate) {
        this.delegate = delegate;
    }

    public void setOn(boolean z) {
        this.isOn = z;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void setTimeJumpReporter(@Nullable TimeJumpReporter timeJumpReporter) {
    }

    public void setValid(boolean z) {
        this.isValid = z;
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void turnOnSensor(int index, @Nullable Sensor sensor) {
        try {
            OriientSensorWrapper[] oriientSensorWrapperArr = this.sensors;
            if (oriientSensorWrapperArr == null) {
                Intrinsics.p("sensors");
                throw null;
            }
            OriientSensorWrapper oriientSensorWrapper = oriientSensorWrapperArr[index];
            if (sensor == null) {
                this.logger.w(this.tag, "turnOn: no sensor of type " + oriientSensorWrapper.getType());
                return;
            }
            this.logger.d(this.tag, "turnOn: sensor " + oriientSensorWrapper.getType() + " min delay is " + sensor.getMinDelay() + ", isWakeup=" + sensor.isWakeUpSensor());
            new Thread(new i0(this, sensor, oriientSensorWrapper)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void turnSensorsOff(boolean continueSession, boolean retainState) {
        OriientSensorWrapper[] oriientSensorWrapperArr;
        this.logger.d(this.tag, "turnSensorsOff() called with: continueSession = [" + continueSession + ']');
        if (!isValid()) {
            this.logger.e(this.tag, "turnSensorsOff: unable to use sensors. see constructor log for reason");
            return;
        }
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                try {
                    wakeLock.release();
                    this.eLog.d(this.tag, "wakelock released");
                } catch (Exception e) {
                    this.eLog.e(this.tag, "turnSensorsOff: failed to release wakelock", MapsKt.i(new Pair("errorMessage", e.getMessage())));
                }
            }
            this.wakeLock = null;
        }
        setOn(false);
        if (!continueSession && !retainState) {
            this.firstGyroTimestamp = null;
        }
        this.sessionStartTimeUTC = -1L;
        try {
            oriientSensorWrapperArr = this.sensors;
        } catch (Exception e2) {
            this.eLog.c(this.tag, "turnSensorsOff: failed to unregister listener", MapsKt.i(new Pair("errorMessage", e2.getMessage())));
        }
        if (oriientSensorWrapperArr == null) {
            Intrinsics.p("sensors");
            throw null;
        }
        for (OriientSensorWrapper oriientSensorWrapper : oriientSensorWrapperArr) {
            if (oriientSensorWrapper.getType() != -1 && (oriientSensorWrapper.getType() != 6 || !this.shouldNeverStopPressure)) {
                this.logger.d(this.tag, "turnSensorsOff: unregistering sensor listener " + oriientSensorWrapper.getType());
                this.systemSensorManager.unregisterListener(this.systemSensorListener, this.systemSensorManager.getDefaultSensor(oriientSensorWrapper.getType()));
                if (oriientSensorWrapper.getType() == 6) {
                    this.isPressureOn = false;
                }
            }
        }
        OriientSensorWrapper[] oriientSensorWrapperArr2 = this.sensors;
        if (oriientSensorWrapperArr2 == null) {
            Intrinsics.p("sensors");
            throw null;
        }
        for (OriientSensorWrapper oriientSensorWrapper2 : oriientSensorWrapperArr2) {
            oriientSensorWrapper2.turnOff(retainState);
        }
        this.lastDistinctSensorsReading = null;
        this.foregroundServiceMonitor.stopMonitoring();
    }

    @Override // me.oriient.internal.services.sensorsManager.SensorsDataProvider
    public void turnSensorsOn(boolean isMultiFloorRequest, long sessionStartTimeUTC, @NotNull SensorsDataProvider.SessionStartListener listener) {
        Intrinsics.h(listener, "listener");
        BuildersKt.c(CoroutineScopeKt.a(this.coroutineContextProvider.getDefault()), null, null, new k0(this, listener, isMultiFloorRequest, sessionStartTimeUTC, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean turnOnSensor(OriientSensorWrapper sensorWrapper, Sensor sensor) {
        Sensor sensor2;
        int i;
        if (sensor == null) {
            this.logger.w(this.tag, "turnOn: no sensor of type " + sensorWrapper.getType());
            return false;
        }
        this.logger.d(this.tag, "turnOn: sensor " + sensorWrapper.getType() + " min delay is " + sensor.getMinDelay() + ", isWakeup=" + sensor.isWakeUpSensor());
        try {
            int i2 = this.sensorDelayMicro;
            int minDelay = sensor.getMinDelay();
            i = i2 < minDelay ? minDelay : i2;
            sensorWrapper.setSensorDelay(i);
            sensor2 = sensor;
        } catch (Exception e) {
            e = e;
            sensor2 = sensor;
        }
        try {
            if (!this.systemSensorManager.registerListener(this.systemSensorListener, sensor2, i, sensorWrapper.getMaxReportLatencyMicroSec(), this.sensorsDataReceiver)) {
                this.eLog.e(this.tag, "failed to start sensor", MapsKt.i(new Pair("sensorType", Integer.valueOf(sensor2.getType()))));
                return false;
            }
            this.eLog.d(this.tag, "started sensor", MapsKt.i(new Pair("sensorType", Integer.valueOf(sensor2.getType()))));
            if (sensorWrapper.getType() == 6) {
                this.isPressureOn = true;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            this.eLog.c(this.tag, "error starting sensor", MapsKt.j(new Pair("sensorType", Integer.valueOf(sensor2.getType())), new Pair("errorMessage", e.getMessage())));
            return false;
        }
    }

    public /* synthetic */ SensorsManagerImpl(ELog eLog, ContextProvider contextProvider, HandlerFactory handlerFactory, WakeLockFactory wakeLockFactory, CoroutineContextProvider coroutineContextProvider, TimeProvider timeProvider, SystemSensorManager systemSensorManager, SystemLocationManager systemLocationManager, AppStateProvider appStateProvider, ForegroundServiceMonitor foregroundServiceMonitor, Logger logger, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eLog, contextProvider, handlerFactory, wakeLockFactory, coroutineContextProvider, timeProvider, systemSensorManager, systemLocationManager, appStateProvider, foregroundServiceMonitor, logger, (i & 2048) != 0 ? false : z);
    }
}

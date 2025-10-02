package me.oriient.ipssdk.realtime.ips;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.realtime.ofs.B3;
import me.oriient.ipssdk.realtime.ofs.C1749x3;
import me.oriient.positioningengine.common.EngineStopReason;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/PositioningKotlinHelper;", "", "<init>", "()V", "", "initiatedByUser", "", "Lme/oriient/internal/services/dataManager/building/Floor;", "floors", "Lme/oriient/ipssdk/api/models/IPSStartingPosition;", "startingPosition", "Lme/oriient/internal/infra/locationManager/SystemLocation;", "startLocation", "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "startPositioning", "(ZLjava/util/List;Lme/oriient/ipssdk/api/models/IPSStartingPosition;Lme/oriient/internal/infra/locationManager/SystemLocation;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "Lme/oriient/positioningengine/common/EngineStopReason;", "reason", "stopPositioning", "(Lme/oriient/positioningengine/common/EngineStopReason;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "Companion", "me/oriient/ipssdk/realtime/ofs/x3", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PositioningKotlinHelper {

    @NotNull
    private static final C1749x3 Companion = new C1749x3();

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25850a;
    private final Lazy b;
    private final Lazy c;
    private final CoroutineScope d;
    private IPSError e;
    private Job f;

    public PositioningKotlinHelper() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25850a = di.inject(reflectionFactory.b(Logger.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.d = CoroutineScopeKt.a(Dispatchers.f24691a);
    }

    public static final RemoteConfigManager access$getConfigManager(PositioningKotlinHelper positioningKotlinHelper) {
        return (RemoteConfigManager) positioningKotlinHelper.b.getD();
    }

    public static final ELog access$getELog(PositioningKotlinHelper positioningKotlinHelper) {
        return (ELog) positioningKotlinHelper.c.getD();
    }

    public static final Logger access$getLogger(PositioningKotlinHelper positioningKotlinHelper) {
        return (Logger) positioningKotlinHelper.f25850a.getD();
    }

    public final void startPositioning(boolean initiatedByUser, @NotNull List<Floor> floors, @Nullable IPSStartingPosition startingPosition, @Nullable SystemLocation startLocation, @NotNull IPSCompletionListener listener) {
        Job job;
        Intrinsics.h(floors, "floors");
        Intrinsics.h(listener, "listener");
        Job jobC = BuildersKt.c(this.d, null, null, new B3(floors, null, startLocation, listener, startingPosition, this, initiatedByUser), 3);
        Job job2 = this.f;
        if (job2 != null && job2.isActive() && (job = this.f) != null) {
            job.cancel((CancellationException) null);
        }
        this.f = jobC;
    }

    public final void stopPositioning(@NotNull EngineStopReason reason, @NotNull IPSCompletionListener listener) {
        Job job;
        Intrinsics.h(reason, "reason");
        Intrinsics.h(listener, "listener");
        Job job2 = this.f;
        if (job2 != null && job2.isActive() && (job = this.f) != null) {
            job.cancel((CancellationException) null);
        }
        this.f = null;
        CoreLogic.INSTANCE.stopPositioning(reason, listener);
    }
}

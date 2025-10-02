package me.oriient.internal.services.eventManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.eventManager.model.EventManagerConfig;
import me.oriient.internal.services.eventManager.model.EventManagerContext;
import me.oriient.internal.services.websocket.SocketProvider;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lme/oriient/internal/services/eventManager/EventManagerFactoryImpl;", "Lme/oriient/internal/services/eventManager/EventManagerFactory;", "socketProvider", "Lme/oriient/internal/services/websocket/SocketProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "eLog", "Lme/oriient/internal/services/elog/ELog;", "networkManager", "Lme/oriient/internal/infra/networkManager/NetworkManager;", "(Lme/oriient/internal/services/websocket/SocketProvider;Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;Lme/oriient/internal/services/elog/ELog;Lme/oriient/internal/infra/networkManager/NetworkManager;)V", "create", "Lme/oriient/internal/services/eventManager/EventManager;", "context", "Lme/oriient/internal/services/eventManager/model/EventManagerContext;", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/eventManager/model/EventManagerConfig;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventManagerFactoryImpl implements EventManagerFactory {

    @NotNull
    private final CoroutineContextProvider coroutineContextProvider;

    @NotNull
    private final ELog eLog;

    @NotNull
    private final NetworkManager networkManager;

    @NotNull
    private final SocketProvider socketProvider;

    public EventManagerFactoryImpl(@NotNull SocketProvider socketProvider, @NotNull CoroutineContextProvider coroutineContextProvider, @NotNull ELog eLog, @NotNull NetworkManager networkManager) {
        Intrinsics.h(socketProvider, "socketProvider");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(networkManager, "networkManager");
        this.socketProvider = socketProvider;
        this.coroutineContextProvider = coroutineContextProvider;
        this.eLog = eLog;
        this.networkManager = networkManager;
    }

    @Override // me.oriient.internal.services.eventManager.EventManagerFactory
    @NotNull
    public EventManager create(@NotNull EventManagerContext context, @NotNull EventManagerConfig config) {
        Intrinsics.h(context, "context");
        Intrinsics.h(config, "config");
        return new w(context, config, this.socketProvider, this.eLog, this.networkManager, this.coroutineContextProvider);
    }
}

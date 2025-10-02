package me.oriient.internal.services.websocket;

import androidx.annotation.Keep;
import java.net.URI;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.websocket.util.ELogIOManager;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/websocket/SocketProviderImpl;", "Lme/oriient/internal/services/websocket/SocketProvider;", "Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/services/websocket/util/ELogIOManager;", "eLogIOManager", "<init>", "(Lme/oriient/internal/services/elog/ELog;Lme/oriient/internal/services/websocket/util/ELogIOManager;)V", "Ljava/net/URI;", "uri", "Lme/oriient/internal/services/websocket/e;", "getSocket", "(Ljava/net/URI;)Lme/oriient/internal/services/websocket/e;", "Lme/oriient/internal/services/elog/ELog;", "Lme/oriient/internal/services/websocket/util/ELogIOManager;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SocketProviderImpl implements SocketProvider {

    @NotNull
    private final ELog eLog;

    @NotNull
    private final ELogIOManager eLogIOManager;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    public SocketProviderImpl(@NotNull ELog eLog, @NotNull ELogIOManager eLogIOManager) {
        Intrinsics.h(eLog, "eLog");
        Intrinsics.h(eLogIOManager, "eLogIOManager");
        this.eLog = eLog;
        this.eLogIOManager = eLogIOManager;
        this.logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    @Override // me.oriient.internal.services.websocket.SocketProvider
    @NotNull
    public e getSocket(@NotNull URI uri) {
        Intrinsics.h(uri, "uri");
        return new e(this.eLogIOManager, uri, this.eLog, getLogger());
    }
}

package defpackage;

import android.content.Context;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjectionImpl;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.scheduler.ExistingWorkPolicy;
import me.oriient.internal.infra.scheduler.ScheduleOptions;
import me.oriient.internal.infra.scheduler.ScheduleOptionsKt;
import me.oriient.internal.infra.scheduler.Scheduler;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.remoteLog.GlobalOptions;
import me.oriient.internal.services.remoteLog.RemoteLog;
import me.oriient.internal.services.remoteLog.RemoteLogOptions;
import me.oriient.internal.services.remoteLog.di.i;
import me.oriient.internal.services.remoteLog.e;
import me.oriient.internal.services.remoteLog.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\r\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"LRemoteLoggerFactory;", "", "()V", "_globalOptions", "Lme/oriient/internal/services/remoteLog/GlobalOptions;", "failsafeTaskSet", "", "globalOptions", "Lme/oriient/internal/services/remoteLog/RemoteLogOptions;", "getGlobalOptions", "()Lme/oriient/internal/services/remoteLog/RemoteLogOptions;", "<set-?>", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "configureGlobal", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "create", "Lme/oriient/internal/services/remoteLog/RemoteLog;", "context", "Landroid/content/Context;", "url", "", "enableLogging", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RemoteLoggerFactory {

    @NotNull
    public static final RemoteLoggerFactory INSTANCE = new RemoteLoggerFactory();

    @NotNull
    private static final GlobalOptions _globalOptions = new GlobalOptions();
    private static boolean failsafeTaskSet;

    @Nullable
    private static Logger logger;

    private RemoteLoggerFactory() {
    }

    public final void configureGlobal(@NotNull Function1<? super GlobalOptions, Unit> block) {
        Intrinsics.h(block, "block");
        block.invoke(_globalOptions);
    }

    @NotNull
    public final RemoteLog create(@NotNull Context context, @NotNull String url) {
        Intrinsics.h(context, "context");
        Intrinsics.h(url, "url");
        i.a(context);
        if (!failsafeTaskSet) {
            failsafeTaskSet = true;
            DependencyInjectionImpl dependencyInjectionImpl = i.f25535a;
            if (dependencyInjectionImpl == null) {
                Intrinsics.p("di");
                throw null;
            }
            e eVar = (e) dependencyInjectionImpl.get(Reflection.f24268a.b(e.class));
            eVar.getClass();
            ((Scheduler) eVar.c.getD()).mo361schedulePsKNH0(ScheduleOptionsKt.getAsWorkTag("logging_failsafe_task"), f.class, new ScheduleOptions(false, true, ExistingWorkPolicy.REPLACE));
        }
        return new RemoteLogImpl(url);
    }

    public final void enableLogging(@NotNull Context context, @Nullable Logger logger2) {
        Intrinsics.h(context, "context");
        i.a(context);
        logger = logger2;
        DependencyInjectionImpl dependencyInjectionImpl = i.f25535a;
        if (dependencyInjectionImpl == null) {
            Intrinsics.p("di");
            throw null;
        }
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        ((NetworkManager) dependencyInjectionImpl.get(reflectionFactory.b(NetworkManager.class))).setLogger(logger2);
        DependencyInjectionImpl dependencyInjectionImpl2 = i.f25535a;
        if (dependencyInjectionImpl2 == null) {
            Intrinsics.p("di");
            throw null;
        }
        ((Scheduler) dependencyInjectionImpl2.get(reflectionFactory.b(Scheduler.class))).setLogger(logger2);
        DependencyInjectionImpl dependencyInjectionImpl3 = i.f25535a;
        if (dependencyInjectionImpl3 != null) {
            ((RestService) dependencyInjectionImpl3.get(reflectionFactory.b(RestService.class))).setLogger(logger2);
        } else {
            Intrinsics.p("di");
            throw null;
        }
    }

    @NotNull
    public final RemoteLogOptions getGlobalOptions() {
        return _globalOptions;
    }

    @Nullable
    public final Logger getLogger() {
        return logger;
    }
}

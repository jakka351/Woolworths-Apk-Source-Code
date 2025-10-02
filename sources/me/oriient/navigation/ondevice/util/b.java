package me.oriient.navigation.ondevice.util;

import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import me.oriient.navigation.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class b implements NavAlgoCoreErrorHandler {

    @NotNull
    private static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26359a;
    public final Lazy b;
    public String c;

    public b() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26359a = dependencyInjectionA.inject(reflectionFactory.b(ELog.class));
        this.b = DiKt.a().inject(reflectionFactory.b(Logger.class));
    }

    @Override // me.oriient.navigation.ondevice.util.NavAlgoCoreErrorHandler
    public final String consumeError() {
        String str = this.c;
        if (str == null) {
            return null;
        }
        this.c = null;
        return str;
    }

    @Override // me.oriient.navigation.ondevice.util.NavAlgoCoreErrorHandler
    public final void handleEngineError(String str) {
        ((Logger) this.b.getD()).e("NavAlgoCoreErrorHandler", "handleEngineError() called with: message = " + str + ", sendLog = true, parametersAppender = null");
        if (str == null) {
            str = "Unknown reason";
        }
        ((ELog) this.f26359a.getD()).e("NavAlgoCoreErrorHandler", "Critical engine error", MapsKt.l(new Pair("errorMessage", StringsKt.f0(150, str))));
        this.c = str;
    }

    @Override // me.oriient.navigation.ondevice.util.NavAlgoCoreErrorHandler
    public final void handleEngineSignal(String str, String str2, int i) {
        Logger logger = (Logger) this.b.getD();
        StringBuilder sbV = YU.a.v("handleEngineSignal() called with: signalName = ", str, ", methodName = ", str2, ", stageNum = ");
        sbV.append(i);
        logger.e("NavAlgoCoreErrorHandler", sbV.toString());
        String str3 = str == null ? "unexpected signal" : str;
        ((ELog) this.f26359a.getD()).c("NavAlgoCoreErrorHandler", "Engine crashed", MapsKt.j(new Pair("signal", str), new Pair("methodName", str2), new Pair("stageNum", Integer.valueOf(i))));
        this.c = str3;
    }

    @Override // me.oriient.navigation.ondevice.util.NavAlgoCoreErrorHandler
    public final void sendEngineLog(String message) {
        Intrinsics.h(message, "message");
        kotlin.reflect.jvm.internal.impl.types.checker.a.q("logMessage", StringsKt.f0(150, message), (ELog) this.f26359a.getD(), "NavAlgoCoreErrorHandler", "Engine log");
    }
}

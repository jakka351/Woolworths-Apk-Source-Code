package me.oriient.positioningengine.ondevice.util;

import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c implements EngineErrorHandler {

    @NotNull
    private static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final MutableSharedFlow f26482a = UtilsKt.MutableSharedFlowConfigured();
    public boolean b = true;
    public final Lazy c = DiKt.getDi().inject(Reflection.f24268a.b(ELog.class));

    @Override // me.oriient.positioningengine.ondevice.util.EngineErrorHandler
    public final SharedFlow getEngineErrorFlow() {
        return this.f26482a;
    }

    @Override // me.oriient.positioningengine.ondevice.util.EngineErrorHandler
    public final void handleEngineError(String str) {
        handleEngineError(str, true, b.f26481a);
    }

    @Override // me.oriient.positioningengine.ondevice.util.EngineErrorHandler
    public final void handleEngineSignal(String str, String str2, int i) {
        String str3 = str == null ? "unexpected signal" : str;
        ((ELog) this.c.getD()).c("EngineErrorHandler", "Engine crashed", MapsKt.j(new Pair("signal", str), new Pair("methodName", str2), new Pair("stageNum", Integer.valueOf(i))));
        this.b = false;
        this.f26482a.f(str3);
    }

    @Override // me.oriient.positioningengine.ondevice.util.EngineErrorHandler
    public final void handleTimestampIssue() {
        ((ELog) this.c.getD()).immediate("EngineErrorHandler", "timestampIssue", ELog.Level.SEVERE);
        this.b = false;
        this.f26482a.f("Failed to figure out what time is it");
    }

    @Override // me.oriient.positioningengine.ondevice.util.EngineErrorHandler
    public final boolean isEngineOkay() {
        return this.b;
    }

    @Override // me.oriient.positioningengine.ondevice.util.EngineErrorHandler
    public final void onEngineTerminated() {
        this.b = true;
    }

    @Override // me.oriient.positioningengine.ondevice.util.EngineErrorHandler
    public final void sendEngineLog(String message) {
        Intrinsics.h(message, "message");
        kotlin.reflect.jvm.internal.impl.types.checker.a.q("logMessage", StringsKt.f0(150, message), (ELog) this.c.getD(), "EngineErrorHandler", "Engine log");
    }

    @Override // me.oriient.positioningengine.ondevice.util.EngineErrorHandler
    public final void handleEngineError(String str, boolean z) {
        handleEngineError(str, z, b.f26481a);
    }

    @Override // me.oriient.positioningengine.ondevice.util.EngineErrorHandler
    public final void handleEngineError(String str, Function1 parametersAppender) {
        Intrinsics.h(parametersAppender, "parametersAppender");
        handleEngineError(str, true, parametersAppender);
    }

    @Override // me.oriient.positioningengine.ondevice.util.EngineErrorHandler
    public final void handleEngineError(String str, boolean z, Function1 parametersAppender) {
        Intrinsics.h(parametersAppender, "parametersAppender");
        if (str == null) {
            str = "Unknown reason";
        }
        if (z) {
            ELog eLog = (ELog) this.c.getD();
            LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("errorMessage", StringsKt.f0(150, str)));
            parametersAppender.invoke(linkedHashMapL);
            eLog.e("EngineErrorHandler", "Critical engine error", linkedHashMapL);
        }
        this.b = false;
        this.f26482a.f(str);
    }
}

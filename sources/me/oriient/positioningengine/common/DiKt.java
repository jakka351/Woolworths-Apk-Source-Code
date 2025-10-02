package me.oriient.positioningengine.common;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.di.DependencyInjectionImpl;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.dataManager.engine.EngineVersionProvider;
import me.oriient.internal.services.eventManager.EventManagerFactory;
import me.oriient.internal.services.websocket.util.ELogIOManager;
import me.oriient.positioningengine.common.mainOrientation.MainOrientationCalculator;
import me.oriient.positioningengine.ondevice.L;
import me.oriient.positioningengine.ondevice.calibration.CalibrationInfoDatabase;
import me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager;
import me.oriient.positioningengine.ondevice.mappingData.MappingDataProvider;
import me.oriient.positioningengine.ondevice.ml.MlModelFactory;
import me.oriient.positioningengine.ondevice.util.EngineErrorHandler;
import me.oriient.positioningengine.support.InterfaceC1840b;
import me.oriient.positioningengine.support.InterfaceC1847g;
import me.oriient.positioningengine.support.X;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0006\u001a\u0002H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0080\b¢\u0006\u0002\u0010\u000b\u001a!\u0010\f\u001a\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0002\b\u0010H\u0000\u001a\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0001\u001a\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0014\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\bH\u0080\b\u001a#\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0014\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0080\b\u001a1\u0010\u0015\u001a\u00020\r\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\b\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0017H\u0082\b\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0018"}, d2 = {"di", "Lme/oriient/internal/infra/di/DependencyInjection;", "getDi", "()Lme/oriient/internal/infra/di/DependencyInjection;", "setDi", "(Lme/oriient/internal/infra/di/DependencyInjection;)V", "get", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/internal/infra/utils/core/DiProvidable;", "named", "", "(Ljava/lang/String;)Lme/oriient/internal/infra/utils/core/DiProvidable;", "initializeDiTest", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "initializePositioningEngineDi", "diBase", "inject", "Lkotlin/Lazy;", "registerSingleton", "creator", "Lkotlin/Function0;", "service-positioning-engine_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DiKt {
    public static DependencyInjection di;

    public static final <T extends DiProvidable> T get(String str) {
        getDi();
        Intrinsics.o();
        throw null;
    }

    public static DiProvidable get$default(String str, int i, Object obj) {
        getDi();
        Intrinsics.o();
        throw null;
    }

    @NotNull
    public static final DependencyInjection getDi() {
        DependencyInjection dependencyInjection = di;
        if (dependencyInjection != null) {
            return dependencyInjection;
        }
        Intrinsics.p("di");
        throw null;
    }

    public static final void initializeDiTest(@NotNull Function1<? super DependencyInjection, Unit> block) {
        Intrinsics.h(block, "block");
        setDi(new DependencyInjectionImpl(null, false, 3, 0 == true ? 1 : 0));
        block.invoke(getDi());
    }

    public static final void initializePositioningEngineDi(@NotNull DependencyInjection diBase) {
        Intrinsics.h(diBase, "diBase");
        if (di != null) {
            return;
        }
        setDi(diBase);
        l lVar = l.f26383a;
        DependencyInjection di2 = getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        di2.registerSingleton(reflectionFactory.b(EventManagerFactory.class), null, lVar);
        getDi().registerSingleton(reflectionFactory.b(ELogIOManager.class), null, m.f26384a);
        getDi().registerSingleton(reflectionFactory.b(L.class), null, n.f26386a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.positioningengine.ondevice.ndkBridge.a.class), null, o.f26387a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.positioningengine.ondevice.ml.b.class), null, p.f26388a);
        getDi().registerSingleton(reflectionFactory.b(CalibrationInfoDatabase.class), null, q.f26389a);
        getDi().registerSingleton(reflectionFactory.b(MlModelFactory.class), null, r.f26390a);
        DependencyInjection.DefaultImpls.registerSingleton$default(getDi(), reflectionFactory.b(PositioningDebuggingManager.class), null, s.f26391a, 2, null);
        getDi().registerSingleton(reflectionFactory.b(EngineVersionProvider.class), null, t.f26392a);
        getDi().registerSingleton(reflectionFactory.b(EngineErrorHandler.class), null, b.f26371a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.positioningengine.common.config.c.class), null, c.f26372a);
        getDi().registerSingleton(reflectionFactory.b(MappingDataProvider.class), null, d.f26375a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.positioningengine.ondevice.ml.p.class), null, e.f26376a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.positioningengine.ondevice.ml.i.class), null, f.f26377a);
        getDi().registerSingleton(reflectionFactory.b(me.oriient.positioningengine.support.device_data.a.class), null, g.f26378a);
        getDi().registerSingleton(reflectionFactory.b(InterfaceC1847g.class), null, h.f26379a);
        getDi().registerSingleton(reflectionFactory.b(InterfaceC1840b.class), null, i.f26380a);
        getDi().registerSingleton(reflectionFactory.b(X.class), null, j.f26381a);
        getDi().registerSingleton(reflectionFactory.b(MainOrientationCalculator.class), null, k.f26382a);
    }

    public static final <T extends DiProvidable> Lazy<T> inject() {
        getDi();
        Intrinsics.o();
        throw null;
    }

    private static final <T extends DiProvidable> void registerSingleton(String str, Function0<? extends T> function0) {
        getDi();
        Intrinsics.o();
        throw null;
    }

    public static void registerSingleton$default(String str, Function0 function0, int i, Object obj) {
        getDi();
        Intrinsics.o();
        throw null;
    }

    public static final void setDi(@NotNull DependencyInjection dependencyInjection) {
        Intrinsics.h(dependencyInjection, "<set-?>");
        di = dependencyInjection;
    }

    public static final <T extends DiProvidable> Lazy<T> inject(String named) {
        Intrinsics.h(named, "named");
        getDi();
        Intrinsics.o();
        throw null;
    }
}

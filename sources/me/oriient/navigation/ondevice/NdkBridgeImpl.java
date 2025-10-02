package me.oriient.navigation.ondevice;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.elog.Metric;
import me.oriient.navigation.common.DiKt;
import me.oriient.navigation.common.util.NavigationError;
import me.oriient.navigation.ondevice.util.NavAlgoCoreErrorHandler;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lme/oriient/navigation/ondevice/NdkBridgeImpl;", "Lme/oriient/navigation/ondevice/p;", "Lme/oriient/navigation/ondevice/NavigationData;", "navigationData", "", "initNavigationNative", "(Lme/oriient/navigation/ondevice/NavigationData;)V", "Lme/oriient/navigation/ondevice/NavigationInput;", "navigationInput", "Lme/oriient/navigation/ondevice/NavigationOutput;", "findRouteInBuildingNative", "(Lme/oriient/navigation/ondevice/NavigationInput;)Lme/oriient/navigation/ondevice/NavigationOutput;", "terminateEngineNative", "()V", "Companion", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class NdkBridgeImpl implements p {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static boolean f;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26281a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0082 J\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lme/oriient/navigation/ondevice/NdkBridgeImpl$Companion;", "", "()V", "TAG", "", "isNativeEngineInitialized", "", "enableMocksNative", "", "enable", "nativeInit", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "navAlgoCoreErrorHandler", "Lme/oriient/navigation/ondevice/util/NavAlgoCoreErrorHandler;", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final native void enableMocksNative(boolean enable);

        /* JADX INFO: Access modifiers changed from: private */
        public final native void nativeInit(Logger logger, NavAlgoCoreErrorHandler navAlgoCoreErrorHandler);

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        System.loadLibrary("navigation");
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        companion.nativeInit((Logger) dependencyInjectionA.get(reflectionFactory.b(Logger.class), null), (NavAlgoCoreErrorHandler) DiKt.a().get(reflectionFactory.b(NavAlgoCoreErrorHandler.class), null));
        companion.enableMocksNative(false);
    }

    public NdkBridgeImpl() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26281a = dependencyInjectionA.inject(reflectionFactory.b(Logger.class));
        this.b = DiKt.a().inject(reflectionFactory.b(TimeProvider.class));
        this.c = DiKt.a().inject(reflectionFactory.b(ELog.class));
        this.d = DiKt.a().inject(reflectionFactory.b(Metric.class));
        this.e = DiKt.a().inject(reflectionFactory.b(NavAlgoCoreErrorHandler.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native NavigationOutput findRouteInBuildingNative(NavigationInput navigationInput);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void initNavigationNative(NavigationData navigationData);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void terminateEngineNative();

    public final Outcome a(Function0 function0) {
        try {
            Object objInvoke = function0.invoke();
            String strConsumeError = ((NavAlgoCoreErrorHandler) this.e.getD()).consumeError();
            if (strConsumeError == null) {
                return new Outcome.Success(objInvoke);
            }
            return new Outcome.Failure(new NavigationError.AlgoCoreError(strConsumeError));
        } catch (Exception e) {
            ((Logger) this.f26281a.getD()).e("NdkBridge", "ndk failed!", e);
            String message = e.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            return new Outcome.Failure(new NavigationError.AlgoCoreError(message));
        }
    }
}

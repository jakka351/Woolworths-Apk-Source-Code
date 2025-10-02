package me.oriient.navigation.turnByTurn;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.dataModel.navigation.turnByTurn.TurnByTurnConfig;
import me.oriient.navigation.common.DiKt;
import me.oriient.navigation.common.InterfaceC1781w;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.models.Route;
import me.oriient.navigation.common.models.Turn;
import me.oriient.navigation.turnByTurn.models.NavigationInstruction;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010=R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010?\"\u0004\b@\u0010\b¨\u0006C"}, d2 = {"Lme/oriient/navigation/turnByTurn/TurnByTurnNavigationManagerImpl;", "Lme/oriient/navigation/turnByTurn/TurnByTurnNavigationManager;", "<init>", "()V", "", "isEnabled", "", "onEnabledChanged", "(Z)V", "Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;", MlModel.MODEL_FILE_SUFFIX, "onNewConfig", "(Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/navigation/common/models/Route;", "route", "Lme/oriient/navigation/common/models/NavigationPosition;", "userPosition", "onRouteUpdate", "(Lme/oriient/navigation/common/models/Route;Lme/oriient/navigation/common/models/NavigationPosition;)V", "reset", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lme/oriient/navigation/turnByTurn/models/NavigationInstruction;", "instructionsUpdates", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getInstructionsUpdates", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/navigation/common/models/Turn;", "turnsUpdates", "getTurnsUpdates", "Lkotlinx/coroutines/CoroutineScope;", "turnByTurnScope", "Lkotlinx/coroutines/CoroutineScope;", "Lme/oriient/navigation/common/w;", "navigationConfigManager$delegate", "Lkotlin/Lazy;", "getNavigationConfigManager", "()Lme/oriient/navigation/common/w;", "navigationConfigManager", "Lme/oriient/navigation/turnByTurn/a;", "instructionsGenerator$delegate", "getInstructionsGenerator", "()Lme/oriient/navigation/turnByTurn/a;", "instructionsGenerator", "Lme/oriient/navigation/turnByTurn/e;", "turnAroundDetector$delegate", "getTurnAroundDetector", "()Lme/oriient/navigation/turnByTurn/e;", "turnAroundDetector", "Lme/oriient/navigation/turnByTurn/m;", "turnsCalculator$delegate", "getTurnsCalculator", "()Lme/oriient/navigation/turnByTurn/m;", "turnsCalculator", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "_isEnabled", "Z", "Lme/oriient/internal/services/dataModel/navigation/turnByTurn/TurnByTurnConfig;", "value", "()Z", "setEnabled", "Companion", "me/oriient/navigation/turnByTurn/h", "service-navigation_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TurnByTurnNavigationManagerImpl implements TurnByTurnNavigationManager {

    @NotNull
    private static final h Companion = new h();

    @Deprecated
    @NotNull
    public static final String TAG = "TurnByTurnManager";
    private boolean _isEnabled;

    @Nullable
    private TurnByTurnConfig config;

    /* renamed from: instructionsGenerator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy instructionsGenerator;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    /* renamed from: navigationConfigManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationConfigManager;

    /* renamed from: turnAroundDetector$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy turnAroundDetector;

    @NotNull
    private final CoroutineScope turnByTurnScope;

    /* renamed from: turnsCalculator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy turnsCalculator;

    @NotNull
    private final MutableSharedFlow<List<NavigationInstruction>> instructionsUpdates = UtilsKt.EventFlow();

    @NotNull
    private final MutableSharedFlow<List<Turn>> turnsUpdates = UtilsKt.EventFlow();

    public TurnByTurnNavigationManagerImpl() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.turnByTurnScope = CoroutineScopeKt.a(((CoroutineContextProvider) dependencyInjectionA.get(reflectionFactory.b(CoroutineContextProvider.class), null)).newSingleThreadCoroutineContext());
        this.navigationConfigManager = DiKt.a().inject(reflectionFactory.b(InterfaceC1781w.class));
        this.instructionsGenerator = DiKt.a().inject(reflectionFactory.b(a.class));
        this.turnAroundDetector = DiKt.a().inject(reflectionFactory.b(e.class));
        this.turnsCalculator = DiKt.a().inject(reflectionFactory.b(m.class));
        this.logger = DiKt.a().inject(reflectionFactory.b(Logger.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getInstructionsGenerator() {
        return (a) this.instructionsGenerator.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1781w getNavigationConfigManager() {
        return (InterfaceC1781w) this.navigationConfigManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e getTurnAroundDetector() {
        return (e) this.turnAroundDetector.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getTurnsCalculator() {
        return (m) this.turnsCalculator.getD();
    }

    private final void onEnabledChanged(boolean isEnabled) {
        BuildersKt.c(this.turnByTurnScope, null, null, new i(this, isEnabled, null), 3);
    }

    @Override // me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager
    /* renamed from: isEnabled, reason: from getter */
    public boolean get_isEnabled() {
        return this._isEnabled;
    }

    @Override // me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager
    @Nullable
    public Object onNewConfig(@NotNull TurnByTurnConfig turnByTurnConfig, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objF = BuildersKt.f(this.turnByTurnScope.getE(), new j(this, turnByTurnConfig, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager
    public void onRouteUpdate(@NotNull Route route, @NotNull NavigationPosition userPosition) {
        Intrinsics.h(route, "route");
        Intrinsics.h(userPosition, "userPosition");
        BuildersKt.c(this.turnByTurnScope, null, null, new k(this, route, userPosition, null), 3);
    }

    @Override // me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager
    public void reset() {
        BuildersKt.c(this.turnByTurnScope, null, null, new l(this, null), 3);
    }

    @Override // me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager
    public void setEnabled(boolean z) {
        onEnabledChanged(z);
    }

    @Override // me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager
    @NotNull
    public MutableSharedFlow<List<NavigationInstruction>> getInstructionsUpdates() {
        return this.instructionsUpdates;
    }

    @Override // me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager
    @NotNull
    public MutableSharedFlow<List<Turn>> getTurnsUpdates() {
        return this.turnsUpdates;
    }
}

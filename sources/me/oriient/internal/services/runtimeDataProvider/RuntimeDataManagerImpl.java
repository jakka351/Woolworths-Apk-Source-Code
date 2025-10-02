package me.oriient.internal.services.runtimeDataProvider;

import androidx.annotation.Keep;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.android.appState.AppState;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001KB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bR\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010-8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R*\u00108\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010:\"\u0004\b;\u0010\fR*\u0010<\u001a\u00020\t2\u0006\u00107\u001a\u00020\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b<\u00109\u001a\u0004\b<\u0010:\"\u0004\b=\u0010\fR\"\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010C\u001a\b\u0012\u0004\u0012\u00020\r0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR \u0010E\u001a\b\u0012\u0004\u0012\u00020\t0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bE\u0010BR\u0014\u0010H\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010:¨\u0006L"}, d2 = {"Lme/oriient/internal/services/runtimeDataProvider/RuntimeDataManagerImpl;", "Lme/oriient/internal/services/runtimeDataProvider/RuntimeDataManager;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "updateUserActivity", "()V", "", "considerAppState", "evaluateUserActivity", "(Z)V", "Lme/oriient/internal/services/runtimeDataProvider/UniqueSession;", "session", "setLoginSession", "(Lme/oriient/internal/services/runtimeDataProvider/UniqueSession;)V", "leaveSilentMode", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "appStateProvider$delegate", "getAppStateProvider", "()Lme/oriient/internal/infra/utils/android/appState/AppStateProvider;", "appStateProvider", "Lme/oriient/internal/services/config/InternalConfigManager;", "configManager$delegate", "getConfigManager", "()Lme/oriient/internal/services/config/InternalConfigManager;", "configManager", "", "lastUserActivityTimeMillis", "J", "Lme/oriient/internal/infra/utils/android/appState/AppState;", "previousAppStage", "Lme/oriient/internal/infra/utils/android/appState/AppState;", "", "currentUserId", "Ljava/lang/String;", "getCurrentUserId", "()Ljava/lang/String;", "setCurrentUserId", "(Ljava/lang/String;)V", "currentSpaceId", "getCurrentSpaceId", "setCurrentSpaceId", "value", "isPositioningActive", "Z", "()Z", "setPositioningActive", "isCalibrationActive", "setCalibrationActive", "Lkotlinx/coroutines/flow/MutableStateFlow;", "loginSession", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getLoginSession", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "userSessionFlow", "getUserSessionFlow", "isInSilentModeFlow", "getUserSession", "()Lme/oriient/internal/services/runtimeDataProvider/UniqueSession;", "userSession", "isInSilentMode", "Companion", "me/oriient/internal/services/runtimeDataProvider/f", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RuntimeDataManagerImpl implements RuntimeDataManager {

    @NotNull
    private static final f Companion = new f();

    @Deprecated
    @NotNull
    public static final String TAG = "RuntimeDataManager";

    /* renamed from: appStateProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appStateProvider;

    /* renamed from: configManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy configManager;

    @Nullable
    private String currentSpaceId;

    @Nullable
    private String currentUserId;
    private boolean isCalibrationActive;

    @NotNull
    private final MutableStateFlow<Boolean> isInSilentModeFlow;
    private boolean isPositioningActive;
    private long lastUserActivityTimeMillis;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final MutableStateFlow<UniqueSession> loginSession;

    @NotNull
    private AppState previousAppStage;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    @NotNull
    private final MutableStateFlow<UniqueSession> userSessionFlow;

    public RuntimeDataManagerImpl(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.h(coroutineScope, "coroutineScope");
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.timeProvider = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.appStateProvider = InternalDiKt.getDi().inject(reflectionFactory.b(AppStateProvider.class));
        this.configManager = InternalDiKt.getDi().inject(reflectionFactory.b(InternalConfigManager.class));
        this.lastUserActivityTimeMillis = getTimeProvider().getCurrentTimeMillis();
        this.previousAppStage = AppState.UNDEFINED;
        this.loginSession = StateFlowKt.a(null);
        this.userSessionFlow = StateFlowKt.a(UniqueSession.INSTANCE.createNewSession(getTimeProvider()));
        this.isInSilentModeFlow = StateFlowKt.a(Boolean.TRUE);
        BuildersKt.c(coroutineScope, null, null, new c(this, null), 3);
        BuildersKt.c(coroutineScope, null, null, new e(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void evaluateUserActivity(boolean considerAppState) {
        if (Math.abs(getTimeProvider().timeIntervalSinceNow(this.lastUserActivityTimeMillis)) < ((InternalConfig) getConfigManager().getConfig().getValue()).getAppSessionMaxInactivityMillis() || getIsPositioningActive() || getIsCalibrationActive()) {
            return;
        }
        if (considerAppState) {
            if (g.$EnumSwitchMapping$0[((AppState) getAppStateProvider().getAppState().getValue()).ordinal()] == 3) {
                return;
            }
        }
        getLogger().d(TAG, "User session was reset");
        getUserSessionFlow().setValue(UniqueSession.INSTANCE.createNewSession(getTimeProvider()));
        if (!((InternalConfig) getConfigManager().getConfig().getValue()).isSilentModeEnabled() || ((Boolean) isInSilentModeFlow().getValue()).booleanValue()) {
            return;
        }
        isInSilentModeFlow().setValue(Boolean.TRUE);
    }

    public static /* synthetic */ void evaluateUserActivity$default(RuntimeDataManagerImpl runtimeDataManagerImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        runtimeDataManagerImpl.evaluateUserActivity(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppStateProvider getAppStateProvider() {
        return (AppStateProvider) this.appStateProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InternalConfigManager getConfigManager() {
        return (InternalConfigManager) this.configManager.getD();
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUserActivity() {
        this.lastUserActivityTimeMillis = getTimeProvider().getCurrentTimeMillis();
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager, me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    @Nullable
    public String getCurrentSpaceId() {
        return this.currentSpaceId;
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager, me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    @Nullable
    public String getCurrentUserId() {
        return this.currentUserId;
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    @NotNull
    public UniqueSession getUserSession() {
        evaluateUserActivity$default(this, false, 1, null);
        return (UniqueSession) getUserSessionFlow().getValue();
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager, me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    /* renamed from: isCalibrationActive, reason: from getter */
    public boolean getIsCalibrationActive() {
        return this.isCalibrationActive;
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    public boolean isInSilentMode() {
        evaluateUserActivity$default(this, false, 1, null);
        return ((Boolean) isInSilentModeFlow().getValue()).booleanValue();
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager, me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    /* renamed from: isPositioningActive, reason: from getter */
    public boolean getIsPositioningActive() {
        return this.isPositioningActive;
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager
    public void leaveSilentMode() {
        isInSilentModeFlow().setValue(Boolean.FALSE);
        updateUserActivity();
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager
    public void setCalibrationActive(boolean z) {
        if (z != this.isCalibrationActive) {
            updateUserActivity();
        }
        this.isCalibrationActive = z;
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager
    public void setCurrentSpaceId(@Nullable String str) {
        this.currentSpaceId = str;
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager
    public void setCurrentUserId(@Nullable String str) {
        this.currentUserId = str;
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager
    public void setLoginSession(@Nullable UniqueSession session) {
        getLoginSession().setValue(session);
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataManager
    public void setPositioningActive(boolean z) {
        if (z != this.isPositioningActive) {
            updateUserActivity();
        }
        this.isPositioningActive = z;
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    @NotNull
    public MutableStateFlow<UniqueSession> getLoginSession() {
        return this.loginSession;
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    @NotNull
    public MutableStateFlow<UniqueSession> getUserSessionFlow() {
        return this.userSessionFlow;
    }

    @Override // me.oriient.internal.services.runtimeDataProvider.RuntimeDataProvider
    @NotNull
    public MutableStateFlow<Boolean> isInSilentModeFlow() {
        return this.isInSilentModeFlow;
    }
}

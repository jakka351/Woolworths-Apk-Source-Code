package me.oriient.ipssdk.realtime.ips;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.realtime.ofs.N4;
import me.oriient.ipssdk.realtime.utils.models.Position;
import me.oriient.navigation.common.NavigationPositionProvider;
import me.oriient.navigation.common.models.NavigationBuilding;
import me.oriient.navigation.common.models.NavigationPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/SdkNavigationPositioningProvider;", "Lme/oriient/navigation/common/NavigationPositionProvider;", "<init>", "()V", "Lme/oriient/internal/services/dataManager/building/Building;", "ipsBuilding", "", "onNewBuilding", "(Lme/oriient/internal/services/dataManager/building/Building;)V", "Lme/oriient/ipssdk/realtime/utils/models/Position;", "sdkPosition", "onNewPosition", "(Lme/oriient/ipssdk/realtime/utils/models/Position;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lme/oriient/navigation/common/models/NavigationBuilding;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getCurrentBuilding", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "currentBuilding", "", "b", "getCurrentSessionId", "currentSessionId", "Lme/oriient/navigation/common/models/NavigationPosition;", "c", "Lme/oriient/navigation/common/models/NavigationPosition;", "getCurrentPosition", "()Lme/oriient/navigation/common/models/NavigationPosition;", "setCurrentPosition", "(Lme/oriient/navigation/common/models/NavigationPosition;)V", "currentPosition", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "d", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getPositionUpdates", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "positionUpdates", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class SdkNavigationPositioningProvider implements NavigationPositionProvider {

    /* renamed from: c, reason: from kotlin metadata */
    private NavigationPosition currentPosition;
    private final Lazy e;
    private final CoroutineScope f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow currentBuilding = StateFlowKt.a(null);

    /* renamed from: b, reason: from kotlin metadata */
    private final MutableStateFlow currentSessionId = StateFlowKt.a(null);

    /* renamed from: d, reason: from kotlin metadata */
    private final MutableSharedFlow positionUpdates = UtilsKt.EventFlow();

    public SdkNavigationPositioningProvider() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.e = di.inject(reflectionFactory.b(TimeProvider.class));
        this.f = CoroutineScopeKt.a(((CoroutineContextProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(CoroutineContextProvider.class))).getDefault());
    }

    public static final TimeProvider access$getTimeProvider(SdkNavigationPositioningProvider sdkNavigationPositioningProvider) {
        return (TimeProvider) sdkNavigationPositioningProvider.e.getD();
    }

    @Override // me.oriient.navigation.common.NavigationPositionProvider
    @Nullable
    public NavigationPosition getCurrentPosition() {
        return this.currentPosition;
    }

    public final void onNewBuilding(@Nullable Building ipsBuilding) {
        getCurrentBuilding().setValue(ipsBuilding != null ? BuildingExtKt.toNavigationBuilding(ipsBuilding) : null);
    }

    public final void onNewPosition(@Nullable Position sdkPosition) {
        BuildersKt.c(this.f, null, null, new N4(sdkPosition, this, null), 3);
    }

    public void setCurrentPosition(@Nullable NavigationPosition navigationPosition) {
        this.currentPosition = navigationPosition;
    }

    @Override // me.oriient.navigation.common.NavigationPositionProvider
    @NotNull
    public MutableStateFlow<NavigationBuilding> getCurrentBuilding() {
        return this.currentBuilding;
    }

    @Override // me.oriient.navigation.common.NavigationPositionProvider
    @NotNull
    public MutableStateFlow<String> getCurrentSessionId() {
        return this.currentSessionId;
    }

    @Override // me.oriient.navigation.common.NavigationPositionProvider
    @NotNull
    public MutableSharedFlow<NavigationPosition> getPositionUpdates() {
        return this.positionUpdates;
    }
}

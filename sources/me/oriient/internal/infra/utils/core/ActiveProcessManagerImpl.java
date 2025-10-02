package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0006\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u000bJ\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/infra/utils/core/ActiveProcessManagerImpl;", "Lme/oriient/internal/infra/utils/core/AbstractActiveProcessManager;", "", "Lkotlinx/coroutines/CoroutineScope;", "singleThreadedCoroutineScope", "Lkotlin/Function0;", "onEnabled", "onDisabled", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "requirements", "(Lkotlin/Unit;)V", "Lkotlinx/coroutines/CoroutineScope;", "getSingleThreadedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/jvm/functions/Function0;", "Companion", "me/oriient/internal/infra/utils/core/c", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActiveProcessManagerImpl extends AbstractActiveProcessManager<Unit> {

    @NotNull
    public static final c Companion = new c();

    @NotNull
    private final Function0<Unit> onDisabled;

    @NotNull
    private final Function0<Unit> onEnabled;

    @NotNull
    private final CoroutineScope singleThreadedCoroutineScope;

    public ActiveProcessManagerImpl(@NotNull CoroutineScope singleThreadedCoroutineScope, @NotNull Function0<Unit> onEnabled, @NotNull Function0<Unit> onDisabled) {
        Intrinsics.h(singleThreadedCoroutineScope, "singleThreadedCoroutineScope");
        Intrinsics.h(onEnabled, "onEnabled");
        Intrinsics.h(onDisabled, "onDisabled");
        this.singleThreadedCoroutineScope = singleThreadedCoroutineScope;
        this.onEnabled = onEnabled;
        this.onDisabled = onDisabled;
    }

    @Override // me.oriient.internal.infra.utils.core.AbstractActiveProcessManager
    @NotNull
    public CoroutineScope getSingleThreadedCoroutineScope() {
        return this.singleThreadedCoroutineScope;
    }

    @Override // me.oriient.internal.infra.utils.core.AbstractActiveProcessManager
    public void onDisabled(@Nullable Unit requirements) {
        this.onDisabled.invoke();
    }

    @Override // me.oriient.internal.infra.utils.core.AbstractActiveProcessManager
    public void onEnabled(@Nullable Unit requirements) {
        this.onEnabled.invoke();
    }
}

package me.oriient.ipssdk.realtime.wrappers;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/wrappers/ProximityWrapper;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "proximityCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getProximityCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ProximityWrapper extends DiProvidable {
    @NotNull
    CoroutineScope getProximityCoroutineScope();
}

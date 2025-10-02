package me.oriient.ipssdk.realtime.wrappers;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.realtime.ips.Proximity;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/realtime/wrappers/ProximityWrapperImpl;", "Lme/oriient/ipssdk/realtime/wrappers/ProximityWrapper;", "()V", "proximityCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getProximityCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProximityWrapperImpl implements ProximityWrapper {
    @Override // me.oriient.ipssdk.realtime.wrappers.ProximityWrapper
    @NotNull
    public CoroutineScope getProximityCoroutineScope() {
        return Proximity.INSTANCE.getCoroutineScope();
    }
}

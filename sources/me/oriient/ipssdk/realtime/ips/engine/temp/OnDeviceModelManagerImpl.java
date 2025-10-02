package me.oriient.ipssdk.realtime.ips.engine.temp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/engine/temp/OnDeviceModelManagerImpl;", "Lme/oriient/ipssdk/realtime/ips/engine/temp/OnDeviceModelManager;", "<init>", "()V", "", "prepareModel", "Lme/oriient/internal/infra/utils/core/Outcome;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fetchModel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isModelReady", "Z", "()Z", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OnDeviceModelManagerImpl implements OnDeviceModelManager {
    @Override // me.oriient.ipssdk.realtime.ips.engine.temp.OnDeviceModelManager
    @Nullable
    public Object fetchModel(@NotNull Continuation<? super Outcome<Unit, Exception>> continuation) {
        return new Outcome.Success(Unit.f24250a);
    }

    @Override // me.oriient.ipssdk.realtime.ips.engine.temp.OnDeviceModelManager
    public boolean isModelReady() {
        return true;
    }

    @Override // me.oriient.ipssdk.realtime.ips.engine.temp.OnDeviceModelManager
    public void prepareModel() {
    }
}

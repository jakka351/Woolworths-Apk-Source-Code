package me.oriient.ipssdk.realtime.ips.engine.temp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\bj\u0002`\t0\u0006H¦@¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\f"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/engine/temp/OnDeviceModelManager;", "", "isModelReady", "", "()Z", "fetchModel", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareModel", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface OnDeviceModelManager {
    @Nullable
    Object fetchModel(@NotNull Continuation<? super Outcome<Unit, Exception>> continuation);

    boolean isModelReady();

    void prepareModel();
}

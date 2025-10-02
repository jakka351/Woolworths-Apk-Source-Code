package me.oriient.ipssdk.realtime.ips.engine;

import android.content.Context;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.android.ContextProvider;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.IPSCommonInitProvider;
import me.oriient.ipssdk.realtime.IPSRealtimeInitProvider;
import me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0094@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/engine/ScheduledWorkImpl;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "()V", "init", "", "context", "Landroid/content/Context;", "onUploadTrigger", "trigger", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ScheduledWorkImpl extends DataUploadScheduledWork {
    @Override // me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork
    public void init(@NotNull Context context) {
        Intrinsics.h(context, "context");
        new IPSCommonInitProvider().m434create(context);
        new IPSRealtimeInitProvider().m458create(context);
        DependencyInjectionKt.getDi().get(Reflection.f24268a.b(ContextProvider.class));
    }

    @Override // me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork
    @Nullable
    public Object onUploadTrigger(@NotNull DataUploadScheduler.UploadTrigger uploadTrigger, @NotNull Continuation<? super Unit> continuation) {
        Object objOnUploadTrigger = ((SupportEngineUploadManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SupportEngineUploadManager.class))).onUploadTrigger(uploadTrigger, this, continuation);
        return objOnUploadTrigger == CoroutineSingletons.d ? objOnUploadTrigger : Unit.f24250a;
    }
}

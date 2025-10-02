package me.oriient.internal.services.uploadingManager.scheduling;

import android.content.Context;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH¤@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "init", "(Landroid/content/Context;)V", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "trigger", "onUploadTrigger", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$WakeUpReason;", "reason", "execute", "(Landroid/content/Context;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$WakeUpReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "me/oriient/internal/services/uploadingManager/scheduling/d", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class DataUploadScheduledWork {

    @NotNull
    public static final d Companion = new d();

    @NotNull
    private static final String TAG = "DataUploadScheduledWork";

    @Nullable
    public final Object execute(@NotNull Context context, @NotNull DataUploadScheduler.WakeUpReason wakeUpReason, @NotNull Continuation<? super Unit> continuation) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "getApplicationContext(...)");
        init(applicationContext);
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        DataUploadScheduler.UploadTrigger uploadTrigger = ((DataUploadScheduler) di.get(reflectionFactory.b(DataUploadScheduler.class))).getUploadTrigger(wakeUpReason);
        Unit unit = Unit.f24250a;
        if (uploadTrigger == null) {
            ((Logger) InternalDiKt.getDi().get(reflectionFactory.b(Logger.class))).d(TAG, "execute: shouldn't upload");
            return unit;
        }
        Object objOnUploadTrigger = onUploadTrigger(uploadTrigger, continuation);
        return objOnUploadTrigger == CoroutineSingletons.d ? objOnUploadTrigger : unit;
    }

    public abstract void init(@NotNull Context context);

    @Nullable
    public abstract Object onUploadTrigger(@NotNull DataUploadScheduler.UploadTrigger uploadTrigger, @NotNull Continuation<? super Unit> continuation);
}

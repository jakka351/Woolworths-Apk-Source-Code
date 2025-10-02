package me.oriient.internal.infra.utils.android;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/infra/utils/android/HandlerFactoryImpl;", "Lme/oriient/internal/infra/utils/android/HandlerFactory;", "()V", "createHandler", "Landroid/os/Handler;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "priority", "", "createHandlerThread", "Landroid/os/HandlerThread;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HandlerFactoryImpl implements HandlerFactory {
    @Override // me.oriient.internal.infra.utils.android.HandlerFactory
    @NotNull
    public Handler createHandler(@NotNull String name, int priority) {
        Intrinsics.h(name, "name");
        HandlerThread handlerThread = new HandlerThread(name);
        handlerThread.setPriority(priority);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    @Override // me.oriient.internal.infra.utils.android.HandlerFactory
    @NotNull
    public HandlerThread createHandlerThread(@NotNull String name, int priority) {
        Intrinsics.h(name, "name");
        HandlerThread handlerThread = new HandlerThread(name);
        handlerThread.setPriority(priority);
        handlerThread.start();
        return handlerThread;
    }
}

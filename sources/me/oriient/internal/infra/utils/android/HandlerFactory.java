package me.oriient.internal.infra.utils.android;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lme/oriient/internal/infra/utils/android/HandlerFactory;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "createHandler", "Landroid/os/Handler;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "priority", "", "createHandlerThread", "Landroid/os/HandlerThread;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface HandlerFactory extends DiProvidable {
    @NotNull
    Handler createHandler(@NotNull String name, int priority);

    @NotNull
    HandlerThread createHandlerThread(@NotNull String name, int priority);
}

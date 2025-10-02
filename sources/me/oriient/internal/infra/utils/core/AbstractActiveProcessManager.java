package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J'\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0007H\u0002J\u0017\u0010\u0015\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H$¢\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00018\u0000H$¢\u0006\u0002\u0010\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\tX¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lme/oriient/internal/infra/utils/core/AbstractActiveProcessManager;", "Requirements", "Lme/oriient/internal/infra/utils/core/ActiveProcessManager;", "()V", "requesters", "", "", "", "singleThreadedCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getSingleThreadedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "changeState", "", "requestId", "enable", "requirements", "(Ljava/lang/String;ZLjava/lang/Object;)V", "disable", "(Ljava/lang/String;Ljava/lang/Object;)V", "isEnabled", "onDisabled", "(Ljava/lang/Object;)V", "onEnabled", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class AbstractActiveProcessManager<Requirements> implements ActiveProcessManager<Requirements> {

    @NotNull
    private final Map<String, Boolean> requesters = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeState(String requestId, boolean enable, Requirements requirements) {
        boolean zIsEnabled = isEnabled();
        this.requesters.put(requestId, Boolean.valueOf(enable));
        boolean zIsEnabled2 = isEnabled();
        if (zIsEnabled2 == zIsEnabled) {
            return;
        }
        if (zIsEnabled2) {
            onEnabled(requirements);
        } else {
            if (zIsEnabled2) {
                return;
            }
            onDisabled(requirements);
        }
    }

    private final boolean isEnabled() {
        Map<String, Boolean> map = this.requesters;
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // me.oriient.internal.infra.utils.core.ActiveProcessManager
    public void disable(@NotNull String requestId, @Nullable Requirements requirements) {
        Intrinsics.h(requestId, "requestId");
        BuildersKt.c(getSingleThreadedCoroutineScope(), null, null, new a(this, requestId, requirements, null), 3);
    }

    @Override // me.oriient.internal.infra.utils.core.ActiveProcessManager
    public void enable(@NotNull String requestId, @Nullable Requirements requirements) {
        Intrinsics.h(requestId, "requestId");
        BuildersKt.c(getSingleThreadedCoroutineScope(), null, null, new b(this, requestId, requirements, null), 3);
    }

    @NotNull
    public abstract CoroutineScope getSingleThreadedCoroutineScope();

    public abstract void onDisabled(@Nullable Requirements requirements);

    public abstract void onEnabled(@Nullable Requirements requirements);
}

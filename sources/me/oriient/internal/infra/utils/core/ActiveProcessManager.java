package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lme/oriient/internal/infra/utils/core/ActiveProcessManager;", "Requirements", "", "disable", "", "requestId", "", "requirements", "(Ljava/lang/String;Ljava/lang/Object;)V", "enable", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ActiveProcessManager<Requirements> {
    void disable(@NotNull String requestId, @Nullable Requirements requirements);

    void enable(@NotNull String requestId, @Nullable Requirements requirements);
}

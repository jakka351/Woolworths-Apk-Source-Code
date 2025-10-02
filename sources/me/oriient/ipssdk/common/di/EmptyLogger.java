package me.oriient.ipssdk.common.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\tJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\n\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\tJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\tR\"\u0010\u0018\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lme/oriient/ipssdk/common/di/EmptyLogger;", "Lme/oriient/internal/infra/utils/core/Logger;", "<init>", "()V", "", "tag", "message", "", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "e", "", "error", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "i", "v", "w", "", "a", "Z", "getEnableLogLong", "()Z", "setEnableLogLong", "(Z)V", "enableLogLong", "Lme/oriient/internal/infra/utils/core/Logger$Level;", "b", "Lme/oriient/internal/infra/utils/core/Logger$Level;", "getLevel", "()Lme/oriient/internal/infra/utils/core/Logger$Level;", "setLevel", "(Lme/oriient/internal/infra/utils/core/Logger$Level;)V", "level", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyLogger implements Logger {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean enableLogLong;

    /* renamed from: b, reason: from kotlin metadata */
    private Logger.Level level = Logger.Level.NONE;

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void d(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void e(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public boolean getEnableLogLong() {
        return this.enableLogLong;
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    @NotNull
    public Logger.Level getLevel() {
        return this.level;
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void i(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void setEnableLogLong(boolean z) {
        this.enableLogLong = z;
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void setLevel(@NotNull Logger.Level level) {
        Intrinsics.h(level, "<set-?>");
        this.level = level;
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void v(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void w(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void e(@NotNull String tag, @NotNull String message, @NotNull Throwable error) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(error, "error");
    }
}

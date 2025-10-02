package me.oriient.internal.infra.logAndroid;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lme/oriient/internal/infra/logAndroid/TestLogger;", "Lme/oriient/internal/infra/utils/core/Logger;", "()V", "enableLogLong", "", "getEnableLogLong", "()Z", "setEnableLogLong", "(Z)V", "level", "Lme/oriient/internal/infra/utils/core/Logger$Level;", "getLevel", "()Lme/oriient/internal/infra/utils/core/Logger$Level;", "setLevel", "(Lme/oriient/internal/infra/utils/core/Logger$Level;)V", "d", "", "tag", "", "message", "e", "error", "", "i", "v", "w", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TestLogger implements Logger {
    private boolean enableLogLong = true;

    @NotNull
    private Logger.Level level = Logger.Level.DEBUG;

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void d(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        System.out.println((Object) YU.a.p(new StringBuilder("[DEBUG] "), tag, ": ", message));
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void e(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        System.out.println((Object) YU.a.p(new StringBuilder("[ERROR] "), tag, ": ", message));
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
        System.out.println((Object) YU.a.p(new StringBuilder("[INFO] "), tag, ": ", message));
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
        System.out.println((Object) YU.a.p(new StringBuilder("[VERBOSE] "), tag, ": ", message));
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void w(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        System.out.println((Object) YU.a.p(new StringBuilder("[WARNING] "), tag, ": ", message));
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void e(@NotNull String tag, @NotNull String message, @NotNull Throwable error) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(error, "error");
        StringBuilder sb = new StringBuilder("[ERROR] ");
        androidx.constraintlayout.core.state.a.B(sb, tag, ": ", message, ", ");
        sb.append(error);
        System.out.println((Object) sb.toString());
    }
}

package me.oriient.internal.infra.logAndroid;

import android.util.Log;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Logger;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\rJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0011\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lme/oriient/internal/infra/logAndroid/LoggerImpl;", "Lme/oriient/internal/infra/utils/core/Logger;", "<init>", "()V", "Lme/oriient/internal/infra/utils/core/Logger$Level;", "level", "", "tag", "message", "", "logLong", "(Lme/oriient/internal/infra/utils/core/Logger$Level;Ljava/lang/String;Ljava/lang/String;)V", "v", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "i", "w", "e", "", "error", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "enableLogLong", "Z", "getEnableLogLong", "()Z", "setEnableLogLong", "(Z)V", "Lme/oriient/internal/infra/utils/core/Logger$Level;", "getLevel", "()Lme/oriient/internal/infra/utils/core/Logger$Level;", "setLevel", "(Lme/oriient/internal/infra/utils/core/Logger$Level;)V", "Companion", "me/oriient/internal/infra/logAndroid/a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoggerImpl implements Logger {

    @NotNull
    private static final a Companion = new a();
    private static final int MAX_LOGCAT_MESSAGE_SIZE = 1000;
    private boolean enableLogLong;

    @NotNull
    private Logger.Level level = Logger.Level.NONE;

    private final void logLong(Logger.Level level, String tag, String message) {
        int length = message.length() / 1000;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i * 1000;
            int i3 = i + 1;
            int i4 = i3 * 1000;
            int length2 = message.length();
            if (i4 > length2) {
                i4 = length2;
            }
            int i5 = b.$EnumSwitchMapping$0[level.ordinal()];
            if (i5 == 1) {
                String strSubstring = message.substring(i2, i4);
                Intrinsics.g(strSubstring, "substring(...)");
                Log.v(tag + '(' + i + ')', strSubstring);
            } else if (i5 == 2) {
                String strSubstring2 = message.substring(i2, i4);
                Intrinsics.g(strSubstring2, "substring(...)");
                Log.d(tag + '(' + i + ')', strSubstring2);
            }
            if (i == length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void d(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        if (getLevel().shouldLog(Logger.Level.DEBUG)) {
            if (!getEnableLogLong() || message.length() <= 1000) {
                Log.d(tag, message);
            } else {
                logLong(getLevel(), tag, message);
            }
        }
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void e(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        if (getLevel().shouldLog(Logger.Level.ERROR)) {
            Log.e(tag, message);
        }
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
        if (getLevel().shouldLog(Logger.Level.INFO)) {
            Log.i(tag, message);
        }
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
        if (getLevel().shouldLog(Logger.Level.VERBOSE)) {
            if (!getEnableLogLong() || message.length() <= 1000) {
                Log.v(tag, message);
            } else {
                logLong(getLevel(), tag, message);
            }
        }
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void w(@NotNull String tag, @NotNull String message) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        if (getLevel().shouldLog(Logger.Level.WARNING)) {
            Log.w(tag, message);
        }
    }

    @Override // me.oriient.internal.infra.utils.core.Logger
    public void e(@NotNull String tag, @NotNull String message, @NotNull Throwable error) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(message, "message");
        Intrinsics.h(error, "error");
        if (getLevel().shouldLog(Logger.Level.ERROR)) {
            Log.e(tag, message, error);
        }
    }
}

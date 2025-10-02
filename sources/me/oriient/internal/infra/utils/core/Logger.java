package me.oriient.internal.infra.utils.core;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\u0019J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lme/oriient/internal/infra/utils/core/Logger;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "enableLogLong", "", "getEnableLogLong", "()Z", "setEnableLogLong", "(Z)V", "level", "Lme/oriient/internal/infra/utils/core/Logger$Level;", "getLevel", "()Lme/oriient/internal/infra/utils/core/Logger$Level;", "setLevel", "(Lme/oriient/internal/infra/utils/core/Logger$Level;)V", "d", "", "tag", "", "message", "e", "error", "", "i", "v", "w", "Level", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Logger extends DiProvidable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/infra/utils/core/Logger$Level;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "level", "", "shouldLog", "(Lme/oriient/internal/infra/utils/core/Logger$Level;)Z", "I", "getValue", "()I", "Companion", "me/oriient/internal/infra/utils/core/g", "VERBOSE", "DEBUG", "INFO", "WARNING", "ERROR", "NONE", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;

        @NotNull
        public static final g Companion;
        private final int value;
        public static final Level VERBOSE = new Level("VERBOSE", 0, 0);
        public static final Level DEBUG = new Level("DEBUG", 1, 10);
        public static final Level INFO = new Level("INFO", 2, 20);
        public static final Level WARNING = new Level("WARNING", 3, 30);
        public static final Level ERROR = new Level("ERROR", 4, 40);
        public static final Level NONE = new Level("NONE", 5, 99);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{VERBOSE, DEBUG, INFO, WARNING, ERROR, NONE};
        }

        static {
            Level[] levelArr$values = $values();
            $VALUES = levelArr$values;
            $ENTRIES = EnumEntriesKt.a(levelArr$values);
            Companion = new g();
        }

        private Level(String str, int i, int i2) {
            this.value = i2;
        }

        @NotNull
        public static EnumEntries<Level> getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public final boolean shouldLog(@NotNull Level level) {
            Intrinsics.h(level, "level");
            return this.value <= level.value;
        }
    }

    void d(@NotNull String tag, @NotNull String message);

    void e(@NotNull String tag, @NotNull String message);

    void e(@NotNull String tag, @NotNull String message, @NotNull Throwable error);

    boolean getEnableLogLong();

    @NotNull
    Level getLevel();

    void i(@NotNull String tag, @NotNull String message);

    void setEnableLogLong(boolean z);

    void setLevel(@NotNull Level level);

    void v(@NotNull String tag, @NotNull String message);

    void w(@NotNull String tag, @NotNull String message);
}

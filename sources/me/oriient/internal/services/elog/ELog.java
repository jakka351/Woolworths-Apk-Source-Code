package me.oriient.internal.services.elog;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\bg\u0018\u00002\u00020\u0001:\u0002./J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J4\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H&J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H&J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J4\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H&J0\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H&J\u0016\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH¦@¢\u0006\u0002\u0010\u001bJ<\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u0003H&J\u0018\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J4\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H&J0\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H&J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J4\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H&J \u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(H&J0\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H&J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J4\u0010)\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H&J0\u0010)\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H&J>\u0010*\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u00142\b\b\u0002\u0010\b\u001a\u00020\tH&J:\u0010*\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00152\b\b\u0002\u0010\b\u001a\u00020\tH&J\"\u0010*\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\b\u001a\u00020\tH&J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J4\u0010+\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H&J0\u0010+\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H&J\u0018\u0010,\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J4\u0010,\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H&J0\u0010,\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H&J\u0018\u0010-\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J4\u0010-\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H&J0\u0010-\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u00060"}, d2 = {"Lme/oriient/internal/services/elog/ELog;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "enableLogging", "", "getEnableLogging", "()Z", "setEnableLogging", "(Z)V", "level", "Lme/oriient/internal/services/elog/ELog$Level;", "getLevel", "()Lme/oriient/internal/services/elog/ELog$Level;", "setLevel", "(Lme/oriient/internal/services/elog/ELog$Level;)V", "api", "", "tag", "", "message", "metadata", "Lkotlin/Function0;", "", "", "c", "clearAllLogs", "exceptLastMinutes", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configure", "url", com.salesforce.marketingcloud.config.a.k, "", "retries", "sendingIntervalSeconds", "", "queueSize", "considerGeofenceAlwaysInside", "d", "e", "tr", "", "i", "immediate", "io", "v", "w", "Level", "Type", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ELog extends DiProvidable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/elog/ELog$Level;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "shouldLog", "", "level", "VERBOSE", "DEBUG", "IO", "INFO", "API", "WARNING", "ERROR", "SEVERE", "NONE", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final int value;
        public static final Level VERBOSE = new Level("VERBOSE", 0, 0);
        public static final Level DEBUG = new Level("DEBUG", 1, 10);
        public static final Level IO = new Level("IO", 2, 15);
        public static final Level INFO = new Level("INFO", 3, 20);
        public static final Level API = new Level("API", 4, 25);
        public static final Level WARNING = new Level("WARNING", 5, 30);
        public static final Level ERROR = new Level("ERROR", 6, 40);
        public static final Level SEVERE = new Level("SEVERE", 7, 50);
        public static final Level NONE = new Level("NONE", 8, 99);

        @Keep
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/elog/ELog$Level$Companion;", "", "()V", "fromInt", "Lme/oriient/internal/services/elog/ELog$Level;", "status", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Level fromInt(int status) {
                Level level;
                Level[] levelArrValues = Level.values();
                int length = levelArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        level = null;
                        break;
                    }
                    level = levelArrValues[i];
                    if (level.getValue() == status) {
                        break;
                    }
                    i++;
                }
                return level == null ? Level.NONE : level;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{VERBOSE, DEBUG, IO, INFO, API, WARNING, ERROR, SEVERE, NONE};
        }

        static {
            Level[] levelArr$values = $values();
            $VALUES = levelArr$values;
            $ENTRIES = EnumEntriesKt.a(levelArr$values);
            INSTANCE = new Companion(null);
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lme/oriient/internal/services/elog/ELog$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LOG", "METRIC", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type LOG = new Type("LOG", 0, "log");
        public static final Type METRIC = new Type("METRIC", 1, "metric");

        @NotNull
        private final String value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{LOG, METRIC};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.a(typeArr$values);
        }

        private Type(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    void api(@NotNull String tag, @NotNull String message);

    void api(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata);

    void api(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata);

    void c(@NotNull String tag, @NotNull String message);

    void c(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata);

    void c(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata);

    @Nullable
    Object clearAllLogs(double d, @NotNull Continuation<? super Unit> continuation);

    void configure(@Nullable String url, int maxBatchSize, int retries, long sendingIntervalSeconds, int queueSize, boolean considerGeofenceAlwaysInside);

    void d(@NotNull String tag, @NotNull String message);

    void d(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata);

    void d(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata);

    void e(@NotNull String tag, @NotNull String message);

    void e(@NotNull String tag, @NotNull String message, @NotNull Throwable tr);

    void e(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata);

    void e(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata);

    boolean getEnableLogging();

    @NotNull
    Level getLevel();

    void i(@NotNull String tag, @NotNull String message);

    void i(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata);

    void i(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata);

    void immediate(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata, @NotNull Level level);

    void immediate(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata, @NotNull Level level);

    void immediate(@NotNull String tag, @NotNull String message, @NotNull Level level);

    void io(@NotNull String tag, @NotNull String message);

    void io(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata);

    void io(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata);

    void setEnableLogging(boolean z);

    void setLevel(@NotNull Level level);

    void v(@NotNull String tag, @NotNull String message);

    void v(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata);

    void v(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata);

    void w(@NotNull String tag, @NotNull String message);

    void w(@NotNull String tag, @NotNull String message, @Nullable Map<String, ? extends Object> metadata);

    void w(@NotNull String tag, @NotNull String message, @NotNull Function0<? extends Map<String, ? extends Object>> metadata);
}

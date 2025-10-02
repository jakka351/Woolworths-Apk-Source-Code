package okhttp3.logging;

import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.internal.platform.Platform;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Level", "Logger", "Companion", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HttpLoggingInterceptor implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final Logger f26774a;
    public volatile EmptySet b;
    public volatile EmptySet c;
    public volatile Level d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Companion;", "", "<init>", "()V", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Level {
        public static final Level d;
        public static final Level e;
        public static final Level f;
        public static final /* synthetic */ Level[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            Level level = new Level("NONE", 0);
            d = level;
            Level level2 = new Level("BASIC", 1);
            Level level3 = new Level("HEADERS", 2);
            e = level3;
            Level level4 = new Level("BODY", 3);
            f = level4;
            Level[] levelArr = {level, level2, level3, level4};
            g = levelArr;
            h = EnumEntriesKt.a(levelArr);
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "Companion", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Logger {

        /* renamed from: a, reason: collision with root package name */
        public static final Logger f26775a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "<init>", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f26776a = 0;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void a(String message) {
                    Intrinsics.h(message, "message");
                    Platform.f26752a.getClass();
                    Platform.b.h(4, message, null);
                }
            }

            static {
                new Companion();
            }

            private Companion() {
            }
        }

        static {
            int i = Companion.f26776a;
            f26775a = new Companion.DefaultLogger();
        }

        void a(String str);
    }

    static {
        new Companion(0);
    }

    @JvmOverloads
    public HttpLoggingInterceptor() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0196  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.a(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }

    public final void b(Headers headers, int i) {
        EmptySet emptySet = this.b;
        headers.d(i);
        emptySet.getClass();
        String strI = headers.i(i);
        this.f26774a.a(headers.d(i) + ": " + strI);
    }

    public HttpLoggingInterceptor(int i) {
        Logger logger = Logger.f26775a;
        Intrinsics.h(logger, "logger");
        this.f26774a = logger;
        EmptySet emptySet = EmptySet.d;
        this.b = emptySet;
        this.c = emptySet;
        this.d = Level.d;
    }
}

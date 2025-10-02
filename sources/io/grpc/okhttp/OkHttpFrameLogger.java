package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.Settings;
import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;

/* loaded from: classes7.dex */
class OkHttpFrameLogger {

    /* renamed from: a, reason: collision with root package name */
    public final Logger f24123a;
    public final Level b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        public static final Direction d;
        public static final Direction e;
        public static final /* synthetic */ Direction[] f;

        static {
            Direction direction = new Direction("INBOUND", 0);
            d = direction;
            Direction direction2 = new Direction("OUTBOUND", 1);
            e = direction2;
            f = new Direction[]{direction, direction2};
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f.clone();
        }
    }

    public enum SettingParams {
        /* JADX INFO: Fake field, exist only in values array */
        HEADER_TABLE_SIZE(1),
        /* JADX INFO: Fake field, exist only in values array */
        ENABLE_PUSH(2),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_CONCURRENT_STREAMS(4),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_FRAME_SIZE(5),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_HEADER_LIST_SIZE(6),
        /* JADX INFO: Fake field, exist only in values array */
        INITIAL_WINDOW_SIZE(7);

        public final int d;

        SettingParams(int i) {
            this.d = i;
        }
    }

    public OkHttpFrameLogger() {
        Level level = Level.FINE;
        Logger logger = Logger.getLogger(OkHttpClientTransport.class.getName());
        Preconditions.j(level, "level");
        this.b = level;
        Preconditions.j(logger, "logger");
        this.f24123a = logger;
    }

    public static String h(Buffer buffer) {
        long j = buffer.e;
        if (j <= 64) {
            return buffer.C().d();
        }
        return buffer.H((int) Math.min(j, 64L)).d() + "...";
    }

    public final boolean a() {
        return this.f24123a.isLoggable(this.b);
    }

    public final void b(Direction direction, int i, Buffer buffer, int i2, boolean z) {
        if (a()) {
            this.f24123a.log(this.b, direction + " DATA: streamId=" + i + " endStream=" + z + " length=" + i2 + " bytes=" + h(buffer));
        }
    }

    public final void c(Direction direction, int i, ErrorCode errorCode, ByteString byteString) {
        if (a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(direction);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i);
            sb.append(" errorCode=");
            sb.append(errorCode);
            sb.append(" length=");
            sb.append(byteString.c());
            sb.append(" bytes=");
            Buffer buffer = new Buffer();
            buffer.T(byteString);
            sb.append(h(buffer));
            this.f24123a.log(this.b, sb.toString());
        }
    }

    public final void d(Direction direction, long j) {
        if (a()) {
            this.f24123a.log(this.b, direction + " PING: ack=false bytes=" + j);
        }
    }

    public final void e(Direction direction, int i, ErrorCode errorCode) {
        if (a()) {
            this.f24123a.log(this.b, direction + " RST_STREAM: streamId=" + i + " errorCode=" + errorCode);
        }
    }

    public final void f(Direction direction, Settings settings) {
        if (a()) {
            StringBuilder sb = new StringBuilder();
            sb.append(direction);
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(SettingParams.class);
            for (SettingParams settingParams : SettingParams.values()) {
                if (settings.a(settingParams.d)) {
                    enumMap.put((EnumMap) settingParams, (SettingParams) Integer.valueOf(settings.b[settingParams.d]));
                }
            }
            sb.append(enumMap.toString());
            this.f24123a.log(this.b, sb.toString());
        }
    }

    public final void g(Direction direction, int i, long j) {
        if (a()) {
            this.f24123a.log(this.b, direction + " WINDOW_UPDATE: streamId=" + i + " windowSizeIncrement=" + j);
        }
    }
}

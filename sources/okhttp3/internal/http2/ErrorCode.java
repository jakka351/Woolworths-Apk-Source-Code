package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/ErrorCode;", "", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorCode {
    public static final Companion e;
    public static final ErrorCode f;
    public static final ErrorCode g;
    public static final ErrorCode h;
    public static final ErrorCode i;
    public static final ErrorCode j;
    public static final ErrorCode k;
    public static final /* synthetic */ ErrorCode[] l;
    public static final /* synthetic */ EnumEntries m;
    public final int d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/ErrorCode$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        ErrorCode errorCode = new ErrorCode("NO_ERROR", 0, 0);
        f = errorCode;
        ErrorCode errorCode2 = new ErrorCode("PROTOCOL_ERROR", 1, 1);
        g = errorCode2;
        ErrorCode errorCode3 = new ErrorCode("INTERNAL_ERROR", 2, 2);
        h = errorCode3;
        ErrorCode errorCode4 = new ErrorCode("FLOW_CONTROL_ERROR", 3, 3);
        i = errorCode4;
        ErrorCode errorCode5 = new ErrorCode("SETTINGS_TIMEOUT", 4, 4);
        ErrorCode errorCode6 = new ErrorCode("STREAM_CLOSED", 5, 5);
        ErrorCode errorCode7 = new ErrorCode("FRAME_SIZE_ERROR", 6, 6);
        ErrorCode errorCode8 = new ErrorCode("REFUSED_STREAM", 7, 7);
        j = errorCode8;
        ErrorCode errorCode9 = new ErrorCode("CANCEL", 8, 8);
        k = errorCode9;
        ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3, errorCode4, errorCode5, errorCode6, errorCode7, errorCode8, errorCode9, new ErrorCode("COMPRESSION_ERROR", 9, 9), new ErrorCode("CONNECT_ERROR", 10, 10), new ErrorCode("ENHANCE_YOUR_CALM", 11, 11), new ErrorCode("INADEQUATE_SECURITY", 12, 12), new ErrorCode("HTTP_1_1_REQUIRED", 13, 13)};
        l = errorCodeArr;
        m = EnumEntriesKt.a(errorCodeArr);
        e = new Companion(0);
    }

    public ErrorCode(String str, int i2, int i3) {
        this.d = i3;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) l.clone();
    }
}

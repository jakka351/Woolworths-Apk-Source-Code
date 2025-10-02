package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public class ParserException extends IOException {
    public final boolean d;
    public final int e;

    public ParserException(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.d = z;
        this.e = i;
    }

    public static ParserException a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.d);
        sb.append(", dataType=");
        return YU.a.m(sb, this.e, "}");
    }
}

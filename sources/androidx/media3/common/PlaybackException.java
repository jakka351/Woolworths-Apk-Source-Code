package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes2.dex */
public class PlaybackException extends Exception {
    public final int d;
    public final long e;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    static {
        androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
        Util.E(5);
    }

    public PlaybackException(int i, long j, Throwable th, String str) {
        super(str, th);
        this.d = i;
        this.e = j;
    }
}

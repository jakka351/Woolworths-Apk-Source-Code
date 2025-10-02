package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes2.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final int f;
    public final String g;
    public final int h;
    public final Format i;
    public final int j;
    public final MediaSource.MediaPeriodId k;
    public final boolean l;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface Type {
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, false);
    }

    public final ExoPlaybackException a(MediaSource.MediaPeriodId mediaPeriodId) {
        String message = getMessage();
        int i = Util.f2928a;
        return new ExoPlaybackException(message, getCause(), this.d, this.f, this.g, this.h, this.i, this.j, mediaPeriodId, this.e, this.l);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, Format format, int i4, MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z) {
        super(i, j, th, str);
        Bundle bundle = Bundle.EMPTY;
        Assertions.b(!z || i2 == 1);
        Assertions.b(th != null || i2 == 3);
        this.f = i2;
        this.g = str2;
        this.h = i3;
        this.i = format;
        this.j = i4;
        this.k = mediaPeriodId;
        this.l = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Throwable th, int i2, String str, int i3, Format format, int i4, boolean z) {
        String str2;
        int i5;
        Format format2;
        String string;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            format2 = format;
            string = "Source error";
        } else if (i != 1) {
            if (i != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i5 = i3;
            format2 = format;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            format2 = format;
            sb.append(format2);
            sb.append(", format_supported=");
            sb.append(Util.u(i4));
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : YU.a.g(string, ": null"), th, i2, i, str2, i5, format2, i4, null, SystemClock.elapsedRealtime(), z);
    }
}

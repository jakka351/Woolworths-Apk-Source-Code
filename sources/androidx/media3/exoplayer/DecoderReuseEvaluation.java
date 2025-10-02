package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class DecoderReuseEvaluation {

    /* renamed from: a, reason: collision with root package name */
    public final String f2994a;
    public final Format b;
    public final Format c;
    public final int d;
    public final int e;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderDiscardReasons {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderReuseResult {
    }

    public DecoderReuseEvaluation(String str, Format format, Format format2, int i, int i2) {
        Assertions.b(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f2994a = str;
        format.getClass();
        this.b = format;
        format2.getClass();
        this.c = format2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DecoderReuseEvaluation.class == obj.getClass()) {
            DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
            if (this.d == decoderReuseEvaluation.d && this.e == decoderReuseEvaluation.e && this.f2994a.equals(decoderReuseEvaluation.f2994a) && this.b.equals(decoderReuseEvaluation.b) && this.c.equals(decoderReuseEvaluation.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + androidx.camera.core.impl.b.c((((527 + this.d) * 31) + this.e) * 31, 31, this.f2994a)) * 31);
    }
}

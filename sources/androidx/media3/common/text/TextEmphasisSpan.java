package androidx.media3.common.text;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class TextEmphasisSpan implements LanguageFeatureSpan {
    public static final String d;
    public static final String e;
    public static final String f;

    /* renamed from: a, reason: collision with root package name */
    public final int f2901a;
    public final int b;
    public final int c;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MarkFill {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MarkShape {
    }

    static {
        int i = Util.f2928a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public TextEmphasisSpan(int i, int i2, int i3) {
        this.f2901a = i;
        this.b = i2;
        this.c = i3;
    }
}

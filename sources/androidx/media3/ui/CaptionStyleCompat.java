package androidx.media3.ui;

import android.graphics.Typeface;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class CaptionStyleCompat {
    public static final CaptionStyleCompat g = new CaptionStyleCompat(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f3452a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EdgeType {
    }

    public CaptionStyleCompat(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f3452a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }
}

package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes2.dex */
final class TtmlStyle {

    /* renamed from: a, reason: collision with root package name */
    public String f3389a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public TextEmphasis r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    public final void a(TtmlStyle ttmlStyle) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.c && ttmlStyle.c) {
                this.b = ttmlStyle.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = ttmlStyle.h;
            }
            if (this.i == -1) {
                this.i = ttmlStyle.i;
            }
            if (this.f3389a == null && (str = ttmlStyle.f3389a) != null) {
                this.f3389a = str;
            }
            if (this.f == -1) {
                this.f = ttmlStyle.f;
            }
            if (this.g == -1) {
                this.g = ttmlStyle.g;
            }
            if (this.n == -1) {
                this.n = ttmlStyle.n;
            }
            if (this.o == null && (alignment2 = ttmlStyle.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = ttmlStyle.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = ttmlStyle.q;
            }
            if (this.j == -1) {
                this.j = ttmlStyle.j;
                this.k = ttmlStyle.k;
            }
            if (this.r == null) {
                this.r = ttmlStyle.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = ttmlStyle.s;
            }
            if (this.t == null) {
                this.t = ttmlStyle.t;
            }
            if (this.u == null) {
                this.u = ttmlStyle.u;
            }
            if (!this.e && ttmlStyle.e) {
                this.d = ttmlStyle.d;
                this.e = true;
            }
            if (this.m != -1 || (i = ttmlStyle.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}

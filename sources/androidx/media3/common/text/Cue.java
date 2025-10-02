package androidx.media3.common.text;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Cue {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2896a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AnchorType {
    }

    @UnstableApi
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f2897a = null;
        public Bitmap b = null;
        public Layout.Alignment c = null;
        public Layout.Alignment d = null;
        public float e = -3.4028235E38f;
        public int f = Integer.MIN_VALUE;
        public int g = Integer.MIN_VALUE;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public int j = Integer.MIN_VALUE;
        public float k = -3.4028235E38f;
        public float l = -3.4028235E38f;
        public float m = -3.4028235E38f;
        public boolean n = false;
        public int o = -16777216;
        public int p = Integer.MIN_VALUE;
        public float q;

        public final Cue a() {
            return new Cue(this.f2897a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextSizeType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface VerticalType {
    }

    static {
        Builder builder = new Builder();
        builder.f2897a = "";
        builder.a();
        int i = Util.f2928a;
        r = Integer.toString(0, 36);
        s = Integer.toString(17, 36);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(18, 36);
        x = Integer.toString(4, 36);
        y = Integer.toString(5, 36);
        z = Integer.toString(6, 36);
        A = Integer.toString(7, 36);
        B = Integer.toString(8, 36);
        C = Integer.toString(9, 36);
        D = Integer.toString(10, 36);
        E = Integer.toString(11, 36);
        F = Integer.toString(12, 36);
        G = Integer.toString(13, 36);
        H = Integer.toString(14, 36);
        I = Integer.toString(15, 36);
        J = Integer.toString(16, 36);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            Assertions.b(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f2896a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f2896a = charSequence.toString();
        } else {
            this.f2896a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
    }

    public static Cue b(Bundle bundle) {
        Builder builder = new Builder();
        CharSequence charSequence = bundle.getCharSequence(r);
        if (charSequence != null) {
            builder.f2897a = charSequence;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(s);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    Bundle bundle2 = (Bundle) it.next();
                    int i = bundle2.getInt(CustomSpanBundler.f2899a);
                    int i2 = bundle2.getInt(CustomSpanBundler.b);
                    int i3 = bundle2.getInt(CustomSpanBundler.c);
                    int i4 = bundle2.getInt(CustomSpanBundler.d, -1);
                    Bundle bundle3 = bundle2.getBundle(CustomSpanBundler.e);
                    if (i4 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(RubySpan.c);
                        string.getClass();
                        spannableStringValueOf.setSpan(new RubySpan(string, bundle3.getInt(RubySpan.d)), i, i2, i3);
                    } else if (i4 == 2) {
                        bundle3.getClass();
                        spannableStringValueOf.setSpan(new TextEmphasisSpan(bundle3.getInt(TextEmphasisSpan.d), bundle3.getInt(TextEmphasisSpan.e), bundle3.getInt(TextEmphasisSpan.f)), i, i2, i3);
                    } else if (i4 == 3) {
                        spannableStringValueOf.setSpan(new HorizontalTextInVerticalContextSpan(), i, i2, i3);
                    } else if (i4 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(VoiceSpan.b);
                        string2.getClass();
                        spannableStringValueOf.setSpan(new VoiceSpan(string2), i, i2, i3);
                    }
                }
                builder.f2897a = spannableStringValueOf;
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(t);
        if (alignment != null) {
            builder.c = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(u);
        if (alignment2 != null) {
            builder.d = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(v);
        if (bitmap != null) {
            builder.b = bitmap;
        } else {
            byte[] byteArray = bundle.getByteArray(w);
            if (byteArray != null) {
                builder.b = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
        }
        String str = x;
        if (bundle.containsKey(str)) {
            String str2 = y;
            if (bundle.containsKey(str2)) {
                float f = bundle.getFloat(str);
                int i5 = bundle.getInt(str2);
                builder.e = f;
                builder.f = i5;
            }
        }
        String str3 = z;
        if (bundle.containsKey(str3)) {
            builder.g = bundle.getInt(str3);
        }
        String str4 = A;
        if (bundle.containsKey(str4)) {
            builder.h = bundle.getFloat(str4);
        }
        String str5 = B;
        if (bundle.containsKey(str5)) {
            builder.i = bundle.getInt(str5);
        }
        String str6 = D;
        if (bundle.containsKey(str6)) {
            String str7 = C;
            if (bundle.containsKey(str7)) {
                float f2 = bundle.getFloat(str6);
                int i6 = bundle.getInt(str7);
                builder.k = f2;
                builder.j = i6;
            }
        }
        String str8 = E;
        if (bundle.containsKey(str8)) {
            builder.l = bundle.getFloat(str8);
        }
        String str9 = F;
        if (bundle.containsKey(str9)) {
            builder.m = bundle.getFloat(str9);
        }
        String str10 = G;
        if (bundle.containsKey(str10)) {
            builder.o = bundle.getInt(str10);
            builder.n = true;
        }
        if (!bundle.getBoolean(H, false)) {
            builder.n = false;
        }
        String str11 = I;
        if (bundle.containsKey(str11)) {
            builder.p = bundle.getInt(str11);
        }
        String str12 = J;
        if (bundle.containsKey(str12)) {
            builder.q = bundle.getFloat(str12);
        }
        return builder.a();
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f2897a = this.f2896a;
        builder.b = this.d;
        builder.c = this.b;
        builder.d = this.c;
        builder.e = this.e;
        builder.f = this.f;
        builder.g = this.g;
        builder.h = this.h;
        builder.i = this.i;
        builder.j = this.n;
        builder.k = this.o;
        builder.l = this.j;
        builder.m = this.k;
        builder.n = this.l;
        builder.o = this.m;
        builder.p = this.p;
        builder.q = this.q;
        return builder;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f2896a;
        if (charSequence != null) {
            bundle.putCharSequence(r, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = CustomSpanBundler.f2899a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (RubySpan rubySpan : (RubySpan[]) spanned.getSpans(0, spanned.length(), RubySpan.class)) {
                    rubySpan.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(RubySpan.c, rubySpan.f2900a);
                    bundle2.putInt(RubySpan.d, rubySpan.b);
                    arrayList.add(CustomSpanBundler.a(spanned, rubySpan, 1, bundle2));
                }
                for (TextEmphasisSpan textEmphasisSpan : (TextEmphasisSpan[]) spanned.getSpans(0, spanned.length(), TextEmphasisSpan.class)) {
                    textEmphasisSpan.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(TextEmphasisSpan.d, textEmphasisSpan.f2901a);
                    bundle3.putInt(TextEmphasisSpan.e, textEmphasisSpan.b);
                    bundle3.putInt(TextEmphasisSpan.f, textEmphasisSpan.c);
                    arrayList.add(CustomSpanBundler.a(spanned, textEmphasisSpan, 2, bundle3));
                }
                for (HorizontalTextInVerticalContextSpan horizontalTextInVerticalContextSpan : (HorizontalTextInVerticalContextSpan[]) spanned.getSpans(0, spanned.length(), HorizontalTextInVerticalContextSpan.class)) {
                    arrayList.add(CustomSpanBundler.a(spanned, horizontalTextInVerticalContextSpan, 3, null));
                }
                for (VoiceSpan voiceSpan : (VoiceSpan[]) spanned.getSpans(0, spanned.length(), VoiceSpan.class)) {
                    voiceSpan.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(VoiceSpan.b, voiceSpan.f2902a);
                    arrayList.add(CustomSpanBundler.a(spanned, voiceSpan, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(s, arrayList);
                }
            }
        }
        bundle.putSerializable(t, this.b);
        bundle.putSerializable(u, this.c);
        bundle.putFloat(x, this.e);
        bundle.putInt(y, this.f);
        bundle.putInt(z, this.g);
        bundle.putFloat(A, this.h);
        bundle.putInt(B, this.i);
        bundle.putInt(C, this.n);
        bundle.putFloat(D, this.o);
        bundle.putFloat(E, this.j);
        bundle.putFloat(F, this.k);
        bundle.putBoolean(H, this.l);
        bundle.putInt(G, this.m);
        bundle.putInt(I, this.p);
        bundle.putFloat(J, this.q);
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Assertions.f(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(w, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cue.class != obj.getClass()) {
            return false;
        }
        Cue cue = (Cue) obj;
        Bitmap bitmap = cue.d;
        if (!TextUtils.equals(this.f2896a, cue.f2896a) || this.b != cue.b || this.c != cue.c) {
            return false;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.e == cue.e && this.f == cue.f && this.g == cue.g && this.h == cue.h && this.i == cue.i && this.j == cue.j && this.k == cue.k && this.l == cue.l && this.m == cue.m && this.n == cue.n && this.o == cue.o && this.p == cue.p && this.q == cue.q;
    }

    public final int hashCode() {
        return Objects.hash(this.f2896a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q));
    }
}

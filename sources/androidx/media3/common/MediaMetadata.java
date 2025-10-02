package androidx.media3.common;

import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class MediaMetadata {
    public static final MediaMetadata B;
    public final ImmutableList A;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2866a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final byte[] f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final CharSequence s;
    public final CharSequence t;
    public final CharSequence u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final Integer z;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f2867a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public CharSequence e;
        public byte[] f;
        public Integer g;
        public Integer h;
        public Integer i;
        public Integer j;
        public Boolean k;
        public Integer l;
        public Integer m;
        public Integer n;
        public Integer o;
        public Integer p;
        public Integer q;
        public CharSequence r;
        public CharSequence s;
        public CharSequence t;
        public Integer u;
        public Integer v;
        public CharSequence w;
        public CharSequence x;
        public Integer y;
        public ImmutableList z;

        public final void a(int i, byte[] bArr) {
            if (this.f == null || i == 3 || !Objects.equals(this.g, 3)) {
                this.f = (byte[]) bArr.clone();
                this.g = Integer.valueOf(i);
            }
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FolderType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PictureType {
    }

    static {
        Builder builder = new Builder();
        builder.z = ImmutableList.t();
        B = new MediaMetadata(builder);
        androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
        androidx.compose.ui.input.pointer.a.r(5, 6, 8, 9, 10);
        androidx.compose.ui.input.pointer.a.r(11, 12, 13, 14, 15);
        androidx.compose.ui.input.pointer.a.r(16, 17, 18, 19, 20);
        androidx.compose.ui.input.pointer.a.r(21, 22, 23, 24, 25);
        androidx.compose.ui.input.pointer.a.r(26, 27, 28, 29, 30);
        androidx.compose.ui.input.pointer.a.r(31, 32, 33, 34, 1000);
    }

    public MediaMetadata(Builder builder) {
        Boolean boolValueOf = builder.k;
        Integer numValueOf = builder.j;
        Integer numValueOf2 = builder.y;
        int i = 1;
        int i2 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                numValueOf = Integer.valueOf(i2);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.f2866a = builder.f2867a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = numValueOf;
        this.k = boolValueOf;
        Integer num = builder.l;
        this.l = num;
        this.m = num;
        this.n = builder.m;
        this.o = builder.n;
        this.p = builder.o;
        this.q = builder.p;
        this.r = builder.q;
        this.s = builder.r;
        this.t = builder.s;
        this.u = builder.t;
        this.v = builder.u;
        this.w = builder.v;
        this.x = builder.w;
        this.y = builder.x;
        this.z = numValueOf2;
        this.A = builder.z;
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f2867a = this.f2866a;
        builder.b = this.b;
        builder.c = this.c;
        builder.d = this.d;
        builder.e = this.e;
        builder.f = this.f;
        builder.g = this.g;
        builder.h = this.h;
        builder.i = this.i;
        builder.j = this.j;
        builder.k = this.k;
        builder.l = this.m;
        builder.m = this.n;
        builder.n = this.o;
        builder.o = this.p;
        builder.p = this.q;
        builder.q = this.r;
        builder.r = this.s;
        builder.s = this.t;
        builder.t = this.u;
        builder.u = this.v;
        builder.v = this.w;
        builder.w = this.x;
        builder.x = this.y;
        builder.y = this.z;
        builder.z = this.A;
        return builder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        return Objects.equals(this.f2866a, mediaMetadata.f2866a) && Objects.equals(this.b, mediaMetadata.b) && Objects.equals(this.c, mediaMetadata.c) && Objects.equals(this.d, mediaMetadata.d) && Objects.equals(this.e, mediaMetadata.e) && Arrays.equals(this.f, mediaMetadata.f) && Objects.equals(this.g, mediaMetadata.g) && Objects.equals(this.h, mediaMetadata.h) && Objects.equals(this.i, mediaMetadata.i) && Objects.equals(this.j, mediaMetadata.j) && Objects.equals(this.k, mediaMetadata.k) && Objects.equals(this.m, mediaMetadata.m) && Objects.equals(this.n, mediaMetadata.n) && Objects.equals(this.o, mediaMetadata.o) && Objects.equals(this.p, mediaMetadata.p) && Objects.equals(this.q, mediaMetadata.q) && Objects.equals(this.r, mediaMetadata.r) && Objects.equals(this.s, mediaMetadata.s) && Objects.equals(this.t, mediaMetadata.t) && Objects.equals(this.u, mediaMetadata.u) && Objects.equals(this.v, mediaMetadata.v) && Objects.equals(this.w, mediaMetadata.w) && Objects.equals(this.x, mediaMetadata.x) && Objects.equals(this.y, mediaMetadata.y) && Objects.equals(this.z, mediaMetadata.z) && Objects.equals(this.A, mediaMetadata.A);
    }

    public final int hashCode() {
        return Objects.hash(this.f2866a, this.b, this.c, this.d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.g, null, this.h, this.i, this.j, this.k, null, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, null, this.y, this.z, true, this.A);
    }
}

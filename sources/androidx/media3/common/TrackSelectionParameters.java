package androidx.media3.common;

import android.content.Context;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.InlineMe;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TrackSelectionParameters {
    public static final TrackSelectionParameters v = new TrackSelectionParameters(new Builder());

    /* renamed from: a, reason: collision with root package name */
    public final int f2881a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final ImmutableList i;
    public final ImmutableList j;
    public final ImmutableList k;
    public final int l;
    public final int m;
    public final ImmutableList n;
    public final AudioOffloadPreferences o;
    public final ImmutableList p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final ImmutableMap t;
    public final ImmutableSet u;

    @UnstableApi
    public static final class AudioOffloadPreferences {

        /* renamed from: a, reason: collision with root package name */
        public static final AudioOffloadPreferences f2882a = new AudioOffloadPreferences();

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioOffloadMode {
        }

        public static final class Builder {
        }

        static {
            Util.E(1);
            Util.E(2);
            Util.E(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AudioOffloadPreferences.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 29791;
        }
    }

    static {
        androidx.compose.ui.input.pointer.a.r(1, 2, 3, 4, 5);
        androidx.compose.ui.input.pointer.a.r(6, 7, 8, 9, 10);
        androidx.compose.ui.input.pointer.a.r(11, 12, 13, 14, 15);
        androidx.compose.ui.input.pointer.a.r(16, 17, 18, 19, 20);
        androidx.compose.ui.input.pointer.a.r(21, 22, 23, 24, 25);
        androidx.compose.ui.input.pointer.a.r(26, 27, 28, 29, 30);
        Util.E(31);
        Util.E(32);
        Util.E(33);
        Util.E(34);
    }

    public TrackSelectionParameters(Builder builder) {
        this.f2881a = builder.f2883a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
        this.k = builder.k;
        this.l = builder.l;
        this.m = builder.m;
        this.n = builder.n;
        this.o = builder.o;
        this.p = builder.p;
        this.q = builder.q;
        this.r = builder.r;
        this.s = builder.s;
        this.t = ImmutableMap.c(builder.t);
        this.u = ImmutableSet.q(builder.u);
    }

    public Builder a() {
        Builder builder = new Builder();
        builder.c(this);
        return builder;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        return this.f2881a == trackSelectionParameters.f2881a && this.b == trackSelectionParameters.b && this.c == trackSelectionParameters.c && this.d == trackSelectionParameters.d && this.h == trackSelectionParameters.h && this.e == trackSelectionParameters.e && this.f == trackSelectionParameters.f && this.g == trackSelectionParameters.g && this.i.equals(trackSelectionParameters.i) && this.j.equals(trackSelectionParameters.j) && this.k.equals(trackSelectionParameters.k) && this.l == trackSelectionParameters.l && this.m == trackSelectionParameters.m && this.n.equals(trackSelectionParameters.n) && this.o.equals(trackSelectionParameters.o) && this.p.equals(trackSelectionParameters.p) && this.q == trackSelectionParameters.q && this.r == trackSelectionParameters.r && this.s == trackSelectionParameters.s && this.t.equals(trackSelectionParameters.t) && this.u.equals(trackSelectionParameters.u);
    }

    public int hashCode() {
        int iHashCode = (this.n.hashCode() + ((((((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.f2881a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 961)) * 961) + this.l) * 31) + this.m) * 31)) * 31;
        this.o.getClass();
        return this.u.hashCode() + ((this.t.hashCode() + ((((((((this.p.hashCode() + ((iHashCode + 29791) * 31)) * 961) + (this.q ? 1 : 0)) * 31) + this.r) * 923521) + (this.s ? 1 : 0)) * 31)) * 31);
    }

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public int f2883a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public boolean h;
        public ImmutableList i;
        public ImmutableList j;
        public ImmutableList k;
        public int l;
        public int m;
        public ImmutableList n;
        public AudioOffloadPreferences o;
        public ImmutableList p;
        public boolean q;
        public int r;
        public boolean s;
        public HashMap t;
        public HashSet u;

        public Builder() {
            this.f2883a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.e = Integer.MAX_VALUE;
            this.f = Integer.MAX_VALUE;
            this.g = true;
            this.h = true;
            this.i = ImmutableList.t();
            this.j = ImmutableList.t();
            this.k = ImmutableList.t();
            this.l = Integer.MAX_VALUE;
            this.m = Integer.MAX_VALUE;
            this.n = ImmutableList.t();
            this.o = AudioOffloadPreferences.f2882a;
            this.p = ImmutableList.t();
            this.q = true;
            this.r = 0;
            this.s = false;
            this.t = new HashMap();
            this.u = new HashSet();
        }

        public TrackSelectionParameters a() {
            return new TrackSelectionParameters(this);
        }

        public Builder b(int i) {
            Iterator it = this.t.values().iterator();
            while (it.hasNext()) {
                if (((TrackSelectionOverride) it.next()).f2880a.c == i) {
                    it.remove();
                }
            }
            return this;
        }

        public final void c(TrackSelectionParameters trackSelectionParameters) {
            this.f2883a = trackSelectionParameters.f2881a;
            this.b = trackSelectionParameters.b;
            this.c = trackSelectionParameters.c;
            this.d = trackSelectionParameters.d;
            this.e = trackSelectionParameters.e;
            this.f = trackSelectionParameters.f;
            this.g = trackSelectionParameters.g;
            this.h = trackSelectionParameters.h;
            this.i = trackSelectionParameters.i;
            this.j = trackSelectionParameters.j;
            this.k = trackSelectionParameters.k;
            this.l = trackSelectionParameters.l;
            this.m = trackSelectionParameters.m;
            this.n = trackSelectionParameters.n;
            this.o = trackSelectionParameters.o;
            this.p = trackSelectionParameters.p;
            this.q = trackSelectionParameters.q;
            this.r = trackSelectionParameters.r;
            this.s = trackSelectionParameters.s;
            this.u = new HashSet(trackSelectionParameters.u);
            this.t = new HashMap(trackSelectionParameters.t);
        }

        public Builder d() {
            this.r = -3;
            return this;
        }

        public Builder e(TrackSelectionOverride trackSelectionOverride) {
            TrackGroup trackGroup = trackSelectionOverride.f2880a;
            b(trackGroup.c);
            this.t.put(trackGroup, trackSelectionOverride);
            return this;
        }

        public Builder f() {
            return g(new String[0]);
        }

        public Builder g(String... strArr) {
            ImmutableList.Builder builderM = ImmutableList.m();
            for (String str : strArr) {
                str.getClass();
                builderM.h(Util.J(str));
            }
            this.p = builderM.j();
            this.q = false;
            return this;
        }

        public Builder h() {
            this.q = false;
            return this;
        }

        public Builder i(int i) {
            this.u.remove(Integer.valueOf(i));
            return this;
        }

        @InlineMe
        @Deprecated
        public Builder(Context context) {
            this();
        }
    }
}

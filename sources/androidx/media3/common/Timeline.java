package androidx.media3.common;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class Timeline {

    /* renamed from: a, reason: collision with root package name */
    public static final Timeline f2876a = new AnonymousClass1();

    /* renamed from: androidx.media3.common.Timeline$1, reason: invalid class name */
    public class AnonymousClass1 extends Timeline {
        @Override // androidx.media3.common.Timeline
        public final int b(Object obj) {
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public final Period f(int i, Period period, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public final int h() {
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public final Object l(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public final Window m(int i, Window window, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            return 0;
        }
    }

    public static final class Period {

        /* renamed from: a, reason: collision with root package name */
        public Object f2877a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public AdPlaybackState g = AdPlaybackState.c;

        static {
            androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
        }

        public final long a(int i, int i2) {
            AdPlaybackState.AdGroup adGroupA = this.g.a(i);
            if (adGroupA.f2844a != -1) {
                return adGroupA.f[i2];
            }
            return -9223372036854775807L;
        }

        public final int b(long j) {
            AdPlaybackState.AdGroup adGroupA;
            int i;
            AdPlaybackState adPlaybackState = this.g;
            long j2 = this.d;
            int i2 = adPlaybackState.f2843a;
            if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
                int i3 = 0;
                while (i3 < i2) {
                    adPlaybackState.a(i3).getClass();
                    adPlaybackState.a(i3).getClass();
                    if (0 > j && ((i = (adGroupA = adPlaybackState.a(i3)).f2844a) == -1 || adGroupA.a(-1) < i)) {
                        break;
                    }
                    i3++;
                }
                if (i3 < i2) {
                    return i3;
                }
            }
            return -1;
        }

        public final int c(long j) {
            AdPlaybackState adPlaybackState = this.g;
            int i = adPlaybackState.f2843a - 1;
            adPlaybackState.b(i);
            while (i >= 0 && j != Long.MIN_VALUE) {
                adPlaybackState.a(i).getClass();
                if (j >= 0) {
                    break;
                }
                i--;
            }
            if (i >= 0) {
                AdPlaybackState.AdGroup adGroupA = adPlaybackState.a(i);
                int i2 = adGroupA.f2844a;
                if (i2 != -1) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = adGroupA.e[i3];
                        if (i4 != 0 && i4 != 1) {
                        }
                    }
                }
                return i;
            }
            return -1;
        }

        public final long d(int i) {
            this.g.a(i).getClass();
            return 0L;
        }

        public final int e(int i) {
            return this.g.a(i).a(-1);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            return Objects.equals(this.f2877a, period.f2877a) && Objects.equals(this.b, period.b) && this.c == period.c && this.d == period.d && this.e == period.e && this.f == period.f && Objects.equals(this.g, period.g);
        }

        public final boolean f(int i) {
            AdPlaybackState adPlaybackState = this.g;
            if (i != adPlaybackState.f2843a - 1) {
                return false;
            }
            adPlaybackState.b(i);
            return false;
        }

        public final boolean g(int i) {
            this.g.a(i).getClass();
            return false;
        }

        public final void h(Object obj, Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState, boolean z) {
            this.f2877a = obj;
            this.b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.g = adPlaybackState;
            this.f = z;
        }

        public final int hashCode() {
            Object obj = this.f2877a;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j = this.d;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            return this.g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
        }
    }

    @UnstableApi
    public static final class RemotableTimeline extends Timeline {
        @Override // androidx.media3.common.Timeline
        public final int a(boolean z) {
            if (p()) {
                return -1;
            }
            if (z) {
                throw null;
            }
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public final int b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.Timeline
        public final int c(boolean z) {
            if (p()) {
                return -1;
            }
            if (z) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int e(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            c(z);
            if (i == -1) {
                if (i2 == 2) {
                    return a(z);
                }
                return -1;
            }
            if (z) {
                throw null;
            }
            return i + 1;
        }

        @Override // androidx.media3.common.Timeline
        public final Period f(int i, Period period, boolean z) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int h() {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int k(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != a(z)) {
                if (z) {
                    throw null;
                }
                return i - 1;
            }
            if (i2 != 2) {
                return -1;
            }
            c(z);
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public final Object l(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.common.Timeline
        public final Window m(int i, Window window, long j) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            throw null;
        }
    }

    public static final class Window {
        public static final Object p = new Object();
        public static final MediaItem q;
        public Object b;
        public long d;
        public long e;
        public long f;
        public boolean g;
        public boolean h;
        public MediaItem.LiveConfiguration i;
        public boolean j;
        public long k;
        public long l;
        public int m;
        public int n;
        public long o;

        /* renamed from: a, reason: collision with root package name */
        public Object f2878a = p;
        public MediaItem c = q;

        static {
            MediaItem.Builder builder = new MediaItem.Builder();
            builder.f2858a = "androidx.media3.common.Timeline";
            builder.b = Uri.EMPTY;
            q = builder.a();
            androidx.compose.ui.input.pointer.a.r(1, 2, 3, 4, 5);
            androidx.compose.ui.input.pointer.a.r(6, 7, 8, 9, 10);
            Util.E(11);
            Util.E(12);
            Util.E(13);
        }

        public final boolean a() {
            return this.i != null;
        }

        public final void b(Object obj, MediaItem mediaItem, long j, long j2, long j3, boolean z, boolean z2, MediaItem.LiveConfiguration liveConfiguration, long j4, long j5, int i, int i2, long j6) {
            this.f2878a = obj;
            this.c = mediaItem != null ? mediaItem : q;
            if (mediaItem != null) {
                MediaItem.LocalConfiguration localConfiguration = mediaItem.b;
            }
            this.b = null;
            this.d = j;
            this.e = j2;
            this.f = j3;
            this.g = z;
            this.h = z2;
            this.i = liveConfiguration;
            this.k = j4;
            this.l = j5;
            this.m = i;
            this.n = i2;
            this.o = j6;
            this.j = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Objects.equals(this.f2878a, window.f2878a) && Objects.equals(this.c, window.c) && Objects.equals(this.i, window.i) && this.d == window.d && this.e == window.e && this.f == window.f && this.g == window.g && this.h == window.h && this.j == window.j && this.k == window.k && this.l == window.l && this.m == window.m && this.n == window.n && this.o == window.o;
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + android.support.v4.media.session.a.e(217, 31, this.f2878a)) * 961;
            MediaItem.LiveConfiguration liveConfiguration = this.i;
            int iHashCode2 = liveConfiguration == null ? 0 : liveConfiguration.hashCode();
            long j = this.d;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.e;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
            long j4 = this.k;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.l;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
            long j6 = this.o;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    static {
        Util.E(0);
        Util.E(1);
        Util.E(2);
    }

    public int a(boolean z) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, Period period, Window window, int i2, boolean z) {
        int i3 = f(i, period, false).c;
        if (m(i3, window, 0L).n != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return m(iE, window, 0L).m;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof Timeline) {
                Timeline timeline = (Timeline) obj;
                if (timeline.o() == o() && timeline.h() == h()) {
                    Window window = new Window();
                    Period period = new Period();
                    Window window2 = new Window();
                    Period period2 = new Period();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= h()) {
                                    int iA = a(true);
                                    if (iA == timeline.a(true) && (iC = c(true)) == timeline.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == timeline.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i2, period, true).equals(timeline.f(i2, period2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!m(i, window, 0L).equals(timeline.m(i, window2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Period f(int i, Period period, boolean z);

    public Period g(Object obj, Period period) {
        return f(b(obj), period, true);
    }

    public abstract int h();

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, window, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            iH = (iH * 31) + f(i2, period, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(Window window, Period period, int i, long j) {
        Pair pairJ = j(window, period, i, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(Window window, Period period, int i, long j, long j2) {
        Assertions.c(i, o());
        m(i, window, j2);
        if (j == -9223372036854775807L) {
            j = window.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = window.m;
        f(i2, period, false);
        while (i2 < window.n && period.e != j) {
            int i3 = i2 + 1;
            if (f(i3, period, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, period, true);
        long jMin = j - period.e;
        long j3 = period.d;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = period.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == a(z) ? c(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i);

    public abstract Window m(int i, Window window, long j);

    public final void n(int i, Window window) {
        m(i, window, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}

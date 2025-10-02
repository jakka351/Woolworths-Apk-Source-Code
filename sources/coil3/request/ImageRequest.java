package coil3.request;

import android.content.Context;
import android.support.v4.media.session.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import coil3.Extras;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.SizeResolver;
import coil3.target.Target;
import coil3.util.Collections_jvmCommonKt;
import coil3.util.UtilsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/request/ImageRequest;", "", "Listener", "Defined", "Defaults", "Builder", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13137a;
    public final Object b;
    public final Target c;
    public final Listener d;
    public final Map e;
    public final FileSystem f;
    public final CoroutineContext g;
    public final CoroutineContext h;
    public final CoroutineContext i;
    public final CachePolicy j;
    public final CachePolicy k;
    public final CachePolicy l;
    public final Function1 m;
    public final Function1 n;
    public final Function1 o;
    public final SizeResolver p;
    public final Scale q;
    public final Precision r;
    public final Extras s;
    public final Defined t;
    public final Defaults u;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/request/ImageRequest$Defaults;", "", "Companion", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Defaults {
        public static final Defaults o;

        /* renamed from: a, reason: collision with root package name */
        public final FileSystem f13139a;
        public final CoroutineContext b;
        public final CoroutineContext c;
        public final CoroutineContext d;
        public final CachePolicy e;
        public final CachePolicy f;
        public final CachePolicy g;
        public final Function1 h;
        public final Function1 i;
        public final Function1 j;
        public final SizeResolver k;
        public final Scale l;
        public final Precision m;
        public final Extras n;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/request/ImageRequest$Defaults$Companion;", "", "Lcoil3/request/ImageRequest$Defaults;", "DEFAULT", "Lcoil3/request/ImageRequest$Defaults;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            JvmSystemFileSystem jvmSystemFileSystem = FileSystem.d;
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
            CachePolicy cachePolicy = CachePolicy.f;
            o = new Defaults(jvmSystemFileSystem, EmptyCoroutineContext.d, defaultIoScheduler, defaultIoScheduler, cachePolicy, cachePolicy, cachePolicy, UtilsKt.b(), UtilsKt.b(), UtilsKt.b(), SizeResolver.q3, Scale.e, Precision.d, Extras.b);
        }

        public Defaults(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras) {
            this.f13139a = fileSystem;
            this.b = coroutineContext;
            this.c = coroutineContext2;
            this.d = coroutineContext3;
            this.e = cachePolicy;
            this.f = cachePolicy2;
            this.g = cachePolicy3;
            this.h = function1;
            this.i = function12;
            this.j = function13;
            this.k = sizeResolver;
            this.l = scale;
            this.m = precision;
            this.n = extras;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Defaults)) {
                return false;
            }
            Defaults defaults = (Defaults) obj;
            return Intrinsics.c(this.f13139a, defaults.f13139a) && Intrinsics.c(this.b, defaults.b) && Intrinsics.c(this.c, defaults.c) && Intrinsics.c(this.d, defaults.d) && this.e == defaults.e && this.f == defaults.f && this.g == defaults.g && Intrinsics.c(this.h, defaults.h) && Intrinsics.c(this.i, defaults.i) && Intrinsics.c(this.j, defaults.j) && Intrinsics.c(this.k, defaults.k) && this.l == defaults.l && this.m == defaults.m && Intrinsics.c(this.n, defaults.n);
        }

        public final int hashCode() {
            return this.n.f13043a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13139a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Defaults(fileSystem=" + this.f13139a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/request/ImageRequest$Defined;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Defined {

        /* renamed from: a, reason: collision with root package name */
        public final CoroutineContext f13140a;
        public final CoroutineContext b;
        public final CoroutineContext c;
        public final CachePolicy d;
        public final Function1 e;
        public final Function1 f;
        public final Function1 g;
        public final SizeResolver h;
        public final Scale i;
        public final Precision j;

        public Defined(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, Function1 function1, Function1 function12, Function1 function13, SizeResolver sizeResolver, Scale scale, Precision precision) {
            this.f13140a = coroutineContext;
            this.b = coroutineContext2;
            this.c = coroutineContext3;
            this.d = cachePolicy;
            this.e = function1;
            this.f = function12;
            this.g = function13;
            this.h = sizeResolver;
            this.i = scale;
            this.j = precision;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Defined)) {
                return false;
            }
            Defined defined = (Defined) obj;
            return Intrinsics.c(this.f13140a, defined.f13140a) && Intrinsics.c(this.b, defined.b) && Intrinsics.c(this.c, defined.c) && this.d == defined.d && Intrinsics.c(this.e, defined.e) && Intrinsics.c(this.f, defined.f) && Intrinsics.c(this.g, defined.g) && Intrinsics.c(this.h, defined.h) && this.i == defined.i && this.j == defined.j;
        }

        public final int hashCode() {
            CoroutineContext coroutineContext = this.f13140a;
            int iHashCode = (coroutineContext == null ? 0 : coroutineContext.hashCode()) * 31;
            CoroutineContext coroutineContext2 = this.b;
            int iHashCode2 = (iHashCode + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.c;
            int iHashCode3 = (iHashCode2 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 961;
            CachePolicy cachePolicy = this.d;
            int iHashCode4 = (iHashCode3 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 961;
            Function1 function1 = this.e;
            int iHashCode5 = (iHashCode4 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1 function12 = this.f;
            int iHashCode6 = (iHashCode5 + (function12 == null ? 0 : function12.hashCode())) * 31;
            Function1 function13 = this.g;
            int iHashCode7 = (iHashCode6 + (function13 == null ? 0 : function13.hashCode())) * 31;
            SizeResolver sizeResolver = this.h;
            int iHashCode8 = (iHashCode7 + (sizeResolver == null ? 0 : sizeResolver.hashCode())) * 31;
            Scale scale = this.i;
            int iHashCode9 = (iHashCode8 + (scale == null ? 0 : scale.hashCode())) * 31;
            Precision precision = this.j;
            return iHashCode9 + (precision != null ? precision.hashCode() : 0);
        }

        public final String toString() {
            return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.f13140a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=" + this.d + ", networkCachePolicy=null, placeholderFactory=" + this.e + ", errorFactory=" + this.f + ", fallbackFactory=" + this.g + ", sizeResolver=" + this.h + ", scale=" + this.i + ", precision=" + this.j + ')';
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcoil3/request/ImageRequest$Listener;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        default void a() {
        }

        default void onCancel() {
        }

        default void onStart() {
        }

        default void onSuccess() {
        }
    }

    public ImageRequest(Context context, Object obj, Target target, Listener listener, Map map, FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras, Defined defined, Defaults defaults) {
        this.f13137a = context;
        this.b = obj;
        this.c = target;
        this.d = listener;
        this.e = map;
        this.f = fileSystem;
        this.g = coroutineContext;
        this.h = coroutineContext2;
        this.i = coroutineContext3;
        this.j = cachePolicy;
        this.k = cachePolicy2;
        this.l = cachePolicy3;
        this.m = function1;
        this.n = function12;
        this.o = function13;
        this.p = sizeResolver;
        this.q = scale;
        this.r = precision;
        this.s = extras;
        this.t = defined;
        this.u = defaults;
    }

    public static Builder a(ImageRequest imageRequest) {
        Context context = imageRequest.f13137a;
        imageRequest.getClass();
        return new Builder(imageRequest, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        return Intrinsics.c(this.f13137a, imageRequest.f13137a) && this.b.equals(imageRequest.b) && Intrinsics.c(this.c, imageRequest.c) && Intrinsics.c(this.d, imageRequest.d) && this.e.equals(imageRequest.e) && Intrinsics.c(this.f, imageRequest.f) && Intrinsics.c(this.g, imageRequest.g) && Intrinsics.c(this.h, imageRequest.h) && Intrinsics.c(this.i, imageRequest.i) && this.j == imageRequest.j && this.k == imageRequest.k && this.l == imageRequest.l && Intrinsics.c(this.m, imageRequest.m) && Intrinsics.c(this.n, imageRequest.n) && Intrinsics.c(this.o, imageRequest.o) && Intrinsics.c(this.p, imageRequest.p) && this.q == imageRequest.q && this.r == imageRequest.r && this.s.equals(imageRequest.s) && this.t.equals(imageRequest.t) && Intrinsics.c(this.u, imageRequest.u);
    }

    public final int hashCode() {
        int iE = a.e(this.f13137a.hashCode() * 31, 31, this.b);
        Target target = this.c;
        int iHashCode = (iE + (target == null ? 0 : target.hashCode())) * 31;
        Listener listener = this.d;
        return this.u.hashCode() + ((this.t.hashCode() + d.d(this.s.f13043a, (this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + d.d(this.e, (iHashCode + (listener != null ? listener.hashCode() : 0)) * 961, 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.f13137a + ", data=" + this.b + ", target=" + this.c + ", listener=" + this.d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.e + ", diskCacheKey=null, fileSystem=" + this.f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.g + ", fetcherCoroutineContext=" + this.h + ", decoderCoroutineContext=" + this.i + ", memoryCachePolicy=" + this.j + ", diskCachePolicy=" + this.k + ", networkCachePolicy=" + this.l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.m + ", errorFactory=" + this.n + ", fallbackFactory=" + this.o + ", sizeResolver=" + this.p + ", scale=" + this.q + ", precision=" + this.r + ", extras=" + this.s + ", defined=" + this.t + ", defaults=" + this.u + ')';
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil3/request/ImageRequest$Builder;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13138a;
        public Defaults b;
        public Object c;
        public Target d;
        public Listener e;
        public final Map f;
        public CoroutineContext g;
        public CoroutineContext h;
        public CoroutineContext i;
        public CachePolicy j;
        public Function1 k;
        public Function1 l;
        public final Function1 m;
        public SizeResolver n;
        public Scale o;
        public Precision p;
        public Object q;

        public Builder(@NotNull Context context) {
            this.f13138a = context;
            this.b = Defaults.o;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = EmptyMap.d;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = UtilsKt.b();
            this.l = UtilsKt.b();
            this.m = UtilsKt.b();
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = Extras.b;
        }

        public final ImageRequest a() {
            Map mapB;
            Extras extrasA;
            Object obj = this.c;
            if (obj == null) {
                obj = NullRequestData.f13143a;
            }
            Object obj2 = obj;
            Target target = this.d;
            Listener listener = this.e;
            Boolean bool = Boolean.FALSE;
            Map map = this.f;
            if (Intrinsics.c(map, bool)) {
                Intrinsics.f(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                mapB = Collections_jvmCommonKt.b(TypeIntrinsics.b(map));
            } else {
                if (!(map instanceof Map)) {
                    throw new AssertionError();
                }
                mapB = map;
            }
            Map map2 = mapB;
            Intrinsics.f(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            Defaults defaults = this.b;
            FileSystem fileSystem = defaults.f13139a;
            CachePolicy cachePolicy = defaults.e;
            CachePolicy cachePolicy2 = this.j;
            if (cachePolicy2 == null) {
                cachePolicy2 = defaults.f;
            }
            CachePolicy cachePolicy3 = cachePolicy2;
            CachePolicy cachePolicy4 = defaults.g;
            CoroutineContext coroutineContext = this.g;
            if (coroutineContext == null) {
                coroutineContext = defaults.b;
            }
            CoroutineContext coroutineContext2 = coroutineContext;
            CoroutineContext coroutineContext3 = this.h;
            if (coroutineContext3 == null) {
                coroutineContext3 = defaults.c;
            }
            CoroutineContext coroutineContext4 = coroutineContext3;
            CoroutineContext coroutineContext5 = this.i;
            if (coroutineContext5 == null) {
                coroutineContext5 = defaults.d;
            }
            CoroutineContext coroutineContext6 = coroutineContext5;
            Function1 function1 = this.k;
            if (function1 == null) {
                function1 = defaults.h;
            }
            Function1 function12 = function1;
            Function1 function13 = this.l;
            if (function13 == null) {
                function13 = defaults.i;
            }
            Function1 function14 = function13;
            Function1 function15 = this.m;
            if (function15 == null) {
                function15 = defaults.j;
            }
            Function1 function16 = function15;
            SizeResolver sizeResolver = this.n;
            if (sizeResolver == null) {
                sizeResolver = defaults.k;
            }
            SizeResolver sizeResolver2 = sizeResolver;
            Scale scale = this.o;
            if (scale == null) {
                scale = defaults.l;
            }
            Scale scale2 = scale;
            Precision precision = this.p;
            if (precision == null) {
                precision = defaults.m;
            }
            Precision precision2 = precision;
            Object obj3 = this.q;
            if (obj3 instanceof Extras.Builder) {
                extrasA = ((Extras.Builder) obj3).a();
            } else {
                if (!(obj3 instanceof Extras)) {
                    throw new AssertionError();
                }
                extrasA = (Extras) obj3;
            }
            Extras extras = extrasA;
            CoroutineContext coroutineContext7 = this.g;
            CoroutineContext coroutineContext8 = this.h;
            CoroutineContext coroutineContext9 = this.i;
            Function1 function17 = this.k;
            Function1 function18 = this.l;
            return new ImageRequest(this.f13138a, obj2, target, listener, map2, fileSystem, coroutineContext2, coroutineContext4, coroutineContext6, cachePolicy, cachePolicy3, cachePolicy4, function12, function14, function16, sizeResolver2, scale2, precision2, extras, new Defined(coroutineContext7, coroutineContext8, coroutineContext9, this.j, function17, function18, this.m, this.n, this.o, this.p), this.b);
        }

        public final Extras.Builder b() {
            Object obj = this.q;
            if (obj instanceof Extras.Builder) {
                return (Extras.Builder) obj;
            }
            if (!(obj instanceof Extras)) {
                throw new AssertionError();
            }
            Extras.Builder builder = new Extras.Builder((Extras) obj);
            this.q = builder;
            return builder;
        }

        public Builder(ImageRequest imageRequest, Context context) {
            this.f13138a = context;
            this.b = imageRequest.u;
            this.c = imageRequest.b;
            this.d = imageRequest.c;
            this.e = imageRequest.d;
            this.f = imageRequest.e;
            Defined defined = imageRequest.t;
            this.g = defined.f13140a;
            this.h = defined.b;
            this.i = defined.c;
            this.j = defined.d;
            this.k = defined.e;
            this.l = defined.f;
            this.m = defined.g;
            this.n = defined.h;
            this.o = defined.i;
            this.p = defined.j;
            this.q = imageRequest.s;
        }
    }
}

package coil.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.support.v4.media.session.a;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.core.impl.b;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.dynamic.page.ui.content.d;
import coil.request.Parameters;
import coil.size.DisplaySizeResolver;
import coil.size.Precision;
import coil.size.RealViewSizeResolver;
import coil.size.Scale;
import coil.size.SizeResolver;
import coil.size.ViewSizeResolver;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transition.Transition;
import coil.util.Collections;
import coil.util.Requests;
import coil.util.Utils;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.MainCoroutineDispatcher;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil/request/ImageRequest;", "", "Builder", "Listener", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageRequest {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13017a;
    public final Object b;
    public final Target c;
    public final Bitmap.Config d;
    public final Precision e;
    public final List f;
    public final Transition.Factory g;
    public final Headers h;
    public final Tags i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final CachePolicy n;
    public final CachePolicy o;
    public final CachePolicy p;
    public final CoroutineDispatcher q;
    public final CoroutineDispatcher r;
    public final CoroutineDispatcher s;
    public final CoroutineDispatcher t;
    public final Lifecycle u;
    public final SizeResolver v;
    public final Scale w;
    public final Parameters x;
    public final DefinedRequestOptions y;
    public final DefaultRequestOptions z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcoil/request/ImageRequest$Listener;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
        }
    }

    public ImageRequest(Context context, Object obj, Target target, Bitmap.Config config, Precision precision, List list, Transition.Factory factory, Headers headers, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, Parameters parameters, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions) {
        this.f13017a = context;
        this.b = obj;
        this.c = target;
        this.d = config;
        this.e = precision;
        this.f = list;
        this.g = factory;
        this.h = headers;
        this.i = tags;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = cachePolicy;
        this.o = cachePolicy2;
        this.p = cachePolicy3;
        this.q = coroutineDispatcher;
        this.r = coroutineDispatcher2;
        this.s = coroutineDispatcher3;
        this.t = coroutineDispatcher4;
        this.u = lifecycle;
        this.v = sizeResolver;
        this.w = scale;
        this.x = parameters;
        this.y = definedRequestOptions;
        this.z = defaultRequestOptions;
    }

    public static Builder a(ImageRequest imageRequest) {
        Context context = imageRequest.f13017a;
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
        return Intrinsics.c(this.f13017a, imageRequest.f13017a) && this.b.equals(imageRequest.b) && Intrinsics.c(this.c, imageRequest.c) && this.d == imageRequest.d && this.e == imageRequest.e && Intrinsics.c(this.f, imageRequest.f) && Intrinsics.c(this.g, imageRequest.g) && Intrinsics.c(this.h, imageRequest.h) && Intrinsics.c(this.i, imageRequest.i) && this.j == imageRequest.j && this.k == imageRequest.k && this.l == imageRequest.l && this.m == imageRequest.m && this.n == imageRequest.n && this.o == imageRequest.o && this.p == imageRequest.p && Intrinsics.c(this.q, imageRequest.q) && Intrinsics.c(this.r, imageRequest.r) && Intrinsics.c(this.s, imageRequest.s) && Intrinsics.c(this.t, imageRequest.t) && Intrinsics.c(this.u, imageRequest.u) && this.v.equals(imageRequest.v) && this.w == imageRequest.w && Intrinsics.c(this.x, imageRequest.x) && this.y.equals(imageRequest.y) && Intrinsics.c(this.z, imageRequest.z);
    }

    public final int hashCode() {
        int iE = a.e(this.f13017a.hashCode() * 31, 31, this.b);
        Target target = this.c;
        return this.z.hashCode() + ((this.y.hashCode() + d.d(this.x.d, (this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + b.e(b.e(b.e(b.e(d.d(this.i.f13025a, (((this.g.hashCode() + b.d((this.e.hashCode() + ((this.d.hashCode() + ((iE + (target != null ? target.hashCode() : 0)) * 923521)) * 961)) * 29791, 31, this.f)) * 31) + Arrays.hashCode(this.h.d)) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, -1807454463)) * 31);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil/request/ImageRequest$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13018a;
        public DefaultRequestOptions b;
        public Object c;
        public Target d;
        public Precision e;
        public final List f;
        public Transition.Factory g;
        public final Headers.Builder h;
        public final LinkedHashMap i;
        public final boolean j;
        public final boolean k;
        public final Parameters.Builder l;
        public SizeResolver m;
        public Scale n;
        public Lifecycle o;
        public SizeResolver p;
        public Scale q;

        public Builder(@NotNull Context context) {
            this.f13018a = context;
            this.b = Requests.f13032a;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = EmptyList.d;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = true;
            this.k = true;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
        }

        public final ImageRequest a() {
            CoroutineDispatcher coroutineDispatcher;
            View view;
            Object obj = this.c;
            if (obj == null) {
                obj = NullRequestData.f13019a;
            }
            Object obj2 = obj;
            Target target = this.d;
            DefaultRequestOptions defaultRequestOptions = this.b;
            Bitmap.Config config = defaultRequestOptions.g;
            Precision precision = this.e;
            if (precision == null) {
                precision = defaultRequestOptions.f;
            }
            Precision precision2 = precision;
            Transition.Factory factory = this.g;
            if (factory == null) {
                factory = defaultRequestOptions.e;
            }
            Transition.Factory factory2 = factory;
            Headers.Builder builder = this.h;
            Headers headersE = builder != null ? builder.e() : null;
            if (headersE == null) {
                headersE = Utils.c;
            } else {
                Bitmap.Config[] configArr = Utils.f13033a;
            }
            Headers headers = headersE;
            LinkedHashMap linkedHashMap = this.i;
            Tags tags = linkedHashMap != null ? new Tags(Collections.b(linkedHashMap)) : null;
            if (tags == null) {
                tags = Tags.b;
            }
            Tags tags2 = tags;
            DefaultRequestOptions defaultRequestOptions2 = this.b;
            boolean z = defaultRequestOptions2.h;
            defaultRequestOptions2.getClass();
            DefaultRequestOptions defaultRequestOptions3 = this.b;
            CachePolicy cachePolicy = defaultRequestOptions3.i;
            CachePolicy cachePolicy2 = defaultRequestOptions3.j;
            CachePolicy cachePolicy3 = defaultRequestOptions3.k;
            MainCoroutineDispatcher mainCoroutineDispatcher = defaultRequestOptions3.f13014a;
            CoroutineDispatcher coroutineDispatcher2 = defaultRequestOptions3.b;
            CoroutineDispatcher coroutineDispatcher3 = defaultRequestOptions3.c;
            CoroutineDispatcher coroutineDispatcher4 = defaultRequestOptions3.d;
            Lifecycle lifecycle = this.o;
            Context context = this.f13018a;
            if (lifecycle != null) {
                coroutineDispatcher = coroutineDispatcher4;
            } else {
                if (this.d instanceof ViewTarget) {
                    throw null;
                }
                coroutineDispatcher = coroutineDispatcher4;
                Object baseContext = context;
                while (true) {
                    if (baseContext instanceof LifecycleOwner) {
                        lifecycle = ((LifecycleOwner) baseContext).getD();
                        break;
                    }
                    if (!(baseContext instanceof ContextWrapper)) {
                        lifecycle = null;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
                if (lifecycle == null) {
                    lifecycle = GlobalLifecycle.b;
                }
            }
            Lifecycle lifecycle2 = lifecycle;
            SizeResolver realViewSizeResolver = this.m;
            if (realViewSizeResolver == null && (realViewSizeResolver = this.p) == null) {
                realViewSizeResolver = this.d instanceof ViewTarget ? new RealViewSizeResolver(null) : new DisplaySizeResolver(context);
            }
            SizeResolver sizeResolver = realViewSizeResolver;
            Scale scale = this.n;
            if (scale == null && (scale = this.q) == null) {
                SizeResolver sizeResolver2 = this.m;
                ViewSizeResolver viewSizeResolver = sizeResolver2 instanceof ViewSizeResolver ? (ViewSizeResolver) sizeResolver2 : null;
                if (viewSizeResolver == null || (view = viewSizeResolver.getD()) == null) {
                    view = null;
                }
                if (view instanceof ImageView) {
                    Bitmap.Config[] configArr2 = Utils.f13033a;
                    ImageView.ScaleType scaleType = ((ImageView) view).getScaleType();
                    int i = scaleType == null ? -1 : Utils.WhenMappings.f13034a[scaleType.ordinal()];
                    scale = (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.e : Scale.d;
                } else {
                    scale = Scale.e;
                }
            }
            Scale scale2 = scale;
            Parameters.Builder builder2 = this.l;
            Parameters parameters = builder2 != null ? new Parameters(Collections.b(builder2.f13022a)) : null;
            if (parameters == null) {
                parameters = Parameters.e;
            }
            return new ImageRequest(context, obj2, target, config, precision2, this.f, factory2, headers, tags2, this.j, z, false, this.k, cachePolicy, cachePolicy2, cachePolicy3, mainCoroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher, lifecycle2, sizeResolver, scale2, parameters, new DefinedRequestOptions(this.m, this.n, this.g, this.e), this.b);
        }

        public Builder(ImageRequest imageRequest, Context context) {
            this.f13018a = context;
            this.b = imageRequest.z;
            this.c = imageRequest.b;
            this.d = imageRequest.c;
            DefinedRequestOptions definedRequestOptions = imageRequest.y;
            this.e = definedRequestOptions.d;
            this.f = imageRequest.f;
            this.g = definedRequestOptions.c;
            this.h = imageRequest.h.g();
            this.i = MapsKt.s(imageRequest.i.f13025a);
            this.j = imageRequest.j;
            this.k = imageRequest.m;
            Parameters parameters = imageRequest.x;
            parameters.getClass();
            this.l = new Parameters.Builder(parameters);
            this.m = definedRequestOptions.f13015a;
            this.n = definedRequestOptions.b;
            if (imageRequest.f13017a == context) {
                this.o = imageRequest.u;
                this.p = imageRequest.v;
                this.q = imageRequest.w;
            } else {
                this.o = null;
                this.p = null;
                this.q = null;
            }
        }
    }
}

package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import coil.size.Scale;
import coil.size.Size;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/Options;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Options {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13021a;
    public final Bitmap.Config b;
    public final Size c;
    public final Scale d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Headers h;
    public final Tags i;
    public final Parameters j;
    public final CachePolicy k;
    public final CachePolicy l;
    public final CachePolicy m;

    public Options(Context context, Bitmap.Config config, Size size, Scale scale, boolean z, boolean z2, boolean z3, Headers headers, Tags tags, Parameters parameters, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f13021a = context;
        this.b = config;
        this.c = size;
        this.d = scale;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = headers;
        this.i = tags;
        this.j = parameters;
        this.k = cachePolicy;
        this.l = cachePolicy2;
        this.m = cachePolicy3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return Intrinsics.c(this.f13021a, options.f13021a) && this.b == options.b && Intrinsics.c(this.c, options.c) && this.d == options.d && this.e == options.e && this.f == options.f && this.g == options.g && Intrinsics.c(this.h, options.h) && Intrinsics.c(this.i, options.i) && Intrinsics.c(this.j, options.j) && this.k == options.k && this.l == options.l && this.m == options.m;
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + d.d(this.j.d, d.d(this.i.f13025a, (b.e(b.e(b.e((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13021a.hashCode() * 31)) * 961)) * 31)) * 31, 31, this.e), 31, this.f), 961, this.g) + Arrays.hashCode(this.h.d)) * 31, 31), 31)) * 31)) * 31);
    }
}

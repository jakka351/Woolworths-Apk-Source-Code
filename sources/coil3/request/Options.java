package coil3.request;

import android.content.Context;
import coil3.Extras;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/request/Options;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Options {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13145a;
    public final Size b;
    public final Scale c;
    public final Precision d;
    public final String e;
    public final FileSystem f;
    public final CachePolicy g;
    public final CachePolicy h;
    public final CachePolicy i;
    public final Extras j;

    public Options(Context context, Size size, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Extras extras) {
        this.f13145a = context;
        this.b = size;
        this.c = scale;
        this.d = precision;
        this.e = str;
        this.f = fileSystem;
        this.g = cachePolicy;
        this.h = cachePolicy2;
        this.i = cachePolicy3;
        this.j = extras;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return Intrinsics.c(this.f13145a, options.f13145a) && Intrinsics.c(this.b, options.b) && this.c == options.c && this.d == options.d && Intrinsics.c(this.e, options.e) && Intrinsics.c(this.f, options.f) && this.g == options.g && this.h == options.h && this.i == options.i && Intrinsics.c(this.j, options.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13145a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.f13043a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f13145a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ')';
    }
}

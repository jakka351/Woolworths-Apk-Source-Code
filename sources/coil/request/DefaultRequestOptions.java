package coil.request;

import android.graphics.Bitmap;
import androidx.camera.core.impl.b;
import coil.size.Precision;
import coil.transition.NoneTransition;
import coil.transition.Transition;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/DefaultRequestOptions;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultRequestOptions {

    /* renamed from: a, reason: collision with root package name */
    public final MainCoroutineDispatcher f13014a;
    public final CoroutineDispatcher b;
    public final CoroutineDispatcher c;
    public final CoroutineDispatcher d;
    public final NoneTransition.Factory e;
    public final Precision f;
    public final Bitmap.Config g;
    public final boolean h;
    public final CachePolicy i;
    public final CachePolicy j;
    public final CachePolicy k;

    public DefaultRequestOptions() {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        MainCoroutineDispatcher mainCoroutineDispatcherT = MainDispatcherLoader.f24726a.T();
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
        Precision precision = Precision.f;
        Bitmap.Config config = Utils.b;
        CachePolicy cachePolicy = CachePolicy.f;
        this.f13014a = mainCoroutineDispatcherT;
        this.b = defaultIoScheduler;
        this.c = defaultIoScheduler;
        this.d = defaultIoScheduler;
        this.e = Transition.Factory.f13031a;
        this.f = precision;
        this.g = config;
        this.h = true;
        this.i = cachePolicy;
        this.j = cachePolicy;
        this.k = cachePolicy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultRequestOptions)) {
            return false;
        }
        DefaultRequestOptions defaultRequestOptions = (DefaultRequestOptions) obj;
        return Intrinsics.c(this.f13014a, defaultRequestOptions.f13014a) && Intrinsics.c(this.b, defaultRequestOptions.b) && Intrinsics.c(this.c, defaultRequestOptions.c) && Intrinsics.c(this.d, defaultRequestOptions.d) && Intrinsics.c(this.e, defaultRequestOptions.e) && this.f == defaultRequestOptions.f && this.g == defaultRequestOptions.g && this.h == defaultRequestOptions.h && this.i == defaultRequestOptions.i && this.j == defaultRequestOptions.j && this.k == defaultRequestOptions.k;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13014a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.e.getClass();
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + b.e(b.e((this.g.hashCode() + ((this.f.hashCode() + ((NoneTransition.Factory.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.h), 923521, false)) * 31)) * 31);
    }
}

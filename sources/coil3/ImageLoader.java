package coil3;

import android.content.Context;
import androidx.lifecycle.d;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil3/ImageLoader;", "", "Builder", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ImageLoader {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil3/ImageLoader$Builder;", "", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "<init>", "(Landroid/content/Context;)V", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13047a;
        public final ImageRequest.Defaults b = ImageRequest.Defaults.o;
        public ComponentRegistry c = null;
        public final Extras.Builder d = new Extras.Builder();

        public Builder(@NotNull Context context) {
            this.f13047a = context.getApplicationContext();
        }

        public final RealImageLoader a() {
            ComponentRegistry componentRegistry;
            Extras extrasA = this.d.a();
            ImageRequest.Defaults defaults = this.b;
            ImageRequest.Defaults defaults2 = new ImageRequest.Defaults(defaults.f13139a, defaults.b, defaults.c, defaults.d, defaults.e, defaults.f, defaults.g, defaults.h, defaults.i, defaults.j, defaults.k, defaults.l, defaults.m, extrasA);
            Lazy lazyB = LazyKt.b(new d(this, 6));
            Lazy lazyB2 = LazyKt.b(new androidx.lifecycle.compose.d(13));
            ComponentRegistry componentRegistry2 = this.c;
            if (componentRegistry2 == null) {
                EmptyList emptyList = EmptyList.d;
                componentRegistry = new ComponentRegistry(emptyList, emptyList, emptyList, emptyList, emptyList);
            } else {
                componentRegistry = componentRegistry2;
            }
            return new RealImageLoader(new RealImageLoader.Options(this.f13047a, defaults2, lazyB, lazyB2, componentRegistry));
        }
    }

    Object a(ImageRequest imageRequest, ContinuationImpl continuationImpl);

    Disposable b(ImageRequest imageRequest);
}

package coil;

import android.content.Context;
import coil.request.DefaultRequestOptions;
import coil.request.ImageRequest;
import coil.util.ImageLoaderOptions;
import coil.util.Requests;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil/ImageLoader;", "", "Builder", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ImageLoader {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil/ImageLoader$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f12963a;
        public final DefaultRequestOptions b = Requests.f13032a;
        public final ImageLoaderOptions c = new ImageLoaderOptions();

        public Builder(@NotNull Context context) {
            this.f12963a = context.getApplicationContext();
        }
    }

    DefaultRequestOptions a();

    Object b(ImageRequest imageRequest, SuspendLambda suspendLambda);
}

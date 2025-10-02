package coil3.request;

import coil3.Extras;
import coil3.request.ImageRequest;
import coil3.size.Dimension;
import coil3.size.DimensionKt;
import coil3.size.Size;
import coil3.transition.CrossfadeTransition;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageRequestsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Extras.Key f13141a;
    public static final Extras.Key b;

    static {
        int i = 4096;
        DimensionKt.a(4096);
        Dimension.Pixels pixels = new Dimension.Pixels(i);
        DimensionKt.a(4096);
        f13141a = new Extras.Key(new Size(pixels, new Dimension.Pixels(i)));
        b = new Extras.Key(Boolean.FALSE);
    }

    public static final void a(ImageRequest.Builder builder) {
        Extras.Key key = ImageRequests_androidKt.f13142a;
        builder.b().b(ImageRequests_androidKt.b, new CrossfadeTransition.Factory(200));
    }
}

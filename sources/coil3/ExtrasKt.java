package coil3;

import coil3.Extras;
import coil3.request.ImageRequest;
import coil3.request.Options;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExtrasKt {
    public static final Object a(ImageRequest imageRequest, Extras.Key key) {
        Object obj = imageRequest.s.f13043a.get(key);
        if (obj != null) {
            return obj;
        }
        Object obj2 = imageRequest.u.n.f13043a.get(key);
        return obj2 == null ? key.f13045a : obj2;
    }

    public static final Object b(Options options, Extras.Key key) {
        Object obj = options.j.f13043a.get(key);
        return obj == null ? key.f13045a : obj;
    }
}

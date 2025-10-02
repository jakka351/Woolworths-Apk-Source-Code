package coil3.compose;

import coil3.request.ImageRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil3/compose/AsyncImageModelEqualityDelegate$Companion$Default$1", "Lcoil3/compose/AsyncImageModelEqualityDelegate;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AsyncImageModelEqualityDelegate$Companion$Default$1 implements AsyncImageModelEqualityDelegate {
    @Override // coil3.compose.AsyncImageModelEqualityDelegate
    public final boolean equals(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof ImageRequest) || !(obj2 instanceof ImageRequest)) {
            return Intrinsics.c(obj, obj2);
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        ImageRequest imageRequest2 = (ImageRequest) obj2;
        return Intrinsics.c(imageRequest.f13137a, imageRequest2.f13137a) && imageRequest.b.equals(imageRequest2.b) && imageRequest.e.equals(imageRequest2.e) && Intrinsics.c(imageRequest.p, imageRequest2.p) && imageRequest.q == imageRequest2.q && imageRequest.r == imageRequest2.r;
    }

    @Override // coil3.compose.AsyncImageModelEqualityDelegate
    public final int hashCode(Object obj) {
        if (!(obj instanceof ImageRequest)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        return imageRequest.r.hashCode() + ((imageRequest.q.hashCode() + ((imageRequest.p.hashCode() + au.com.woolworths.dynamic.page.ui.content.d.d(imageRequest.e, android.support.v4.media.session.a.e(imageRequest.f13137a.hashCode() * 31, 961, imageRequest.b), 961)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}

package coil3.compose;

import androidx.compose.runtime.Stable;
import coil3.ImageLoader;
import coil3.annotation.ExperimentalCoilApi;
import coil3.request.ImageRequest;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcoil3/compose/AsyncImagePreviewHandler;", "", "Companion", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalCoilApi
/* loaded from: classes.dex */
public interface AsyncImagePreviewHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final AsyncImagePreviewHandler f13064a = null;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcoil3/compose/AsyncImagePreviewHandler$Companion;", "", "Lcoil3/compose/AsyncImagePreviewHandler;", "Default", "Lcoil3/compose/AsyncImagePreviewHandler;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    Object a(ImageLoader imageLoader, ImageRequest imageRequest, ContinuationImpl continuationImpl);
}

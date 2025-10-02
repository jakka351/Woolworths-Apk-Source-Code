package coil3.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil3.SingletonImageLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SingletonAsyncImagePainterKt {
    public static final AsyncImagePainter a(int i, Composer composer, Object obj) {
        int i2 = i & 14;
        int i3 = i << 3;
        return AsyncImagePainterKt.a(obj, SingletonImageLoader.a((Context) composer.x(AndroidCompositionLocals_androidKt.b)), AsyncImagePainter.y, null, ContentScale.Companion.b, composer, i2 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
    }
}

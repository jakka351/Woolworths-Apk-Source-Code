package coil3.compose;

import android.os.Trace;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.lifecycle.Lifecycle;
import coil3.ExtrasKt;
import coil3.ImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.AsyncImageState;
import coil3.compose.internal.UtilsKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AsyncImagePainterKt {
    public static final AsyncImagePainter a(Object obj, ImageLoader imageLoader, Function1 function1, Function1 function12, ContentScale contentScale, Composer composer, int i) {
        AsyncImagePreviewHandler asyncImagePreviewHandler;
        AsyncImageState asyncImageStateA = UtilsKt.a(obj, imageLoader, composer);
        composer.o(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            ImageRequest imageRequestC = UtilsKt.c(asyncImageStateA.f13069a, composer);
            c(imageRequestC);
            AsyncImagePainter.Input input = new AsyncImagePainter.Input(asyncImageStateA.c, imageRequestC, asyncImageStateA.b);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new AsyncImagePainter(input);
                composer.A(objG);
            }
            AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objG;
            asyncImagePainter.o = UtilsKt.b(composer);
            asyncImagePainter.p = function1;
            asyncImagePainter.q = function12;
            asyncImagePainter.r = contentScale;
            asyncImagePainter.s = 1;
            if (((Boolean) composer.x(InspectionModeKt.f1972a)).booleanValue()) {
                composer.o(-924922939);
                asyncImagePreviewHandler = (AsyncImagePreviewHandler) composer.x(LocalAsyncImagePreviewHandlerKt.a());
                composer.l();
            } else {
                composer.o(-924865434);
                composer.l();
                asyncImagePreviewHandler = null;
            }
            asyncImagePainter.t = asyncImagePreviewHandler;
            asyncImagePainter.u.setValue(input);
            composer.l();
            return asyncImagePainter;
        } finally {
            Trace.endSection();
        }
    }

    public static void b(String str) {
        throw new IllegalArgumentException(YU.a.i("Unsupported type: ", str, ". ", YU.a.h("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void c(ImageRequest imageRequest) {
        Object obj = imageRequest.b;
        if (obj instanceof ImageRequest.Builder) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof ImageBitmap) {
            b("ImageBitmap");
            throw null;
        }
        if (obj instanceof ImageVector) {
            b("ImageVector");
            throw null;
        }
        if (obj instanceof Painter) {
            b("Painter");
            throw null;
        }
        if (imageRequest.c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        if (((Lifecycle) ExtrasKt.a(imageRequest, ImageRequests_androidKt.f)) != null) {
            throw new IllegalArgumentException("request.lifecycle must be null.");
        }
    }
}

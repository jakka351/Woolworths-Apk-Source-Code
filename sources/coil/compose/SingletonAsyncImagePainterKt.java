package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import coil.Coil;
import coil.ImageLoader;
import coil.ImageLoaderFactory;
import coil.ImageLoaders;
import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-singleton_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SingletonAsyncImagePainterKt {
    public static final AsyncImagePainter a(ImageRequest imageRequest, Composer composer) {
        composer.F(-1494234083);
        Function1 function1 = AsyncImagePainter.x;
        AsyncImagePainter$Companion$DefaultTransform$1 asyncImagePainter$Companion$DefaultTransform$1 = AsyncImagePainter$Companion$DefaultTransform$1.h;
        ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.b;
        ImageLoader imageLoaderA = (ImageLoader) composer.x(LocalImageLoaderKt.f12971a);
        if (imageLoaderA == null) {
            Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
            ImageLoader imageLoader = Coil.b;
            if (imageLoader == null) {
                synchronized (Coil.f12959a) {
                    try {
                        imageLoader = Coil.b;
                        if (imageLoader != null) {
                            imageLoaderA = imageLoader;
                        } else {
                            Object applicationContext = context.getApplicationContext();
                            ImageLoaderFactory imageLoaderFactory = applicationContext instanceof ImageLoaderFactory ? (ImageLoaderFactory) applicationContext : null;
                            imageLoaderA = imageLoaderFactory != null ? imageLoaderFactory.a() : ImageLoaders.a(context);
                            Coil.b = imageLoaderA;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                imageLoaderA = imageLoader;
            }
        }
        composer.F(-2020614074);
        int i = UtilsKt.f12972a;
        Object obj = imageRequest.b;
        if (obj instanceof ImageRequest.Builder) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof ImageBitmap) {
            AsyncImagePainterKt.a("ImageBitmap");
            throw null;
        }
        if (obj instanceof ImageVector) {
            AsyncImagePainterKt.a("ImageVector");
            throw null;
        }
        if (obj instanceof Painter) {
            AsyncImagePainterKt.a("Painter");
            throw null;
        }
        if (imageRequest.c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        composer.F(-492369756);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new AsyncImagePainter(imageRequest, imageLoaderA);
            composer.A(objG);
        }
        composer.N();
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objG;
        asyncImagePainter.p = asyncImagePainter$Companion$DefaultTransform$1;
        asyncImagePainter.q = null;
        asyncImagePainter.r = contentScale$Companion$Fit$1;
        asyncImagePainter.s = 1;
        asyncImagePainter.t = ((Boolean) composer.x(InspectionModeKt.f1972a)).booleanValue();
        ((SnapshotMutableStateImpl) asyncImagePainter.w).setValue(imageLoaderA);
        ((SnapshotMutableStateImpl) asyncImagePainter.v).setValue(imageRequest);
        asyncImagePainter.c();
        composer.N();
        composer.N();
        return asyncImagePainter;
    }
}

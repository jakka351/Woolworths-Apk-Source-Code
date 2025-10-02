package coil.decode;

import android.content.Context;
import android.graphics.Bitmap;
import coil.decode.ImageSource;
import coil.util.Utils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import okio.BufferedSource;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class ImageSources {
    public static final SourceImageSource a(BufferedSource bufferedSource, final Context context) {
        return new SourceImageSource(bufferedSource, new Function0<File>() { // from class: coil.decode.ImageSources$ImageSource$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bitmap.Config[] configArr = Utils.f13033a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                return cacheDir;
            }
        }, null);
    }

    public static final SourceImageSource b(RealBufferedSource realBufferedSource, final Context context, ImageSource.Metadata metadata) {
        return new SourceImageSource(realBufferedSource, new Function0<File>() { // from class: coil.decode.ImageSources$ImageSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bitmap.Config[] configArr = Utils.f13033a;
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    throw new IllegalStateException("cacheDir == null");
                }
                cacheDir.mkdirs();
                return cacheDir;
            }
        }, metadata);
    }
}

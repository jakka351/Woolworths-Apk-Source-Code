package coil3.decode;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import coil3.decode.ImageSource;
import coil3.request.Options;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import okio.Path;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StaticImageDecoderKt {
    public static final ImageDecoder.Source a(ImageSource imageSource, Options options, boolean z) throws ErrnoException {
        Path pathR0;
        if (imageSource.getD() == FileSystem.d && (pathR0 = imageSource.R0()) != null) {
            return ImageDecoder.createSource(pathR0.toFile());
        }
        ImageSource.Metadata metadata = imageSource.getE();
        if (metadata instanceof AssetMetadata) {
            return ImageDecoder.createSource(options.f13145a.getAssets(), ((AssetMetadata) metadata).getF13071a());
        }
        if ((metadata instanceof ContentMetadata) && Build.VERSION.SDK_INT >= 29) {
            try {
                AssetFileDescriptor f13075a = ((ContentMetadata) metadata).getF13075a();
                Os.lseek(f13075a.getFileDescriptor(), f13075a.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new d(f13075a, 0));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof ResourceMetadata) {
            ResourceMetadata resourceMetadata = (ResourceMetadata) metadata;
            if (Intrinsics.c(resourceMetadata.getF13080a(), options.f13145a.getPackageName())) {
                return ImageDecoder.createSource(options.f13145a.getResources(), resourceMetadata.getB());
            }
        }
        if (!(metadata instanceof ByteBufferMetadata)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((ByteBufferMetadata) metadata).getF13074a().isDirect()) {
            return ImageDecoder.createSource(((ByteBufferMetadata) metadata).getF13074a());
        }
        return null;
    }
}

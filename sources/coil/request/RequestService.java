package coil.request;

import android.graphics.Bitmap;
import coil.RealImageLoader;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.target.ViewTarget;
import coil.util.HardwareBitmapService;
import coil.util.HardwareBitmaps;
import coil.util.Requests;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/RequestService;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RequestService {

    /* renamed from: a, reason: collision with root package name */
    public final RealImageLoader f13023a;
    public final SystemCallbacks b;
    public final HardwareBitmapService c = HardwareBitmaps.a();

    public RequestService(RealImageLoader realImageLoader, SystemCallbacks systemCallbacks) {
        this.f13023a = realImageLoader;
        this.b = systemCallbacks;
    }

    public static ErrorResult a(ImageRequest imageRequest, Throwable th) {
        if (th instanceof NullRequestDataException) {
            imageRequest.getClass();
            DefaultRequestOptions defaultRequestOptions = imageRequest.z;
            defaultRequestOptions.getClass();
            DefaultRequestOptions defaultRequestOptions2 = Requests.f13032a;
            defaultRequestOptions.getClass();
        } else {
            imageRequest.z.getClass();
            DefaultRequestOptions defaultRequestOptions3 = Requests.f13032a;
        }
        return new ErrorResult(null, imageRequest, th);
    }

    public static boolean b(ImageRequest imageRequest, Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return true;
        }
        if (!imageRequest.k) {
            return false;
        }
        if (imageRequest.c instanceof ViewTarget) {
            throw null;
        }
        return true;
    }

    public final Options c(ImageRequest imageRequest, Size size) {
        Bitmap.Config config;
        if (imageRequest.f.isEmpty() || ArraysKt.l(Utils.f13033a, imageRequest.d)) {
            Bitmap.Config config2 = imageRequest.d;
            if (config2 == Bitmap.Config.HARDWARE) {
                if (b(imageRequest, config2)) {
                    this.c.a();
                }
                config = Bitmap.Config.ARGB_8888;
            }
            config = imageRequest.d;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config3 = config;
        CachePolicy cachePolicy = this.b.g ? imageRequest.p : CachePolicy.g;
        Dimension dimension = size.f13028a;
        Dimension.Undefined undefined = Dimension.Undefined.f13027a;
        return new Options(imageRequest.f13017a, config3, size, (dimension.equals(undefined) || size.b.equals(undefined)) ? Scale.e : imageRequest.w, Requests.a(imageRequest), imageRequest.l && imageRequest.f.isEmpty() && config3 != Bitmap.Config.ALPHA_8, imageRequest.m, imageRequest.h, imageRequest.i, imageRequest.x, imageRequest.n, imageRequest.o, cachePolicy);
    }
}

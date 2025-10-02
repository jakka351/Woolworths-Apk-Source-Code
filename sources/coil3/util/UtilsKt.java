package coil3.util;

import coil3.Image;
import coil3.decode.DataSource;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.NullRequestDataException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class UtilsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Function1 f13156a = null;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DataSource dataSource = DataSource.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DataSource dataSource2 = DataSource.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DataSource dataSource3 = DataSource.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final ErrorResult a(ImageRequest imageRequest, Throwable th) {
        Image image;
        if (th instanceof NullRequestDataException) {
            Function1 function1 = imageRequest.o;
            ImageRequest.Defaults defaults = imageRequest.u;
            image = (Image) function1.invoke(imageRequest);
            if (image == null) {
                image = (Image) defaults.j.invoke(imageRequest);
            }
            if (image == null && (image = (Image) imageRequest.n.invoke(imageRequest)) == null) {
                image = (Image) defaults.i.invoke(imageRequest);
            }
        } else {
            image = (Image) imageRequest.n.invoke(imageRequest);
            if (image == null) {
                image = (Image) imageRequest.u.i.invoke(imageRequest);
            }
        }
        return new ErrorResult(image, imageRequest, th);
    }

    public static final Function1 b() {
        return UtilsKt$EMPTY_IMAGE_FACTORY$1.d;
    }
}

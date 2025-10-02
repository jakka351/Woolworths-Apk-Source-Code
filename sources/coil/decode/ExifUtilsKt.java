package coil.decode;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExifUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f12978a = ArraysKt.r0(new String[]{"image/jpeg", "image/webp", "image/heic", "image/heif"});

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ExifOrientationPolicy exifOrientationPolicy = ExifOrientationPolicy.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ExifOrientationPolicy exifOrientationPolicy2 = ExifOrientationPolicy.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}

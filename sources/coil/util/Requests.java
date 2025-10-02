package coil.util;

import coil.request.DefaultRequestOptions;
import coil.request.ImageRequest;
import coil.size.DisplaySizeResolver;
import coil.size.Precision;
import coil.size.SizeResolver;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
/* renamed from: coil.util.-Requests, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Requests {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultRequestOptions f13032a = new DefaultRequestOptions();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: coil.util.-Requests$WhenMappings */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Precision.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Precision precision = Precision.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Precision precision2 = Precision.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final boolean a(ImageRequest imageRequest) {
        Precision precision = imageRequest.e;
        SizeResolver sizeResolver = imageRequest.v;
        int iOrdinal = precision.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (imageRequest.y.f13015a != null || !(sizeResolver instanceof DisplaySizeResolver)) {
                return false;
            }
        }
        return true;
    }
}

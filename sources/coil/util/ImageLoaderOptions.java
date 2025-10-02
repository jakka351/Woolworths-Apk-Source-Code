package coil.util;

import coil.decode.ExifOrientationPolicy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/util/ImageLoaderOptions;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageLoaderOptions {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13035a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final ExifOrientationPolicy e;

    public ImageLoaderOptions() {
        ExifOrientationPolicy exifOrientationPolicy = ExifOrientationPolicy.d;
        this.f13035a = true;
        this.b = true;
        this.c = true;
        this.d = 4;
        this.e = exifOrientationPolicy;
    }
}

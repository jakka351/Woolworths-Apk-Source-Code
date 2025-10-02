package coil3.request;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import au.com.woolworths.markdown.compat.c;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.request.ImageRequest;
import coil3.transition.Transition;
import coil3.util.Utils_androidKt;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageRequests_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Extras.Key f13142a = new Extras.Key(EmptyList.d);
    public static final Extras.Key b = new Extras.Key(Transition.Factory.f13152a);
    public static final Extras.Key c = new Extras.Key(Utils_androidKt.b);
    public static final Extras.Key d = new Extras.Key(null);
    public static final Extras.Key e;
    public static final Extras.Key f;
    public static final Extras.Key g;
    public static final Extras.Key h;
    public static final Extras.Key i;

    static {
        Boolean bool = Boolean.TRUE;
        e = new Extras.Key(bool);
        f = new Extras.Key(null);
        g = new Extras.Key(bool);
        h = new Extras.Key(bool);
        i = new Extras.Key(Boolean.FALSE);
    }

    public static final void a(ImageRequest.Builder builder, int i2) {
        builder.l = new c(i2, 4);
    }

    public static final Bitmap.Config b(Options options) {
        return (Bitmap.Config) ExtrasKt.b(options, c);
    }

    public static final ColorSpace c(Options options) {
        return (ColorSpace) ExtrasKt.b(options, d);
    }

    public static final void d(ImageRequest.Builder builder, int i2) {
        builder.k = new c(i2, 5);
    }
}

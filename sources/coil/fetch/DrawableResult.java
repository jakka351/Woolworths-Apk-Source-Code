package coil.fetch;

import android.graphics.drawable.Drawable;
import androidx.camera.core.impl.b;
import coil.decode.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/fetch/DrawableResult;", "Lcoil/fetch/FetchResult;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DrawableResult extends FetchResult {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f12990a;
    public final boolean b;
    public final DataSource c;

    public DrawableResult(Drawable drawable, boolean z, DataSource dataSource) {
        this.f12990a = drawable;
        this.b = z;
        this.c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawableResult)) {
            return false;
        }
        DrawableResult drawableResult = (DrawableResult) obj;
        return Intrinsics.c(this.f12990a, drawableResult.f12990a) && this.b == drawableResult.b && this.c == drawableResult.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + b.e(this.f12990a.hashCode() * 31, 31, this.b);
    }
}

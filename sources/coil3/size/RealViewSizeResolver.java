package coil3.size;

import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/size/RealViewSizeResolver;", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcoil3/size/ViewSizeResolver;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RealViewSizeResolver<T extends View> implements ViewSizeResolver<T> {
    public final View d;

    public RealViewSizeResolver(View view) {
        this.d = view;
    }

    @Override // coil3.size.ViewSizeResolver
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RealViewSizeResolver) && Intrinsics.c(this.d, ((RealViewSizeResolver) obj).d);
    }

    @Override // coil3.size.ViewSizeResolver
    /* renamed from: getView, reason: from getter */
    public final View getD() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.d + ", subtractPadding=true)";
    }
}

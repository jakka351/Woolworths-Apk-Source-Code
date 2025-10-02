package coil3.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil3/target/ImageViewTarget;", "Lcoil3/target/GenericViewTarget;", "Landroid/widget/ImageView;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class ImageViewTarget extends GenericViewTarget<ImageView> {
    @Override // coil3.target.GenericViewTarget, coil3.transition.TransitionTarget
    public final Drawable a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ImageViewTarget);
    }

    @Override // coil3.transition.TransitionTarget
    public final /* bridge */ /* synthetic */ View getView() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ImageViewTarget(view=null)";
    }
}

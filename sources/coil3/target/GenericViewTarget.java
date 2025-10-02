package coil3.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil3.Image;
import coil3.transition.TransitionTarget;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/target/GenericViewTarget;", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcoil3/target/ViewTarget;", "Lcoil3/transition/TransitionTarget;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class GenericViewTarget<T extends View> implements ViewTarget<T>, TransitionTarget, DefaultLifecycleObserver {
    @Override // coil3.transition.TransitionTarget
    public abstract Drawable a();

    @Override // coil3.target.Target
    public final void b(Image image) {
        e(image);
        throw null;
    }

    @Override // coil3.target.Target
    public final void c(Image image) {
        e(image);
        throw null;
    }

    @Override // coil3.target.Target
    public final void d(Image image) {
        e(image);
        throw null;
    }

    public final void e(Image image) {
        if (image != null) {
            throw null;
        }
        a();
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        a();
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        a();
        throw null;
    }
}

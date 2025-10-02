package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.transition.TransitionTarget;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcoil/target/GenericViewTarget;", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcoil/target/ViewTarget;", "Lcoil/transition/TransitionTarget;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class GenericViewTarget<T extends View> implements ViewTarget<T>, TransitionTarget, DefaultLifecycleObserver {
    @Override // coil.transition.TransitionTarget
    public abstract Drawable a();

    @Override // coil.target.Target
    public final void b(Drawable drawable) {
        a();
        throw null;
    }

    @Override // coil.target.Target
    public final void c(Drawable drawable) {
        a();
        throw null;
    }

    @Override // coil.target.Target
    public final void d(Drawable drawable) {
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

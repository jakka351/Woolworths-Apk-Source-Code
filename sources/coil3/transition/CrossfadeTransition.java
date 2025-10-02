package coil3.transition;

import android.graphics.drawable.Drawable;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.decode.DataSource;
import coil3.request.ErrorResult;
import coil3.request.ImageResult;
import coil3.request.SuccessResult;
import coil3.transition.Transition;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/transition/CrossfadeTransition;", "Lcoil3/transition/Transition;", "Factory", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CrossfadeTransition implements Transition {

    /* renamed from: a, reason: collision with root package name */
    public final TransitionTarget f13150a;
    public final ImageResult b;
    public final int c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/transition/CrossfadeTransition$Factory;", "Lcoil3/transition/Transition$Factory;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Factory implements Transition.Factory {
        public final int b;

        public Factory(int i) {
            this.b = i;
            if (i <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        @Override // coil3.transition.Transition.Factory
        public final Transition a(TransitionTarget transitionTarget, ImageResult imageResult) {
            if ((imageResult instanceof SuccessResult) && ((SuccessResult) imageResult).c != DataSource.d) {
                return new CrossfadeTransition(transitionTarget, imageResult, this.b);
            }
            return new NoneTransition(transitionTarget, imageResult);
        }
    }

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i) {
        this.f13150a = transitionTarget;
        this.b = imageResult;
        this.c = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // coil3.transition.Transition
    public final void a() {
        TransitionTarget transitionTarget = this.f13150a;
        Drawable drawableA = transitionTarget.a();
        ImageResult imageResult = this.b;
        Image image = imageResult.getF13146a();
        boolean z = imageResult instanceof SuccessResult;
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableA, image != null ? Image_androidKt.a(image, transitionTarget.getView().getResources()) : null, imageResult.getB().q, this.c, (z && ((SuccessResult) imageResult).g) ? false : true);
        if (z) {
            transitionTarget.c(Image_androidKt.b(crossfadeDrawable));
        } else {
            if (!(imageResult instanceof ErrorResult)) {
                throw new NoWhenBranchMatchedException();
            }
            transitionTarget.d(Image_androidKt.b(crossfadeDrawable));
        }
    }
}

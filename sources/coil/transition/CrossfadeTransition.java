package coil.transition;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.drawable.CrossfadeDrawable;
import coil.request.ErrorResult;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/transition/CrossfadeTransition;", "Lcoil/transition/Transition;", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CrossfadeTransition implements Transition {

    /* renamed from: a, reason: collision with root package name */
    public final TransitionTarget f13029a;
    public final ImageResult b;
    public final int c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/transition/CrossfadeTransition$Factory;", "Lcoil/transition/Transition$Factory;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Factory implements Transition.Factory {
        public final int b;

        public Factory(int i) {
            this.b = i;
            if (i <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        @Override // coil.transition.Transition.Factory
        public final Transition a(TransitionTarget transitionTarget, ImageResult imageResult) {
            if ((imageResult instanceof SuccessResult) && ((SuccessResult) imageResult).c != DataSource.d) {
                return new CrossfadeTransition(transitionTarget, imageResult, this.b);
            }
            return new NoneTransition(transitionTarget, imageResult);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Factory) {
                return this.b == ((Factory) obj).b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + (this.b * 31);
        }
    }

    public CrossfadeTransition(TransitionTarget transitionTarget, ImageResult imageResult, int i) {
        this.f13029a = transitionTarget;
        this.b = imageResult;
        this.c = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // coil.transition.Transition
    public final void a() {
        TransitionTarget transitionTarget = this.f13029a;
        Drawable drawableA = transitionTarget.a();
        ImageResult imageResult = this.b;
        boolean z = imageResult instanceof SuccessResult;
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableA, imageResult.getF13024a(), imageResult.getB().w, this.c, (z && ((SuccessResult) imageResult).g) ? false : true);
        if (z) {
            transitionTarget.b(crossfadeDrawable);
        } else if (imageResult instanceof ErrorResult) {
            transitionTarget.d(crossfadeDrawable);
        }
    }
}

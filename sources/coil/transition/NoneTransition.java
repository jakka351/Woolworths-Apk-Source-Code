package coil.transition;

import coil.request.ErrorResult;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.transition.Transition;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/transition/NoneTransition;", "Lcoil/transition/Transition;", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoneTransition implements Transition {

    /* renamed from: a, reason: collision with root package name */
    public final TransitionTarget f13030a;
    public final ImageResult b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/transition/NoneTransition$Factory;", "Lcoil/transition/Transition$Factory;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Factory implements Transition.Factory {
        @Override // coil.transition.Transition.Factory
        public final Transition a(TransitionTarget transitionTarget, ImageResult imageResult) {
            return new NoneTransition(transitionTarget, imageResult);
        }

        public final boolean equals(Object obj) {
            return obj instanceof Factory;
        }

        public final int hashCode() {
            return Factory.class.hashCode();
        }
    }

    public NoneTransition(TransitionTarget transitionTarget, ImageResult imageResult) {
        this.f13030a = transitionTarget;
        this.b = imageResult;
    }

    @Override // coil.transition.Transition
    public final void a() {
        ImageResult imageResult = this.b;
        boolean z = imageResult instanceof SuccessResult;
        TransitionTarget transitionTarget = this.f13030a;
        if (z) {
            transitionTarget.b(((SuccessResult) imageResult).f13024a);
        } else if (imageResult instanceof ErrorResult) {
            transitionTarget.d(((ErrorResult) imageResult).f13016a);
        }
    }
}

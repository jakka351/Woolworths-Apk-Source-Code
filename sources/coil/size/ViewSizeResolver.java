package coil.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil.size.Dimension;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcoil/size/ViewSizeResolver;", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcoil/size/SizeResolver;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public interface ViewSizeResolver<T extends View> extends SizeResolver {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static Dimension c(int i, int i2, int i3) {
        if (i == -2) {
            return Dimension.Undefined.f13027a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return new Dimension.Pixels(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return new Dimension.Pixels(i5);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, coil.size.ViewSizeResolver$size$3$preDrawListener$1] */
    @Override // coil.size.SizeResolver
    default Object a(Continuation continuation) {
        Size size = getSize();
        if (size != null) {
            return size;
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        final ViewTreeObserver viewTreeObserver = getView().getViewTreeObserver();
        final ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: coil.size.ViewSizeResolver$size$3$preDrawListener$1
            public boolean d;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                ViewSizeResolver viewSizeResolver = this.e;
                Size size2 = viewSizeResolver.getSize();
                if (size2 != null) {
                    viewSizeResolver.d(viewTreeObserver, this);
                    if (!this.d) {
                        this.d = true;
                        cancellableContinuationImpl.resumeWith(size2);
                    }
                }
                return true;
            }
        };
        viewTreeObserver.addOnPreDrawListener(r1);
        cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: coil.size.ViewSizeResolver$size$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                this.h.d(viewTreeObserver, r1);
                return Unit.f24250a;
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }

    default boolean b() {
        return true;
    }

    default void d(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default Dimension getHeight() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return c(layoutParams != null ? layoutParams.height : -1, getView().getHeight(), b() ? getView().getPaddingBottom() + getView().getPaddingTop() : 0);
    }

    default Size getSize() {
        Dimension height;
        Dimension width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new Size(width, height);
    }

    View getView();

    default Dimension getWidth() {
        ViewGroup.LayoutParams layoutParams = getView().getLayoutParams();
        return c(layoutParams != null ? layoutParams.width : -1, getView().getWidth(), b() ? getView().getPaddingRight() + getView().getPaddingLeft() : 0);
    }
}

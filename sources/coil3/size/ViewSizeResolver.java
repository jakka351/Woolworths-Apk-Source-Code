package coil3.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil3.size.Dimension;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcoil3/size/ViewSizeResolver;", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcoil3/size/SizeResolver;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface ViewSizeResolver<T extends View> extends SizeResolver {
    static Dimension c(int i, int i2, int i3) {
        if (i == -2) {
            return Dimension.Undefined.f13148a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            DimensionKt.a(i4);
            return new Dimension.Pixels(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        DimensionKt.a(i5);
        return new Dimension.Pixels(i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, coil3.size.ViewSizeResolver$size$3$preDrawListener$1] */
    @Override // coil3.size.SizeResolver
    default Object a(Continuation continuation) {
        Size size = getSize();
        if (size != null) {
            return size;
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        final ViewTreeObserver viewTreeObserver = getD().getViewTreeObserver();
        final ?? r1 = new ViewTreeObserver.OnPreDrawListener() { // from class: coil3.size.ViewSizeResolver$size$3$preDrawListener$1
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
        cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: coil3.size.ViewSizeResolver$size$3$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                this.d.d(viewTreeObserver, r1);
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
            getD().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    default Dimension getHeight() {
        ViewGroup.LayoutParams layoutParams = getD().getLayoutParams();
        return c(layoutParams != null ? layoutParams.height : -1, getD().getHeight(), b() ? getD().getPaddingBottom() + getD().getPaddingTop() : 0);
    }

    default Size getSize() {
        Dimension height;
        Dimension width = getWidth();
        if (width == null || (height = getHeight()) == null) {
            return null;
        }
        return new Size(width, height);
    }

    /* renamed from: getView */
    View getD();

    default Dimension getWidth() {
        ViewGroup.LayoutParams layoutParams = getD().getLayoutParams();
        return c(layoutParams != null ? layoutParams.width : -1, getD().getWidth(), b() ? getD().getPaddingRight() + getD().getPaddingLeft() : 0);
    }
}

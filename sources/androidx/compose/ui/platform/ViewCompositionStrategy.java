package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.core.view.ViewKt;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.woolworths.R;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "Companion", "DisposeOnDetachedFromWindow", "DisposeOnDetachedFromWindowOrReleasedFromPool", "DisposeOnLifecycleDestroyed", "DisposeOnViewTreeLifecycleDestroyed", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ViewCompositionStrategy {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$Companion;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {

        /* renamed from: a, reason: collision with root package name */
        public static final DisposeOnDetachedFromWindow f1984a = new DisposeOnDetachedFromWindow();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final Function0 a(final AbstractComposeView abstractComposeView) {
            final ?? r0 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    abstractComposeView.d();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r0);
            return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    abstractComposeView.removeOnAttachStateChangeListener(r0);
                    return Unit.f24250a;
                }
            };
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {

        /* renamed from: a, reason: collision with root package name */
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool f1985a = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.platform.k] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final Function0 a(final AbstractComposeView abstractComposeView) {
            final ?? r0 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    boolean z;
                    AbstractComposeView abstractComposeView2 = abstractComposeView;
                    Iterator f24664a = ViewKt.b(abstractComposeView2).getF24664a();
                    while (true) {
                        if (!f24664a.hasNext()) {
                            break;
                        }
                        Object obj = (ViewParent) f24664a.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            Intrinsics.h(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                                break;
                            }
                        }
                    }
                    if (z) {
                        return;
                    }
                    abstractComposeView2.d();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r0);
            final ?? r1 = new PoolingContainerListener() { // from class: androidx.compose.ui.platform.k
                @Override // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void a() {
                    abstractComposeView.d();
                }
            };
            PoolingContainer.a(abstractComposeView, r1);
            return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 = r0;
                    AbstractComposeView abstractComposeView2 = abstractComposeView;
                    abstractComposeView2.removeOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1);
                    PoolingContainer.e(abstractComposeView2, r1);
                    return Unit.f24250a;
                }
            };
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final Function0 a(AbstractComposeView abstractComposeView) {
            ViewCompositionStrategy_androidKt.a(abstractComposeView, null);
            throw null;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes2.dex */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {

        /* renamed from: a, reason: collision with root package name */
        public static final DisposeOnViewTreeLifecycleDestroyed f1986a = new DisposeOnViewTreeLifecycleDestroyed();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final Function0 a(final AbstractComposeView abstractComposeView) {
            if (!abstractComposeView.isAttachedToWindow()) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final ?? r1 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        AbstractComposeView abstractComposeView2 = abstractComposeView;
                        LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(abstractComposeView2);
                        if (lifecycleOwnerA != null) {
                            objectRef.d = ViewCompositionStrategy_androidKt.a(abstractComposeView2, lifecycleOwnerA.getD());
                            abstractComposeView2.removeOnAttachStateChangeListener(this);
                        } else {
                            InlineClassHelperKt.c("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner");
                            throw new KotlinNothingValueException();
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                    }
                };
                abstractComposeView.addOnAttachStateChangeListener(r1);
                objectRef.d = new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        abstractComposeView.removeOnAttachStateChangeListener(r1);
                        return Unit.f24250a;
                    }
                };
                return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ((Function0) objectRef.d).invoke();
                        return Unit.f24250a;
                    }
                };
            }
            LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(abstractComposeView);
            if (lifecycleOwnerA != null) {
                return ViewCompositionStrategy_androidKt.a(abstractComposeView, lifecycleOwnerA.getD());
            }
            InlineClassHelperKt.c("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    Function0 a(AbstractComposeView abstractComposeView);
}

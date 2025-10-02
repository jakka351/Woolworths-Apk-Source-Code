package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.woolworths.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010!\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u000eR$\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010&R0\u0010.\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00138F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b-\u0010&\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0016R\u0014\u00100\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0011\u00102\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b1\u0010+¨\u00063"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/compose/runtime/CompositionContext;", "parent", "", "setParentCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V", "", "isTransitionGroup", "setTransitionGroup", "(Z)V", "Landroid/os/IBinder;", "value", "e", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "g", "Landroidx/compose/runtime/CompositionContext;", "setParentContext", "parentContext", "Lkotlin/Function0;", "h", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "()V", "disposeViewCompositionStrategy", "i", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public WeakReference d;

    /* renamed from: e, reason: from kotlin metadata */
    public IBinder previousAttachedWindowToken;
    public Composition f;

    /* renamed from: g, reason: from kotlin metadata */
    public CompositionContext parentContext;

    /* renamed from: h, reason: from kotlin metadata */
    public Function0 disposeViewCompositionStrategy;

    /* renamed from: i, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public boolean j;
    public boolean k;

    @JvmOverloads
    public AbstractComposeView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.d = null;
            }
            Composition composition = this.f;
            if (composition != null) {
                composition.dispose();
                this.f = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.d = null;
        }
    }

    public abstract void a(Composer composer, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        e();
    }

    public final void d() {
        Composition composition = this.f;
        if (composition != null) {
            composition.dispose();
        }
        this.f = null;
        requestLayout();
    }

    public final void e() {
        if (this.f == null) {
            try {
                this.j = true;
                this.f = Wrapper_androidKt.a(this, h(), new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                            this.h.a(composer, 0);
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -656146368));
            } finally {
                this.j = false;
            }
        }
    }

    public void f(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void g(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final boolean getHasComposition() {
        return this.f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public final CompositionContext h() {
        Recomposer recomposerA;
        CompositionContext compositionContextB = this.parentContext;
        if (compositionContextB == null) {
            compositionContextB = WindowRecomposer_androidKt.b(this);
            if (compositionContextB == null) {
                for (ViewParent parent = getParent(); compositionContextB == null && (parent instanceof View); parent = parent.getParent()) {
                    compositionContextB = WindowRecomposer_androidKt.b((View) parent);
                }
            }
            if (compositionContextB != null) {
                CompositionContext compositionContext = (!(compositionContextB instanceof Recomposer) || ((Recomposer.State) ((Recomposer) compositionContextB).u.getValue()).compareTo(Recomposer.State.e) > 0) ? compositionContextB : null;
                if (compositionContext != null) {
                    this.d = new WeakReference(compositionContext);
                }
            } else {
                compositionContextB = null;
            }
            if (compositionContextB == null) {
                WeakReference weakReference = this.d;
                if (weakReference == null || (compositionContextB = (CompositionContext) weakReference.get()) == null || ((compositionContextB instanceof Recomposer) && ((Recomposer.State) ((Recomposer) compositionContextB).u.getValue()).compareTo(Recomposer.State.e) <= 0)) {
                    compositionContextB = null;
                }
                if (compositionContextB == null) {
                    if (!isAttachedToWindow()) {
                        InlineClassHelperKt.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    CompositionContext compositionContextB2 = WindowRecomposer_androidKt.b(view);
                    if (compositionContextB2 == null) {
                        recomposerA = ((WindowRecomposerFactory) WindowRecomposerPolicy.f1990a.get()).a(view);
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, recomposerA);
                        Handler handler = view.getHandler();
                        int i = HandlerDispatcherKt.f24696a;
                        final Job jobC = BuildersKt.c(GlobalScope.d, new HandlerContext(handler, "windowRecomposer cleanup", false).i, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(recomposerA, view, null), 2);
                        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public final void onViewAttachedToWindow(View view3) {
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public final void onViewDetachedFromWindow(View view3) {
                                view3.removeOnAttachStateChangeListener(this);
                                ((JobSupport) jobC).cancel((CancellationException) null);
                            }
                        });
                    } else {
                        if (!(compositionContextB2 instanceof Recomposer)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        recomposerA = (Recomposer) compositionContextB2;
                    }
                    Recomposer recomposer = ((Recomposer.State) recomposerA.u.getValue()).compareTo(Recomposer.State.e) > 0 ? recomposerA : null;
                    if (recomposer != null) {
                        this.d = new WeakReference(recomposer);
                    }
                    return recomposerA;
                }
            }
        }
        return compositionContextB;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.k || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f(i, i2, i3, i4, z);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        g(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(@Nullable CompositionContext parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.k = true;
    }

    public final void setViewCompositionStrategy(@NotNull ViewCompositionStrategy strategy) {
        Function0 function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @JvmOverloads
    public AbstractComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @JvmOverloads
    public AbstractComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.f1985a.a(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }
}

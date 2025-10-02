package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001PJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u001a\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R5\u00103\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R/\u0010:\u001a\u0004\u0018\u0001042\b\u0010,\u001a\u0004\u0018\u0001048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010.\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010@\u001a\u00020;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?RA\u0010H\u001a\r\u0012\u0004\u0012\u00020\u00050A¢\u0006\u0002\bB2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00050A¢\u0006\u0002\bB8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010.\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010L\u001a\u00020;2\u0006\u0010,\u001a\u00020;8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010?R\u0014\u0010O\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "", "layoutDirection", "", "setLayoutDirection", "(I)V", "Landroidx/compose/ui/unit/IntRect;", "getVisibleDisplayBounds", "()Landroidx/compose/ui/unit/IntRect;", "", "n", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "testTag", "Landroid/view/WindowManager$LayoutParams;", "r", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "()V", "params", "Landroidx/compose/ui/window/PopupPositionProvider;", "s", "Landroidx/compose/ui/window/PopupPositionProvider;", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "positionProvider", "Landroidx/compose/ui/unit/LayoutDirection;", "t", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/IntSize;", "<set-?>", "u", "Landroidx/compose/runtime/MutableState;", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize", "Landroidx/compose/ui/layout/LayoutCoordinates;", "v", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "parentLayoutCoordinates", "", "x", "Landroidx/compose/runtime/State;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "B", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "content", "C", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    public static final Function1 E = null;
    public a A;

    /* renamed from: B, reason: from kotlin metadata */
    public final MutableState content;

    /* renamed from: C, reason: from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;
    public final int[] D;
    public Function0 l;
    public PopupProperties m;

    /* renamed from: n, reason: from kotlin metadata */
    public String testTag;
    public final View o;
    public final PopupLayoutHelper p;
    public final WindowManager q;

    /* renamed from: r, reason: from kotlin metadata */
    public final WindowManager.LayoutParams params;

    /* renamed from: s, reason: from kotlin metadata */
    public PopupPositionProvider positionProvider;

    /* renamed from: t, reason: from kotlin metadata */
    public LayoutDirection parentLayoutDirection;

    /* renamed from: u, reason: from kotlin metadata */
    public final MutableState popupContentSize;

    /* renamed from: v, reason: from kotlin metadata */
    public final MutableState parentLayoutCoordinates;
    public IntRect w;

    /* renamed from: x, reason: from kotlin metadata */
    public final State canCalculatePosition;
    public final Rect y;
    public final SnapshotStateObserver z;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/window/PopupLayout$2", "Landroid/view/ViewOutlineProvider;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.window.PopupLayout$2, reason: invalid class name */
    public final class AnonymousClass2 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/window/PopupLayout$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/window/PopupLayout;", "", "onCommitAffectingPopupPosition", "Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout(Function0 function0, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid) {
        super(view.getContext(), null, 6, 0);
        PopupLayoutHelper popupLayoutHelperImpl29 = Build.VERSION.SDK_INT >= 29 ? new PopupLayoutHelperImpl29() : new PopupLayoutHelperImpl();
        this.l = function0;
        this.m = popupProperties;
        this.testTag = str;
        this.o = view;
        this.p = popupLayoutHelperImpl29;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.q = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        PopupProperties popupProperties2 = this.m;
        boolean zC = AndroidPopup_androidKt.c(view);
        boolean z = popupProperties2.b;
        int i = popupProperties2.f2222a;
        if (z && zC) {
            i |= 8192;
        } else if (z && !zC) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.params = layoutParams;
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.d;
        this.popupContentSize = SnapshotStateKt.f(null);
        this.parentLayoutCoordinates = SnapshotStateKt.f(null);
        this.canCalculatePosition = SnapshotStateKt.d(new Function0<Boolean>() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PopupLayout popupLayout = this.h;
                LayoutCoordinates parentLayoutCoordinates = popupLayout.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.q()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || popupLayout.m4getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        this.y = new Rect();
        this.z = new SnapshotStateObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.compose.ui.window.PopupLayout$snapshotStateObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function0 function02 = (Function0) obj;
                PopupLayout popupLayout = this.h;
                Handler handler = popupLayout.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function02.invoke();
                } else {
                    Handler handler2 = popupLayout.getHandler();
                    if (handler2 != null) {
                        handler2.post(new androidx.compose.ui.viewinterop.a(2, function02));
                    }
                }
                return Unit.f24250a;
            }
        });
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.T1((float) 8));
        setOutlineProvider(new AnonymousClass2());
        this.content = SnapshotStateKt.f(ComposableSingletons$AndroidPopup_androidKt.f2220a);
        this.D = new int[2];
    }

    private final Function2<Composer, Integer, Unit> getContent() {
        return (Function2) ((SnapshotMutableStateImpl) this.content).getD();
    }

    @VisibleForTesting
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) ((SnapshotMutableStateImpl) this.parentLayoutCoordinates).getD();
    }

    private final IntRect getVisibleDisplayBounds() {
        ((PopupLayoutHelperImpl) this.p).getClass();
        View view = this.o;
        Rect rect = this.y;
        view.getWindowVisibleDisplayFrame(rect);
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.f2215a;
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(Function2<? super Composer, ? super Integer, Unit> function2) {
        ((SnapshotMutableStateImpl) this.content).setValue(function2);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        ((SnapshotMutableStateImpl) this.parentLayoutCoordinates).setValue(layoutCoordinates);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        composer.o(-857613600);
        getContent().invoke(composer, 0);
        composer.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.m.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.l;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void f(int i, int i2, int i3, int i4, boolean z) {
        super.f(i, i2, i3, i4, z);
        this.m.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        ((PopupLayoutHelperImpl) this.p).getClass();
        this.q.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void g(int i, int i2) {
        this.m.getClass();
        IntRect visibleDisplayBounds = getVisibleDisplayBounds();
        super.g(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getD()).booleanValue();
    }

    @NotNull
    /* renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    @NotNull
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    @Nullable
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m4getPopupContentSizebOM6tXw() {
        return (IntSize) ((SnapshotMutableStateImpl) this.popupContentSize).getD();
    }

    @NotNull
    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @NotNull
    public final String getTestTag() {
        return this.testTag;
    }

    @Nullable
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void j(CompositionContext compositionContext, Function2 function2) {
        setParentCompositionContext(compositionContext);
        setContent(function2);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void k(Function0 function0, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        int i;
        this.l = function0;
        this.testTag = str;
        if (!Intrinsics.c(this.m, popupProperties)) {
            popupProperties.getClass();
            this.m = popupProperties;
            boolean zC = AndroidPopup_androidKt.c(this.o);
            boolean z = popupProperties.b;
            int i2 = popupProperties.f2222a;
            if (z && zC) {
                i2 |= 8192;
            } else if (z && !zC) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.flags = i2;
            ((PopupLayoutHelperImpl) this.p).getClass();
            this.q.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void l() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.q()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            long jY = parentLayoutCoordinates.y(0L);
            IntRect intRectA = IntRectKt.a((Math.round(Float.intBitsToFloat((int) (jY >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (jY & 4294967295L)))), jA);
            if (intRectA.equals(this.w)) {
                return;
            }
            this.w = intRectA;
            n();
        }
    }

    public final void m(LayoutCoordinates layoutCoordinates) {
        setParentLayoutCoordinates(layoutCoordinates);
        l();
    }

    public final void n() {
        IntSize intSizeM4getPopupContentSizebOM6tXw;
        final IntRect intRect = this.w;
        if (intRect == null || (intSizeM4getPopupContentSizebOM6tXw = m4getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = intSizeM4getPopupContentSizebOM6tXw.f2202a;
        IntRect visibleDisplayBounds = getVisibleDisplayBounds();
        final long jB = (visibleDisplayBounds.b() & 4294967295L) | (visibleDisplayBounds.d() << 32);
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.d = 0L;
        this.z.e(this, PopupLayout$Companion$onCommitAffectingPopupPosition$1.h, new Function0<Unit>() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PopupLayout popupLayout = this;
                longRef.d = popupLayout.getPositionProvider().a(intRect, jB, popupLayout.getParentLayoutDirection(), j);
                return Unit.f24250a;
            }
        });
        long j2 = longRef.d;
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.m.e;
        PopupLayoutHelper popupLayoutHelper = this.p;
        if (z) {
            popupLayoutHelper.a(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        ((PopupLayoutHelperImpl) popupLayoutHelper).getClass();
        this.q.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z.f();
        if (!this.m.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.A == null) {
            this.A = new a(this.l, 0);
        }
        Api33Impl.a(this, this.A);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = this.z;
        androidx.compose.runtime.snapshots.a aVar = snapshotStateObserver.h;
        if (aVar != null) {
            aVar.dispose();
        }
        snapshotStateObserver.b();
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.b(this, this.A);
        }
        this.A = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < BitmapDescriptorFactory.HUE_RED || motionEvent.getX() >= getWidth() || motionEvent.getY() < BitmapDescriptorFactory.HUE_RED || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.l;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            Function0 function02 = this.l;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setParentLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m5setPopupContentSizefhxjrPA(@Nullable IntSize intSize) {
        ((SnapshotMutableStateImpl) this.popupContentSize).setValue(intSize);
    }

    public final void setPositionProvider(@NotNull PopupPositionProvider popupPositionProvider) {
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(@NotNull String str) {
        this.testTag = str;
    }
}

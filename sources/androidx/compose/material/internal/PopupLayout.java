package androidx.compose.material.internal;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.material.DropdownMenuPositionProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/internal/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint
@SourceDebugExtension
/* loaded from: classes2.dex */
final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {
    public final View l;
    public final WindowManager m;
    public final WindowManager.LayoutParams n;
    public DropdownMenuPositionProvider o;
    public LayoutDirection p;
    public final MutableState q;
    public final MutableState r;
    public final State s;
    public final Rect t;
    public final Rect u;
    public final Function2 v;
    public final MutableState w;
    public boolean x;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/material/internal/PopupLayout$2", "Landroid/view/ViewOutlineProvider;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.internal.PopupLayout$2, reason: invalid class name */
    public final class AnonymousClass2 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
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

    public PopupLayout(View view, Density density, DropdownMenuPositionProvider dropdownMenuPositionProvider, UUID uuid) {
        super(view.getContext(), null, 6, 0);
        this.l = view;
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.m = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.n = layoutParams;
        this.o = dropdownMenuPositionProvider;
        this.p = LayoutDirection.d;
        this.q = SnapshotStateKt.f(null);
        this.r = SnapshotStateKt.f(null);
        this.s = SnapshotStateKt.d(new Function0<Boolean>() { // from class: androidx.compose.material.internal.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PopupLayout popupLayout = this.h;
                return Boolean.valueOf((((IntRect) ((SnapshotMutableStateImpl) popupLayout.q).getD()) == null || ((IntSize) ((SnapshotMutableStateImpl) popupLayout.r).getD()) == null) ? false : true);
            }
        });
        this.t = new Rect();
        this.u = new Rect();
        this.v = PopupLayout$dismissOnOutsideClick$1.h;
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.T1((float) 8));
        setOutlineProvider(new AnonymousClass2());
        this.w = SnapshotStateKt.f(ComposableSingletons$ExposedDropdownMenuPopup_androidKt.f1374a);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i) {
        composer.o(-864350873);
        ((Function2) ((SnapshotMutableStateImpl) this.w).getD()).invoke(composer, 0);
        composer.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
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
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    public final void i(LayoutDirection layoutDirection) {
        int i;
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

    public final void j() {
        IntSize intSize;
        IntRect intRect = (IntRect) ((SnapshotMutableStateImpl) this.q).getD();
        if (intRect == null || (intSize = (IntSize) ((SnapshotMutableStateImpl) this.r).getD()) == null) {
            return;
        }
        long j = intSize.f2202a;
        View view = this.l;
        Rect rect = this.t;
        view.getWindowVisibleDisplayFrame(rect);
        IntRect intRect2 = new IntRect(rect.left, rect.top, rect.right, rect.bottom);
        long jA = this.o.a(intRect, IntSizeKt.a(intRect2.d(), intRect2.b()), this.p, j);
        WindowManager.LayoutParams layoutParams = this.n;
        layoutParams.x = (int) (jA >> 32);
        layoutParams.y = (int) (jA & 4294967295L);
        this.m.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.l;
        Rect rect = this.u;
        view.getWindowVisibleDisplayFrame(rect);
        if (Intrinsics.c(rect, this.t)) {
            return;
        }
        j();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() == 0 && (motionEvent.getX() < BitmapDescriptorFactory.HUE_RED || motionEvent.getX() >= getWidth() || motionEvent.getY() < BitmapDescriptorFactory.HUE_RED || motionEvent.getY() >= getHeight())) || motionEvent.getAction() == 4) {
            IntRect intRect = (IntRect) ((SnapshotMutableStateImpl) this.q).getD();
            if (intRect == null) {
                return true;
            }
            if (((Boolean) ((PopupLayout$dismissOnOutsideClick$1) this.v).invoke((motionEvent.getRawX() == BitmapDescriptorFactory.HUE_RED || motionEvent.getRawY() == BitmapDescriptorFactory.HUE_RED) ? null : new Offset(OffsetKt.a(motionEvent.getRawX(), motionEvent.getRawY())), intRect)).booleanValue()) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
    }
}

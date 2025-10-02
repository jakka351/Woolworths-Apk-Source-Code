package androidx.compose.ui.window;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import com.woolworths.R;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/window/DialogWrapper;", "Landroidx/activity/ComponentDialog;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {
    public Function0 g;
    public DialogProperties h;
    public final View i;
    public final DialogLayout j;

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

    public DialogWrapper(Function0 function0, DialogProperties dialogProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), dialogProperties.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.g = function0;
        this.h = dialogProperties;
        this.i = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.b(window, this.h.e);
        window.setGravity(17);
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.T1(f));
        dialogLayout.setOutlineProvider(new DialogWrapper$1$2());
        this.j = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.b(dialogLayout, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(dialogLayout, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(dialogLayout, ViewTreeSavedStateRegistryOwner.a(view));
        d(this.g, this.h, layoutDirection);
        OnBackPressedDispatcherKt.a(this.f, this, new Function1<OnBackPressedCallback, Unit>() { // from class: androidx.compose.ui.window.DialogWrapper.2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DialogWrapper dialogWrapper = DialogWrapper.this;
                if (dialogWrapper.h.f2221a) {
                    dialogWrapper.g.invoke();
                }
                return Unit.f24250a;
            }
        }, 2);
    }

    public static final void c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void d(Function0 function0, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        int i;
        this.g = function0;
        this.h = dialogProperties;
        SecureFlagPolicy secureFlagPolicy = dialogProperties.c;
        boolean zC = AndroidPopup_androidKt.c(this.i);
        int iOrdinal = secureFlagPolicy.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zC = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zC = false;
            }
        }
        Window window = getWindow();
        Intrinsics.e(window);
        window.setFlags(zC ? 8192 : -8193, 8192);
        int iOrdinal2 = layoutDirection.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        DialogLayout dialogLayout = this.j;
        dialogLayout.setLayoutDirection(i);
        boolean z = dialogProperties.e;
        boolean z2 = dialogProperties.d;
        Window window2 = dialogLayout.l;
        boolean z3 = (dialogLayout.p && z2 == dialogLayout.n && z == dialogLayout.o) ? false : true;
        dialogLayout.n = z2;
        dialogLayout.o = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !dialogLayout.p) {
                window2.setLayout(i2, -2);
                dialogLayout.p = true;
            }
        }
        setCanceledOnTouchOutside(dialogProperties.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.h.f2221a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.g.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r7 <= r1) goto L24;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.onTouchEvent(r7)
            androidx.compose.ui.window.DialogProperties r1 = r6.h
            boolean r1 = r1.b
            if (r1 == 0) goto L73
            androidx.compose.ui.window.DialogLayout r1 = r6.j
            r1.getClass()
            float r2 = r7.getX()
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L6c
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L6c
            float r2 = r7.getY()
            boolean r3 = java.lang.Float.isInfinite(r2)
            if (r3 != 0) goto L6c
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L6c
            r2 = 0
            android.view.View r2 = r1.getChildAt(r2)
            if (r2 != 0) goto L37
            goto L6c
        L37:
            int r3 = r1.getLeft()
            int r4 = r2.getLeft()
            int r4 = r4 + r3
            int r3 = r2.getWidth()
            int r3 = r3 + r4
            int r1 = r1.getTop()
            int r5 = r2.getTop()
            int r5 = r5 + r1
            int r1 = r2.getHeight()
            int r1 = r1 + r5
            float r2 = r7.getX()
            int r2 = kotlin.math.MathKt.b(r2)
            if (r4 > r2) goto L6c
            if (r2 > r3) goto L6c
            float r7 = r7.getY()
            int r7 = kotlin.math.MathKt.b(r7)
            if (r5 > r7) goto L6c
            if (r7 > r1) goto L6c
            goto L73
        L6c:
            kotlin.jvm.functions.Function0 r7 = r6.g
            r7.invoke()
            r7 = 1
            return r7
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.DialogWrapper.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

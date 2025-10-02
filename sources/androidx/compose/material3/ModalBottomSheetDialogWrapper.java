package androidx.compose.material3;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ModalBottomSheetDialogWrapper;", "Landroidx/activity/ComponentDialog;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class ModalBottomSheetDialogWrapper extends ComponentDialog implements ViewRootForInspector {
    public Function0 g;
    public ModalBottomSheetProperties h;
    public final View i;
    public final ModalBottomSheetDialogLayout j;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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

    public ModalBottomSheetDialogWrapper(Function0 function0, ModalBottomSheetProperties modalBottomSheetProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid, Animatable animatable, CoroutineScope coroutineScope, boolean z) {
        super(new ContextThemeWrapper(view.getContext(), com.woolworths.R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.g = function0;
        this.h = modalBottomSheetProperties;
        this.i = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.b(window, false);
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window, this.h.b, this.g, animatable, coroutineScope);
        modalBottomSheetDialogLayout.setTag(com.woolworths.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(density.T1(f));
        modalBottomSheetDialogLayout.setOutlineProvider(new ModalBottomSheetDialogWrapper$1$2());
        this.j = modalBottomSheetDialogLayout;
        setContentView(modalBottomSheetDialogLayout);
        ViewTreeLifecycleOwner.b(modalBottomSheetDialogLayout, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(modalBottomSheetDialogLayout, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(modalBottomSheetDialogLayout, ViewTreeSavedStateRegistryOwner.a(view));
        c(this.g, this.h, layoutDirection);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        boolean z2 = !z;
        windowInsetsControllerCompat.e(z2);
        windowInsetsControllerCompat.d(z2);
        OnBackPressedDispatcherKt.a(this.f, this, new Function1<OnBackPressedCallback, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetDialogWrapper.3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = ModalBottomSheetDialogWrapper.this;
                if (modalBottomSheetDialogWrapper.h.b) {
                    modalBottomSheetDialogWrapper.g.invoke();
                }
                return Unit.f24250a;
            }
        }, 2);
    }

    public final void c(Function0 function0, ModalBottomSheetProperties modalBottomSheetProperties, LayoutDirection layoutDirection) {
        this.g = function0;
        this.h = modalBottomSheetProperties;
        SecureFlagPolicy secureFlagPolicy = modalBottomSheetProperties.f1460a;
        ViewGroup.LayoutParams layoutParams = this.i.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = secureFlagPolicy.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
        }
        Window window = getWindow();
        Intrinsics.e(window);
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal2 = layoutDirection.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        this.j.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.g.invoke();
        }
        return zOnTouchEvent;
    }
}

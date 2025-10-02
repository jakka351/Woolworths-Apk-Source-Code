package androidx.activity.compose;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComponentActivityKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f64a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ComponentActivity componentActivity, ComposableLambdaImpl composableLambdaImpl) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(composableLambdaImpl);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 6, 0);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(composableLambdaImpl);
        View decorView = componentActivity.getWindow().getDecorView();
        if (ViewTreeLifecycleOwner.a(decorView) == null) {
            ViewTreeLifecycleOwner.b(decorView, componentActivity);
        }
        if (ViewTreeViewModelStoreOwner.a(decorView) == null) {
            ViewTreeViewModelStoreOwner.b(decorView, componentActivity);
        }
        if (ViewTreeSavedStateRegistryOwner.a(decorView) == null) {
            ViewTreeSavedStateRegistryOwner.b(decorView, componentActivity);
        }
        componentActivity.setContentView(composeView2, f64a);
    }
}

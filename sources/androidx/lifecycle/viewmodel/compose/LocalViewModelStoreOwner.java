package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;", "", "lifecycle-viewmodel-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LocalViewModelStoreOwner {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f2816a = new DynamicProvidableCompositionLocal(new a(0));

    public static ViewModelStoreOwner a(Composer composer) {
        ViewModelStoreOwner viewModelStoreOwnerA = (ViewModelStoreOwner) composer.x(f2816a);
        if (viewModelStoreOwnerA == null) {
            composer.o(1260197609);
            viewModelStoreOwnerA = ViewTreeViewModelStoreOwner.a((View) composer.x(AndroidCompositionLocals_androidKt.f));
        } else {
            composer.o(1260196493);
        }
        composer.l();
        return viewModelStoreOwnerA;
    }
}

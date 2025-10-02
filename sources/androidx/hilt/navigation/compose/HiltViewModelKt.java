package androidx.hilt.navigation.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"hilt-navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class HiltViewModelKt {
    public static final HiltViewModelFactory a(ViewModelStoreOwner viewModelStoreOwner, Composer composer) {
        HiltViewModelFactory hiltViewModelFactoryD;
        composer.F(1770922558);
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
            ViewModelProvider.Factory delegateFactory = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory();
            Intrinsics.h(context, "context");
            Intrinsics.h(delegateFactory, "delegateFactory");
            while (context instanceof ContextWrapper) {
                if (context instanceof ComponentActivity) {
                    hiltViewModelFactoryD = HiltViewModelFactory.d((ComponentActivity) context, delegateFactory);
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    Intrinsics.g(context, "ctx.baseContext");
                }
            }
            throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
        }
        hiltViewModelFactoryD = null;
        composer.N();
        return hiltViewModelFactoryD;
    }
}

package androidx.compose.ui.viewinterop;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/viewbinding/ViewBinding;", "container", "Landroidx/fragment/app/FragmentContainerView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AndroidViewBindingKt$AndroidViewBinding$7$1$1$1 extends Lambda implements Function1<FragmentContainerView, Unit> {
    public final /* synthetic */ FragmentManager h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewBindingKt$AndroidViewBinding$7$1$1$1(FragmentManager fragmentManager) {
        super(1);
        this.h = fragmentManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentContainerView fragmentContainerView = (FragmentContainerView) obj;
        FragmentManager fragmentManager = this.h;
        Fragment fragmentF = fragmentManager != null ? fragmentManager.F(fragmentContainerView.getId()) : null;
        if (fragmentF != null && !fragmentManager.U()) {
            FragmentTransaction fragmentTransactionE = fragmentManager.e();
            fragmentTransactionE.i(fragmentF);
            fragmentTransactionE.f();
        }
        return Unit.f24250a;
    }
}

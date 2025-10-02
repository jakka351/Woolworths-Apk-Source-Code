package au.com.woolworths.shop.checkout.ui.compose;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class IdVerificationBottomSheetKt$showIdVerificationBottomSheet$composeView$1$1$1$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ ComposeView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdVerificationBottomSheetKt$showIdVerificationBottomSheet$composeView$1$1$1$1$1$1(ViewGroup viewGroup, ComposeView composeView) {
        super(0, Intrinsics.Kotlin.class, "dismiss", "showIdVerificationBottomSheet$lambda$0$dismiss(Landroid/view/ViewGroup;Landroidx/compose/ui/platform/ComposeView;)V", 0);
        this.d = viewGroup;
        this.e = composeView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.d.removeView(this.e);
        return Unit.f24250a;
    }
}

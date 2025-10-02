package au.com.woolworths.feature.shop.account.ui.delete;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class DeleteAccountActivity$onCreate$1$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        m();
        return Unit.f24250a;
    }

    public final void m() {
        DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) this.receiver;
        int i = DeleteAccountActivity.z;
        deleteAccountActivity.getClass();
        BuildersKt.c(LifecycleOwnerKt.a(deleteAccountActivity), null, null, new DeleteAccountActivity$logoutUser$1(deleteAccountActivity, null), 3);
    }
}

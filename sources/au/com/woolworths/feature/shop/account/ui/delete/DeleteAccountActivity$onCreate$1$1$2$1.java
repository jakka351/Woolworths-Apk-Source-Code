package au.com.woolworths.feature.shop.account.ui.delete;

import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class DeleteAccountActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) this.receiver;
        int i = DeleteAccountActivity.z;
        deleteAccountActivity.getClass();
        deleteAccountActivity.startActivity(Activities.MainActivity.f4487a.b());
        deleteAccountActivity.finish();
        return Unit.f24250a;
    }
}

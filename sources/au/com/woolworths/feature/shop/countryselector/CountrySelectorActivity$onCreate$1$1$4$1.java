package au.com.woolworths.feature.shop.countryselector;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CountrySelectorActivity$onCreate$1$1$4$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        m();
        return Unit.f24250a;
    }

    public final void m() {
        CountrySelectorActivity countrySelectorActivity = (CountrySelectorActivity) this.receiver;
        int i = CountrySelectorActivity.y;
        countrySelectorActivity.getClass();
        BuildersKt.c(LifecycleOwnerKt.a(countrySelectorActivity), null, null, new CountrySelectorActivity$performLogout$1(countrySelectorActivity, null), 3);
    }
}

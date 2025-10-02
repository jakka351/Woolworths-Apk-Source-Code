package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import androidx.lifecycle.ViewModelKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class YourGroceriesActivity$onCreate$1$1$9$1 extends FunctionReferenceImpl implements Function2<String, Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m((String) obj, ((Boolean) obj2).booleanValue());
        return Unit.f24250a;
    }

    public final void m(String p0, boolean z) {
        Intrinsics.h(p0, "p0");
        YourGroceriesViewModel yourGroceriesViewModel = (YourGroceriesViewModel) this.receiver;
        yourGroceriesViewModel.getClass();
        BuildersKt.c(ViewModelKt.a(yourGroceriesViewModel), null, null, new YourGroceriesViewModel$rateSubstitution$1(yourGroceriesViewModel, p0, z, null), 3);
    }
}

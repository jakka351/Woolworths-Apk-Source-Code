package au.com.woolworths.feature.shop.countryselector.ui;

import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class CountrySelectorScreenKt$CountrySelectorScreen$2$1 extends FunctionReferenceImpl implements Function1<Region, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Region p0 = (Region) obj;
        Intrinsics.h(p0, "p0");
        ((CountrySelectorViewModel) this.receiver).r6(p0);
        return Unit.f24250a;
    }
}

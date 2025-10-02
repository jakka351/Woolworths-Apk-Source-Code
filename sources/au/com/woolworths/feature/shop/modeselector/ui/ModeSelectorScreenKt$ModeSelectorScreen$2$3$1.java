package au.com.woolworths.feature.shop.modeselector.ui;

import au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel;
import au.com.woolworths.feature.shop.modeselector.model.Item;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ModeSelectorScreenKt$ModeSelectorScreen$2$3$1 extends FunctionReferenceImpl implements Function1<Item, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Item p0 = (Item) obj;
        Intrinsics.h(p0, "p0");
        ((ModeSelectorViewModel) this.receiver).w6(p0);
        return Unit.f24250a;
    }
}

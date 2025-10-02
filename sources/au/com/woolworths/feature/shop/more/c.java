package au.com.woolworths.feature.shop.more;

import au.com.woolworths.feature.shop.more.MoreContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                MoreContract.ViewState viewState = (MoreContract.ViewState) obj;
                MoreEpoxyController moreEpoxyController = ((MoreFragment) this.e).p;
                if (moreEpoxyController == null) {
                    Intrinsics.p("moreEpoxyController");
                    throw null;
                }
                moreEpoxyController.setData(viewState.b);
                break;
            default:
                MoreViewModel moreViewModel = (MoreViewModel) this.e;
                Intrinsics.e((Throwable) obj);
                moreViewModel.r6(Boolean.FALSE);
                moreViewModel.v.f(MoreContract.Actions.LaunchHomepage.f7563a);
                break;
        }
        return Unit.f24250a;
    }
}

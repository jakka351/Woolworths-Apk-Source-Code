package com.woolworths.scanlibrary.ui.home.itemview;

import com.woolworths.scanlibrary.ui.home.itemview.ItemContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ItemViewFragment e;

    public /* synthetic */ a(ItemViewFragment itemViewFragment, int i) {
        this.d = i;
        this.e = itemViewFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((ItemContract.Presenter) this.e.Q1()).e();
                break;
            case 1:
                ((ItemContract.Presenter) this.e.Q1()).q0();
                break;
            case 2:
                ((ItemContract.Presenter) this.e.Q1()).o0();
                break;
            default:
                ((ItemContract.Presenter) this.e.Q1()).Z();
                break;
        }
        return Unit.f24250a;
    }
}

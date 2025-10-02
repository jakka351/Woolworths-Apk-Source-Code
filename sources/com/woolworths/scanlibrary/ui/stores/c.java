package com.woolworths.scanlibrary.ui.stores;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ AvailableStoresActivity e;

    public /* synthetic */ c(AvailableStoresActivity availableStoresActivity, int i) {
        this.d = i;
        this.e = availableStoresActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        AvailableStoresActivity availableStoresActivity = this.e;
        switch (i) {
            case 0:
                int i2 = AvailableStoresActivity.L;
                return availableStoresActivity.Q4();
            default:
                int i3 = AvailableStoresActivity.L;
                availableStoresActivity.V4().r6();
                return Unit.f24250a;
        }
    }
}

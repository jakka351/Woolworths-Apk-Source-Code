package com.woolworths.scanlibrary.ui.splash;

import com.woolworths.scanlibrary.ui.splash.SplashContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SngInitializerActivity e;

    public /* synthetic */ a(SngInitializerActivity sngInitializerActivity, int i) {
        this.d = i;
        this.e = sngInitializerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        SngInitializerActivity sngInitializerActivity = this.e;
        switch (i) {
            case 0:
                int i2 = SngInitializerActivity.G;
                sngInitializerActivity.finish();
                break;
            case 1:
                int i3 = SngInitializerActivity.G;
                ((SplashContract.Presenter) sngInitializerActivity.S4()).D(2);
                break;
            case 2:
                int i4 = SngInitializerActivity.G;
                sngInitializerActivity.finish();
                break;
            default:
                int i5 = SngInitializerActivity.G;
                sngInitializerActivity.finish();
                break;
        }
        return unit;
    }
}

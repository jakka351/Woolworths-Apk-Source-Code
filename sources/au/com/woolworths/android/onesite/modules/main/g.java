package au.com.woolworths.android.onesite.modules.main;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainViewModel e;

    public /* synthetic */ g(MainViewModel mainViewModel, int i) {
        this.d = i;
        this.e = mainViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                MainViewModel mainViewModel = this.e;
                MainViewModel.q6(mainViewModel, false, null, null, 15);
                if (mainViewModel.j.d() && mainViewModel.e.c(BaseShopAppFeature.v)) {
                    BuildersKt.c(ViewModelKt.a(mainViewModel), null, null, new MainViewModel$getNotificationPreferences$1(mainViewModel, null), 3);
                }
                return Unit.f24250a;
            case 1:
                this.e.v.onNext(MainContract.Actions.ShowLoginPrompt.f4355a);
                break;
            default:
                MainViewModel.q6(this.e, false, null, null, 15);
                break;
        }
        return Unit.f24250a;
    }
}

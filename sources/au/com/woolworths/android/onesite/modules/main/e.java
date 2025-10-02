package au.com.woolworths.android.onesite.modules.main;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                MainViewModel mainViewModel = (MainViewModel) this.e;
                MainContract.ViewState viewState = (MainContract.ViewState) mainViewModel.u.e();
                return viewState != null ? MainContract.HeaderInfo.a(viewState.e, mainViewModel.t6(), mainViewModel.u6(), null, null, null, 491) : mainViewModel.r6();
            case 1:
                MainViewModel mainViewModel2 = (MainViewModel) this.e;
                MainContract.ViewState viewState2 = (MainContract.ViewState) mainViewModel2.w.e();
                return viewState2 != null ? MainContract.HeaderInfo.a(viewState2.e, null, mainViewModel2.u6(), null, null, null, 495) : mainViewModel2.r6();
            default:
                MainActivity mainActivity = (MainActivity) this.e;
                mainActivity.N = false;
                MainViewModel mainViewModelT4 = mainActivity.T4();
                ArrayList arrayList = mainViewModelT4.A;
                mainViewModelT4.z = false;
                MutableLiveData mutableLiveData = mainViewModelT4.u;
                MainContract.ViewState viewState3 = (MainContract.ViewState) mutableLiveData.e();
                MainContract.ViewState viewStateA = null;
                if (viewState3 != null) {
                    viewStateA = MainContract.ViewState.a(viewState3, !mainViewModelT4.z ? (CoachMark) CollectionsKt.F(arrayList) : null, !arrayList.isEmpty(), null, 477);
                }
                mutableLiveData.m(viewStateA);
                return Unit.f24250a;
        }
    }
}

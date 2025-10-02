package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.analytics.supers.homepage.HomepageAnalytics;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class MainActivity$onCreate$1$1$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MainViewModel mainViewModel = (MainViewModel) this.receiver;
        mainViewModel.v.onNext(MainContract.Actions.LaunchVoiceProductSearch.f4344a);
        mainViewModel.o.g(HomepageAnalytics.HomeScreen.Action.m);
        return Unit.f24250a;
    }
}

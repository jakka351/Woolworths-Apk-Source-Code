package au.com.woolworths.android.onesite.modules.splash;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SplashScreenActivity$startConfigActionActivityForResult$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public SplashScreenActivity$startConfigActionActivityForResult$1$1(Object obj) {
        super(0, obj, SplashScreenActivity.class, "dismissSplashScreen", "dismissSplashScreen()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((SplashScreenActivity) this.receiver).A = false;
        return Unit.f24250a;
    }
}

package au.com.woolworths.feature.rewards.account.authentication;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsAuthenticationActivityNew$onCreate$1$1$8$1 extends FunctionReferenceImpl implements Function3<Boolean, Boolean, String, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew = (RewardsAuthenticationActivityNew) this.receiver;
        int i = RewardsAuthenticationActivityNew.D;
        rewardsAuthenticationActivityNew.getClass();
        BuildersKt.c(LifecycleOwnerKt.a(rewardsAuthenticationActivityNew), null, null, new RewardsAuthenticationActivityNew$launchAuth0Form$1(rewardsAuthenticationActivityNew, ((Boolean) obj).booleanValue(), (String) obj3, (Boolean) obj2, null), 3);
        return Unit.f24250a;
    }
}

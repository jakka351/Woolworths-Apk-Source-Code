package au.com.woolworths.feature.rewards.account.authentication;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew$launchAuth0Form$1", f = "RewardsAuthenticationActivityNew.kt", l = {149, 154}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsAuthenticationActivityNew$launchAuth0Form$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsAuthenticationActivityNew q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsAuthenticationActivityNew$launchAuth0Form$1(RewardsAuthenticationActivityNew rewardsAuthenticationActivityNew, boolean z, String str, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsAuthenticationActivityNew;
        this.r = z;
        this.s = str;
        this.t = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsAuthenticationActivityNew$launchAuth0Form$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsAuthenticationActivityNew$launchAuth0Form$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
    
        if (r14 == r0) goto L61;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew$launchAuth0Form$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

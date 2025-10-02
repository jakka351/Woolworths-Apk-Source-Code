package au.com.woolworths.feature.rewards.account.preferences;

import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModel$onToggleClick$1", f = "RewardsPreferenceDetailsViewModel.kt", l = {163, 167}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsPreferenceDetailsViewModel$onToggleClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public PreferenceDetailsData p;
    public int q;
    public final /* synthetic */ RewardsPreferenceDetailsViewModel r;
    public final /* synthetic */ PreferenceToggleData s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPreferenceDetailsViewModel$onToggleClick$1(RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModel, PreferenceToggleData preferenceToggleData, boolean z, Continuation continuation) {
        super(2, continuation);
        this.r = rewardsPreferenceDetailsViewModel;
        this.s = preferenceToggleData;
        this.t = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsPreferenceDetailsViewModel$onToggleClick$1(this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsPreferenceDetailsViewModel$onToggleClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[Catch: all -> 0x0017, NoConnectivityException -> 0x00a7, ServerErrorException -> 0x00cd, TRY_LEAVE, TryCatch #3 {NoConnectivityException -> 0x00a7, ServerErrorException -> 0x00cd, blocks: (B:7:0x0013, B:25:0x0080, B:27:0x0084, B:13:0x0022, B:21:0x0065, B:18:0x0041), top: B:48:0x000b, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModel$onToggleClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package au.com.woolworths.feature.rewards.card.overlay;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayViewModel$onSaveToGoogleWalletClick$2", f = "RewardsCardOverlayViewModel.kt", l = {105, 106, 112, 118}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsCardOverlayViewModel$onSaveToGoogleWalletClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsCardOverlayViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsCardOverlayViewModel$onSaveToGoogleWalletClick$2(RewardsCardOverlayViewModel rewardsCardOverlayViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsCardOverlayViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsCardOverlayViewModel$onSaveToGoogleWalletClick$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsCardOverlayViewModel$onSaveToGoogleWalletClick$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r1.z(r3, r8) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r1.z(r9, r8) != r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r1.z(r9, r8) != r2) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayViewModel r0 = r8.q
            kotlinx.coroutines.channels.BufferedChannel r1 = r0.k
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r8.p
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L2a
            if (r3 == r7) goto L26
            if (r3 == r6) goto L22
            if (r3 == r5) goto L16
            if (r3 != r4) goto L1a
        L16:
            kotlin.ResultKt.b(r9)
            goto L6c
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            goto L6c
        L26:
            kotlin.ResultKt.b(r9)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            goto L38
        L2a:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.feature.rewards.card.RewardsCardInteractor r9 = r0.f     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            r8.p = r7     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            java.lang.Object r9 = r9.a(r8)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            if (r9 != r2) goto L38
            goto L6b
        L38:
            au.com.woolworths.feature.rewards.card.data.RewardsDigitalWalletTokenData r9 = (au.com.woolworths.feature.rewards.card.data.RewardsDigitalWalletTokenData) r9     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract$Action$SaveToGoogleWallet r3 = new au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract$Action$SaveToGoogleWallet     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            java.lang.String r9 = r9.f5820a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            r3.<init>(r9)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            r8.p = r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            java.lang.Object r9 = r1.z(r3, r8)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L4a java.io.IOException -> L5b
            if (r9 != r2) goto L6c
            goto L6b
        L4a:
            au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract$Action$ShowSnackbarMessage r9 = new au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract$Action$ShowSnackbarMessage
            r3 = 2132019001(0x7f140739, float:1.9676325E38)
            r9.<init>(r3)
            r8.p = r4
            java.lang.Object r9 = r1.z(r9, r8)
            if (r9 != r2) goto L6c
            goto L6b
        L5b:
            au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract$Action$ShowSnackbarMessage r9 = new au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract$Action$ShowSnackbarMessage
            r3 = 2132019000(0x7f140738, float:1.9676323E38)
            r9.<init>(r3)
            r8.p = r5
            java.lang.Object r9 = r1.z(r9, r8)
            if (r9 != r2) goto L6c
        L6b:
            return r2
        L6c:
            kotlinx.coroutines.flow.MutableStateFlow r9 = r0.i
        L6e:
            java.lang.Object r0 = r9.getValue()
            r1 = r0
            au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract$ViewState r1 = (au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract.ViewState) r1
            r2 = 0
            r3 = 5
            r4 = 0
            au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract$ViewState r1 = au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract.ViewState.a(r1, r2, r4, r4, r3)
            boolean r0 = r9.d(r0, r1)
            if (r0 == 0) goto L6e
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayViewModel$onSaveToGoogleWalletClick$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

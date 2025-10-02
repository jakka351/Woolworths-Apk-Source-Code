package au.com.woolworths.feature.shop.modeselector;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$fetchData$1", f = "ModeSelectorViewModel.kt", l = {98, 102}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ModeSelectorViewModel$fetchData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ModeSelectorViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeSelectorViewModel$fetchData$1(ModeSelectorViewModel modeSelectorViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = modeSelectorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ModeSelectorViewModel$fetchData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ModeSelectorViewModel$fetchData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel.p6(r2, r0, r21) == r3) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel r2 = r1.q
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r0 = r2.f
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r1.p
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L22
            if (r4 == r6) goto L12
            if (r4 != r5) goto L1a
        L12:
            kotlin.ResultKt.b(r22)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            goto L6e
        L16:
            r0 = move-exception
            goto L72
        L18:
            r0 = move-exception
            goto L76
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L22:
            kotlin.ResultKt.b(r22)
            kotlinx.coroutines.flow.MutableStateFlow r4 = r2.l     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
        L27:
            java.lang.Object r7 = r4.getValue()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            r8 = r7
            au.com.woolworths.feature.shop.modeselector.ModeSelectorContract$ViewState r8 = (au.com.woolworths.feature.shop.modeselector.ModeSelectorContract.ViewState) r8     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            r19 = 0
            r20 = 2042(0x7fa, float:2.861E-42)
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            au.com.woolworths.feature.shop.modeselector.ModeSelectorContract$ViewState r8 = au.com.woolworths.feature.shop.modeselector.ModeSelectorContract.ViewState.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            boolean r7 = r4.d(r7, r8)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            if (r7 == 0) goto L27
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r4 = r2.p     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            if (r4 == 0) goto L61
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r7 = r0.w()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            boolean r7 = r4.equals(r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            if (r7 == 0) goto L58
            goto L61
        L58:
            r1.p = r5     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            java.lang.Object r0 = au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel.r6(r2, r4, r1)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            if (r0 != r3) goto L6e
            goto L6d
        L61:
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r0 = r0.w()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            r1.p = r6     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            java.lang.Object r0 = au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel.p6(r2, r0, r1)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            if (r0 != r3) goto L6e
        L6d:
            return r3
        L6e:
            r0 = 0
            r2.p = r0     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L16 au.com.woolworths.android.onesite.network.NoConnectivityException -> L18
            goto L79
        L72:
            au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel.q6(r2, r0)
            goto L79
        L76:
            au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel.q6(r2, r0)
        L79:
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel$fetchData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

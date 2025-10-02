package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$fetchMapForFloor$1", f = "InstoreMapViewModel.kt", l = {588, 590}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class InstoreMapViewModel$fetchMapForFloor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InstoreMapViewModel q;
    public final /* synthetic */ Floor r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreMapViewModel$fetchMapForFloor$1(Floor floor, InstoreMapViewModel instoreMapViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = instoreMapViewModel;
        this.r = floor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreMapViewModel$fetchMapForFloor$1(this.r, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreMapViewModel$fetchMapForFloor$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.r6(r5, r2, r8, r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.p
            au.com.woolworths.feature.shop.instore.navigation.map.data.Floor r2 = r7.r
            r3 = 2
            r4 = 1
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel r5 = r7.q
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            kotlin.ResultKt.b(r8)
            goto L61
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            kotlin.ResultKt.b(r8)
            goto L32
        L20:
            kotlin.ResultKt.b(r8)
            au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor r8 = r5.h
            java.lang.String r1 = r2.e
            java.lang.String r6 = r2.f7335a
            r7.p = r4
            java.lang.Object r8 = r8.c(r1, r6, r7)
            if (r8 != r0) goto L32
            goto L46
        L32:
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult r8 = (au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult) r8
            boolean r1 = r8 instanceof au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Success
            if (r1 == 0) goto L47
            au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult$Success r8 = (au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Success) r8
            java.lang.Object r8 = r8.f7368a
            au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap r8 = (au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMap) r8
            r7.p = r3
            java.lang.Object r8 = au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel.r6(r5, r2, r8, r7)
            if (r8 != r0) goto L61
        L46:
            return r0
        L47:
            boolean r8 = r8 instanceof au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult.Failure
            if (r8 == 0) goto L64
            kotlinx.coroutines.flow.MutableStateFlow r8 = r5.s
        L4d:
            java.lang.Object r0 = r8.getValue()
            r1 = r0
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState r1 = (au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract.ViewState) r1
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Error r1 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract$ViewState$Error
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapErrorState r2 = au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapErrorState.d
            r1.<init>()
            boolean r0 = r8.d(r0, r1)
            if (r0 == 0) goto L4d
        L61:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        L64:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel$fetchMapForFloor$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package au.com.woolworths.feature.shop.catalogue.home;

import au.com.woolworths.android.onesite.navigation.Activities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel$onReady$1", f = "CatalogueHomeViewModel.kt", l = {56, 59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CatalogueHomeViewModel$onReady$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CatalogueHomeViewModel q;
    public final /* synthetic */ Activities.CatalogueHome.Extras r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueHomeViewModel$onReady$1(CatalogueHomeViewModel catalogueHomeViewModel, Activities.CatalogueHome.Extras extras, Continuation continuation) {
        super(2, continuation);
        this.q = catalogueHomeViewModel;
        this.r = extras;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CatalogueHomeViewModel$onReady$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CatalogueHomeViewModel$onReady$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r5.z(au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract.Action.LaunchInitialStoreSelection.f6840a, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel.p6(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r4.p
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            kotlin.ResultKt.b(r5)
            goto L43
        L19:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel r5 = r4.q
            au.com.woolworths.feature.shop.catalogue.CatalogueStoreInteractor r1 = r5.f
            au.com.woolworths.feature.shop.catalogue.CatalogueStoreRepositoryImpl r1 = r1.f6778a
            au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo r1 = r1.a()
            if (r1 != 0) goto L35
            kotlinx.coroutines.channels.BufferedChannel r5 = r5.i
            r4.p = r3
            au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract$Action$LaunchInitialStoreSelection r1 = au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract.Action.LaunchInitialStoreSelection.f6840a
            java.lang.Object r5 = r5.z(r1, r4)
            if (r5 != r0) goto L43
            goto L42
        L35:
            au.com.woolworths.android.onesite.navigation.Activities$CatalogueHome$Extras r1 = r4.r
            r5.t6(r1)
            r4.p = r2
            java.lang.Object r5 = au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel.p6(r5, r4)
            if (r5 != r0) goto L43
        L42:
            return r0
        L43:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeViewModel$onReady$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

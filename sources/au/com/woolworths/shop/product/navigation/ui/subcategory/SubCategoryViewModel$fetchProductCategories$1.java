package au.com.woolworths.shop.product.navigation.ui.subcategory;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel$fetchProductCategories$1", f = "SubCategoryViewModel.kt", l = {59, 61}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubCategoryViewModel$fetchProductCategories$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SubCategoryViewModel q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoryViewModel$fetchProductCategories$1(SubCategoryViewModel subCategoryViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.q = subCategoryViewModel;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubCategoryViewModel$fetchProductCategories$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubCategoryViewModel$fetchProductCategories$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r11 == r4) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Exception {
        /*
            r10 = this;
            au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel r0 = r10.q
            au.com.woolworths.shop.product.navigation.ProductCategoryNavigationInteractor r1 = r0.e
            au.com.woolworths.android.onesite.analytics.AnalyticsManager r2 = r0.f
            androidx.lifecycle.MutableLiveData r3 = r0.g
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r5 = r10.p
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L25
            if (r5 == r8) goto L21
            if (r5 != r7) goto L19
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            goto L55
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            kotlin.ResultKt.b(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            goto L41
        L25:
            kotlin.ResultKt.b(r11)
            au.com.woolworths.android.onesite.navigation.Activities$ProductSubCategory$ProductCategoryType r11 = r0.l     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            au.com.woolworths.android.onesite.navigation.Activities$ProductSubCategory$ProductCategoryType r5 = au.com.woolworths.android.onesite.navigation.Activities.ProductSubCategory.ProductCategoryType.e     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            java.lang.String r9 = r10.r
            if (r11 != r5) goto L44
            r10.p = r8     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository r11 = r1.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r1 = r1.f12637a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            java.lang.String r1 = r1.f()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            java.lang.Object r11 = r11.a(r9, r1, r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            if (r11 != r4) goto L41
            goto L54
        L41:
            au.com.woolworths.shop.product.navigation.data.ProductCategoryList r11 = (au.com.woolworths.shop.product.navigation.data.ProductCategoryList) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            goto L57
        L44:
            r10.p = r7     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository r5 = r1.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            au.com.woolworths.foundation.shop.collectionmode.RepositoryManager r1 = r1.f12637a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            java.lang.String r1 = r1.f()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            java.lang.Object r11 = r5.b(r9, r1, r11, r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            if (r11 != r4) goto L55
        L54:
            return r4
        L55:
            au.com.woolworths.shop.product.navigation.data.ProductCategoryList r11 = (au.com.woolworths.shop.product.navigation.data.ProductCategoryList) r11     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
        L57:
            java.util.List r1 = r11.getCategories()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            boolean r1 = r1.isEmpty()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            if (r1 == 0) goto L76
            au.com.woolworths.shop.product.navigation.ui.NoResultState r11 = au.com.woolworths.shop.product.navigation.ui.NoResultState.d     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel.r6(r3, r6, r11, r7)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            au.com.woolworths.android.onesite.navigation.Activities$ProductSubCategory$ProductCategoryType r11 = r0.l     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            au.com.woolworths.shop.product.navigation.analytics.ProductCategoryTrackingData r11 = au.com.woolworths.shop.product.navigation.analytics.ProductCategoryTrackingDataKt.a(r11)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            au.com.woolworths.android.onesite.analytics.Action r11 = r11.c     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            au.com.woolworths.analytics.model.TrackingMetadata r1 = r0.q6()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            r2.j(r11, r1)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            goto Lac
        L76:
            au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryContract$ViewState r1 = new au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryContract$ViewState     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            r4 = 0
            r1.<init>(r6, r11, r4)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            r3.m(r1)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L80 au.com.woolworths.android.onesite.network.NoConnectivityException -> L98
            goto Lac
        L80:
            au.com.woolworths.shop.product.navigation.ui.ServerErrorState r11 = new au.com.woolworths.shop.product.navigation.ui.ServerErrorState
            r11.<init>()
            au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel.r6(r3, r6, r11, r7)
            au.com.woolworths.android.onesite.navigation.Activities$ProductSubCategory$ProductCategoryType r11 = r0.l
            au.com.woolworths.shop.product.navigation.analytics.ProductCategoryTrackingData r11 = au.com.woolworths.shop.product.navigation.analytics.ProductCategoryTrackingDataKt.a(r11)
            au.com.woolworths.android.onesite.analytics.Action r11 = r11.e
            au.com.woolworths.analytics.model.TrackingMetadata r0 = r0.q6()
            r2.j(r11, r0)
            goto Lac
        L98:
            au.com.woolworths.shop.product.navigation.ui.ConnectionErrorState r11 = au.com.woolworths.shop.product.navigation.ui.ConnectionErrorState.d
            au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel.r6(r3, r6, r11, r7)
            au.com.woolworths.android.onesite.navigation.Activities$ProductSubCategory$ProductCategoryType r11 = r0.l
            au.com.woolworths.shop.product.navigation.analytics.ProductCategoryTrackingData r11 = au.com.woolworths.shop.product.navigation.analytics.ProductCategoryTrackingDataKt.a(r11)
            au.com.woolworths.android.onesite.analytics.Action r11 = r11.d
            au.com.woolworths.analytics.model.TrackingMetadata r0 = r0.q6()
            r2.j(r11, r0)
        Lac:
            kotlin.Unit r11 = kotlin.Unit.f24250a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryViewModel$fetchProductCategories$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

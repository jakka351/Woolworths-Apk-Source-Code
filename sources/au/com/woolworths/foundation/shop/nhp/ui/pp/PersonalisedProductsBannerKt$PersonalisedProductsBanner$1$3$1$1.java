package au.com.woolworths.foundation.shop.nhp.ui.pp;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.datastore.core.DataStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.nhp.ui.pp.PersonalisedProductsBannerKt$PersonalisedProductsBanner$1$3$1$1", f = "PersonalisedProductsBanner.kt", l = {81, 89}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PersonalisedProductsBannerKt$PersonalisedProductsBanner$1$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public DataStore p;
    public int q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ MutableState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalisedProductsBannerKt$PersonalisedProductsBanner$1$3$1$1(Context context, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.r = context;
        this.s = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersonalisedProductsBannerKt$PersonalisedProductsBanner$1$3$1$1(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PersonalisedProductsBannerKt$PersonalisedProductsBanner$1$3$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r7.collect(r3, r6) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L7f
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            androidx.datastore.core.DataStore r1 = r6.p
            kotlin.ResultKt.b(r7)
            goto L47
        L1e:
            kotlin.ResultKt.b(r7)
            kotlin.reflect.KProperty[] r7 = au.com.woolworths.foundation.shop.nhp.ui.pp.ProductCarouselSessionDataStoreKt.f8791a
            java.lang.String r7 = "<this>"
            android.content.Context r1 = r6.r
            kotlin.jvm.internal.Intrinsics.h(r1, r7)
            androidx.datastore.DataStoreSingletonDelegate r7 = au.com.woolworths.foundation.shop.nhp.ui.pp.ProductCarouselSessionDataStoreKt.b
            kotlin.reflect.KProperty[] r4 = au.com.woolworths.foundation.shop.nhp.ui.pp.ProductCarouselSessionDataStoreKt.f8791a
            r5 = 0
            r4 = r4[r5]
            java.lang.Object r7 = r7.getValue(r1, r4)
            r1 = r7
            androidx.datastore.core.DataStore r1 = (androidx.datastore.core.DataStore) r1
            kotlinx.coroutines.flow.Flow r7 = r1.getD()
            r6.p = r1
            r6.q = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.y(r7, r6)
            if (r7 != r0) goto L47
            goto L7e
        L47:
            au.com.woolworths.foundation.shop.nhp.ui.pp.ProductCarouselSession r7 = (au.com.woolworths.foundation.shop.nhp.ui.pp.ProductCarouselSession) r7
            androidx.compose.runtime.MutableState r4 = r6.s
            if (r7 == 0) goto L56
            boolean r7 = r7.f8789a
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r4.setValue(r7)
        L56:
            au.com.woolworths.feature.rewards.offers.listpage.ui.e r7 = new au.com.woolworths.feature.rewards.offers.listpage.ui.e
            r5 = 9
            r7.<init>(r4, r5)
            kotlinx.coroutines.flow.Flow r7 = androidx.compose.runtime.SnapshotStateKt.m(r7)
            kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1
            r4.<init>(r7)
            kotlinx.coroutines.flow.Flow r7 = kotlinx.coroutines.flow.FlowKt.r(r4)
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 r7 = kotlinx.coroutines.flow.FlowKt.s(r7, r3)
            au.com.woolworths.foundation.shop.nhp.ui.pp.PersonalisedProductsBannerKt$PersonalisedProductsBanner$1$3$1$1$3 r3 = new au.com.woolworths.foundation.shop.nhp.ui.pp.PersonalisedProductsBannerKt$PersonalisedProductsBanner$1$3$1$1$3
            r3.<init>()
            r1 = 0
            r6.p = r1
            r6.q = r2
            java.lang.Object r7 = r7.collect(r3, r6)
            if (r7 != r0) goto L7f
        L7e:
            return r0
        L7f:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.nhp.ui.pp.PersonalisedProductsBannerKt$PersonalisedProductsBanner$1$3$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

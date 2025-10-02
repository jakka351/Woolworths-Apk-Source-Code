package au.com.woolworths.feature.shop.brandedshop.ui;

import au.com.woolworths.foundation.feature.analytics.list.ListItemsTrackerState;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.brandedshop.ui.BrandedShopFullWidthContentCardKt$brandedShopFullWidthContentCard$1$1$1", f = "BrandedShopFullWidthContentCard.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BrandedShopFullWidthContentCardKt$brandedShopFullWidthContentCard$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ListItemsTrackerState p;
    public final /* synthetic */ String q;
    public final /* synthetic */ FullWidthContentCardData r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandedShopFullWidthContentCardKt$brandedShopFullWidthContentCard$1$1$1(ListItemsTrackerState listItemsTrackerState, String str, FullWidthContentCardData fullWidthContentCardData, Continuation continuation) {
        super(2, continuation);
        this.p = listItemsTrackerState;
        this.q = str;
        this.r = fullWidthContentCardData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BrandedShopFullWidthContentCardKt$brandedShopFullWidthContentCard$1$1$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BrandedShopFullWidthContentCardKt$brandedShopFullWidthContentCard$1$1$1 brandedShopFullWidthContentCardKt$brandedShopFullWidthContentCard$1$1$1 = (BrandedShopFullWidthContentCardKt$brandedShopFullWidthContentCard$1$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        brandedShopFullWidthContentCardKt$brandedShopFullWidthContentCard$1$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        String str = this.q;
        this.p.a(this.r, str);
        return Unit.f24250a;
    }
}

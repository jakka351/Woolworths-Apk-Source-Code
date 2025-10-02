package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.paging.ItemSnapshotList;
import au.com.woolworths.foundation.feature.analytics.list.ListItemsSeenEffectKt;
import au.com.woolworths.product.models.ProductCard;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt$Listing$3$1", f = "PromotionDetailsScreen.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class PromotionDetailsScreenKt$Listing$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LazyListState p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ ItemSnapshotList r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionDetailsScreenKt$Listing$3$1(LazyListState lazyListState, Function1 function1, ItemSnapshotList itemSnapshotList, Continuation continuation) {
        super(2, continuation);
        this.p = lazyListState;
        this.q = function1;
        this.r = itemSnapshotList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromotionDetailsScreenKt$Listing$3$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PromotionDetailsScreenKt$Listing$3$1 promotionDetailsScreenKt$Listing$3$1 = (PromotionDetailsScreenKt$Listing$3$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        promotionDetailsScreenKt$Listing$3$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ArrayList arrayListC = ListItemsSeenEffectKt.c(this.p.j(), 0.5f);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            Object obj2 = this.r.get(((LazyListItemInfo) it.next()).getF996a());
            ProductCard productCard = obj2 instanceof ProductCard ? (ProductCard) obj2 : null;
            if (productCard != null) {
                arrayList.add(productCard);
            }
        }
        this.q.invoke(arrayList);
        return Unit.f24250a;
    }
}

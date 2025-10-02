package au.com.woolworths.foundation.shop.nhp.ui.pp;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.ProductInBannerData;
import coil3.SingletonImageLoader;
import coil3.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.nhp.ui.pp.InlineProductCarouselKt$InlineProductCarousel$2$1", f = "InlineProductCarousel.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class InlineProductCarouselKt$InlineProductCarousel$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ArrayList p;
    public final /* synthetic */ MutableIntState q;
    public final /* synthetic */ Context r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineProductCarouselKt$InlineProductCarousel$2$1(ArrayList arrayList, MutableIntState mutableIntState, Context context, Continuation continuation) {
        super(2, continuation);
        this.p = arrayList;
        this.q = mutableIntState;
        this.r = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InlineProductCarouselKt$InlineProductCarousel$2$1(this.p, this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InlineProductCarouselKt$InlineProductCarousel$2$1 inlineProductCarouselKt$InlineProductCarousel$2$1 = (InlineProductCarouselKt$InlineProductCarousel$2$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        inlineProductCarouselKt$InlineProductCarousel$2$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        int iD = this.q.d() + 1;
        ArrayList arrayList = this.p;
        List<ProductInBannerData> list = (List) CollectionsKt.J(iD % arrayList.size(), arrayList);
        if (list != null) {
            for (ProductInBannerData productInBannerData : list) {
                Context context = this.r;
                ImageRequest.Builder builder = new ImageRequest.Builder(context);
                builder.c = productInBannerData.c;
                SingletonImageLoader.a(context).b(builder.a());
            }
        }
        return Unit.f24250a;
    }
}

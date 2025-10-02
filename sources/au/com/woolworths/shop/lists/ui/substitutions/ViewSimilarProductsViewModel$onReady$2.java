package au.com.woolworths.shop.lists.ui.substitutions;

import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.shop.lists.data.model.AlternativeProductCard;
import au.com.woolworths.shop.lists.data.model.AlternativeProducts;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsProductSection;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsSection;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
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
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/models/TrolleyResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsViewModel$onReady$2", f = "ViewSimilarProductsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ViewSimilarProductsViewModel$onReady$2 extends SuspendLambda implements Function2<TrolleyResult, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ ViewSimilarProductsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSimilarProductsViewModel$onReady$2(ViewSimilarProductsViewModel viewSimilarProductsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = viewSimilarProductsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ViewSimilarProductsViewModel$onReady$2 viewSimilarProductsViewModel$onReady$2 = new ViewSimilarProductsViewModel$onReady$2(this.q, continuation);
        viewSimilarProductsViewModel$onReady$2.p = obj;
        return viewSimilarProductsViewModel$onReady$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ViewSimilarProductsViewModel$onReady$2 viewSimilarProductsViewModel$onReady$2 = (ViewSimilarProductsViewModel$onReady$2) create((TrolleyResult) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        viewSimilarProductsViewModel$onReady$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        TrolleyResult trolleyResult = (TrolleyResult) this.p;
        MutableStateFlow mutableStateFlow = this.q.k;
        Object value = mutableStateFlow.getValue();
        ViewSimilarProductsContract.ViewState.Content content = value instanceof ViewSimilarProductsContract.ViewState.Content ? (ViewSimilarProductsContract.ViewState.Content) value : null;
        if (content != null) {
            AlternativeProducts alternativeProducts = content.f12480a;
            List<AlternativeProductsSection> sections = alternativeProducts.getSections();
            ArrayList arrayList = new ArrayList(CollectionsKt.s(sections, 10));
            for (Object objCopy$default : sections) {
                if (objCopy$default instanceof AlternativeProductsProductSection) {
                    AlternativeProductsProductSection alternativeProductsProductSection = (AlternativeProductsProductSection) objCopy$default;
                    List<AlternativeProductCard> products = alternativeProductsProductSection.getProducts();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.s(products, 10));
                    for (AlternativeProductCard alternativeProductCard : products) {
                        arrayList2.add(AlternativeProductCard.copy$default(alternativeProductCard, ProductCardExtKt.B(alternativeProductCard.getProduct(), trolleyResult), null, 2, null));
                    }
                    objCopy$default = AlternativeProductsProductSection.copy$default(alternativeProductsProductSection, arrayList2, null, 2, null);
                }
                arrayList.add(objCopy$default);
            }
            mutableStateFlow.f(ViewSimilarProductsContract.ViewState.Content.d(content, AlternativeProducts.copy$default(alternativeProducts, arrayList, null, 2, null), null, null, 62));
        }
        return Unit.f24250a;
    }
}

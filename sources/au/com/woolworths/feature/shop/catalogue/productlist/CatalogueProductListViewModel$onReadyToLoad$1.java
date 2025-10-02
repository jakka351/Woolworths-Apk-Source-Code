package au.com.woolworths.feature.shop.catalogue.productlist;

import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListInteractor;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel$onReadyToLoad$1", f = "CatalogueProductListViewModel.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CatalogueProductListViewModel$onReadyToLoad$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CatalogueProductListViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ CatalogueTracking t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueProductListViewModel$onReadyToLoad$1(CatalogueProductListViewModel catalogueProductListViewModel, String str, String str2, CatalogueTracking catalogueTracking, Continuation continuation) {
        super(2, continuation);
        this.q = catalogueProductListViewModel;
        this.r = str;
        this.s = str2;
        this.t = catalogueTracking;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CatalogueProductListViewModel$onReadyToLoad$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CatalogueProductListViewModel$onReadyToLoad$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CatalogueProductListInteractor.LoadData loadData;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        CatalogueProductListViewModel catalogueProductListViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                KProperty[] kPropertyArr = CatalogueProductListViewModel.s;
                catalogueProductListViewModel.w6(CatalogueProductListViewModel.State.Loading.f6922a);
                CatalogueProductListInteractor catalogueProductListInteractor = catalogueProductListViewModel.f;
                String str = this.r;
                String str2 = this.s;
                CatalogueTracking catalogueTracking = this.t;
                String str3 = catalogueTracking != null ? catalogueTracking.f : null;
                if (str3 == null) {
                    str3 = "";
                }
                this.p = 1;
                obj = catalogueProductListInteractor.a(str, str2, str3, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            loadData = (CatalogueProductListInteractor.LoadData) obj;
        } catch (Exception e) {
            CatalogueProductListViewModel.State.Error error = new CatalogueProductListViewModel.State.Error(e);
            KProperty[] kPropertyArr2 = CatalogueProductListViewModel.s;
            catalogueProductListViewModel.w6(error);
        }
        if (loadData.f6918a.f6948a.getCatalogueProductListDetails().isEmpty()) {
            throw CatalogueProductListViewModel.NoProductListException.d;
        }
        CatalogueProductListViewModel.State.Loaded loaded = new CatalogueProductListViewModel.State.Loaded(loadData.f6918a, loadData.b);
        KProperty[] kPropertyArr3 = CatalogueProductListViewModel.s;
        catalogueProductListViewModel.w6(loaded);
        return Unit.f24250a;
    }
}

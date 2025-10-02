package au.com.woolworths.feature.shop.catalogue.browse;

import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseContract;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseInteractor.BrowsePagingSource;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseViewModel$fetchBrowse$1", f = "CatalogueBrowseViewModel.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CatalogueBrowseViewModel$fetchBrowse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CatalogueBrowseViewModel r;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "data", "Landroidx/paging/PagingData;", "Lau/com/woolworths/feature/shop/catalogue/browse/model/BrowsePage;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseViewModel$fetchBrowse$1$1", f = "CatalogueBrowseViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseViewModel$fetchBrowse$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<PagingData<BrowsePage>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ CatalogueBrowseViewModel q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CatalogueBrowseViewModel catalogueBrowseViewModel, Continuation continuation) {
            super(2, continuation);
            this.q = catalogueBrowseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((PagingData) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            this.q.k.f(new CatalogueBrowseContract.BrowseViewState((PagingData) this.p, null, 5));
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueBrowseViewModel$fetchBrowse$1(CatalogueBrowseViewModel catalogueBrowseViewModel, Continuation continuation) {
        super(2, continuation);
        this.r = catalogueBrowseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CatalogueBrowseViewModel$fetchBrowse$1 catalogueBrowseViewModel$fetchBrowse$1 = new CatalogueBrowseViewModel$fetchBrowse$1(this.r, continuation);
        catalogueBrowseViewModel$fetchBrowse$1.q = obj;
        return catalogueBrowseViewModel$fetchBrowse$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CatalogueBrowseViewModel$fetchBrowse$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            CatalogueBrowseViewModel catalogueBrowseViewModel = this.r;
            final CatalogueBrowseInteractor catalogueBrowseInteractor = catalogueBrowseViewModel.e;
            final String str = catalogueBrowseViewModel.i;
            catalogueBrowseInteractor.getClass();
            Flow flowA = CachedPagingDataKt.a(new Pager(new PagingConfig(5, 0, 0, 58, false), new Function0() { // from class: au.com.woolworths.feature.shop.catalogue.browse.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return catalogueBrowseInteractor.new BrowsePagingSource(str);
                }
            }).f3571a, coroutineScope);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(catalogueBrowseViewModel, null);
            this.p = 1;
            if (FlowKt.h(flowA, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}

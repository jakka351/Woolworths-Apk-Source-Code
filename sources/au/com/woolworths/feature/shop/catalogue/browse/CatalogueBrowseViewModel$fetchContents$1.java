package au.com.woolworths.feature.shop.catalogue.browse;

import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseContract;
import au.com.woolworths.feature.shop.catalogue.browse.contents.CatalogueContentsAction;
import au.com.woolworths.feature.shop.catalogue.browse.contents.model.CatalogueContents;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseViewModel$fetchContents$1", f = "CatalogueBrowseViewModel.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CatalogueBrowseViewModel$fetchContents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CatalogueBrowseViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueBrowseViewModel$fetchContents$1(CatalogueBrowseViewModel catalogueBrowseViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = catalogueBrowseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CatalogueBrowseViewModel$fetchContents$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CatalogueBrowseViewModel$fetchContents$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        CatalogueBrowseViewModel catalogueBrowseViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CatalogueBrowseInteractor catalogueBrowseInteractor = catalogueBrowseViewModel.e;
                this.p = 1;
                CatalogueBrowseRepository catalogueBrowseRepository = catalogueBrowseInteractor.f6795a;
                CollectionModeInteractor collectionModeInteractor = catalogueBrowseInteractor.b;
                obj = catalogueBrowseRepository.b(collectionModeInteractor.a(), collectionModeInteractor.w(), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            CatalogueContents catalogueContents = (CatalogueContents) obj;
            if (catalogueContents.f6803a.isEmpty()) {
                CatalogueBrowseViewModel.p6(catalogueBrowseViewModel, CatalogueBrowsePageErrorState.e);
            } else {
                catalogueBrowseViewModel.l.f(new CatalogueBrowseContract.ContentsViewState(catalogueContents, null, 5));
                catalogueBrowseViewModel.f.c(CatalogueContentsAction.e);
            }
        } catch (NoConnectivityException unused) {
            CatalogueBrowseViewModel.p6(catalogueBrowseViewModel, CatalogueBrowsePageErrorState.d);
        } catch (ServerErrorException unused2) {
            CatalogueBrowseViewModel.p6(catalogueBrowseViewModel, CatalogueBrowsePageErrorState.e);
        }
        return Unit.f24250a;
    }
}

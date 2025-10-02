package au.com.woolworths.feature.shop.catalogue.storeselector;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreSearchListInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel$subscribeToInput$1", f = "CatalogueStoreSelectorViewModel.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CatalogueStoreSelectorViewModel$subscribeToInput$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CatalogueStoreSelectorViewModel q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel$subscribeToInput$1$1", f = "CatalogueStoreSelectorViewModel.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel$subscribeToInput$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ CatalogueStoreSelectorViewModel r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel, Continuation continuation) {
            super(2, continuation);
            this.r = catalogueStoreSelectorViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel;
            CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel2 = this.r;
            MutableLiveData mutableLiveData = catalogueStoreSelectorViewModel2.g;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            try {
            } catch (NoConnectivityException e) {
                mutableLiveData.m(CatalogueStoreSelectorViewModel.p6(catalogueStoreSelectorViewModel2, e));
            } catch (ServerErrorException e2) {
                mutableLiveData.m(CatalogueStoreSelectorViewModel.p6(catalogueStoreSelectorViewModel2, e2));
            }
            if (i == 0) {
                ResultKt.b(obj);
                String str = (String) this.q;
                catalogueStoreSelectorViewModel2.j = str;
                if (str.length() <= 0) {
                    CatalogueStoreSelectorViewModel.q6(catalogueStoreSelectorViewModel2, new CatalogueStoreSearchListInfo(EmptyList.d));
                    return Unit.f24250a;
                }
                CatalogueStoreSelectorInteractor catalogueStoreSelectorInteractor = catalogueStoreSelectorViewModel2.e;
                String str2 = catalogueStoreSelectorViewModel2.j;
                this.q = catalogueStoreSelectorViewModel2;
                this.p = 1;
                obj = catalogueStoreSelectorInteractor.a(str2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                catalogueStoreSelectorViewModel = catalogueStoreSelectorViewModel2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catalogueStoreSelectorViewModel = (CatalogueStoreSelectorViewModel) this.q;
                ResultKt.b(obj);
            }
            CatalogueStoreSelectorViewModel.q6(catalogueStoreSelectorViewModel, (CatalogueStoreSearchListInfo) obj);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueStoreSelectorViewModel$subscribeToInput$1(CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = catalogueStoreSelectorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CatalogueStoreSelectorViewModel$subscribeToInput$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CatalogueStoreSelectorViewModel$subscribeToInput$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel = this.q;
            Flow flowO = FlowKt.o(catalogueStoreSelectorViewModel.k, 500L);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(catalogueStoreSelectorViewModel, null);
            this.p = 1;
            if (FlowKt.h(flowO, anonymousClass1, this) == coroutineSingletons) {
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

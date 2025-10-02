package au.com.woolworths.feature.shop.catalogue.home;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueHomeBinding;
import au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity$observeViewState$1", f = "CatalogueHomeActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CatalogueHomeActivity$observeViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ CatalogueHomeActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity$observeViewState$1$1", f = "CatalogueHomeActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity$observeViewState$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CatalogueHomeContract.ViewState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ CatalogueHomeActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CatalogueHomeActivity catalogueHomeActivity, Continuation continuation) {
            super(2, continuation);
            this.q = catalogueHomeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CatalogueHomeContract.ViewState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CatalogueHomeContract.ViewState viewState = (CatalogueHomeContract.ViewState) this.p;
            CatalogueHomeActivity catalogueHomeActivity = this.q;
            ActivityCatalogueHomeBinding activityCatalogueHomeBinding = catalogueHomeActivity.y;
            if (activityCatalogueHomeBinding == null) {
                Intrinsics.p("binding");
                throw null;
            }
            activityCatalogueHomeBinding.z.setVisibility(viewState.f6843a ? 0 : 8);
            CatalogueHomePageErrorState catalogueHomePageErrorState = viewState.c;
            if (catalogueHomePageErrorState != null) {
                ActivityCatalogueHomeBinding activityCatalogueHomeBinding2 = catalogueHomeActivity.y;
                if (activityCatalogueHomeBinding2 == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                activityCatalogueHomeBinding2.y.M(catalogueHomePageErrorState);
                ActivityCatalogueHomeBinding activityCatalogueHomeBinding3 = catalogueHomeActivity.y;
                if (activityCatalogueHomeBinding3 == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                activityCatalogueHomeBinding3.y.h.setVisibility(0);
                ActivityCatalogueHomeBinding activityCatalogueHomeBinding4 = catalogueHomeActivity.y;
                if (activityCatalogueHomeBinding4 == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                activityCatalogueHomeBinding4.y.L(catalogueHomeActivity.O4());
            } else {
                ActivityCatalogueHomeBinding activityCatalogueHomeBinding5 = catalogueHomeActivity.y;
                if (activityCatalogueHomeBinding5 == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                activityCatalogueHomeBinding5.y.h.setVisibility(8);
            }
            catalogueHomeActivity.D.setData(viewState.b);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueHomeActivity$observeViewState$1(CatalogueHomeActivity catalogueHomeActivity, Continuation continuation) {
        super(2, continuation);
        this.q = catalogueHomeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CatalogueHomeActivity$observeViewState$1 catalogueHomeActivity$observeViewState$1 = new CatalogueHomeActivity$observeViewState$1(this.q, continuation);
        catalogueHomeActivity$observeViewState$1.p = obj;
        return catalogueHomeActivity$observeViewState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CatalogueHomeActivity$observeViewState$1 catalogueHomeActivity$observeViewState$1 = (CatalogueHomeActivity$observeViewState$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        catalogueHomeActivity$observeViewState$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        int i = CatalogueHomeActivity.E;
        CatalogueHomeActivity catalogueHomeActivity = this.q;
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(catalogueHomeActivity, null), FlowExtKt.a(catalogueHomeActivity.O4().k, catalogueHomeActivity.getD(), Lifecycle.State.h)), coroutineScope);
        return Unit.f24250a;
    }
}

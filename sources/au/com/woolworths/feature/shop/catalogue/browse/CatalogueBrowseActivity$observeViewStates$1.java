package au.com.woolworths.feature.shop.catalogue.browse;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseContract;
import au.com.woolworths.feature.shop.catalogue.browse.page.PageEpoxyController;
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
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$observeViewStates$1", f = "CatalogueBrowseActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CatalogueBrowseActivity$observeViewStates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ CatalogueBrowseActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$BrowseViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$observeViewStates$1$1", f = "CatalogueBrowseActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$observeViewStates$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CatalogueBrowseContract.BrowseViewState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ CatalogueBrowseActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CatalogueBrowseActivity catalogueBrowseActivity, Continuation continuation) {
            super(2, continuation);
            this.q = catalogueBrowseActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CatalogueBrowseContract.BrowseViewState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CatalogueBrowseContract.BrowseViewState browseViewState = (CatalogueBrowseContract.BrowseViewState) this.p;
            int i = CatalogueBrowseActivity.H;
            CatalogueBrowseAdapter catalogueBrowseAdapter = (CatalogueBrowseAdapter) this.q.E.getD();
            catalogueBrowseAdapter.getClass();
            Intrinsics.h(browseViewState, "browseViewState");
            catalogueBrowseAdapter.k = browseViewState;
            catalogueBrowseAdapter.G(CatalogueBrowsePageTab.e);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$ContentsViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$observeViewStates$1$3", f = "CatalogueBrowseActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$observeViewStates$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CatalogueBrowseContract.ContentsViewState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ CatalogueBrowseActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CatalogueBrowseActivity catalogueBrowseActivity, Continuation continuation) {
            super(2, continuation);
            this.q = catalogueBrowseActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.q, continuation);
            anonymousClass3.p = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((CatalogueBrowseContract.ContentsViewState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass3.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CatalogueBrowseContract.ContentsViewState contentsViewState = (CatalogueBrowseContract.ContentsViewState) this.p;
            int i = CatalogueBrowseActivity.H;
            CatalogueBrowseAdapter catalogueBrowseAdapter = (CatalogueBrowseAdapter) this.q.E.getD();
            catalogueBrowseAdapter.getClass();
            Intrinsics.h(contentsViewState, "contentsViewState");
            catalogueBrowseAdapter.l = contentsViewState;
            catalogueBrowseAdapter.G(CatalogueBrowsePageTab.f);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueBrowseActivity$observeViewStates$1(CatalogueBrowseActivity catalogueBrowseActivity, Continuation continuation) {
        super(2, continuation);
        this.q = catalogueBrowseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CatalogueBrowseActivity$observeViewStates$1 catalogueBrowseActivity$observeViewStates$1 = new CatalogueBrowseActivity$observeViewStates$1(this.q, continuation);
        catalogueBrowseActivity$observeViewStates$1.p = obj;
        return catalogueBrowseActivity$observeViewStates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CatalogueBrowseActivity$observeViewStates$1 catalogueBrowseActivity$observeViewStates$1 = (CatalogueBrowseActivity$observeViewStates$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        catalogueBrowseActivity$observeViewStates$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        int i = CatalogueBrowseActivity.H;
        CatalogueBrowseActivity catalogueBrowseActivity = this.q;
        MutableStateFlow mutableStateFlow = catalogueBrowseActivity.O4().k;
        Lifecycle d = catalogueBrowseActivity.getD();
        Lifecycle.State state = Lifecycle.State.h;
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(catalogueBrowseActivity, null), FlowExtKt.a(mutableStateFlow, d, state)), coroutineScope);
        ((PageEpoxyController) catalogueBrowseActivity.C.getD()).addLoadStateListener(new b(catalogueBrowseActivity, 6));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(catalogueBrowseActivity, null), FlowExtKt.a(catalogueBrowseActivity.O4().l, catalogueBrowseActivity.getD(), state)), coroutineScope);
        return Unit.f24250a;
    }
}

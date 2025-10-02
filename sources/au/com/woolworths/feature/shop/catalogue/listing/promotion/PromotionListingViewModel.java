package au.com.woolworths.feature.shop.catalogue.listing.promotion;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingContract;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.model.ListingHeader;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingViewModel;", "Landroidx/lifecycle/ViewModel;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromotionListingViewModel extends ViewModel {
    public final PromotionListingInteractor e;
    public final MutableStateFlow f;
    public final BufferedChannel g;
    public final Flow h;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingViewModel$1", f = "PromotionListingViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public /* synthetic */ int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = PromotionListingViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.p = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            int i = this.p;
            MutableStateFlow mutableStateFlow = PromotionListingViewModel.this.f;
            mutableStateFlow.f(PromotionListingContract.ViewState.a((PromotionListingContract.ViewState) mutableStateFlow.getValue(), new Integer(i), null, null, 13));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/model/ListingHeader;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingViewModel$2", f = "PromotionListingViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<ListingHeader, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = PromotionListingViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((ListingHeader) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ListingHeader listingHeader = (ListingHeader) this.p;
            MutableStateFlow mutableStateFlow = PromotionListingViewModel.this.f;
            mutableStateFlow.f(PromotionListingContract.ViewState.a((PromotionListingContract.ViewState) mutableStateFlow.getValue(), null, listingHeader, null, 11));
            return Unit.f24250a;
        }
    }

    public PromotionListingViewModel(PromotionListingInteractor promotionListingInteractor, CartUpdateInteractor cartUpdateInteractor) {
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.e = promotionListingInteractor;
        this.f = StateFlowKt.a(new PromotionListingContract.ViewState(cartUpdateInteractor.b.z(), null, null, null));
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.g = bufferedChannelA;
        this.h = FlowKt.I(bufferedChannelA);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), cartUpdateInteractor.l), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), promotionListingInteractor.d), ViewModelKt.a(this));
    }
}

package au.com.woolworths.feature.product.list.legacy;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetContract;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetViewModel;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$initActionsCollection$3", f = "LegacyProductListActivity.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LegacyProductListActivity$initActionsCollection$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LegacyProductListActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$initActionsCollection$3$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<EducationBottomSheetContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            EducationBottomSheetContract.Actions actions = (EducationBottomSheetContract.Actions) obj;
            LegacyProductListActivity legacyProductListActivity = (LegacyProductListActivity) this.d;
            int i = LegacyProductListActivity.D;
            if (actions instanceof EducationBottomSheetContract.Actions.ContinueAddOrUpdateCart) {
                ProductListViewModel productListViewModel = (ProductListViewModel) legacyProductListActivity.A.getD();
                ProductCard productCard = productListViewModel.L;
                if (productCard != null) {
                    ProductTrolleyData trolley = productCard.getTrolley();
                    if ((trolley != null ? trolley.getButtonState() : null) == ProductTileButtonType.ADD) {
                        productListViewModel.M6(productCard, false);
                    } else {
                        productListViewModel.N6(productCard, false);
                    }
                }
            } else {
                legacyProductListActivity.getClass();
                if (!(actions instanceof EducationBottomSheetContract.Actions.LaunchInfoSection)) {
                    throw new NoWhenBranchMatchedException();
                }
                InfoSectionFragment.Companion.a(((EducationBottomSheetContract.Actions.LaunchInfoSection) actions).f8752a, null).show(legacyProductListActivity.getSupportFragmentManager(), "InfoSectionFragment");
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyProductListActivity$initActionsCollection$3(LegacyProductListActivity legacyProductListActivity, Continuation continuation) {
        super(2, continuation);
        this.q = legacyProductListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LegacyProductListActivity$initActionsCollection$3(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LegacyProductListActivity$initActionsCollection$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            LegacyProductListActivity legacyProductListActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, legacyProductListActivity, LegacyProductListActivity.class, "handleEducationBottomSheetActions", "handleEducationBottomSheetActions(Lau/com/woolworths/foundation/shop/marketplace/education/ui/EducationBottomSheetContract$Actions;)V", 4), FlowExtKt.a(((EducationBottomSheetViewModel) legacyProductListActivity.B.getD()).m, legacyProductListActivity.getD(), Lifecycle.State.g));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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

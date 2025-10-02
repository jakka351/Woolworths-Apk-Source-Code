package au.com.woolworths.feature.shop.catalogue.browse;

import android.content.Intent;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseContract;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingActivity;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.PromotionListingActivity;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$collectActions$1", f = "CatalogueBrowseActivity.kt", l = {230}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CatalogueBrowseActivity$collectActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CatalogueBrowseActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity$collectActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CatalogueBrowseContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
            CatalogueBrowseContract.Action action = (CatalogueBrowseContract.Action) obj;
            CatalogueBrowseActivity catalogueBrowseActivity = (CatalogueBrowseActivity) this.d;
            int i = CatalogueBrowseActivity.H;
            catalogueBrowseActivity.getClass();
            if (action instanceof CatalogueBrowseContract.Action.LaunchProductDetails) {
                String str = ((CatalogueBrowseContract.Action.LaunchProductDetails) action).f6791a;
                ShopAppNavigator shopAppNavigator = catalogueBrowseActivity.z;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.d(str);
            } else if (action instanceof CatalogueBrowseContract.Action.LaunchCatalogueListing) {
                CategoryListingActivity.Extra extra = new CategoryListingActivity.Extra(((CatalogueBrowseContract.Action.LaunchCatalogueListing) action).f6789a);
                Intent intent = new Intent(catalogueBrowseActivity, (Class<?>) CategoryListingActivity.class);
                intent.putExtra("extra_category_listing", extra);
                catalogueBrowseActivity.startActivity(intent);
            } else if (action instanceof CatalogueBrowseContract.Action.LaunchDeepLink) {
                catalogueBrowseActivity.startActivity(ShopAppDeepLink.a(CatalogueScreen.g, ((CatalogueBrowseContract.Action.LaunchDeepLink) action).f6790a));
            } else {
                if (!(action instanceof CatalogueBrowseContract.Action.LaunchPromotionListing)) {
                    throw new NoWhenBranchMatchedException();
                }
                PromotionListingActivity.Extra extra2 = new PromotionListingActivity.Extra(((CatalogueBrowseContract.Action.LaunchPromotionListing) action).f6792a);
                Intent intent2 = new Intent(catalogueBrowseActivity, (Class<?>) PromotionListingActivity.class);
                intent2.putExtra("extra_promotion_listing", extra2);
                catalogueBrowseActivity.startActivity(intent2);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueBrowseActivity$collectActions$1(CatalogueBrowseActivity catalogueBrowseActivity, Continuation continuation) {
        super(2, continuation);
        this.q = catalogueBrowseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CatalogueBrowseActivity$collectActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CatalogueBrowseActivity$collectActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = CatalogueBrowseActivity.H;
            CatalogueBrowseActivity catalogueBrowseActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, catalogueBrowseActivity, CatalogueBrowseActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action;)V", 4), FlowExtKt.a(catalogueBrowseActivity.O4().m, catalogueBrowseActivity.getD(), Lifecycle.State.g));
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

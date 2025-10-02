package au.com.woolworths.feature.shop.catalogue.home;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseActivity;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsActivity;
import au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity;
import au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity$collectActions$1", f = "CatalogueHomeActivity.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CatalogueHomeActivity$collectActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CatalogueHomeActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity$collectActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CatalogueHomeContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CatalogueHomeContract.Action action = (CatalogueHomeContract.Action) obj;
            CatalogueHomeActivity catalogueHomeActivity = (CatalogueHomeActivity) this.d;
            int i = CatalogueHomeActivity.E;
            catalogueHomeActivity.getClass();
            if (Intrinsics.c(action, CatalogueHomeContract.Action.LaunchInitialStoreSelection.f6840a)) {
                ActivityResultLauncher activityResultLauncher = catalogueHomeActivity.B;
                Activities.CatalogueHome.Extras extras = (Activities.CatalogueHome.Extras) catalogueHomeActivity.A.getD();
                activityResultLauncher.a(new CatalogueIntroActivity.Companion.Extras(extras != null ? extras.d : null), null);
            } else if (Intrinsics.c(action, CatalogueHomeContract.Action.LaunchSubsequentStoreSelection.f6841a)) {
                catalogueHomeActivity.C.a(null, null);
            } else if (action instanceof CatalogueHomeContract.Action.LaunchCatalogueDetails) {
                int i2 = CatalogueDetailsActivity.B;
                CatalogueHomeContract.Action.LaunchCatalogueDetails launchCatalogueDetails = (CatalogueHomeContract.Action.LaunchCatalogueDetails) action;
                CatalogueDetailsActivity.Companion.a(catalogueHomeActivity, new CatalogueDetailsActivity.Extra(launchCatalogueDetails.b, launchCatalogueDetails.f6839a));
            } else if (action instanceof CatalogueHomeContract.Action.LaunchTermsAndConditions) {
                TermsAndConditionsActivity.Extra extra = new TermsAndConditionsActivity.Extra(((CatalogueHomeContract.Action.LaunchTermsAndConditions) action).f6842a);
                Intent intent = new Intent(catalogueHomeActivity, (Class<?>) TermsAndConditionsActivity.class);
                intent.putExtra("extra_terms_and_conditions", extra);
                catalogueHomeActivity.startActivity(intent);
            } else {
                if (!(action instanceof CatalogueHomeContract.Action.LaunchCatalogueBrowse)) {
                    throw new NoWhenBranchMatchedException();
                }
                CatalogueBrowseActivity.Extra extra2 = new CatalogueBrowseActivity.Extra(((CatalogueHomeContract.Action.LaunchCatalogueBrowse) action).f6838a);
                Intent intent2 = new Intent(catalogueHomeActivity, (Class<?>) CatalogueBrowseActivity.class);
                intent2.putExtra("extra_catalogue_browse", extra2);
                catalogueHomeActivity.startActivity(intent2);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueHomeActivity$collectActions$1(CatalogueHomeActivity catalogueHomeActivity, Continuation continuation) {
        super(2, continuation);
        this.q = catalogueHomeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CatalogueHomeActivity$collectActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CatalogueHomeActivity$collectActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = CatalogueHomeActivity.E;
            CatalogueHomeActivity catalogueHomeActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, catalogueHomeActivity, CatalogueHomeActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeContract$Action;)V", 4), FlowExtKt.a(catalogueHomeActivity.O4().j, catalogueHomeActivity.getD(), Lifecycle.State.g));
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

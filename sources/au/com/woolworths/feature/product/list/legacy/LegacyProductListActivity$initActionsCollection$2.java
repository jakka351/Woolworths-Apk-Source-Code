package au.com.woolworths.feature.product.list.legacy;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment;
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
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$initActionsCollection$2", f = "LegacyProductListActivity.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LegacyProductListActivity$initActionsCollection$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LegacyProductListActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$initActionsCollection$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ProductListOptionsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ProductListOptionsContract.Actions actions = (ProductListOptionsContract.Actions) obj;
            LegacyProductListActivity legacyProductListActivity = (LegacyProductListActivity) this.d;
            int i = LegacyProductListActivity.D;
            legacyProductListActivity.getClass();
            if (actions instanceof ProductListOptionsContract.Actions.LaunchFilterOptions) {
                String str = ((ProductListOptionsContract.Actions.LaunchFilterOptions) actions).f5330a;
                FragmentManager supportFragmentManager = legacyProductListActivity.getSupportFragmentManager();
                Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
                FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
                fragmentTransactionE.j(com.woolworths.R.id.fragment_container, ProductListOptionsFilterFragment.Companion.a(str), null);
                fragmentTransactionE.c(null);
                fragmentTransactionE.d();
            } else if (actions instanceof ProductListOptionsContract.Actions.SeeResults) {
                ((ProductListViewModel) legacyProductListActivity.A.getD()).W6(((ProductListOptionsContract.Actions.SeeResults) actions).f5332a, true);
                legacyProductListActivity.getSupportFragmentManager().Z(null);
            } else if (!(actions instanceof ProductListOptionsContract.Actions.LaunchMarketplaceHowItWorks) && !(actions instanceof ProductListOptionsContract.Actions.ShowMessage)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyProductListActivity$initActionsCollection$2(LegacyProductListActivity legacyProductListActivity, Continuation continuation) {
        super(2, continuation);
        this.q = legacyProductListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LegacyProductListActivity$initActionsCollection$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LegacyProductListActivity$initActionsCollection$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            LegacyProductListActivity legacyProductListActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, legacyProductListActivity, LegacyProductListActivity.class, "handleProductListOptionsActions", "handleProductListOptionsActions(Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsContract$Actions;)V", 4), FlowExtKt.a(((ProductListOptionsViewModel) legacyProductListActivity.C.getD()).n, legacyProductListActivity.getD(), Lifecycle.State.h));
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

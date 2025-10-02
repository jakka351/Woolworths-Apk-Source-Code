package au.com.woolworths.feature.shop.recipes.freshmag.content.ui;

import android.app.Activity;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContentScreen$3$1", f = "FreshMagContentScreen.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FreshMagContentScreenKt$FreshMagContentScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FreshMagContentViewModel q;
    public final /* synthetic */ Activity r;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/recipes/freshmag/content/presentation/FreshMagContentContract$Action;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContentScreen$3$1$1", f = "FreshMagContentScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.FreshMagContentScreenKt$FreshMagContentScreen$3$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<FreshMagContentContract.Action, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ Activity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, Continuation continuation) {
            super(2, continuation);
            this.q = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((FreshMagContentContract.Action) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            FreshMagContentContract.Action action = (FreshMagContentContract.Action) this.p;
            if (!(action instanceof FreshMagContentContract.Action.SeekPage)) {
                if (!(action instanceof FreshMagContentContract.Action.LaunchCart)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.q.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshMagContentScreenKt$FreshMagContentScreen$3$1(FreshMagContentViewModel freshMagContentViewModel, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.q = freshMagContentViewModel;
        this.r = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FreshMagContentScreenKt$FreshMagContentScreen$3$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FreshMagContentScreenKt$FreshMagContentScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.m;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, null);
            this.p = 1;
            if (FlowKt.h(flow, anonymousClass1, this) == coroutineSingletons) {
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

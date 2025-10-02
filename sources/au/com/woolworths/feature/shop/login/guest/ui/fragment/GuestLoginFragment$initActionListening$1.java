package au.com.woolworths.feature.shop.login.guest.ui.fragment;

import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginContract;
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
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment$initActionListening$1", f = "GuestLoginFragment.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class GuestLoginFragment$initActionListening$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ GuestLoginFragment q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/login/guest/ui/fragment/GuestLoginContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment$initActionListening$1$1", f = "GuestLoginFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.login.guest.ui.fragment.GuestLoginFragment$initActionListening$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<GuestLoginContract.Actions, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ GuestLoginFragment q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GuestLoginFragment guestLoginFragment, Continuation continuation) {
            super(2, continuation);
            this.q = guestLoginFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((GuestLoginContract.Actions) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            GuestLoginContract.Actions actions = (GuestLoginContract.Actions) this.p;
            KProperty[] kPropertyArr = GuestLoginFragment.j;
            GuestLoginFragment guestLoginFragment = this.q;
            if (guestLoginFragment.getD().getD().compareTo(Lifecycle.State.g) >= 0) {
                if (actions instanceof GuestLoginContract.Actions.LaunchSignUp) {
                    guestLoginFragment.Q1();
                    guestLoginFragment.i.a(ActivityNavigatorKt.a(Activities.SignUp.f4536a, ApplicationType.e), null);
                } else if (actions instanceof GuestLoginContract.Actions.LaunchLogIn) {
                    guestLoginFragment.I1();
                    guestLoginFragment.h.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
                } else if (!(actions instanceof GuestLoginContract.Actions.GuestMode)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestLoginFragment$initActionListening$1(GuestLoginFragment guestLoginFragment, Continuation continuation) {
        super(2, continuation);
        this.q = guestLoginFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GuestLoginFragment$initActionListening$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GuestLoginFragment$initActionListening$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            KProperty[] kPropertyArr = GuestLoginFragment.j;
            GuestLoginFragment guestLoginFragment = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(guestLoginFragment, null), ((GuestLoginViewModel) guestLoginFragment.g.getD()).f);
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

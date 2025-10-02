package au.com.woolworths.feature.shop.modeselector.ui;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorContract;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel;
import au.com.woolworths.feature.shop.modeselector.Screens;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorScreen$2$6$1", f = "ModeSelectorScreen.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ModeSelectorScreenKt$ModeSelectorScreen$2$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ModeSelectorViewModel q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ ScaffoldState s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ ManagedActivityResultLauncher u;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/modeselector/ModeSelectorContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorScreen$2$6$1$1", f = "ModeSelectorScreen.kt", l = {140}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorScreenKt$ModeSelectorScreen$2$6$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<ModeSelectorContract.Actions, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ Context r;
        public final /* synthetic */ ScaffoldState s;
        public final /* synthetic */ Function1 t;
        public final /* synthetic */ ManagedActivityResultLauncher u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, ScaffoldState scaffoldState, Function1 function1, ManagedActivityResultLauncher managedActivityResultLauncher, Continuation continuation) {
            super(2, continuation);
            this.r = context;
            this.s = scaffoldState;
            this.t = function1;
            this.u = managedActivityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((ModeSelectorContract.Actions) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ModeSelectorContract.Actions actions = (ModeSelectorContract.Actions) this.q;
                boolean z = actions instanceof ModeSelectorContract.Actions.ResolveDeepLink;
                Context context = this.r;
                if (!z) {
                    if (actions instanceof ModeSelectorContract.Actions.ShowSnackBarMessage) {
                        SnackbarHostState snackbarHostState = this.s.f1319a;
                        String string = ((ModeSelectorContract.Actions.ShowSnackBarMessage) actions).f7517a.getText(context).toString();
                        this.p = 1;
                        if (SnackbarHostState.b(snackbarHostState, string, null, null, this, 6) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (actions instanceof ModeSelectorContract.Actions.OpenMapsApp) {
                        this.t.invoke(((ModeSelectorContract.Actions.OpenMapsApp) actions).f7515a);
                    } else {
                        if (!(actions instanceof ModeSelectorContract.Actions.LaunchLoginScreen)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.u.a(Activities.LogIn.f4485a.b(new Activities.LogIn.Extras.ParentActivityExtras(((ModeSelectorContract.Actions.LaunchLoginScreen) actions).f7514a, 6)), null);
                    }
                    return Unit.f24250a;
                }
                context.startActivity(ShopAppDeepLink.a(Screens.d, ((ModeSelectorContract.Actions.ResolveDeepLink) actions).f7516a));
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeSelectorScreenKt$ModeSelectorScreen$2$6$1(ModeSelectorViewModel modeSelectorViewModel, Context context, ScaffoldState scaffoldState, Function1 function1, ManagedActivityResultLauncher managedActivityResultLauncher, Continuation continuation) {
        super(2, continuation);
        this.q = modeSelectorViewModel;
        this.r = context;
        this.s = scaffoldState;
        this.t = function1;
        this.u = managedActivityResultLauncher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ModeSelectorScreenKt$ModeSelectorScreen$2$6$1(this.q, this.r, this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ModeSelectorScreenKt$ModeSelectorScreen$2$6$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.n;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, null);
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

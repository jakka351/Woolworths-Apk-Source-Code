package au.com.woolworths.feature.shop.account.ui.details;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.account.ui.details.components.AccountDetailsScreenKt;
import au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsContract;
import au.com.woolworths.feature.shop.account.viewmodel.details.AccountDetailsViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/account/ui/details/AccountDetailsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$ViewState;", "viewState", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountDetailsActivity extends Hilt_AccountDetailsActivity {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(AccountDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.account.ui.details.AccountDetailsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.account.ui.details.AccountDetailsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.account.ui.details.AccountDetailsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.account.ui.details.AccountDetailsActivity$onCreate$2", f = "AccountDetailsActivity.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.account.ui.details.AccountDetailsActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/account/viewmodel/details/AccountDetailsContract$Action;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.account.ui.details.AccountDetailsActivity$onCreate$2$1", f = "AccountDetailsActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.account.ui.details.AccountDetailsActivity$onCreate$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<AccountDetailsContract.Action, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ AccountDetailsActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AccountDetailsActivity accountDetailsActivity, Continuation continuation) {
                super(2, continuation);
                this.q = accountDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((AccountDetailsContract.Action) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                AccountDetailsContract.Action action = (AccountDetailsContract.Action) this.p;
                if (!(action instanceof AccountDetailsContract.Action.OpenLink)) {
                    throw new NoWhenBranchMatchedException();
                }
                AccountDetailsContract.Action.OpenLink openLink = (AccountDetailsContract.Action.OpenLink) action;
                String str = openLink.f6596a;
                ArrayList<? extends Parcelable> arrayList = openLink.b;
                int i = AccountDetailsActivity.x;
                Intent intentB = Activities.WebLinkActivity.f4553a.b(str);
                if (arrayList != null) {
                    intentB.putParcelableArrayListExtra("additionalCookies", arrayList);
                }
                this.q.startActivity(intentB);
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AccountDetailsActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                AccountDetailsActivity accountDetailsActivity = AccountDetailsActivity.this;
                SharedFlowImpl sharedFlowImpl = ((AccountDetailsViewModel) accountDetailsActivity.w.getD()).k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(accountDetailsActivity, null);
                this.p = 1;
                if (FlowKt.h(sharedFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    @Override // au.com.woolworths.feature.shop.account.ui.details.Hilt_AccountDetailsActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.details.AccountDetailsActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final AccountDetailsActivity accountDetailsActivity = AccountDetailsActivity.this;
                    final MutableState mutableStateA = FlowExtKt.a(((AccountDetailsViewModel) accountDetailsActivity.w.getD()).i, composer);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-2017264192, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.account.ui.details.AccountDetailsActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            AccountDetailsActivity accountDetailsActivity2 = accountDetailsActivity;
                            ViewModelLazy viewModelLazy = accountDetailsActivity2.w;
                            if ((iIntValue & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                AccountDetailsContract.ViewState viewState = (AccountDetailsContract.ViewState) mutableStateA.getD();
                                OnBackPressedDispatcher f = accountDetailsActivity2.getF();
                                composer2.o(5004770);
                                boolean zI = composer2.I(f);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    AccountDetailsActivity$onCreate$1$1$1$1 accountDetailsActivity$onCreate$1$1$1$1 = new AccountDetailsActivity$onCreate$1$1$1$1(0, f, OnBackPressedDispatcher.class, "onBackPressed", "onBackPressed()V", 0);
                                    composer2.A(accountDetailsActivity$onCreate$1$1$1$1);
                                    objG = accountDetailsActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                AccountDetailsViewModel accountDetailsViewModel = (AccountDetailsViewModel) viewModelLazy.getD();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(accountDetailsViewModel);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new AccountDetailsActivity$onCreate$1$1$2$1(1, accountDetailsViewModel, AccountDetailsViewModel.class, "onButtonClick", "onButtonClick(Lau/com/woolworths/sdui/model/action/ActionData;)V", 0);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG2);
                                AccountDetailsViewModel accountDetailsViewModel2 = (AccountDetailsViewModel) viewModelLazy.getD();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(accountDetailsViewModel2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    AccountDetailsActivity$onCreate$1$1$3$1 accountDetailsActivity$onCreate$1$1$3$1 = new AccountDetailsActivity$onCreate$1$1$3$1(0, accountDetailsViewModel2, AccountDetailsViewModel.class, "fetchAccountDetails", "fetchAccountDetails()V", 0);
                                    composer2.A(accountDetailsActivity$onCreate$1$1$3$1);
                                    objG3 = accountDetailsActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                AccountDetailsScreenKt.a(viewState, function0, function1, (Function0) ((KFunction) objG3), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 466895972));
        ((AccountDetailsViewModel) this.w.getD()).q6();
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
    }
}

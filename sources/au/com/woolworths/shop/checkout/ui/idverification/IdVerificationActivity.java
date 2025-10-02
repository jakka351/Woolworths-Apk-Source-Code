package au.com.woolworths.shop.checkout.ui.idverification;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.checkout.ui.compose.IdVerificationScreenKt;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationContract;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class IdVerificationActivity extends Hilt_IdVerificationActivity {
    public static final /* synthetic */ int y = 0;
    public AnalyticsManager w;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(IdVerificationViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationActivity$Companion;", "", "", "EXTRA_DATA", "Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/checkout/ui/idverification/IdVerificationContract$Action;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity$onCreate$2", f = "IdVerificationActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<IdVerificationContract.Action, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = IdVerificationActivity.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((IdVerificationContract.Action) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            IdVerificationContract.Action action = (IdVerificationContract.Action) this.p;
            int i = IdVerificationActivity.y;
            boolean z = action instanceof IdVerificationContract.Action.VerificationSuccess;
            IdVerificationActivity idVerificationActivity = IdVerificationActivity.this;
            if (z) {
                idVerificationActivity.setResult(-1, new Intent().putExtra("data", ((IdVerificationContract.Action.VerificationSuccess) action).f10796a));
                idVerificationActivity.finish();
            } else {
                if (!(action instanceof IdVerificationContract.Action.VerificationFailed)) {
                    throw new NoWhenBranchMatchedException();
                }
                idVerificationActivity.setResult(-1, new Intent().putExtra("data", ((IdVerificationContract.Action.VerificationFailed) action).f10795a));
                idVerificationActivity.finish();
            }
            return Unit.f24250a;
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.idverification.Hilt_IdVerificationActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewModelLazy viewModelLazy = this.x;
        ((IdVerificationViewModel) viewModelLazy.getD()).q6();
        AnalyticsManager analyticsManager = this.w;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        analyticsManager.a(IdVerificationScreens.d);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final IdVerificationActivity idVerificationActivity = IdVerificationActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-417642525, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.idverification.IdVerificationActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = IdVerificationActivity.y;
                                IdVerificationActivity idVerificationActivity2 = idVerificationActivity;
                                IdVerificationViewModel idVerificationViewModel = (IdVerificationViewModel) idVerificationActivity2.x.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(idVerificationActivity2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new c(idVerificationActivity2, 8);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                IdVerificationScreenKt.a(idVerificationViewModel, (Function0) objG, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1452851499));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), FlowExtKt.a(((IdVerificationViewModel) viewModelLazy.getD()).j, getD(), Lifecycle.State.h)), LifecycleOwnerKt.a(this));
    }
}

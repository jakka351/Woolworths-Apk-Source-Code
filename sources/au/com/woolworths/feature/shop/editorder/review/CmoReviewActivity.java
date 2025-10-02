package au.com.woolworths.feature.shop.editorder.review;

import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.editorder.review.CmoReviewContract;
import au.com.woolworths.feature.shop.editorder.review.components.CmoReviewScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState;", "viewState", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CmoReviewActivity extends Hilt_CmoReviewActivity {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(CmoReviewViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.editorder.review.CmoReviewActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.editorder.review.CmoReviewActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.editorder.review.CmoReviewActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Override // au.com.woolworths.feature.shop.editorder.review.Hilt_CmoReviewActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.editorder.review.CmoReviewActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final CmoReviewActivity cmoReviewActivity = CmoReviewActivity.this;
                    final MutableState mutableStateA = FlowExtKt.a(((CmoReviewViewModel) cmoReviewActivity.w.getD()).h, composer);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-240725475, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.editorder.review.CmoReviewActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            CmoReviewActivity cmoReviewActivity2 = cmoReviewActivity;
                            ViewModelLazy viewModelLazy = cmoReviewActivity2.w;
                            if ((iIntValue & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                CmoReviewContract.ViewState viewState = (CmoReviewContract.ViewState) mutableStateA.getD();
                                SharedFlowImpl sharedFlowImpl = ((CmoReviewViewModel) viewModelLazy.getD()).j;
                                CmoReviewViewModel cmoReviewViewModel = (CmoReviewViewModel) viewModelLazy.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(cmoReviewViewModel);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    CmoReviewActivity$onCreate$1$1$1$1 cmoReviewActivity$onCreate$1$1$1$1 = new CmoReviewActivity$onCreate$1$1$1$1(1, cmoReviewViewModel, CmoReviewViewModel.class, "onEvent", "onEvent(Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent;)V", 0);
                                    composer2.A(cmoReviewActivity$onCreate$1$1$1$1);
                                    objG = cmoReviewActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG);
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(cmoReviewActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new CmoReviewActivity$onCreate$1$1$2$1(1, cmoReviewActivity2, CmoReviewActivity.class, "handleNavigation", "handleNavigation(Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType;)V", 0);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                CmoReviewScreenKt.a(viewState, sharedFlowImpl, function1, (Function1) ((KFunction) objG2), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -309203263));
        CmoReviewViewModel cmoReviewViewModel = (CmoReviewViewModel) this.w.getD();
        BuildersKt.c(ViewModelKt.a(cmoReviewViewModel), null, null, new CmoReviewViewModel$fetchSummary$1(cmoReviewViewModel, null), 3);
        OnBackPressedDispatcherKt.a(getD(), this, new l(this, 21), 2);
    }
}

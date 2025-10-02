package au.com.woolworths.feature.shop.voc.freetext;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.voc.data.SurveySubmitData;
import au.com.woolworths.feature.shop.voc.freetext.VocFreeTextContract;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextContract$ViewState;", "viewState", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VocFreeTextActivity extends Hilt_VocFreeTextActivity {
    public static final /* synthetic */ int y = 0;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(VocFreeTextViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextActivity$Companion;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity$onCreate$2", f = "VocFreeTextActivity.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity$onCreate$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<VocFreeTextContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                VocFreeTextActivity vocFreeTextActivity = (VocFreeTextActivity) this.d;
                int i = VocFreeTextActivity.y;
                if (!(((VocFreeTextContract.Actions) obj) instanceof VocFreeTextContract.Actions.DismissUi)) {
                    vocFreeTextActivity.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                vocFreeTextActivity.setResult(-1);
                vocFreeTextActivity.finish();
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return VocFreeTextActivity.this.new AnonymousClass2(continuation);
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
                int i2 = VocFreeTextActivity.y;
                VocFreeTextActivity vocFreeTextActivity = VocFreeTextActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, vocFreeTextActivity, VocFreeTextActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/voc/freetext/VocFreeTextContract$Actions;)V", 4), vocFreeTextActivity.O4().i);
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

    public final VocFreeTextViewModel O4() {
        return (VocFreeTextViewModel) this.x.getD();
    }

    @Override // au.com.woolworths.feature.shop.voc.freetext.Hilt_VocFreeTextActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = VocFreeTextActivity.y;
                    final VocFreeTextActivity vocFreeTextActivity = VocFreeTextActivity.this;
                    final MutableState mutableStateA = FlowExtKt.a(vocFreeTextActivity.O4().h, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1861871668, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                VocFreeTextContract.ViewState viewState = (VocFreeTextContract.ViewState) mutableStateA.getD();
                                composer2.o(5004770);
                                VocFreeTextActivity vocFreeTextActivity2 = vocFreeTextActivity;
                                boolean zI = composer2.I(vocFreeTextActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new a(vocFreeTextActivity2, 0);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(vocFreeTextActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new b(vocFreeTextActivity2, 2);
                                    composer2.A(objG2);
                                }
                                Function0 function0 = (Function0) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(vocFreeTextActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    VocFreeTextActivity$onCreate$1$1$3$1 vocFreeTextActivity$onCreate$1$1$3$1 = new VocFreeTextActivity$onCreate$1$1$3$1(0, vocFreeTextActivity2, VocFreeTextActivity.class, "finish", "finish()V", 0);
                                    composer2.A(vocFreeTextActivity$onCreate$1$1$3$1);
                                    objG3 = vocFreeTextActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                VocFreeTextScreenKt.b(viewState, function1, function0, (Function0) ((KFunction) objG3), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 237833596));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        Activities.VocFreeText.Extras extras = (Activities.VocFreeText.Extras) IntentCompat.a(getIntent(), "EXTRA_DATA", Activities.VocFreeText.Extras.class);
        if (extras != null) {
            O4().j = new SurveySubmitData(extras.d, extras.e, extras.f, extras.g);
            O4().k = Integer.valueOf(extras.h);
        }
    }
}

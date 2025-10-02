package au.com.woolworths.sdui.rewards.appmodal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalContract;
import au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalInternalLinkResult;
import au.com.woolworths.sdui.rewards.appmodal.ui.AppModalScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Function;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "InternalExtras", "Companion", "Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$ViewState;", "viewState", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsAppModalActivity extends Hilt_RewardsAppModalActivity {
    public static final /* synthetic */ int x = 0;
    public final ViewModelLazy w = new ViewModelLazy(Reflection.f24268a.b(RewardsAppModalViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalActivity$Companion;", "", "", "ExtraInternalData", "Ljava/lang/String;", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalActivity$InternalExtras;", "Landroid/os/Parcelable;", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InternalExtras implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InternalExtras> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InternalExtras> {
            @Override // android.os.Parcelable.Creator
            public final InternalExtras createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new InternalExtras(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InternalExtras[] newArray(int i) {
                return new InternalExtras[i];
            }
        }

        public InternalExtras(String content) {
            Intrinsics.h(content, "content");
            this.d = content;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InternalExtras) && Intrinsics.c(this.d, ((InternalExtras) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return YU.a.h("InternalExtras(content=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalActivity$onCreate$1", f = "RewardsAppModalActivity.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalActivity$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C02321 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ RewardsAppModalActivity d;

            public C02321(RewardsAppModalActivity rewardsAppModalActivity) {
                this.d = rewardsAppModalActivity;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, RewardsAppModalActivity.class, "handleAction", "handleAction(Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$Actions;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                RewardsAppModalContract.Actions actions = (RewardsAppModalContract.Actions) obj;
                int i = RewardsAppModalActivity.x;
                RewardsAppModalActivity rewardsAppModalActivity = this.d;
                if (rewardsAppModalActivity.getD().getD().compareTo(Lifecycle.State.h) >= 0) {
                    if (actions instanceof RewardsAppModalContract.Actions.Finish) {
                        rewardsAppModalActivity.finish();
                    } else {
                        if (!(actions instanceof RewardsAppModalContract.Actions.DisplayNotificationsPermissionsDialog)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ContextExtKt.e(rewardsAppModalActivity, ((RewardsAppModalContract.Actions.DisplayNotificationsPermissionsDialog) actions).f10010a);
                    }
                }
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                return Unit.f24250a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsAppModalActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = RewardsAppModalActivity.x;
                RewardsAppModalActivity rewardsAppModalActivity = RewardsAppModalActivity.this;
                Flow flowA = FlowExtKt.a(rewardsAppModalActivity.N4().i, rewardsAppModalActivity.getD(), Lifecycle.State.h);
                C02321 c02321 = new C02321(rewardsAppModalActivity);
                this.p = 1;
                if (((ChannelFlow) flowA).collect(c02321, this) == coroutineSingletons) {
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

    public final RewardsAppModalViewModel N4() {
        return (RewardsAppModalViewModel) this.w.getD();
    }

    @Override // au.com.woolworths.sdui.rewards.appmodal.Hilt_RewardsAppModalActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        RewardsAppModalInternalLinkResult failure;
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        Intent intent = getIntent();
        Intrinsics.g(intent, "getIntent(...)");
        InternalExtras internalExtras = (InternalExtras) IntentCompat.a(intent, "Extras.internalData", InternalExtras.class);
        String str = internalExtras != null ? internalExtras.d : null;
        if (str != null) {
            RewardsAppModalViewModel rewardsAppModalViewModelN4 = N4();
            RewardsAppModalInteractor rewardsAppModalInteractor = rewardsAppModalViewModelN4.e;
            rewardsAppModalInteractor.getClass();
            try {
                failure = new RewardsAppModalInternalLinkResult.Success((RewardsAppModalData) rewardsAppModalInteractor.c.b(RewardsAppModalData.INSTANCE.serializer(), str));
            } catch (SerializationException e) {
                failure = new RewardsAppModalInternalLinkResult.Failure(e);
            } catch (IllegalArgumentException e2) {
                failure = new RewardsAppModalInternalLinkResult.Failure(e2);
            }
            if (failure instanceof RewardsAppModalInternalLinkResult.Success) {
                rewardsAppModalViewModelN4.f.a();
                MutableStateFlow mutableStateFlow = rewardsAppModalViewModelN4.j;
                ((RewardsAppModalContract.ViewState) mutableStateFlow.getValue()).getClass();
                RewardsAppModalData rewardsAppModalData = ((RewardsAppModalInternalLinkResult.Success) failure).f10015a;
                mutableStateFlow.setValue(new RewardsAppModalContract.ViewState(rewardsAppModalData));
                AnalyticsData analyticsData = rewardsAppModalData.h;
                if (analyticsData != null) {
                    rewardsAppModalViewModelN4.g.g(AnalyticsDataKt.a(analyticsData));
                }
            } else {
                if (!(failure instanceof RewardsAppModalInternalLinkResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                Bark.Companion companion = Bark.f8483a;
                Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.d), "Failed to parse rewards app modal internal link: " + ((RewardsAppModalInternalLinkResult.Failure) failure).f10014a, null);
                BuildersKt.c(ViewModelKt.a(rewardsAppModalViewModelN4), null, null, new RewardsAppModalViewModel$processRewardsAppModalInternalLinkResult$1(rewardsAppModalViewModelN4, null), 3);
            }
        }
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalActivity.onCreate.3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit unit;
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue() & 3;
                Unit unit2 = Unit.f24250a;
                if (iIntValue == 2 && composer.c()) {
                    composer.j();
                    return unit2;
                }
                int i = RewardsAppModalActivity.x;
                final RewardsAppModalActivity rewardsAppModalActivity = RewardsAppModalActivity.this;
                final RewardsAppModalData rewardsAppModalData2 = ((RewardsAppModalContract.ViewState) androidx.lifecycle.compose.FlowExtKt.a(rewardsAppModalActivity.N4().k, composer).getD()).f10012a;
                if (rewardsAppModalData2 == null) {
                    unit = null;
                } else {
                    CoreThemeKt.b(6, composer, ComposableLambdaKt.c(-378468889, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.sdui.rewards.appmodal.RewardsAppModalActivity$onCreate$3$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                final RewardsAppModalActivity rewardsAppModalActivity2 = rewardsAppModalActivity;
                                boolean zI = composer2.I(rewardsAppModalActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new Function0() { // from class: au.com.woolworths.sdui.rewards.appmodal.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            rewardsAppModalActivity2.finish();
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(rewardsAppModalActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new b(rewardsAppModalActivity2, 0);
                                    composer2.A(objG2);
                                }
                                Function1 function1 = (Function1) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(rewardsAppModalActivity2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new b(rewardsAppModalActivity2, 1);
                                    composer2.A(objG3);
                                }
                                composer2.l();
                                RewardsAppModalData.Companion companion2 = RewardsAppModalData.INSTANCE;
                                AppModalScreenKt.a(rewardsAppModalData2, function0, function1, (Function1) objG3, composer2, 8);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                    unit = unit2;
                }
                if (unit == null) {
                    rewardsAppModalActivity.finish();
                }
                return unit2;
            }
        }, true, -1106931842));
    }
}

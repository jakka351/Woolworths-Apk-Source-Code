package au.com.woolworths.android.onesite.modules.main;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.homepage.HomepageAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.appdata.AppBuildConfig;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.main.MainContract;
import au.com.woolworths.android.onesite.modules.main.UnreadMessagesInfo;
import au.com.woolworths.android.onesite.modules.main.tooltip.CollectionModeHeaderActions;
import au.com.woolworths.android.onesite.modules.main.tooltip.CollectionModeHeaderCoachMark;
import au.com.woolworths.android.onesite.modules.main.tooltip.InstoreModeReminderCoachmark;
import au.com.woolworths.android.onesite.notification.WowNotificationManager;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentWindowContainer;
import au.com.woolworths.feature.shop.homepage.data.HomeFulfilmentWindowState;
import au.com.woolworths.feature.shop.homepage.data.HomepageFulfilmentOrientation;
import au.com.woolworths.feature.shop.homepage.data.ModeSelectorSubHeaderData;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.inbox.InboxFeature;
import au.com.woolworths.feature.shop.inbox.tracking.InboxSwrveEvent;
import au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl;
import au.com.woolworths.feature.shop.more.newbadge.NewBadgeInteractor;
import au.com.woolworths.feature.shop.more.newbadge.NewBadgeRepository;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesDetailsInteractor;
import au.com.woolworths.foundation.appcomms.inbox.client.InboxClient;
import au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage;
import au.com.woolworths.foundation.force.upgrade.data.SoftUpgradeAlertBanner;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler;
import au.com.woolworths.foundation.shop.editorder.analytics.EditOrderActions;
import au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingInteractorImpl;
import au.com.woolworths.foundation.shop.onboarding.data.OnboardingRepository;
import au.com.woolworths.foundation.swrve.tracking.impl.SwrveEventTrackerImpl;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/notification/WowNotificationManager$NotificationListener;", "Lau/com/woolworths/android/onesite/modules/main/CollectionModeHeaderInterface;", "Lau/com/woolworths/base/shopapp/modules/button/ButtonClickHandler;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderEventHandler;", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MainViewModel extends ViewModel implements WowNotificationManager.NotificationListener, CollectionModeHeaderInterface, ButtonClickHandler, EditOrderEventHandler {
    public final ArrayList A;
    public boolean B;
    public final MutableStateFlow C;
    public final Flow D;
    public final MutableStateFlow E;
    public final StateFlow F;
    public final StateFlow G;
    public MainContract.FulfilmentWindowInfo H;
    public final FeatureToggleManager e;
    public final PreferencesManager f;
    public final WowNotificationManager g;
    public final CollectionModeInteractor h;
    public final GuestLoginInteractorImpl i;
    public final ShopAccountInteractor j;
    public final ShopAppRegionInteractor k;
    public final NewBadgeInteractor l;
    public final OnboardingInteractorImpl m;
    public final SwrveEventTrackerImpl n;
    public final AnalyticsManager o;
    public final InstorePresenceInteractor p;
    public final CartUpdateInteractor q;
    public final PreferencesDetailsInteractor r;
    public final AppBuildConfig s;
    public final AppConfigClientImpl t;
    public final MutableLiveData u;
    public final PublishSubject v;
    public final MutableLiveData w;
    public final PublishSubject x;
    public final CompositeDisposable y;
    public boolean z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$1", f = "MainViewModel.kt", l = {252}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.main.MainViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final MainViewModel mainViewModel = MainViewModel.this;
                StateFlow stateFlow = mainViewModel.F;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.android.onesite.modules.main.MainViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        ((Boolean) obj2).getClass();
                        MainViewModel mainViewModel2 = mainViewModel;
                        MainViewModel.q6(mainViewModel2, false, null, new e(mainViewModel2, 1), 11);
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (stateFlow.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$2", f = "MainViewModel.kt", l = {267}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.main.MainViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final MainViewModel mainViewModel = MainViewModel.this;
                StateFlow stateFlow = mainViewModel.G;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.android.onesite.modules.main.MainViewModel.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        MainViewModel mainViewModel2 = mainViewModel;
                        if (mainViewModel2.B) {
                            mainViewModel2.A6();
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (stateFlow.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$3", f = "MainViewModel.kt", l = {278}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.main.MainViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/auth/ShopAccountInteractor$LoginDetails;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$3$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.android.onesite.modules.main.MainViewModel$3$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<ShopAccountInteractor.LoginDetails, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ MainViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainViewModel mainViewModel, Continuation continuation) {
                super(2, continuation);
                this.q = mainViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ShopAccountInteractor.LoginDetails) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                if (((ShopAccountInteractor.LoginDetails) this.p).f10229a) {
                    this.q.E.setValue(null);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                MainViewModel mainViewModel = MainViewModel.this;
                Flow flow = mainViewModel.j.m;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(mainViewModel, null);
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$4", f = "MainViewModel.kt", l = {287}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.main.MainViewModel$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public MainViewModel p;
        public ArrayList q;
        public int r;

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainViewModel.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MainViewModel mainViewModel;
            ArrayList arrayList;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.r;
            if (i == 0) {
                ResultKt.b(obj);
                mainViewModel = MainViewModel.this;
                ArrayList arrayList2 = mainViewModel.A;
                this.p = mainViewModel;
                this.q = arrayList2;
                this.r = 1;
                Object objP6 = MainViewModel.p6(mainViewModel, arrayList2, this);
                if (objP6 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList = arrayList2;
                obj = objP6;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = this.q;
                mainViewModel = this.p;
                ResultKt.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                arrayList.add(new InstoreModeReminderCoachmark());
                MainViewModel.q6(mainViewModel, false, null, null, 15);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$5", f = "MainViewModel.kt", l = {296, 296}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.main.MainViewModel$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "softUpgradeAlertBanner", "Lau/com/woolworths/foundation/force/upgrade/data/SoftUpgradeAlertBanner;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$5$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.android.onesite.modules.main.MainViewModel$5$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<SoftUpgradeAlertBanner, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ MainViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainViewModel mainViewModel, Continuation continuation) {
                super(2, continuation);
                this.q = mainViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((SoftUpgradeAlertBanner) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                SoftUpgradeAlertBanner softUpgradeAlertBanner = (SoftUpgradeAlertBanner) this.p;
                MainViewModel mainViewModel = this.q;
                mainViewModel.C.setValue(softUpgradeAlertBanner);
                MainViewModel.q6(mainViewModel, false, null, null, 15);
                return Unit.f24250a;
            }
        }

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainViewModel.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.h((kotlinx.coroutines.flow.Flow) r6, r1, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r5.p
                au.com.woolworths.android.onesite.modules.main.MainViewModel r2 = au.com.woolworths.android.onesite.modules.main.MainViewModel.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                kotlin.ResultKt.b(r6)
                goto L41
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.ResultKt.b(r6)
                goto L30
            L1e:
                kotlin.ResultKt.b(r6)
                au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl r6 = r2.t
                r5.p = r4
                au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl r6 = r6.b
                androidx.datastore.core.DataStore r6 = r6.b
                kotlinx.coroutines.flow.Flow r6 = r6.getD()
                if (r6 != r0) goto L30
                goto L40
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                au.com.woolworths.android.onesite.modules.main.MainViewModel$5$1 r1 = new au.com.woolworths.android.onesite.modules.main.MainViewModel$5$1
                r4 = 0
                r1.<init>(r2, r4)
                r5.p = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.h(r6, r1, r5)
                if (r6 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r6 = kotlin.Unit.f24250a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.main.MainViewModel.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainViewModel$Companion;", "", "", "MODE_REPLACEMENT_PICKUP_INSTORE", "Ljava/lang/String;", "MODE_REPLACEMENT_DIRECT_TO_BOOT", "", "MIN_UNREAD_MESSAGES_TO_SHOW_BADGE", "I", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4365a;

        static {
            int[] iArr = new int[HomePageContract.DeliveryNowViewState.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HomePageContract.DeliveryNowViewState deliveryNowViewState = HomePageContract.DeliveryNowViewState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4365a = iArr;
            int[] iArr2 = new int[HomepageFulfilmentOrientation.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                HomepageFulfilmentOrientation homepageFulfilmentOrientation = HomepageFulfilmentOrientation.d;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[HomepageChips.values().length];
            try {
                iArr3[HomepageChips.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[HomepageChips.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[HomepageChips.k.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public MainViewModel(FeatureToggleManager featureToggleManager, PreferencesManager preferencesManager, WowNotificationManager notificationManager, CollectionModeInteractor collectionModeInteractor, GuestLoginInteractorImpl guestLoginInteractorImpl, ShopAccountInteractor accountInteractor, ShopAppRegionInteractor shopAppRegionInteractor, NewBadgeInteractor newBadgeInteractor, OnboardingInteractorImpl onboardingInteractorImpl, SwrveEventTrackerImpl swrveEventTrackerImpl, AnalyticsManager analyticsManager, InstorePresenceInteractor instorePresenceInteractor, CartUpdateInteractor cartUpdateInteractor, PreferencesDetailsInteractor preferencesDetailsInteractor, AppBuildConfig appBuildConfig, AppConfigClientImpl appConfigClientImpl, InboxClient inboxClient) {
        OnboardingRepository onboardingRepository;
        NewBadgeRepository newBadgeRepository = newBadgeInteractor.f7631a;
        OnboardingRepository onboardingRepository2 = onboardingInteractorImpl.f8864a;
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(notificationManager, "notificationManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(instorePresenceInteractor, "instorePresenceInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(preferencesDetailsInteractor, "preferencesDetailsInteractor");
        Intrinsics.h(appBuildConfig, "appBuildConfig");
        Intrinsics.h(inboxClient, "inboxClient");
        this.e = featureToggleManager;
        this.f = preferencesManager;
        this.g = notificationManager;
        this.h = collectionModeInteractor;
        this.i = guestLoginInteractorImpl;
        this.j = accountInteractor;
        this.k = shopAppRegionInteractor;
        this.l = newBadgeInteractor;
        this.m = onboardingInteractorImpl;
        this.n = swrveEventTrackerImpl;
        this.o = analyticsManager;
        this.p = instorePresenceInteractor;
        this.q = cartUpdateInteractor;
        this.r = preferencesDetailsInteractor;
        this.s = appBuildConfig;
        this.t = appConfigClientImpl;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.u = mutableLiveData;
        PublishSubject publishSubject = new PublishSubject();
        this.v = publishSubject;
        this.w = mutableLiveData;
        this.x = publishSubject;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.y = compositeDisposable;
        this.A = new ArrayList();
        MainActivity.R.getClass();
        this.C = StateFlowKt.a(null);
        final ChannelFlowTransformLatest channelFlowTransformLatestD = inboxClient.d(false);
        Flow<List<? extends InboxMessage>> flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new Flow<List<? extends InboxMessage>>() { // from class: au.com.woolworths.android.onesite.modules.main.MainViewModel$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.android.onesite.modules.main.MainViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$special$$inlined$map$1$2", f = "MainViewModel.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.android.onesite.modules.main.MainViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof au.com.woolworths.android.onesite.modules.main.MainViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        au.com.woolworths.android.onesite.modules.main.MainViewModel$special$$inlined$map$1$2$1 r0 = (au.com.woolworths.android.onesite.modules.main.MainViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.android.onesite.modules.main.MainViewModel$special$$inlined$map$1$2$1 r0 = new au.com.woolworths.android.onesite.modules.main.MainViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r7)
                        goto L63
                    L27:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L2f:
                        kotlin.ResultKt.b(r7)
                        au.com.woolworths.foundation.appcomms.inbox.client.model.InboxFeed r6 = (au.com.woolworths.foundation.appcomms.inbox.client.model.InboxFeed) r6
                        java.util.List r6 = r6.getF8439a()
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.ArrayList r7 = new java.util.ArrayList
                        r7.<init>()
                        java.util.Iterator r6 = r6.iterator()
                    L43:
                        boolean r2 = r6.hasNext()
                        if (r2 == 0) goto L58
                        java.lang.Object r2 = r6.next()
                        r4 = r2
                        au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage r4 = (au.com.woolworths.foundation.appcomms.inbox.client.model.InboxMessage) r4
                        boolean r4 = r4.j
                        if (r4 != 0) goto L43
                        r7.add(r2)
                        goto L43
                    L58:
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r5.d
                        java.lang.Object r6 = r6.emit(r7, r0)
                        if (r6 != r1) goto L63
                        return r1
                    L63:
                        kotlin.Unit r6 = kotlin.Unit.f24250a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.main.MainViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = channelFlowTransformLatestD.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        };
        if (!accountInteractor.d() && featureToggleManager.c(BaseShopAppFeature.s)) {
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new MainViewModel$unreadNotificationMessages$2$1(2, null), flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1);
        }
        this.D = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.E = mutableStateFlowA;
        this.F = FlowKt.O(FlowKt.l(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, mutableStateFlowA, new MainViewModel$hasUnreadMessages$1(this, null)), ViewModelKt.a(this), SharingStarted.Companion.a(3), Boolean.FALSE);
        this.G = FlowKt.O(FlowKt.l(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, mutableStateFlowA, new MainViewModel$unreadMessagesInfo$1(this, null)), ViewModelKt.a(this), SharingStarted.Companion.a(3), UnreadMessagesInfo.None.f4370a);
        long j = newBadgeRepository.f7632a.getLong("badge_time_stamp_key", 0L);
        if ((j == 0 ? null : Long.valueOf(j)) == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor editorEdit = newBadgeRepository.f7632a.edit();
            editorEdit.putLong("badge_time_stamp_key", jCurrentTimeMillis);
            editorEdit.apply();
        }
        if (preferencesManager.c()) {
            onboardingRepository = onboardingRepository2;
            androidx.constraintlayout.core.state.a.v(onboardingRepository.f8865a, "shopping_mode_coach_mark_key", true);
        } else {
            onboardingRepository = onboardingRepository2;
        }
        if (!accountInteractor.S()) {
            MaybeFlatMapCompletable maybeFlatMapCompletableD = guestLoginInteractorImpl.d();
            MainViewModel$loginAsGuestIfNeeded$1 mainViewModel$loginAsGuestIfNeeded$1 = new MainViewModel$loginAsGuestIfNeeded$1();
            maybeFlatMapCompletableD.a(mainViewModel$loginAsGuestIfNeeded$1);
            DisposableKt.a(compositeDisposable, mainViewModel$loginAsGuestIfNeeded$1);
        }
        ArrayList arrayList = new ArrayList();
        if (!onboardingRepository.f8865a.getBoolean("collection_mode_header_coach_mark_key", false)) {
            arrayList.add(new CollectionModeHeaderCoachMark());
        }
        this.A = arrayList;
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass2(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass3(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass4(null), 3);
        if (featureToggleManager.c(BaseShopAppFeature.Y)) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass5(null), 3);
        }
        this.H = new MainContract.FulfilmentWindowInfo(null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.android.onesite.modules.main.MainViewModel r5, java.util.ArrayList r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor r0 = r5.p
            boolean r1 = r7 instanceof au.com.woolworths.android.onesite.modules.main.MainViewModel$canAddInstoreModeReminderCoachmark$1
            if (r1 == 0) goto L15
            r1 = r7
            au.com.woolworths.android.onesite.modules.main.MainViewModel$canAddInstoreModeReminderCoachmark$1 r1 = (au.com.woolworths.android.onesite.modules.main.MainViewModel$canAddInstoreModeReminderCoachmark$1) r1
            int r2 = r1.r
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.r = r2
            goto L1a
        L15:
            au.com.woolworths.android.onesite.modules.main.MainViewModel$canAddInstoreModeReminderCoachmark$1 r1 = new au.com.woolworths.android.onesite.modules.main.MainViewModel$canAddInstoreModeReminderCoachmark$1
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.r
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            kotlin.ResultKt.b(r7)
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r7)
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L60
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r5 = r5.h
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r5 = r5.w()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode$InStore r6 = au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode.InStore.d
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            boolean r5 = r0.b()
            if (r5 == 0) goto L60
            r1.r = r4
            java.lang.Object r7 = r0.j(r1)
            if (r7 != r2) goto L57
            return r2
        L57:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 != 0) goto L60
            goto L61
        L60:
            r4 = 0
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.main.MainViewModel.p6(au.com.woolworths.android.onesite.modules.main.MainViewModel, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void q6(MainViewModel mainViewModel, boolean z, Screen screen, Function0 function0, int i) {
        Screen screen2;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            MainContract.ViewState viewState = (MainContract.ViewState) mainViewModel.u.e();
            if (viewState == null || (screen2 = viewState.d) == null) {
                screen2 = ((MainContract.MainPage.HOME) MainActivity.R).i;
            }
            screen = screen2;
        }
        Screen screen3 = screen;
        if ((i & 4) != 0) {
            function0 = new e(mainViewModel, 0);
        }
        Function0 function02 = function0;
        MainContract.ViewState viewState2 = (MainContract.ViewState) mainViewModel.u.e();
        UpgradeConfig upgradeConfig = viewState2 != null ? viewState2.i : null;
        mainViewModel.getClass();
        BuildersKt.c(ViewModelKt.a(mainViewModel), null, null, new MainViewModel$generateState$2(function02, mainViewModel, z2, screen3, upgradeConfig, null), 3);
    }

    public final void A6() {
        if (Intrinsics.c(this.G.getValue(), UnreadMessagesInfo.None.f4370a)) {
            return;
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new MainViewModel$trackUnreadMessagesImpression$1(this, null), 3);
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void F3(Text text) {
        CartUpdateInteractor cartUpdateInteractor = this.q;
        cartUpdateInteractor.f = 0L;
        BuildersKt.c(ViewModelKt.a(this), null, null, new MainViewModel$refreshCartCount$1$1(cartUpdateInteractor, null), 3);
        MainContract.ViewState viewState = (MainContract.ViewState) this.w.e();
        Screen screen = viewState != null ? viewState.d : null;
        if (screen == null) {
            throw new IllegalArgumentException("viewState should not be null");
        }
        this.o.c(new EditOrderActions.CancellationSuccess(screen));
        MainContract.Actions.ShowSnackbarMessage showSnackbarMessage = new MainContract.Actions.ShowSnackbarMessage(text);
        PublishSubject publishSubject = this.v;
        publishSubject.onNext(showSnackbarMessage);
        publishSubject.onNext(MainContract.Actions.RefreshCurrentFragment.f4351a);
        q6(this, false, null, null, 14);
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void F4() {
        this.o.c(new EditOrderActions.ConfirmCancellationWarningDialog(Screens.l));
        q6(this, true, null, null, 14);
    }

    @Override // au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler
    public final void O2(Button data) {
        MainActivityActions mainActivityActions;
        Intrinsics.h(data, "data");
        String url = data.getUrl();
        if (url == null) {
            throw new IllegalStateException(YU.a.A("Deeplink URL missing for upfront fulfilment in mode ", this.h.w().getModeName()));
        }
        Object objE = this.w.e();
        if (objE == null) {
            throw new IllegalArgumentException("Fulfilment window button clicked but ViewState is null");
        }
        MainContract.ViewState viewState = (MainContract.ViewState) objE;
        MainContract.FulfilmentWindowInfo fulfilmentWindowInfo = viewState.e.g;
        if (fulfilmentWindowInfo == null) {
            throw new IllegalArgumentException("Fulfilment window button clicked but there is no header info");
        }
        if (fulfilmentWindowInfo.f4360a != null) {
            mainActivityActions = MainActivityActions.l;
        } else {
            if (fulfilmentWindowInfo.b == null) {
                throw new IllegalStateException("Fulfilment button is clicked but no fulfilment info present");
            }
            mainActivityActions = MainActivityActions.j;
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, "Upfront Fulfilment");
        Screen screen = viewState.d;
        mainActivityActions.getClass();
        Intrinsics.h(screen, "<set-?>");
        mainActivityActions.d = screen;
        this.o.j(mainActivityActions, trackingMetadataA);
        this.v.onNext(new MainContract.Actions.LaunchDeepLink(url));
    }

    @Override // au.com.woolworths.android.onesite.notification.WowNotificationManager.NotificationListener
    public final void S4(NotificationResult.Notification notification) {
        Intrinsics.h(notification, "notification");
        String contentType = notification.getContentType();
        Intrinsics.g(contentType, "getContentType(...)");
        Locale locale = Locale.ROOT;
        String strM = androidx.constraintlayout.core.state.a.m(locale, "ROOT", contentType, locale, "toLowerCase(...)");
        int iHashCode = strM.hashCode();
        PublishSubject publishSubject = this.v;
        if (iHashCode == -139919088) {
            if (strM.equals(NotificationResult.Notification.CAMPAIGN)) {
                publishSubject.onNext(new MainContract.Actions.NotifyCampaign(notification));
            }
        } else if (iHashCode != 92899676) {
            if (iHashCode != 1124446108) {
                return;
            }
            strM.equals(NotificationResult.Notification.WARNING);
        } else if (strM.equals("alert")) {
            publishSubject.onNext(new MainContract.Actions.NotifyAlert(notification));
        }
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void c6() {
        this.o.c(new EditOrderActions.CancellationWarmingDialogImpression(Screens.l));
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void k1() {
        this.o.c(new EditOrderActions.CancelEditModeClick(Screens.l));
    }

    @Override // au.com.woolworths.android.onesite.modules.main.CollectionModeHeaderInterface
    public final void m3() {
        Screen screen;
        MainContract.ViewState viewState = (MainContract.ViewState) this.w.e();
        if (viewState == null || (screen = viewState.d) == null) {
            return;
        }
        CollectionModeHeaderActions collectionModeHeaderActions = CollectionModeHeaderActions.e;
        collectionModeHeaderActions.getClass();
        collectionModeHeaderActions.d = screen;
        this.o.j(collectionModeHeaderActions, TrackingMetadata.Companion.a(TrackableValue.o0, "Upfront Fulfilment"));
        this.v.onNext(new MainContract.Actions.ShowCollectionModeSelectorScreen(null));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.y.e();
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void q0() {
        this.o.c(new EditOrderActions.CloseCancellationWarningDialog(Screens.l));
    }

    public final MainContract.HeaderInfo r6() {
        ResText resText = new ResText(R.string.navigation_home_title);
        MainContract.SearchConfiguration searchConfiguration = ((MainContract.MainPage.HOME) MainActivity.R).k;
        HomePageContract.DeliveryNowViewState deliveryNowViewState = HomePageContract.DeliveryNowViewState.d;
        return new MainContract.HeaderInfo(resText, 0, t6(), searchConfiguration, MainContract.SpeechBubbleInfo.c, null, deliveryNowViewState, null);
    }

    public final MainContract.FulfilmentWindowInfo s6(MainContract.MainPage mainPage) {
        if (!mainPage.getM()) {
            return null;
        }
        MainContract.FulfilmentWindowInfo fulfilmentWindowInfo = this.H;
        HomeFulfilmentWindowState homeFulfilmentWindowState = fulfilmentWindowInfo.f4360a;
        ModeSelectorSubHeaderData modeSelectorSubHeaderData = fulfilmentWindowInfo.c;
        FulfilmentWindowContainer fulfilmentWindowContainer = fulfilmentWindowInfo.b;
        if (homeFulfilmentWindowState == null && fulfilmentWindowContainer == null && modeSelectorSubHeaderData == null) {
            return null;
        }
        return new MainContract.FulfilmentWindowInfo(homeFulfilmentWindowState, fulfilmentWindowContainer, modeSelectorSubHeaderData);
    }

    public final MainContract.ModeSelectorInfo t6() {
        MainContract.ModeChipsConfiguration modeChipsConfiguration;
        MainContract.ModeSelectorInfo modeSelectorInfo;
        CollectionModeInteractor collectionModeInteractor = this.h;
        CollectionMode collectionModeW = collectionModeInteractor.w();
        if (Intrinsics.c(collectionModeW, CollectionMode.NotSet.d)) {
            collectionModeW = CollectionMode.InStore.d;
        }
        CollectionModeLabel collectionModeLabelQ = collectionModeInteractor.q(collectionModeW);
        String strC = collectionModeInteractor.c();
        if (strC == null) {
            strC = "";
        }
        PlainText plainText = new PlainText(strC);
        MainContract.ViewState viewState = (MainContract.ViewState) this.u.e();
        if (viewState == null || (modeSelectorInfo = viewState.e.c) == null || (modeChipsConfiguration = modeSelectorInfo.c) == null) {
            modeChipsConfiguration = ((MainContract.MainPage.HOME) MainActivity.R).j;
        }
        return new MainContract.ModeSelectorInfo(collectionModeLabelQ, plainText, modeChipsConfiguration);
    }

    public final MainContract.SpeechBubbleInfo u6() {
        return new MainContract.SpeechBubbleInfo(this.e.c(BaseShopAppFeature.s) ? v6() : this.j.d() && v6(), ((Boolean) this.F.getValue()).booleanValue());
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void v3(Text text) {
        q6(this, false, null, null, 14);
        MainContract.ViewState viewState = (MainContract.ViewState) this.w.e();
        Screen screen = viewState != null ? viewState.d : null;
        if (screen == null) {
            throw new IllegalArgumentException("viewState should not be null");
        }
        this.o.c(new EditOrderActions.CancellationFailure(screen));
        this.v.onNext(new MainContract.Actions.ShowSnackbarMessage(text));
    }

    public final boolean v6() {
        return this.k.b() == Region.i;
    }

    public final void w6(HomepageChips chip, CharSequence chipLabel) {
        Intrinsics.h(chip, "chip");
        CollectionMode[] collectionModeArr = chip.f;
        Intrinsics.h(chipLabel, "chipLabel");
        final String selectedModeChip = "Shopping Mode " + ((Object) chipLabel);
        HomepageAnalytics.HomeScreen.Action.d.getClass();
        Intrinsics.h(selectedModeChip, "selectedModeChip");
        this.o.g(new Event(selectedModeChip) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$chipModeClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                spreadBuilder.a(new Pair("event.Category", "mode_selector"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                a.z("event.Label", selectedModeChip, spreadBuilder, "event.Description", "Upfront Fulfilment");
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "mode_selector_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "mode_selector_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        CollectionModeInteractor collectionModeInteractor = this.h;
        boolean zC = collectionModeInteractor.C();
        PublishSubject publishSubject = this.v;
        if (!zC) {
            CollectionMode collectionModeW = collectionModeInteractor.w();
            if (!ArraysKt.l(collectionModeArr, collectionModeW)) {
                collectionModeW = null;
            }
            if (collectionModeW == null) {
                collectionModeW = (CollectionMode) ArraysKt.G(collectionModeArr);
            }
            publishSubject.onNext(new MainContract.Actions.ShowCollectionModeSelectorScreen(collectionModeW));
            return;
        }
        int iOrdinal = chip.ordinal();
        if (iOrdinal == 0) {
            publishSubject.onNext(MainContract.Actions.ShowPickupLocator.f4356a);
        } else if (iOrdinal == 1) {
            publishSubject.onNext(MainContract.Actions.ShowAddDeliveryAddress.f4352a);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            publishSubject.onNext(MainContract.Actions.ShowStoreLocator.f4358a);
        }
    }

    public final void x6(FulfilmentWindowContainer fulfilmentWindowInfo) {
        MainActivityActions mainActivityActions;
        Intrinsics.h(fulfilmentWindowInfo, "fulfilmentWindowInfo");
        MainContract.ViewState viewState = (MainContract.ViewState) this.w.e();
        Screen screen = viewState != null ? viewState.d : null;
        if (screen == null) {
            throw new IllegalArgumentException("viewState should not be null");
        }
        int iOrdinal = fulfilmentWindowInfo.c.ordinal();
        if (iOrdinal == 0) {
            mainActivityActions = MainActivityActions.k;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            mainActivityActions = MainActivityActions.f;
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, "Upfront Fulfilment");
        mainActivityActions.getClass();
        mainActivityActions.d = screen;
        this.o.j(mainActivityActions, trackingMetadataA);
        this.v.onNext(new MainContract.Actions.ShowCollectionModeSelectorScreen(null));
    }

    public final void y6() {
        this.v.onNext(MainContract.Actions.NavigateToSearchScreen.f4348a);
        MutableLiveData mutableLiveData = this.w;
        MainContract.ViewState viewState = (MainContract.ViewState) mutableLiveData.e();
        MainActivityActions mainActivityActions = (viewState != null ? viewState.e.d : null) == MainContract.SearchConfiguration.d ? MainActivityActions.h : MainActivityActions.i;
        MainContract.ViewState viewState2 = (MainContract.ViewState) mutableLiveData.e();
        Screen screen = viewState2 != null ? viewState2.d : null;
        if (screen == null) {
            throw new IllegalArgumentException("viewState should not be null");
        }
        mainActivityActions.getClass();
        mainActivityActions.d = screen;
        this.o.c(mainActivityActions);
    }

    public final void z6() {
        boolean zD = this.j.d();
        PublishSubject publishSubject = this.v;
        if (zD) {
            publishSubject.onNext(MainContract.Actions.NavigateToInboxScreen.f4347a);
        } else {
            publishSubject.onNext(MainContract.Actions.NavigateToAskOliveScreen.f4345a);
        }
        boolean zC = this.e.c(InboxFeature.d);
        AnalyticsManager analyticsManager = this.o;
        if (zC) {
            analyticsManager.g(HomepageAnalytics.HomeScreen.Action.h);
        } else {
            MainActivityActions mainActivityActions = MainActivityActions.e;
            MainContract.ViewState viewState = (MainContract.ViewState) this.w.e();
            Screen screen = viewState != null ? viewState.d : null;
            if (screen == null) {
                throw new IllegalArgumentException("viewState should not be null");
            }
            mainActivityActions.getClass();
            mainActivityActions.d = screen;
            analyticsManager.c(mainActivityActions);
        }
        this.n.b(InboxSwrveEvent.d);
    }
}

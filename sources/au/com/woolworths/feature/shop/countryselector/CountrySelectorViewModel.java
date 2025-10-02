package au.com.woolworths.feature.shop.countryselector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.countryselector.CountrySelectorContract;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CountrySelectorViewModel extends ViewModel {
    public final Activities.CountrySelector.Source e;
    public final CountrySelectorInteractorImpl f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final BufferedChannel i;
    public final Flow j;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel$1", f = "CountrySelectorViewModel.kt", l = {51}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public CountrySelectorContract.ViewState p;
        public Object q;
        public int r;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CountrySelectorViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            CountrySelectorContract.ViewState viewState;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.r;
            if (i == 0) {
                ResultKt.b(obj);
                CountrySelectorViewModel countrySelectorViewModel = CountrySelectorViewModel.this;
                MutableStateFlow mutableStateFlow2 = countrySelectorViewModel.g;
                CountrySelectorContract.ViewState viewState2 = (CountrySelectorContract.ViewState) mutableStateFlow2.getValue();
                CountrySelectorInteractorImpl countrySelectorInteractorImpl = countrySelectorViewModel.f;
                this.p = viewState2;
                this.q = mutableStateFlow2;
                this.r = 1;
                obj = countrySelectorInteractorImpl.h.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mutableStateFlow = mutableStateFlow2;
                viewState = viewState2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.q;
                viewState = this.p;
                ResultKt.b(obj);
            }
            mutableStateFlow.setValue(CountrySelectorContract.ViewState.a(viewState, null, ((Boolean) obj).booleanValue(), false, 59));
            return Unit.f24250a;
        }
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/countryselector/CountrySelectorViewModel$Factory;", "", "country-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        CountrySelectorViewModel a(Activities.CountrySelector.Source source);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Activities.CountrySelector.Source.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Activities.CountrySelector.Source source = Activities.CountrySelector.Source.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CountrySelectorViewModel(Activities.CountrySelector.Source source, CountrySelectorInteractorImpl countrySelectorInteractorImpl) {
        Region regionC;
        ShopAppRegionInteractor shopAppRegionInteractor = countrySelectorInteractorImpl.d;
        Intrinsics.h(source, "source");
        this.e = source;
        this.f = countrySelectorInteractorImpl;
        int iOrdinal = source.ordinal();
        if (iOrdinal == 0) {
            regionC = shopAppRegionInteractor.c();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            regionC = shopAppRegionInteractor.b();
        }
        Region region = regionC;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new CountrySelectorContract.ViewState(region, source, false, false, false, region));
        this.g = mutableStateFlowA;
        this.h = FlowKt.b(mutableStateFlowA);
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 4, BufferOverflow.e);
        this.i = bufferedChannelA;
        this.j = FlowKt.I(bufferedChannelA);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r10 != r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel r8, au.com.woolworths.android.onesite.modules.common.Region r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            au.com.woolworths.feature.shop.countryselector.CountrySelectorInteractorImpl r0 = r8.f
            boolean r1 = r10 instanceof au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel$redirectToNextScreen$1
            if (r1 == 0) goto L15
            r1 = r10
            au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel$redirectToNextScreen$1 r1 = (au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel$redirectToNextScreen$1) r1
            int r2 = r1.s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s = r2
            goto L1a
        L15:
            au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel$redirectToNextScreen$1 r1 = new au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel$redirectToNextScreen$1
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.s
            kotlin.Unit r4 = kotlin.Unit.f24250a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L47
            if (r3 == r7) goto L41
            if (r3 == r6) goto L3b
            if (r3 != r5) goto L33
            au.com.woolworths.android.onesite.modules.common.Region r9 = r1.p
            kotlin.ResultKt.b(r10)
            goto L75
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            au.com.woolworths.android.onesite.modules.common.Region r9 = r1.p
            kotlin.ResultKt.b(r10)
            goto L60
        L41:
            au.com.woolworths.android.onesite.modules.common.Region r9 = r1.p
            kotlin.ResultKt.b(r10)
            goto L55
        L47:
            kotlin.ResultKt.b(r10)
            r1.p = r9
            r1.s = r7
            java.lang.Object r10 = r0.a(r1)
            if (r10 != r2) goto L55
            goto L74
        L55:
            r1.p = r9
            r1.s = r6
            java.lang.Object r10 = r0.b(r9, r1)
            if (r10 != r2) goto L60
            goto L74
        L60:
            r1.p = r9
            r1.s = r5
            au.com.woolworths.feature.shop.login.guest.GuestLoginInteractorImpl r10 = r0.f
            io.reactivex.Completable r10 = r10.e()
            java.lang.Object r10 = kotlinx.coroutines.rx2.RxAwaitKt.a(r10, r1)
            if (r10 != r2) goto L71
            goto L72
        L71:
            r10 = r4
        L72:
            if (r10 != r2) goto L75
        L74:
            return r2
        L75:
            au.com.woolworths.android.onesite.navigation.Activities$CountrySelector$Source r10 = r8.e
            int r10 = r10.ordinal()
            if (r10 == 0) goto L90
            if (r10 != r7) goto L8a
            au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$Actions$Navigate r10 = new au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$Actions$Navigate
            au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$Destination$HomePage r0 = new au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$Destination$HomePage
            r0.<init>(r9)
            r10.<init>(r0)
            goto L97
        L8a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L90:
            au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$Actions$Navigate r10 = new au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$Actions$Navigate
            au.com.woolworths.feature.shop.countryselector.CountrySelectorContract$Destination$Onboarding r9 = au.com.woolworths.feature.shop.countryselector.CountrySelectorContract.Destination.Onboarding.f7034a
            r10.<init>(r9)
        L97:
            kotlinx.coroutines.channels.BufferedChannel r8 = r8.i
            r8.k(r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel.p6(au.com.woolworths.feature.shop.countryselector.CountrySelectorViewModel, au.com.woolworths.android.onesite.modules.common.Region, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void q6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new CountrySelectorViewModel$finishCountrySelection$1(this, null), 3);
    }

    public final void r6(Region region) {
        Intrinsics.h(region, "region");
        if (region != ((CountrySelectorContract.ViewState) this.h.getValue()).f7035a) {
            MutableStateFlow mutableStateFlow = this.g;
            CountrySelectorContract.ViewState viewState = (CountrySelectorContract.ViewState) mutableStateFlow.getValue();
            mutableStateFlow.setValue(CountrySelectorContract.ViewState.a(viewState, region, false, viewState.b == Activities.CountrySelector.Source.e, 54));
        }
    }
}

package com.woolworths.scanlibrary.ui.entry.launcher;

import android.app.Activity;
import androidx.camera.lifecycle.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import com.woolworths.scanlibrary.analytics.tracking.ScanAndGoEntryActions;
import com.woolworths.scanlibrary.domain.launch.FetchScanAndGoInteractor;
import com.woolworths.scanlibrary.domain.login.c;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import com.woolworths.scanlibrary.ui.entry.launcher.navadapter.ScanAndGoNavAdapterImpl;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleDoOnSubscribe;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/launcher/SngLauncherImpl;", "Lcom/woolworths/scanlibrary/ui/entry/launcher/SngLauncher;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SngLauncherImpl implements SngLauncher {
    public final FetchScanAndGoInteractor d;
    public final RewardsAccountInteractor e;
    public final SchedulersProvider f;
    public final NetworkExceptions g;
    public final AnalyticsManager h;
    public final CompositeDisposable i;
    public Activity j;
    public final MutableLiveData k;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21256a;

        static {
            int[] iArr = new int[FetchSngErrorState.values().length];
            try {
                FetchSngErrorState fetchSngErrorState = FetchSngErrorState.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FetchSngErrorState fetchSngErrorState2 = FetchSngErrorState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21256a = iArr;
        }
    }

    public SngLauncherImpl(FetchScanAndGoInteractor fetchScanAndGoInteractor, RewardsAccountInteractor rewardsAccountInteractor, SchedulersProvider schedulersProvider, NetworkExceptions networkExceptions, AnalyticsManager analyticsManager, ScanAndGoNavAdapterImpl scanAndGoNavAdapterImpl) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(networkExceptions, "networkExceptions");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.d = fetchScanAndGoInteractor;
        this.e = rewardsAccountInteractor;
        this.f = schedulersProvider;
        this.g = networkExceptions;
        this.h = analyticsManager;
        this.i = new CompositeDisposable();
        this.k = new MutableLiveData();
    }

    public final void a() {
        this.i.e();
        this.j = null;
    }

    public final void b() {
        this.k.j(new ScanAndGoLauncherState(true, null));
        RewardsCardData cardData = this.e.getCardData();
        Single singleA = this.d.a(cardData != null ? cardData.getNumber() : null);
        SchedulersProvider schedulersProvider = this.f;
        SingleDoOnSubscribe singleDoOnSubscribe = new SingleDoOnSubscribe(singleA.h(schedulersProvider.d()).f(schedulersProvider.b()), new c(new a(this, 0), 20));
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(new c(new a(this, 1), 21), new b(9, new SngLauncherImpl$fetchScanAndGoData$3(1, this, SngLauncherImpl.class, "handleFailedScanAndGoTokenExchange", "handleFailedScanAndGoTokenExchange(Ljava/lang/Throwable;)V", 0)));
        singleDoOnSubscribe.a(consumerSingleObserver);
        this.i.d(consumerSingleObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.entry.launcher.SngFullPageErrorStateHandler
    public final void cancel() {
        this.k.j(new ScanAndGoLauncherState(false, null));
    }

    @Override // com.woolworths.scanlibrary.ui.entry.launcher.SngFullPageErrorStateHandler
    public final void g() {
        b();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        FetchSngErrorState fetchSngErrorState;
        MutableLiveData mutableLiveData = this.k;
        ScanAndGoLauncherState scanAndGoLauncherState = (ScanAndGoLauncherState) mutableLiveData.e();
        FetchSngErrorState fetchSngErrorState2 = scanAndGoLauncherState != null ? scanAndGoLauncherState.b : null;
        int i = fetchSngErrorState2 == null ? -1 : WhenMappings.f21256a[fetchSngErrorState2.ordinal()];
        if (i == -1) {
            throw new IllegalStateException("No error should mean no button, so can't click it.");
        }
        AnalyticsManager analyticsManager = this.h;
        if (i == 1) {
            analyticsManager.c(ScanAndGoEntryActions.h);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            analyticsManager.c(ScanAndGoEntryActions.f);
        }
        ScanAndGoLauncherState scanAndGoLauncherState2 = (ScanAndGoLauncherState) mutableLiveData.e();
        if (scanAndGoLauncherState2 == null || (fetchSngErrorState = scanAndGoLauncherState2.b) == null) {
            return;
        }
        fetchSngErrorState.a(this);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        FetchSngErrorState fetchSngErrorState;
        ScanAndGoLauncherState scanAndGoLauncherState = (ScanAndGoLauncherState) this.k.e();
        if (scanAndGoLauncherState == null || (fetchSngErrorState = scanAndGoLauncherState.b) == null) {
            return;
        }
        fetchSngErrorState.b(this);
    }
}

package androidx.camera.core.processing;

import androidx.camera.camera2.internal.u;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.CancellationSignal;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.transition.Transition;
import androidx.work.DirectExecutor;
import au.com.woolworths.feature.rewards.offers.ItemRewardsOfferTileCompatBindingModel_;
import au.com.woolworths.feature.rewards.offers.RewardsOffersEpoxyController;
import au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.product.details.ItemHealthierProductCardBindingModel_;
import au.com.woolworths.product.details.ProductDetailsEpoxyController;
import au.com.woolworths.product.details.models.HealthierHorizontalListData;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.androidbrowserhelper.trusted.splashscreens.SplashImageTransferTask;
import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements CallbackToFutureAdapter.Resolver, ListenerSet.Event, CancellationSignal.OnCancelListener, OnModelBoundListener, OnModelVisibilityStateChangedListener, SynchronizationGuard.CriticalSection, SplashImageTransferTask.Callback, ListenerRegistration, Continuation {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ f(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.g = obj;
        this.e = obj2;
        this.f = obj3;
    }

    public void a() {
        Runnable runnable = (Runnable) this.g;
        Transition transition = (Transition) this.e;
        Runnable runnable2 = (Runnable) this.f;
        if (runnable != null) {
            runnable.run();
        } else {
            transition.cancel();
            runnable2.run();
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.d) {
            case 0:
                DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.g;
                DynamicRange dynamicRange = (DynamicRange) this.e;
                Map map = Collections.EMPTY_MAP;
                defaultSurfaceProcessor.d(new a(defaultSurfaceProcessor, dynamicRange, completer), new u(1));
                return "Init GlRenderer";
            case 1:
                DualSurfaceProcessor dualSurfaceProcessor = (DualSurfaceProcessor) this.g;
                DynamicRange dynamicRange2 = (DynamicRange) this.e;
                Map map2 = Collections.EMPTY_MAP;
                dualSurfaceProcessor.d(new a(dualSurfaceProcessor, dynamicRange2, completer), new u(1));
                return "Init GlRenderer";
            default:
                Executor executor = (Executor) this.g;
                String str = (String) this.e;
                Function0 function0 = (Function0) this.f;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                completer.a(new androidx.camera.camera2.interop.d(atomicBoolean, 13), DirectExecutor.d);
                executor.execute(new g(7, atomicBoolean, completer, function0));
                return str;
        }
    }

    public void b(DataBindingEpoxyModel dataBindingEpoxyModel, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ProductDetailsEpoxyController.buildHealthierHorizontalList$lambda$17$lambda$16((HealthierHorizontalListData) this.g, (Ref.IntRef) this.e, (ProductDetailsEpoxyController) this.f, (ItemHealthierProductCardBindingModel_) dataBindingEpoxyModel, dataBindingHolder, i);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        DefaultScheduler defaultScheduler = (DefaultScheduler) this.g;
        TransportContext transportContext = (TransportContext) this.e;
        defaultScheduler.d.n2(transportContext, (EventInternal) this.f);
        defaultScheduler.f14467a.b(transportContext, 1);
        return null;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        RewardsOffersEpoxyController.buildNormalOfferCard$lambda$36$lambda$34((RewardsOffersEpoxyController) this.g, (OfferViewItem) this.e, (RewardsOffersViewModelLegacy) this.f, (ItemRewardsOfferTileCompatBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).H((AnalyticsListener.EventTime) this.g, (MediaLoadData) this.e, (IOException) this.f);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ConfigContainer configContainer;
        FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig) this.g;
        Task task2 = (Task) this.e;
        Task task3 = (Task) this.f;
        if (!task2.isSuccessful() || task2.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        ConfigContainer configContainer2 = (ConfigContainer) task2.getResult();
        return (task3.isSuccessful() && (configContainer = (ConfigContainer) task3.getResult()) != null && configContainer2.c.equals(configContainer.c)) ? Tasks.forResult(Boolean.FALSE) : firebaseRemoteConfig.d.d(configContainer2).continueWith(firebaseRemoteConfig.b, new au.com.woolworths.product.details.epoxy.a(firebaseRemoteConfig, 21));
    }

    public /* synthetic */ f(DefaultSurfaceProcessor defaultSurfaceProcessor, DynamicRange dynamicRange) {
        this.d = 0;
        Map map = Collections.EMPTY_MAP;
        this.g = defaultSurfaceProcessor;
        this.e = dynamicRange;
        this.f = map;
    }

    public /* synthetic */ f(DualSurfaceProcessor dualSurfaceProcessor, DynamicRange dynamicRange) {
        this.d = 1;
        Map map = Collections.EMPTY_MAP;
        this.g = dualSurfaceProcessor;
        this.e = dynamicRange;
        this.f = map;
    }

    public /* synthetic */ f(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.d = 2;
        this.g = eventTime;
        this.e = mediaLoadData;
        this.f = iOException;
    }
}

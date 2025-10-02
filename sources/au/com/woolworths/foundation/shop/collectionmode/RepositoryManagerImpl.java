package au.com.woolworths.foundation.shop.collectionmode;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.analytics.FirebaseAnalyticsLogger;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.repository.PreferencesManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.StoreLocatorExtKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/collectionmode/RepositoryManagerImpl;", "Lau/com/woolworths/foundation/shop/collectionmode/RepositoryManager;", "Companion", "collection-mode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RepositoryManagerImpl implements RepositoryManager {

    /* renamed from: a, reason: collision with root package name */
    public final PreferencesManager f8705a;
    public final StoreLocatorApiInterface b;
    public final CollectionModeInteractor c;
    public final LegacyShopAnalyticsManager d;
    public final FirebaseAnalyticsLogger e;
    public final DispatcherProvider f;
    public final SchedulersProvider g;
    public final SharedPreferences h;
    public final FeatureToggleManager i;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.shop.collectionmode.RepositoryManagerImpl$1", f = "RepositoryManagerImpl.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.shop.collectionmode.RepositoryManagerImpl$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.foundation.shop.collectionmode.RepositoryManagerImpl$1$1", f = "RepositoryManagerImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.foundation.shop.collectionmode.RepositoryManagerImpl$1$1, reason: invalid class name and collision with other inner class name */
        final class C02251 extends SuspendLambda implements Function2<CollectionMode, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ RepositoryManagerImpl q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02251(RepositoryManagerImpl repositoryManagerImpl, Continuation continuation) {
                super(2, continuation);
                this.q = repositoryManagerImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C02251 c02251 = new C02251(this.q, continuation);
                c02251.p = obj;
                return c02251;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C02251 c02251 = (C02251) create((CollectionMode) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c02251.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                boolean zC = Intrinsics.c((CollectionMode) this.p, CollectionMode.InStore.d);
                RepositoryManagerImpl repositoryManagerImpl = this.q;
                String strF = zC ? repositoryManagerImpl.f() : null;
                FirebaseAnalytics firebaseAnalytics = repositoryManagerImpl.e.f4057a;
                if (strF == null) {
                    strF = "not_set";
                }
                firebaseAnalytics.f15179a.zzk(null, "in_store_id", strF, false);
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RepositoryManagerImpl.this.new AnonymousClass1(continuation);
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
                RepositoryManagerImpl repositoryManagerImpl = RepositoryManagerImpl.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02251(repositoryManagerImpl, null), repositoryManagerImpl.c.getM());
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/foundation/shop/collectionmode/RepositoryManagerImpl$Companion;", "", "", "INSTORE", "Ljava/lang/String;", "collection-mode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RepositoryManagerImpl(PreferencesManager preferencesManager, StoreLocatorApiInterface storeLocatorApiInterface, CollectionModeInteractor collectionModeInteractor, LegacyShopAnalyticsManager analyticsManager, FirebaseAnalyticsLogger firebaseAnalyticsLogger, DispatcherProvider dispatcherProvider, SchedulersProvider schedulersProvider, SharedPreferences sharedPreferences, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(preferencesManager, "preferencesManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(firebaseAnalyticsLogger, "firebaseAnalyticsLogger");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(sharedPreferences, "sharedPreferences");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f8705a = preferencesManager;
        this.b = storeLocatorApiInterface;
        this.c = collectionModeInteractor;
        this.d = analyticsManager;
        this.e = firebaseAnalyticsLogger;
        this.f = dispatcherProvider;
        this.g = schedulersProvider;
        this.h = sharedPreferences;
        this.i = featureToggleManager;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        String strF = Intrinsics.c(collectionModeInteractor.w(), CollectionMode.InStore.d) ? f() : null;
        firebaseAnalyticsLogger.f4057a.f15179a.zzk(null, "in_store_id", strF == null ? "not_set" : strF, false);
        BuildersKt.c(contextScopeA, null, null, new AnonymousClass1(null), 3);
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.RepositoryManager
    public final void a(Store newStore) {
        Intrinsics.h(newStore, "newStore");
        String d = newStore.getD();
        String f = newStore.getF();
        Store storeE = e();
        this.d.b(storeE != null ? storeE.getD() : null, storeE != null ? storeE.getF() : null, d, f, CollectionMode.InStore.d);
        String strJ = new Gson().j(newStore);
        SharedPreferences.Editor editorEdit = this.h.edit();
        editorEdit.putString("instore", strJ);
        editorEdit.apply();
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.RepositoryManager
    public final void b(StoreLocatorResult.Store newStore) {
        Intrinsics.h(newStore, "newStore");
        String no = newStore.getNo();
        String name = newStore.getName();
        Store storeE = e();
        this.d.b(storeE != null ? storeE.getD() : null, storeE != null ? storeE.getF() : null, no, name, CollectionMode.InStore.d);
        this.f8705a.e(newStore);
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.RepositoryManager
    public final String c() {
        return this.h.getString("CollectionLocationDisplayName", null);
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.RepositoryManager
    public final boolean d() {
        return e() != null;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.RepositoryManager
    public final Store e() {
        if (this.i.c(BaseShopAppFeature.b0)) {
            return (Store) new Gson().d(Store.class, this.h.getString("instore", null));
        }
        StoreLocatorResult.Store storeD = this.f8705a.d();
        if (storeD != null) {
            return StoreLocatorExtKt.a(storeD);
        }
        return null;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.RepositoryManager
    public final String f() {
        Store storeE = this.c.b() ? e() : null;
        if (storeE != null) {
            return storeE.getD();
        }
        return null;
    }

    @Override // au.com.woolworths.foundation.shop.collectionmode.RepositoryManager
    public final void g(String str) {
        SharedPreferences.Editor editorEdit = this.h.edit();
        editorEdit.putString("CollectionLocationDisplayName", str);
        editorEdit.apply();
    }
}

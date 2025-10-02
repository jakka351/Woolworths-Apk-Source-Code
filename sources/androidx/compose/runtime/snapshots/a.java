package androidx.compose.runtime.snapshots;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.adobe.marketing.mobile.AdobeCallback;
import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.EventHistoryResultHandler;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.util.DataReader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.tealium.adidentifier.AdIdentifier;
import com.tealium.adidentifier.internal.c;
import com.tealium.remotecommands.branch.BranchInstance;
import io.branch.referral.Branch;
import io.branch.referral.BranchError;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.EventListener;
import okhttp3.sse.EventSource;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ObserverHandle, SupportSQLiteOpenHelper.Factory, AdobeCallback, EventHistoryResultHandler, SynchronizationGuard.CriticalSection, ComponentFactory, Deferred.DeferredHandler, Continuation, SuccessContinuation, OnSuccessListener, Branch.BranchLinkCreateListener, EventListener.Factory, EventSource.Factory {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.adobe.marketing.mobile.AdobeCallback, com.adobe.marketing.mobile.EventHistoryResultHandler
    public void a(Object obj) {
        switch (this.d) {
            case 2:
                ((au.com.woolworths.android.onesite.analytics.adobe.a) this.e).a(DataReader.f("mid", "", ((Event) obj).e));
                break;
            default:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.e;
                if (!((Boolean) obj).booleanValue()) {
                    String str = ((Event) objectRef.d).b;
                    Log.a();
                    break;
                }
                break;
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object b(ComponentContainer componentContainer) {
        return this.e;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper d(SupportSQLiteOpenHelper.Configuration configuration) {
        SupportSQLiteOpenHelper.Configuration.Builder builderA = SupportSQLiteOpenHelper.Configuration.Companion.a((Context) this.e);
        builderA.b = configuration.b;
        SupportSQLiteOpenHelper.Callback callback = configuration.c;
        Intrinsics.h(callback, "callback");
        builderA.c = callback;
        builderA.d = true;
        builderA.e = true;
        return new FrameworkSQLiteOpenHelperFactory().d(builderA.a());
    }

    @Override // androidx.compose.runtime.snapshots.ObserverHandle
    public void dispose() {
        Function2 function2 = (Function2) this.e;
        synchronized (SnapshotKt.c) {
            SnapshotKt.h = CollectionsKt.X((Iterable) SnapshotKt.h, function2);
        }
    }

    @Override // io.branch.referral.Branch.BranchLinkCreateListener
    public void e(String str, BranchError branchError) {
        BranchInstance branchInstance = (BranchInstance) this.e;
        if (branchError == null) {
            branchInstance.f.a("branch_create_deeplink", MapsKt.i(new Pair("branch_short_url", str)));
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.d) {
            case 4:
                return ((ClientHealthMetricsStore) this.e).b();
            default:
                ((Uploader) this.e).i.a();
                return null;
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void f(Provider provider) {
        switch (this.d) {
            case 7:
                CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = (CrashlyticsNativeComponentDeferredProxy) this.e;
                Logger.f15258a.b("Crashlytics native component now available.", null);
                crashlyticsNativeComponentDeferredProxy.b.set((CrashlyticsNativeComponent) provider.get());
                break;
            default:
                ((FirebaseRemoteConfigInterop) provider.get()).a((CrashlyticsRemoteConfigListener) this.e);
                Logger.f15258a.b("Registering RemoteConfig Rollouts subscriber", null);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        ((AdIdentifier) this.e).f19119a.e.a(new c(appSetIdInfo.getId(), Integer.valueOf(appSetIdInfo.getScope())));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ((Runnable) this.e).run();
        return Tasks.forResult(null);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ((FirebaseRemoteConfig) this.e).a();
    }
}

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements SynchronizationGuard.CriticalSection, Deferred.DeferredHandler, Continuation {
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(Uploader uploader, TransportContext transportContext, long j) {
        this.e = uploader;
        this.f = transportContext;
        this.d = j;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Uploader uploader = (Uploader) this.e;
        uploader.c.h2(uploader.g.a() + this.d, (TransportContext) this.f);
        return null;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void f(Provider provider) {
        ((CrashlyticsNativeComponent) provider.get()).a((String) this.e, this.d, (StaticSessionData) this.f);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.e;
        HashMap map = (HashMap) this.f;
        int[] iArr = ConfigFetchHandler.k;
        return configFetchHandler.b(task, this.d, map);
    }

    public /* synthetic */ d(Object obj, long j, Object obj2) {
        this.e = obj;
        this.d = j;
        this.f = obj2;
    }
}

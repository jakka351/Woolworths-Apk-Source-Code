package com.google.firebase.crashlytics.internal;

import androidx.compose.runtime.snapshots.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {
    public static final NativeSessionFileProvider c = new MissingNativeSessionFileProvider();

    /* renamed from: a, reason: collision with root package name */
    public final Deferred f15254a;
    public final AtomicReference b = new AtomicReference(null);

    public static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred deferred) {
        this.f15254a = deferred;
        deferred.a(new a(this, 7));
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final void a(String str, long j, StaticSessionData staticSessionData) {
        Logger.f15258a.e("Deferring native open session: " + str);
        this.f15254a.a(new d(str, j, staticSessionData));
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final NativeSessionFileProvider b(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.b.get();
        return crashlyticsNativeComponent == null ? c : crashlyticsNativeComponent.b(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final boolean c() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.c();
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public final boolean d(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = (CrashlyticsNativeComponent) this.b.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.d(str);
    }
}

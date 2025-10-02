package com.tealium.core.validation;

import android.app.Activity;
import com.tealium.core.messaging.ActivityObserverListener;
import com.tealium.core.messaging.EventRouter;
import com.tealium.core.messaging.LibrarySettingsUpdatedListener;
import com.tealium.core.persistence.l;
import com.tealium.core.settings.Batching;
import com.tealium.core.settings.LibrarySettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/validation/a;", "Lcom/tealium/core/validation/DispatchValidator;", "Lcom/tealium/core/messaging/LibrarySettingsUpdatedListener;", "Lcom/tealium/core/messaging/ActivityObserverListener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a implements DispatchValidator, LibrarySettingsUpdatedListener, ActivityObserverListener {

    /* renamed from: a, reason: collision with root package name */
    public final l f19181a;
    public final EventRouter b;
    public boolean c;
    public Batching d;
    public int e;

    public a(l dispatchStorage, LibrarySettings librarySettings, EventRouter eventRouter) {
        Intrinsics.h(dispatchStorage, "dispatchStorage");
        Intrinsics.h(librarySettings, "librarySettings");
        Intrinsics.h(eventRouter, "eventRouter");
        this.f19181a = dispatchStorage;
        this.b = eventRouter;
        this.c = true;
        this.d = librarySettings.c;
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // com.tealium.core.messaging.LibrarySettingsUpdatedListener
    public final void C(LibrarySettings settings) {
        Intrinsics.h(settings, "settings");
        this.d = settings.c;
    }

    @Override // com.tealium.core.validation.DispatchValidator
    public final boolean b() {
        int iCount = this.f19181a.count();
        Batching batching = this.d;
        return batching.b != 0 && iCount + 1 < batching.f19177a;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getF() {
        return "BatchingValidator";
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void m(Activity activity, boolean z) {
        int i = this.e - 1;
        this.e = i;
        if (i != 0 || z) {
            return;
        }
        this.b.g(a.class);
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void onActivityPaused(Activity activity) {
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void onActivityResumed(Activity activity) {
        this.e++;
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.c = z;
    }

    @Override // com.tealium.core.validation.DispatchValidator
    public final boolean y(com.tealium.dispatcher.a aVar) {
        return false;
    }
}

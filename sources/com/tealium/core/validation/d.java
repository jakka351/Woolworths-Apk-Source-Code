package com.tealium.core.validation;

import com.tealium.core.messaging.LibrarySettingsUpdatedListener;
import com.tealium.core.network.Connectivity;
import com.tealium.core.settings.LibrarySettings;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/validation/d;", "Lcom/tealium/core/validation/DispatchValidator;", "Lcom/tealium/core/messaging/LibrarySettingsUpdatedListener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d implements DispatchValidator, LibrarySettingsUpdatedListener {

    /* renamed from: a, reason: collision with root package name */
    public final Connectivity f19184a;
    public LibrarySettings b;
    public boolean c;

    public d(Connectivity connectivityRetriever, LibrarySettings librarySettings) {
        Intrinsics.h(connectivityRetriever, "connectivityRetriever");
        Intrinsics.h(librarySettings, "librarySettings");
        this.f19184a = connectivityRetriever;
        this.b = librarySettings;
        this.c = true;
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    @Override // com.tealium.core.messaging.LibrarySettingsUpdatedListener
    public final void C(LibrarySettings settings) {
        Intrinsics.h(settings, "settings");
        this.b = settings;
    }

    @Override // com.tealium.core.validation.DispatchValidator
    public final boolean b() {
        boolean z = this.b.e;
        Connectivity connectivity = this.f19184a;
        if (z) {
            if (connectivity.isConnected() && connectivity.a()) {
                return false;
            }
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            if (connectivity.isConnected()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getF() {
        return "ConnectivityValidator";
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

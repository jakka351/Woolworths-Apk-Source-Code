package com.tealium.core.settings;

import com.tealium.core.LogLevel;
import com.tealium.core.Logger;
import com.tealium.core.messaging.LibrarySettingsUpdatedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/settings/d;", "Lcom/tealium/core/messaging/LibrarySettingsUpdatedListener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d implements LibrarySettingsUpdatedListener {

    /* renamed from: a, reason: collision with root package name */
    public final LogLevel f19180a;

    public d(LogLevel logLevel) {
        this.f19180a = logLevel;
    }

    @Override // com.tealium.core.messaging.LibrarySettingsUpdatedListener
    public final void C(LibrarySettings settings) {
        Intrinsics.h(settings, "settings");
        if (this.f19180a == null) {
            Logger.Companion companion = Logger.f19124a;
            Logger.b = settings.h;
        }
    }
}

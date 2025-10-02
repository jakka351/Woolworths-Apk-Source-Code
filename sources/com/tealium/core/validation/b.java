package com.tealium.core.validation;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import com.tealium.core.Logger;
import com.tealium.core.TealiumConfig;
import com.tealium.core.messaging.LibrarySettingsUpdatedListener;
import com.tealium.core.messaging.MessengerService;
import com.tealium.core.settings.LibrarySettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/validation/b;", "Lcom/tealium/core/validation/DispatchValidator;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements DispatchValidator {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19182a;
    public final Application b;
    public final int c;
    public final IntentFilter d;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tealium/core/validation/b$a", "Lcom/tealium/core/messaging/LibrarySettingsUpdatedListener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    public final class a implements LibrarySettingsUpdatedListener {
        public a() {
        }

        @Override // com.tealium.core.messaging.LibrarySettingsUpdatedListener
        public final void C(LibrarySettings settings) {
            Intrinsics.h(settings, "settings");
            b.this.f19182a = settings.d;
        }
    }

    public b(TealiumConfig tealiumConfig, LibrarySettings librarySettings, MessengerService events) {
        Intrinsics.h(librarySettings, "librarySettings");
        Intrinsics.h(events, "events");
        this.f19182a = librarySettings.d;
        this.b = tealiumConfig.f19129a;
        Object obj = tealiumConfig.k.get("low_battery_threshold_percentage");
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        this.c = num != null ? num.intValue() : 15;
        this.d = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        events.f19153a.i(new a());
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getJ() {
        return this.f19182a;
    }

    public final int a() {
        Intent intentRegisterReceiver = this.b.registerReceiver(null, this.d);
        if (intentRegisterReceiver == null) {
            return -1;
        }
        return RangesKt.c((intentRegisterReceiver.getIntExtra("level", -1) * 100) / intentRegisterReceiver.getIntExtra("scale", -1), 0, 100);
    }

    @Override // com.tealium.core.validation.DispatchValidator
    public final boolean b() {
        boolean z = this.f19182a && a() < this.c;
        if (z) {
            Logger.f19124a.h("Tealium-1.6.0", "Battery is low (" + a() + "%)");
        }
        return z;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getI() {
        return "BatteryValidator";
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.f19182a = z;
    }

    @Override // com.tealium.core.validation.DispatchValidator
    public final boolean y(com.tealium.dispatcher.a aVar) {
        return false;
    }
}

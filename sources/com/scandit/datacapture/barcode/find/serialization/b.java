package com.scandit.datacapture.barcode.find.serialization;

import com.scandit.datacapture.barcode.InterfaceC0879v0;
import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class b implements InterfaceC0879v0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17672a;

    public b(BarcodeFindDeserializer owner) {
        Intrinsics.h(owner, "owner");
        this.f17672a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0879v0
    public final void onModeDeserializationFinished(BarcodeFindDeserializer deserializer, BarcodeFind mode, JsonValue json) {
        BarcodeFindDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.f17672a.get();
        if (barcodeFindDeserializer == null || (listener = barcodeFindDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0879v0
    public final void onModeDeserializationStarted(BarcodeFindDeserializer deserializer, BarcodeFind mode, JsonValue json) {
        BarcodeFindDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.f17672a.get();
        if (barcodeFindDeserializer == null || (listener = barcodeFindDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0879v0
    public final void onSettingsDeserializationFinished(BarcodeFindDeserializer deserializer, BarcodeFindSettings settings, JsonValue json) {
        BarcodeFindDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.f17672a.get();
        if (barcodeFindDeserializer == null || (listener = barcodeFindDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0879v0
    public final void onSettingsDeserializationStarted(BarcodeFindDeserializer deserializer, BarcodeFindSettings settings, JsonValue json) {
        BarcodeFindDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.f17672a.get();
        if (barcodeFindDeserializer == null || (listener = barcodeFindDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}

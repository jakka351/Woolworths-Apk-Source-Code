package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.core.json.JsonValue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class b implements BarcodePickDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f17921a;

    public b(BarcodePickDeserializer owner) {
        Intrinsics.h(owner, "owner");
        this.f17921a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerListener
    public final void onModeDeserializationFinished(BarcodePickDeserializer deserializer, BarcodePick mode, JsonValue json) {
        BarcodePickDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f17921a.get();
        if (barcodePickDeserializer == null || (listener = barcodePickDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationFinished(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerListener
    public final void onModeDeserializationStarted(BarcodePickDeserializer deserializer, BarcodePick mode, JsonValue json) {
        BarcodePickDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f17921a.get();
        if (barcodePickDeserializer == null || (listener = barcodePickDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onModeDeserializationStarted(deserializer, mode, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerListener
    public final void onSettingsDeserializationFinished(BarcodePickDeserializer deserializer, BarcodePickSettings settings, JsonValue json) {
        BarcodePickDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f17921a.get();
        if (barcodePickDeserializer == null || (listener = barcodePickDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationFinished(deserializer, settings, json);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerListener
    public final void onSettingsDeserializationStarted(BarcodePickDeserializer deserializer, BarcodePickSettings settings, JsonValue json) {
        BarcodePickDeserializerListener listener;
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.f17921a.get();
        if (barcodePickDeserializer == null || (listener = barcodePickDeserializer.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String()) == null) {
            return;
        }
        listener.onSettingsDeserializationStarted(deserializer, settings, json);
    }
}

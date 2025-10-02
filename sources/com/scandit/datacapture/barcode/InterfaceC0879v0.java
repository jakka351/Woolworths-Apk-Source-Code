package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializer;
import com.scandit.datacapture.core.json.JsonValue;

/* renamed from: com.scandit.datacapture.barcode.v0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC0879v0 {
    void onModeDeserializationFinished(BarcodeFindDeserializer barcodeFindDeserializer, BarcodeFind barcodeFind, JsonValue jsonValue);

    void onModeDeserializationStarted(BarcodeFindDeserializer barcodeFindDeserializer, BarcodeFind barcodeFind, JsonValue jsonValue);

    void onSettingsDeserializationFinished(BarcodeFindDeserializer barcodeFindDeserializer, BarcodeFindSettings barcodeFindSettings, JsonValue jsonValue);

    void onSettingsDeserializationStarted(BarcodeFindDeserializer barcodeFindDeserializer, BarcodeFindSettings barcodeFindSettings, JsonValue jsonValue);
}

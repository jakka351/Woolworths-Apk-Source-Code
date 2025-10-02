package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.find.feedback.BarcodeFindFeedback;
import com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.internal.sdk.common.feedback.FeedbackDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.r0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0804r0 implements BarcodeFindDeserializerHelper {
    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper
    public final void a(BarcodeFindSettings settings, JsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper
    public final BarcodeFind b() {
        return new BarcodeFind(new BarcodeFindSettings());
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper
    public final BarcodeFindSettings createSettings() {
        return new BarcodeFindSettings();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper
    public final void a(BarcodeFind mode, BarcodeFindSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        mode.applySettings(settings);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper
    public final void a(BarcodeFind mode, JsonValue json) {
        Feedback found;
        Feedback itemListUpdated;
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        if (json.contains("feedback")) {
            JsonValue json2 = json.requireByKey("feedback");
            Intrinsics.h(json2, "json");
            BarcodeFindFeedback barcodeFindFeedbackDefaultFeedback = BarcodeFindFeedback.INSTANCE.defaultFeedback();
            if (json2.contains("found")) {
                found = FeedbackDeserializer.fromJson(json2.requireByKey("found"));
            } else {
                found = barcodeFindFeedbackDefaultFeedback.getFound();
            }
            if (json2.contains("itemListUpdated")) {
                itemListUpdated = FeedbackDeserializer.fromJson(json2.requireByKey("itemListUpdated"));
            } else {
                itemListUpdated = barcodeFindFeedbackDefaultFeedback.getItemListUpdated();
            }
            BarcodeFindFeedback barcodeFindFeedback = new BarcodeFindFeedback();
            barcodeFindFeedback.setFound(found);
            barcodeFindFeedback.setItemListUpdated(itemListUpdated);
            mode.setFeedback(barcodeFindFeedback);
        }
    }
}

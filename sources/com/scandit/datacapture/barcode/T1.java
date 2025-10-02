package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewSettings;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class T1 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f17301a = new ArrayList();

    public final BarcodeFindViewSettings a(JsonValue json) {
        Intrinsics.h(json, "json");
        this.f17301a.clear();
        BarcodeFindViewSettings barcodeFindViewSettings = new BarcodeFindViewSettings(0, 0, false, false, 15, (DefaultConstructorMarker) null);
        NativeColor colorForKeyOrDefault = json.getF18778a().getColorForKeyOrDefault("inListItemColor", NativeColorExtensionsKt.toNativeColor(barcodeFindViewSettings.getInListItemColor()));
        Intrinsics.g(colorForKeyOrDefault, "_impl().getColorForKeyOr…ultValue.toNativeColor())");
        int i = NativeColorExtensionsKt.toInt(colorForKeyOrDefault);
        NativeColor colorForKeyOrDefault2 = json.getF18778a().getColorForKeyOrDefault("notInListItemColor", NativeColorExtensionsKt.toNativeColor(barcodeFindViewSettings.getNotInListItemColor()));
        Intrinsics.g(colorForKeyOrDefault2, "_impl().getColorForKeyOr…ultValue.toNativeColor())");
        int i2 = NativeColorExtensionsKt.toInt(colorForKeyOrDefault2);
        boolean byKeyAsBoolean = json.getByKeyAsBoolean("soundEnabled", barcodeFindViewSettings.getSoundEnabled());
        boolean byKeyAsBoolean2 = json.getByKeyAsBoolean("hapticEnabled", barcodeFindViewSettings.getHapticEnabled());
        boolean byKeyAsBoolean3 = json.getByKeyAsBoolean(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, barcodeFindViewSettings.getHardwareTriggerEnabled());
        Integer numValueOf = json.contains(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE) ? Integer.valueOf(json.getByKeyAsInt(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, 0)) : null;
        this.f17301a.addAll(json._getWarnings());
        return new BarcodeFindViewSettings(i, i2, byKeyAsBoolean, byKeyAsBoolean2, byKeyAsBoolean3, numValueOf);
    }
}

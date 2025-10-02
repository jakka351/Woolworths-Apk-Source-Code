package com.scandit.datacapture.core.internal.sdk.common.torch;

import android.content.Context;
import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.T7;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.JsonExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/torch/TorchSwitchControlDeserializer;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/core/ui/control/TorchSwitchControl;", "fromJson", "control", "", "updateFromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class TorchSwitchControlDeserializer {

    @NotNull
    public static final TorchSwitchControlDeserializer INSTANCE = new TorchSwitchControlDeserializer();

    private TorchSwitchControlDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final TorchSwitchControl fromJson(@NotNull Context context, @NotNull JsonValue json) {
        Intrinsics.h(context, "context");
        Intrinsics.h(json, "json");
        TorchSwitchControl torchSwitchControl = new TorchSwitchControl(context);
        updateFromJson(torchSwitchControl, json);
        return torchSwitchControl;
    }

    @JvmStatic
    public static final void updateFromJson(@NotNull TorchSwitchControl control, @NotNull JsonValue json) {
        Bitmap bitmapBitmapFromResource;
        Bitmap bitmapBitmapFromResource2;
        Bitmap bitmapBitmapFromResource3;
        Bitmap bitmapBitmapByKey;
        Intrinsics.h(control, "control");
        Intrinsics.h(json, "json");
        Bitmap bitmapBitmapFromResource4 = null;
        JsonValue byKeyAsObject = json.getByKeyAsObject(BarcodePickDeserializer.FIELD_ICON, null);
        if (byKeyAsObject != null) {
            JsonValue byKeyAsObject2 = byKeyAsObject.getByKeyAsObject("on", null);
            if (byKeyAsObject2 != null) {
                bitmapBitmapByKey = JsonExtensionsKt.bitmapByKey(byKeyAsObject2, "default");
                bitmapBitmapFromResource2 = JsonExtensionsKt.bitmapByKey(byKeyAsObject2, "pressed");
            } else {
                bitmapBitmapFromResource2 = null;
                bitmapBitmapByKey = null;
            }
            JsonValue byKeyAsObject3 = byKeyAsObject.getByKeyAsObject("off", null);
            if (byKeyAsObject3 != null) {
                Bitmap bitmapBitmapByKey2 = JsonExtensionsKt.bitmapByKey(byKeyAsObject3, "default");
                bitmapBitmapFromResource3 = JsonExtensionsKt.bitmapByKey(byKeyAsObject3, "pressed");
                bitmapBitmapFromResource = bitmapBitmapByKey2;
            } else {
                bitmapBitmapFromResource = null;
                bitmapBitmapFromResource3 = null;
            }
            bitmapBitmapFromResource4 = bitmapBitmapByKey;
        } else {
            bitmapBitmapFromResource = null;
            bitmapBitmapFromResource2 = null;
            bitmapBitmapFromResource3 = null;
        }
        T7 t7 = new T7();
        if (bitmapBitmapFromResource4 == null) {
            bitmapBitmapFromResource4 = BitmapExtensionsKt.bitmapFromResource(t7.c());
        }
        control.setTorchOnImage(bitmapBitmapFromResource4);
        if (bitmapBitmapFromResource2 == null) {
            bitmapBitmapFromResource2 = BitmapExtensionsKt.bitmapFromResource(t7.d());
        }
        control.setTorchOnPressedImage(bitmapBitmapFromResource2);
        if (bitmapBitmapFromResource == null) {
            bitmapBitmapFromResource = BitmapExtensionsKt.bitmapFromResource(t7.a());
        }
        control.setTorchOffImage(bitmapBitmapFromResource);
        if (bitmapBitmapFromResource3 == null) {
            bitmapBitmapFromResource3 = BitmapExtensionsKt.bitmapFromResource(t7.b());
        }
        control.setTorchOffPressedImage(bitmapBitmapFromResource3);
    }
}

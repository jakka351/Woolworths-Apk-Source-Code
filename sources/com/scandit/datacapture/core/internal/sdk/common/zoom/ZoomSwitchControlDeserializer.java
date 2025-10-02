package com.scandit.datacapture.core.internal.sdk.common.zoom;

import android.content.Context;
import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.internal.sdk.extensions.JsonExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/zoom/ZoomSwitchControlDeserializer;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/core/ui/control/ZoomSwitchControl;", "fromJson", "control", "", "updateFromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ZoomSwitchControlDeserializer {

    @NotNull
    public static final ZoomSwitchControlDeserializer INSTANCE = new ZoomSwitchControlDeserializer();

    private ZoomSwitchControlDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final ZoomSwitchControl fromJson(@NotNull Context context, @NotNull JsonValue json) {
        Intrinsics.h(context, "context");
        Intrinsics.h(json, "json");
        ZoomSwitchControl zoomSwitchControl = new ZoomSwitchControl(context);
        updateFromJson(zoomSwitchControl, json);
        return zoomSwitchControl;
    }

    @JvmStatic
    public static final void updateFromJson(@NotNull ZoomSwitchControl control, @NotNull JsonValue json) {
        Bitmap defaultZoomedInImage;
        Bitmap defaultZoomedOutPressedImage;
        Bitmap defaultZoomedInPressedImage;
        Bitmap bitmapBitmapByKey;
        Intrinsics.h(control, "control");
        Intrinsics.h(json, "json");
        Bitmap defaultZoomedOutImage = null;
        JsonValue byKeyAsObject = json.getByKeyAsObject(BarcodePickDeserializer.FIELD_ICON, null);
        if (byKeyAsObject != null) {
            JsonValue byKeyAsObject2 = byKeyAsObject.getByKeyAsObject("zoomedOut", null);
            if (byKeyAsObject2 != null) {
                bitmapBitmapByKey = JsonExtensionsKt.bitmapByKey(byKeyAsObject2, "default");
                defaultZoomedOutPressedImage = JsonExtensionsKt.bitmapByKey(byKeyAsObject2, "pressed");
            } else {
                defaultZoomedOutPressedImage = null;
                bitmapBitmapByKey = null;
            }
            JsonValue byKeyAsObject3 = byKeyAsObject.getByKeyAsObject("zoomedIn", null);
            if (byKeyAsObject3 != null) {
                Bitmap bitmapBitmapByKey2 = JsonExtensionsKt.bitmapByKey(byKeyAsObject3, "default");
                defaultZoomedInPressedImage = JsonExtensionsKt.bitmapByKey(byKeyAsObject3, "pressed");
                defaultZoomedInImage = bitmapBitmapByKey2;
            } else {
                defaultZoomedInImage = null;
                defaultZoomedInPressedImage = null;
            }
            defaultZoomedOutImage = bitmapBitmapByKey;
        } else {
            defaultZoomedInImage = null;
            defaultZoomedOutPressedImage = null;
            defaultZoomedInPressedImage = null;
        }
        if (defaultZoomedOutImage == null) {
            defaultZoomedOutImage = control.getDefaultZoomedOutImage();
        }
        control.setZoomedOutImage(defaultZoomedOutImage);
        if (defaultZoomedOutPressedImage == null) {
            defaultZoomedOutPressedImage = control.getDefaultZoomedOutPressedImage();
        }
        control.setZoomedOutPressedImage(defaultZoomedOutPressedImage);
        if (defaultZoomedInImage == null) {
            defaultZoomedInImage = control.getDefaultZoomedInImage();
        }
        control.setZoomedInImage(defaultZoomedInImage);
        if (defaultZoomedInPressedImage == null) {
            defaultZoomedInPressedImage = control.getDefaultZoomedInPressedImage();
        }
        control.setZoomedInPressedImage(defaultZoomedInPressedImage);
    }
}

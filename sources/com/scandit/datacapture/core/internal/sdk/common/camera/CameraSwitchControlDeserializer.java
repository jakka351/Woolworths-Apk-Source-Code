package com.scandit.datacapture.core.internal.sdk.common.camera;

import android.content.Context;
import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.C1107r0;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.JsonExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.serialization.FrameSourceDeserializer;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/camera/CameraSwitchControlDeserializer;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/core/ui/control/CameraSwitchControl;", "fromJson", "control", "", "updateFromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class CameraSwitchControlDeserializer {

    @NotNull
    public static final CameraSwitchControlDeserializer INSTANCE = new CameraSwitchControlDeserializer();

    private CameraSwitchControlDeserializer() {
    }

    private static Camera a(JsonValue jsonValue) {
        FrameSource frameSourceFrameSourceFromJsonValue$scandit_capture_core = new FrameSourceDeserializer(EmptyList.d).frameSourceFromJsonValue$scandit_capture_core(jsonValue);
        Camera camera = frameSourceFrameSourceFromJsonValue$scandit_capture_core instanceof Camera ? (Camera) frameSourceFrameSourceFromJsonValue$scandit_capture_core : null;
        if (camera != null) {
            return camera;
        }
        throw new IllegalStateException((jsonValue.getAbsolutePath() + ": not a valid camera").toString());
    }

    @JvmStatic
    @NotNull
    public static final CameraSwitchControl fromJson(@NotNull Context context, @NotNull JsonValue json) {
        Intrinsics.h(context, "context");
        Intrinsics.h(json, "json");
        CameraSwitchControlDeserializer cameraSwitchControlDeserializer = INSTANCE;
        JsonValue jsonValueRequireByKeyAsObject = json.requireByKeyAsObject("primaryCamera");
        cameraSwitchControlDeserializer.getClass();
        CameraSwitchControl cameraSwitchControl = new CameraSwitchControl(context, a(jsonValueRequireByKeyAsObject), a(json.requireByKeyAsObject("secondaryCamera")));
        a(cameraSwitchControl, json);
        return cameraSwitchControl;
    }

    @JvmStatic
    public static final void updateFromJson(@NotNull CameraSwitchControl control, @NotNull JsonValue json) {
        Intrinsics.h(control, "control");
        Intrinsics.h(json, "json");
        JsonValue byKeyAsObject = json.getByKeyAsObject("primaryCamera", null);
        if (byKeyAsObject != null) {
            INSTANCE.getClass();
            control.set_primaryCamera$scandit_capture_core(a(byKeyAsObject));
        }
        JsonValue byKeyAsObject2 = json.getByKeyAsObject("secondaryCamera", null);
        if (byKeyAsObject2 != null) {
            INSTANCE.getClass();
            control.set_secondaryCamera$scandit_capture_core(a(byKeyAsObject2));
        }
        INSTANCE.getClass();
        a(control, json);
    }

    private static void a(CameraSwitchControl cameraSwitchControl, JsonValue jsonValue) {
        Bitmap bitmapBitmapFromResource;
        Bitmap bitmapBitmapFromResource2;
        Bitmap bitmapBitmapFromResource3;
        Bitmap bitmapBitmapByKey;
        C1107r0 c1107r0 = new C1107r0();
        Bitmap bitmapBitmapFromResource4 = null;
        JsonValue byKeyAsObject = jsonValue.getByKeyAsObject(BarcodePickDeserializer.FIELD_ICON, null);
        if (byKeyAsObject != null) {
            JsonValue byKeyAsObject2 = byKeyAsObject.getByKeyAsObject("primaryCamera", null);
            if (byKeyAsObject2 != null) {
                bitmapBitmapByKey = JsonExtensionsKt.bitmapByKey(byKeyAsObject2, "default");
                bitmapBitmapFromResource2 = JsonExtensionsKt.bitmapByKey(byKeyAsObject2, "pressed");
            } else {
                bitmapBitmapFromResource2 = null;
                bitmapBitmapByKey = null;
            }
            JsonValue byKeyAsObject3 = byKeyAsObject.getByKeyAsObject("secondaryCamera", null);
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
        if (bitmapBitmapFromResource4 == null) {
            bitmapBitmapFromResource4 = BitmapExtensionsKt.bitmapFromResource(c1107r0.a());
        }
        cameraSwitchControl.setPrimaryCameraImage(bitmapBitmapFromResource4);
        if (bitmapBitmapFromResource2 == null) {
            bitmapBitmapFromResource2 = BitmapExtensionsKt.bitmapFromResource(c1107r0.b());
        }
        cameraSwitchControl.setPrimaryCameraPressedImage(bitmapBitmapFromResource2);
        if (bitmapBitmapFromResource == null) {
            bitmapBitmapFromResource = BitmapExtensionsKt.bitmapFromResource(c1107r0.c());
        }
        cameraSwitchControl.setSecondaryCameraImage(bitmapBitmapFromResource);
        if (bitmapBitmapFromResource3 == null) {
            bitmapBitmapFromResource3 = BitmapExtensionsKt.bitmapFromResource(c1107r0.d());
        }
        cameraSwitchControl.setSecondaryCameraPressedImage(bitmapBitmapFromResource3);
    }
}

package com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.internal.sdk.common.camera.CameraSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.common.torch.TorchSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.common.zoom.ZoomSwitchControlDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import com.scandit.datacapture.core.ui.control.LinearControlGroupBuilder;
import com.scandit.datacapture.core.ui.control.LinearControlGroupOrientation;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/linearcontrolgroup/LinearControlGroupDeserializer;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroup;", "fromJson", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class LinearControlGroupDeserializer {

    @NotNull
    public static final LinearControlGroupDeserializer INSTANCE = new LinearControlGroupDeserializer();

    private LinearControlGroupDeserializer() {
    }

    @JvmStatic
    @NotNull
    public static final LinearControlGroup fromJson(@NotNull Context context, @NotNull JsonValue json) {
        Object objFromJson;
        Intrinsics.h(context, "context");
        Intrinsics.h(json, "json");
        LinearControlGroupOrientation linearControlGroupOrientationFromString = LinearControlGroupOrientationDeserializer.fromString(json.getByKeyAsString("orientation", "vertical"));
        FloatWithUnit byKeyAsFloatWithUnit = json.getByKeyAsFloatWithUnit("spacing", new FloatWithUnit(BitmapDescriptorFactory.HUE_RED, MeasureUnit.PIXEL));
        ArrayList arrayList = new ArrayList();
        JsonValue byKeyAsArray = json.getByKeyAsArray("childControls", null);
        if (byKeyAsArray != null) {
            int size = (int) byKeyAsArray.getSize();
            for (int i = 0; i < size; i++) {
                JsonValue jsonValueRequireByIndex = byKeyAsArray.requireByIndex(i);
                LinearControlGroupDeserializer linearControlGroupDeserializer = INSTANCE;
                a aVar = new a(arrayList);
                linearControlGroupDeserializer.getClass();
                String strRequireByKeyAsString = jsonValueRequireByIndex.requireByKeyAsString("type");
                if (Intrinsics.c(strRequireByKeyAsString, "linearGroup")) {
                    throw new IllegalStateException("Nested LinearControlGroups are not allowed");
                }
                int iHashCode = strRequireByKeyAsString.hashCode();
                if (iHashCode == -1367751899) {
                    if (!strRequireByKeyAsString.equals("camera")) {
                        throw new IllegalStateException((jsonValueRequireByIndex.getAbsolutePath() + ".type is required to be one of [torch, camera, zoom, linearGroup]").toString());
                    }
                    objFromJson = CameraSwitchControlDeserializer.fromJson(context, jsonValueRequireByIndex);
                    aVar.invoke(objFromJson);
                } else if (iHashCode != 3744723) {
                    if (iHashCode != 110547964 || !strRequireByKeyAsString.equals("torch")) {
                        throw new IllegalStateException((jsonValueRequireByIndex.getAbsolutePath() + ".type is required to be one of [torch, camera, zoom, linearGroup]").toString());
                    }
                    objFromJson = TorchSwitchControlDeserializer.fromJson(context, jsonValueRequireByIndex);
                    aVar.invoke(objFromJson);
                } else {
                    if (!strRequireByKeyAsString.equals("zoom")) {
                        throw new IllegalStateException((jsonValueRequireByIndex.getAbsolutePath() + ".type is required to be one of [torch, camera, zoom, linearGroup]").toString());
                    }
                    objFromJson = ZoomSwitchControlDeserializer.fromJson(context, jsonValueRequireByIndex);
                    aVar.invoke(objFromJson);
                }
            }
        }
        return new LinearControlGroupBuilder(context).setOrientation(linearControlGroupOrientationFromString).setSpacing(byKeyAsFloatWithUnit).setControls(arrayList).build();
    }
}

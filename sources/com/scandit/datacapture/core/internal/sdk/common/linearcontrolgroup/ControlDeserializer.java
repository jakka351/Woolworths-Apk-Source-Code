package com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.scandit.datacapture.core.AbstractC1108r1;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.AnchorDeserializer;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.internal.module.ui.control.layout.ControlLayout;
import com.scandit.datacapture.core.internal.sdk.common.camera.CameraSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.common.torch.TorchSwitchControlDeserializer;
import com.scandit.datacapture.core.internal.sdk.common.zoom.ZoomSwitchControlDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import com.scandit.datacapture.core.ui.control.Control;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062$\u0010\u000e\u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/linearcontrolgroup/ControlDeserializer;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "", "Lcom/scandit/datacapture/core/ui/control/Control;", "currentControls", "Lkotlin/Function4;", "Lcom/scandit/datacapture/core/internal/sdk/common/linearcontrolgroup/ControlDeserializer$ControlAction;", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "", "callback", "deserializeControl", "<init>", "()V", "ControlAction", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ControlDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private static final PointWithUnit f18689a = PointWithUnitUtilsKt.PointWithUnit(-1.0f, -1.0f, MeasureUnit.PIXEL);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/common/linearcontrolgroup/ControlDeserializer$ControlAction;", "", "ADD", "UPDATE", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public enum ControlAction {
        ADD,
        UPDATE
    }

    public final void deserializeControl(@NotNull Context context, @NotNull JsonValue json, @NotNull List<? extends Control> currentControls, @NotNull Function4<? super Control, ? super ControlAction, ? super Anchor, ? super PointWithUnit, Unit> callback) {
        Object control;
        ControlAction controlAction;
        Anchor anchorFromJson;
        Intrinsics.h(context, "context");
        Intrinsics.h(json, "json");
        Intrinsics.h(currentControls, "currentControls");
        Intrinsics.h(callback, "callback");
        String strRequireByKeyAsString = json.requireByKeyAsString("type");
        if (Intrinsics.c(strRequireByKeyAsString, "linearGroup")) {
            control = LinearControlGroupDeserializer.fromJson(context, json);
            controlAction = ControlAction.ADD;
        } else {
            int iHashCode = strRequireByKeyAsString.hashCode();
            Object obj = null;
            if (iHashCode != -1367751899) {
                if (iHashCode != 3744723) {
                    if (iHashCode == 110547964 && strRequireByKeyAsString.equals("torch")) {
                        Iterator<T> it = currentControls.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((Control) next) instanceof TorchSwitchControl) {
                                obj = next;
                                break;
                            }
                        }
                        obj = (Control) obj;
                    }
                } else if (strRequireByKeyAsString.equals("zoom")) {
                    Iterator<T> it2 = currentControls.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (((Control) next2) instanceof ZoomSwitchControl) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (Control) obj;
                }
            } else if (strRequireByKeyAsString.equals("camera")) {
                Iterator<T> it3 = currentControls.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next3 = it3.next();
                    if (((Control) next3) instanceof CameraSwitchControl) {
                        obj = next3;
                        break;
                    }
                }
                obj = (Control) obj;
            }
            if (obj == null) {
                int iHashCode2 = strRequireByKeyAsString.hashCode();
                if (iHashCode2 == -1367751899) {
                    if (strRequireByKeyAsString.equals("camera")) {
                        control = CameraSwitchControlDeserializer.fromJson(context, json);
                        controlAction = ControlAction.ADD;
                    }
                    throw new IllegalStateException((json.getAbsolutePath() + ".type is required to be one of [torch, camera, zoom, linearGroup]").toString());
                }
                if (iHashCode2 == 3744723) {
                    if (strRequireByKeyAsString.equals("zoom")) {
                        control = ZoomSwitchControlDeserializer.fromJson(context, json);
                        controlAction = ControlAction.ADD;
                    }
                    throw new IllegalStateException((json.getAbsolutePath() + ".type is required to be one of [torch, camera, zoom, linearGroup]").toString());
                }
                if (iHashCode2 == 110547964 && strRequireByKeyAsString.equals("torch")) {
                    control = TorchSwitchControlDeserializer.fromJson(context, json);
                    controlAction = ControlAction.ADD;
                }
                throw new IllegalStateException((json.getAbsolutePath() + ".type is required to be one of [torch, camera, zoom, linearGroup]").toString());
            }
            if (obj instanceof TorchSwitchControl) {
                TorchSwitchControlDeserializer.updateFromJson((TorchSwitchControl) obj, json);
            } else if (obj instanceof CameraSwitchControl) {
                CameraSwitchControlDeserializer.updateFromJson((CameraSwitchControl) obj, json);
            } else if (obj instanceof ZoomSwitchControl) {
                ZoomSwitchControlDeserializer.updateFromJson((ZoomSwitchControl) obj, json);
            }
            controlAction = ControlAction.UPDATE;
            control = obj;
        }
        String byKeyAsString = json.getByKeyAsString("anchor", DevicePublicKeyStringDef.NONE);
        if (Intrinsics.c(byKeyAsString, DevicePublicKeyStringDef.NONE)) {
            int i = ControlLayout.f;
            Intrinsics.h(control, "control");
            anchorFromJson = control instanceof TorchSwitchControl ? Anchor.TOP_LEFT : control instanceof CameraSwitchControl ? Anchor.TOP_RIGHT : ((control instanceof ZoomSwitchControl) || (control instanceof LinearControlGroup)) ? Anchor.BOTTOM_RIGHT : Anchor.TOP_LEFT;
        } else {
            anchorFromJson = AnchorDeserializer.fromJson(byKeyAsString);
        }
        PointWithUnit pointWithUnit = f18689a;
        PointWithUnit byKeyAsPointWithUnit = json.getByKeyAsPointWithUnit("offset", pointWithUnit);
        if (Intrinsics.c(byKeyAsPointWithUnit, pointWithUnit)) {
            int i2 = ControlLayout.f;
            byKeyAsPointWithUnit = AbstractC1108r1.a(anchorFromJson);
        }
        callback.invoke(control, controlAction, anchorFromJson, byKeyAsPointWithUnit);
    }
}

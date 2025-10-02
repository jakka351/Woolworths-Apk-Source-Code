package com.scandit.datacapture.barcode.count.serialization;

import android.content.Context;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountViewStyle;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.json.JsonValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountViewDeserializer;", "", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "mode", "", "json", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "viewFromJson", "view", "", "updateViewFromJson", "", "b", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "warnings", "<init>", "()V", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeCountViewDeserializer {

    @NotNull
    public static final String KEY_HW_TRIGGER_ENABLED = "hardwareTriggerEnabled";

    @NotNull
    public static final String KEY_HW_TRIGGER_KEY_CODE = "hardwareTriggerKeyCode";

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f17527a;
    private final ArrayList b;

    public BarcodeCountViewDeserializer() {
        ArrayList arrayList = new ArrayList();
        this.f17527a = arrayList;
        this.b = arrayList;
    }

    private static Boolean a(JsonValue jsonValue, String str) {
        if (jsonValue.contains(str)) {
            return Boolean.valueOf(jsonValue.getByKeyAsBoolean(str, false));
        }
        return null;
    }

    @NotNull
    public final List<String> getWarnings() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateViewFromJson(@org.jetbrains.annotations.NotNull com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer.updateViewFromJson(com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView, java.lang.String):void");
    }

    @NotNull
    public final BarcodeCountView viewFromJson(@NotNull Context context, @NotNull DataCaptureContext dataCaptureContext, @NotNull BarcodeCount mode, @NotNull String json) {
        Intrinsics.h(context, "context");
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        JsonValue jsonValue = new JsonValue(json);
        BarcodeCountViewStyle barcodeCountViewStyle = BarcodeCountViewStyle.ICON;
        String byKeyAsString = jsonValue.getByKeyAsString("style", "");
        if (Intrinsics.c(byKeyAsString, "dot")) {
            barcodeCountViewStyle = BarcodeCountViewStyle.DOT;
        } else {
            Intrinsics.c(byKeyAsString, BarcodePickDeserializer.FIELD_ICON);
        }
        jsonValue._removeKeys(CollectionsKt.k("style"));
        BarcodeCountView barcodeCountViewNewInstance = BarcodeCountView.INSTANCE.newInstance(context, dataCaptureContext, mode, barcodeCountViewStyle);
        updateViewFromJson(barcodeCountViewNewInstance, jsonValue.jsonString());
        return barcodeCountViewNewInstance;
    }
}

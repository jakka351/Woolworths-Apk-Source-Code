package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickIconStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class V3 {
    public static final InterfaceC0600e4 a(BarcodePickViewHighlightStyle barcodePickViewHighlightStyle) {
        BarcodePickIconStyle iconStyle;
        Intrinsics.h(barcodePickViewHighlightStyle, "<this>");
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            iconStyle = ((BarcodePickViewHighlightStyle.DotWithIcons) barcodePickViewHighlightStyle).getIconStyle();
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            iconStyle = ((BarcodePickViewHighlightStyle.RectangularWithIcons) barcodePickViewHighlightStyle).getIconStyle();
        } else {
            if (!(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView)) {
                throw new NoWhenBranchMatchedException();
            }
            iconStyle = null;
        }
        int i = iconStyle == null ? -1 : U3.f17313a[iconStyle.ordinal()];
        if (i == -1) {
            return C0632g4.f17678a;
        }
        if (i == 1) {
            return new C0897w3();
        }
        if (i == 2) {
            return new C0927y3();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String a(BarcodePickViewHighlightStyle barcodePickViewHighlightStyle, String json) throws JSONException {
        BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder;
        Intrinsics.h(barcodePickViewHighlightStyle, "<this>");
        Intrinsics.h(json, "json");
        if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            barcodePickHighlightStyleIconsHolder = ((BarcodePickViewHighlightStyle.RectangularWithIcons) barcodePickViewHighlightStyle).get_iconsHolder();
        } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            barcodePickHighlightStyleIconsHolder = ((BarcodePickViewHighlightStyle.DotWithIcons) barcodePickViewHighlightStyle).get_iconsHolder();
        } else {
            if (!(barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.Dot ? true : barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.CustomView)) {
                throw new NoWhenBranchMatchedException();
            }
            barcodePickHighlightStyleIconsHolder = null;
        }
        if (barcodePickHighlightStyleIconsHolder == null) {
            return json;
        }
        JSONObject jSONObject = new JSONObject(json);
        JSONArray jSONArrayA = Z3.a(barcodePickHighlightStyleIconsHolder);
        if (jSONArrayA != null) {
            jSONObject.put(BarcodePickDeserializer.FIELD_ICONS_FOR_STATE, jSONArrayA);
        }
        JSONArray jSONArrayB = Z3.b(barcodePickHighlightStyleIconsHolder);
        if (jSONArrayB != null) {
            jSONObject.put(BarcodePickDeserializer.FIELD_SELECTED_ICONS_FOR_STATE, jSONArrayB);
        }
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject(json).also { …       }\n    }.toString()");
        return string;
    }
}

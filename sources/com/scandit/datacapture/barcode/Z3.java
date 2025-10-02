package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class Z3 {
    public static final JSONArray a(BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder) {
        Intrinsics.h(barcodePickHighlightStyleIconsHolder, "<this>");
        return a(new X3(barcodePickHighlightStyleIconsHolder));
    }

    public static final JSONArray b(BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder) {
        Intrinsics.h(barcodePickHighlightStyleIconsHolder, "<this>");
        return a(new Y3(barcodePickHighlightStyleIconsHolder));
    }

    private static final JSONArray a(Function1 function1) throws JSONException {
        BarcodePickState[] barcodePickStateArrValues = BarcodePickState.values();
        JSONArray jSONArray = new JSONArray();
        int length = barcodePickStateArrValues.length;
        int i = 0;
        while (true) {
            Bitmap bitmapCreateBitmap = null;
            if (i >= length) {
                break;
            }
            BarcodePickState barcodePickState = barcodePickStateArrValues[i];
            BarcodePickIcon barcodePickIcon = (BarcodePickIcon) function1.invoke(barcodePickState);
            if (!Intrinsics.c(barcodePickIcon, G8.b)) {
                Context context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
                Intrinsics.h(barcodePickIcon, "<this>");
                Intrinsics.h(context, "context");
                Drawable drawableA = barcodePickIcon.a(context);
                if (drawableA != null) {
                    if (drawableA instanceof BitmapDrawable) {
                        bitmapCreateBitmap = ((BitmapDrawable) drawableA).getBitmap();
                    } else {
                        drawableA.setBounds(0, 0, drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight());
                        bitmapCreateBitmap = Bitmap.createBitmap(drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        drawableA.draw(new Canvas(bitmapCreateBitmap));
                    }
                }
                if (bitmapCreateBitmap != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(BarcodePickDeserializer.FIELD_BARCODE_PICK_STATE, barcodePickState.toJsonString());
                    jSONObject.put(BarcodePickDeserializer.FIELD_ICON, BitmapExtensionsKt.toBase64(bitmapCreateBitmap));
                    jSONArray.put(jSONObject);
                }
            }
            i++;
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }
}

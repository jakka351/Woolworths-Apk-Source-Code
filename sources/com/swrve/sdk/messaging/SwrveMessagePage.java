package com.swrve.sdk.messaging;

import android.graphics.Point;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SwrveMessagePage {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19101a = new ArrayList();
    public final ArrayList b;
    public final String c;
    public final long d;
    public final long e;
    public final int f;

    public SwrveMessagePage(SwrveMessage swrveMessage, JSONObject jSONObject) throws JSONException, NumberFormatException {
        String string;
        JSONArray jSONArray = jSONObject.getJSONArray("buttons");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            SwrveButton swrveButton = new SwrveButton(jSONObject2);
            if (jSONObject2.has(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                swrveButton.u = jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            }
            if (jSONObject2.has("button_id")) {
                swrveButton.v = jSONObject2.getLong("button_id");
            }
            swrveButton.f19105a = new Point(jSONObject2.getJSONObject("x").getInt("value"), jSONObject2.getJSONObject("y").getInt("value"));
            swrveButton.b = new Point(jSONObject2.getJSONObject("w").getInt("value"), jSONObject2.getJSONObject("h").getInt("value"));
            if (jSONObject2.has("image_up")) {
                swrveButton.w = jSONObject2.getJSONObject("image_up").getString("value");
            }
            swrveButton.y = swrveMessage;
            if (jSONObject2.has("game_id") && (string = jSONObject2.getJSONObject("game_id").getString("value")) != null && !string.equals("")) {
                Integer.parseInt(string);
            }
            if (jSONObject2.has("accessibility_text")) {
                swrveButton.A = jSONObject2.getString("accessibility_text");
            }
            swrveButton.x = jSONObject2.getJSONObject(UrlHandler.ACTION).getString("value");
            String string2 = jSONObject2.getJSONObject("type").getString("value");
            swrveButton.z = string2.equalsIgnoreCase("install") ? SwrveActionType.f : string2.equalsIgnoreCase("dismiss") ? SwrveActionType.d : string2.equalsIgnoreCase("copy_to_clipboard") ? SwrveActionType.g : string2.equalsIgnoreCase("request_capability") ? SwrveActionType.h : string2.equalsIgnoreCase("page_link") ? SwrveActionType.i : string2.equalsIgnoreCase("open_notification_settings") ? SwrveActionType.j : string2.equalsIgnoreCase("open_app_settings") ? SwrveActionType.k : string2.equalsIgnoreCase("start_geo") ? SwrveActionType.l : SwrveActionType.e;
            if (jSONObject2.has("events")) {
                swrveButton.B = jSONObject2.getJSONArray("events");
            }
            if (jSONObject2.has("user_updates")) {
                swrveButton.C = jSONObject2.getJSONArray("user_updates");
            }
            if (jSONObject2.has("theme")) {
                swrveButton.D = new SwrveButtonTheme(jSONObject2.getJSONObject("theme"));
            }
            this.f19101a.add(swrveButton);
        }
        this.b = new ArrayList();
        JSONArray jSONArray2 = jSONObject.getJSONArray("images");
        int length2 = jSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
            SwrveImage swrveImage = new SwrveImage(jSONObject3);
            swrveImage.f19105a = new Point(jSONObject3.getJSONObject("x").getInt("value"), jSONObject3.getJSONObject("y").getInt("value"));
            swrveImage.b = new Point(jSONObject3.getJSONObject("w").getInt("value"), jSONObject3.getJSONObject("h").getInt("value"));
            if (jSONObject3.has("image")) {
                swrveImage.u = jSONObject3.getJSONObject("image").getString("value");
            }
            this.b.add(swrveImage);
        }
        if (jSONObject.has("page_id")) {
            this.d = jSONObject.getLong("page_id");
        }
        if (jSONObject.has("page_name")) {
            this.c = jSONObject.getString("page_name");
        }
        if (jSONObject.has("swipe_forward")) {
            this.e = jSONObject.getLong("swipe_forward");
        }
        if (jSONObject.has("swipe_backward")) {
            jSONObject.getLong("swipe_backward");
        }
        if (jSONObject.has("page_duration")) {
            this.f = jSONObject.getInt("page_duration");
        }
    }

    public final ArrayList a() {
        return this.f19101a;
    }
}

package com.swrve.sdk.messaging;

import YU.a;
import android.graphics.Color;
import android.graphics.Point;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.swrve.sdk.SwrveAssetsTypes;
import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveLogger;
import com.swrve.sdk.messaging.SwrveStorySettings;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.i18n.TextBundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SwrveMessage implements SwrveBaseMessage {

    /* renamed from: a, reason: collision with root package name */
    public final int f19098a;
    public final int b;
    public final SwrveMessageCenterDetails c;
    public final SwrveInAppCampaign d;
    public final ArrayList e = new ArrayList();
    public final File f;
    public final boolean g;

    public SwrveMessage(SwrveInAppCampaign swrveInAppCampaign, JSONObject jSONObject, File file) throws JSONException {
        JSONArray jSONArray;
        int i;
        SwrveStorySettings.LastPageProgression lastPageProgression;
        SwrveOrientation swrveOrientation;
        this.b = 9999;
        this.d = swrveInAppCampaign;
        this.f = file;
        this.f19098a = jSONObject.getInt("id");
        jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (jSONObject.has("priority")) {
            this.b = jSONObject.getInt("priority");
        }
        if (jSONObject.has("message_center_details")) {
            this.c = new SwrveMessageCenterDetails(jSONObject.getJSONObject("message_center_details"));
        }
        JSONArray jSONArray2 = jSONObject.getJSONObject("template").getJSONArray("formats");
        int length = jSONArray2.length();
        int i2 = 0;
        while (i2 < length) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
            SwrveMessageFormat swrveMessageFormat = new SwrveMessageFormat();
            swrveMessageFormat.h = this;
            swrveMessageFormat.f19100a = 1.0f;
            String string = jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("size");
            Point point = new Point(jSONObject3.getJSONObject("w").getInt("value"), jSONObject3.getJSONObject("h").getInt("value"));
            swrveMessageFormat.b = point;
            SwrveLogger.e("Format name:%s size.x:%s size.y:%s scale:%s", string, Integer.valueOf(point.x), Integer.valueOf(point.y), Float.valueOf(1.0f));
            if (jSONObject2.has("orientation")) {
                String string2 = jSONObject2.getString("orientation");
                if (string2.equalsIgnoreCase("portrait")) {
                    swrveOrientation = SwrveOrientation.d;
                } else {
                    swrveOrientation = (!string2.equalsIgnoreCase("landscape") && string2.equalsIgnoreCase("both")) ? SwrveOrientation.f : SwrveOrientation.e;
                }
                swrveMessageFormat.c = swrveOrientation;
            }
            if (jSONObject2.has("scale")) {
                swrveMessageFormat.f19100a = Float.parseFloat(jSONObject2.getString("scale"));
            }
            if (jSONObject2.has("color")) {
                String string3 = jSONObject2.getString("color");
                if (!SwrveHelper.p(string3)) {
                    swrveMessageFormat.d = Integer.valueOf(Color.parseColor("#" + string3));
                }
            }
            HashMap map = new HashMap();
            swrveMessageFormat.e = map;
            swrveMessageFormat.f = new ArrayList();
            swrveMessageFormat.g = new ArrayList();
            if (jSONObject2.has("pages")) {
                JSONArray jSONArray3 = jSONObject2.getJSONArray("pages");
                int i3 = 0;
                while (i3 < jSONArray3.length()) {
                    SwrveMessagePage swrveMessagePage = new SwrveMessagePage(this, jSONArray3.getJSONObject(i3));
                    JSONArray jSONArray4 = jSONArray2;
                    int i4 = length;
                    swrveMessageFormat.e.put(Long.valueOf(swrveMessagePage.d), swrveMessagePage);
                    int i5 = i3;
                    swrveMessageFormat.f.add(Long.valueOf(swrveMessagePage.d));
                    int i6 = swrveMessagePage.f;
                    if (i6 > 0) {
                        swrveMessageFormat.g.add(Integer.valueOf(i6));
                    }
                    if (i5 == 0) {
                        swrveMessageFormat.k = swrveMessagePage.d;
                    }
                    i3 = i5 + 1;
                    jSONArray2 = jSONArray4;
                    length = i4;
                }
                jSONArray = jSONArray2;
                i = length;
            } else {
                jSONArray = jSONArray2;
                i = length;
                if (jSONObject2.has("buttons") && jSONObject2.has("images")) {
                    map.put(0L, new SwrveMessagePage(this, jSONObject2));
                    swrveMessageFormat.k = 0L;
                }
            }
            if (jSONObject2.has("calibration")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("calibration");
                SwrveCalibration swrveCalibration = new SwrveCalibration();
                if (jSONObject4 != null && jSONObject4.has("width")) {
                    swrveCalibration.f19094a = jSONObject4.getInt("width");
                }
                if (jSONObject4 != null && jSONObject4.has("height")) {
                    swrveCalibration.b = jSONObject4.getInt("height");
                }
                if (jSONObject4 != null && jSONObject4.has("base_font_size")) {
                    swrveCalibration.c = jSONObject4.getInt("base_font_size");
                }
                if (jSONObject4 != null && jSONObject4.has(TextBundle.TEXT_ENTRY)) {
                    swrveCalibration.d = jSONObject4.getString(TextBundle.TEXT_ENTRY);
                }
                swrveMessageFormat.i = swrveCalibration;
            }
            if (jSONObject2.has("story_settings")) {
                JSONObject jSONObject5 = jSONObject2.getJSONObject("story_settings");
                SwrveStorySettings swrveStorySettings = new SwrveStorySettings();
                if (jSONObject5 != null) {
                    swrveStorySettings.f19103a = jSONObject5.getInt("page_duration");
                    String string4 = jSONObject5.getString("last_page_progression");
                    if (string4.equalsIgnoreCase("dismiss")) {
                        lastPageProgression = SwrveStorySettings.LastPageProgression.d;
                    } else {
                        lastPageProgression = (!string4.equalsIgnoreCase("stop") && string4.equalsIgnoreCase("loop")) ? SwrveStorySettings.LastPageProgression.f : SwrveStorySettings.LastPageProgression.e;
                    }
                    swrveStorySettings.b = lastPageProgression;
                    if (jSONObject5.has("last_page_dismiss_id")) {
                        swrveStorySettings.l = jSONObject5.getLong("last_page_dismiss_id");
                    }
                    if (jSONObject5.has("last_page_dismiss_name")) {
                        swrveStorySettings.m = jSONObject5.getString("last_page_dismiss_name");
                    }
                    JSONObject jSONObject6 = jSONObject5.getJSONObject("padding");
                    swrveStorySettings.c = jSONObject6.getInt("top");
                    jSONObject6.getInt("bottom");
                    swrveStorySettings.d = jSONObject6.getInt("right");
                    swrveStorySettings.e = jSONObject6.getInt("left");
                    JSONObject jSONObject7 = jSONObject5.getJSONObject("progress_bar");
                    swrveStorySettings.f = jSONObject7.getString("bar_color");
                    swrveStorySettings.g = jSONObject7.getString("bg_color");
                    swrveStorySettings.h = jSONObject7.getInt("h");
                    swrveStorySettings.i = jSONObject7.getInt("segment_gap");
                    if (!jSONObject5.has("gestures_enabled") || jSONObject5.isNull("gestures_enabled")) {
                        swrveStorySettings.j = true;
                    } else {
                        swrveStorySettings.j = jSONObject5.getBoolean("gestures_enabled");
                    }
                    if (jSONObject5.has("dismiss_button") && !jSONObject5.isNull("dismiss_button")) {
                        JSONObject jSONObject8 = jSONObject5.getJSONObject("dismiss_button");
                        SwrveStoryDismissButton swrveStoryDismissButton = new SwrveStoryDismissButton();
                        if (jSONObject8 != null) {
                            swrveStoryDismissButton.f19102a = jSONObject8.getInt("id");
                            swrveStoryDismissButton.b = jSONObject8.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                            swrveStoryDismissButton.c = jSONObject8.getString("color");
                            swrveStoryDismissButton.d = jSONObject8.getString("pressed_color");
                            if (jSONObject8.has("focused_color")) {
                                swrveStoryDismissButton.e = jSONObject8.getString("focused_color");
                            }
                            swrveStoryDismissButton.f = jSONObject8.getInt("size");
                            swrveStoryDismissButton.g = jSONObject8.getInt("margin_top");
                            swrveStoryDismissButton.h = jSONObject8.getString("accessibility_text");
                        }
                        swrveStorySettings.k = swrveStoryDismissButton;
                    }
                }
                swrveMessageFormat.j = swrveStorySettings;
            }
            this.e.add(swrveMessageFormat);
            i2++;
            jSONArray2 = jSONArray;
            length = i;
        }
        if (jSONObject.has("control")) {
            this.g = jSONObject.getBoolean("control");
        }
    }

    public static boolean f(String str, Set set) {
        if (SwrveHelper.o(str) && set.contains(str)) {
            return true;
        }
        if (!SwrveHelper.o(str)) {
            return false;
        }
        for (Map.Entry entry : SwrveAssetsTypes.f19041a.entrySet()) {
            StringBuilder sbS = a.s(str);
            sbS.append((String) entry.getValue());
            if (set.contains(sbS.toString())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseMessage
    public final SwrveBaseCampaign a() {
        return this.d;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseMessage
    public final int b() {
        return this.b;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseMessage
    public final boolean c() {
        return this.g;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseMessage
    public final boolean d(SwrveOrientation swrveOrientation) {
        SwrveMessageFormat swrveMessageFormat;
        if (swrveOrientation == SwrveOrientation.f) {
            return true;
        }
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                swrveMessageFormat = (SwrveMessageFormat) it.next();
                if (swrveMessageFormat.c == swrveOrientation) {
                    break;
                }
            }
            swrveMessageFormat = null;
        } else {
            swrveMessageFormat = null;
        }
        return swrveMessageFormat != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0100, code lost:
    
        r3 = r3.b.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
    
        if (r3.hasNext() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010c, code lost:
    
        r4 = (com.swrve.sdk.messaging.SwrveImage) r3.next();
        r5 = r4.u;
        r8 = r4.f;
        r9 = r4.d;
        r10 = f(r5, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011c, code lost:
    
        if (r10 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0122, code lost:
    
        if (com.swrve.sdk.SwrveHelper.o(r9) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0124, code lost:
    
        r9 = com.swrve.sdk.SwrveTextTemplating.a(r9, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0134, code lost:
    
        if (f(com.swrve.sdk.SwrveHelper.u(r9.getBytes()), r14) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0136, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0138, code lost:
    
        com.swrve.sdk.SwrveLogger.e("Image dynamic asset not yet downloaded: %s", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0141, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0142, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0143, code lost:
    
        com.swrve.sdk.SwrveLogger.e("Could not resolve personalization", r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.util.Map r13, java.util.Set r14) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.messaging.SwrveMessage.e(java.util.Map, java.util.Set):boolean");
    }

    public final SwrveInAppCampaign g() {
        return this.d;
    }

    @Override // com.swrve.sdk.messaging.SwrveBaseMessage
    public final int getId() {
        return this.f19098a;
    }

    public final List h() {
        return this.e;
    }

    public final SwrveMessageCenterDetails i() {
        return this.c;
    }
}

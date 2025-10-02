package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class t5 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<Component> f16712a;

    public t5(JSONObject jSONObject) {
        this.f16712a = new ArrayList<>();
        try {
            if (!jSONObject.has("components") || jSONObject.isNull("components")) {
                return;
            }
            this.f16712a = ModelFactory.getInstance().getComponentsArray(jSONObject.getJSONArray("components"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public ArrayList<Component> a() {
        return this.f16712a;
    }
}

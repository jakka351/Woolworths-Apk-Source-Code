package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SettingsJsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final SystemCurrentTimeProvider f15399a;

    public SettingsJsonParser(SystemCurrentTimeProvider systemCurrentTimeProvider) {
        this.f15399a = systemCurrentTimeProvider;
    }

    public final Settings a(JSONObject jSONObject) throws JSONException {
        SettingsJsonTransform settingsV3JsonTransform;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Logger.f15258a.c(null, "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
            settingsV3JsonTransform = new DefaultSettingsJsonTransform();
        } else {
            settingsV3JsonTransform = new SettingsV3JsonTransform();
        }
        return settingsV3JsonTransform.a(this.f15399a, jSONObject);
    }
}

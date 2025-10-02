package com.dynatrace.android.agent.conf;

import android.content.SharedPreferences;
import com.dynatrace.android.agent.Global;

/* loaded from: classes.dex */
public class PreferencesManager {
    public static final String c;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14093a;
    public final ServerConfigurationManager b;

    static {
        boolean z = Global.f14077a;
        c = "dtxPreferencesManager";
    }

    public PreferencesManager(SharedPreferences sharedPreferences, ServerConfigurationManager serverConfigurationManager) {
        this.f14093a = sharedPreferences;
        this.b = serverConfigurationManager;
    }
}

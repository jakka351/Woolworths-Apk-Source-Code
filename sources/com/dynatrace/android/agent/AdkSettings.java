package com.dynatrace.android.agent;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.PreferencesManager;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.ServerConfigurationManager;
import com.dynatrace.android.agent.util.Utility;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class AdkSettings {
    public static final String h;
    public static String i;
    public static String j;
    public static String k;
    public static final AdkSettings l;

    /* renamed from: a, reason: collision with root package name */
    public AtomicBoolean f14062a;
    public AtomicBoolean b;
    public int c;
    public PreferencesManager d;
    public Context e;
    public Configuration f;
    public volatile ServerConfiguration g;

    static {
        boolean z = Global.f14077a;
        h = "dtxAdkSettings";
        i = "";
        j = "";
        k = "";
        AdkSettings adkSettings = new AdkSettings();
        adkSettings.f14062a = new AtomicBoolean(false);
        adkSettings.b = new AtomicBoolean(true);
        adkSettings.c = 1;
        adkSettings.d = null;
        ServerConfiguration.Builder builder = new ServerConfiguration.Builder();
        builder.l = 1;
        ServerConfiguration serverConfiguration = new ServerConfiguration(builder);
        if (Global.f14077a) {
            Utility.h("dtxAdkSettings", "switching settings: " + serverConfiguration);
        }
        adkSettings.g = serverConfiguration;
        l = adkSettings;
    }

    public final void a(boolean z) {
        this.b.set(z);
        this.d.f14093a.edit().putBoolean("DTXNewVisitorSent", z).apply();
    }

    public final void b(Configuration configuration, Application application) {
        this.f = configuration;
        configuration.getClass();
        if (application == null || this.e == application.getApplicationContext()) {
            return;
        }
        this.e = application;
        String string = application.getApplicationInfo().loadLabel(this.e.getPackageManager()).toString();
        j = string;
        j = Utility.e(250, string);
        k = this.e.getPackageName();
        Context context = this.e;
        ServerConfigurationManager serverConfigurationManager = new ServerConfigurationManager(configuration.b);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.dynatrace.android.dtxPref", 0);
        this.d = new PreferencesManager(sharedPreferences, serverConfigurationManager);
        AtomicBoolean atomicBoolean = this.b;
        boolean z = true;
        try {
            z = sharedPreferences.getBoolean("DTXNewVisitorSent", true);
        } catch (ClassCastException unused) {
            sharedPreferences.edit().remove("DTXNewVisitorSent").apply();
        }
        atomicBoolean.set(z);
    }
}

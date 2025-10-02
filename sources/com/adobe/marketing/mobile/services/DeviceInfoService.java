package com.adobe.marketing.mobile.services;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.internal.context.App;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DeviceInfoService implements DeviceInforming {
    public static boolean e(String str) {
        return str == null || str.trim().isEmpty();
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public final String a() throws PackageManager.NameNotFoundException {
        ServiceProvider serviceProvider = ServiceProvider.ServiceProviderSingleton.f13239a;
        serviceProvider.getClass();
        Context contextA = App.f13247a.a();
        if (!e("ADBMobileAppID") && contextA != null) {
            PackageManager packageManager = contextA.getPackageManager();
            if (packageManager == null) {
                Logging logging = serviceProvider.e;
                return null;
            }
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128);
                if (applicationInfo == null) {
                    Logging logging2 = serviceProvider.e;
                    return null;
                }
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle.getString("ADBMobileAppID");
                }
                Logging logging3 = serviceProvider.e;
                return null;
            } catch (Exception e) {
                String.format("Unable to read property for key (%s). Exception - (%s)", "ADBMobileAppID", e);
                Logging logging4 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            }
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public final InputStream b(String str) {
        ServiceProvider serviceProvider = ServiceProvider.ServiceProviderSingleton.f13239a;
        serviceProvider.getClass();
        Context contextA = App.f13247a.a();
        if (!e(str) && contextA != null) {
            Resources resources = contextA.getResources();
            if (resources == null) {
                Logging logging = serviceProvider.e;
                return null;
            }
            AssetManager assets = resources.getAssets();
            if (assets == null) {
                Logging logging2 = serviceProvider.e;
                return null;
            }
            try {
                return assets.open(str);
            } catch (IOException e) {
                String.format("Unable to read (%s) from the the assets folder. (%s)", str, e);
                Logging logging3 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            }
        }
        return null;
    }

    @Override // com.adobe.marketing.mobile.services.DeviceInforming
    public final File c() {
        ServiceProvider.ServiceProviderSingleton.f13239a.getClass();
        Context contextA = App.f13247a.a();
        if (contextA == null) {
            return null;
        }
        return contextA.getCacheDir();
    }

    public final String d() {
        Resources resources;
        Configuration configuration;
        ServiceProvider.ServiceProviderSingleton.f13239a.getClass();
        Context contextA = App.f13247a.a();
        Locale locale = null;
        if (contextA != null && (resources = contextA.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            locale = configuration.getLocales().get(0);
        }
        if (locale == null) {
            locale = Locale.US;
        }
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return !country.isEmpty() ? androidx.camera.core.impl.b.o(language, "-", country) : language;
    }
}

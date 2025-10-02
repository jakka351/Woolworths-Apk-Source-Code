package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.d7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
class v0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Long f16741a = 604800000L;

    /* loaded from: classes6.dex */
    public class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16742a;
        final /* synthetic */ String b;

        public a(boolean z, String str) {
            this.f16742a = z;
            this.b = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.e("Saving local configuration storage, timestamp, clear uuid = " + this.f16742a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Locale locale = Locale.US;
            String strK = androidx.camera.core.impl.b.k(jCurrentTimeMillis, "configuration/");
            d7.b().b(d7.a.LOCAL_CONFIGURATION_TIMESTAMP, jCurrentTimeMillis);
            a4.b(androidx.camera.core.impl.b.k(jCurrentTimeMillis, "Local configuration timestamp was updated to "));
            g2.a(strK, this.b);
        }
    }

    public class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16743a;

        public b(String str) {
            this.f16743a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            a4.e("Saving local *Property* configuration storage");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Locale locale = Locale.US;
            String strK = androidx.camera.core.impl.b.k(jCurrentTimeMillis, "configurationPropertyForLocale/");
            a4.b(androidx.camera.core.impl.b.k(jCurrentTimeMillis, "Local *Property* configuration timestamp was updated to "));
            g2.a(strK, this.f16743a);
        }
    }

    public static ConfigurationContract a(File file) {
        if (file == null) {
            return null;
        }
        ConfigurationContract configurationContractCreateConfiguration = ModelFactory.getInstance().createConfiguration(g2.e(file));
        File fileD = d();
        if (fileD != null && a(fileD.getName(), file.getName())) {
            PropertyConfigurationContract propertyConfigurationContractCreatePropertyConfiguration = ModelFactory.getInstance().createPropertyConfiguration(g2.e(fileD));
            if (propertyConfigurationContractCreatePropertyConfiguration != null) {
                configurationContractCreateConfiguration.propertyConfiguration = propertyConfigurationContractCreatePropertyConfiguration;
            }
        }
        return configurationContractCreateConfiguration;
    }

    public static Pair<String, Boolean> b() {
        a4.e("Deleting local *Property* configuration storage");
        return g2.a("configurationPropertyForLocale");
    }

    public static File c() {
        File fileD = g2.d("configuration");
        if (fileD == null || !fileD.isDirectory() || fileD.listFiles() == null || fileD.listFiles().length <= 0) {
            return null;
        }
        return fileD.listFiles()[0];
    }

    public static File d() {
        File fileD = g2.d("configurationPropertyForLocale");
        if (fileD == null || !fileD.isDirectory() || fileD.listFiles() == null || fileD.listFiles().length <= 0) {
            return null;
        }
        return fileD.listFiles()[0];
    }

    public static List<Pair<String, Boolean>> a() {
        return a(true);
    }

    public static Pair<String, Boolean> b(String str) {
        Pair<String, Boolean> pairB = b();
        new Thread(new b(str)).start();
        return pairB;
    }

    public static List<Pair<String, Boolean>> a(String str) {
        return a(str, true);
    }

    public static List<Pair<String, Boolean>> a(String str, boolean z) {
        List<Pair<String, Boolean>> listA = a(z);
        new Thread(new a(z, str)).start();
        return listA;
    }

    public static List<Pair<String, Boolean>> a(boolean z) {
        a4.e("Deleting local configuration storage, timestamp, delete uuid = " + z);
        if (z) {
            d7.b().b(d7.a.UUID, (String) null);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(b());
        d7.b().b(d7.a.LOCAL_CONFIGURATION_TIMESTAMP, 0L);
        arrayList.add(g2.a("configuration"));
        return arrayList;
    }

    public static boolean a(ConfigurationContract configurationContract) {
        Long offlineConfigurationExpirationTime = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getOfflineConfigurationExpirationTime();
        if (offlineConfigurationExpirationTime == null) {
            offlineConfigurationExpirationTime = f16741a;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return offlineConfigurationExpirationTime.longValue() < jCurrentTimeMillis - d7.b().a(d7.a.LOCAL_CONFIGURATION_TIMESTAMP, jCurrentTimeMillis);
    }

    public static boolean a(File file, ConfigurationContract configurationContract) {
        return (configurationContract == null || file == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null) ? false : true;
    }

    private static boolean a(String str, String str2) throws NumberFormatException {
        if (str != null && str2 != null) {
            if (Long.parseLong(str) > Long.parseLong(str2)) {
                return true;
            }
        }
        return false;
    }
}

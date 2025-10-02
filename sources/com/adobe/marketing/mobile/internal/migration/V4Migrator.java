package com.adobe.marketing.mobile.internal.migration;

import android.content.SharedPreferences;
import androidx.constraintlayout.core.state.a;
import com.adobe.marketing.mobile.MobilePrivacyStatus;
import com.adobe.marketing.mobile.internal.migration.MigrationConstants;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.NamedCollection;
import com.adobe.marketing.mobile.services.ServiceProvider;
import java.io.File;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/V4Migrator;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class V4Migrator {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f13194a = LazyKt.b(V4Migrator$v4SharedPreferences$2.h);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/internal/migration/V4Migrator$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public final void a() throws JSONException {
        boolean z;
        Lazy lazy = this.f13194a;
        if (((SharedPreferences) lazy.getD()) == null) {
            Log.a();
        }
        SharedPreferences sharedPreferences = (SharedPreferences) lazy.getD();
        if (sharedPreferences != null ? sharedPreferences.contains("ADMS_InstallDate") : false) {
            Log.a();
            SharedPreferences sharedPreferences2 = (SharedPreferences) lazy.getD();
            if (sharedPreferences2 == null) {
                z = false;
            } else {
                SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                NamedCollection namedCollectionA = ServiceProvider.a().d.a("ADBMobileServices");
                long j = sharedPreferences2.getLong("ADMS_InstallDate", 0L);
                if (j > 0) {
                    namedCollectionA.a(j / 1000, "ADMS_Legacy_InstallDate");
                }
                namedCollectionA.setString("ADMS_Referrer_ContextData_Json_String", sharedPreferences2.getString("ADMS_Referrer_ContextData_Json_String", null));
                namedCollectionA.setString("utm_source", sharedPreferences2.getString("utm_source", null));
                namedCollectionA.setString("utm_medium", sharedPreferences2.getString("utm_medium", null));
                namedCollectionA.setString("utm_term", sharedPreferences2.getString("utm_term", null));
                namedCollectionA.setString("utm_content", sharedPreferences2.getString("utm_content", null));
                namedCollectionA.setString("utm_campaign", sharedPreferences2.getString("utm_campaign", null));
                namedCollectionA.setString("trackingcode", sharedPreferences2.getString("trackingcode", null));
                namedCollectionA.setString("messagesBlackList", sharedPreferences2.getString("messagesBlackList", null));
                editorEdit.remove("utm_source");
                editorEdit.remove("utm_medium");
                editorEdit.remove("utm_term");
                editorEdit.remove("utm_content");
                editorEdit.remove("utm_campaign");
                editorEdit.remove("trackingcode");
                editorEdit.remove("messagesBlackList");
                editorEdit.apply();
                Log.a();
                ServiceProvider.a().d.a("Acquisition").setString("ADMS_Referrer_ContextData_Json_String", sharedPreferences2.getString("ADMS_Referrer_ContextData_Json_String", null));
                editorEdit.remove("ADMS_Referrer_ContextData_Json_String");
                editorEdit.apply();
                Log.a();
                NamedCollection namedCollectionA2 = ServiceProvider.a().d.a("AnalyticsDataStorage");
                namedCollectionA2.setString("ADOBEMOBILE_STOREDDEFAULTS_AID", sharedPreferences2.getString("ADOBEMOBILE_STOREDDEFAULTS_AID", null));
                namedCollectionA2.setBoolean("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", sharedPreferences2.getBoolean("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", false));
                namedCollectionA2.setString("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER", sharedPreferences2.getString("APP_MEASUREMENT_VISITOR_ID", null));
                editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID");
                editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID");
                editorEdit.remove("ADBLastKnownTimestampKey");
                editorEdit.apply();
                Log.a();
                ServiceProvider.a().d.a("AAMDataStore").setString("AAMUserId", sharedPreferences2.getString("AAMUserId", null));
                editorEdit.remove("AAMUserId");
                editorEdit.remove("AAMUserProfile");
                editorEdit.apply();
                Log.a();
                NamedCollection namedCollectionA3 = ServiceProvider.a().d.a("visitorIDServiceDataStore");
                namedCollectionA3.setString("ADOBEMOBILE_PERSISTED_MID", sharedPreferences2.getString("ADBMOBILE_PERSISTED_MID", null));
                namedCollectionA3.setString("ADOBEMOBILE_PERSISTED_MID_BLOB", sharedPreferences2.getString("ADBMOBILE_PERSISTED_MID_BLOB", null));
                namedCollectionA3.setString("ADOBEMOBILE_PERSISTED_MID_HINT", sharedPreferences2.getString("ADBMOBILE_PERSISTED_MID_HINT", null));
                namedCollectionA3.setString("ADOBEMOBILE_VISITORID_IDS", sharedPreferences2.getString("ADBMOBILE_VISITORID_IDS", null));
                namedCollectionA3.setBoolean("ADOBEMOBILE_PUSH_ENABLED", sharedPreferences2.getBoolean("ADBMOBILE_KEY_PUSH_ENABLED", false));
                editorEdit.remove("ADBMOBILE_PERSISTED_MID");
                editorEdit.remove("ADBMOBILE_PERSISTED_MID_BLOB");
                editorEdit.remove("ADBMOBILE_PERSISTED_MID_HINT");
                editorEdit.remove("APP_MEASUREMENT_VISITOR_ID");
                editorEdit.remove("ADBMOBILE_VISITORID_IDS");
                editorEdit.remove("ADBMOBILE_VISITORID_SYNC");
                editorEdit.remove("ADBMOBILE_VISITORID_TTL");
                editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_ADVERTISING_IDENTIFIER");
                editorEdit.remove("ADBMOBILE_KEY_PUSH_TOKEN");
                editorEdit.remove("ADBMOBILE_KEY_PUSH_ENABLED");
                editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED");
                editorEdit.apply();
                Log.a();
                NamedCollection namedCollectionA4 = ServiceProvider.a().d.a("AdobeMobile_Lifecycle");
                if (j > 0) {
                    namedCollectionA4.a(j / 1000, "InstallDate");
                }
                namedCollectionA4.setString("LastVersion", sharedPreferences2.getString("ADMS_LastVersion", null));
                long j2 = sharedPreferences2.getLong("ADMS_LastDateUsed", 0L);
                if (j2 > 0) {
                    namedCollectionA4.a(j2 / 1000, "LastDateUsed");
                }
                z = false;
                namedCollectionA4.b(sharedPreferences2.getInt("ADMS_Launches", 0));
                namedCollectionA4.setBoolean("SuccessfulClose", sharedPreferences2.getBoolean("ADMS_SuccessfulClose", false));
                editorEdit.remove("ADMS_InstallDate");
                editorEdit.remove("ADMS_LastVersion");
                editorEdit.remove("ADMS_LastDateUsed");
                editorEdit.remove("ADMS_Launches");
                editorEdit.remove("ADMS_SuccessfulClose");
                editorEdit.remove("ADMS_LifecycleData");
                editorEdit.remove("ADMS_SessionStart");
                editorEdit.remove("ADMS_PauseDate");
                editorEdit.remove("ADMS_LaunchesAfterUpgrade");
                editorEdit.remove("ADMS_UpgradeDate");
                editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_OS");
                editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_APPID");
                editorEdit.apply();
                Log.a();
                NamedCollection namedCollectionA5 = ServiceProvider.a().d.a("ADOBEMOBILE_TARGET");
                namedCollectionA5.setString("TNT_ID", sharedPreferences2.getString("ADBMOBILE_TARGET_TNT_ID", null));
                namedCollectionA5.setString("THIRD_PARTY_ID", sharedPreferences2.getString("ADBMOBILE_TARGET_3RD_PARTY_ID", null));
                namedCollectionA5.setString("SESSION_ID", sharedPreferences2.getString("ADBMOBILE_TARGET_SESSION_ID", null));
                namedCollectionA5.setString("EDGE_HOST", sharedPreferences2.getString("ADBMOBILE_TARGET_EDGE_HOST", null));
                editorEdit.remove("ADBMOBILE_TARGET_TNT_ID");
                editorEdit.remove("ADBMOBILE_TARGET_3RD_PARTY_ID");
                editorEdit.remove("ADBMOBILE_TARGET_SESSION_ID");
                editorEdit.remove("ADBMOBILE_TARGET_EDGE_HOST");
                editorEdit.remove("ADBMOBILE_TARGET_LAST_TIMESTAMP");
                editorEdit.remove("mboxPC_Expires");
                editorEdit.remove("mboxPC_Value");
                editorEdit.apply();
                Log.a();
            }
            b();
            File fileC = ServiceProvider.a().f13238a.c();
            if (fileC == null) {
                Log.a();
            } else {
                Iterator it = MigrationConstants.V4.a().iterator();
                while (it.hasNext()) {
                    try {
                        File file = new File(fileC, (String) it.next());
                        if (file.exists() && file.delete()) {
                            Log.a();
                        }
                    } catch (SecurityException unused) {
                        Log.a();
                    }
                }
            }
            Log.a();
        } else {
            z = false;
            SharedPreferences sharedPreferences3 = (SharedPreferences) lazy.getD();
            if (sharedPreferences3 != null ? sharedPreferences3.contains("PrivacyStatus") : false) {
                Log.a();
                b();
                Log.a();
            }
        }
        NamedCollection namedCollectionA6 = ServiceProvider.a().d.a("visitorIDServiceDataStore");
        if (namedCollectionA6 != null ? namedCollectionA6.contains("ADOBEMOBILE_VISITOR_ID") : z) {
            Log.a();
            NamedCollection namedCollectionA7 = ServiceProvider.a().d.a("visitorIDServiceDataStore");
            NamedCollection namedCollectionA8 = ServiceProvider.a().d.a("AnalyticsDataStorage");
            if (namedCollectionA7 == null || namedCollectionA8 == null) {
                Log.a();
            } else {
                if (!namedCollectionA8.contains("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER")) {
                    namedCollectionA8.setString("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER", namedCollectionA7.getString("ADOBEMOBILE_VISITOR_ID"));
                }
                namedCollectionA7.remove("ADOBEMOBILE_VISITOR_ID");
            }
            Log.a();
        }
    }

    public final void b() throws JSONException {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f13194a.getD();
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        NamedCollection namedCollectionA = ServiceProvider.a().d.a("AdobeMobile_ConfigState");
        int i = sharedPreferences.getInt("PrivacyStatus", -1);
        if (i >= 0 && i < 3) {
            String str = (i != 0 ? i != 1 ? MobilePrivacyStatus.UNKNOWN : MobilePrivacyStatus.OPT_OUT : MobilePrivacyStatus.OPT_IN).d;
            String string = namedCollectionA.getString("config.overridden.map");
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    if (jSONObject.has("global.privacy")) {
                        Log.a();
                    } else {
                        jSONObject.put("global.privacy", str);
                        namedCollectionA.setString("config.overridden.map", jSONObject.toString());
                    }
                } catch (JSONException e) {
                    Log.b("MobileCore", "MobileCore/V4Migrator", "Failed to serialize v5 configuration data. Unable to migrate v4 configuration data to v5. %s", e.getLocalizedMessage());
                }
            } else {
                namedCollectionA.setString("config.overridden.map", new JSONObject(a.r("global.privacy", str)).toString());
            }
        }
        editorEdit.remove("PrivacyStatus");
        editorEdit.apply();
        Log.a();
    }
}

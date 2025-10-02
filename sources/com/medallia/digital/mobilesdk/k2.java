package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.medallia.digital.mobilesdk.j2;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
class k2 extends h1<j2> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16562a = "formData";

    public class a extends HashMap<String, String> {
        public a() {
            put("formId", "TEXT");
            put(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT");
            put("fromJson", "TEXT");
            put("templatePath", "TEXT");
            put("templateId", "TEXT");
            put("title", "TEXT");
            put("titleTextColor", "TEXT");
            put("titleBackgroundColor", "TEXT");
            put("formType", "TEXT");
            put("formStatus", "INTEGER");
            put("transitionType", "TEXT");
            put("inviteData", "TEXT");
            put("viewType", "TEXT");
            put("isPreloaded", "INTEGER");
            put("formLanguage", "TEXT");
            put("isRtl", "INTEGER");
            put("poweredBy", "INTEGER");
            put("thankYouData", "TEXT");
            put("isBlockNetworkInForm", "INTEGER");
            put("redirectLinks", "TEXT");
            put("templateDebugRemoteUrl", "TEXT");
            put("urlVersion", "TEXT");
            put("shouldDownloadDebugForm", "INTEGER");
            put("headerThemeName", "TEXT");
            put("isDarkModeEnabled", "INTEGER");
        }
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final String f16564a = "formId";
        private static final String b = "name";
        private static final String c = "fromJson";
        private static final String d = "templatePath";
        private static final String e = "templateId";
        private static final String f = "title";
        private static final String g = "titleTextColor";
        private static final String h = "titleBackgroundColor";
        private static final String i = "formType";
        private static final String j = "formStatus";
        private static final String k = "transitionType";
        private static final String l = "inviteData";
        private static final String m = "viewType";
        private static final String n = "isPreloaded";
        private static final String o = "formLanguage";
        private static final String p = "isRtl";
        private static final String q = "poweredBy";
        private static final String r = "thankYouData";
        private static final String s = "redirectLinks";
        private static final String t = "isBlockNetworkInForm";
        private static final String u = "templateDebugRemoteUrl";
        private static final String v = "urlVersion";
        private static final String w = "shouldDownloadDebugForm";
        private static final String x = "headerThemeName";
        private static final String y = "isDarkModeEnabled";

        private b() {
        }
    }

    private InviteData a(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("inviteData"));
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new InviteData(new JSONObject(string));
        } catch (Exception e) {
            a4.c(e.getMessage());
            return null;
        }
    }

    private r7 c(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("thankYouData"));
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new r7(new JSONObject(string));
        } catch (Exception e) {
            a4.c(e.getMessage());
            return null;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public long b() {
        try {
            return DatabaseUtils.queryNumEntries(f1.a().getWritableDatabase(), f16562a);
        } catch (Exception e) {
            a4.c(e.getMessage());
            return 0L;
        }
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public j2 b(Object... objArr) {
        Object obj;
        Cursor cursorQuery;
        j2 j2Var = null;
        if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null && (obj instanceof String) && (cursorQuery = f1.a().getReadableDatabase().query(d(), null, "formId=?", new String[]{(String) obj}, null, null, null)) != null) {
            if (cursorQuery.moveToFirst()) {
                j2Var = new j2(cursorQuery.getString(cursorQuery.getColumnIndex("formId")), cursorQuery.getString(cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)), cursorQuery.getString(cursorQuery.getColumnIndex("fromJson")), cursorQuery.getString(cursorQuery.getColumnIndex("templatePath")), cursorQuery.getString(cursorQuery.getColumnIndex("templateId")), new l6().a(cursorQuery.getString(cursorQuery.getColumnIndex("formId"))), cursorQuery.getString(cursorQuery.getColumnIndex("title")), cursorQuery.getString(cursorQuery.getColumnIndex("titleTextColor")), cursorQuery.getString(cursorQuery.getColumnIndex("titleBackgroundColor")), FormTriggerType.fromString(cursorQuery.getString(cursorQuery.getColumnIndex("formType"))), j2.a.a(cursorQuery.getInt(cursorQuery.getColumnIndex("formStatus"))), c8.a(cursorQuery.getString(cursorQuery.getColumnIndex("transitionType"))), a(cursorQuery), FormViewType.fromString(cursorQuery.getString(cursorQuery.getColumnIndex("viewType"))), cursorQuery.getInt(cursorQuery.getColumnIndex("isPreloaded")) == 1, cursorQuery.getString(cursorQuery.getColumnIndex("formLanguage")), cursorQuery.getInt(cursorQuery.getColumnIndex("isRtl")) == 1, cursorQuery.getInt(cursorQuery.getColumnIndex("poweredBy")) == 1, c(cursorQuery), cursorQuery.getInt(cursorQuery.getColumnIndex("isBlockNetworkInForm")) == 1, b(cursorQuery), cursorQuery.getString(cursorQuery.getColumnIndex("templateDebugRemoteUrl")), cursorQuery.getString(cursorQuery.getColumnIndex("urlVersion")), cursorQuery.getInt(cursorQuery.getColumnIndex("shouldDownloadDebugForm")) == 1, cursorQuery.getString(cursorQuery.getColumnIndex("headerThemeName")), cursorQuery.getInt(cursorQuery.getColumnIndex("isDarkModeEnabled")) == 1);
            }
            cursorQuery.close();
        }
        return j2Var;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(j2 j2Var) {
        String strConcat;
        boolean z = true;
        if (j2Var == null || TextUtils.isEmpty(j2Var.getFormId())) {
            strConcat = "delete (invalid data) - ".concat(j2Var == null ? "record is null" : "formId is not valid");
        } else {
            z = f1.a().getWritableDatabase().delete(d(), "formId=?", new String[]{j2Var.getFormId()}) > 0;
            z = !z;
            strConcat = "delete - " + j2Var;
        }
        a(z, strConcat);
        return z;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ContentValues b(j2 j2Var) {
        ContentValues contentValues = new ContentValues();
        if (j2Var != null) {
            contentValues.put("formId", j2Var.getFormId());
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, j2Var.b());
            contentValues.put("fromJson", j2Var.a());
            contentValues.put("templatePath", j2Var.g());
            contentValues.put("templateId", j2Var.h());
            contentValues.put("title", j2Var.getTitle());
            contentValues.put("titleTextColor", j2Var.getTitleTextColor());
            contentValues.put("titleBackgroundColor", j2Var.getTitleBackgroundColor());
            contentValues.put("formType", j2Var.getFormType() != null ? j2Var.getFormType().toString() : null);
            contentValues.put("formStatus", j2Var.c() != null ? Integer.valueOf(j2Var.c().a()) : null);
            contentValues.put("transitionType", j2Var.j() != null ? j2Var.j().a() : null);
            contentValues.put("inviteData", j2Var.getInviteData() != null ? j2Var.getInviteData().toJsonString() : null);
            contentValues.put("viewType", j2Var.getFormViewType() != null ? j2Var.getFormViewType().toString() : null);
            contentValues.put("isPreloaded", Integer.valueOf(j2Var.l() ? 1 : 0));
            contentValues.put("formLanguage", j2Var.getFormLanguage());
            contentValues.put("isRtl", Integer.valueOf(j2Var.isRtl() ? 1 : 0));
            contentValues.put("poweredBy", Integer.valueOf(j2Var.isPoweredByVisible() ? 1 : 0));
            contentValues.put("thankYouData", j2Var.i() != null ? j2Var.i().t() : null);
            contentValues.put("isBlockNetworkInForm", Integer.valueOf(j2Var.k() ? 1 : 0));
            contentValues.put("redirectLinks", j2Var.e() != null ? ModelFactory.getInstance().getStringArrayAsJsonString(j2Var.e()) : null);
            contentValues.put("templateDebugRemoteUrl", j2Var.getTemplateDebugRemoteUrl());
            contentValues.put("urlVersion", j2Var.getUrlVersion());
            contentValues.put("shouldDownloadDebugForm", Integer.valueOf(j2Var.n() ? 1 : 0));
            contentValues.put("headerThemeName", j2Var.getHeaderThemeName());
            contentValues.put("isDarkModeEnabled", Integer.valueOf(j2Var.isDarkModeEnabled() ? 1 : 0));
        }
        return contentValues;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public ArrayList<j2> c(Object... objArr) {
        ArrayList<j2> arrayList = new ArrayList<>();
        Cursor cursorQuery = f1.a().getReadableDatabase().query(d(), null, null, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                do {
                    arrayList.add(new j2(cursorQuery.getString(cursorQuery.getColumnIndex("formId")), cursorQuery.getString(cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME)), cursorQuery.getString(cursorQuery.getColumnIndex("fromJson")), cursorQuery.getString(cursorQuery.getColumnIndex("templatePath")), cursorQuery.getString(cursorQuery.getColumnIndex("templateId")), new l6().a(cursorQuery.getString(cursorQuery.getColumnIndex("formId"))), cursorQuery.getString(cursorQuery.getColumnIndex("title")), cursorQuery.getString(cursorQuery.getColumnIndex("titleTextColor")), cursorQuery.getString(cursorQuery.getColumnIndex("titleBackgroundColor")), FormTriggerType.fromString(cursorQuery.getString(cursorQuery.getColumnIndex("formType"))), j2.a.a(cursorQuery.getInt(cursorQuery.getColumnIndex("formStatus"))), c8.a(cursorQuery.getString(cursorQuery.getColumnIndex("transitionType"))), a(cursorQuery), FormViewType.fromString(cursorQuery.getString(cursorQuery.getColumnIndex("viewType"))), cursorQuery.getInt(cursorQuery.getColumnIndex("isPreloaded")) == 1, cursorQuery.getString(cursorQuery.getColumnIndex("formLanguage")), cursorQuery.getInt(cursorQuery.getColumnIndex("isRtl")) == 1, cursorQuery.getInt(cursorQuery.getColumnIndex("poweredBy")) == 1, c(cursorQuery), cursorQuery.getInt(cursorQuery.getColumnIndex("isBlockNetworkInForm")) == 1, b(cursorQuery), cursorQuery.getString(cursorQuery.getColumnIndex("templateDebugRemoteUrl")), cursorQuery.getString(cursorQuery.getColumnIndex("urlVersion")), cursorQuery.getInt(cursorQuery.getColumnIndex("shouldDownloadDebugForm")) == 1, cursorQuery.getString(cursorQuery.getColumnIndex("headerThemeName")), cursorQuery.getInt(cursorQuery.getColumnIndex("isDarkModeEnabled")) == 1));
                } while (cursorQuery.moveToNext());
            }
            cursorQuery.close();
        }
        return arrayList;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public String d() {
        return f16562a;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public HashMap<String, String> c() {
        return new a();
    }

    @Override // com.medallia.digital.mobilesdk.h1
    public boolean a(Object... objArr) {
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.h1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean d(j2 j2Var) {
        return f1.a().getWritableDatabase().update(d(), b(j2Var), "formId=?", new String[]{j2Var.getFormId()}) > 0 || super.c((k2) j2Var);
    }

    private ArrayList<String> b(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("redirectLinks"));
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return ModelFactory.getInstance().getStringArray(new JSONArray(string));
        } catch (Exception e) {
            a4.c(e.getMessage());
            return null;
        }
    }
}

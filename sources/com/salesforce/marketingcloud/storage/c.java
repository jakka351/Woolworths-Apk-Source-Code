package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.security.GeneralSecurityException;
import java.util.Locale;

@SuppressLint
/* loaded from: classes6.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17041a = "mcsdk_custprefs_%s";
    public static final String b = "et_attributes_cache";
    public static final String c = "et_tags_cache";
    public static final String d = "et_subscriber_cache";
    public static final String e = "gcm_reg_id_key";
    public static final String f = "et_session_id_cache";
    public static final String g = "et_user_id_cache";
    public static final String h = "mc_last_sent_registration";
    public static final String i = "sender_id";
    public static final String j = "subscriber_jwt";
    public static final String k = "predictive_intelligence_identifier";

    public static class a implements c {
        private final SharedPreferences l;
        private final com.salesforce.marketingcloud.util.c m;

        public a(@NonNull Context context, @NonNull com.salesforce.marketingcloud.util.c cVar, @NonNull String str) {
            this.l = context.getSharedPreferences(b(str), 0);
            this.m = cVar;
            b();
        }

        private void b() {
            if (this.l.contains("gcm_sender_id")) {
                this.l.edit().remove("gcm_sender_id").apply();
            }
        }

        @Nullable
        private String c(@NonNull @Size String str, String str2) {
            String strB = null;
            String string = this.l.getString(str, null);
            if (string != null) {
                try {
                    strB = this.m.b(string);
                } catch (Exception e) {
                    com.salesforce.marketingcloud.g.e(e.c, e, "Failed to encrypt %s", str);
                }
            }
            return strB == null ? str2 : strB;
        }

        private void d(@NonNull @Size String str, @NonNull String str2) throws GeneralSecurityException, UnsupportedEncodingException {
            this.l.edit().putString(str, this.m.a(str2)).apply();
        }

        @Override // com.salesforce.marketingcloud.storage.c
        public final void a() {
            this.l.edit().clear().apply();
        }

        @Override // com.salesforce.marketingcloud.storage.c
        public final void a(String str, @Nullable String str2) {
            try {
                d(str, str2);
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                String str3 = e.c;
                Locale locale = Locale.ENGLISH;
                com.salesforce.marketingcloud.g.e(str3, YU.a.h("Value for key ", str, " not stored."), e);
            }
        }

        @Override // com.salesforce.marketingcloud.storage.c
        @Nullable
        public final String b(String str, String str2) {
            return c(str, str2);
        }

        public static String b(String str) {
            Locale locale = Locale.ENGLISH;
            return YU.a.A("mcsdk_custprefs_", str);
        }

        @Override // com.salesforce.marketingcloud.storage.c
        public final void a(@NonNull @Size String str) {
            this.l.edit().remove(str).apply();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void a();

    void a(String str);

    void a(String str, @Nullable String str2);

    @Nullable
    String b(String str, String str2);
}

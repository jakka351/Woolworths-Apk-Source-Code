package com.salesforce.marketingcloud.analytics;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public interface l {

    public enum a {
        SYNC_API("deviceSyncCallTimeMs"),
        TRIGGER_PROCESS("inAppMsgProcessingTimeMs");


        /* renamed from: a, reason: collision with root package name */
        private final String f16843a;

        a(@NonNull String str) {
            this.f16843a = str;
        }

        @NonNull
        public String b() {
            return this.f16843a;
        }
    }

    void a(@NonNull a aVar, @NonNull JSONObject jSONObject);
}

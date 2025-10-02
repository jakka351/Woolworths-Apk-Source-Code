package com.swrve.sdk.messaging;

import com.swrve.sdk.SwrveLogger;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SwrveCampaignState {

    /* renamed from: a, reason: collision with root package name */
    public int f19095a;
    public Status b;
    public Date c;
    public final long d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final Status d;
        public static final Status e;
        public static final Status f;
        public static final /* synthetic */ Status[] g;

        static {
            Status status = new Status("Unseen", 0);
            d = status;
            Status status2 = new Status("Seen", 1);
            e = status2;
            Status status3 = new Status("Deleted", 2);
            f = status3;
            g = new Status[]{status, status2, status3};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) g.clone();
        }
    }

    public SwrveCampaignState(JSONObject jSONObject, Date date) throws JSONException {
        Status status = Status.d;
        this.b = status;
        this.d = date.getTime();
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("impressions")) {
                this.f19095a = jSONObject.getInt("impressions");
            }
            if (jSONObject.has("status")) {
                String string = jSONObject.getString("status");
                if (string.equalsIgnoreCase("seen")) {
                    status = Status.e;
                } else if (string.equalsIgnoreCase("deleted")) {
                    status = Status.f;
                }
                this.b = status;
            }
            if (jSONObject.has("downloadDate")) {
                this.d = jSONObject.getLong("downloadDate");
            }
        } catch (Exception e) {
            SwrveLogger.c("Error while trying to read campaign state.", e, new Object[0]);
        }
    }

    public final int a() {
        return this.f19095a;
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("impressions", this.f19095a);
        jSONObject.put("status", this.b.toString());
        jSONObject.put("downloadDate", this.d);
        return jSONObject;
    }
}

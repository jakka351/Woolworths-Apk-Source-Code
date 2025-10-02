package com.swrve.sdk.messaging;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.common.internal.ImagesContract;
import com.salesforce.marketingcloud.storage.db.m;
import com.swrve.sdk.ISwrveCampaignManager;
import com.swrve.sdk.QaCampaignInfo;
import com.swrve.sdk.SwrveCampaignDisplayer;
import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveLogger;
import com.swrve.sdk.SwrveUtils;
import com.swrve.sdk.messaging.SwrveCampaignState;
import com.swrve.sdk.messaging.model.Trigger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class SwrveBaseCampaign {

    /* renamed from: a, reason: collision with root package name */
    public final ISwrveCampaignManager f19089a;
    public final SwrveCampaignDisplayer b;
    public final int c;
    public SwrveCampaignState d;
    public final String e;
    public final String f;
    public final SwrveTimezoneType g;
    public final ArrayList h;
    public final ArrayList i;
    public final List j;
    public final boolean k;
    public final int l;
    public final int m;
    public final Date n;

    public class SwrveBlackoutDate {

        /* renamed from: a, reason: collision with root package name */
        public final String f19090a;
        public final String b;

        public SwrveBlackoutDate(String str, String str2) {
            this.f19090a = str;
            this.b = str2;
        }
    }

    public class SwrveIntervalTime {

        /* renamed from: a, reason: collision with root package name */
        public final String f19091a;
        public final String b;

        public SwrveIntervalTime(String str, String str2) {
            this.f19091a = str;
            this.b = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SwrveTimezoneType {
        public static final SwrveTimezoneType d;
        public static final SwrveTimezoneType e;
        public static final /* synthetic */ SwrveTimezoneType[] f;

        static {
            SwrveTimezoneType swrveTimezoneType = new SwrveTimezoneType("GLOBAL", 0);
            d = swrveTimezoneType;
            SwrveTimezoneType swrveTimezoneType2 = new SwrveTimezoneType("LOCAL", 1);
            e = swrveTimezoneType2;
            f = new SwrveTimezoneType[]{swrveTimezoneType, swrveTimezoneType2};
        }

        public static SwrveTimezoneType valueOf(String str) {
            return (SwrveTimezoneType) Enum.valueOf(SwrveTimezoneType.class, str);
        }

        public static SwrveTimezoneType[] values() {
            return (SwrveTimezoneType[]) f.clone();
        }
    }

    public SwrveBaseCampaign(ISwrveCampaignManager iSwrveCampaignManager, SwrveCampaignDisplayer swrveCampaignDisplayer, JSONObject jSONObject) throws JSONException {
        this.f19089a = iSwrveCampaignManager;
        this.b = swrveCampaignDisplayer;
        int i = jSONObject.getInt("id");
        this.c = i;
        SwrveLogger.e("Parsing campaign %s", Integer.valueOf(i));
        this.k = jSONObject.optBoolean("message_center", false);
        if (!jSONObject.isNull("subject")) {
            jSONObject.getString("subject");
        }
        this.d = new SwrveCampaignState(null, iSwrveCampaignManager.B());
        this.l = 99999;
        this.m = 60;
        this.n = SwrveHelper.b(iSwrveCampaignManager.u(), SubsamplingScaleImageView.ORIENTATION_180, 13);
        if (jSONObject.has(m.g)) {
            this.j = Trigger.fromJson(jSONObject.getString(m.g), i);
        } else {
            this.j = new ArrayList();
        }
        if (jSONObject.has("rules")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("rules");
            if (jSONObject2.has("dismiss_after_views")) {
                this.l = jSONObject2.getInt("dismiss_after_views");
            }
            if (jSONObject2.has("delay_first_message")) {
                this.n = SwrveHelper.b(iSwrveCampaignManager.u(), jSONObject2.getInt("delay_first_message"), 13);
            }
            if (jSONObject2.has("min_delay_between_messages")) {
                this.m = jSONObject2.getInt("min_delay_between_messages");
            }
        }
        if (jSONObject.has("start_date_iso")) {
            this.e = jSONObject.getString("start_date_iso");
        }
        if (jSONObject.has("end_date_iso")) {
            this.f = jSONObject.getString("end_date_iso");
        }
        if (jSONObject.has("timezone_type")) {
            String string = jSONObject.getString("timezone_type");
            boolean zEqualsIgnoreCase = string.equalsIgnoreCase("global");
            SwrveTimezoneType swrveTimezoneType = SwrveTimezoneType.d;
            if (!zEqualsIgnoreCase && string.equalsIgnoreCase(ImagesContract.LOCAL)) {
                swrveTimezoneType = SwrveTimezoneType.e;
            }
            this.g = swrveTimezoneType;
        }
        if (jSONObject.has("blackout_dates")) {
            this.h = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("blackout_dates");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                if (jSONObject3.has("from") && jSONObject3.has("to")) {
                    this.h.add(new SwrveBlackoutDate(jSONObject3.getString("from"), jSONObject3.getString("to")));
                }
            }
        }
        if (jSONObject.has("interval_times")) {
            this.i = new ArrayList();
            JSONArray jSONArray2 = jSONObject.getJSONArray("interval_times");
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                if (jSONObject4.has("from") && jSONObject4.has("to")) {
                    this.i.add(new SwrveIntervalTime(jSONObject4.getString("from"), jSONObject4.getString("to")));
                }
            }
        }
    }

    public abstract boolean a(HashSet hashSet, HashMap map);

    public final ArrayList b() {
        return this.h;
    }

    public abstract QaCampaignInfo.CAMPAIGN_TYPE c();

    public final Date d() {
        try {
            return SwrveUtils.Companion.a(this.f, this.g);
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: Error parsing campaign end date", e, new Object[0]);
            return new Date(0L);
        }
    }

    public final int e() {
        return this.c;
    }

    public final ArrayList f() {
        return this.i;
    }

    public final int g() {
        return this.l;
    }

    public final SwrveCampaignState h() {
        return this.d;
    }

    public final Date i() {
        return this.n;
    }

    public final Date j() {
        try {
            return SwrveUtils.Companion.a(this.e, this.g);
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: Error parsing campaign start date", e, new Object[0]);
            return new Date(Long.MAX_VALUE);
        }
    }

    public final SwrveCampaignState.Status k() {
        return this.d.b;
    }

    public final SwrveTimezoneType l() {
        return this.g;
    }

    public final List m() {
        return this.j;
    }

    public final boolean n(Date date) {
        return this.b.d(this, date, new HashMap());
    }

    public final boolean o() {
        return this.k;
    }

    public void p() {
        SwrveCampaignState swrveCampaignState = this.d;
        swrveCampaignState.b = SwrveCampaignState.Status.e;
        swrveCampaignState.f19095a++;
        q();
    }

    public final void q() {
        SwrveCampaignState swrveCampaignState = this.d;
        ISwrveCampaignManager iSwrveCampaignManager = this.f19089a;
        swrveCampaignState.c = SwrveHelper.b(iSwrveCampaignManager.B(), this.m, 13);
        Date dateB = iSwrveCampaignManager.B();
        SwrveCampaignDisplayer swrveCampaignDisplayer = this.b;
        swrveCampaignDisplayer.d = SwrveHelper.b(dateB, swrveCampaignDisplayer.e, 13);
    }

    public final void r(SwrveCampaignState swrveCampaignState) {
        this.d = swrveCampaignState;
    }

    public final void s(SwrveCampaignState.Status status) {
        this.d.b = status;
    }

    public abstract boolean t(SwrveOrientation swrveOrientation);
}

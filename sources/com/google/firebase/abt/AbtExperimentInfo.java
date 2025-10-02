package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class AbtExperimentInfo {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f15175a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public AbtExperimentInfo(String str, String str2, String str3, Date date, long j, long j2) {
        this.f15175a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    public static AbtExperimentInfo a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str = conditionalUserProperty.d;
        if (str == null) {
            str = "";
        }
        return new AbtExperimentInfo(conditionalUserProperty.b, String.valueOf(conditionalUserProperty.c), str, new Date(conditionalUserProperty.m), conditionalUserProperty.e, conditionalUserProperty.j);
    }

    public static AbtExperimentInfo b(Map map) throws AbtException, NumberFormatException, ParseException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String str = g[i];
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
        try {
            return new AbtExperimentInfo((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    public final String c() {
        return this.f15175a;
    }

    public final String d() {
        return this.b;
    }

    public final AnalyticsConnector.ConditionalUserProperty e() {
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.f15181a = "frc";
        conditionalUserProperty.m = this.d.getTime();
        conditionalUserProperty.b = this.f15175a;
        conditionalUserProperty.c = this.b;
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        conditionalUserProperty.d = str;
        conditionalUserProperty.e = this.e;
        conditionalUserProperty.j = this.f;
        return conditionalUserProperty;
    }
}

package com.google.firebase.crashlytics.internal.metadata;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import org.json.JSONObject;

@AutoValue
@Encodable
/* loaded from: classes6.dex */
public abstract class RolloutAssignment {

    /* renamed from: a, reason: collision with root package name */
    public static final DataEncoder f15298a;

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoRolloutAssignmentEncoder.f15287a.configure(jsonDataEncoderBuilder);
        f15298a = jsonDataEncoderBuilder.a();
    }

    public static RolloutAssignment a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static RolloutAssignment b(String str, String str2, String str3, String str4, long j) {
        if (str3.length() > 256) {
            str3 = str3.substring(0, 256);
        }
        return new AutoValue_RolloutAssignment(str, str2, str3, str4, j);
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public final CrashlyticsReport.Session.Event.RolloutAssignment h() {
        CrashlyticsReport.Session.Event.RolloutAssignment.Builder builderA = CrashlyticsReport.Session.Event.RolloutAssignment.a();
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder builderA2 = CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.a();
        builderA2.c(g());
        builderA2.b(e());
        builderA.d(builderA2.a());
        builderA.b(c());
        builderA.c(d());
        builderA.e(f());
        return builderA.a();
    }
}

package com.dynatrace.android.agent.conf;

import YU.a;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.dynatrace.android.agent.conf.RageTapConfiguration;
import com.dynatrace.android.agent.conf.ReplayConfiguration;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.dynatrace.android.agent.util.Utility;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public class ServerConfigurationManager implements ServerConfigurationParser {
    public static final String b;
    public static final ServerConfiguration c;
    public static final ServerConfiguration d;

    /* renamed from: a, reason: collision with root package name */
    public final String f14101a;

    static {
        boolean z = Global.f14077a;
        b = "dtxServerConfigurationManager";
        ServerConfiguration.Builder builder = new ServerConfiguration.Builder();
        builder.g = 0;
        builder.n = ServerConfiguration.Status.e;
        c = new ServerConfiguration(builder);
        ServerConfiguration.Builder builder2 = new ServerConfiguration.Builder();
        builder2.o = -1L;
        d = new ServerConfiguration(builder2);
    }

    public ServerConfigurationManager(String str) {
        this.f14101a = str;
    }

    public static int a(JSONObject jSONObject, String str, int i, int i2, int i3) {
        if (jSONObject.has(str)) {
            try {
                return Math.max(Math.min(jSONObject.getInt(str), i2), i);
            } catch (JSONException e) {
                String strH = a.h("expected JSON property \"", str, "\" to be an Integer, but it was not");
                if (Global.f14077a) {
                    Utility.g(e, b, strH);
                }
            }
        }
        return i3;
    }

    public static int b(JSONObject jSONObject, String str, int i, int i2, int i3, int i4) throws JSONException {
        if (jSONObject.has(str)) {
            try {
                int i5 = jSONObject.getInt(str);
                if (i5 >= i) {
                    return i5 > i2 ? i4 : i5;
                }
            } catch (JSONException e) {
                String strH = a.h("expected JSON property \"", str, "\" to be an Integer, but it was not");
                if (Global.f14077a) {
                    Utility.g(e, b, strH);
                }
            }
        }
        return i3;
    }

    public static String d(ServerConfiguration serverConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("maxBeaconSizeKb", serverConfiguration.f14099a);
        jSONObject2.put("selfmonitoring", serverConfiguration.b);
        SessionSplitConfiguration sessionSplitConfiguration = serverConfiguration.c;
        jSONObject2.put("maxSessionDurationMins", sessionSplitConfiguration.f14102a);
        jSONObject2.put("sessionTimeoutSec", sessionSplitConfiguration.b);
        jSONObject2.put("sendIntervalSec", serverConfiguration.d);
        jSONObject2.put("maxCachedCrashesCount", serverConfiguration.e);
        RageTapConfiguration rageTapConfiguration = serverConfiguration.f;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("tapDuration", rageTapConfiguration.f14095a);
        jSONObject3.put("dispersionRadius", rageTapConfiguration.b);
        jSONObject3.put("timespanDifference", rageTapConfiguration.c);
        jSONObject3.put("minimumNumberOfTaps", rageTapConfiguration.d);
        jSONObject2.put("rageTapConfig", jSONObject3);
        ReplayConfiguration replayConfiguration = serverConfiguration.j;
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("protocolVersion", replayConfiguration.f);
        jSONObject4.put("pixelCopy", replayConfiguration.h);
        jSONObject2.put("replayConfig", jSONObject4);
        jSONObject.put("mobileAgentConfig", jSONObject2);
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("capture", replayConfiguration.f14097a);
        jSONObject6.put("imageRetentionTimeInMinutes", replayConfiguration.e);
        if (replayConfiguration.b) {
            jSONObject6.put("trafficControlPercentage", replayConfiguration.d);
            jSONObject6.put("crashesEnabled", replayConfiguration.c);
        }
        jSONObject5.put("replayConfig", jSONObject6);
        jSONObject5.put("bp4Enabled", serverConfiguration.i);
        jSONObject.put("appConfig", jSONObject5);
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("serverId", serverConfiguration.l);
        jSONObject.put("dynamicConfig", jSONObject7);
        jSONObject.put("timestamp", 0L);
        return jSONObject.toString();
    }

    public static void f(ServerConfiguration.Builder builder, JSONObject jSONObject) throws ParseException {
        JSONObject jSONObject2;
        if (jSONObject.has("status") && jSONObject.getString("status").compareToIgnoreCase("ERROR") == 0) {
            throw new ParseException("Error status detected", 0);
        }
        builder.n = ServerConfiguration.Status.d;
        if (jSONObject.has("multiplicity")) {
            jSONObject2 = jSONObject;
            builder.k = b(jSONObject2, "multiplicity", 0, Integer.MAX_VALUE, 1, 1);
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has("serverId")) {
            builder.l = b(jSONObject2, "serverId", 0, Integer.MAX_VALUE, 1, 1);
        }
        if (jSONObject2.has("switchServer")) {
            builder.m = g("switchServer", false, jSONObject2);
        }
    }

    public static boolean g(String str, boolean z, JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException e) {
            String strH = a.h("expected JSON property \"", str, "\" to be a Boolean, but it was not");
            if (Global.f14077a) {
                Utility.g(e, b, strH);
            }
            return z;
        }
    }

    public final ServerConfiguration c(ServerConfiguration serverConfiguration, String str) throws JSONException, InvalidConfigurationException {
        ServerConfiguration.Builder builderB;
        JSONObject jSONObject = (JSONObject) new JSONTokener(str).nextValue();
        if (!jSONObject.has("dynamicConfig")) {
            throw new InvalidConfigurationException("The configuration is missing the dynamicConfig block");
        }
        boolean zHas = jSONObject.has("timestamp");
        ServerConfiguration serverConfiguration2 = c;
        if (zHas && jSONObject.has("appConfig") && jSONObject.has("mobileAgentConfig")) {
            builderB = new ServerConfiguration.Builder();
            try {
                long j = jSONObject.getLong("timestamp");
                if (j <= serverConfiguration.o) {
                    return serverConfiguration;
                }
                builderB.o = j;
                ReplayConfiguration.Builder builder = new ReplayConfiguration.Builder();
                builder.f14098a = false;
                builder.b = false;
                builder.c = false;
                builder.d = 0;
                builder.e = 0;
                builder.f = 1;
                builder.g = 0;
                builder.h = false;
                JSONObject jSONObject2 = jSONObject.getJSONObject("mobileAgentConfig");
                if (jSONObject2.has("maxBeaconSizeKb")) {
                    builderB.f14100a = a(jSONObject2, "maxBeaconSizeKb", 10, Integer.MAX_VALUE, 150);
                }
                if (jSONObject2.has("selfmonitoring")) {
                    builderB.b = g("selfmonitoring", true, jSONObject2);
                }
                SessionSplitConfiguration.Builder builder2 = new SessionSplitConfiguration.Builder();
                builder2.f14103a = 360;
                builder2.b = 600;
                if (jSONObject2.has("maxSessionDurationMins")) {
                    builder2.f14103a = a(jSONObject2, "maxSessionDurationMins", 10, Integer.MAX_VALUE, 360);
                }
                if (jSONObject2.has("sessionTimeoutSec")) {
                    builder2.b = a(jSONObject2, "sessionTimeoutSec", 30, Integer.MAX_VALUE, 600);
                }
                builderB.c = new SessionSplitConfiguration(builder2);
                if (jSONObject2.has("sendIntervalSec")) {
                    builderB.d = a(jSONObject2, "sendIntervalSec", 10, 120, 120);
                }
                if (jSONObject2.has("maxCachedCrashesCount")) {
                    builderB.e = a(jSONObject2, "maxCachedCrashesCount", 0, 100, 0);
                }
                if (jSONObject2.has("rageTapConfig")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("rageTapConfig");
                    RageTapConfiguration.Builder builder3 = new RageTapConfiguration.Builder();
                    builder3.f14096a = 100;
                    builder3.b = 100;
                    builder3.c = nlnlnnn.xxx00780078x0078;
                    builder3.d = 3;
                    if (jSONObject3.has("tapDuration")) {
                        builder3.f14096a = a(jSONObject3, "tapDuration", 0, Integer.MAX_VALUE, 100);
                    }
                    if (jSONObject3.has("dispersionRadius")) {
                        builder3.b = a(jSONObject3, "dispersionRadius", 0, Integer.MAX_VALUE, 100);
                    }
                    if (jSONObject3.has("timespanDifference")) {
                        builder3.c = a(jSONObject3, "timespanDifference", 0, Integer.MAX_VALUE, nlnlnnn.xxx00780078x0078);
                    }
                    if (jSONObject3.has("minimumNumberOfTaps")) {
                        builder3.d = a(jSONObject3, "minimumNumberOfTaps", 3, Integer.MAX_VALUE, 3);
                    }
                    builderB.f = new RageTapConfiguration(builder3);
                }
                if (jSONObject2.has("replayConfig")) {
                    JSONObject jSONObject4 = jSONObject2.getJSONObject("replayConfig");
                    if (jSONObject4.has("protocolVersion")) {
                        builder.f = a(jSONObject4, "protocolVersion", 1, 32767, 1);
                    }
                    if (jSONObject4.has("selfmonitoring")) {
                        builder.g = a(jSONObject4, "selfmonitoring", 0, Integer.MAX_VALUE, 0);
                    }
                    if (jSONObject4.has("pixelCopy")) {
                        builder.h = g("pixelCopy", false, jSONObject4);
                    }
                }
                try {
                    e(builderB, builder, jSONObject.getJSONObject("appConfig"));
                    builderB.j = new ReplayConfiguration(builder);
                } catch (ParseException unused) {
                    return serverConfiguration2;
                }
            } catch (JSONException e) {
                if (Global.f14077a) {
                    Utility.g(e, b, "timestamp must be of type Long");
                }
                return serverConfiguration2;
            }
        } else {
            builderB = serverConfiguration.b(true);
        }
        try {
            f(builderB, jSONObject.getJSONObject("dynamicConfig"));
            return new ServerConfiguration(builderB);
        } catch (ParseException unused2) {
            return serverConfiguration2;
        }
    }

    public final void e(ServerConfiguration.Builder builder, ReplayConfiguration.Builder builder2, JSONObject jSONObject) throws JSONException, ParseException {
        JSONObject jSONObject2;
        if (jSONObject.has("applicationId") && !this.f14101a.equals(jSONObject.getString("applicationId"))) {
            throw new ParseException("No application id", 0);
        }
        if (jSONObject.has("capture")) {
            jSONObject2 = jSONObject;
            builder.g = b(jSONObject2, "capture", 0, 1, 1, 1);
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has("trafficControlPercentage")) {
            builder.h = b(jSONObject2, "trafficControlPercentage", 1, 100, 100, 100);
        }
        if (jSONObject2.has("bp4Enabled")) {
            builder.i = g("bp4Enabled", false, jSONObject2);
        }
        if (jSONObject2.has("replayConfig")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("replayConfig");
            if (jSONObject3.has("capture")) {
                builder2.f14098a = g("capture", false, jSONObject3);
            }
            if (jSONObject3.has("crashesEnabled")) {
                builder2.c = g("crashesEnabled", false, jSONObject3);
                builder2.b = true;
            }
            if (jSONObject3.has("trafficControlPercentage")) {
                builder2.d = b(jSONObject3, "trafficControlPercentage", 0, 100, 0, 100);
            }
            if (jSONObject3.has("imageRetentionTimeInMinutes")) {
                builder2.e = a(jSONObject3, "imageRetentionTimeInMinutes", 0, Integer.MAX_VALUE, 0);
            }
        }
    }
}

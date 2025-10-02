package com.dynatrace.android.agent.conf;

import YU.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Configuration {

    /* renamed from: a, reason: collision with root package name */
    public final String f14091a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String[] k;
    public final String[] l;
    public final boolean m;
    public final InstrumentationFlavor n;
    public final boolean o;

    public Configuration(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String[] strArr, String[] strArr2, boolean z6, InstrumentationFlavor instrumentationFlavor, boolean z7) {
        this.f14091a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = strArr;
        this.l = strArr2;
        this.m = z6;
        this.n = instrumentationFlavor;
        this.o = z7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration{applicationId='");
        sb.append(this.f14091a);
        sb.append("', appIdEncoded='");
        sb.append(this.b);
        sb.append("', beaconUrl='");
        sb.append(this.c);
        sb.append("', mode=");
        sb.append(AgentMode.d);
        sb.append(", certificateValidation=true, keyStore=null, keyManagers=");
        sb.append(Arrays.toString((Object[]) null));
        sb.append(", graceTime=");
        sb.append(this.d);
        sb.append(", waitTime=");
        sb.append(this.e);
        sb.append(", sendEmptyAction=");
        sb.append(this.f);
        sb.append(", namePrivacy=false, applicationMonitoring=");
        sb.append(this.g);
        sb.append(", activityMonitoring=");
        sb.append(this.h);
        sb.append(", crashReporting=");
        sb.append(this.i);
        sb.append(", webRequestTiming=");
        sb.append(this.j);
        sb.append(", monitoredDomains=");
        sb.append(Arrays.toString(this.k));
        sb.append(", monitoredHttpsDomains=");
        sb.append(Arrays.toString(this.l));
        sb.append(", hybridApp=false, fileDomainCookies=true, debugLogLevel=false, autoStart=");
        sb.append(this.m);
        sb.append(", communicationProblemListener=null, userOptIn=false, startupLoadBalancing=false, instrumentationFlavor=");
        sb.append(this.n);
        sb.append(", sessionReplayComponentProvider=null, isRageTapDetectionEnabled=");
        return a.k(", autoUserActionModifier=null}", sb, this.o);
    }
}

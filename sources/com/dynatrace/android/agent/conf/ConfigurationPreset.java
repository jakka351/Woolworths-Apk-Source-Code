package com.dynatrace.android.agent.conf;

import java.util.Arrays;

/* loaded from: classes.dex */
public class ConfigurationPreset {
    public final String toString() {
        return "ConfigurationPreset{, graceTime=500, waitTime=60000, applicationMonitoring=true, activityMonitoring=true, certificateValidation=true, sendEmptyActions=true, namePrivacy=false, crashReporting=true, webRequestTiming=true, monitoredDomains=" + Arrays.toString(new String[0]) + ", monitoredHttpsDomains=" + Arrays.toString(new String[0]) + ", hybridApp=false, fileDomainCookies=true, debugLogLevel=false, autoStart=true, userOptIn=false, startupLoadBalancing=false, instrumentationFlavor=" + InstrumentationFlavor.PLAIN + ", sessionReplayComponentProvider=null, isRageTapDetectionEnabled=true}";
    }
}

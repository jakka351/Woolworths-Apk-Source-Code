package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.ApplicationInfo;

/* loaded from: classes.dex */
public class FirebasePerfApplicationInfoValidator extends PerfMetricValidator {
    public static final AndroidLogger c = AndroidLogger.e();
    public final ApplicationInfo b;

    public FirebasePerfApplicationInfoValidator(ApplicationInfo applicationInfo) {
        this.b = applicationInfo;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public final boolean b() {
        AndroidLogger androidLogger = c;
        ApplicationInfo applicationInfo = this.b;
        if (applicationInfo == null) {
            androidLogger.g("ApplicationInfo is null");
        } else if (!applicationInfo.V()) {
            androidLogger.g("GoogleAppId is null");
        } else if (!applicationInfo.T()) {
            androidLogger.g("AppInstanceId is null");
        } else if (!applicationInfo.U()) {
            androidLogger.g("ApplicationProcessState is null");
        } else {
            if (!applicationInfo.S()) {
                return true;
            }
            if (!applicationInfo.Q().P()) {
                androidLogger.g("AndroidAppInfo.packageName is null");
            } else {
                if (applicationInfo.Q().Q()) {
                    return true;
                }
                androidLogger.g("AndroidAppInfo.sdkVersion is null");
            }
        }
        androidLogger.g("ApplicationInfo is invalid");
        return false;
    }
}

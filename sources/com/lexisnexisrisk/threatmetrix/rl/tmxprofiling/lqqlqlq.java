package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.salesforce.marketingcloud.messages.iam.j;

/* loaded from: classes6.dex */
public enum lqqlqlq {
    NOT_CHECKED(""),
    NONE(DevicePublicKeyStringDef.NONE),
    UNKNOWN(j.h),
    PERMISSIVE("permissive"),
    ENFORCING("enforcing");

    private final String m006Dmm006Dmm;

    lqqlqlq(String str) {
        this.m006Dmm006Dmm = str;
    }

    public static lqqlqlq valueOf(String str) {
        return (lqqlqlq) nlnnnnn.ooo006F006Foo(lqqlqlq.class, str);
    }

    public String identifier() {
        return this.m006Dmm006Dmm;
    }
}

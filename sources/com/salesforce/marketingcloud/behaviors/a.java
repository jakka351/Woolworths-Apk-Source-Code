package com.salesforce.marketingcloud.behaviors;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@SuppressLint
@RestrictTo
/* loaded from: classes.dex */
public enum a {
    BEHAVIOR_DEVICE_SHUTDOWN("android.intent.action.ACTION_SHUTDOWN"),
    BEHAVIOR_DEVICE_BOOT_COMPLETE("android.intent.action.BOOT_COMPLETED"),
    BEHAVIOR_DEVICE_TIME_ZONE_CHANGED("android.intent.action.TIMEZONE_CHANGED"),
    BEHAVIOR_APP_PACKAGE_REPLACED("android.intent.action.MY_PACKAGE_REPLACED"),
    BEHAVIOR_APP_FOREGROUNDED("com.salesforce.marketingcloud.APP_FOREGROUNDED", true),
    BEHAVIOR_APP_BACKGROUNDED("com.salesforce.marketingcloud.APP_BACKGROUNDED", BEHAVIOR_APP_FOREGROUNDED),
    BEHAVIOR_SDK_REGISTRATION_SEND("com.salesforce.marketingcloud.REGISTRATION_SEND"),
    BEHAVIOR_SDK_PUSH_RECEIVED("com.salesforce.marketingcloud.PUSH_RECEIVED"),
    BEHAVIOR_CUSTOMER_FENCE_MESSAGING_TOGGLED("com.salesforce.marketingcloud.FENCE_MESSAGING_TOGGLED"),
    BEHAVIOR_CUSTOMER_PROXIMITY_MESSAGING_TOGGLED("com.salesforce.marketingcloud.PROXIMITY_MESSAGING_TOGGLED"),
    BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED("com.salesforce.marketingcloud.PUSH_MESSAGING_TOGGLED"),
    BEHAVIOR_SDK_NOTIFICATION_OPENED("com.salesforce.marketingcloud.NOTIFICATION_OPENED"),
    BEHAVIOR_SDK_TOKEN_REFRESHED("com.salesforce.marketingcloud.TOKEN_REFRESHED");


    /* renamed from: a, reason: collision with root package name */
    @SuppressLint
    public final String f16855a;
    public final boolean b;

    @Nullable
    public final a c;

    a(String str) {
        this(str, false);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f16855a;
    }

    a(String str, a aVar) {
        this.f16855a = str;
        this.b = false;
        this.c = aVar;
    }

    public static a a(String str) {
        if (str == null) {
            return null;
        }
        for (a aVar : values()) {
            if (str.equals(aVar.f16855a)) {
                return aVar;
            }
        }
        return null;
    }

    a(String str, boolean z) {
        this.f16855a = str;
        this.b = z;
        this.c = null;
    }
}

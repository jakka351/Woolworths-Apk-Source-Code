package com.dynatrace.android.agent.conf;

import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;

/* loaded from: classes.dex */
public class PrivacyRules {
    public static final PrivacyRules b;

    /* renamed from: a, reason: collision with root package name */
    public final UserPrivacyOptions f14094a;

    static {
        UserPrivacyOptions.Builder builder = new UserPrivacyOptions.Builder();
        builder.f14105a = DataCollectionLevel.USER_BEHAVIOR;
        builder.b = true;
        builder.c = false;
        builder.d = null;
        b = new PrivacyRules(new UserPrivacyOptions(builder));
        UserPrivacyOptions.Builder builder2 = new UserPrivacyOptions.Builder();
        builder2.f14105a = DataCollectionLevel.OFF;
        new UserPrivacyOptions(builder2);
    }

    public PrivacyRules(UserPrivacyOptions userPrivacyOptions) {
        this.f14094a = userPrivacyOptions;
    }

    public final boolean a(EventType eventType) {
        EventType eventType2 = EventType.s;
        UserPrivacyOptions userPrivacyOptions = this.f14094a;
        return eventType == eventType2 ? userPrivacyOptions.b : eventType == EventType.h ? userPrivacyOptions.f14104a == DataCollectionLevel.OFF : eventType.e.ordinal() <= userPrivacyOptions.f14104a.ordinal();
    }
}

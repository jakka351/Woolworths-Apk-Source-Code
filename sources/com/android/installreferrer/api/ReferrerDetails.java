package com.android.installreferrer.api;

import android.os.Bundle;

/* loaded from: classes4.dex */
public class ReferrerDetails {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f13488a;

    public ReferrerDetails(Bundle bundle) {
        this.f13488a = bundle;
    }

    public final long a() {
        return this.f13488a.getLong("install_begin_timestamp_seconds");
    }

    public final String b() {
        return this.f13488a.getString("install_referrer");
    }

    public final long c() {
        return this.f13488a.getLong("referrer_click_timestamp_seconds");
    }
}

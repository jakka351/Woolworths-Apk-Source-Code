package com.braintreepayments.api;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/ConfigurationCache;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class ConfigurationCache {
    public static final Companion b = new Companion();
    public static final long c = TimeUnit.MINUTES.toMillis(5);
    public static volatile ConfigurationCache d;

    /* renamed from: a, reason: collision with root package name */
    public final BraintreeSharedPreferences f13716a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/braintreepayments/api/ConfigurationCache$Companion;", "", "Lcom/braintreepayments/api/ConfigurationCache;", "INSTANCE", "Lcom/braintreepayments/api/ConfigurationCache;", "", "TIME_TO_LIVE", "J", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public ConfigurationCache(BraintreeSharedPreferences braintreeSharedPreferences) {
        this.f13716a = braintreeSharedPreferences;
    }
}

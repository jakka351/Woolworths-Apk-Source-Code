package com.braintreepayments.api;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PayPalDataCollector {

    /* renamed from: a, reason: collision with root package name */
    public final MagnesInternalClient f13736a;
    public final UUIDHelper b;

    /* renamed from: com.braintreepayments.api.PayPalDataCollector$1, reason: invalid class name */
    class AnonymousClass1 implements ConfigurationCallback {
        @Override // com.braintreepayments.api.ConfigurationCallback
        public final void a(Configuration configuration, Exception exc) {
            configuration.getClass();
            new JSONObject();
            throw null;
        }
    }

    public PayPalDataCollector() {
        MagnesInternalClient magnesInternalClient = new MagnesInternalClient();
        UUIDHelper uUIDHelper = new UUIDHelper();
        this.f13736a = magnesInternalClient;
        this.b = uUIDHelper;
    }

    public final String a(Context context) {
        this.b.getClass();
        BraintreeSharedPreferences braintreeSharedPreferencesA = BraintreeSharedPreferences.a(context);
        Intrinsics.g(braintreeSharedPreferencesA, "getInstance(context)");
        SharedPreferences sharedPreferences = braintreeSharedPreferencesA.f13707a;
        String installationGUID = sharedPreferences.getString("InstallationGUID", null);
        if (installationGUID == null) {
            installationGUID = UUID.randomUUID().toString();
            au.com.woolworths.shop.checkout.ui.confirmation.c.v(sharedPreferences, "InstallationGUID", installationGUID);
        }
        Intrinsics.g(installationGUID, "installationGUID");
        return installationGUID;
    }
}

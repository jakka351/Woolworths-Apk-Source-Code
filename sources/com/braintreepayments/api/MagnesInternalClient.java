package com.braintreepayments.api;

import android.content.Context;
import android.util.Log;
import lib.android.paypal.com.magnessdk.Environment;
import lib.android.paypal.com.magnessdk.InvalidInputException;
import lib.android.paypal.com.magnessdk.MagnesSDK;
import lib.android.paypal.com.magnessdk.MagnesSettings;

/* loaded from: classes4.dex */
class MagnesInternalClient {

    /* renamed from: a, reason: collision with root package name */
    public final MagnesSDK f13729a = MagnesSDK.b();

    public final String a(Context context, Configuration configuration, PayPalDataCollectorInternalRequest payPalDataCollectorInternalRequest) {
        MagnesSDK magnesSDK = this.f13729a;
        if (context == null) {
            return "";
        }
        Environment environment = configuration.b.equalsIgnoreCase("sandbox") ? Environment.e : Environment.d;
        try {
            MagnesSettings.Builder builder = new MagnesSettings.Builder(context.getApplicationContext());
            builder.f24890a = 12;
            builder.d = environment;
            String str = payPalDataCollectorInternalRequest.f13737a;
            if (str == null || str.isEmpty() || !str.matches("^[a-zA-Z0-9-]*$") || str.length() > 36 || str.length() < 30) {
                throw new InvalidInputException("Application’s Globally Unique Identifier (AppGUID) does not match the criteria, This is a string that identifies the merchant application that sets up Magnes on the mobile device. If the merchant app does not pass an AppGuid, Magnes creates one to identify the app. An AppGuid is an application identifier per-installation; that is, if a new instance of the app is installed on the mobile device, or the app is reinstalled, it will have a new AppGuid.\n ***AppGuid Criteria*** \n   Max length: 36 characters \n   Min Length: 30 characters \n   Regex: Letters, numbers and dashes only \n");
            }
            builder.b = str;
            builder.e = payPalDataCollectorInternalRequest.c;
            magnesSDK.c(builder.a());
            return magnesSDK.a(context.getApplicationContext(), payPalDataCollectorInternalRequest.b).f24887a;
        } catch (InvalidInputException e) {
            Log.e("Exception", "Error fetching client metadata ID. Contact Braintree Support for assistance.", e);
            return "";
        }
    }
}

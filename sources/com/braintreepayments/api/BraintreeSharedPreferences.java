package com.braintreepayments.api;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
class BraintreeSharedPreferences {
    public static volatile BraintreeSharedPreferences b;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f13707a;

    public BraintreeSharedPreferences(SharedPreferences sharedPreferences) {
        this.f13707a = sharedPreferences;
    }

    public static BraintreeSharedPreferences a(Context context) {
        if (b == null) {
            synchronized (BraintreeSharedPreferences.class) {
                try {
                    if (b == null) {
                        b = new BraintreeSharedPreferences(context.getSharedPreferences("com.braintreepayments.api.SHARED_PREFERENCES", 0));
                    }
                } finally {
                }
            }
        }
        return b;
    }
}

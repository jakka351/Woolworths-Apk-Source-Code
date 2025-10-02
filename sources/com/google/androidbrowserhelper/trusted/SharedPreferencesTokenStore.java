package com.google.androidbrowserhelper.trusted;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import androidx.browser.trusted.Token;
import androidx.browser.trusted.TokenStore;
import au.com.woolworths.shop.checkout.ui.confirmation.c;

/* loaded from: classes.dex */
public class SharedPreferencesTokenStore implements TokenStore {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14784a;

    public SharedPreferencesTokenStore(Context context) {
        this.f14784a = context.getApplicationContext();
    }

    public final void a(Token token) {
        SharedPreferences sharedPreferencesA = PrefUtils.a(this.f14784a);
        if (token == null) {
            sharedPreferencesA.edit().remove("SharedPreferencesTokenStore.TOKEN").apply();
        } else {
            c.v(sharedPreferencesA, "SharedPreferencesTokenStore.TOKEN", Base64.encodeToString(token.b(), 3));
        }
    }
}

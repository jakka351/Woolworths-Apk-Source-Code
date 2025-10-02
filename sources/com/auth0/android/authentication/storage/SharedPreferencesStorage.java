package com.auth0.android.authentication.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/auth0/android/authentication/storage/SharedPreferencesStorage;", "Lcom/auth0/android/authentication/storage/Storage;", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SharedPreferencesStorage implements Storage {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f13658a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/auth0/android/authentication/storage/SharedPreferencesStorage$Companion;", "", "", "SHARED_PREFERENCES_NAME", "Ljava/lang/String;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesStorage(@NotNull Context context) {
        this(context, 0);
        Intrinsics.h(context, "context");
    }

    public final void a(String str) {
        this.f13658a.edit().remove(str).apply();
    }

    public final Long b() {
        SharedPreferences sharedPreferences = this.f13658a;
        if (sharedPreferences.contains("com.auth0.expires_at")) {
            return Long.valueOf(sharedPreferences.getLong("com.auth0.expires_at", 0L));
        }
        return null;
    }

    public final String c(String str) {
        SharedPreferences sharedPreferences = this.f13658a;
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getString(str, null);
        }
        return null;
    }

    public final void d(String str, String str2) {
        SharedPreferences sharedPreferences = this.f13658a;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            c.v(sharedPreferences, str, str2);
        }
    }

    public SharedPreferencesStorage(Context context, int i) {
        Intrinsics.h(context, "context");
        if (TextUtils.isEmpty("com.auth0.authentication.storage")) {
            throw new IllegalArgumentException("The SharedPreferences name is invalid.");
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.auth0.authentication.storage", 0);
        Intrinsics.g(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        this.f13658a = sharedPreferences;
    }
}

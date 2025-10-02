package com.cisco.or.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.cisco.or.sdk.enums.SigningState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/cisco/or/sdk/utils/SharedPrefs;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SharedPrefs {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f14054a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/cisco/or/sdk/utils/SharedPrefs$Companion;", "", "", "APP_ID", "Ljava/lang/String;", "CLIENT_PRIVATE_KEY", "CLIENT_PUBLIC_KEY", "FQDN", "PREF_DNA_SPACES_KEY", "PREF_SDK_TOKEN", "PREF_SIGNING_STATE", "PROFILE_DATA", "PROFILE_INSTALLED", "PUSH_IDENTIFIER", "REGION", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public SharedPrefs(@NotNull Context context) {
        Intrinsics.h(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "ACCESS_TOKEN", 0);
        Intrinsics.g(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f14054a = sharedPreferences;
    }

    public final SigningState a() {
        return this.f14054a.getInt("PREF_SIGNING_STATE", 1) == 0 ? SigningState.d : SigningState.e;
    }

    public final void b(boolean z) {
        this.f14054a.edit().putBoolean("PROFILE_INSTALLED", z).apply();
    }

    public final void c(SigningState signingState) {
        this.f14054a.edit().putInt("PREF_SIGNING_STATE", signingState.ordinal()).apply();
    }
}

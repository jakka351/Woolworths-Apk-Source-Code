package com.salesforce.marketingcloud.registration;

import android.os.Build;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f17039a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @NotNull
    private final String d;

    @NotNull
    private final String e;

    @NotNull
    private final String f;

    @NotNull
    private final String g;

    public f(@NotNull String deviceId, @NotNull String appId, @NotNull String appVersion) {
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(appId, "appId");
        Intrinsics.h(appVersion, "appVersion");
        this.f17039a = deviceId;
        this.b = appId;
        this.c = appVersion;
        this.d = String.format(Locale.ENGLISH, "%s %s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
        this.e = "Android";
        String str = Build.VERSION.RELEASE;
        this.f = str == null ? "Unknown Release" : str;
        String sdkVersionName = MarketingCloudSdk.getSdkVersionName();
        Intrinsics.g(sdkVersionName, "getSdkVersionName(...)");
        this.g = sdkVersionName;
    }

    @NotNull
    public final String a() {
        return this.f17039a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.b;
    }

    @NotNull
    public final String e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.c(this.f17039a, fVar.f17039a) && Intrinsics.c(this.b, fVar.b) && Intrinsics.c(this.c, fVar.c);
    }

    @NotNull
    public final String f() {
        return this.f17039a;
    }

    @NotNull
    public final String g() {
        return this.d;
    }

    @NotNull
    public final String h() {
        return this.e;
    }

    public int hashCode() {
        return this.c.hashCode() + androidx.camera.core.impl.b.c(this.f17039a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String i() {
        return this.f;
    }

    @NotNull
    public final String j() {
        return this.g;
    }

    @NotNull
    public String toString() {
        String str = this.f17039a;
        String str2 = this.b;
        return YU.a.o(YU.a.v("RegistrationMeta(deviceId=", str, ", appId=", str2, ", appVersion="), this.c, ")");
    }

    @NotNull
    public final f a(@NotNull String deviceId, @NotNull String appId, @NotNull String appVersion) {
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(appId, "appId");
        Intrinsics.h(appVersion, "appVersion");
        return new f(deviceId, appId, appVersion);
    }

    public static /* synthetic */ f a(f fVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fVar.f17039a;
        }
        if ((i & 2) != 0) {
            str2 = fVar.b;
        }
        if ((i & 4) != 0) {
            str3 = fVar.c;
        }
        return fVar.a(str, str2, str3);
    }
}

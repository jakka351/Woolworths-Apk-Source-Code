package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.registration.Registration;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@RestrictTo
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16928a = new a(null);

    public static final class a {
        private a() {
        }

        @JvmStatic
        @NotNull
        public final Registration a(@NotNull JSONObject json) {
            Intrinsics.h(json, "json");
            return new Registration(json);
        }

        @JvmStatic
        @NotNull
        public final JSONObject b(@NotNull Registration registration) {
            Intrinsics.h(registration, "registration");
            return registration.toJson$sdk_release();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int a(@NotNull Registration registration) {
            Intrinsics.h(registration, "registration");
            return registration.getId();
        }

        @JvmStatic
        public final void a(@NotNull Registration registration, int i) {
            Intrinsics.h(registration, "registration");
            registration.setId$sdk_release(i);
        }
    }

    @JvmStatic
    @NotNull
    public static final Registration a(@NotNull JSONObject jSONObject) {
        return f16928a.a(jSONObject);
    }

    @JvmStatic
    @NotNull
    public static final JSONObject b(@NotNull Registration registration) {
        return f16928a.b(registration);
    }

    @JvmStatic
    public static final int a(@NotNull Registration registration) {
        return f16928a.a(registration);
    }

    @JvmStatic
    public static final void a(@NotNull Registration registration, int i) {
        f16928a.a(registration, i);
    }
}

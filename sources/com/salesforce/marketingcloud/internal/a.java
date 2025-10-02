package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@RestrictTo
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0363a f16919a = new C0363a(null);

    /* renamed from: com.salesforce.marketingcloud.internal.a$a, reason: collision with other inner class name */
    public static final class C0363a {
        private C0363a() {
        }

        @JvmStatic
        @NotNull
        public final String a(@NotNull InAppMessage message) {
            Intrinsics.h(message, "message");
            return message.getActivityInstanceId();
        }

        @JvmStatic
        @NotNull
        public final JSONObject b(@NotNull InAppMessage message) {
            Intrinsics.h(message, "message");
            return message.m172toJson();
        }

        public /* synthetic */ C0363a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final InAppMessage.CloseButton a() {
            return InAppMessage.CloseButton.INSTANCE.a();
        }
    }

    @JvmStatic
    @NotNull
    public static final String a(@NotNull InAppMessage inAppMessage) {
        return f16919a.a(inAppMessage);
    }

    @JvmStatic
    @NotNull
    public static final JSONObject b(@NotNull InAppMessage inAppMessage) {
        return f16919a.b(inAppMessage);
    }

    @JvmStatic
    @NotNull
    public static final InAppMessage.CloseButton a() {
        return f16919a.a();
    }
}

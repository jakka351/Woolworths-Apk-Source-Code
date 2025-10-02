package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.Message;
import com.salesforce.marketingcloud.messages.Region;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16926a = new a(null);

    public static final class a {
        private a() {
        }

        @JvmStatic
        @NotNull
        public final NotificationMessage a(@NotNull Message message, @NotNull Region region) {
            Intrinsics.h(message, "message");
            Intrinsics.h(region, "region");
            return NotificationMessage.INSTANCE.a(message, region);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final NotificationMessage a(@NotNull Map<String, String> data) {
            Intrinsics.h(data, "data");
            return NotificationMessage.INSTANCE.a(data);
        }

        @JvmStatic
        public final void a(@NotNull NotificationMessage message, int i) {
            Intrinsics.h(message, "message");
            message.setNotificationId$sdk_release(i);
        }
    }

    @JvmStatic
    @NotNull
    public static final NotificationMessage a(@NotNull Message message, @NotNull Region region) {
        return f16926a.a(message, region);
    }

    @JvmStatic
    @NotNull
    public static final NotificationMessage a(@NotNull Map<String, String> map) {
        return f16926a.a(map);
    }

    @JvmStatic
    public static final void a(@NotNull NotificationMessage notificationMessage, int i) {
        f16926a.a(notificationMessage, i);
    }
}

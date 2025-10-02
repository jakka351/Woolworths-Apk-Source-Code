package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.Message;
import java.util.Date;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16924a = new a(null);

    public static final class a {
        private a() {
        }

        @JvmStatic
        @Nullable
        public final Date a(@NotNull Message message) {
            Intrinsics.h(message, "message");
            return message.getLastShownDate();
        }

        @JvmStatic
        @Nullable
        public final Date b(@NotNull Message message) {
            Intrinsics.h(message, "message");
            return message.getNextAllowedShow();
        }

        @JvmStatic
        public final int c(@NotNull Message message) {
            Intrinsics.h(message, "message");
            return message.getNotificationId();
        }

        @JvmStatic
        public final int d(@NotNull Message message) {
            Intrinsics.h(message, "message");
            return message.getPeriodShowCount();
        }

        @JvmStatic
        public final int e(@NotNull Message message) {
            Intrinsics.h(message, "message");
            return message.getShowCount();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull Message message, @Nullable Date date) {
            Intrinsics.h(message, "message");
            message.m122lastShownDate(date);
        }

        @JvmStatic
        public final void b(@NotNull Message message, @Nullable Date date) {
            Intrinsics.h(message, "message");
            message.m124nextAllowedShow(date);
        }

        @JvmStatic
        public final void c(@NotNull Message message, int i) {
            Intrinsics.h(message, "message");
            message.m130showCount(i);
        }

        @JvmStatic
        public final void a(@NotNull Message message, int i) {
            Intrinsics.h(message, "message");
            message.m126notificationId(i);
        }

        @JvmStatic
        public final void b(@NotNull Message message, int i) {
            Intrinsics.h(message, "message");
            message.m128periodShowCount(i);
        }
    }

    @JvmStatic
    @Nullable
    public static final Date a(@NotNull Message message) {
        return f16924a.a(message);
    }

    @JvmStatic
    @Nullable
    public static final Date b(@NotNull Message message) {
        return f16924a.b(message);
    }

    @JvmStatic
    public static final int c(@NotNull Message message) {
        return f16924a.c(message);
    }

    @JvmStatic
    public static final int d(@NotNull Message message) {
        return f16924a.d(message);
    }

    @JvmStatic
    public static final int e(@NotNull Message message) {
        return f16924a.e(message);
    }

    @JvmStatic
    public static final void a(@NotNull Message message, @Nullable Date date) {
        f16924a.a(message, date);
    }

    @JvmStatic
    public static final void b(@NotNull Message message, @Nullable Date date) {
        f16924a.b(message, date);
    }

    @JvmStatic
    public static final void c(@NotNull Message message, int i) {
        f16924a.c(message, i);
    }

    @JvmStatic
    public static final void a(@NotNull Message message, int i) {
        f16924a.a(message, i);
    }

    @JvmStatic
    public static final void b(@NotNull Message message, int i) {
        f16924a.b(message, i);
    }
}

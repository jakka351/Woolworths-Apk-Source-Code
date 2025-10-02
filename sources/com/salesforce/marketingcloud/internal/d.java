package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MCLogListener;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16922a = new a(null);

    public static final class a {
        private a() {
        }

        @JvmStatic
        public final int a() {
            return com.salesforce.marketingcloud.g.f16896a.b();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(int i) {
            com.salesforce.marketingcloud.g.f16896a.a(i);
        }

        @JvmStatic
        public final void a(@Nullable MCLogListener mCLogListener) {
            com.salesforce.marketingcloud.g.f16896a.a(mCLogListener);
        }

        @JvmStatic
        public final void a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            com.salesforce.marketingcloud.g.a(str, str2, str3);
        }
    }

    @JvmStatic
    public static final int a() {
        return f16922a.a();
    }

    @JvmStatic
    public static final void a(int i) {
        f16922a.a(i);
    }

    @JvmStatic
    public static final void a(@Nullable MCLogListener mCLogListener) {
        f16922a.a(mCLogListener);
    }

    @JvmStatic
    public static final void a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        f16922a.a(str, str2, str3);
    }
}

package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16923a = new a(null);

    public static final class a {
        private a() {
        }

        @JvmStatic
        public final boolean a(@NotNull MarketingCloudConfig self, @NotNull MarketingCloudConfig other) {
            Intrinsics.h(self, "self");
            Intrinsics.h(other, "other");
            return self.m66applicationChanged(other);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final boolean a(@NotNull MarketingCloudConfig marketingCloudConfig, @NotNull MarketingCloudConfig marketingCloudConfig2) {
        return f16923a.a(marketingCloudConfig, marketingCloudConfig2);
    }
}

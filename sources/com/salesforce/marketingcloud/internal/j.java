package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.Region;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RestrictTo
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16927a = new a(null);

    public static final class a {
        private a() {
        }

        @JvmStatic
        public final boolean a(@NotNull Region region) {
            Intrinsics.h(region, "region");
            return region.getIsInside();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Region a(@NotNull LatLon center, int i) {
            Intrinsics.h(center, "center");
            return Region.INSTANCE.m147magicFence(center, i);
        }

        @JvmStatic
        public final void a(@NotNull Region region, boolean z) {
            Intrinsics.h(region, "region");
            region.m144isInside(z);
        }
    }

    @JvmStatic
    public static final boolean a(@NotNull Region region) {
        return f16927a.a(region);
    }

    @JvmStatic
    @NotNull
    public static final Region a(@NotNull LatLon latLon, int i) {
        return f16927a.a(latLon, i);
    }

    @JvmStatic
    public static final void a(@NotNull Region region, boolean z) {
        f16927a.a(region, z);
    }
}

package com.salesforce.marketingcloud.config;

import android.net.Uri;
import com.medallia.digital.mobilesdk.q2;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16873a;

    @Nullable
    private final String b;

    @Nullable
    private final Integer c;

    public static final class a {
        private a() {
        }

        @JvmOverloads
        @NotNull
        public final b a(@NotNull String endpointIn) {
            Intrinsics.h(endpointIn, "endpointIn");
            return a(this, endpointIn, null, null, 6, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmOverloads
        @NotNull
        public final b a(@NotNull String endpointIn, @Nullable String str) {
            Intrinsics.h(endpointIn, "endpointIn");
            return a(this, endpointIn, str, null, 4, null);
        }

        @JvmOverloads
        @NotNull
        public final b a(@NotNull String endpointIn, @Nullable String str, @Nullable Integer num) {
            String string;
            Intrinsics.h(endpointIn, "endpointIn");
            String string2 = StringsKt.k0(endpointIn).toString();
            if (string2.length() == 0 || !ArraysKt.l(EnumC0356b.values(), EnumC0356b.valueOf(string2))) {
                throw new IllegalArgumentException("Invalid 'endpoint' for endpoint config.");
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (str == null || (string = StringsKt.k0(str).toString()) == null) {
                string = null;
            } else if (string.length() == 0 || !StringsKt.W(string, q2.c, false) || !string.equals(Uri.parse(string).getPath())) {
                throw new IllegalArgumentException(YU.a.h("Invalid 'path' for ", string2, " endpoint config."));
            }
            if (num != null && !new IntRange(10, Integer.MAX_VALUE, 1).g(num.intValue())) {
                throw new IllegalArgumentException(YU.a.h("Invalid 'maxBatchSize' for ", string2, " endpoint config."));
            }
            if (string == null && num == null) {
                throw new IllegalArgumentException(YU.a.h("Empty endpoint config for ", string2, " is pointless."));
            }
            return new b(string2, string, num, defaultConstructorMarker);
        }

        public static /* synthetic */ b a(a aVar, String str, String str2, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return aVar.a(str, str2, num);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.salesforce.marketingcloud.config.b$b, reason: collision with other inner class name */
    public static final class EnumC0356b {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0356b f16874a = new EnumC0356b("EVENTS", 0);
        private static final /* synthetic */ EnumC0356b[] b;
        private static final /* synthetic */ EnumEntries c;

        static {
            EnumC0356b[] enumC0356bArrA = a();
            b = enumC0356bArrA;
            c = EnumEntriesKt.a(enumC0356bArrA);
        }

        private EnumC0356b(String str, int i) {
        }

        private static final /* synthetic */ EnumC0356b[] a() {
            return new EnumC0356b[]{f16874a};
        }

        @NotNull
        public static EnumEntries<EnumC0356b> b() {
            return c;
        }

        public static EnumC0356b valueOf(String str) {
            return (EnumC0356b) Enum.valueOf(EnumC0356b.class, str);
        }

        public static EnumC0356b[] values() {
            return (EnumC0356b[]) b.clone();
        }
    }

    private b(String str, String str2, Integer num) {
        this.f16873a = str;
        this.b = str2;
        this.c = num;
    }

    @NotNull
    public final String a() {
        return this.f16873a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final Integer c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.f16873a;
    }

    @Nullable
    public final Integer e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.f16873a, bVar.f16873a) && Intrinsics.c(this.b, bVar.b) && Intrinsics.c(this.c, bVar.c);
    }

    @Nullable
    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = this.f16873a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f16873a;
        String str2 = this.b;
        return au.com.woolworths.android.onesite.a.p(YU.a.v("EndpointConfig(endpoint=", str, ", path=", str2, ", maxBatchSize="), this.c, ")");
    }

    public /* synthetic */ b(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }

    @NotNull
    public final b a(@NotNull String endpoint, @Nullable String str, @Nullable Integer num) {
        Intrinsics.h(endpoint, "endpoint");
        return new b(endpoint, str, num);
    }

    public /* synthetic */ b(String str, String str2, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num);
    }

    public static /* synthetic */ b a(b bVar, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f16873a;
        }
        if ((i & 2) != 0) {
            str2 = bVar.b;
        }
        if ((i & 4) != 0) {
            num = bVar.c;
        }
        return bVar.a(str, str2, num);
    }
}

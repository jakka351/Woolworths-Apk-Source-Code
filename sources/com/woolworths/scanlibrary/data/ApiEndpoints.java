package com.woolworths.scanlibrary.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/data/ApiEndpoints;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ApiEndpoints {
    public static final Companion f;
    public static final ApiEndpoints g;
    public static final /* synthetic */ ApiEndpoints[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;
    public final int e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/data/ApiEndpoints$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ApiEndpoints apiEndpoints = new ApiEndpoints("PRODUCTION", 0, "https://prod.mobile-api.woolworths.com.au", -1);
        ApiEndpoints apiEndpoints2 = new ApiEndpoints("STAGING", 1, "https://test.mobile-api.woolworths.com.au", 1);
        ApiEndpoints apiEndpoints3 = new ApiEndpoints("DEVELOPMENT", 2, "https://dev.mobile-api.woolworths.com.au", 0);
        g = apiEndpoints3;
        ApiEndpoints[] apiEndpointsArr = {apiEndpoints, apiEndpoints2, apiEndpoints3};
        h = apiEndpointsArr;
        i = EnumEntriesKt.a(apiEndpointsArr);
        f = new Companion();
    }

    public ApiEndpoints(String str, int i2, String str2, int i3) {
        this.d = str2;
        this.e = i3;
    }

    public static ApiEndpoints valueOf(String str) {
        return (ApiEndpoints) Enum.valueOf(ApiEndpoints.class, str);
    }

    public static ApiEndpoints[] values() {
        return (ApiEndpoints[]) h.clone();
    }
}

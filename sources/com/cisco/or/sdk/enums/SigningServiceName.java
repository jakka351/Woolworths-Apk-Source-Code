package com.cisco.or.sdk.enums;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/enums/SigningServiceName;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SigningServiceName {
    public static final /* synthetic */ SigningServiceName[] d = {new SigningServiceName("APPLE", 0), new SigningServiceName("GOOGLE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SigningServiceName EF5;

    public static SigningServiceName valueOf(String str) {
        return (SigningServiceName) Enum.valueOf(SigningServiceName.class, str);
    }

    public static SigningServiceName[] values() {
        return (SigningServiceName[]) d.clone();
    }
}

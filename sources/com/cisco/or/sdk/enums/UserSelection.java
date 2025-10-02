package com.cisco.or.sdk.enums;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/enums/UserSelection;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserSelection {
    public static final /* synthetic */ UserSelection[] d = {new UserSelection("ACCEPTED", 0), new UserSelection("REJECTED", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    UserSelection EF5;

    public static UserSelection valueOf(String str) {
        return (UserSelection) Enum.valueOf(UserSelection.class, str);
    }

    public static UserSelection[] values() {
        return (UserSelection[]) d.clone();
    }
}

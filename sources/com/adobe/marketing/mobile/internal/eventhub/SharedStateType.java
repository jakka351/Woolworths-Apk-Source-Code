package com.adobe.marketing.mobile.internal.eventhub;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/SharedStateType;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SharedStateType {
    public static final SharedStateType d;
    public static final SharedStateType e;
    public static final /* synthetic */ SharedStateType[] f;

    static {
        SharedStateType sharedStateType = new SharedStateType("STANDARD", 0);
        d = sharedStateType;
        SharedStateType sharedStateType2 = new SharedStateType("XDM", 1);
        e = sharedStateType2;
        f = new SharedStateType[]{sharedStateType, sharedStateType2};
    }

    public static SharedStateType valueOf(String str) {
        return (SharedStateType) Enum.valueOf(SharedStateType.class, str);
    }

    public static SharedStateType[] values() {
        return (SharedStateType[]) f.clone();
    }
}

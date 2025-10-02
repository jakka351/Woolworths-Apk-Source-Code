package com.cisco.or.sdk.enums;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/enums/SigningState;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SigningState {
    public static final SigningState d;
    public static final SigningState e;
    public static final /* synthetic */ SigningState[] f;

    static {
        SigningState signingState = new SigningState("SIGNED", 0);
        d = signingState;
        SigningState signingState2 = new SigningState("UNSIGNED", 1);
        e = signingState2;
        f = new SigningState[]{signingState, signingState2};
    }

    public static SigningState valueOf(String str) {
        return (SigningState) Enum.valueOf(SigningState.class, str);
    }

    public static SigningState[] values() {
        return (SigningState[]) f.clone();
    }
}

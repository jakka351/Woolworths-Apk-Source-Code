package com.cisco.or.sdk.enums;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/enums/LoadingState;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoadingState {
    public static final LoadingState d;
    public static final LoadingState e;
    public static final /* synthetic */ LoadingState[] f;

    static {
        LoadingState loadingState = new LoadingState("STARTED", 0);
        d = loadingState;
        LoadingState loadingState2 = new LoadingState("FINISHED", 1);
        e = loadingState2;
        f = new LoadingState[]{loadingState, loadingState2};
    }

    public static LoadingState valueOf(String str) {
        return (LoadingState) Enum.valueOf(LoadingState.class, str);
    }

    public static LoadingState[] values() {
        return (LoadingState[]) f.clone();
    }
}

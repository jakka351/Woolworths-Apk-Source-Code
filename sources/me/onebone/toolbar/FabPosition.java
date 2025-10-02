package me.onebone.toolbar;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lme/onebone/toolbar/FabPosition;", "", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class FabPosition {
    public static final /* synthetic */ FabPosition[] d = {new FabPosition("Center", 0), new FabPosition("End", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    FabPosition EF5;

    public static FabPosition valueOf(String str) {
        return (FabPosition) Enum.valueOf(FabPosition.class, str);
    }

    public static FabPosition[] values() {
        return (FabPosition[]) d.clone();
    }
}

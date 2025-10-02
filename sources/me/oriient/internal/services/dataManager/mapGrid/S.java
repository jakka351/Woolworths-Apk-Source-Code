package me.oriient.internal.services.dataManager.mapGrid;

import me.oriient.internal.services.dataModel.engine.MapGridFetchingStrategy;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class S {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[MapGridFetchingStrategy.values().length];
        try {
            iArr[MapGridFetchingStrategy.ENFORCE_MAJOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapGridFetchingStrategy.ALWAYS_ENFORCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MapGridFetchingStrategy.NEVER_ENFORCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}

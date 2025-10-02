package me.oriient.positioningengine.support.engineManager;

import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[SpecificEngineConfig.EngineLibrariesValidationStrategy.values().length];
        try {
            iArr[SpecificEngineConfig.EngineLibrariesValidationStrategy.SKIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SpecificEngineConfig.EngineLibrariesValidationStrategy.DENY_SERVICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}

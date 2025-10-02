package me.oriient.internal.infra.utils.core;

import me.oriient.internal.infra.utils.core.FileManager;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[FileManager.FileManagerFolders.values().length];
        try {
            iArr[FileManager.FileManagerFolders.FILES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}

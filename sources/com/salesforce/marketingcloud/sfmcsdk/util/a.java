package com.salesforce.marketingcloud.sfmcsdk.util;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.functions.Function1;
import me.oriient.internal.infra.utils.core.FileManagerImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17040a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.f17040a = i;
        this.b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f17040a) {
            case 0:
                return FileUtilsKt.m269wipeModuleFiles$lambda0((String) this.b, file, str);
            case 1:
                return FileUtilsKt.m270wipeModuleFiles$lambda2((String) this.b, file, str);
            case 2:
                return FileManagerImpl.findFile$lambda$0((String) this.b, file, str);
            default:
                return FileManagerImpl.deleteFiles$lambda$5((Function1) this.b, file, str);
        }
    }
}

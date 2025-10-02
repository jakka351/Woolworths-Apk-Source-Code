package com.scandit.datacapture.core.framesave;

import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ File f18517a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(File file) {
        super(1);
        this.f18517a = file;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return FilesKt.f(this.f18517a, new File(YU.a.d(((Number) obj).intValue(), "sequence_")));
    }
}

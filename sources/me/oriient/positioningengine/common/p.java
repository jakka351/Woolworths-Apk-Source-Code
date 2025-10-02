package me.oriient.positioningengine.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.utils.core.FileManager;

/* loaded from: classes8.dex */
public final class p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p f26388a = new p();

    public p() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new me.oriient.positioningengine.ondevice.ml.f((FileManager) DiKt.getDi().get(Reflection.f24268a.b(FileManager.class), FileManager.FileManagerFolders.FILES.getDiKey()));
    }
}

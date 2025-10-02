package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManagerImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.c4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1629c4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1629c4 f26056a = new C1629c4();

    public C1629c4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SupportPositioningEngineManagerImpl((SupportEngineUploadManager) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SupportEngineUploadManager.class)));
    }
}

package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.utils.SdkBuildData;
import me.oriient.ipssdk.realtime.ips.engine.ScheduledWorkImpl;
import me.oriient.positioningengine.support.engineManager.SupportEngineUploadManagerImpl;

/* loaded from: classes8.dex */
public final class I4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final I4 f25958a = new I4();

    public I4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new SupportEngineUploadManagerImpl(((SdkBuildData) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SdkBuildData.class))).getConfigSdkType(), new ScheduledWorkImpl());
    }
}

package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.Internal;

/* renamed from: me.oriient.ipssdk.realtime.ofs.r2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1716r2 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public static final C1716r2 f26138a = new C1716r2();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Internal.access$getDebugInfoManager(Internal.INSTANCE).setEnabled(((RemoteConfig) obj).getRealTime().getMisc().isDebugDataManagerEnabled());
        return Unit.f24250a;
    }
}

package me.oriient.positioningengine.common;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.BuildData;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.websocket.util.ELogIOManagerImpl;

/* loaded from: classes8.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f26384a = new m();

    public m() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new ELogIOManagerImpl((ELog) di.get(reflectionFactory.b(ELog.class), null), (BuildData) DiKt.getDi().get(reflectionFactory.b(BuildData.class), null));
    }
}

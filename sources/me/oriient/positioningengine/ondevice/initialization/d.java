package me.oriient.positioningengine.ondevice.initialization;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.engine.EngineVersionProvider;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d implements EngineVersionProvider {

    @NotNull
    private static final b Companion = new b();
    public static final Regex c = new Regex("\\d+.\\d+.\\d+");

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26436a = LazyKt.b(new c(this));
    public final Lazy b = DiKt.getDi().inject(Reflection.f24268a.b(Logger.class));

    @Override // me.oriient.internal.services.dataManager.engine.EngineVersionProvider
    public final String getShortVersion() {
        return (String) this.f26436a.getD();
    }

    @Override // me.oriient.internal.services.dataManager.engine.EngineVersionProvider
    public final String getVersion() {
        return "8.1.0-onDevice";
    }
}

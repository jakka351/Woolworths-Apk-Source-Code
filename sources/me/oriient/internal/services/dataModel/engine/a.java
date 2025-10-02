package me.oriient.internal.services.dataModel.engine;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.EnumsKt;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;

/* loaded from: classes7.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f25423a = new a();

    public a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return EnumsKt.a("me.oriient.internal.services.dataModel.engine.SpecificEngineConfig.EngineLibrariesValidationStrategy", SpecificEngineConfig.EngineLibrariesValidationStrategy.values(), new String[]{"skip", "deny_service"}, new Annotation[][]{null, null});
    }
}

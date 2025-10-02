package com.adobe.marketing.mobile.internal.configuration;

import androidx.camera.core.impl.utils.futures.e;
import com.adobe.marketing.mobile.SharedStateResolver;
import com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension;
import com.adobe.marketing.mobile.services.Log;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.ondevice.ml.MlModel;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", MlModel.MODEL_FILE_SUFFIX, "", "", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class ConfigurationExtension$configureWithAppID$1 extends Lambda implements Function1<Map<String, ? extends Object>, Unit> {
    public final /* synthetic */ ConfigurationExtension h;
    public final /* synthetic */ SharedStateResolver i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigurationExtension$configureWithAppID$1(ConfigurationExtension configurationExtension, SharedStateResolver sharedStateResolver, String str) {
        super(1);
        this.h = configurationExtension;
        this.i = sharedStateResolver;
        this.j = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws NumberFormatException {
        Map map = (Map) obj;
        SharedStateResolver sharedStateResolver = this.i;
        ConfigurationExtension configurationExtension = this.h;
        if (map != null) {
            ScheduledFuture scheduledFuture = configurationExtension.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            configurationExtension.g = null;
            configurationExtension.f = 0;
            configurationExtension.h(ConfigurationExtension.RulesSource.e, sharedStateResolver);
        } else {
            Log.c();
            if (sharedStateResolver != 0) {
                sharedStateResolver.a(configurationExtension.c.f);
            }
            int i = configurationExtension.f + 1;
            configurationExtension.f = i;
            ScheduledFuture<?> scheduledFutureSchedule = configurationExtension.e.schedule(new e(27, configurationExtension, this.j), i * 5000, TimeUnit.MILLISECONDS);
            Intrinsics.g(scheduledFutureSchedule, "retryWorker.schedule(\n  …it.MILLISECONDS\n        )");
            configurationExtension.g = scheduledFutureSchedule;
        }
        configurationExtension.f13161a.g();
        return Unit.f24250a;
    }
}

package com.adobe.marketing.mobile.internal.configuration;

import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.ondevice.ml.MlModel;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", MlModel.MODEL_FILE_SUFFIX, "", "", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class ConfigurationStateManager$updateConfigWithAppId$1 extends Lambda implements Function1<Map<String, ? extends Object>, Unit> {
    public final /* synthetic */ ConfigurationStateManager h;
    public final /* synthetic */ String i;
    public final /* synthetic */ Function1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigurationStateManager$updateConfigWithAppId$1(ConfigurationStateManager configurationStateManager, String str, Function1 function1) {
        super(1);
        this.h = configurationStateManager;
        this.i = str;
        this.j = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws NumberFormatException {
        Map map = (Map) obj;
        Function1 function1 = this.j;
        if (map != null) {
            ConfigurationStateManager configurationStateManager = this.h;
            configurationStateManager.c(map);
            configurationStateManager.g.put(this.i, new Date());
            ((ConfigurationExtension$configureWithAppID$1) function1).invoke(configurationStateManager.f);
        } else {
            ((ConfigurationExtension$configureWithAppID$1) function1).invoke(null);
        }
        return Unit.f24250a;
    }
}

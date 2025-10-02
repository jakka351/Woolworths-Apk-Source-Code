package com.adobe.marketing.mobile.internal.migration;

import android.content.Context;
import android.content.SharedPreferences;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.internal.context.App;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class V4Migrator$v4SharedPreferences$2 extends Lambda implements Function0<SharedPreferences> {
    public static final V4Migrator$v4SharedPreferences$2 h = new V4Migrator$v4SharedPreferences$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ServiceProvider.a().getClass();
        Context contextA = App.f13247a.a();
        if (contextA != null) {
            return contextA.getSharedPreferences("APP_MEASUREMENT_CACHE", 0);
        }
        return null;
    }
}

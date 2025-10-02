package com.livefront.gsonkotlinadapter;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Lkotlin/reflect/KParameter;", "invoke"}, k = 3, mv = {1, 1, 16})
/* loaded from: classes6.dex */
final class KotlinReflectiveTypeAdapterFactory$Adapter$read$1$names$2 extends Lambda implements Function1<KParameter, String> {
    public static final KotlinReflectiveTypeAdapterFactory$Adapter$read$1$names$2 h = new KotlinReflectiveTypeAdapterFactory$Adapter$read$1$names$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KParameter it = (KParameter) obj;
        Intrinsics.i(it, "it");
        String name = it.getName();
        if (name != null) {
            return name;
        }
        Intrinsics.n();
        throw null;
    }
}

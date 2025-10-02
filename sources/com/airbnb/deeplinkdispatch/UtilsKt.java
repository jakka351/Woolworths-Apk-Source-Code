package com.airbnb.deeplinkdispatch;

import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"deeplinkdispatch_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class UtilsKt {
    public static final Bundle a(Bundle bundle, Function2 function2) {
        Bundle bundle2 = new Bundle(bundle);
        Set<String> setKeySet = bundle.keySet();
        if (setKeySet != null) {
            for (String key : setKeySet) {
                Intrinsics.g(key, "key");
                if (!((Boolean) ((BaseDeepLinkDelegate$createResult$1$1) function2).invoke(key, bundle.get(key))).booleanValue()) {
                    bundle2.remove(key);
                }
            }
        }
        return bundle2;
    }
}

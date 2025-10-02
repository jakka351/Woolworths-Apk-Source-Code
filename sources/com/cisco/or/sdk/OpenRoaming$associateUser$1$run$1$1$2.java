package com.cisco.or.sdk;

import android.util.Log;
import com.cisco.or.sdk.enums.SigningState;
import com.cisco.or.sdk.utils.SharedPrefs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OpenRoaming$associateUser$1$run$1$1$2 extends Lambda implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPrefs sharedPrefs = OpenRoaming.c;
        if (sharedPrefs == null) {
            Intrinsics.p("sharedPref");
            throw null;
        }
        sharedPrefs.c(SigningState.d);
        Log.d("com.cisco.or.sdk.OpenRoaming", "Service login started.");
        throw null;
    }
}

package com.cisco.or.sdk;

import com.cisco.or.sdk.enums.SigningState;
import com.cisco.or.sdk.services.HTTPResponse;
import com.cisco.or.sdk.utils.SharedPrefs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/cisco/or/sdk/services/HTTPResponse;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OpenRoaming$associateUser$2 extends Lambda implements Function1<HTTPResponse, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SharedPrefs sharedPrefs = OpenRoaming.c;
        if (sharedPrefs == null) {
            Intrinsics.p("sharedPref");
            throw null;
        }
        sharedPrefs.c(SigningState.d);
        throw null;
    }
}

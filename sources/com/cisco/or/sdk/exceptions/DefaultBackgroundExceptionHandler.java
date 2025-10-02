package com.cisco.or.sdk.exceptions;

import android.util.Log;
import com.cisco.or.sdk.OpenRoaming;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/exceptions/DefaultBackgroundExceptionHandler;", "Lcom/cisco/or/sdk/exceptions/DNASpacesBackgroundExceptionHandler;", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultBackgroundExceptionHandler implements DNASpacesBackgroundExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f14040a = OpenRoaming.class.getName();

    @Override // com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler
    public final void a(Exception exc) {
        Log.e(this.f14040a, "Exception caught by DefaultBackgroundExceptionHandler ", exc);
    }
}

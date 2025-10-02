package com.cisco.or.sdk.services;

import android.content.Context;
import com.cisco.or.sdk.exceptions.DNASpacesBackgroundExceptionHandler;
import com.cisco.or.sdk.exceptions.ServiceBadResponseException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/Context;", "response", "Lcom/cisco/or/sdk/services/HTTPResponse;", "<anonymous parameter 2>", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Service$call$1 extends Lambda implements Function3<Context, HTTPResponse, IOException, Unit> {
    public final /* synthetic */ DNASpacesBackgroundExceptionHandler h;
    public final /* synthetic */ Function1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Service$call$1(DNASpacesBackgroundExceptionHandler dNASpacesBackgroundExceptionHandler, Function1 function1) {
        super(3);
        this.h = dNASpacesBackgroundExceptionHandler;
        this.i = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HTTPResponse hTTPResponse = (HTTPResponse) obj2;
        DNASpacesBackgroundExceptionHandler dNASpacesBackgroundExceptionHandler = this.h;
        if (hTTPResponse != null && hTTPResponse.c == 200) {
            this.i.invoke(hTTPResponse);
        } else {
            dNASpacesBackgroundExceptionHandler.a(new ServiceBadResponseException());
        }
        return Unit.f24250a;
    }
}

package com.braintreepayments.api;

import com.medallia.digital.mobilesdk.e6;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpResponseParser;", "Lcom/braintreepayments/api/HttpResponseParser;", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class BraintreeHttpResponseParser implements HttpResponseParser {

    /* renamed from: a, reason: collision with root package name */
    public final HttpResponseParser f13705a = new BaseHttpResponseParser();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/braintreepayments/api/BraintreeHttpResponseParser$Companion;", "", "", "AUTH_ERROR_CODE", "I", "UNPROCESSABLE_ENTITY_ERROR_CODE", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    @Override // com.braintreepayments.api.HttpResponseParser
    public final String a(HttpURLConnection httpURLConnection, int i) throws ErrorWithResponse, AuthorizationException {
        try {
            String strA = this.f13705a.a(httpURLConnection, i);
            Intrinsics.g(strA, "{\n        baseParser.par…seCode, connection)\n    }");
            return strA;
        } catch (AuthorizationException e) {
            throw new AuthorizationException(new ErrorWithResponse(e6.h, e.getMessage()).e);
        } catch (UnprocessableEntityException e2) {
            throw new ErrorWithResponse(422, e2.getMessage());
        }
    }
}

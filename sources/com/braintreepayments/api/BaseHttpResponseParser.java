package com.braintreepayments.api;

import com.dynatrace.android.callback.Callback;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;

/* loaded from: classes4.dex */
class BaseHttpResponseParser implements HttpResponseParser {
    public static String b(InputStream inputStream, boolean z) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z) {
            try {
                inputStream = new GZIPInputStream(inputStream);
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
        String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
        return str;
    }

    @Override // com.braintreepayments.api.HttpResponseParser
    public final String a(HttpURLConnection httpURLConnection, int i) throws AuthenticationException, UnprocessableEntityException, UnexpectedException, RateLimitException, IOException, ServiceUnavailableException, AuthorizationException, UpgradeRequiredException, ServerException {
        String strB;
        boolean zEquals = "gzip".equals(httpURLConnection.getContentEncoding());
        if (i != 429) {
            switch (i) {
                case 200:
                case 201:
                case DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER /* 202 */:
                    strB = b(Callback.a(httpURLConnection), zEquals);
                    break;
                default:
                    strB = b(httpURLConnection.getErrorStream(), zEquals);
                    break;
            }
        } else {
            strB = null;
        }
        if (i != 400) {
            if (i == 401) {
                throw new AuthenticationException(strB);
            }
            if (i == 403) {
                throw new AuthorizationException(strB);
            }
            if (i != 422) {
                if (i == 426) {
                    throw new UpgradeRequiredException(strB);
                }
                if (i == 429) {
                    throw new RateLimitException("You are being rate-limited. Please try again in a few minutes.");
                }
                if (i == 500) {
                    throw new ServerException(strB);
                }
                if (i == 503) {
                    throw new ServiceUnavailableException(strB);
                }
                switch (i) {
                    case 200:
                    case 201:
                    case DatastoreTestTrace.FirestoreV1Action.DATABASE_CONTENTS_BEFORE_ACTION_FIELD_NUMBER /* 202 */:
                        return strB;
                    default:
                        throw new UnexpectedException(strB);
                }
            }
        }
        throw new UnprocessableEntityException(strB);
    }
}

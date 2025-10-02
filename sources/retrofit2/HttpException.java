package retrofit2;

import java.util.Objects;

/* loaded from: classes2.dex */
public class HttpException extends RuntimeException {
    public final int d;
    public final transient Response e;

    public HttpException(Response response) {
        Objects.requireNonNull(response, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        okhttp3.Response response2 = response.f27002a;
        sb.append(response2.g);
        sb.append(" ");
        sb.append(response2.f);
        super(sb.toString());
        this.d = response2.g;
        String str = response2.f;
        this.e = response;
    }
}

package com.auth0.android;

import android.content.Context;
import androidx.constraintlayout.core.state.a;
import com.auth0.android.request.DefaultClient;
import com.auth0.android.util.Auth0UserAgent;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/auth0/android/Auth0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class Auth0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13650a;
    public final HttpUrl b;
    public final Auth0UserAgent c;
    public final DefaultClient d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/Auth0$Companion;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final String a(Context context, String str) {
            int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
            if (identifier == 0) {
                throw new IllegalArgumentException(String.format("The 'R.string.%s' value it's not defined in your project's resources file.", Arrays.copyOf(new Object[]{str}, 1)).toString());
            }
            String string = context.getString(identifier);
            Intrinsics.g(string, "context.getString(stringRes)");
            return string;
        }
    }

    public Auth0(String str, String str2) {
        HttpUrl httpUrlD;
        this.f13650a = str;
        this.d = new DefaultClient();
        if (str2 == null) {
            httpUrlD = null;
        } else {
            Locale locale = Locale.ROOT;
            String strM = a.m(locale, "ROOT", str2, locale, "this as java.lang.String).toLowerCase(locale)");
            if (StringsKt.W(strM, "http://", false)) {
                throw new IllegalArgumentException(YU.a.h("Invalid domain url: '", str2, "'. Only HTTPS domain URLs are supported. If no scheme is passed, HTTPS will be used.").toString());
            }
            strM = StringsKt.W(strM, "https://", false) ? strM : "https://".concat(strM);
            HttpUrl.j.getClass();
            httpUrlD = HttpUrl.Companion.d(strM);
        }
        this.b = httpUrlD;
        if (httpUrlD == null) {
            throw new IllegalArgumentException(String.format("Invalid domain url: '%s'", Arrays.copyOf(new Object[]{str2}, 1)).toString());
        }
        this.c = new Auth0UserAgent();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Auth0(@NotNull Context context) {
        this(Companion.a(context, "com_auth0_client_id"), Companion.a(context, "com_auth0_domain"));
        Intrinsics.h(context, "context");
    }
}

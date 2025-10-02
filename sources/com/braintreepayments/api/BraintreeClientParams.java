package com.braintreepayments.api;

import android.content.Context;
import android.net.Uri;
import com.braintreepayments.api.Authorization;
import com.salesforce.marketingcloud.storage.db.i;
import java.io.ByteArrayInputStream;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/BraintreeClientParams;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BraintreeClientParams {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13702a;
    public final String b;
    public final AuthorizationLoader c;
    public final String d;
    public final Uri e;
    public final BraintreeHttpClient f;
    public final BraintreeGraphQLClient g;
    public final AnalyticsClient h;
    public final BrowserSwitchClient i;
    public final ManifestValidator j;
    public final UUIDHelper k;
    public final ConfigurationLoader l;
    public final String m;
    public final Context n;
    public final String o;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/BraintreeClientParams$Companion;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public BraintreeClientParams(BraintreeOptions braintreeOptions) {
        Context context = braintreeOptions.f13706a;
        String str = braintreeOptions.d;
        AuthorizationLoader authorizationLoader = new AuthorizationLoader();
        authorizationLoader.f13699a = str != null ? Authorization.Companion.a(str) : null;
        String string = UUID.randomUUID().toString();
        Intrinsics.g(string, "randomUUID().toString()");
        String strQ = StringsKt.Q(string, "-", "", false);
        String returnUrlScheme = braintreeOptions.b;
        if (returnUrlScheme == null) {
            String packageName = context.getApplicationContext().getPackageName();
            Intrinsics.g(packageName, "context.applicationContext.packageName");
            returnUrlScheme = StringsKt.Q(packageName, "_", "", false).concat(".braintree");
        }
        Uri uri = braintreeOptions.c;
        BraintreeHttpClient braintreeHttpClient = new BraintreeHttpClient();
        byte[] bArr = TLSCertificatePinning.f13748a;
        new HttpClient(new TLSSocketFactory(new ByteArrayInputStream(TLSCertificatePinning.f13748a)), new BraintreeGraphQLResponseParser());
        BraintreeGraphQLClient braintreeGraphQLClient = new BraintreeGraphQLClient();
        AnalyticsClient analyticsClient = new AnalyticsClient(context);
        BrowserSwitchClient browserSwitchClient = new BrowserSwitchClient();
        ManifestValidator manifestValidator = new ManifestValidator();
        UUIDHelper uUIDHelper = new UUIDHelper();
        ConfigurationLoader configurationLoader = new ConfigurationLoader(context, braintreeHttpClient);
        Intrinsics.h(returnUrlScheme, "returnUrlScheme");
        this.f13702a = context;
        this.b = strQ;
        this.c = authorizationLoader;
        this.d = returnUrlScheme;
        this.e = uri;
        this.f = braintreeHttpClient;
        this.g = braintreeGraphQLClient;
        this.h = analyticsClient;
        this.i = browserSwitchClient;
        this.j = manifestValidator;
        this.k = uUIDHelper;
        this.l = configurationLoader;
        this.m = i.a.m;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "context.applicationContext");
        this.n = applicationContext;
        String packageName2 = context.getApplicationContext().getPackageName();
        Intrinsics.g(packageName2, "context.applicationContext.packageName");
        this.o = StringsKt.Q(packageName2, "_", "", false).concat(".braintree.deeplinkhandler");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BraintreeClientParams)) {
            return false;
        }
        BraintreeClientParams braintreeClientParams = (BraintreeClientParams) obj;
        return Intrinsics.c(this.f13702a, braintreeClientParams.f13702a) && Intrinsics.c(this.b, braintreeClientParams.b) && Intrinsics.c(this.c, braintreeClientParams.c) && Intrinsics.c(this.d, braintreeClientParams.d) && Intrinsics.c(this.e, braintreeClientParams.e) && Intrinsics.c(this.f, braintreeClientParams.f) && Intrinsics.c(this.g, braintreeClientParams.g) && Intrinsics.c(this.h, braintreeClientParams.h) && Intrinsics.c(this.i, braintreeClientParams.i) && Intrinsics.c(this.j, braintreeClientParams.j) && Intrinsics.c(this.k, braintreeClientParams.k) && Intrinsics.c(this.l, braintreeClientParams.l) && Intrinsics.c(this.m, braintreeClientParams.m);
    }

    public final int hashCode() {
        int iC = androidx.camera.core.impl.b.c((this.c.hashCode() + androidx.camera.core.impl.b.c(this.f13702a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        Uri uri = this.e;
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iC + (uri == null ? 0 : uri.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BraintreeClientParams(context=");
        sb.append(this.f13702a);
        sb.append(", sessionId=");
        sb.append(this.b);
        sb.append(", authorizationLoader=");
        sb.append(this.c);
        sb.append(", returnUrlScheme=");
        sb.append(this.d);
        sb.append(", appLinkReturnUri=");
        sb.append(this.e);
        sb.append(", httpClient=");
        sb.append(this.f);
        sb.append(", graphQLClient=");
        sb.append(this.g);
        sb.append(", analyticsClient=");
        sb.append(this.h);
        sb.append(", browserSwitchClient=");
        sb.append(this.i);
        sb.append(", manifestValidator=");
        sb.append(this.j);
        sb.append(", uuidHelper=");
        sb.append(this.k);
        sb.append(", configurationLoader=");
        sb.append(this.l);
        sb.append(", integrationType=");
        return androidx.camera.core.impl.b.r(sb, this.m, ')');
    }
}

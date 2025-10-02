package com.dynatrace.android.agent;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* loaded from: classes.dex */
public final class WebRequestUtils {

    public static class FormattedUrl {

        /* renamed from: a, reason: collision with root package name */
        public final String f14083a;
        public final String b;

        public FormattedUrl(String str, String str2) {
            this.f14083a = str;
            this.b = str2;
        }
    }

    public static FormattedUrl a(String str) {
        try {
            URL url = new URL(str);
            URI uri = new URI(url.getProtocol(), null, url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
            return new FormattedUrl(uri.toString(), uri.toString());
        } catch (MalformedURLException | URISyntaxException unused) {
            return new FormattedUrl(null, str);
        }
    }
}

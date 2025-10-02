package com.google.accompanist.web;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/google/accompanist/web/WebContent;", "", "Data", "NavigatorOnly", "Url", "Lcom/google/accompanist/web/WebContent$Data;", "Lcom/google/accompanist/web/WebContent$NavigatorOnly;", "Lcom/google/accompanist/web/WebContent$Url;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class WebContent {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebContent$Data;", "Lcom/google/accompanist/web/WebContent;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Data extends WebContent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Data);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Data(data=null, baseUrl=null, encoding=null, mimeType=null, historyUrl=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebContent$NavigatorOnly;", "Lcom/google/accompanist/web/WebContent;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NavigatorOnly extends WebContent {

        /* renamed from: a, reason: collision with root package name */
        public static final NavigatorOnly f14377a = new NavigatorOnly();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebContent$Url;", "Lcom/google/accompanist/web/WebContent;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Url extends WebContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f14378a;
        public final Map b;

        public Url(String str, Map map) {
            this.f14378a = str;
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return Intrinsics.c(this.f14378a, url.f14378a) && Intrinsics.c(this.b, url.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f14378a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Url(url=");
            sb.append(this.f14378a);
            sb.append(", additionalHttpHeaders=");
            return a.u(sb, this.b, ')');
        }
    }
}

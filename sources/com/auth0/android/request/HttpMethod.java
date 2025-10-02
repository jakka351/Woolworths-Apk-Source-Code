package com.auth0.android.request;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/auth0/android/request/HttpMethod;", "", "DELETE", "GET", "PATCH", "POST", "Lcom/auth0/android/request/HttpMethod$DELETE;", "Lcom/auth0/android/request/HttpMethod$GET;", "Lcom/auth0/android/request/HttpMethod$PATCH;", "Lcom/auth0/android/request/HttpMethod$POST;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class HttpMethod {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/HttpMethod$DELETE;", "Lcom/auth0/android/request/HttpMethod;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DELETE extends HttpMethod {

        /* renamed from: a, reason: collision with root package name */
        public static final DELETE f13675a = new DELETE();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/HttpMethod$GET;", "Lcom/auth0/android/request/HttpMethod;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GET extends HttpMethod {

        /* renamed from: a, reason: collision with root package name */
        public static final GET f13676a = new GET();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/HttpMethod$PATCH;", "Lcom/auth0/android/request/HttpMethod;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PATCH extends HttpMethod {

        /* renamed from: a, reason: collision with root package name */
        public static final PATCH f13677a = new PATCH();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/HttpMethod$POST;", "Lcom/auth0/android/request/HttpMethod;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class POST extends HttpMethod {

        /* renamed from: a, reason: collision with root package name */
        public static final POST f13678a = new POST();
    }

    public final String toString() {
        if (equals(GET.f13676a)) {
            return "GET";
        }
        if (equals(POST.f13678a)) {
            return "POST";
        }
        if (equals(PATCH.f13677a)) {
            return "PATCH";
        }
        if (equals(DELETE.f13675a)) {
            return "DELETE";
        }
        throw new NoWhenBranchMatchedException();
    }
}

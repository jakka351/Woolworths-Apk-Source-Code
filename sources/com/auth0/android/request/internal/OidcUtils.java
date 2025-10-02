package com.auth0.android.request.internal;

import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/auth0/android/request/internal/OidcUtils;", "", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OidcUtils {
    public static String a(String scope) {
        Intrinsics.h(scope, "scope");
        List<String> listT = StringsKt.T(scope, new String[]{" "}, 6);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listT, 10));
        for (String str : listT) {
            Locale locale = Locale.ROOT;
            arrayList.add(androidx.constraintlayout.core.state.a.m(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)"));
        }
        return !arrayList.contains(Scopes.OPEN_ID) ? StringsKt.k0(CollectionsKt.M(CollectionsKt.d0(Scopes.OPEN_ID, arrayList), " ", null, null, null, 62)).toString() : scope;
    }
}

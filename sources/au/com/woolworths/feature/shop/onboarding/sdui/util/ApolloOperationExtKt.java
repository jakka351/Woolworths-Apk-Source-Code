package au.com.woolworths.feature.shop.onboarding.sdui.util;

import android.content.Context;
import au.com.woolworths.shop.onboarding.sdui.GetOnboardingContentPageQuery;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operations;
import com.apollographql.apollo.api.json.JsonReaders;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.Okio;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"onboarding-sdui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApolloOperationExtKt {
    public static ApolloResponse a(GetOnboardingContentPageQuery getOnboardingContentPageQuery, Context context) throws IOException {
        CustomScalarAdapters customScalarAdapters = CustomScalarAdapters.g;
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        InputStream inputStreamOpen = context.getAssets().open("default_onboarding_content.json");
        Intrinsics.g(inputStreamOpen, "open(...)");
        Charset charset = Charsets.f24671a;
        byte[] bytes = TextStreamsKt.b(new BufferedReader(new InputStreamReader(inputStreamOpen, charset), 8192)).getBytes(charset);
        Intrinsics.g(bytes, "getBytes(...)");
        RealBufferedSource realBufferedSourceC = Okio.c(Okio.h(new ByteArrayInputStream(bytes)));
        try {
            ApolloResponse apolloResponseB = Operations.b(JsonReaders.a(realBufferedSourceC), getOnboardingContentPageQuery, UUID.randomUUID(), customScalarAdapters, null, 8);
            realBufferedSourceC.close();
            return apolloResponseB;
        } finally {
        }
    }
}

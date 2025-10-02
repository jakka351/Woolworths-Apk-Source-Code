package au.com.woolworths.foundation.shop.olive.voice;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceRepositoryImpl;", "Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceRepository;", "Companion", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OliveVoiceRepositoryImpl implements OliveVoiceRepository {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8804a;
    public final FeatureToggleManager b;
    public final ApolloClient c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/OliveVoiceRepositoryImpl$Companion;", "", "", "OLIVE_VOICE_ONBOARDING_SHOWN", "Ljava/lang/String;", "OLIVE_VOICE_PERMISSION_ONBOARDING_SHOWN", "OLIVE_VOICE_SEARCH_ONBOARDING_SHOWN", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public OliveVoiceRepositoryImpl(SharedPreferences sharedPreferences, FeatureToggleManager featureToggleManager, ApolloClient apolloClient) {
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(apolloClient, "apolloClient");
        this.f8804a = sharedPreferences;
        this.b = featureToggleManager;
        this.c = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl$voiceSearch$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl$voiceSearch$1 r0 = (au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl$voiceSearch$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl$voiceSearch$1 r0 = new au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl$voiceSearch$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.b(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L56
        L27:
            r7 = move-exception
            goto L72
        L29:
            r7 = move-exception
            goto L77
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.b(r8)
            com.apollographql.apollo.ApolloClient r8 = r6.c     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.foundation.shop.olive.voice.VoiceSearchQuery r2 = new au.com.woolworths.foundation.shop.olive.voice.VoiceSearchQuery     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r4 = r6.b     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.base.shopapp.BaseShopAppFeature r5 = au.com.woolworths.base.shopapp.BaseShopAppFeature.j0     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            boolean r4 = r4.c(r5)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r2.<init>(r7, r4)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r8.getClass()     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.ApolloCall r7 = new com.apollographql.apollo.ApolloCall     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r7.<init>(r8, r2)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            r0.r = r3     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            java.lang.Object r8 = r7.b(r0)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r8 != r1) goto L56
            return r1
        L56:
            com.apollographql.apollo.api.ApolloResponse r8 = (com.apollographql.apollo.api.ApolloResponse) r8     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            com.apollographql.apollo.api.Operation$Data r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.k(r8)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.foundation.shop.olive.voice.VoiceSearchQuery$Data r7 = (au.com.woolworths.foundation.shop.olive.voice.VoiceSearchQuery.Data) r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.foundation.shop.olive.voice.VoiceSearchQuery$VoiceSearch r7 = r7.f8816a     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            if (r7 == 0) goto L67
            au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchResultData r7 = au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchQueryVoiceSearchExtKt.a(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            goto L68
        L67:
            r7 = 0
        L68:
            if (r7 == 0) goto L6b
            return r7
        L6b:
            java.util.List r7 = r8.d     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.i(r7)     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
            throw r7     // Catch: au.com.woolworths.android.onesite.network.GraphQlException -> L27 com.apollographql.apollo.exception.ApolloException -> L29
        L72:
            au.com.woolworths.android.onesite.network.ServerErrorException r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.h(r7)
            throw r7
        L77:
            java.lang.Exception r7 = au.com.woolworths.android.onesite.network.ExceptionExtKt.j(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

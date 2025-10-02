package au.com.woolworths.shop.specials;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import com.apollographql.apollo.ApolloClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeRepository;", "", "Companion", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SpecialsHomeRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f12939a;
    public final FeatureToggleManager b;
    public final SupportedLinksHelper c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeRepository$Companion;", "", "", "RequestSource", "Ljava/lang/String;", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SpecialsHomeRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.f12939a = apolloClient;
        this.b = featureToggleManager;
        this.c = supportedLinksHelper;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final java.lang.Object a(java.lang.String r23, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r24, au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.specials.SpecialsHomeRepository.a(java.lang.String, au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode, au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

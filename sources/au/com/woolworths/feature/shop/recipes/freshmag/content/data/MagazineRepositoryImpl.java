package au.com.woolworths.feature.shop.recipes.freshmag.content.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/content/data/MagazineRepositoryImpl;", "Lau/com/woolworths/feature/shop/recipes/freshmag/content/data/MagazineRepository;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MagazineRepositoryImpl implements MagazineRepository {

    /* renamed from: a, reason: collision with root package name */
    public final MagazineService f8027a;

    public MagazineRepositoryImpl(MagazineService magazineService) {
        this.f8027a = magazineService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException.NoConnectivityException, au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException.ServerException, au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineRepositoryImpl$fetchMagazine$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineRepositoryImpl$fetchMagazine$1 r0 = (au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineRepositoryImpl$fetchMagazine$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineRepositoryImpl$fetchMagazine$1 r0 = new au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineRepositoryImpl$fetchMagazine$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L5d au.com.woolworths.android.onesite.network.NoConnectivityException -> L60
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineService r6 = r4.f8027a     // Catch: java.lang.Exception -> L5d au.com.woolworths.android.onesite.network.NoConnectivityException -> L60
            r0.r = r3     // Catch: java.lang.Exception -> L5d au.com.woolworths.android.onesite.network.NoConnectivityException -> L60
            r2 = 960(0x3c0, float:1.345E-42)
            java.lang.Object r6 = r6.a(r5, r2, r0)     // Catch: java.lang.Exception -> L5d au.com.woolworths.android.onesite.network.NoConnectivityException -> L60
            if (r6 != r1) goto L3f
            return r1
        L3f:
            retrofit2.Response r6 = (retrofit2.Response) r6     // Catch: java.lang.Exception -> L5d au.com.woolworths.android.onesite.network.NoConnectivityException -> L60
            okhttp3.Response r5 = r6.f27002a
            int r0 = r5.g
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            boolean r5 = r5.s
            if (r5 == 0) goto L57
            java.lang.Object r5 = r6.b
            au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineDetail r5 = (au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineDetail) r5
            if (r5 == 0) goto L54
            return r5
        L54:
            au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException$ServerException r5 = au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException.ServerException.d
            throw r5
        L57:
            au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException$ServerException r5 = au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException.ServerException.d
            throw r5
        L5a:
            au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException$NotFoundException r5 = au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException.NotFoundException.d
            throw r5
        L5d:
            au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException$ServerException r5 = au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException.ServerException.d
            throw r5
        L60:
            au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException$NoConnectivityException r5 = au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentException.NoConnectivityException.d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.freshmag.content.data.MagazineRepositoryImpl.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

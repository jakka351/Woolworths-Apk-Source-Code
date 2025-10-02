package au.com.woolworths.shop.specials;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeInteractor;", "", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SpecialsHomeInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final SpecialsHomeRepository f12938a;
    public final CollectionModeInteractor b;
    public final CatalogueStoreInteractor c;

    public SpecialsHomeInteractor(SpecialsHomeRepository specialsHomeRepository, CollectionModeInteractor collectionModeInteractor, CatalogueStoreInteractor catalogueStoreInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.f12938a = specialsHomeRepository;
        this.b = collectionModeInteractor;
        this.c = catalogueStoreInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof au.com.woolworths.shop.specials.SpecialsHomeInteractor$fetchSpecialsHome$1
            if (r0 == 0) goto L13
            r0 = r6
            au.com.woolworths.shop.specials.SpecialsHomeInteractor$fetchSpecialsHome$1 r0 = (au.com.woolworths.shop.specials.SpecialsHomeInteractor$fetchSpecialsHome$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.specials.SpecialsHomeInteractor$fetchSpecialsHome$1 r0 = new au.com.woolworths.shop.specials.SpecialsHomeInteractor$fetchSpecialsHome$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.b(r6)
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r6 = r5.b
            java.lang.String r2 = r6.a()
            au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode r6 = r6.w()
            au.com.woolworths.feature.shop.catalogue.CatalogueStoreInteractor r4 = r5.c
            au.com.woolworths.feature.shop.catalogue.CatalogueStoreRepositoryImpl r4 = r4.f6778a
            au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo r4 = r4.a()
            r0.r = r3
            au.com.woolworths.shop.specials.SpecialsHomeRepository r3 = r5.f12938a
            java.lang.Object r6 = r3.a(r2, r6, r4, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            au.com.woolworths.shop.specials.model.SpecialsHome r6 = (au.com.woolworths.shop.specials.model.SpecialsHome) r6
            java.util.ArrayList r6 = r6.f12942a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L5c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r6.next()
            boolean r2 = r1 instanceof au.com.woolworths.android.onesite.data.HorizontalListData
            if (r2 == 0) goto L77
            au.com.woolworths.android.onesite.data.HorizontalListData r1 = (au.com.woolworths.android.onesite.data.HorizontalListData) r1
            java.util.List r2 = r1.getItems()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L77
            r1 = 0
        L77:
            if (r1 == 0) goto L5c
            r0.add(r1)
            goto L5c
        L7d:
            au.com.woolworths.shop.specials.model.SpecialsHome r6 = new au.com.woolworths.shop.specials.model.SpecialsHome
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.specials.SpecialsHomeInteractor.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

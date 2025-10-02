package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageContractKt;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageData;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.tile.PromotionClickListener;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageContentFeedKt {
    public static final void a(final ContentPageData contentPageData, final boolean z, final boolean z2, final boolean z3, final LazyListState lazyListState, final List list, final Function2 function2, final Function1 onEditorialBannerClick, final Function1 function1, final Function1 function12, Function1 function13, final Function2 function22, final Function1 onDynamicSizeCardImpression, final ProductClickListener productClickListener, final Function1 function14, final Function1 function15, final Function1 eventSink, final VideoAdPlayerState videoAdPlayerState, final Function1 function16, final Function1 function17, final Function1 function18, final Modifier modifier, final boolean z4, final PromotionClickListener promotionClickListener, final Function3 function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        ContentPageData contentPageData2;
        ComposerImpl composerImpl;
        final LazyListState lazyListState2;
        final Function1 function19;
        Intrinsics.h(lazyListState, "lazyListState");
        Intrinsics.h(onEditorialBannerClick, "onEditorialBannerClick");
        Intrinsics.h(onDynamicSizeCardImpression, "onDynamicSizeCardImpression");
        Intrinsics.h(productClickListener, "productClickListener");
        Intrinsics.h(eventSink, "eventSink");
        Intrinsics.h(videoAdPlayerState, "videoAdPlayerState");
        ComposerImpl composerImplV = composer.v(-1688747808);
        if ((i & 6) == 0) {
            i4 = i | (composerImplV.I(contentPageData) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.p(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.p(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerImplV.n(lazyListState) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= composerImplV.I(list) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= composerImplV.I(function2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= composerImplV.I(onEditorialBannerClick) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= composerImplV.I(function1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerImplV.I(function12) ? 536870912 : 268435456;
        }
        int i10 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerImplV.I(function13) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerImplV.I(function22) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.I(onDynamicSizeCardImpression) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerImplV.I(productClickListener) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerImplV.I(function14) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= composerImplV.I(function15) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= composerImplV.I(eventSink) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= (i2 & 16777216) == 0 ? composerImplV.n(videoAdPlayerState) : composerImplV.I(videoAdPlayerState) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= composerImplV.I(function16) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= composerImplV.I(function17) ? 536870912 : 268435456;
        }
        int i11 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (composerImplV.I(function18) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i3 & KyberEngine.KyberPolyBytes) == 0) {
            i6 |= composerImplV.p(z4) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= composerImplV.I(promotionClickListener) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= composerImplV.I(function3) ? 16384 : 8192;
        }
        int i12 = i6;
        if ((i10 & 306783379) == 306783378 && (i11 & 306783379) == 306783378 && (i12 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            lazyListState2 = lazyListState;
            function19 = function13;
            contentPageData2 = contentPageData;
            composerImpl = composerImplV;
        } else {
            final PageCoverData pageCoverDataA = ContentPageContractKt.a(contentPageData);
            Modifier modifierA = TestTagKt.a(modifier, "contentPageFeed");
            composerImplV.o(-1224400529);
            int i13 = i10 & 57344;
            boolean zI = ((i12 & 896) == 256) | ((i11 & 3670016) == 1048576) | composerImplV.I(pageCoverDataA) | composerImplV.I(contentPageData) | ((i10 & 112) == 32) | ((i11 & 896) == 256) | ((i10 & 3670016) == 1048576) | ((i10 & 896) == 256) | composerImplV.I(list) | ((i11 & 112) == 32) | composerImplV.I(productClickListener) | (i13 == 16384) | composerImplV.I(promotionClickListener) | ((i10 & 7168) == 2048) | ((i12 & 57344) == 16384) | ((i10 & 29360128) == 8388608) | ((i10 & 234881024) == 67108864) | ((i10 & 1879048192) == 536870912) | ((i11 & 57344) == 16384) | ((i11 & 458752) == 131072) | ((i11 & 234881024) == 67108864) | ((i11 & 29360128) == 8388608 || ((i11 & 16777216) != 0 && composerImplV.I(videoAdPlayerState))) | ((i12 & 14) == 4) | ((i11 & 1879048192) == 536870912);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                i7 = i10;
                i8 = i13;
                i9 = i11;
                Function1 function110 = new Function1() { // from class: au.com.woolworths.feature.shop.contentpage.ui.a
                    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r33) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 305
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ui.a.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                contentPageData2 = contentPageData;
                composerImpl = composerImplV;
                composerImpl.A(function110);
                objG = function110;
            } else {
                contentPageData2 = contentPageData;
                i7 = i10;
                i8 = i13;
                composerImpl = composerImplV;
                i9 = i11;
            }
            composerImpl.V(false);
            LazyDslKt.b(modifierA, lazyListState, null, false, null, null, null, false, null, (Function1) objG, composerImpl, (i7 >> 9) & 112, 508);
            lazyListState2 = lazyListState;
            Boolean boolValueOf = Boolean.valueOf(lazyListState2.h.a());
            composerImpl.o(-1746271574);
            boolean zI2 = (i8 == 16384) | ((i9 & 14) == 4) | composerImpl.I(contentPageData2);
            Object objG2 = composerImpl.G();
            if (zI2 || objG2 == Composer.Companion.f1624a) {
                function19 = function13;
                objG2 = new ContentPageContentFeedKt$ContentPageContentFeed$2$1(lazyListState2, function19, contentPageData2, null);
                composerImpl.A(objG2);
            } else {
                function19 = function13;
            }
            composerImpl.V(false);
            EffectsKt.e(composerImpl, boolValueOf, (Function2) objG2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final ContentPageData contentPageData3 = contentPageData2;
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.feature.shop.contentpage.ui.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    int iA3 = RecomposeScopeImplKt.a(i3);
                    ContentPageContentFeedKt.a(contentPageData3, z, z2, z3, lazyListState2, list, function2, onEditorialBannerClick, function1, function12, function19, function22, onDynamicSizeCardImpression, productClickListener, function14, function15, eventSink, videoAdPlayerState, function16, function17, function18, modifier, z4, promotionClickListener, function3, (Composer) obj, iA, iA2, iA3);
                    return Unit.f24250a;
                }
            };
        }
    }
}

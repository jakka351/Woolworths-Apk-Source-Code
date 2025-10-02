package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.RadioRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.bundles.BundlesUiEvent;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleSortOption;
import au.com.woolworths.feature.shop.bundles.data.BundleSortOptions;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.CoreRadioRowUI;
import au.com.woolworths.product.models.ProductCard;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m(int i, Object obj, Function1 function1) {
        this.d = i;
        this.f = obj;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.d) {
            case 0:
                final BundleSortOptions bundleSortOptions = (BundleSortOptions) this.f;
                LazyListScope LazyColumn = (LazyListScope) it;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesSortBottomSheetKt$BundlesSortBottomSheet$2$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        LazyItemScope item = (LazyItemScope) obj;
                        Composer composer = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Intrinsics.h(item, "$this$item");
                        if ((iIntValue & 17) == 16 && composer.c()) {
                            composer.j();
                        } else {
                            float f = 12;
                            TextKt.a(bundleSortOptions.f6761a, CoreTheme.f(composer).e.b.b, PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), 16, f, BitmapDescriptorFactory.HUE_RED, f, 4), CoreTheme.b(composer).e.d.d, null, 0, 0, false, 0, null, composer, KyberEngine.KyberPolyBytes, 1008);
                            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composer).e.b.e, composer, null);
                        }
                        return Unit.f24250a;
                    }
                }, true, 1116745236), 3);
                for (final BundleSortOption bundleSortOption : bundleSortOptions.b) {
                    final Function1 function1 = this.e;
                    LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.bundles.ui.BundlesSortBottomSheetKt$BundlesSortBottomSheet$2$1$1$2$1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            LazyItemScope item = (LazyItemScope) obj;
                            Composer composer = (Composer) obj2;
                            int iIntValue = ((Number) obj3).intValue();
                            Intrinsics.h(item, "$this$item");
                            if ((iIntValue & 17) == 16 && composer.c()) {
                                composer.j();
                            } else {
                                BundleSortOption bundleSortOption2 = bundleSortOption;
                                CoreRadioRowUI coreRadioRowUI = bundleSortOption2.b;
                                String str = coreRadioRowUI.b;
                                boolean z = coreRadioRowUI.c;
                                String str2 = coreRadioRowUI.f6768a;
                                composer.o(-1633490746);
                                Function1 function12 = function1;
                                boolean zN = composer.n(function12) | composer.n(bundleSortOption2);
                                Object objG = composer.G();
                                if (zN || objG == Composer.Companion.f1624a) {
                                    objG = new d(3, bundleSortOption2, function12);
                                    composer.A(objG);
                                }
                                composer.l();
                                RadioRowKt.a(str, z, (Function0) objG, null, str2, null, null, null, null, composer, 0, 488);
                            }
                            return Unit.f24250a;
                        }
                    }, true, -1477851450), 3);
                }
                break;
            case 1:
                Bundle bundle = (Bundle) this.f;
                ProductCard productCard = (ProductCard) it;
                Intrinsics.h(productCard, "productCard");
                this.e.invoke(new BundlesUiEvent.ProductClick(productCard, bundle));
                break;
            default:
                BundlesData bundlesData = (BundlesData) this.f;
                Intrinsics.h(it, "it");
                if (it instanceof Bundle) {
                    if ((bundlesData instanceof BundlesData.BundlesLandingPage ? (BundlesData.BundlesLandingPage) bundlesData : null) != null) {
                        this.e.invoke(new BundlesUiEvent.TrackBundleImpression((Bundle) it, (BundlesData.BundlesLandingPage) bundlesData));
                    }
                }
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ m(Function1 function1, Bundle bundle) {
        this.d = 1;
        this.e = function1;
        this.f = bundle;
    }
}

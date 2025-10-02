package au.com.woolworths.shop.cart.ui.productreview;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntOffset;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.design.wx.foundation.TextColors;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.feature.shared.instore.wifi.ui.r;
import au.com.woolworths.sdui.legacy.banner.InsetBannerUiKt;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeType;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import au.com.woolworths.shop.cart.domain.model.ProductReviewFeed;
import au.com.woolworths.shop.cart.domain.model.ProductReviewGroupType;
import au.com.woolworths.shop.cart.domain.model.ProductReviewResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductsReviewCallbacks e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(Object obj, ProductsReviewCallbacks productsReviewCallbacks, int i) {
        this.d = i;
        this.f = obj;
        this.e = productsReviewCallbacks;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        int i2 = 0;
        final ProductsReviewCallbacks productsReviewCallbacks = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                final ProductReviewResult.Response response = (ProductReviewResult.Response) obj2;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Timber.Forest forest = ProductReviewScreenKt.f10526a;
                Intrinsics.h(LazyColumn, "$this$LazyColumn");
                LazyListScope.e(LazyColumn, null, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReview$1$1$1
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        LazyItemScope stickyHeader = (LazyItemScope) obj3;
                        ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int iIntValue = ((Number) obj6).intValue();
                        Intrinsics.h(stickyHeader, "$this$stickyHeader");
                        if ((iIntValue & 129) == 128 && composer.c()) {
                            composer.j();
                        } else {
                            float f = 16;
                            TextKt.b(response.f10449a, PaddingKt.i(BackgroundKt.b(Modifier.Companion.d, Color.f, RectangleShapeKt.f1779a), f, 24, f, f), TextColors.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.c(composer).j, composer, 48, 0, 65528);
                        }
                        return Unit.f24250a;
                    }
                }, true, -145556786), 3);
                for (Object obj3 : response.b) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    ProductReviewFeed productReviewFeed = (ProductReviewFeed) obj3;
                    if (!(productReviewFeed instanceof ProductReviewFeed.ProductReviewGroup)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final ProductReviewFeed.ProductReviewGroup productReviewGroup = (ProductReviewFeed.ProductReviewGroup) productReviewFeed;
                    productsReviewCallbacks.V4(productReviewGroup);
                    LazyListScope.i(LazyColumn, "banner_" + i2, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReview$1$1$2$1

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        public /* synthetic */ class WhenMappings {
                            static {
                                int[] iArr = new int[ProductReviewGroupType.values().length];
                                try {
                                    iArr[1] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    ProductReviewGroupType productReviewGroupType = ProductReviewGroupType.d;
                                    iArr[0] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    ProductReviewGroupType productReviewGroupType2 = ProductReviewGroupType.d;
                                    iArr[2] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            LazyItemScope item = (LazyItemScope) obj4;
                            Composer composer = (Composer) obj5;
                            int iIntValue = ((Number) obj6).intValue();
                            Intrinsics.h(item, "$this$item");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= composer.n(item) ? 4 : 2;
                            }
                            if ((iIntValue & 19) == 18 && composer.c()) {
                                composer.j();
                            } else {
                                float f = 16;
                                Modifier modifierA = BorderModifierKt.a(PaddingKt.j(item.a(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5)), f, 8, f, BitmapDescriptorFactory.HUE_RED, 8), ToneColors.j, 4, 58);
                                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                int p = composer.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                                Modifier modifierD = ComposedModifierKt.d(composer, modifierA);
                                ComposeUiNode.e3.getClass();
                                Function0 function0 = ComposeUiNode.Companion.b;
                                if (composer.w() == null) {
                                    ComposablesKt.b();
                                    throw null;
                                }
                                composer.i();
                                if (composer.getO()) {
                                    composer.K(function0);
                                } else {
                                    composer.e();
                                }
                                Updater.b(composer, measurePolicyD, ComposeUiNode.Companion.g);
                                Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                Function2 function2 = ComposeUiNode.Companion.j;
                                if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                                    androidx.camera.core.impl.b.z(p, composer, p, function2);
                                }
                                Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
                                ProductReviewFeed.ProductReviewGroup productReviewGroup2 = productReviewGroup;
                                InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(productReviewGroup2.f10446a);
                                composer.o(-1633490746);
                                boolean zN = composer.n(productReviewGroup2);
                                ProductsReviewCallbacks productsReviewCallbacks2 = productsReviewCallbacks;
                                boolean zI = zN | composer.I(productsReviewCallbacks2);
                                Object objG = composer.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new d(productReviewGroup2, productsReviewCallbacks2, 1);
                                    composer.A(objG);
                                }
                                composer.l();
                                InsetBannerUiKt.b(uiModel, null, false, (Function1) objG, composer, 0, 14);
                                composer.f();
                            }
                            return Unit.f24250a;
                        }
                    }, true, 1431739890), 2);
                    final List list = productReviewGroup.c;
                    final r rVar = new r(i2);
                    LazyColumn.b(list.size(), new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReview$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int iIntValue = ((Number) obj4).intValue();
                            return rVar.invoke(Integer.valueOf(iIntValue), list.get(iIntValue));
                        }
                    }, new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReview$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            list.get(((Number) obj4).intValue());
                            return null;
                        }
                    }, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReview$lambda$9$lambda$8$lambda$7$$inlined$itemsIndexed$default$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i4;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                            int iIntValue = ((Number) obj5).intValue();
                            Composer composer = (Composer) obj6;
                            int iIntValue2 = ((Number) obj7).intValue();
                            if ((iIntValue2 & 6) == 0) {
                                i4 = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                            } else {
                                i4 = iIntValue2;
                            }
                            if ((iIntValue2 & 48) == 0) {
                                i4 |= composer.r(iIntValue) ? 32 : 16;
                            }
                            if (composer.z(i4 & 1, (i4 & 147) != 146)) {
                                final ProductReviewCard productReviewCard = (ProductReviewCard) list.get(iIntValue);
                                composer.o(-1812888832);
                                boolean z = CollectionsKt.I(productReviewGroup.c) == iIntValue;
                                float f = 16;
                                Modifier modifierA = BorderModifierKt.a(PaddingKt.j(lazyItemScope.a(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5)), f, BitmapDescriptorFactory.HUE_RED, f, z ? 8 : 0, 2), ToneColors.j, z ? 4 : 0, 106);
                                composer.o(-1633490746);
                                final ProductsReviewCallbacks productsReviewCallbacks2 = productsReviewCallbacks;
                                boolean zI = composer.I(productsReviewCallbacks2) | composer.I(productReviewCard);
                                Object objG = composer.G();
                                Object obj8 = Composer.Companion.f1624a;
                                if (zI || objG == obj8) {
                                    objG = new Function0<Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReview$1$1$2$3$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            productsReviewCallbacks2.U2(productReviewCard);
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer.l();
                                composer.o(-1633490746);
                                boolean zI2 = composer.I(productsReviewCallbacks2) | composer.I(productReviewCard);
                                Object objG2 = composer.G();
                                if (zI2 || objG2 == obj8) {
                                    objG2 = new Function1<Double, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReview$1$1$2$3$2$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj9) {
                                            productsReviewCallbacks2.j5(productReviewCard, ((Number) obj9).doubleValue());
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer.A(objG2);
                                }
                                Function1 function1 = (Function1) objG2;
                                composer.l();
                                composer.o(-1633490746);
                                boolean zI3 = composer.I(productsReviewCallbacks2) | composer.I(productReviewCard);
                                Object objG3 = composer.G();
                                if (zI3 || objG3 == obj8) {
                                    objG3 = new Function1<ProductReviewCard, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReview$1$1$2$3$3$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj9) {
                                            ProductReviewCard it = (ProductReviewCard) obj9;
                                            Intrinsics.h(it, "it");
                                            productsReviewCallbacks2.Z3(productReviewCard);
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer.A(objG3);
                                }
                                Function1 function12 = (Function1) objG3;
                                composer.l();
                                composer.o(-1633490746);
                                boolean zI4 = composer.I(productsReviewCallbacks2) | composer.I(productReviewCard);
                                Object objG4 = composer.G();
                                if (zI4 || objG4 == obj8) {
                                    objG4 = new Function1<ProductReviewAlternativeType, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewScreenKt$ProductReview$1$1$2$3$4$1

                                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                        public /* synthetic */ class WhenMappings {
                                            static {
                                                int[] iArr = new int[ProductReviewAlternativeType.values().length];
                                                try {
                                                    iArr[0] = 1;
                                                } catch (NoSuchFieldError unused) {
                                                }
                                                try {
                                                    ProductReviewAlternativeType productReviewAlternativeType = ProductReviewAlternativeType.d;
                                                    iArr[1] = 2;
                                                } catch (NoSuchFieldError unused2) {
                                                }
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj9) {
                                            ProductReviewAlternativeType it = (ProductReviewAlternativeType) obj9;
                                            Intrinsics.h(it, "it");
                                            int iOrdinal = it.ordinal();
                                            ProductReviewCard productReviewCard2 = productReviewCard;
                                            ProductsReviewCallbacks productsReviewCallbacks3 = productsReviewCallbacks2;
                                            if (iOrdinal == 0) {
                                                productsReviewCallbacks3.f0(productReviewCard2.b);
                                            } else {
                                                if (iOrdinal != 1) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                productsReviewCallbacks3.q(ProductReviewCardExtKt.a(productReviewCard2));
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer.A(objG4);
                                }
                                composer.l();
                                RestrictedProductItemKt.a(productReviewCard, function0, function1, function12, (Function1) objG4, modifierA, composer, 0, 0);
                                composer.l();
                            } else {
                                composer.j();
                            }
                            return Unit.f24250a;
                        }
                    }, true, -1091073711));
                    i2 = i3;
                }
                return unit;
            default:
                ProductReviewFeed.ProductReviewGroup productReviewGroup2 = (ProductReviewFeed.ProductReviewGroup) obj2;
                InsetBanner it = (InsetBanner) obj;
                Intrinsics.h(it, "it");
                ProductReviewGroupType productReviewGroupType = productReviewGroup2.b;
                InsetBannerApiData insetBannerApiData = productReviewGroup2.f10446a;
                int iOrdinal = productReviewGroupType.ordinal();
                if (iOrdinal == 0) {
                    ProductReviewScreenKt.f10526a.e("Unexpected banner action: " + insetBannerApiData, new Object[0]);
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProductReviewScreenKt.f10526a.e("Unexpected banner action: " + insetBannerApiData, new Object[0]);
                } else {
                    productsReviewCallbacks.r1(productReviewGroup2.c, insetBannerApiData.getAnalytics());
                }
                return unit;
        }
    }
}

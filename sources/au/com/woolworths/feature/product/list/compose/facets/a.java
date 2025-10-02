package au.com.woolworths.feature.product.list.compose.facets;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ChipDefaults;
import androidx.compose.material.SelectableChipColors;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.base.shopapp.modules.text.TextWithAltApiData;
import au.com.woolworths.design.core.ui.component.experimental.chip.ToggleChipKt;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipSelectionType;
import au.com.woolworths.design.core.ui.component.experimental.chip.spec.ChipVariant;
import au.com.woolworths.design.wx.component.FilterChipKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.data.ProductListChip;
import au.com.woolworths.shop.buyagain.domain.BuyAgainChip;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function1 g;

    public /* synthetic */ a(List list, boolean z, Function1 function1, int i) {
        this.d = i;
        this.e = list;
        this.f = z;
        this.g = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LazyListScope LazyRow = (LazyListScope) obj;
        switch (this.d) {
            case 0:
                Intrinsics.h(LazyRow, "$this$LazyRow");
                final List list = this.e;
                int size = list.size();
                Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.product.list.compose.facets.FacetsChipGroupKt$FacetsChipGroup$lambda$3$lambda$2$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final boolean z = this.f;
                final Function1 function12 = this.g;
                LazyRow.b(size, null, function1, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.facets.FacetsChipGroupKt$FacetsChipGroup$lambda$3$lambda$2$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        long jC;
                        Object obj6 = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(obj6) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            final ProductListChip productListChip = (ProductListChip) list.get(iIntValue);
                            composer.o(-1916589741);
                            boolean z2 = z;
                            if (!z2) {
                                composer.o(-1916596159);
                                jC = Color.b(WxTheme.a(composer).c(), 0.5f);
                                composer.l();
                            } else if (productListChip.isSelected()) {
                                composer.o(-1916492495);
                                jC = WxTheme.a(composer).a();
                                composer.l();
                            } else {
                                composer.o(-1916425132);
                                jC = WxTheme.a(composer).c();
                                composer.l();
                            }
                            long j = jC;
                            boolean zIsSelected = productListChip.isSelected();
                            long jB = Color.b(ToneColors.i, z2 ? 1.0f : 0.38f);
                            float f = ChipDefaults.f1251a;
                            SelectableChipColors selectableChipColorsB = ChipDefaults.b(WxTheme.a(composer).b(), WxTheme.a(composer).c(), WxTheme.a(composer).b(), Color.b(WxTheme.a(composer).c(), 0.5f), WxTheme.a(composer).h(), WxTheme.a(composer).a(), composer, 292);
                            composer.o(-1633490746);
                            final Function1 function13 = function12;
                            boolean zN = composer.n(function13) | composer.n(productListChip);
                            Object objG = composer.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.compose.facets.FacetsChipGroupKt$FacetsChipGroup$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function13.invoke(productListChip);
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG);
                            }
                            composer.l();
                            FilterChipKt.a(z, zIsSelected, (Function0) objG, Modifier.Companion.d, null, jB, j, selectableChipColorsB, null, null, ComposableLambdaKt.c(322414386, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.facets.FacetsChipGroupKt$FacetsChipGroup$1$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                    RowScope FilterChip = (RowScope) obj7;
                                    Composer composer2 = (Composer) obj8;
                                    int iIntValue3 = ((Number) obj9).intValue();
                                    Intrinsics.h(FilterChip, "$this$FilterChip");
                                    if ((iIntValue3 & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        composer2.o(5004770);
                                        final ProductListChip productListChip2 = productListChip;
                                        boolean zN2 = composer2.n(productListChip2);
                                        Object objG2 = composer2.G();
                                        if (zN2 || objG2 == Composer.Companion.f1624a) {
                                            objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: au.com.woolworths.feature.product.list.compose.facets.FacetsChipGroupKt$FacetsChipGroup$1$1$1$2$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj10) {
                                                    SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj10;
                                                    Intrinsics.h(semantics, "$this$semantics");
                                                    SemanticsPropertiesKt.k(semantics, productListChip2.getText().getAltText());
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(objG2);
                                        }
                                        composer2.l();
                                        TextKt.b(productListChip2.getText().getText(), SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).n, composer2, 0, 0, 65532);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer), composer, 3072, 48, 1808);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -632812321));
                break;
            case 1:
                Intrinsics.h(LazyRow, "$this$LazyRow");
                final List list2 = this.e;
                int size2 = list2.size();
                Function1<Integer, Object> function13 = new Function1<Integer, Object>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.facets.FacetsChipGroupKt$FacetsChipGroup$lambda$3$lambda$2$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list2.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final boolean z2 = this.f;
                final Function1 function14 = this.g;
                LazyRow.b(size2, null, function13, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.facets.FacetsChipGroupKt$FacetsChipGroup$lambda$3$lambda$2$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        long jC;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            final au.com.woolworths.feature.product.list.legacy.data.ProductListChip productListChip = (au.com.woolworths.feature.product.list.legacy.data.ProductListChip) list2.get(iIntValue);
                            composer.o(-313178624);
                            boolean z3 = z2;
                            if (!z3) {
                                composer.o(-313185042);
                                jC = Color.b(WxTheme.a(composer).c(), 0.5f);
                                composer.l();
                            } else if (productListChip.b) {
                                composer.o(-313081378);
                                jC = WxTheme.a(composer).a();
                                composer.l();
                            } else {
                                composer.o(-313014015);
                                jC = WxTheme.a(composer).c();
                                composer.l();
                            }
                            long j = jC;
                            boolean z4 = productListChip.b;
                            long jB = Color.b(ToneColors.i, z3 ? 1.0f : 0.38f);
                            float f = ChipDefaults.f1251a;
                            SelectableChipColors selectableChipColorsB = ChipDefaults.b(WxTheme.a(composer).b(), WxTheme.a(composer).c(), WxTheme.a(composer).b(), Color.b(WxTheme.a(composer).c(), 0.5f), WxTheme.a(composer).h(), WxTheme.a(composer).a(), composer, 292);
                            composer.o(-1633490746);
                            final Function1 function15 = function14;
                            boolean zN = composer.n(function15) | composer.n(productListChip);
                            Object objG = composer.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                objG = new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.facets.FacetsChipGroupKt$FacetsChipGroup$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function15.invoke(productListChip);
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG);
                            }
                            composer.l();
                            FilterChipKt.a(z2, z4, (Function0) objG, Modifier.Companion.d, null, jB, j, selectableChipColorsB, null, null, ComposableLambdaKt.c(-1799231673, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.facets.FacetsChipGroupKt$FacetsChipGroup$1$1$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                    RowScope FilterChip = (RowScope) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    int iIntValue3 = ((Number) obj8).intValue();
                                    Intrinsics.h(FilterChip, "$this$FilterChip");
                                    if ((iIntValue3 & 17) == 16 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        composer2.o(5004770);
                                        final au.com.woolworths.feature.product.list.legacy.data.ProductListChip productListChip2 = productListChip;
                                        boolean zN2 = composer2.n(productListChip2);
                                        Object objG2 = composer2.G();
                                        if (zN2 || objG2 == Composer.Companion.f1624a) {
                                            objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.compose.facets.FacetsChipGroupKt$FacetsChipGroup$1$1$1$2$1$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj9) {
                                                    SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj9;
                                                    Intrinsics.h(semantics, "$this$semantics");
                                                    SemanticsPropertiesKt.k(semantics, productListChip2.c.b);
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(objG2);
                                        }
                                        composer2.l();
                                        TextKt.b(productListChip2.c.f5353a, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).n, composer2, 0, 0, 65532);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer), composer, 3072, 48, 1808);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -632812321));
                break;
            default:
                Intrinsics.h(LazyRow, "$this$LazyRow");
                final List list3 = this.e;
                int size3 = list3.size();
                Function1<Integer, Object> function15 = new Function1<Integer, Object>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.FilterChipsKt$FilterChips$lambda$4$lambda$3$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list3.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final boolean z3 = this.f;
                final Function1 function16 = this.g;
                LazyRow.b(size3, null, function15, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.FilterChipsKt$FilterChips$lambda$4$lambda$3$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.r(iIntValue) ? 32 : 16;
                        }
                        if (composer.z(i & 1, (i & 147) != 146)) {
                            final BuyAgainChip buyAgainChip = (BuyAgainChip) list3.get(iIntValue);
                            composer.o(2074251828);
                            boolean z4 = z3;
                            final boolean z5 = !z4;
                            boolean z6 = buyAgainChip.c;
                            TextWithAltApiData textWithAltApiData = buyAgainChip.b;
                            String text = textWithAltApiData.getText();
                            ChipSelectionType chipSelectionType = ChipSelectionType.e;
                            ChipVariant chipVariant = ChipVariant.d;
                            composer.o(-1746271574);
                            boolean zP = composer.p(z5);
                            final Function1 function17 = function16;
                            boolean zN = zP | composer.n(function17) | composer.I(buyAgainChip);
                            Object objG = composer.G();
                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                            if (zN || objG == composer$Companion$Empty$1) {
                                objG = new Function0<Unit>() { // from class: au.com.woolworths.shop.buyagain.ui.composable.FilterChipsKt$FilterChips$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        if (z5) {
                                            function17.invoke(buyAgainChip);
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG);
                            }
                            Function0 function0 = (Function0) objG;
                            composer.l();
                            composer.o(1849434622);
                            Object objG2 = composer.G();
                            if (objG2 == composer$Companion$Empty$1) {
                                objG2 = FilterChipsKt$FilterChips$1$1$1$2$1.d;
                                composer.A(objG2);
                            }
                            composer.l();
                            ToggleChipKt.a(z6, text, null, chipSelectionType, chipVariant, function0, AlphaKt.a(SemanticsModifierKt.b(Modifier.Companion.d, true, (Function1) objG2), !z4 ? 1.0f : 0.5f), YU.a.h("See ", textWithAltApiData.getText(), " only"), null, null, composer, 224640, 0, 1536);
                            composer.l();
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, -632812321));
                break;
        }
        return Unit.f24250a;
    }
}

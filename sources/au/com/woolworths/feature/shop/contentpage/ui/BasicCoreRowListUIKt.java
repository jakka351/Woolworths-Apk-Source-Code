package au.com.woolworths.feature.shop.contentpage.ui;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.ImageUtilKt;
import au.com.woolworths.sdui.legacy.title.CoreRowListTitleUIKt;
import au.com.woolworths.shop.aem.components.model.basicCoreRow.BasicCoreRowListData;
import au.com.woolworths.shop.aem.components.model.basicCoreRow.BasicCoreRowListItem;
import au.com.woolworths.shop.aem.components.model.basicCoreRow.CoreRowData;
import com.woolworths.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasicCoreRowListUIKt {
    public static final void a(final BasicCoreRowListData feedItem, final Modifier modifier, final Function1 onClick, Composer composer, int i) {
        Intrinsics.h(feedItem, "feedItem");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(330020300);
        int i2 = (composerImplV.I(feedItem) ? 4 : 2) | i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1585966040, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.contentpage.ui.BasicCoreRowListUIKt$BasicCoreRowListUI$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        BasicCoreRowListData basicCoreRowListData = feedItem;
                        String sectionTitle = basicCoreRowListData.getSectionTitle();
                        composer2.o(600026753);
                        if (sectionTitle != null) {
                            CoreRowListTitleUIKt.a(0, composer2, null, sectionTitle);
                        }
                        composer2.l();
                        List<BasicCoreRowListItem> coreRowListItems = basicCoreRowListData.getCoreRowListItems();
                        composer2.o(600030611);
                        if (coreRowListItems != null) {
                            for (BasicCoreRowListItem basicCoreRowListItem : coreRowListItems) {
                                CoreRowData coreRowData = basicCoreRowListItem.getCoreRowData();
                                composer2.o(600032089);
                                if (coreRowData != null) {
                                    IconAsset leadingAsset = coreRowData.getLeadingAsset();
                                    composer2.o(2117244656);
                                    CoreRowSpec.Image imageA = leadingAsset == null ? null : ImageUtilKt.a(leadingAsset, CoreRowSpec.ImageSize.b, PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable_circle, 0, composer2), composer2, 4);
                                    composer2.l();
                                    String label = coreRowData.getLabel();
                                    String description = coreRowData.getDescription();
                                    composer2.o(-1746271574);
                                    boolean zI = composer2.I(basicCoreRowListItem) | composer2.I(basicCoreRowListData);
                                    Object obj3 = onClick;
                                    boolean zN = zI | composer2.n(obj3);
                                    Object objG = composer2.G();
                                    if (zN || objG == Composer.Companion.f1624a) {
                                        objG = new androidx.work.impl.utils.c(6, basicCoreRowListItem, basicCoreRowListData, obj3);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    SimpleRowKt.a(label, (Function0) objG, null, description, null, imageA, null, null, null, composer2, 0, 468);
                                }
                                composer2.l();
                            }
                        }
                        composer2.l();
                        SpacerKt.a(composer2, modifier);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(feedItem, modifier, onClick, i, 10);
        }
    }
}

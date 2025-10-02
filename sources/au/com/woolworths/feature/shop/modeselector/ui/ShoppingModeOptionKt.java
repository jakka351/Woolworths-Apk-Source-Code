package au.com.woolworths.feature.shop.modeselector.ui;

import au.com.woolworths.base.shopapp.modules.badge.BadgeTypeApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonStyleApiData;
import au.com.woolworths.feature.shop.modeselector.model.BadgeData;
import au.com.woolworths.feature.shop.modeselector.model.Fulfilment;
import au.com.woolworths.feature.shop.modeselector.model.Item;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSelectorOptionStateApiData;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeVariant;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"mode-selector_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShoppingModeOptionKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ShoppingModeSection.ShoppingModeSelectorOptionsSection f7549a;

    static {
        ShoppingModeVariant shoppingModeVariant = ShoppingModeVariant.e;
        ShoppingModeSelectorOptionStateApiData shoppingModeSelectorOptionStateApiData = ShoppingModeSelectorOptionStateApiData.f;
        BadgeTypeApiData badgeTypeApiData = BadgeTypeApiData.TEMPORARY;
        f7549a = new ShoppingModeSection.ShoppingModeSelectorOptionsSection("this is title", "test note", "test disclaimer", CollectionsKt.R(new Item(shoppingModeVariant, shoppingModeSelectorOptionStateApiData, "Schedule for later", "Delivery at a time that suits you", "Up to $15", CollectionsKt.R(new Fulfilment.DividerCard(Boolean.TRUE), new Fulfilment.ButtonData("SELECT A TIME", ButtonActionApiData.LINK, ButtonStyleApiData.TERTIARY, true, "com.woolworths.shop://selectDeliveryAddress", null, null, null)), new BadgeData(AnnotatedPrivateKey.LABEL, badgeTypeApiData), CollectionsKt.R(new BadgeData(AnnotatedPrivateKey.LABEL, badgeTypeApiData), new BadgeData(AnnotatedPrivateKey.LABEL, badgeTypeApiData), new BadgeData(AnnotatedPrivateKey.LABEL, badgeTypeApiData))), new Item(ShoppingModeVariant.g, ShoppingModeSelectorOptionStateApiData.d, "Schedule for later", "Delivery at a time that suits you", "Up to $15", null, new BadgeData(AnnotatedPrivateKey.LABEL, badgeTypeApiData), CollectionsKt.R(new BadgeData(AnnotatedPrivateKey.LABEL, badgeTypeApiData), new BadgeData(AnnotatedPrivateKey.LABEL, badgeTypeApiData), new BadgeData(AnnotatedPrivateKey.LABEL, badgeTypeApiData)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0339 A[EDGE_INSN: B:122:0x0339->B:117:0x0339 BREAK  A[LOOP:0: B:70:0x01ea->B:116:0x0310], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection.ShoppingModeSelectorOptionsSection r47, final kotlin.jvm.functions.Function1 r48, final kotlin.jvm.functions.Function2 r49, androidx.compose.ui.Modifier r50, androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.modeselector.ui.ShoppingModeOptionKt.a(au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection$ShoppingModeSelectorOptionsSection, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}

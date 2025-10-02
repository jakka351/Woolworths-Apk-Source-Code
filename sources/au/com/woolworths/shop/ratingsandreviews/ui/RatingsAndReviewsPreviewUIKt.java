package au.com.woolworths.shop.ratingsandreviews.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.shop.lists.ui.substitutions.c;
import au.com.woolworths.shop.ratingsandreviews.data.ButtonAction;
import au.com.woolworths.shop.ratingsandreviews.data.LinkButton;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewCta;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewData;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewHeader;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewSections;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetails;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsReviewDetails;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionSection;
import au.com.woolworths.shop.ratingsandreviews.data.ReviewItem;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewCardData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ratingsandreviews-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RatingsAndReviewsPreviewUIKt {
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionSection r27, kotlin.jvm.functions.Function2 r28, kotlin.jvm.functions.Function2 r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.ratingsandreviews.ui.RatingsAndReviewsPreviewUIKt.a(au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionSection, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(RatingsAndReviewsPreviewData item, final Function2 onWriteReviewClick, Function2 onSeeAllRatingsAndReviewsClick, final Function2 onShowAllReviewsClick, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Iterator it;
        Modifier.Companion companion;
        BiasAlignment.Horizontal horizontal;
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        ComposerImpl composerImpl;
        Intrinsics.h(item, "item");
        Intrinsics.h(onWriteReviewClick, "onWriteReviewClick");
        Intrinsics.h(onSeeAllRatingsAndReviewsClick, "onSeeAllRatingsAndReviewsClick");
        Intrinsics.h(onShowAllReviewsClick, "onShowAllReviewsClick");
        ComposerImpl composerImplV = composer.v(1307017484);
        int i2 = (composerImplV.I(item) ? 4 : 2) | i;
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onWriteReviewClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onSeeAllRatingsAndReviewsClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onShowAllReviewsClick) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
            composerImpl = composerImplV;
        } else {
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierA = TestTagKt.a(companion2, "Ratings & Review Preview");
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal2, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-405667841);
            Iterator it2 = item.d.iterator();
            ComposerImpl composerImpl2 = composerImplV;
            while (it2.hasNext()) {
                RatingsAndReviewsPreviewSections ratingsAndReviewsPreviewSections = (RatingsAndReviewsPreviewSections) it2.next();
                if (ratingsAndReviewsPreviewSections instanceof RatingsAndReviewsPreviewHeader) {
                    composerImpl2.o(-1428705961);
                    float f = i3;
                    RatingsAndReviewsPreviewHeader ratingsAndReviewsPreviewHeader = (RatingsAndReviewsPreviewHeader) ratingsAndReviewsPreviewSections;
                    ComposerImpl composerImpl3 = composerImpl2;
                    horizontal = horizontal2;
                    companion = companion2;
                    it = it2;
                    RatingsAndReviewsPreviewHeadingKt.a(ratingsAndReviewsPreviewHeader.d, ratingsAndReviewsPreviewHeader.e, PaddingKt.g(companion2, f, 20), composerImpl3, KyberEngine.KyberPolyBytes, 0);
                    composerImpl2 = composerImpl3;
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.b(composerImpl2).e.b.e, composerImpl2, PaddingKt.h(SizeKt.e(companion, 1.0f), f, BitmapDescriptorFactory.HUE_RED, 2));
                    composerImpl2.V(false);
                } else {
                    it = it2;
                    companion = companion2;
                    horizontal = horizontal2;
                    int i6 = i3;
                    if (ratingsAndReviewsPreviewSections instanceof RatingsAndReviewsRatingsDetails) {
                        composerImpl2.o(-1427961806);
                        float f2 = 20;
                        Modifier modifierJ = PaddingKt.j(PaddingKt.h(companion, i6, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(Arrangement.g(4), horizontal, composerImpl2, 6);
                        int i7 = composerImpl2.P;
                        PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImpl2.Q();
                        Modifier modifierD2 = ComposedModifierKt.d(composerImpl2, modifierJ);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        composerImpl2.i();
                        if (composerImpl2.O) {
                            composerImpl2.K(function02);
                        } else {
                            composerImpl2.e();
                        }
                        Updater.b(composerImpl2, columnMeasurePolicyA2, ComposeUiNode.Companion.g);
                        Updater.b(composerImpl2, persistentCompositionLocalMapQ2, ComposeUiNode.Companion.f);
                        Function2 function22 = ComposeUiNode.Companion.j;
                        if (composerImpl2.O || !Intrinsics.c(composerImpl2.G(), Integer.valueOf(i7))) {
                            b.B(i7, composerImpl2, i7, function22);
                        }
                        Updater.b(composerImpl2, modifierD2, ComposeUiNode.Companion.d);
                        composerImpl2.o(-927897403);
                        Iterator it3 = ((RatingsAndReviewsRatingsDetails) ratingsAndReviewsPreviewSections).d.iterator();
                        while (it3.hasNext()) {
                            a((RatingsDistributionSection) it3.next(), onSeeAllRatingsAndReviewsClick, onWriteReviewClick, composerImpl2, ((i4 >> 3) & 112) | ((i4 << 3) & 896));
                        }
                        composerImpl2.V(false);
                        DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.b(composerImpl2).e.b.e, composerImpl2, PaddingKt.j(SizeKt.e(companion, 1.0f), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13));
                        composerImpl2.V(true);
                        z = false;
                        composerImpl2.V(false);
                    } else {
                        z = false;
                        if (ratingsAndReviewsPreviewSections instanceof RatingsAndReviewsReviewDetails) {
                            composerImpl2.o(-1427054839);
                            c((RatingsAndReviewsReviewDetails) ratingsAndReviewsPreviewSections, composerImpl2, 0);
                            composerImpl2.V(false);
                        } else {
                            if (!(ratingsAndReviewsPreviewSections instanceof RatingsAndReviewsPreviewCta)) {
                                throw au.com.woolworths.android.onesite.a.w(92460153, composerImpl2, false);
                            }
                            composerImpl2.o(-1426906876);
                            final RatingsAndReviewsPreviewCta ratingsAndReviewsPreviewCta = (RatingsAndReviewsPreviewCta) ratingsAndReviewsPreviewSections;
                            LinkButton linkButton = ratingsAndReviewsPreviewCta.d;
                            final ButtonAction buttonAction = linkButton.g;
                            if (buttonAction == null) {
                                z3 = false;
                            } else {
                                Modifier modifierA2 = TestTagKt.a(PaddingKt.g(SizeKt.e(companion, 1.0f), i6, 8), "Show x reviews");
                                String str = linkButton.e;
                                String str2 = buttonAction.f;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                composerImpl2.o(-1746271574);
                                String str3 = str2;
                                boolean zI = ((i4 & 112) == 32) | composerImpl2.I(buttonAction) | composerImpl2.I(ratingsAndReviewsPreviewSections);
                                Object objG = composerImpl2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    z2 = false;
                                    final boolean z4 = false ? 1 : 0;
                                    Function0 function03 = new Function0() { // from class: au.com.woolworths.shop.ratingsandreviews.ui.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (z4) {
                                                case 0:
                                                    onWriteReviewClick.invoke(buttonAction.e, ratingsAndReviewsPreviewCta.d.e);
                                                    break;
                                                default:
                                                    onWriteReviewClick.invoke(buttonAction.e, ratingsAndReviewsPreviewCta.d.e);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composerImpl2.A(function03);
                                    obj = function03;
                                } else {
                                    z2 = false;
                                    obj = objG;
                                }
                                Function0 function04 = (Function0) obj;
                                composerImpl2.V(z2);
                                composerImpl2.o(-1746271574);
                                boolean zI2 = ((i4 & 7168) == 2048) | composerImpl2.I(buttonAction) | composerImpl2.I(ratingsAndReviewsPreviewSections);
                                Object objG2 = composerImpl2.G();
                                Object obj2 = objG2;
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    final int i8 = 1;
                                    Function0 function05 = new Function0() { // from class: au.com.woolworths.shop.ratingsandreviews.ui.a
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i8) {
                                                case 0:
                                                    onShowAllReviewsClick.invoke(buttonAction.e, ratingsAndReviewsPreviewCta.d.e);
                                                    break;
                                                default:
                                                    onShowAllReviewsClick.invoke(buttonAction.e, ratingsAndReviewsPreviewCta.d.e);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composerImpl2.A(function05);
                                    obj2 = function05;
                                }
                                z3 = false;
                                composerImpl2.V(false);
                                ReviewPreviewScreenUIKt.b(str, str3, function04, (Function0) obj2, modifierA2, composerImpl2, 24576);
                            }
                            composerImpl2.V(z3);
                        }
                    }
                }
                i3 = 16;
                horizontal2 = horizontal;
                companion2 = companion;
                it2 = it;
                composerImpl2 = composerImpl2;
            }
            composerImpl2.V(false);
            composerImpl2.V(true);
            modifier2 = companion2;
            composerImpl = composerImpl2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(item, onWriteReviewClick, onSeeAllRatingsAndReviewsClick, onShowAllReviewsClick, modifier2, i, 24);
        }
    }

    public static final void c(RatingsAndReviewsReviewDetails ratingsAndReviewsReviewDetails, Composer composer, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        ComposerImpl composerImplV = composer.v(-1038012310);
        if ((((composerImplV.I(ratingsAndReviewsReviewDetails) ? 4 : 2) | i) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = ratingsAndReviewsReviewDetails.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ArrayList arrayList2 = ((RatingsAndReviewsReviewDetails.ReviewDetailsItem) it.next()).d;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (obj instanceof ReviewItem.Rating) {
                        arrayList3.add(obj);
                    }
                }
                ReviewItem.Rating rating = (ReviewItem.Rating) CollectionsKt.F(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (obj2 instanceof ReviewItem.Title) {
                        arrayList4.add(obj2);
                    }
                }
                ReviewItem.Title title = (ReviewItem.Title) CollectionsKt.F(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (obj3 instanceof ReviewItem.Recommendation) {
                        arrayList5.add(obj3);
                    }
                }
                ReviewItem.Recommendation recommendation = (ReviewItem.Recommendation) CollectionsKt.F(arrayList5);
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    if (obj4 instanceof ReviewItem.Info) {
                        arrayList6.add(obj4);
                    }
                }
                ReviewItem.Info info = (ReviewItem.Info) CollectionsKt.F(arrayList6);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : arrayList2) {
                    if (obj5 instanceof ReviewItem.Body) {
                        arrayList7.add(obj5);
                    }
                }
                ReviewItem.Body body = (ReviewItem.Body) CollectionsKt.F(arrayList7);
                arrayList.add(new ReviewCardData(rating != null ? rating.d : 0, (rating == null || (str7 = rating.f) == null) ? "" : str7, (title == null || (str6 = title.d) == null) ? "" : str6, (recommendation == null || (str5 = recommendation.e) == null) ? "" : str5, (recommendation == null || (str4 = recommendation.d) == null) ? "" : str4, (info == null || (str3 = info.d) == null) ? "" : str3, (info == null || (str2 = info.e) == null) ? "" : str2, (body == null || (str = body.d) == null) ? "" : str));
            }
            ReviewPreviewScreenUIKt.a(arrayList, null, composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(i, 3, ratingsAndReviewsReviewDetails);
        }
    }
}

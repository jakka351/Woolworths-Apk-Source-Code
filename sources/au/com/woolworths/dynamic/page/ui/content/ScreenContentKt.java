package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.compose.utils.graphics.ForwardingPainterKt;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.dynamic.page.data.CampaignCardCarouselData;
import au.com.woolworths.dynamic.page.data.CampaignCardCopyData;
import au.com.woolworths.dynamic.page.data.CampaignCardListData;
import au.com.woolworths.dynamic.page.data.CampaignTermsAndConditionsData;
import au.com.woolworths.dynamic.page.data.CategoryTileListData;
import au.com.woolworths.dynamic.page.data.ContentListData;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.data.DynamicPageFooterData;
import au.com.woolworths.dynamic.page.data.FeedItemData;
import au.com.woolworths.dynamic.page.data.QuickLinkListData;
import au.com.woolworths.dynamic.page.ui.DynamicPageContract;
import au.com.woolworths.foundation.feature.analytics.AnalyticsTracker;
import au.com.woolworths.foundation.feature.analytics.AnalyticsTrackerKt;
import au.com.woolworths.shared.ui.compose.shop.CartIconButtonKt;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "titleTopY", "headerHeight", "dynamic-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ScreenContentKt {
    public static final void a(Function0 function0, long j, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(367368989);
        int i2 = (composerImplV.I(function0) ? 4 : 2) | i | (composerImplV.s(j) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new FocusRequester();
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composerImplV, R.string.content_description_back_button), function0, FocusableKt.a(FocusRequesterModifierKt.a(Modifier.Companion.d, (FocusRequester) objG), true, null), false, j, composerImplV, ((i2 << 6) & 896) | ((i2 << 12) & 458752), 16);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new n(function0, j, i, 0);
        }
    }

    public static final void b(final DynamicPageFooterData dynamicPageFooterData, final String str, final Function2 onLinkClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(onLinkClick, "onLinkClick");
        ComposerImpl composerImplV = composer.v(-1133967675);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(dynamicPageFooterData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onLinkClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final AnalyticsTracker analyticsTrackerA = AnalyticsTrackerKt.a(composerImplV);
            Modifier modifierA = ShadowKt.a(Modifier.Companion.d, 16, null, false, 0L, 0L, 30);
            long jA = WxTheme.a(composerImplV).a();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            SurfaceKt.a(WindowInsetsPadding_androidKt.a(SizeKt.e(BackgroundKt.b(modifierA, jA, rectangleShapeKt$RectangleShape$1), 1.0f)), rectangleShapeKt$RectangleShape$1, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(1132914945, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.ScreenContentKt$BottomBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        float f = 16;
                        Modifier modifierI = PaddingKt.i(SizeKt.e(Modifier.Companion.d, 1.0f), f, 12, f, f);
                        DynamicPageFooterData dynamicPageFooterData2 = dynamicPageFooterData;
                        String str2 = dynamicPageFooterData2.f5186a.f5183a;
                        composer2.o(-1224400529);
                        Function2 function2 = onLinkClick;
                        boolean zN = composer2.n(function2) | composer2.I(dynamicPageFooterData2);
                        AnalyticsTracker analyticsTracker = analyticsTrackerA;
                        boolean zI = zN | composer2.I(analyticsTracker);
                        String str3 = str;
                        boolean zN2 = zI | composer2.n(str3);
                        Object objG = composer2.G();
                        if (zN2 || objG == Composer.Companion.f1624a) {
                            androidx.work.impl.utils.b bVar = new androidx.work.impl.utils.b(function2, dynamicPageFooterData2, analyticsTracker, str3, 3);
                            composer2.A(bVar);
                            objG = bVar;
                        }
                        composer2.l();
                        PrimaryButtonKt.a(str2, (Function0) objG, modifierI, false, false, null, null, null, null, composer2, 0, 1016);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 1572912, 60);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(dynamicPageFooterData, str, onLinkClick, i, 13);
        }
    }

    public static final void c(LazyListScope lazyListScope, DynamicPageFeedData dynamicPageFeedData, final Function2 function2) {
        for (final FeedItemData feedItemData : dynamicPageFeedData.b) {
            LazyListScope.i(lazyListScope, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.ScreenContentKt$FeedItems$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    LazyItemScope item = (LazyItemScope) obj;
                    Composer composer = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(item, "$this$item");
                    if ((iIntValue & 17) == 16 && composer.c()) {
                        composer.j();
                    } else {
                        FeedItemData feedItemData2 = feedItemData;
                        if (feedItemData2 instanceof ContentListData) {
                            composer.o(-761817759);
                            ContentListUiKt.b((ContentListData) feedItemData2, null, function2, composer, 0);
                            composer.l();
                        } else if (feedItemData2 instanceof CampaignTermsAndConditionsData) {
                            composer.o(-761814419);
                            TermsAndConditionsUiKt.a((CampaignTermsAndConditionsData) feedItemData2, null, composer, 0, 2);
                            composer.l();
                        } else if (feedItemData2 instanceof CampaignCardCarouselData) {
                            composer.o(-761811870);
                            CardCarouselUiKt.b((CampaignCardCarouselData) feedItemData2, null, function2, composer, 0, 2);
                            composer.l();
                        } else if (feedItemData2 instanceof CampaignCardListData) {
                            composer.o(-761808802);
                            CardListUiKt.b((CampaignCardListData) feedItemData2, null, function2, composer, 0, 2);
                            composer.l();
                        } else if (feedItemData2 instanceof CampaignCardCopyData) {
                            composer.o(-761805885);
                            CardCopyUiKt.a((CampaignCardCopyData) feedItemData2, null, composer, 0);
                            composer.l();
                        } else if (feedItemData2 instanceof QuickLinkListData) {
                            composer.o(-761803869);
                            QuickLinkListUiKt.a((QuickLinkListData) feedItemData2, null, function2, composer, 0, 2);
                            composer.l();
                        } else if (feedItemData2 instanceof CategoryTileListData) {
                            composer.o(-761800762);
                            CategoryTileListUiKt.a((CategoryTileListData) feedItemData2, null, function2, composer, 0, 2);
                            composer.l();
                        } else {
                            composer.o(-2140919436);
                            composer.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, true, 1943339182), 3);
        }
    }

    public static final void d(float f, int i, int i2, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        ComposerImpl composerImplV = composer.v(471931069);
        int i4 = i | (composerImplV.n(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= composerImplV.q(f) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | KyberEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (composerImplV.n(modifier2) ? 256 : 128);
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier2;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifier4 = i5 != 0 ? companion : modifier2;
            Painter painterA = ForwardingPainterKt.a(PainterResources_androidKt.a(R.drawable.ic_dynamic_page_image_placeholder, 0, composerImplV), null, null, 14);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = Brush.Companion.c(new Pair[]{new Pair(Float.valueOf(BitmapDescriptorFactory.HUE_RED), new Color(ColorKt.d(2566914048L))), new Pair(Float.valueOf(1.0f), new Color(Color.j))});
                composerImplV.A(objG);
            }
            Brush brush = (Brush) objG;
            composerImplV.V(false);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Modifier modifierA = AspectRatioKt.a(SizeKt.e(modifier4, 1.0f), 1.0f);
            composerImplV.o(5004770);
            boolean z = (i3 & 112) == 32;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new o(f, 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            SingletonAsyncImageKt.b(str, null, GraphicsLayerModifierKt.a(modifierA, (Function1) objG2), painterA, painterA, null, null, null, null, null, ContentScale.Companion.f1880a, null, composerImplV, (i3 & 14) | 48, 6, 31712);
            BoxKt.a(BackgroundKt.a(BoxScopeInstance.f944a.i(), brush), composerImplV, 0);
            composerImplV.V(true);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new p(str, f, modifier3, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final au.com.woolworths.dynamic.page.ui.DynamicPageContract.ViewState r15, final kotlin.jvm.functions.Function2 r16, androidx.compose.ui.Modifier r17, kotlin.jvm.functions.Function1 r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.dynamic.page.ui.content.ScreenContentKt.e(au.com.woolworths.dynamic.page.ui.DynamicPageContract$ViewState, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(au.com.woolworths.dynamic.page.data.DynamicPageFeedData r18, androidx.compose.ui.Modifier r19, kotlin.jvm.functions.Function2 r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r1 = r18
            r3 = r20
            r4 = r22
            java.lang.String r0 = "feedData"
            kotlin.jvm.internal.Intrinsics.h(r1, r0)
            java.lang.String r0 = "onLinkClick"
            kotlin.jvm.internal.Intrinsics.h(r3, r0)
            r0 = -1454392678(0xffffffffa94fba9a, float:-4.6125084E-14)
            r2 = r21
            androidx.compose.runtime.ComposerImpl r15 = r2.v(r0)
            r0 = r4 & 6
            if (r0 != 0) goto L28
            boolean r0 = r15.I(r1)
            if (r0 == 0) goto L25
            r0 = 4
            goto L26
        L25:
            r0 = 2
        L26:
            r0 = r0 | r4
            goto L29
        L28:
            r0 = r4
        L29:
            r2 = r23 & 2
            if (r2 == 0) goto L32
            r0 = r0 | 48
        L2f:
            r5 = r19
            goto L44
        L32:
            r5 = r4 & 48
            if (r5 != 0) goto L2f
            r5 = r19
            boolean r6 = r15.n(r5)
            if (r6 == 0) goto L41
            r6 = 32
            goto L43
        L41:
            r6 = 16
        L43:
            r0 = r0 | r6
        L44:
            r6 = r4 & 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L55
            boolean r6 = r15.I(r3)
            if (r6 == 0) goto L52
            r6 = r7
            goto L54
        L52:
            r6 = 128(0x80, float:1.794E-43)
        L54:
            r0 = r0 | r6
        L55:
            r6 = r0 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L67
            boolean r6 = r15.c()
            if (r6 != 0) goto L62
            goto L67
        L62:
            r15.j()
        L65:
            r2 = r5
            goto Laa
        L67:
            if (r2 == 0) goto L6c
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion.d
            r5 = r2
        L6c:
            r2 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r15.o(r2)
            boolean r2 = r15.I(r1)
            r6 = r0 & 896(0x380, float:1.256E-42)
            r8 = 0
            if (r6 != r7) goto L7d
            r6 = 1
            goto L7e
        L7d:
            r6 = r8
        L7e:
            r2 = r2 | r6
            java.lang.Object r6 = r15.G()
            if (r2 != 0) goto L89
            androidx.compose.runtime.Composer$Companion$Empty$1 r2 = androidx.compose.runtime.Composer.Companion.f1624a
            if (r6 != r2) goto L92
        L89:
            au.com.woolworths.dynamic.page.ui.content.f r6 = new au.com.woolworths.dynamic.page.ui.content.f
            r2 = 3
            r6.<init>(r1, r3, r2)
            r15.A(r6)
        L92:
            r14 = r6
            kotlin.jvm.functions.Function1 r14 = (kotlin.jvm.functions.Function1) r14
            r15.V(r8)
            int r0 = r0 >> 3
            r16 = r0 & 14
            r17 = 510(0x1fe, float:7.15E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            androidx.compose.foundation.lazy.LazyDslKt.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L65
        Laa:
            androidx.compose.runtime.RecomposeScopeImpl r7 = r15.X()
            if (r7 == 0) goto Lba
            au.com.woolworths.base.rewards.account.ui.a r0 = new au.com.woolworths.base.rewards.account.ui.a
            r6 = 2
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.dynamic.page.ui.content.ScreenContentKt.f(au.com.woolworths.dynamic.page.data.DynamicPageFeedData, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void g(final DynamicPageContract.ViewState viewState, final String title, final long j, final float f, final long j2, final Function0 onNavigateUp, final Function0 onShareClick, Modifier modifier, final long j3, final Function0 onCartClick, Composer composer, final int i) {
        int i2;
        float f2;
        Modifier modifier2;
        final Modifier modifier3;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(title, "title");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(onShareClick, "onShareClick");
        Intrinsics.h(onCartClick, "onCartClick");
        ComposerImpl composerImplV = composer.v(1648517395);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(title) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.s(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f2 = f;
            i2 |= composerImplV.q(f2) ? 2048 : 1024;
        } else {
            f2 = f;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.s(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onNavigateUp) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onShareClick) ? 1048576 : 524288;
        }
        int i3 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            i3 |= composerImplV.s(j3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerImplV.I(onCartClick) ? 536870912 : 268435456;
        }
        int i4 = i3;
        if ((i4 & 306783379) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                modifier2 = Modifier.Companion.d;
            } else {
                composerImplV.j();
                modifier2 = modifier;
            }
            composerImplV.W();
            Modifier modifier4 = modifier2;
            TopNavBarKt.b(title, modifier4, null, null, j3, j, 0L, null, f2, ComposableLambdaKt.c(-1794934044, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.ScreenContentKt$TopNavBar$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        ScreenContentKt.a(onNavigateUp, j2, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(178461566, new Function3<RowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.dynamic.page.ui.content.ScreenContentKt$TopNavBar$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2;
                    RowScope TopNavBar = (RowScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(TopNavBar, "$this$TopNavBar");
                    if ((iIntValue & 17) == 16 && composer3.c()) {
                        composer3.j();
                    } else {
                        composer3.o(-297126140);
                        DynamicPageContract.ViewState viewState2 = viewState;
                        DynamicPageFeedData dynamicPageFeedData = viewState2.c;
                        if ((dynamicPageFeedData != null ? dynamicPageFeedData.f5185a.d : null) != null) {
                            composer2 = composer3;
                            IconButtonKt.c(ShareKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_share), onShareClick, null, false, j2, composer2, 0, 24);
                        } else {
                            composer2 = composer3;
                        }
                        composer2.l();
                        Integer num = viewState2.b;
                        if (num != null) {
                            CartIconButtonKt.a(Integer.valueOf(num.intValue()), onCartClick, null, j2, composer2, 0, 4);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i4 >> 3) & 14) | 805306368 | ((i4 >> 18) & 112) | ((i4 >> 12) & 57344) | ((i4 << 9) & 458752) | ((i4 << 15) & 234881024), 6, 204);
            modifier3 = modifier4;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.dynamic.page.ui.content.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    ScreenContentKt.g(viewState, title, j, f, j2, onNavigateUp, onShareClick, modifier3, j3, onCartClick, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}

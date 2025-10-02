package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared.FooterButtonKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFooter;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasSpacerSize;
import au.com.woolworths.foundation.rewards.common.ui.buttons.SmallIconItemUiKt;
import au.com.woolworths.foundation.rewards.common.ui.textitem.NoteTextUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ChoosePlanContentKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Screen.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Screen screen = Screen.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EverydayExtrasSpacerSize.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EverydayExtrasSpacerSize everydayExtrasSpacerSize = EverydayExtrasSpacerSize.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EverydayExtrasSpacerSize everydayExtrasSpacerSize2 = EverydayExtrasSpacerSize.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EverydayExtrasSpacerSize everydayExtrasSpacerSize3 = EverydayExtrasSpacerSize.d;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.Screen r17, au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed r18, boolean r19, java.lang.String r20, kotlin.jvm.functions.Function1 r21, kotlin.jvm.functions.Function1 r22, androidx.compose.ui.Modifier r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt.a(au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.Screen, au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanFeed, boolean, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(EverydayExtrasChoosePlanFooter everydayExtrasChoosePlanFooter, Function1 function1, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-282082844);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(everydayExtrasChoosePlanFooter) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerImplV.c()) {
            Modifier modifierB = BackgroundKt.b(PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, 7), ToneColors.k, RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 7, 0L, composerImplV, null);
            composerImplV.o(-699898740);
            Iterator it = everydayExtrasChoosePlanFooter.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    composerImplV.V(false);
                    composerImplV.V(true);
                    break;
                }
                EverydayExtrasChoosePlanFooterItem everydayExtrasChoosePlanFooterItem = (EverydayExtrasChoosePlanFooterItem) it.next();
                if (everydayExtrasChoosePlanFooterItem instanceof EverydayExtrasChoosePlanFooterItem.Button) {
                    composerImplV.o(-1997639847);
                    EverydayExtrasChoosePlanFooterItem.Button button = (EverydayExtrasChoosePlanFooterItem.Button) everydayExtrasChoosePlanFooterItem;
                    String str = button.d;
                    EverydayExtrasButtonStyle everydayExtrasButtonStyle = button.g;
                    composerImplV.o(-1633490746);
                    boolean zI = composerImplV.I(everydayExtrasChoosePlanFooterItem) | ((i2 & 112) == 32);
                    Object objG = composerImplV.G();
                    if (zI || objG == Composer.Companion.f1624a) {
                        objG = new au.com.woolworths.feature.rewards.card.overlay.ui.b(1, function1, button);
                        composerImplV.A(objG);
                    }
                    composerImplV.V(false);
                    FooterButtonKt.a(str, everydayExtrasButtonStyle, (Function0) objG, composerImplV, 0);
                    composerImplV.V(false);
                } else {
                    if (!(everydayExtrasChoosePlanFooterItem instanceof EverydayExtrasChoosePlanFooterItem.NoteTextItem)) {
                        throw au.com.woolworths.android.onesite.a.w(74105469, composerImplV, false);
                    }
                    composerImplV.o(-1997342619);
                    final EverydayExtrasChoosePlanFooterItem.NoteTextItem noteTextItem = (EverydayExtrasChoosePlanFooterItem.NoteTextItem) everydayExtrasChoosePlanFooterItem;
                    CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-417439283, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt$FooterContent$1$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                NoteTextUiKt.a(noteTextItem.d, PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), 0L, 0L, null, new TextAlign(3), false, composer2, 48, 92);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV));
                    composerImplV.V(false);
                }
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(everydayExtrasChoosePlanFooter, i, 9, function1);
        }
    }

    public static final void c(final EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed, TextAlign textAlign, boolean z, String str, Function1 function1, Function1 function12, Modifier modifier, Composer composer, int i) {
        int i2;
        final TextAlign textAlign2;
        final boolean z2;
        String str2;
        Function1 function13;
        Function1 function14;
        boolean z3;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-657349028);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(everydayExtrasChoosePlanFeed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            textAlign2 = textAlign;
            i2 |= composerImplV.n(textAlign2) ? 32 : 16;
        } else {
            textAlign2 = textAlign;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i2 |= composerImplV.p(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= composerImplV.n(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            function13 = function1;
            i2 |= composerImplV.I(function13) ? 16384 : 8192;
        } else {
            function13 = function1;
        }
        if ((196608 & i) == 0) {
            function14 = function12;
            i2 |= composerImplV.I(function14) ? 131072 : 65536;
        } else {
            function14 = function12;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(modifier) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) == 599186 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            PaddingValues paddingValuesD = WindowInsetsKt.d(WindowInsets_androidKt.a(composerImplV), composerImplV);
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(everydayExtrasChoosePlanFeed) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                z3 = false;
                final String str3 = str2;
                final Function1 function15 = function13;
                final Function1 function16 = function14;
                Function1 function17 = new Function1() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i4;
                        final float f;
                        LazyListScope LazyColumn = (LazyListScope) obj;
                        Intrinsics.h(LazyColumn, "$this$LazyColumn");
                        EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed2 = everydayExtrasChoosePlanFeed;
                        int i5 = 0;
                        for (Object obj2 : everydayExtrasChoosePlanFeed2.b.b) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            EverydayExtrasChoosePlanContentItem everydayExtrasChoosePlanContentItem = (EverydayExtrasChoosePlanContentItem) obj2;
                            if (everydayExtrasChoosePlanContentItem instanceof EverydayExtrasChoosePlanContentItem.TitleTextItem) {
                                final EverydayExtrasChoosePlanContentItem.TitleTextItem titleTextItem = (EverydayExtrasChoosePlanContentItem.TitleTextItem) everydayExtrasChoosePlanContentItem;
                                final TextAlign textAlign3 = textAlign2;
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt$MainContent$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            float f2 = 16;
                                            TextKt.b(titleTextItem.d, PaddingKt.j(PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), f2, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 32, 5), 0L, 0L, null, 0L, null, textAlign3, 0L, 0, false, 0, 0, null, WxTheme.b(composer2).w, composer2, 48, 0, 65020);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 1093321782), 3);
                            } else if (everydayExtrasChoosePlanContentItem instanceof EverydayExtrasChoosePlanContentItem.SmallIconListItem) {
                                final EverydayExtrasChoosePlanContentItem.SmallIconListItem smallIconListItem = (EverydayExtrasChoosePlanContentItem.SmallIconListItem) everydayExtrasChoosePlanContentItem;
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt$MainContent$1$1$1$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            EverydayExtrasChoosePlanContentItem.SmallIconListItem smallIconListItem2 = smallIconListItem;
                                            SmallIconItemUiKt.a(smallIconListItem2.d, smallIconListItem2.e, null, composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 664640109), 3);
                            } else if (everydayExtrasChoosePlanContentItem instanceof EverydayExtrasChoosePlanContentItem.SubscribePlan) {
                                final float f2 = ((EverydayExtrasChoosePlanContentItem) CollectionsKt.J(i6, everydayExtrasChoosePlanFeed2.b.b)) instanceof EverydayExtrasChoosePlanContentItem.SubscribePlan ? 16 : 32;
                                final EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan = (EverydayExtrasChoosePlanContentItem.SubscribePlan) everydayExtrasChoosePlanContentItem;
                                final String str4 = str3;
                                final boolean z4 = z2;
                                final Function1 function18 = function15;
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt$MainContent$1$1$1$3
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            Modifier modifierA = TestTagKt.a(PaddingKt.j(PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, 7), "PlanItem");
                                            EverydayExtrasChoosePlanContentItem.SubscribePlan subscribePlan2 = subscribePlan;
                                            boolean zEquals = subscribePlan2.d.equals(str4);
                                            String str5 = subscribePlan2.e;
                                            String str6 = subscribePlan2.f;
                                            int i7 = subscribePlan2.g;
                                            final EverydayExtrasChoosePlanContentItem.SubscribePlan.EverydayExtrasSubscribePlanBadge everydayExtrasSubscribePlanBadge = subscribePlan2.h;
                                            BrandLabel brandLabel = everydayExtrasSubscribePlanBadge != null ? new BrandLabel(everydayExtrasSubscribePlanBadge) { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItemKt$toBrandLabel$1
                                                public final PlainText d;
                                                public final BrandLabelType e = EverydayExtrasBadgeBrandLabelType.d;

                                                {
                                                    this.d = new PlainText(everydayExtrasSubscribePlanBadge.f6146a);
                                                }

                                                @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
                                                public final Text getText() {
                                                    return this.d;
                                                }

                                                @Override // au.com.woolworths.android.onesite.modules.customviews.BrandLabel
                                                /* renamed from: getType, reason: from getter */
                                                public final BrandLabelType getE() {
                                                    return this.e;
                                                }
                                            } : null;
                                            composer2.o(-1633490746);
                                            Object obj6 = function18;
                                            boolean zN = composer2.n(obj6) | composer2.I(subscribePlan2);
                                            Object objG2 = composer2.G();
                                            if (zN || objG2 == Composer.Companion.f1624a) {
                                                objG2 = new au.com.woolworths.feature.rewards.card.overlay.ui.b(2, obj6, subscribePlan2);
                                                composer2.A(objG2);
                                            }
                                            composer2.l();
                                            SubscribePlanItemUiKt.a(zEquals, str5, str6, i7, brandLabel, z4, (Function0) objG2, modifierA, composer2, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -2047975122), 3);
                            } else if (everydayExtrasChoosePlanContentItem instanceof EverydayExtrasChoosePlanContentItem.Spacer) {
                                int iOrdinal = ((EverydayExtrasChoosePlanContentItem.Spacer) everydayExtrasChoosePlanContentItem).d.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        f = 16;
                                    } else if (iOrdinal == 2) {
                                        i4 = 24;
                                    } else {
                                        if (iOrdinal != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        f = 32;
                                    }
                                    LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt$MainContent$1$1$1$4
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                            LazyItemScope item = (LazyItemScope) obj3;
                                            Composer composer2 = (Composer) obj4;
                                            int iIntValue = ((Number) obj5).intValue();
                                            Intrinsics.h(item, "$this$item");
                                            if ((iIntValue & 17) == 16 && composer2.c()) {
                                                composer2.j();
                                            } else {
                                                SpacerKt.a(composer2, SizeKt.g(Modifier.Companion.d, f));
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, -465623057), 3);
                                } else {
                                    i4 = 8;
                                }
                                f = i4;
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt$MainContent$1$1$1$4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            SpacerKt.a(composer2, SizeKt.g(Modifier.Companion.d, f));
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, -465623057), 3);
                            } else {
                                if (!(everydayExtrasChoosePlanContentItem instanceof EverydayExtrasChoosePlanContentItem.Button)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                final EverydayExtrasChoosePlanContentItem.Button button = (EverydayExtrasChoosePlanContentItem.Button) everydayExtrasChoosePlanContentItem;
                                final Function1 function19 = function16;
                                LazyListScope.i(LazyColumn, null, null, new ComposableLambdaImpl(new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanContentKt$MainContent$1$1$1$5
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        LazyItemScope item = (LazyItemScope) obj3;
                                        Composer composer2 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(item, "$this$item");
                                        if ((iIntValue & 17) == 16 && composer2.c()) {
                                            composer2.j();
                                        } else {
                                            Modifier modifierH = PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2);
                                            EverydayExtrasChoosePlanContentItem.Button button2 = button;
                                            String str5 = button2.d;
                                            EverydayExtrasButtonStyle everydayExtrasButtonStyle = button2.g;
                                            composer2.o(-1633490746);
                                            Function1 function110 = function19;
                                            boolean zN = composer2.n(function110) | composer2.I(button2);
                                            Object objG2 = composer2.G();
                                            if (zN || objG2 == Composer.Companion.f1624a) {
                                                objG2 = new au.com.woolworths.feature.rewards.card.overlay.ui.b(3, function110, button2);
                                                composer2.A(objG2);
                                            }
                                            composer2.l();
                                            FooterButtonKt.b(str5, everydayExtrasButtonStyle, (Function0) objG2, modifierH, composer2, 3072);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, true, 1116729008), 3);
                            }
                            i5 = i6;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(function17);
                objG = function17;
            } else {
                z3 = false;
            }
            composerImplV.V(z3);
            composerImpl = composerImplV;
            LazyDslKt.b(modifier, null, paddingValuesD, false, null, null, null, false, null, (Function1) objG, composerImpl, (i3 >> 18) & 14, 506);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.legacy.compose.productsearch.a(everydayExtrasChoosePlanFeed, textAlign, z, str, function1, function12, modifier, i);
        }
    }
}

package au.com.woolworths.feature.rewards.offers.listpage.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModel;
import au.com.woolworths.feature.rewards.offers.listpage.OfferListPageViewModelKt$createAnalyticsScreen$1;
import au.com.woolworths.feature.rewards.offers.listpage.OffersListPageContract;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showConfetti", "offers_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class OffersListPageScreenKt {
    public static final void a(final OfferListPageViewModel offerListPageViewModel, final Function1 openUrl, Function0 onNavigateUp, final Function1 showOfferDetailScreen, Composer composer, int i) {
        int i2;
        int i3;
        boolean z;
        RewardsOfferBaseContract.OfferFeedInlineBannerListener offerFeedInlineBannerListener;
        RewardsOfferBaseContract.RewardsCtaCardListener rewardsCtaCardListener;
        ComposerImpl composerImpl;
        Intrinsics.h(openUrl, "openUrl");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        Intrinsics.h(showOfferDetailScreen, "showOfferDetailScreen");
        ComposerImpl composerImplV = composer.v(1374085770);
        int i4 = i | (composerImplV.I(offerListPageViewModel) ? 4 : 2) | (composerImplV.I(openUrl) ? 32 : 16) | (composerImplV.I(onNavigateUp) ? 256 : 128) | (composerImplV.I(showOfferDetailScreen) ? 2048 : 1024);
        if ((i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            OffersListPageContract.ViewState viewState = (OffersListPageContract.ViewState) FlowExtKt.a(offerListPageViewModel.x, composerImplV).getD();
            SharedFlow sharedFlow = offerListPageViewModel.j;
            composerImplV.o(-1633490746);
            int i5 = i4 & 112;
            boolean zI = composerImplV.I(offerListPageViewModel) | (i5 == 32);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new OffersListPageScreenKt$OffersListPageScreen$1$1(offerListPageViewModel, openUrl, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, sharedFlow, (Function2) objG);
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(offerListPageViewModel);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.feature.rewards.offers.listpage.c(offerListPageViewModel, 2);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            LifecycleEffectKt.a(null, (Function1) objG2, composerImplV, 6);
            composerImplV.o(5004770);
            boolean zI3 = composerImplV.I(offerListPageViewModel);
            Object objG3 = composerImplV.G();
            if (zI3 || objG3 == composer$Companion$Empty$1) {
                i2 = 5004770;
                i3 = i5;
                z = false;
                OffersListPageScreenKt$OffersListPageScreen$3$1 offersListPageScreenKt$OffersListPageScreen$3$1 = new OffersListPageScreenKt$OffersListPageScreen$3$1(0, offerListPageViewModel, OfferListPageViewModel.class, "refresh", "refresh()V", 0);
                composerImplV.A(offersListPageScreenKt$OffersListPageScreen$3$1);
                objG3 = offersListPageScreenKt$OffersListPageScreen$3$1;
            } else {
                i2 = 5004770;
                i3 = i5;
                z = false;
            }
            KFunction kFunction = (KFunction) objG3;
            composerImplV.V(z);
            composerImplV.o(i2);
            boolean zI4 = composerImplV.I(offerListPageViewModel);
            Object objG4 = composerImplV.G();
            if (zI4 || objG4 == composer$Companion$Empty$1) {
                OffersListPageScreenKt$OffersListPageScreen$4$1 offersListPageScreenKt$OffersListPageScreen$4$1 = new OffersListPageScreenKt$OffersListPageScreen$4$1(1, offerListPageViewModel, OfferListPageViewModel.class, "onBannerClick", "onBannerClick(Lau/com/woolworths/feature/rewards/offers/SectionViewItem;)V", 0);
                composerImplV.A(offersListPageScreenKt$OffersListPageScreen$4$1);
                objG4 = offersListPageScreenKt$OffersListPageScreen$4$1;
            }
            KFunction kFunction2 = (KFunction) objG4;
            composerImplV.V(z);
            composerImplV.o(i2);
            boolean zI5 = composerImplV.I(offerListPageViewModel);
            Object objG5 = composerImplV.G();
            if (zI5 || objG5 == composer$Companion$Empty$1) {
                OffersListPageScreenKt$OffersListPageScreen$5$1 offersListPageScreenKt$OffersListPageScreen$5$1 = new OffersListPageScreenKt$OffersListPageScreen$5$1(1, offerListPageViewModel, OfferListPageViewModel.class, "activateOffer", "activateOffer(Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferData;)V", 0);
                composerImplV.A(offersListPageScreenKt$OffersListPageScreen$5$1);
                objG5 = offersListPageScreenKt$OffersListPageScreen$5$1;
            }
            KFunction kFunction3 = (KFunction) objG5;
            composerImplV.V(z);
            composerImplV.o(i2);
            boolean zI6 = composerImplV.I(offerListPageViewModel);
            Object objG6 = composerImplV.G();
            if (zI6 || objG6 == composer$Companion$Empty$1) {
                OffersListPageScreenKt$OffersListPageScreen$6$1 offersListPageScreenKt$OffersListPageScreen$6$1 = new OffersListPageScreenKt$OffersListPageScreen$6$1(1, offerListPageViewModel, OfferListPageViewModel.class, "onOfferSectionTitleCtaClick", "onOfferSectionTitleCtaClick(Lau/com/woolworths/feature/rewards/offers/OfferSectionViewItem;)V", 0);
                composerImplV.A(offersListPageScreenKt$OffersListPageScreen$6$1);
                objG6 = offersListPageScreenKt$OffersListPageScreen$6$1;
            }
            KFunction kFunction4 = (KFunction) objG6;
            composerImplV.V(z);
            composerImplV.o(i2);
            boolean zI7 = composerImplV.I(offerListPageViewModel);
            Object objG7 = composerImplV.G();
            if (zI7 || objG7 == composer$Companion$Empty$1) {
                OffersListPageScreenKt$OffersListPageScreen$7$1 offersListPageScreenKt$OffersListPageScreen$7$1 = new OffersListPageScreenKt$OffersListPageScreen$7$1(1, offerListPageViewModel, OfferListPageViewModel.class, "trackSpinSurpriseBannerImpression", "trackSpinSurpriseBannerImpression(Lau/com/woolworths/feature/rewards/offers/SpinSurpriseBannerViewItem;)V", 0);
                composerImplV.A(offersListPageScreenKt$OffersListPageScreen$7$1);
                objG7 = offersListPageScreenKt$OffersListPageScreen$7$1;
            }
            KFunction kFunction5 = (KFunction) objG7;
            composerImplV.V(z);
            composerImplV.o(i2);
            boolean zI8 = composerImplV.I(offerListPageViewModel);
            Object objG8 = composerImplV.G();
            if (zI8 || objG8 == composer$Companion$Empty$1) {
                OffersListPageScreenKt$OffersListPageScreen$8$1 offersListPageScreenKt$OffersListPageScreen$8$1 = new OffersListPageScreenKt$OffersListPageScreen$8$1(1, offerListPageViewModel, OfferListPageViewModel.class, "trackStandardBannerImpression", "trackStandardBannerImpression(Lau/com/woolworths/feature/rewards/offers/StandardBannerViewItem;)V", 0);
                composerImplV.A(offersListPageScreenKt$OffersListPageScreen$8$1);
                objG8 = offersListPageScreenKt$OffersListPageScreen$8$1;
            }
            KFunction kFunction6 = (KFunction) objG8;
            composerImplV.V(z);
            RewardsOfferBaseContract.OfferFeedInlineBannerListener offerFeedInlineBannerListener2 = offerListPageViewModel.k;
            RewardsOfferBaseContract.RewardsCtaCardListener rewardsCtaCardListener2 = offerListPageViewModel.l;
            composerImplV.o(i2);
            boolean zI9 = composerImplV.I(offerListPageViewModel);
            Object objG9 = composerImplV.G();
            if (zI9 || objG9 == composer$Companion$Empty$1) {
                offerFeedInlineBannerListener = offerFeedInlineBannerListener2;
                rewardsCtaCardListener = rewardsCtaCardListener2;
                OffersListPageScreenKt$OffersListPageScreen$9$1 offersListPageScreenKt$OffersListPageScreen$9$1 = new OffersListPageScreenKt$OffersListPageScreen$9$1(0, offerListPageViewModel, OfferListPageViewModel.class, "onSnackbarShown", "onSnackbarShown()V", 0);
                composerImplV.A(offersListPageScreenKt$OffersListPageScreen$9$1);
                objG9 = offersListPageScreenKt$OffersListPageScreen$9$1;
            } else {
                offerFeedInlineBannerListener = offerFeedInlineBannerListener2;
                rewardsCtaCardListener = rewardsCtaCardListener2;
            }
            KFunction kFunction7 = (KFunction) objG9;
            composerImplV.V(z);
            Function0 function0 = (Function0) kFunction;
            composerImplV.o(-1633490746);
            boolean zI10 = composerImplV.I(offerListPageViewModel) | ((i4 & 7168) == 2048 ? true : z);
            Object objG10 = composerImplV.G();
            if (zI10 || objG10 == composer$Companion$Empty$1) {
                final int i6 = 0;
                objG10 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i6) {
                            case 0:
                                RewardsOfferData it = (RewardsOfferData) obj;
                                Intrinsics.h(it, "it");
                                OfferListPageViewModel offerListPageViewModel2 = offerListPageViewModel;
                                offerListPageViewModel2.getClass();
                                offerListPageViewModel2.r.o(it, offerListPageViewModel2.u, RewardsPointsActionData.i);
                                showOfferDetailScreen.invoke(it.d);
                                break;
                            default:
                                ContentCta cta = (ContentCta) obj;
                                Intrinsics.h(cta, "cta");
                                String url = cta.getUrl();
                                if (url != null) {
                                    OfferListPageViewModel offerListPageViewModel3 = offerListPageViewModel;
                                    AnalyticsManager analyticsManager = offerListPageViewModel3.q;
                                    RewardsPointsActionData.Companion companion = RewardsPointsActionData.e;
                                    String label = cta.getLabel();
                                    OfferListPageViewModelKt$createAnalyticsScreen$1 screen = offerListPageViewModel3.u;
                                    companion.getClass();
                                    Intrinsics.h(label, "label");
                                    Intrinsics.h(screen, "screen");
                                    Action action = new Action(screen, label) { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData$Companion$rewardsProductOfferListCtaButtonClick$1
                                        public final Screen d;
                                        public final Category e = Category.s;
                                        public final String f;

                                        {
                                            this.d = screen;
                                            this.f = label;
                                        }

                                        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                        /* renamed from: a, reason: from getter */
                                        public final String getF() {
                                            return this.f;
                                        }

                                        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                        /* renamed from: b, reason: from getter */
                                        public final Category getE() {
                                            return this.e;
                                        }

                                        @Override // au.com.woolworths.android.onesite.analytics.Action
                                        /* renamed from: f, reason: from getter */
                                        public final Screen getD() {
                                            return this.d;
                                        }
                                    };
                                    TrackableValue trackableValue = TrackableValue.o0;
                                    String url2 = cta.getUrl();
                                    if (url2 == null) {
                                        url2 = "";
                                    }
                                    analyticsManager.j(action, TrackingMetadata.Companion.a(trackableValue, url2));
                                    showOfferDetailScreen.invoke(url);
                                }
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG10);
            }
            Function1 function1 = (Function1) objG10;
            composerImplV.V(z);
            Function1 function12 = (Function1) kFunction4;
            Function1 function13 = (Function1) kFunction2;
            Function1 function14 = (Function1) kFunction3;
            composerImplV.o(-1633490746);
            int i7 = i3;
            boolean zI11 = composerImplV.I(offerListPageViewModel) | (i7 == 32 ? true : z);
            Object objG11 = composerImplV.G();
            if (zI11 || objG11 == composer$Companion$Empty$1) {
                objG11 = new androidx.navigation.compose.d(23, offerListPageViewModel, openUrl);
                composerImplV.A(objG11);
            }
            Function2 function2 = (Function2) objG11;
            composerImplV.V(z);
            composerImplV.o(-1633490746);
            boolean zI12 = composerImplV.I(offerListPageViewModel) | (i7 != 32 ? z : true);
            Object objG12 = composerImplV.G();
            if (zI12 || objG12 == composer$Companion$Empty$1) {
                final int i8 = 1;
                objG12 = new Function1() { // from class: au.com.woolworths.feature.rewards.offers.listpage.ui.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i8) {
                            case 0:
                                RewardsOfferData it = (RewardsOfferData) obj;
                                Intrinsics.h(it, "it");
                                OfferListPageViewModel offerListPageViewModel2 = offerListPageViewModel;
                                offerListPageViewModel2.getClass();
                                offerListPageViewModel2.r.o(it, offerListPageViewModel2.u, RewardsPointsActionData.i);
                                openUrl.invoke(it.d);
                                break;
                            default:
                                ContentCta cta = (ContentCta) obj;
                                Intrinsics.h(cta, "cta");
                                String url = cta.getUrl();
                                if (url != null) {
                                    OfferListPageViewModel offerListPageViewModel3 = offerListPageViewModel;
                                    AnalyticsManager analyticsManager = offerListPageViewModel3.q;
                                    RewardsPointsActionData.Companion companion = RewardsPointsActionData.e;
                                    String label = cta.getLabel();
                                    Screen screen = offerListPageViewModel3.u;
                                    companion.getClass();
                                    Intrinsics.h(label, "label");
                                    Intrinsics.h(screen, "screen");
                                    Action action = new Action(screen, label) { // from class: au.com.woolworths.feature.rewards.offers.list.analytics.RewardsPointsActionData$Companion$rewardsProductOfferListCtaButtonClick$1
                                        public final Screen d;
                                        public final Category e = Category.s;
                                        public final String f;

                                        {
                                            this.d = screen;
                                            this.f = label;
                                        }

                                        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                        /* renamed from: a, reason: from getter */
                                        public final String getF() {
                                            return this.f;
                                        }

                                        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
                                        /* renamed from: b, reason: from getter */
                                        public final Category getE() {
                                            return this.e;
                                        }

                                        @Override // au.com.woolworths.android.onesite.analytics.Action
                                        /* renamed from: f, reason: from getter */
                                        public final Screen getD() {
                                            return this.d;
                                        }
                                    };
                                    TrackableValue trackableValue = TrackableValue.o0;
                                    String url2 = cta.getUrl();
                                    if (url2 == null) {
                                        url2 = "";
                                    }
                                    analyticsManager.j(action, TrackingMetadata.Companion.a(trackableValue, url2));
                                    openUrl.invoke(url);
                                }
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG12);
            }
            Function1 function15 = (Function1) objG12;
            composerImplV.V(z);
            composerImplV.o(i2);
            boolean zI13 = composerImplV.I(offerListPageViewModel);
            Object objG13 = composerImplV.G();
            if (zI13 || objG13 == composer$Companion$Empty$1) {
                objG13 = new au.com.woolworths.feature.rewards.offers.listpage.c(offerListPageViewModel, 3);
                composerImplV.A(objG13);
            }
            composerImplV.V(z);
            composerImpl = composerImplV;
            b(viewState, onNavigateUp, function0, function1, function12, function13, function14, function2, function15, (Function1) objG13, (Function1) kFunction5, (Function1) kFunction6, rewardsCtaCardListener, offerFeedInlineBannerListener, (Function0) kFunction7, composerImpl, (i4 >> 3) & 112);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.iconbutton.a((Object) offerListPageViewModel, (Object) openUrl, onNavigateUp, (Function) showOfferDetailScreen, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final au.com.woolworths.feature.rewards.offers.listpage.OffersListPageContract.ViewState r36, final kotlin.jvm.functions.Function0 r37, final kotlin.jvm.functions.Function0 r38, final kotlin.jvm.functions.Function1 r39, final kotlin.jvm.functions.Function1 r40, final kotlin.jvm.functions.Function1 r41, final kotlin.jvm.functions.Function1 r42, final kotlin.jvm.functions.Function2 r43, final kotlin.jvm.functions.Function1 r44, final kotlin.jvm.functions.Function1 r45, final kotlin.jvm.functions.Function1 r46, final kotlin.jvm.functions.Function1 r47, final au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract.RewardsCtaCardListener r48, final au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract.OfferFeedInlineBannerListener r49, final kotlin.jvm.functions.Function0 r50, androidx.compose.runtime.Composer r51, final int r52) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.offers.listpage.ui.OffersListPageScreenKt.b(au.com.woolworths.feature.rewards.offers.listpage.OffersListPageContract$ViewState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract$RewardsCtaCardListener, au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract$OfferFeedInlineBannerListener, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }
}

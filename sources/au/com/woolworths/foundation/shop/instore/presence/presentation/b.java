package au.com.woolworths.foundation.shop.instore.presence.presentation;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import au.com.woolworths.android.onesite.modules.couponbanner.EverydayMarketCouponBannerData;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import au.com.woolworths.foundation.shop.nhp.ui.pp.PersonalisedProductsBannerKt;
import au.com.woolworths.foundation.shop.olive.voice.ui.search.OliveVoiceSearchScreenKt;
import au.com.woolworths.foundation.ui.couponbanner.EverydayMarketCouponBannerKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import au.com.woolworths.sdui.legacy.broadcastbanner.designcoreadapter.BroadcastBannerKt;
import au.com.woolworths.sdui.legacy.downloadableasset.Lottie;
import au.com.woolworths.sdui.rewards.appmodal.ui.AppModalScreenKt;
import au.com.woolworths.sdui.shop.alert.StandardAlertKt;
import au.com.woolworths.sdui.shop.alert.model.BasicInsetAlertModel;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.editorialbanner.EditorialBannerData;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.ui.LinkKt;
import au.com.woolworths.shop.aem.components.ui.button.ButtonSectionKt;
import au.com.woolworths.shop.aem.components.ui.editorialbanner.EditorialBannerKt;
import au.com.woolworths.shop.cart.ui.cart.CartScreenKt;
import au.com.woolworths.shop.checkout.ui.components.compose.FulfilmentWindowsUiKt;
import au.com.woolworths.shop.checkout.ui.compose.IdVerificationBottomSheetKt;
import au.com.woolworths.shop.checkout.ui.summary.rewards.slider.StepSliderKt;
import au.com.woolworths.shop.lists.ui.magicmatch.ui.OnboardingBottomSheetKt;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorContract;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorScreenKt;
import au.com.woolworths.shop.product.details.ui.ProductDetailsFooterUIKt;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt;
import au.com.woolworths.shop.specials.SpecialsHomeContract;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.halilibo.richtext.ui.RichTextScope;
import com.halilibo.richtext.ui.TableKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import me.onebone.toolbar.CollapsingToolbarScaffoldState;
import me.onebone.toolbar.CollapsingToolbarScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.d = i2;
        this.g = obj;
        this.h = obj2;
        this.f = obj3;
        this.i = obj4;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                InstorePresencePromptBottomSheetKt.a((String) this.f, (Function0) this.g, (Function0) this.h, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                PersonalisedProductsBannerKt.a((PersonalisedProductsBannerData) this.f, (Function1) this.g, (Function1) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                OliveVoiceSearchScreenKt.d((Function0) this.g, (Function0) this.h, (Modifier) this.f, (Boolean) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                EverydayMarketCouponBannerKt.a((EverydayMarketCouponBannerData) this.f, (Function1) this.g, (Function2) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                BroadcastBannerKt.a((BroadcastBannerData) this.f, (Function1) this.g, (Function1) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(433), this.e);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((Lottie) this.g).b((String) this.f, (ContentScale) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((Lottie) this.f).a((ContentScale) this.g, (LottieCompositionSpec.Url) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AppModalScreenKt.a((RewardsAppModalData) this.f, (Function0) this.g, (Function1) this.h, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                StandardAlertKt.a((BasicInsetAlertModel) this.f, (Function1) this.g, (Modifier) this.h, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(393), this.e);
                break;
            case 9:
                ((Integer) obj2).getClass();
                LinkKt.a((LinkData) this.f, (Function0) this.g, (Modifier) this.h, (PaddingValues) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ButtonSectionKt.a((ButtonData) this.f, (Function1) this.g, (Modifier) this.h, (PaddingValues) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((au.com.woolworths.shop.aem.components.ui.downloadableAsset.Lottie) this.g).b((String) this.f, (ContentScale) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((au.com.woolworths.shop.aem.components.ui.downloadableAsset.Lottie) this.f).a((ContentScale) this.g, (LottieCompositionSpec.Url) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                EditorialBannerKt.b((EditorialBannerData) this.f, (Function1) this.g, (Modifier) this.h, (ComposableLambdaImpl) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                CartScreenKt.b((CollapsingToolbarScope) this.g, (CollapsingToolbarScaffoldState) this.h, (String) this.f, (String) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                FulfilmentWindowsUiKt.a((String) this.f, (List) this.g, (Function1) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                IdVerificationBottomSheetKt.a((String) this.f, (Modifier) this.h, (Function0) this.g, (ComposableLambdaImpl) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                StepSliderKt.a((ArrayList) this.f, (Modifier) this.h, this.e, (Function1) this.i, (Function0) this.g, (Composer) obj, iA);
                break;
            case 18:
                ((Integer) obj2).getClass();
                OnboardingBottomSheetKt.a((Function0) this.g, (Function0) this.h, (Function0) this.i, (Function0) this.f, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ProcessorScreenKt.b((ProcessorContract.ViewState) this.f, (byte[]) this.h, (ProcessorContract.Listener) this.i, (Function0) this.g, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ProductDetailsFooterUIKt.a((ProductCard) this.f, (au.com.woolworths.shop.product.details.data.ButtonData) this.g, (Function1) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                SubmitReviewScreenKt.g((SubmitReviewFormViewModel) this.f, (Function0) this.g, (SubmitReviewContract.ViewState) this.h, (SnackbarHostState) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                SpecialsHomeScreenKt.c((ArrayList) this.f, (List) this.g, (SpecialsHomeContract.Snackbar) this.h, (SpecialsHomeViewModel) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                TableKt.a((RichTextScope) this.f, (Modifier) this.g, (Function1) this.h, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.a(this.e | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ b(ProcessorContract.ViewState viewState, byte[] bArr, ProcessorContract.Listener listener, Function0 function0, int i) {
        this.d = 19;
        this.f = viewState;
        this.h = bArr;
        this.i = listener;
        this.g = function0;
        this.e = i;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.e = i;
    }

    public /* synthetic */ b(Object obj, String str, ContentScale contentScale, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.g = obj;
        this.f = str;
        this.h = contentScale;
        this.i = modifier;
        this.e = i;
    }

    public /* synthetic */ b(Object obj, Function1 function1, Object obj2, Object obj3, int i, int i2, int i3) {
        this.d = i3;
        this.f = obj;
        this.g = function1;
        this.h = obj2;
        this.i = obj3;
        this.e = i2;
    }

    public /* synthetic */ b(String str, Modifier modifier, Function0 function0, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.d = 16;
        this.f = str;
        this.h = modifier;
        this.g = function0;
        this.i = composableLambdaImpl;
        this.e = i;
    }

    public /* synthetic */ b(ArrayList arrayList, Modifier modifier, int i, Function1 function1, Function0 function0, int i2) {
        this.d = 17;
        this.f = arrayList;
        this.h = modifier;
        this.e = i;
        this.i = function1;
        this.g = function0;
    }

    public /* synthetic */ b(Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i) {
        this.d = 18;
        this.g = function0;
        this.h = function02;
        this.i = function03;
        this.f = function04;
        this.e = i;
    }
}

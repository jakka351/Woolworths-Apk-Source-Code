package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.ScaffoldKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.dialog.AlertDialog;
import au.com.woolworths.design.wx.component.topbar.TopNavBarKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt;
import au.com.woolworths.product.composeui.o;
import au.com.woolworths.shop.cart.ui.cart.l;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.WriteReviewFormData;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemBodyField;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemNameField;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemRating;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItemTitleField;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewInputItems;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems.ReviewItemTitle;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u0005²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/submitreviews/SubmitReviewContract$ViewState;", "viewState", "", "shouldFocusTnC", "tnCAgreed", "ratings-and-reviews_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubmitReviewScreenKt {
    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1183439535);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ProgressIndicatorKt.b(BitmapDescriptorFactory.HUE_RED, 0, 0, 30, 0L, 0L, composerImplV, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.e));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(i, 2);
        }
    }

    public static final void b(SubmitReviewFormViewModel submitReviewFormViewModel, ArrayList arrayList, boolean z, int i, Composer composer, int i2) {
        int i3;
        Modifier.Companion companion;
        FocusRequester focusRequester;
        int i4;
        float f;
        final SoftwareKeyboardController softwareKeyboardController;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        final FocusManager focusManager;
        SoftwareKeyboardController softwareKeyboardController2;
        boolean z2;
        final SubmitReviewFormViewModel submitReviewFormViewModel2 = submitReviewFormViewModel;
        ComposerImpl composerImplV = composer.v(-1916368886);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? composerImplV.n(submitReviewFormViewModel2) : composerImplV.I(submitReviewFormViewModel2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(arrayList) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.r(i) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FocusManager focusManager2 = (FocusManager) composerImplV.x(CompositionLocalsKt.i);
            SoftwareKeyboardController softwareKeyboardController3 = (SoftwareKeyboardController) composerImplV.x(CompositionLocalsKt.p);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                objG = new FocusRequester();
                composerImplV.A(objG);
            }
            FocusRequester focusRequester2 = (FocusRequester) objG;
            composerImplV.V(false);
            float f2 = 16;
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, 7);
            Modifier.Companion companion3 = companion2;
            float f3 = f2;
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.i(24, Alignment.Companion.j), Alignment.Companion.m, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            FocusManager focusManager3 = focusManager2;
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
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-1743077088);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ReviewInputItems reviewInputItems = (ReviewInputItems) it.next();
                if (reviewInputItems instanceof ReviewItemTitle) {
                    composerImplV.o(928227850);
                    Modifier modifierI = PaddingKt.i(FocusableKt.a(FocusRequesterModifierKt.a(companion3, focusRequester2), true, null), f3, f3, f3, 8);
                    composerImplV.o(-1633490746);
                    int i6 = i3 & 7168;
                    boolean z3 = i6 == 2048;
                    Object objG2 = composerImplV.G();
                    if (z3 || objG2 == composer$Companion$Empty$12) {
                        objG2 = new au.com.woolworths.markdown.compat.c(i, 3);
                        composerImplV.A(objG2);
                    }
                    composerImplV.V(false);
                    FocusRequester focusRequester3 = focusRequester2;
                    Composer$Companion$Empty$1 composer$Companion$Empty$13 = composer$Companion$Empty$12;
                    ComposerImpl composerImpl = composerImplV;
                    SoftwareKeyboardController softwareKeyboardController4 = softwareKeyboardController3;
                    companion = companion3;
                    TextKt.b(((ReviewItemTitle) reviewInputItems).f12752a, SemanticsModifierKt.b(modifierI, false, (Function1) objG2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).i, composerImpl, 0, 0, 65532);
                    composerImplV = composerImpl;
                    Integer numValueOf = Integer.valueOf(i);
                    composerImplV.o(-1746271574);
                    boolean z4 = (i6 == 2048) | ((i3 & 896) == 256);
                    Object objG3 = composerImplV.G();
                    if (z4 || objG3 == composer$Companion$Empty$13) {
                        objG3 = new SubmitReviewScreenKt$ReviewFormItems$1$1$2$1(i, z, focusRequester3, null);
                        composerImplV.A(objG3);
                    }
                    composerImplV.V(false);
                    EffectsKt.e(composerImplV, numValueOf, (Function2) objG3);
                    composerImplV.V(false);
                    i4 = i3;
                    f = f3;
                    focusRequester = focusRequester3;
                    softwareKeyboardController = softwareKeyboardController4;
                    composer$Companion$Empty$1 = composer$Companion$Empty$13;
                    focusManager = focusManager3;
                } else {
                    companion = companion3;
                    SoftwareKeyboardController softwareKeyboardController5 = softwareKeyboardController3;
                    focusRequester = focusRequester2;
                    if (reviewInputItems instanceof ReviewInputItemRating) {
                        composerImplV.o(929308045);
                        ReviewInputItemRating reviewInputItemRating = (ReviewInputItemRating) reviewInputItems;
                        String str = reviewInputItemRating.f12750a;
                        Integer num = reviewInputItemRating.b;
                        int iIntValue = num != null ? num.intValue() : 0;
                        String str2 = reviewInputItemRating.c;
                        composerImplV.o(5004770);
                        boolean z5 = (i3 & 14) == 4 || ((i3 & 8) != 0 && composerImplV.I(submitReviewFormViewModel2));
                        Object objG4 = composerImplV.G();
                        if (z5 || objG4 == composer$Companion$Empty$12) {
                            softwareKeyboardController2 = softwareKeyboardController5;
                            i4 = i3;
                            f = f3;
                            z2 = false;
                            SubmitReviewScreenKt$ReviewFormItems$1$1$3$1 submitReviewScreenKt$ReviewFormItems$1$1$3$1 = new SubmitReviewScreenKt$ReviewFormItems$1$1$3$1(1, submitReviewFormViewModel, SubmitReviewFormViewModel.class, "onRatingChanged", "onRatingChanged(I)V", 0);
                            submitReviewFormViewModel2 = submitReviewFormViewModel;
                            composerImplV.A(submitReviewScreenKt$ReviewFormItems$1$1$3$1);
                            objG4 = submitReviewScreenKt$ReviewFormItems$1$1$3$1;
                        } else {
                            i4 = i3;
                            f = f3;
                            softwareKeyboardController2 = softwareKeyboardController5;
                            z2 = false;
                        }
                        composerImplV.V(z2);
                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                        softwareKeyboardController = softwareKeyboardController2;
                        focusManager = focusManager3;
                        RatingSubmissionKt.b(str, iIntValue, null, str2, (Function1) ((KFunction) objG4), composerImplV, 0, 4);
                        composerImplV.V(z2);
                    } else {
                        i4 = i3;
                        f = f3;
                        softwareKeyboardController = softwareKeyboardController5;
                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                        focusManager = focusManager3;
                        if (reviewInputItems instanceof ReviewInputItemTitleField) {
                            composerImplV.o(929676077);
                            final ReviewInputItemTitleField reviewInputItemTitleField = (ReviewInputItemTitleField) reviewInputItems;
                            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(934614377, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$ReviewFormItems$1$1$4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer2 = (Composer) obj;
                                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        ReviewInputItemTitleField reviewInputItemTitleField2 = reviewInputItemTitleField;
                                        String str3 = reviewInputItemTitleField2.f12751a;
                                        String str4 = reviewInputItemTitleField2.f;
                                        String str5 = reviewInputItemTitleField2.g;
                                        String str6 = reviewInputItemTitleField2.e;
                                        String str7 = reviewInputItemTitleField2.h;
                                        boolean z6 = reviewInputItemTitleField2.i;
                                        int i7 = reviewInputItemTitleField2.d;
                                        composer2.o(5004770);
                                        SubmitReviewFormViewModel submitReviewFormViewModel3 = submitReviewFormViewModel2;
                                        boolean zI = composer2.I(submitReviewFormViewModel3);
                                        Object objG5 = composer2.G();
                                        Composer$Companion$Empty$1 composer$Companion$Empty$14 = Composer.Companion.f1624a;
                                        if (zI || objG5 == composer$Companion$Empty$14) {
                                            SubmitReviewScreenKt$ReviewFormItems$1$1$4$1$1 submitReviewScreenKt$ReviewFormItems$1$1$4$1$1 = new SubmitReviewScreenKt$ReviewFormItems$1$1$4$1$1(1, submitReviewFormViewModel3, SubmitReviewFormViewModel.class, "onReviewTitleChanged", "onReviewTitleChanged(Ljava/lang/String;)V", 0);
                                            composer2.A(submitReviewScreenKt$ReviewFormItems$1$1$4$1$1);
                                            objG5 = submitReviewScreenKt$ReviewFormItems$1$1$4$1$1;
                                        }
                                        composer2.l();
                                        Function1 function1 = (Function1) ((KFunction) objG5);
                                        composer2.o(5004770);
                                        SubmitReviewFormViewModel submitReviewFormViewModel4 = submitReviewFormViewModel2;
                                        boolean zI2 = composer2.I(submitReviewFormViewModel4);
                                        Object objG6 = composer2.G();
                                        if (zI2 || objG6 == composer$Companion$Empty$14) {
                                            objG6 = new SubmitReviewScreenKt$ReviewFormItems$1$1$4$2$1(0, submitReviewFormViewModel4, SubmitReviewFormViewModel.class, "onReviewTitleFocusLost", "onReviewTitleFocusLost()V", 0);
                                            composer2.A(objG6);
                                        }
                                        composer2.l();
                                        Function0 function02 = (Function0) ((KFunction) objG6);
                                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, 6, 119);
                                        composer2.o(5004770);
                                        FocusManager focusManager4 = focusManager;
                                        boolean zI3 = composer2.I(focusManager4);
                                        Object objG7 = composer2.G();
                                        if (zI3 || objG7 == composer$Companion$Empty$14) {
                                            objG7 = new au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.c(focusManager4, 1);
                                            composer2.A(objG7);
                                        }
                                        composer2.l();
                                        ReviewTextFieldKt.a(str3, str4, str5, str6, str7, z6, i7, true, function1, function02, keyboardOptions, new KeyboardActions(null, (Function1) objG7, null, 59), composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composerImplV));
                            composerImplV.V(false);
                        } else if (reviewInputItems instanceof ReviewInputItemBodyField) {
                            composerImplV.o(930811855);
                            final ReviewInputItemBodyField reviewInputItemBodyField = (ReviewInputItemBodyField) reviewInputItems;
                            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-484709654, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$ReviewFormItems$1$1$5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer2 = (Composer) obj;
                                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        ReviewInputItemBodyField reviewInputItemBodyField2 = reviewInputItemBodyField;
                                        String str3 = reviewInputItemBodyField2.f12748a;
                                        String str4 = reviewInputItemBodyField2.f;
                                        String str5 = reviewInputItemBodyField2.g;
                                        String str6 = reviewInputItemBodyField2.e;
                                        String str7 = reviewInputItemBodyField2.h;
                                        boolean z6 = reviewInputItemBodyField2.i;
                                        int i7 = reviewInputItemBodyField2.d;
                                        composer2.o(5004770);
                                        SubmitReviewFormViewModel submitReviewFormViewModel3 = submitReviewFormViewModel2;
                                        boolean zI = composer2.I(submitReviewFormViewModel3);
                                        Object objG5 = composer2.G();
                                        Composer$Companion$Empty$1 composer$Companion$Empty$14 = Composer.Companion.f1624a;
                                        if (zI || objG5 == composer$Companion$Empty$14) {
                                            SubmitReviewScreenKt$ReviewFormItems$1$1$5$1$1 submitReviewScreenKt$ReviewFormItems$1$1$5$1$1 = new SubmitReviewScreenKt$ReviewFormItems$1$1$5$1$1(1, submitReviewFormViewModel3, SubmitReviewFormViewModel.class, "onReviewBodyChanged", "onReviewBodyChanged(Ljava/lang/String;)V", 0);
                                            composer2.A(submitReviewScreenKt$ReviewFormItems$1$1$5$1$1);
                                            objG5 = submitReviewScreenKt$ReviewFormItems$1$1$5$1$1;
                                        }
                                        composer2.l();
                                        Function1 function1 = (Function1) ((KFunction) objG5);
                                        composer2.o(5004770);
                                        SubmitReviewFormViewModel submitReviewFormViewModel4 = submitReviewFormViewModel2;
                                        boolean zI2 = composer2.I(submitReviewFormViewModel4);
                                        Object objG6 = composer2.G();
                                        if (zI2 || objG6 == composer$Companion$Empty$14) {
                                            objG6 = new SubmitReviewScreenKt$ReviewFormItems$1$1$5$2$1(0, submitReviewFormViewModel4, SubmitReviewFormViewModel.class, "onReviewBodyFocusLost", "onReviewBodyFocusLost()V", 0);
                                            composer2.A(objG6);
                                        }
                                        composer2.l();
                                        Function0 function02 = (Function0) ((KFunction) objG6);
                                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, 6, 119);
                                        composer2.o(5004770);
                                        FocusManager focusManager4 = focusManager;
                                        boolean zI3 = composer2.I(focusManager4);
                                        Object objG7 = composer2.G();
                                        if (zI3 || objG7 == composer$Companion$Empty$14) {
                                            objG7 = new au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.c(focusManager4, 2);
                                            composer2.A(objG7);
                                        }
                                        composer2.l();
                                        ReviewTextFieldKt.a(str3, str4, str5, str6, str7, z6, i7, false, function1, function02, keyboardOptions, new KeyboardActions(null, (Function1) objG7, null, 59), composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composerImplV));
                            composerImplV.V(false);
                        } else {
                            if (!(reviewInputItems instanceof ReviewInputItemNameField)) {
                                throw au.com.woolworths.android.onesite.a.w(-1909717595, composerImplV, false);
                            }
                            composerImplV.o(931947106);
                            final ReviewInputItemNameField reviewInputItemNameField = (ReviewInputItemNameField) reviewInputItems;
                            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(-1904033685, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$ReviewFormItems$1$1$6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Composer composer2 = (Composer) obj;
                                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        ReviewInputItemNameField reviewInputItemNameField2 = reviewInputItemNameField;
                                        String str3 = reviewInputItemNameField2.f12749a;
                                        String str4 = reviewInputItemNameField2.f;
                                        String str5 = reviewInputItemNameField2.g;
                                        String str6 = reviewInputItemNameField2.e;
                                        String str7 = reviewInputItemNameField2.h;
                                        boolean z6 = reviewInputItemNameField2.i;
                                        int i7 = reviewInputItemNameField2.d;
                                        composer2.o(5004770);
                                        SubmitReviewFormViewModel submitReviewFormViewModel3 = submitReviewFormViewModel2;
                                        boolean zI = composer2.I(submitReviewFormViewModel3);
                                        Object objG5 = composer2.G();
                                        Composer$Companion$Empty$1 composer$Companion$Empty$14 = Composer.Companion.f1624a;
                                        if (zI || objG5 == composer$Companion$Empty$14) {
                                            SubmitReviewScreenKt$ReviewFormItems$1$1$6$1$1 submitReviewScreenKt$ReviewFormItems$1$1$6$1$1 = new SubmitReviewScreenKt$ReviewFormItems$1$1$6$1$1(1, submitReviewFormViewModel3, SubmitReviewFormViewModel.class, "onReviewNameChanged", "onReviewNameChanged(Ljava/lang/String;)V", 0);
                                            composer2.A(submitReviewScreenKt$ReviewFormItems$1$1$6$1$1);
                                            objG5 = submitReviewScreenKt$ReviewFormItems$1$1$6$1$1;
                                        }
                                        composer2.l();
                                        Function1 function1 = (Function1) ((KFunction) objG5);
                                        composer2.o(5004770);
                                        SubmitReviewFormViewModel submitReviewFormViewModel4 = submitReviewFormViewModel2;
                                        boolean zI2 = composer2.I(submitReviewFormViewModel4);
                                        Object objG6 = composer2.G();
                                        if (zI2 || objG6 == composer$Companion$Empty$14) {
                                            SubmitReviewScreenKt$ReviewFormItems$1$1$6$2$1 submitReviewScreenKt$ReviewFormItems$1$1$6$2$1 = new SubmitReviewScreenKt$ReviewFormItems$1$1$6$2$1(0, submitReviewFormViewModel4, SubmitReviewFormViewModel.class, "onReviewNameFocusLost", "onReviewNameFocusLost()V", 0);
                                            composer2.A(submitReviewScreenKt$ReviewFormItems$1$1$6$2$1);
                                            objG6 = submitReviewScreenKt$ReviewFormItems$1$1$6$2$1;
                                        }
                                        composer2.l();
                                        Function0 function02 = (Function0) ((KFunction) objG6);
                                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, 7, 119);
                                        composer2.o(-1633490746);
                                        SoftwareKeyboardController softwareKeyboardController6 = softwareKeyboardController;
                                        boolean zN = composer2.n(softwareKeyboardController6);
                                        FocusManager focusManager4 = focusManager;
                                        boolean zI3 = zN | composer2.I(focusManager4);
                                        Object objG7 = composer2.G();
                                        if (zI3 || objG7 == composer$Companion$Empty$14) {
                                            objG7 = new l(21, softwareKeyboardController6, focusManager4);
                                            composer2.A(objG7);
                                        }
                                        composer2.l();
                                        ReviewTextFieldKt.a(str3, str4, str5, str6, str7, z6, i7, true, function1, function02, keyboardOptions, new KeyboardActions((Function1) objG7, null, null, 62), composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composerImplV));
                            composerImplV.V(false);
                        }
                    }
                }
                softwareKeyboardController3 = softwareKeyboardController;
                focusManager3 = focusManager;
                i3 = i4;
                f3 = f;
                focusRequester2 = focusRequester;
                composer$Companion$Empty$12 = composer$Companion$Empty$1;
                companion3 = companion;
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new o(submitReviewFormViewModel2, arrayList, z, i, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0367  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel r41, java.util.List r42, androidx.compose.foundation.layout.PaddingValues r43, int r44, androidx.compose.runtime.Composer r45, int r46) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt.c(au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel, java.util.List, androidx.compose.foundation.layout.PaddingValues, int, androidx.compose.runtime.Composer, int):void");
    }

    public static final void d(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(580837231);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            SpacerKt.a(composerImplV, BackgroundKt.b(SizeKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 8), WxTheme.a(composerImplV).b(), RectangleShapeKt.f1779a));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.b(i, 1);
        }
    }

    public static final void e(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        ComposerImpl composerImplV = composer.v(951282570);
        int i2 = i | (composerImplV.n(str) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FocusManager focusManager = (FocusManager) composerImplV.x(CompositionLocalsKt.i);
            Modifier modifierB = BackgroundKt.b(SizeKt.e(modifier, 1.0f), WxTheme.a(composerImplV).a(), RectangleShapeKt.f1779a);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
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
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, KyberEngine.KyberPolyBytes, 3, 0L, composerImplV, null);
            Modifier modifierG = PaddingKt.g(SizeKt.e(Modifier.Companion.d, 1.0f), 16, 12);
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(focusManager) | ((i2 & 112) == 32);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.checkout.ui.details.c(23, focusManager, function0);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            composerImplV = composerImplV;
            PrimaryButtonKt.a(str, (Function0) objG, modifierG, false, false, null, null, null, ComposableSingletons$SubmitReviewScreenKt.f12782a, composerImplV, (i2 & 14) | 805306368, 504);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.aem.components.ui.morecard.a(str, function0, modifier, i, 2);
        }
    }

    public static final void f(SubmitReviewViewModel submitReviewViewModel, Function0 onNavigateUp, Composer composer, int i) {
        SubmitReviewViewModel submitReviewViewModel2;
        Function0 function0;
        SnackbarHostState snackbarHostState;
        ComposerImpl composerImpl;
        SubmitReviewViewModel viewModel = submitReviewViewModel;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(onNavigateUp, "onNavigateUp");
        ComposerImpl composerImplV = composer.v(-605860781);
        int i2 = (composerImplV.n(viewModel) ? 4 : 2) | i | (composerImplV.I(onNavigateUp) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function0 = onNavigateUp;
            composerImpl = composerImplV;
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objG;
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new SnackbarHostState();
                composerImplV.A(objG2);
            }
            SnackbarHostState snackbarHostState2 = (SnackbarHostState) objG2;
            composerImplV.V(false);
            Flow flow = viewModel.i;
            composerImplV.o(-1224400529);
            int i3 = i2 & 14;
            boolean zI = ((i2 & 112) == 32) | (i3 == 4) | composerImplV.I(coroutineScope);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                submitReviewViewModel2 = submitReviewViewModel;
                SubmitReviewScreenKt$SubmitReviewScreen$1$1 submitReviewScreenKt$SubmitReviewScreen$1$1 = new SubmitReviewScreenKt$SubmitReviewScreen$1$1(submitReviewViewModel2, onNavigateUp, coroutineScope, snackbarHostState2, null);
                function0 = onNavigateUp;
                snackbarHostState = snackbarHostState2;
                composerImplV.A(submitReviewScreenKt$SubmitReviewScreen$1$1);
                objG3 = submitReviewScreenKt$SubmitReviewScreen$1$1;
            } else {
                submitReviewViewModel2 = viewModel;
                function0 = onNavigateUp;
                snackbarHostState = snackbarHostState2;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG3);
            MutableState mutableStateA = FlowExtKt.a(submitReviewViewModel2.k, composerImplV);
            composerImplV.o(5004770);
            boolean z = i3 == 4;
            Object objG4 = composerImplV.G();
            if (z || objG4 == composer$Companion$Empty$1) {
                objG4 = new SubmitReviewScreenKt$SubmitReviewScreen$2$1(0, submitReviewViewModel, SubmitReviewViewModel.class, "onBackButtonPressed", "onBackButtonPressed()V", 0);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            viewModel = submitReviewViewModel;
            composerImpl = composerImplV;
            g(viewModel, (Function0) ((KFunction) objG4), (SubmitReviewContract.ViewState) mutableStateA.getD(), snackbarHostState, composerImpl, i3 | 3072);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.productcard.ui.components.b(viewModel, i, 4, function0);
        }
    }

    public static final void g(final SubmitReviewFormViewModel submitReviewFormViewModel, final Function0 function0, final SubmitReviewContract.ViewState viewState, final SnackbarHostState snackbarHostState, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-622970613);
        int i2 = (composerImplV.n(submitReviewFormViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(viewState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(snackbarHostState) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImpl = composerImplV;
            ScaffoldKt.a(null, null, ComposableLambdaKt.c(2112449424, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$SubmitReviewScreenUI$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String title = viewState.getTitle();
                        long jC = WxTheme.a(composer2).c();
                        final Function0 function02 = function0;
                        TopNavBarKt.b(title, null, null, null, 0L, 0L, jC, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-898216671, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$SubmitReviewScreenUI$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    IconButtonKt.c(ArrowBackKt.a(), StringResources_androidKt.c(composer3, R.string.content_description_back_button), function02, null, false, WxTheme.a(composer3).h(), composer3, 0, 24);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 805306368, 0, 1470);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-1753778493, new Function3<SnackbarHostState, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$SubmitReviewScreenUI$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    SnackbarHostState it = (SnackbarHostState) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(it, "it");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        SnackbarHostKt.b(snackbarHostState, null, null, composer2, 0, 6);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, 0, 0L, 0L, ComposableLambdaKt.c(-1712321514, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$SubmitReviewScreenUI$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        SubmitReviewContract.ViewState viewState2 = viewState;
                        SubmitReviewContract.ViewState.Content content = viewState2 instanceof SubmitReviewContract.ViewState.Content ? (SubmitReviewContract.ViewState.Content) viewState2 : null;
                        WriteReviewFormData writeReviewFormData = content != null ? content.f12772a : null;
                        if (writeReviewFormData != null) {
                            Modifier modifierD = WindowInsetsPaddingKt.d(Modifier.Companion.d, WindowInsets_androidKt.a(composer2));
                            String label = writeReviewFormData.c.getLabel();
                            composer2.o(5004770);
                            SubmitReviewFormViewModel submitReviewFormViewModel2 = submitReviewFormViewModel;
                            boolean zI = composer2.I(submitReviewFormViewModel2);
                            Object objG = composer2.G();
                            if (zI || objG == Composer.Companion.f1624a) {
                                objG = new c(submitReviewFormViewModel2, 1);
                                composer2.A(objG);
                            }
                            composer2.l();
                            SubmitReviewScreenKt.e(0, composer2, modifierD, label, (Function0) objG);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, ComposableLambdaKt.c(-1632433918, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt$SubmitReviewScreenUI$4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    PaddingValues paddingValues = (PaddingValues) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        SubmitReviewContract.ViewState viewState2 = viewState;
                        if (viewState2 instanceof SubmitReviewContract.ViewState.InProgress) {
                            composer2.o(75947957);
                            SubmitReviewScreenKt.a(composer2, 0);
                            composer2.l();
                        } else {
                            boolean z = viewState2 instanceof SubmitReviewContract.ViewState.Content;
                            SubmitReviewFormViewModel submitReviewFormViewModel2 = submitReviewFormViewModel;
                            if (z) {
                                composer2.o(76081722);
                                List list = ((SubmitReviewContract.ViewState.Content) viewState2).f12772a.b;
                                WriteReviewFormData writeReviewFormData = ((SubmitReviewContract.ViewState.Content) viewState2).f12772a;
                                SubmitReviewScreenKt.c(submitReviewFormViewModel, list, paddingValues, writeReviewFormData != null ? writeReviewFormData.d : 0, composer2, (iIntValue << 6) & 896);
                                WriteReviewFormData writeReviewFormData2 = ((SubmitReviewContract.ViewState.Content) viewState2).f12772a;
                                if (writeReviewFormData2 != null ? writeReviewFormData2.e : false) {
                                    composer2.o(1849434622);
                                    Object objG = composer2.G();
                                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                    if (objG == composer$Companion$Empty$1) {
                                        objG = new au.com.woolworths.shop.product.details.ui.a(24);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    Modifier modifierB = SemanticsModifierKt.b(Modifier.Companion.d, true, (Function1) objG);
                                    composer2.o(5004770);
                                    SubmitReviewFormViewModel submitReviewFormViewModel3 = submitReviewFormViewModel;
                                    boolean zI = composer2.I(submitReviewFormViewModel3);
                                    Object objG2 = composer2.G();
                                    if (zI || objG2 == composer$Companion$Empty$1) {
                                        SubmitReviewScreenKt$SubmitReviewScreenUI$4$2$1 submitReviewScreenKt$SubmitReviewScreenUI$4$2$1 = new SubmitReviewScreenKt$SubmitReviewScreenUI$4$2$1(0, submitReviewFormViewModel3, SubmitReviewFormViewModel.class, "onSubmissionErrorDialogDismiss", "onSubmissionErrorDialogDismiss()V", 0);
                                        composer2.A(submitReviewScreenKt$SubmitReviewScreenUI$4$2$1);
                                        objG2 = submitReviewScreenKt$SubmitReviewScreenUI$4$2$1;
                                    }
                                    KFunction kFunction = (KFunction) objG2;
                                    composer2.l();
                                    String strC = StringResources_androidKt.c(composer2, R.string.review_submission_failure_conformation_button_label);
                                    composer2.o(5004770);
                                    SubmitReviewFormViewModel submitReviewFormViewModel4 = submitReviewFormViewModel;
                                    boolean zI2 = composer2.I(submitReviewFormViewModel4);
                                    Object objG3 = composer2.G();
                                    if (zI2 || objG3 == composer$Companion$Empty$1) {
                                        SubmitReviewScreenKt$SubmitReviewScreenUI$4$3$1 submitReviewScreenKt$SubmitReviewScreenUI$4$3$1 = new SubmitReviewScreenKt$SubmitReviewScreenUI$4$3$1(0, submitReviewFormViewModel4, SubmitReviewFormViewModel.class, "onSubmissionErrorDialogDismiss", "onSubmissionErrorDialogDismiss()V", 0);
                                        composer2.A(submitReviewScreenKt$SubmitReviewScreenUI$4$3$1);
                                        objG3 = submitReviewScreenKt$SubmitReviewScreenUI$4$3$1;
                                    }
                                    composer2.l();
                                    AlertDialog.f5143a.b((Function0) kFunction, strC, (Function0) ((KFunction) objG3), modifierB, StringResources_androidKt.c(composer2, R.string.review_submission_failure_title), StringResources_androidKt.c(composer2, R.string.review_submission_failure_text), 0L, 0L, composer2, 0, 448);
                                    composer2 = composer2;
                                    submitReviewFormViewModel2.w5(StringResources_androidKt.c(composer2, R.string.review_submission_failure_title));
                                }
                                composer2.l();
                            } else if (viewState2 instanceof SubmitReviewContract.ViewState.Failure) {
                                composer2.o(77226614);
                                Context context = (Context) composer2.x(AndroidCompositionLocals_androidKt.b);
                                SubmitReviewContract.ViewState.Failure failure = (SubmitReviewContract.ViewState.Failure) viewState2;
                                Text text = failure.b;
                                FullPageMessageUiKt.a(FullPageMessageSpec.Companion.a(failure.f12774a, text.getText(context).toString(), failure.c.getText(context).toString(), failure.d, composer2, 1572864, 6), null, null, composer2, 0, 6);
                                FullPageMessage.Error error = failure.f12774a;
                                if (error instanceof FullPageMessage.Error.ServerError) {
                                    submitReviewFormViewModel2.X3(StringResources_androidKt.c(composer2, R.string.default_server_error_description));
                                } else {
                                    if (!(error instanceof FullPageMessage.Error.ConnectionError)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    submitReviewFormViewModel2.X3(text.getText(context).toString());
                                }
                                composer2.l();
                            } else {
                                if (!(viewState2 instanceof SubmitReviewContract.ViewState.DuplicateFailure)) {
                                    throw au.com.woolworths.android.onesite.a.x(composer2, -1105928106);
                                }
                                composer2.o(78400026);
                                FullPageMessageUiKt.a(FullPageMessageSpec.Companion.e(PainterResources_androidKt.a(R.drawable.review_duplicate_alert, 0, composer2), StringResources_androidKt.c(composer2, R.string.submit_review_duplicate_alert_title), StringResources_androidKt.c(composer2, R.string.submit_review_duplicate_alert_body), StringResources_androidKt.c(composer2, R.string.submit_review_duplicate_alert_go_back_button), function0, composer2, 2), null, null, composer2, 0, 6);
                                composer2.l();
                            }
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 100666752, 755);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(submitReviewFormViewModel, function0, viewState, snackbarHostState, i, 21);
        }
    }
}

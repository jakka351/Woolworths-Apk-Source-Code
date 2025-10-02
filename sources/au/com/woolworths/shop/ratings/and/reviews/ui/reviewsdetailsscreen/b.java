package au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen;

import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.core.graphics.Insets;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.SubmitReviewScreenKt;
import au.com.woolworths.shop.receipts.ui.ReceiptListItemUIKt;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt;
import com.apollographql.apollo.api.CombinedExecutionContext;
import com.apollographql.apollo.api.EmptyExecutionContext;
import com.apollographql.apollo.api.ExecutionContext;
import com.woolworths.scanlibrary.ui.checkout.CheckOutActivity;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeActivity;
import com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountActivity;
import com.woolworths.scanlibrary.ui.message.MessageActivity;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingActivity;
import com.woolworths.scanlibrary.ui.productInfo.ProductInfoActivity;
import com.woolworths.scanlibrary.ui.productsearch.SearchActivity;
import com.woolworths.scanlibrary.ui.splash.SplashPresenter;
import com.woolworths.scanlibrary.ui.transaction.TransactionListActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersCacheKt;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        final int i2 = 1;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ReviewsDetailsScreenKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                SubmitReviewScreenKt.d((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 2:
                ((Integer) obj2).getClass();
                SubmitReviewScreenKt.a((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 3:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 4:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 5:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                return unit;
            case 6:
                ((Integer) obj2).getClass();
                ReceiptListItemUIKt.b((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 7:
                ((Integer) obj2).getClass();
                ReceiptListScreenKt.b((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 8:
                ((Integer) obj2).getClass();
                SpecialsHomeScreenKt.d((Composer) obj, RecomposeScopeImplKt.a(1));
                return unit;
            case 9:
                ExecutionContext acc = (ExecutionContext) obj;
                ExecutionContext.Element element = (ExecutionContext.Element) obj2;
                Intrinsics.h(acc, "acc");
                Intrinsics.h(element, "element");
                ExecutionContext executionContextA = acc.a(element.getKey());
                return executionContextA == EmptyExecutionContext.f13513a ? element : new CombinedExecutionContext(executionContextA, element);
            case 10:
                ViewGroup.MarginLayoutParams applyInsets = (ViewGroup.MarginLayoutParams) obj;
                Insets it = (Insets) obj2;
                int i3 = CheckOutActivity.L;
                Intrinsics.h(applyInsets, "$this$applyInsets");
                Intrinsics.h(it, "it");
                applyInsets.topMargin = it.b;
                applyInsets.bottomMargin = it.d;
                return unit;
            case 11:
                ViewGroup.MarginLayoutParams applyInsets2 = (ViewGroup.MarginLayoutParams) obj;
                Insets it2 = (Insets) obj2;
                int i4 = ExitScanCodeActivity.I;
                Intrinsics.h(applyInsets2, "$this$applyInsets");
                Intrinsics.h(it2, "it");
                applyInsets2.bottomMargin = it2.d;
                applyInsets2.topMargin = it2.b;
                return unit;
            case 12:
                ViewGroup.MarginLayoutParams applyInsets3 = (ViewGroup.MarginLayoutParams) obj;
                Insets it3 = (Insets) obj2;
                int i5 = MyAccountActivity.J;
                Intrinsics.h(applyInsets3, "$this$applyInsets");
                Intrinsics.h(it3, "it");
                applyInsets3.topMargin = it3.b;
                return unit;
            case 13:
                ViewGroup.MarginLayoutParams applyInsets4 = (ViewGroup.MarginLayoutParams) obj;
                Insets it4 = (Insets) obj2;
                Intrinsics.h(applyInsets4, "$this$applyInsets");
                Intrinsics.h(it4, "it");
                applyInsets4.topMargin = it4.b;
                return unit;
            case 14:
                ViewGroup.MarginLayoutParams applyInsets5 = (ViewGroup.MarginLayoutParams) obj;
                Insets it5 = (Insets) obj2;
                int i6 = MessageActivity.J;
                Intrinsics.h(applyInsets5, "$this$applyInsets");
                Intrinsics.h(it5, "it");
                applyInsets5.bottomMargin = it5.d;
                return unit;
            case 15:
                ViewGroup.MarginLayoutParams applyInsets6 = (ViewGroup.MarginLayoutParams) obj;
                Insets it6 = (Insets) obj2;
                int i7 = OnBoardingActivity.K;
                Intrinsics.h(applyInsets6, "$this$applyInsets");
                Intrinsics.h(it6, "it");
                applyInsets6.topMargin = it6.b;
                applyInsets6.bottomMargin = it6.d;
                return unit;
            case 16:
                ViewGroup.MarginLayoutParams applyInsets7 = (ViewGroup.MarginLayoutParams) obj;
                Insets it7 = (Insets) obj2;
                int i8 = ProductInfoActivity.K;
                Intrinsics.h(applyInsets7, "$this$applyInsets");
                Intrinsics.h(it7, "it");
                applyInsets7.topMargin = it7.b;
                applyInsets7.bottomMargin = it7.d;
                return unit;
            case 17:
                ViewGroup.MarginLayoutParams applyInsets8 = (ViewGroup.MarginLayoutParams) obj;
                Insets it8 = (Insets) obj2;
                int i9 = SearchActivity.M;
                Intrinsics.h(applyInsets8, "$this$applyInsets");
                Intrinsics.h(it8, "it");
                applyInsets8.topMargin = it8.b;
                applyInsets8.bottomMargin = it8.d;
                return unit;
            case 18:
                ((Boolean) obj).booleanValue();
                SplashPresenter.PostInitResult t2 = (SplashPresenter.PostInitResult) obj2;
                Intrinsics.h(t2, "t2");
                return t2;
            case 19:
                ViewGroup.MarginLayoutParams applyInsets9 = (ViewGroup.MarginLayoutParams) obj;
                Insets it9 = (Insets) obj2;
                int i10 = TransactionListActivity.J;
                Intrinsics.h(applyInsets9, "$this$applyInsets");
                Intrinsics.h(it9, "it");
                applyInsets9.topMargin = it9.b;
                return unit;
            case 20:
                String acc2 = (String) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                Intrinsics.h(acc2, "acc");
                Intrinsics.h(element2, "element");
                if (acc2.length() == 0) {
                    return element2.toString();
                }
                return acc2 + ", " + element2;
            case 21:
                return new Pair(obj, obj2);
            case 22:
                KClass clazz = (KClass) obj;
                final List types = (List) obj2;
                SerializerCache serializerCache = SerializersCacheKt.f24752a;
                Intrinsics.h(clazz, "clazz");
                Intrinsics.h(types, "types");
                ArrayList arrayListF = SerializersKt.f(SerializersModuleKt.f24879a, types, true);
                Intrinsics.e(arrayListF);
                final int i11 = 0;
                return SerializersKt.a(clazz, arrayListF, new Function0() { // from class: kotlinx.serialization.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i12 = i11;
                        List list = types;
                        switch (i12) {
                            case 0:
                                SerializerCache serializerCache2 = SerializersCacheKt.f24752a;
                                break;
                            default:
                                SerializerCache serializerCache3 = SerializersCacheKt.f24752a;
                                break;
                        }
                        return ((KType) list.get(0)).e();
                    }
                });
            default:
                KClass clazz2 = (KClass) obj;
                final List types2 = (List) obj2;
                SerializerCache serializerCache2 = SerializersCacheKt.f24752a;
                Intrinsics.h(clazz2, "clazz");
                Intrinsics.h(types2, "types");
                ArrayList arrayListF2 = SerializersKt.f(SerializersModuleKt.f24879a, types2, true);
                Intrinsics.e(arrayListF2);
                KSerializer kSerializerA = SerializersKt.a(clazz2, arrayListF2, new Function0() { // from class: kotlinx.serialization.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i12 = i2;
                        List list = types2;
                        switch (i12) {
                            case 0:
                                SerializerCache serializerCache22 = SerializersCacheKt.f24752a;
                                break;
                            default:
                                SerializerCache serializerCache3 = SerializersCacheKt.f24752a;
                                break;
                        }
                        return ((KType) list.get(0)).e();
                    }
                });
                if (kSerializerA != null) {
                    return BuiltinSerializersKt.d(kSerializerA);
                }
                return null;
        }
    }
}

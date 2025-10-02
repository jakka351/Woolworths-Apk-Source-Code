package au.com.woolworths.shop.ratingsandreviews.ui.shared;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.shop.receipts.data.ReceiptListItem;
import au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import com.halilibo.richtext.markdown.node.AstNode;
import com.halilibo.richtext.ui.string.InlineContent;
import com.woolworths.scanlibrary.data.launch.ScanAndGoUserData;
import com.woolworths.scanlibrary.domain.exit.GetFireStoreAccessUC;
import com.woolworths.scanlibrary.domain.locator.GetStoreDetailsUseCase;
import com.woolworths.scanlibrary.domain.locator.GetTapOnStoreDetailsUseCase;
import com.woolworths.scanlibrary.domain.login.GetProfileUC;
import com.woolworths.scanlibrary.domain.login.RewardSignInPreAuthUC;
import com.woolworths.scanlibrary.domain.login.SignoutUC;
import com.woolworths.scanlibrary.domain.login.TermsNConditionUC;
import com.woolworths.scanlibrary.domain.payment.MakePaymentUC;
import com.woolworths.scanlibrary.models.authentication.AuthResponse;
import com.woolworths.scanlibrary.models.authentication.Banner;
import com.woolworths.scanlibrary.models.authentication.SignoutResponse;
import com.woolworths.scanlibrary.models.authentication.Token;
import com.woolworths.scanlibrary.models.authentication.firestore.FireStoreAccessResponse;
import com.woolworths.scanlibrary.models.authentication.guest.GuestLoginResponse;
import com.woolworths.scanlibrary.models.authentication.reward.RewardSignInPreAuthResponse;
import com.woolworths.scanlibrary.models.payment.PaymentResponse;
import com.woolworths.scanlibrary.models.product.search.AutoCompleteResponse;
import com.woolworths.scanlibrary.models.profile.ProfileResponse;
import com.woolworths.scanlibrary.models.store.Store;
import com.woolworths.scanlibrary.models.tapon.TapOnResponse;
import io.reactivex.Single;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import retrofit2.HttpException;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.d;
        List list = null;
        byte b = 0;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.g(semantics);
                return unit;
            case 1:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                SemanticsPropertiesKt.g(semantics2);
                return unit;
            case 2:
                Intrinsics.h((ReceiptListItem) obj, "it");
                return unit;
            case 3:
                ReceiptRowEntry it = (ReceiptRowEntry) obj;
                float f = ReceiptListScreenKt.f12881a;
                Intrinsics.h(it, "it");
                return it.getF12876a();
            case 4:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.u(semantics3);
                return unit;
            case 5:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsProperties_androidKt.a(semantics4);
                return unit;
            case 6:
                Throwable it2 = (Throwable) obj;
                Intrinsics.h(it2, "it");
                System.out.println((Object) "Apollo: unhandled exception");
                it2.printStackTrace();
                return unit;
            case 7:
                Intrinsics.h((Throwable) obj, "it");
                return unit;
            case 8:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics5, "$this$semantics");
                KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                semantics5.b(SemanticsProperties.h, unit);
                return unit;
            case 9:
                Density InlineContent = (Density) obj;
                Intrinsics.h(InlineContent, "$this$InlineContent");
                float f2 = 128;
                return new IntSize((InlineContent.r1(f2) << 32) | (InlineContent.r1(f2) & 4294967295L));
            case 10:
                AstNode it3 = (AstNode) obj;
                Intrinsics.h(it3, "it");
                return it3.b.e;
            case 11:
                AstNode it4 = (AstNode) obj;
                Intrinsics.h(it4, "it");
                return it4.b.d;
            case 12:
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.h(layout, "$this$layout");
                return unit;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.h(entry, "<destruct>");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                String strL = StringsKt.L("inline:", str);
                if (strL == str) {
                    strL = null;
                }
                if (strL == null) {
                    return null;
                }
                Intrinsics.f(value, "null cannot be cast to non-null type com.halilibo.richtext.ui.string.InlineContent");
                return new Pair(strL, (InlineContent) value);
            case 14:
                Intrinsics.h((TextLayoutResult) obj, "it");
                return unit;
            case 15:
                FireStoreAccessResponse it5 = (FireStoreAccessResponse) obj;
                Intrinsics.h(it5, "it");
                return new GetFireStoreAccessUC.ResponseValue(it5);
            case 16:
                Component component = (Component) obj;
                Intrinsics.h(component, "<destruct>");
                ScanAndGoUserData scanAndGoUserData = (ScanAndGoUserData) component.getData();
                Intrinsics.h(scanAndGoUserData, "<this>");
                return new Token(scanAndGoUserData.getAccessToken(), scanAndGoUserData.getRefreshToken(), scanAndGoUserData.getExpiresIn(), null, 8, null);
            case 17:
                Intrinsics.h((Store) obj, "response");
                return Single.e(new GetStoreDetailsUseCase.ResponseValue());
            case 18:
                TapOnResponse response = (TapOnResponse) obj;
                Intrinsics.h(response, "response");
                return Single.e(new GetTapOnStoreDetailsUseCase.ResponseValue(response));
            case 19:
                ProfileResponse response2 = (ProfileResponse) obj;
                Intrinsics.h(response2, "response");
                return Single.e(new GetProfileUC.ResponseValue(response2));
            case 20:
                RewardSignInPreAuthResponse it6 = (RewardSignInPreAuthResponse) obj;
                Intrinsics.h(it6, "it");
                String webLoginUrl = it6.getRewardsUrl();
                String authCode = it6.getTempToken();
                String redirectPattern = it6.getRedirectPattern();
                Intrinsics.h(webLoginUrl, "webLoginUrl");
                Intrinsics.h(authCode, "authCode");
                Intrinsics.h(redirectPattern, "redirectPattern");
                return new RewardSignInPreAuthUC.ResponseValue();
            case 21:
                return unit;
            case 22:
                return unit;
            case 23:
                GuestLoginResponse it7 = (GuestLoginResponse) obj;
                Intrinsics.h(it7, "it");
                return new AuthResponse("", null, null, null, null, null, null, null, null, null, null, null, null, null, "", null, null, null, null, null, null, "", it7.getAccessToken(), null, it7.getRefreshToken(), null, null, null, null, Banner.GUEST, 513785854, null);
            case 24:
                Intrinsics.h((SignoutResponse) obj, "it");
                return Single.e(new SignoutUC.ResponseValue());
            case 25:
                Intrinsics.h((ResponseBody) obj, "response");
                return Single.e(new TermsNConditionUC.ResponseValue());
            case 26:
                PaymentResponse response3 = (PaymentResponse) obj;
                Intrinsics.h(response3, "response");
                return Single.e(new MakePaymentUC.ResponseValue(response3));
            case 27:
                PaymentResponse response4 = (PaymentResponse) obj;
                Intrinsics.h(response4, "response");
                return Single.e(new MakePaymentUC.ResponseValue(response4));
            case 28:
                Throwable error = (Throwable) obj;
                Intrinsics.h(error, "error");
                if ((error instanceof HttpException) && ((HttpException) error).d == 401) {
                    throw error;
                }
                return new AutoCompleteResponse(list, 1, b == true ? 1 : 0);
            default:
                AutoCompleteResponse apiResponse = (AutoCompleteResponse) obj;
                Intrinsics.h(apiResponse, "apiResponse");
                return apiResponse.getSuggestions();
        }
    }
}

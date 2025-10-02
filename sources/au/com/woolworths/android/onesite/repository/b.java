package au.com.woolworths.android.onesite.repository;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.rewards.account.RewardsAccountInteractorImpl;
import au.com.woolworths.base.rewards.account.data.IconListItemAction;
import au.com.woolworths.base.rewards.account.ui.AccountHomeFooterItemKt;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import au.com.woolworths.design.core.ui.component.stable.CheckBoxState;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt;
import io.reactivex.Single;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;
import retrofit2.HttpException;
import retrofit2.Response;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                Result result = (Result) it;
                return result.b() ? Single.e(result.f4591a) : Single.c(result.b);
            case 1:
                Intrinsics.h(it, "it");
                return Result.Companion.b(it);
            case 2:
                Throwable it2 = (Throwable) it;
                Intrinsics.h(it2, "it");
                Timber.f27013a.p(it2);
                return Single.e(Result.Companion.a(it2));
            case 3:
                Response it3 = (Response) it;
                Intrinsics.h(it3, "it");
                okhttp3.Response response = it3.f27002a;
                if (response.g == 206) {
                    throw new HttpException(it3);
                }
                if (response.s) {
                    return it3.b;
                }
                throw new HttpException(it3);
            case 4:
                okhttp3.Response it4 = (okhttp3.Response) it;
                Intrinsics.h(it4, "it");
                return it4.m;
            case 5:
                return RewardsAccountInteractorImpl.getRewardsSignupDetails$lambda$1((Component) it);
            case 6:
                return AccountHomeFooterItemKt.AccountHomeFooterItem$lambda$1$lambda$0((IconListItemAction) it);
            case 7:
                JsonBuilder Json = (JsonBuilder) it;
                int i2 = FramesWebView.i;
                Intrinsics.h(Json, "$this$Json");
                Json.b = true;
                return unit;
            case 8:
                InspectorInfo composed = (InspectorInfo) it;
                Intrinsics.h(composed, "$this$composed");
                return unit;
            case 9:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) it;
                Intrinsics.h(semantics, "$this$semantics");
                return unit;
            case 10:
                ((Boolean) it).getClass();
                return unit;
            case 11:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) it;
                Intrinsics.h(semantics2, "$this$semantics");
                return unit;
            case 12:
                DrawScope M3LinearProgressIndicator = (DrawScope) it;
                Intrinsics.h(M3LinearProgressIndicator, "$this$M3LinearProgressIndicator");
                return unit;
            case 13:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) it;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.g(semantics3);
                return unit;
            case 14:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) it;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.v(semantics4, 2.0f);
                return unit;
            case 15:
                SemanticsPropertyReceiver semantics5 = (SemanticsPropertyReceiver) it;
                Intrinsics.h(semantics5, "$this$semantics");
                SemanticsPropertiesKt.u(semantics5);
                return unit;
            case 16:
                ((Integer) it).intValue();
                throw null;
            case 17:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
            case 18:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
            case 19:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
            case 20:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
            case 21:
                Intrinsics.h((TextLayoutResult) it, "it");
                return unit;
            case 22:
                SemanticsPropertyReceiver semantics6 = (SemanticsPropertyReceiver) it;
                float f = BroadcastBannerKt.f4745a;
                Intrinsics.h(semantics6, "$this$semantics");
                SemanticsPropertiesKt.u(semantics6);
                return unit;
            case 23:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
            case 24:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
            case 25:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
            case 26:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
            case 27:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
            case 28:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
            default:
                Intrinsics.h((CheckBoxState) it, "it");
                return unit;
        }
    }
}

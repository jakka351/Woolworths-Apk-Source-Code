package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentSender;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.appcompat.app.AlertDialog;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.base.wallet.digipay.framesview.CardDetails;
import au.com.woolworths.base.wallet.digipay.framesview.ClearFormCommand;
import au.com.woolworths.base.wallet.digipay.framesview.EpoxyCardCaptureFramesView;
import au.com.woolworths.base.wallet.digipay.framesview.InjectCardDetailsCommand;
import au.com.woolworths.base.wallet.digipay.framesview.JavaScriptCommand;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSubscribeAlertDialog;
import au.com.woolworths.feature.rewards.everydayextras.signup.databinding.LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding;
import au.com.woolworths.foundation.bark.Bark;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ EverydayExtraSummaryFragment e;

    public /* synthetic */ c(EverydayExtraSummaryFragment everydayExtraSummaryFragment, int i) {
        this.d = i;
        this.e = everydayExtraSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ActivityResultLauncher activityResultLauncher;
        EpoxyCardCaptureFramesView epoxyCardCaptureFramesView;
        EpoxyCardCaptureFramesView epoxyCardCaptureFramesView2;
        switch (this.d) {
            case 0:
                EverydayExtraSummaryFragment everydayExtraSummaryFragment = this.e;
                PendingIntent paymentCardRecognitionPendingIntent = ((PaymentCardRecognitionIntentResponse) obj).getPaymentCardRecognitionPendingIntent();
                try {
                    activityResultLauncher = everydayExtraSummaryFragment.n;
                } catch (IntentSender.SendIntentException e) {
                    Timber.f27013a.a("Failed to start payment card recognition.", e, new Object[0]);
                    everydayExtraSummaryFragment.Q1();
                }
                if (paymentCardRecognitionPendingIntent == null) {
                    Intrinsics.p("cardRecognitionPendingIntent");
                    throw null;
                }
                IntentSender intentSender = paymentCardRecognitionPendingIntent.getIntentSender();
                Intrinsics.g(intentSender, "getIntentSender(...)");
                activityResultLauncher.a(new IntentSenderRequest.Builder(intentSender).a(), null);
                everydayExtraSummaryFragment.I1().i.g(EdxSummaryAnalytics.Summary.Action.l);
                return Unit.f24250a;
            case 1:
                CardDetails it = (CardDetails) obj;
                Intrinsics.h(it, "it");
                LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding = this.e.k;
                if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding != null && (epoxyCardCaptureFramesView = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding.y) != null) {
                    JavaScriptCommand.a(new InjectCardDetailsCommand(StringsKt.n0("\n        frames.injectAction = async function() {\n            try {\n                await this.action.injectCardDetailsFromPciScopedRuntime(" + it + ");\n            } catch (error) {\n                android.handleUncaughtError(JSON.stringify(error))\n            }\n        };\n        \n        frames.injectAction();\n    ")), epoxyCardCaptureFramesView);
                }
                return Unit.f24250a;
            case 2:
                final EverydayExtraSubscribeAlertDialog it2 = (EverydayExtraSubscribeAlertDialog) obj;
                Intrinsics.h(it2, "it");
                final EverydayExtraSummaryFragment everydayExtraSummaryFragment2 = this.e;
                LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 = everydayExtraSummaryFragment2.k;
                if (layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2 != null && (epoxyCardCaptureFramesView2 = layoutEverydayExtrasWpaySchemeCardInputWebViewBinding2.y) != null) {
                    Bark.f8483a.a("Frames SDK: form cleared");
                    JavaScriptCommand.a(ClearFormCommand.b, epoxyCardCaptureFramesView2);
                }
                final int i = 0;
                AlertDialog.Builder positiveButton = new AlertDialog.Builder(everydayExtraSummaryFragment2.requireContext()).setTitle(it2.d).setMessage(it2.e).setPositiveButton(it2.f.getLabel(), new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        switch (i) {
                            case 0:
                                everydayExtraSummaryFragment2.I1().y6(it2.f);
                                dialogInterface.dismiss();
                                break;
                            default:
                                everydayExtraSummaryFragment2.I1().y6(it2.g);
                                dialogInterface.dismiss();
                                break;
                        }
                    }
                });
                ContentCta contentCta = it2.g;
                if (contentCta != null) {
                    final int i2 = 1;
                    positiveButton.setNegativeButton(contentCta.getLabel(), new DialogInterface.OnClickListener() { // from class: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.b
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i22) {
                            switch (i2) {
                                case 0:
                                    everydayExtraSummaryFragment2.I1().y6(it2.f);
                                    dialogInterface.dismiss();
                                    break;
                                default:
                                    everydayExtraSummaryFragment2.I1().y6(it2.g);
                                    dialogInterface.dismiss();
                                    break;
                            }
                        }
                    });
                }
                positiveButton.show();
                break;
            case 3:
                String it3 = (String) obj;
                Intrinsics.h(it3, "it");
                Context contextRequireContext = this.e.requireContext();
                Intrinsics.g(contextRequireContext, "requireContext(...)");
                ContextExtKt.e(contextRequireContext, it3);
                break;
            case 4:
                LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding it4 = (LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding) obj;
                Intrinsics.h(it4, "it");
                this.e.k = it4;
                break;
            default:
                EverydayExtrasChoosePlanContentItem.SubscribePlan it5 = (EverydayExtrasChoosePlanContentItem.SubscribePlan) obj;
                Intrinsics.h(it5, "it");
                EverydayExtraSummaryViewModel everydayExtraSummaryViewModelI1 = this.e.I1();
                everydayExtraSummaryViewModelI1.k = it5.d;
                everydayExtraSummaryViewModelI1.v6();
                break;
        }
        return Unit.f24250a;
    }
}

package au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewFormViewModel;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsDistributionDetails;
import au.com.woolworths.shop.receipts.ReceiptListContract;
import au.com.woolworths.shop.receipts.ShopReceiptListViewModel;
import au.com.woolworths.shop.receipts.pagination.ReceiptPaginationAdapter;
import au.com.woolworths.shop.receipts.pagination.ReceiptPagingSource;
import au.com.woolworths.shop.receipts.ui.ReceiptListScreenKt;
import au.com.woolworths.shop.rewards.promo.PromoAppActivity;
import au.com.woolworths.shop.rewards.promo.PromoAppViewModel;
import com.woolworths.scanlibrary.base.dagger.BackButtonExitHandler;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseMvvmFragment;
import com.woolworths.scanlibrary.base.dagger.NavDrawerBaseActivity;
import com.woolworths.scanlibrary.base.message.NotificationMessageReceiver;
import com.woolworths.scanlibrary.di.component.SnGAppProvider;
import com.woolworths.scanlibrary.ui.checkout.pay.PayContract;
import com.woolworths.scanlibrary.ui.checkout.pay.PayFragment;
import com.woolworths.scanlibrary.ui.entry.SngEntryActivity;
import com.woolworths.scanlibrary.ui.home.homeview.HomeFragment;
import com.woolworths.scanlibrary.ui.menu.contactus.ContactUsActivity;
import com.woolworths.scanlibrary.ui.menu.myaccount.MyAccountActivity;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingActivity;
import com.woolworths.scanlibrary.ui.onboarding.OnBoardingPagerAdapter;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentContract;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentPresenter;
import com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupActivity;
import com.woolworths.scanlibrary.ui.payment.updatecard.UpdateCreditCardActivity;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoFragment;
import com.woolworths.scanlibrary.ui.reward.SngRewardsSetupActivity;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivity;
import com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld;
import com.woolworths.scanlibrary.ui.setupcomplete.SetupCompleteActivity;
import com.woolworths.scanlibrary.ui.stores.AvailableStoreListActivity;
import com.woolworths.scanlibrary.ui.tap.TapActivity;
import com.woolworths.scanlibrary.ui.transaction.TransactionListActivity;
import com.woolworths.scanlibrary.util.permission.SngPermissionWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.e;
        switch (i) {
            case 0:
                SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) obj;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.b();
                }
                return unit;
            case 1:
                ((SubmitReviewFormViewModel) obj).D5();
                return unit;
            case 2:
                return Float.valueOf(((float) ((RatingsDistributionDetails.DistributionItem) obj).e) / 100);
            case 3:
                ReceiptPaginationAdapter receiptPaginationAdapter = ((ShopReceiptListViewModel) obj).e;
                receiptPaginationAdapter.c = null;
                receiptPaginationAdapter.d.clear();
                receiptPaginationAdapter.b = null;
                return new ReceiptPagingSource(receiptPaginationAdapter);
            case 4:
                float f = ReceiptListScreenKt.f12881a;
                ((ReceiptListContract.ReceiptListAnalyticsHandler) obj).m2();
                return unit;
            case 5:
                ((PromoAppActivity) obj).onBackPressed();
                return unit;
            case 6:
                ((PromoAppViewModel) obj).p6();
                return unit;
            case 7:
                ((BackButtonExitHandler) obj).l();
                return unit;
            case 8:
                ((DaggerBaseMvvmFragment) obj).getActivity();
                Intrinsics.p("featureToggleManager");
                throw null;
            case 9:
                int i2 = NavDrawerBaseActivity.T;
                ((NavDrawerBaseActivity) obj).d5();
                return unit;
            case 10:
                int i3 = NotificationMessageReceiver.c;
                ((coil3.gif.a) obj).invoke();
                return unit;
            case 11:
                PayFragment payFragment = (PayFragment) obj;
                ((PayContract.Presenter) payFragment.Q1()).O0();
                payFragment.h2().q();
                return unit;
            case 12:
                int i4 = SngEntryActivity.I;
                return ((SngEntryActivity) obj).Q4();
            case 13:
                PermissionFlagInteractorImpl permissionFlagInteractorImpl = ((HomeFragment) obj).p;
                if (permissionFlagInteractorImpl != null) {
                    return new SngPermissionWrapper(permissionFlagInteractorImpl);
                }
                Intrinsics.p("permissionFlagInteractor");
                throw null;
            case 14:
                int i5 = ContactUsActivity.L;
                ((ContactUsActivity) obj).finish();
                return unit;
            case 15:
                int i6 = OnBoardingActivity.K;
                return new OnBoardingPagerAdapter((OnBoardingActivity) obj);
            case 16:
                ((AddPaymentContract.View) ((AddPaymentPresenter) obj).f21139a).N1();
                return unit;
            case 17:
                int i7 = AddPaymentSetupActivity.G;
                return ((AddPaymentSetupActivity) obj).Q4();
            case 18:
                UpdateCreditCardActivity updateCreditCardActivity = (UpdateCreditCardActivity) obj;
                int i8 = UpdateCreditCardActivity.L;
                Intent intent = new Intent();
                CreditCardInstrument creditCardInstrument = updateCreditCardActivity.G;
                if (creditCardInstrument == null) {
                    Intrinsics.p("instrument");
                    throw null;
                }
                updateCreditCardActivity.setResult(0, intent.putExtra("key_instrument", creditCardInstrument));
                updateCreditCardActivity.finish();
                return unit;
            case 19:
                ((ProductInfoContract.Presenter) ((ProductInfoFragment) obj).Q1()).e();
                return unit;
            case 20:
                int i9 = SngRewardsSetupActivity.G;
                return ((SngRewardsSetupActivity) obj).Q4();
            case 21:
                ScannerActivity scannerActivity = ((ScannerActivity) obj).t.d;
                if (scannerActivity == null) {
                    Intrinsics.p("activity");
                    throw null;
                }
                ComponentCallbacks2 application = scannerActivity.getApplication();
                Intrinsics.f(application, "null cannot be cast to non-null type com.woolworths.scanlibrary.di.component.SnGAppProvider");
                return ((SnGAppProvider) application).b();
            case 22:
                PermissionFlagInteractorImpl permissionFlagInteractorImpl2 = ((ScannerActivityOld) obj).H;
                if (permissionFlagInteractorImpl2 != null) {
                    return new SngPermissionWrapper(permissionFlagInteractorImpl2);
                }
                Intrinsics.p("permissionFlagInteractor");
                throw null;
            case 23:
                int i10 = SetupCompleteActivity.F;
                return ((SetupCompleteActivity) obj).Q4();
            case 24:
                int i11 = AvailableStoreListActivity.I;
                return ((AvailableStoreListActivity) obj).Q4();
            case 25:
                TapActivity tapActivity = (TapActivity) obj;
                int i12 = TapActivity.W;
                Intent intent2 = new Intent(tapActivity, (Class<?>) MyAccountActivity.class);
                intent2.addFlags(0);
                tapActivity.startActivity(intent2);
                return unit;
            case 26:
                int i13 = TransactionListActivity.J;
                ((TransactionListActivity) obj).finish();
                return unit;
            case 27:
                return ArrayIteratorKt.a((Object[]) obj);
            case 28:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) obj;
                return ContextAwareKt.c(SerialDescriptorsKt.d("kotlinx.serialization.Polymorphic", PolymorphicKind.OPEN.f24760a, new SerialDescriptor[0], new i(polymorphicSerializer, 28)), polymorphicSerializer.f24750a);
            default:
                SerialDescriptorImpl serialDescriptorImpl = (SerialDescriptorImpl) obj;
                return Integer.valueOf(PluginGeneratedSerialDescriptorKt.a(serialDescriptorImpl, serialDescriptorImpl.k));
        }
    }
}

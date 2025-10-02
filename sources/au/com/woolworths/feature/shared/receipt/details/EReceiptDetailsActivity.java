package au.com.woolworths.feature.shared.receipt.details;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.FileProvider;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsActivity;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsContract;
import au.com.woolworths.feature.shared.receipt.details.databinding.ActivityEReceiptDetailsBinding;
import au.com.woolworths.foundation.feature.app.AppIdentifier;
import au.com.woolworths.shop.receipt.details.ShopReceiptUiProvider;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EReceiptDetailsActivity extends Hilt_EReceiptDetailsActivity {
    public static final /* synthetic */ int F = 0;
    public ActivityEReceiptDetailsBinding A;
    public EReceiptDetailsEpoxyController B;
    public final ViewModelLazy C = new ViewModelLazy(Reflection.f24268a.b(EReceiptDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final CompositeDisposable D = new CompositeDisposable();
    public String E;
    public ShopReceiptUiProvider x;
    public FeatureToggleManager y;
    public AppIdentifier z;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsActivity$Companion;", "", "", "EXTRA_RECEIPT_DETAILS_CONFIG", "Ljava/lang/String;", "", "ERECEIPT_SHARE_MENU_ITEM", "I", "RECEIPT_ID_NOT_AVAILABLE_EXCEPTION_MESSAGE", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsActivity$onResume$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<EReceiptDetailsContract.Actions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            EReceiptDetailsContract.Actions p0 = (EReceiptDetailsContract.Actions) obj;
            Intrinsics.h(p0, "p0");
            EReceiptDetailsActivity eReceiptDetailsActivity = (EReceiptDetailsActivity) this.receiver;
            int i = EReceiptDetailsActivity.F;
            eReceiptDetailsActivity.getClass();
            if (p0 instanceof EReceiptDetailsContract.Actions.OpenStoreLocationSheet) {
                EReceiptDetailsContract.Actions.OpenStoreLocationSheet openStoreLocationSheet = (EReceiptDetailsContract.Actions.OpenStoreLocationSheet) p0;
                String division = openStoreLocationSheet.f6550a;
                String storeNo = openStoreLocationSheet.b;
                if (eReceiptDetailsActivity.x == null) {
                    Intrinsics.p("eReceiptUIProvider");
                    throw null;
                }
                Intrinsics.h(division, "division");
                Intrinsics.h(storeNo, "storeNo");
            } else if (p0 instanceof EReceiptDetailsContract.Actions.OpenShareSheet) {
                Uri uriD = FileProvider.d(eReceiptDetailsActivity, YU.a.g(eReceiptDetailsActivity.getApplication().getPackageName(), ".fileprovider"), new File(((EReceiptDetailsContract.Actions.OpenShareSheet) p0).f6549a));
                Intrinsics.e(uriD);
                String string = eReceiptDetailsActivity.getString(com.woolworths.R.string.e_receipts_download_share_title);
                Intrinsics.g(string, "getString(...)");
                String lastPathSegment = uriD.getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "";
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/pdf");
                intent.putExtra("android.intent.extra.STREAM", uriD);
                intent.putExtra("android.intent.extra.SUBJECT", lastPathSegment);
                intent.putExtra("android.intent.extra.TEXT", "");
                eReceiptDetailsActivity.startActivity(Intent.createChooser(intent, string));
            } else if (p0 instanceof EReceiptDetailsContract.Actions.CloseScreen) {
                eReceiptDetailsActivity.finish();
            } else {
                if (!(p0 instanceof EReceiptDetailsContract.Actions.ShowDownloadErrorMessage)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActivityEReceiptDetailsBinding activityEReceiptDetailsBinding = eReceiptDetailsActivity.A;
                if (activityEReceiptDetailsBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                Snackbar.i(activityEReceiptDetailsBinding.y, com.woolworths.R.string.e_receipts_download_error_message, -1).l();
            }
            return Unit.f24250a;
        }
    }

    public final String O4() {
        String str;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_DATA");
        Activities.SharedEReceiptDetails.ReceiptDetailsExtras receiptDetailsExtras = parcelableExtra instanceof Activities.SharedEReceiptDetails.ReceiptDetailsExtras ? (Activities.SharedEReceiptDetails.ReceiptDetailsExtras) parcelableExtra : null;
        if (receiptDetailsExtras == null || (str = receiptDetailsExtras.d) == null) {
            throw new IllegalStateException("eReceipt Id MUST NOT be null");
        }
        return str;
    }

    public final EReceiptDetailsViewModel P4() {
        return (EReceiptDetailsViewModel) this.C.getD();
    }

    @Override // au.com.woolworths.feature.shared.receipt.details.Hilt_EReceiptDetailsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Resources.Theme theme = getTheme();
        if (this.x == null) {
            Intrinsics.p("eReceiptUIProvider");
            throw null;
        }
        theme.applyStyle(com.woolworths.R.style.Theme_Wow_Light_EReceiptDetails, true);
        this.E = O4();
        this.A = (ActivityEReceiptDetailsBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_e_receipt_details);
        EReceiptDetailsViewModel eReceiptDetailsViewModelP4 = P4();
        if (this.x == null) {
            Intrinsics.p("eReceiptUIProvider");
            throw null;
        }
        AppIdentifier appIdentifier = this.z;
        if (appIdentifier == null) {
            Intrinsics.p("appIdentifier");
            throw null;
        }
        this.B = new EReceiptDetailsEpoxyController(eReceiptDetailsViewModelP4, false, appIdentifier);
        ActivityEReceiptDetailsBinding activityEReceiptDetailsBinding = this.A;
        if (activityEReceiptDetailsBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityEReceiptDetailsBinding.D(this);
        activityEReceiptDetailsBinding.L(P4());
        EpoxyRecyclerView epoxyRecyclerView = activityEReceiptDetailsBinding.C;
        EReceiptDetailsEpoxyController eReceiptDetailsEpoxyController = this.B;
        if (eReceiptDetailsEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(eReceiptDetailsEpoxyController);
        setSupportActionBar(activityEReceiptDetailsBinding.D);
        ActivityEReceiptDetailsBinding activityEReceiptDetailsBinding2 = this.A;
        if (activityEReceiptDetailsBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        EpoxyRecyclerView recyclerView = activityEReceiptDetailsBinding2.C;
        Intrinsics.g(recyclerView, "recyclerView");
        P4().i.f(this, new Observer() { // from class: au.com.woolworths.feature.shared.receipt.details.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EReceiptDetailsContract.ViewState viewState = (EReceiptDetailsContract.ViewState) obj;
                EReceiptDetailsEpoxyController eReceiptDetailsEpoxyController2 = this.d.B;
                if (eReceiptDetailsEpoxyController2 != null) {
                    eReceiptDetailsEpoxyController2.setData(viewState.c, Boolean.valueOf(viewState.d));
                } else {
                    Intrinsics.p("epoxyController");
                    throw null;
                }
            }
        });
        EReceiptDetailsViewModel eReceiptDetailsViewModelP42 = P4();
        eReceiptDetailsViewModelP42.f.a(eReceiptDetailsViewModelP42.l);
        EReceiptDetailsViewModel eReceiptDetailsViewModelP43 = P4();
        String str = this.E;
        if (str != null) {
            eReceiptDetailsViewModelP43.p6(str);
        } else {
            Intrinsics.p("receiptId");
            throw null;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        MenuItem menuItemAdd = menu.add(0, 123, 0, com.woolworths.R.string.e_receipt_details_action_share);
        menuItemAdd.setIcon(com.woolworths.R.drawable.ic_share);
        menuItemAdd.setShowAsAction(1);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.h(intent, "intent");
        super.onNewIntent(intent);
        this.E = O4();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            int itemId = item.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId == 123) {
                P4().q6();
            } else if (itemId != 16908332) {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            } else {
                onBackPressed();
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.D.e();
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        PublishSubject publishSubject = P4().k;
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, this, EReceiptDetailsActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shared/receipt/details/EReceiptDetailsContract$Actions;)V", 0);
        Consumer consumer = new Consumer() { // from class: au.com.woolworths.feature.shared.receipt.details.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                int i = EReceiptDetailsActivity.F;
                ((EReceiptDetailsActivity.AnonymousClass1) anonymousClass1).invoke(obj);
            }
        };
        publishSubject.getClass();
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, Functions.e);
        publishSubject.a(lambdaObserver);
        DisposableKt.a(this.D, lambdaObserver);
    }
}

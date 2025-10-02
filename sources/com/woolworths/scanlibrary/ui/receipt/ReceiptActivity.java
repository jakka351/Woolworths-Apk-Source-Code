package com.woolworths.scanlibrary.ui.receipt;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dynatrace.android.callback.Callback;
import com.google.gson.Gson;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.ClickedEmailReceipt;
import com.woolworths.scanlibrary.analytics.ViewParkingVoucherTracking;
import com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity;
import com.woolworths.scanlibrary.databinding.ActivityReceiptBinding;
import com.woolworths.scanlibrary.di.user.UserScopedActivity;
import com.woolworths.scanlibrary.domain.payment.b;
import com.woolworths.scanlibrary.models.receipt.Receipt;
import com.woolworths.scanlibrary.models.receipt.ReceiptAlert;
import com.woolworths.scanlibrary.models.receipt.Voucher;
import com.woolworths.scanlibrary.ui.parking.ParkingVoucherActivity;
import com.woolworths.scanlibrary.ui.receipt.ReceiptContract;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptAdapter;
import com.woolworths.scanlibrary.util.extensions.AppCompatActivityExtKt;
import com.woolworths.scanlibrary.util.extensions.DateExtKt;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/ReceiptActivity;", "Lcom/woolworths/scanlibrary/base/dagger/DaggerBaseActivity;", "Lcom/woolworths/scanlibrary/ui/receipt/ReceiptContract$Presenter;", "Lcom/woolworths/scanlibrary/ui/receipt/ReceiptContract$View;", "Lcom/woolworths/scanlibrary/di/user/UserScopedActivity;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/ReceiptAdapter$ReceiptAdapterListener;", "<init>", "()V", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReceiptActivity extends DaggerBaseActivity<ReceiptContract.Presenter> implements ReceiptContract.View, UserScopedActivity, ReceiptAdapter.ReceiptAdapterListener {
    public static final /* synthetic */ int N = 0;
    public final ReceiptActivity$backButtonHandler$1 G = new OnBackPressedCallback() { // from class: com.woolworths.scanlibrary.ui.receipt.ReceiptActivity$backButtonHandler$1
        {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void e() {
            int i = ReceiptActivity.N;
            ReceiptActivity receiptActivity = this.d;
            if (((Boolean) receiptActivity.M.getD()).booleanValue()) {
                i(false);
                receiptActivity.finish();
            }
        }
    };
    public ActivityReceiptBinding H;
    public Receipt I;
    public Menu J;
    public Voucher K;
    public final Lazy L;
    public final Lazy M;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/ReceiptActivity$Companion;", "", "", "EXTRA_RECEIPT", "Ljava/lang/String;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static void a(Activity activity, Receipt receipt, int i) {
            int i2 = ReceiptActivity.N;
            boolean z = (i & 4) != 0;
            Intrinsics.h(receipt, "receipt");
            Pair[] pairArr = {new Pair("extra_receipt", new Gson().j(receipt)), new Pair("key.back.button.allowed", Boolean.valueOf(z)), new Pair("key.toolbar.title", "")};
            Intent intent = new Intent(activity, (Class<?>) ReceiptActivity.class);
            intent.addFlags(0);
            intent.putExtras(BundleKt.a((Pair[]) Arrays.copyOf(pairArr, 3)));
            activity.startActivity(intent);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.woolworths.scanlibrary.ui.receipt.ReceiptActivity$backButtonHandler$1] */
    public ReceiptActivity() {
        final int i = 0;
        this.L = LazyKt.b(new Function0(this) { // from class: com.woolworths.scanlibrary.ui.receipt.a
            public final /* synthetic */ ReceiptActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReceiptActivity receiptActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = ReceiptActivity.N;
                        String stringExtra = receiptActivity.getIntent().getStringExtra("key.toolbar.title");
                        if (stringExtra != null) {
                            return stringExtra;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    default:
                        int i4 = ReceiptActivity.N;
                        return Boolean.valueOf(receiptActivity.getIntent().getBooleanExtra("key.back.button.allowed", false));
                }
            }
        });
        final int i2 = 1;
        this.M = LazyKt.b(new Function0(this) { // from class: com.woolworths.scanlibrary.ui.receipt.a
            public final /* synthetic */ ReceiptActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReceiptActivity receiptActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = ReceiptActivity.N;
                        String stringExtra = receiptActivity.getIntent().getStringExtra("key.toolbar.title");
                        if (stringExtra != null) {
                            return stringExtra;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    default:
                        int i4 = ReceiptActivity.N;
                        return Boolean.valueOf(receiptActivity.getIntent().getBooleanExtra("key.back.button.allowed", false));
                }
            }
        });
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.ReceiptContract.View
    public final void D3(String message) {
        Intrinsics.h(message, "message");
        String string = getString(R.string.sng_label_ok);
        Intrinsics.g(string, "getString(...)");
        AppCompatActivityExtKt.c(this, "", message, string, new b(7), false);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final OnBackPressedCallback P4() {
        return this.G;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final int R4() {
        return R.layout.activity_receipt;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final void V4() {
        this.H = (ActivityReceiptBinding) DataBindingUtil.d(this, R.layout.activity_receipt);
        Object objD = new Gson().d(Receipt.class, getIntent().getStringExtra("extra_receipt"));
        Intrinsics.g(objD, "fromJson(...)");
        Receipt receipt = (Receipt) objD;
        this.I = receipt;
        ActivityReceiptBinding activityReceiptBinding = this.H;
        if (activityReceiptBinding == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        setSupportActionBar(activityReceiptBinding.A.y);
        ActivityReceiptBinding activityReceiptBinding2 = this.H;
        if (activityReceiptBinding2 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        TextView textView = activityReceiptBinding2.A.z;
        Lazy lazy = this.L;
        textView.setText(((String) lazy.getD()).length() == 0 ? DateExtKt.a("d MMMM yyyy", receipt.getTransaction().getTxnTime()) : (String) lazy.getD());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u();
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.t();
        }
        ActionBar supportActionBar3 = getSupportActionBar();
        Lazy lazy2 = this.M;
        if (supportActionBar3 != null) {
            supportActionBar3.s(((Boolean) lazy2.getD()).booleanValue());
        }
        Receipt receipt2 = this.I;
        if (receipt2 == null) {
            Intrinsics.p("receipt");
            throw null;
        }
        ActivityReceiptBinding activityReceiptBinding3 = this.H;
        if (activityReceiptBinding3 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityReceiptBinding3.z.setLayoutManager(new LinearLayoutManager(this));
        ReceiptAdapter receiptAdapter = new ReceiptAdapter(((ReceiptContract.Presenter) S4()).Q(receipt2), this);
        ActivityReceiptBinding activityReceiptBinding4 = this.H;
        if (activityReceiptBinding4 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityReceiptBinding4.z.setAdapter(receiptAdapter);
        ActivityReceiptBinding activityReceiptBinding5 = this.H;
        if (activityReceiptBinding5 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityReceiptBinding5.y.setVisibility(((Boolean) lazy2.getD()).booleanValue() ? 8 : 0);
        ActivityReceiptBinding activityReceiptBinding6 = this.H;
        if (activityReceiptBinding6 == null) {
            Intrinsics.p("viewBinding");
            throw null;
        }
        activityReceiptBinding6.y.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 11));
        Receipt receipt3 = this.I;
        if (receipt3 == null) {
            Intrinsics.p("receipt");
            throw null;
        }
        ReceiptAlert receiptAlert = receipt3.getReceiptAlert();
        if (receiptAlert == null || !Intrinsics.c(receiptAlert.getShowAlert(), Boolean.TRUE)) {
            return;
        }
        String alertTitle = receiptAlert.getAlertTitle();
        String str = alertTitle == null ? "" : alertTitle;
        String alertMessage = receiptAlert.getAlertMessage();
        String str2 = alertMessage == null ? "" : alertMessage;
        String string = getString(R.string.sng_label_ok);
        Intrinsics.g(string, "getString(...)");
        AppCompatActivityExtKt.c(this, str, str2, string, new b(7), true);
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity
    public final boolean X4() {
        return false;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        MenuItem menuItemFindItem2;
        String barcode;
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(R.menu.sng_menu_receipt, menu);
        super.onCreateOptionsMenu(menu);
        this.J = menu;
        Receipt receipt = this.I;
        if (receipt == null) {
            Intrinsics.p("receipt");
            throw null;
        }
        Voucher voucherY0 = ((ReceiptContract.Presenter) S4()).Y0(receipt);
        this.K = voucherY0;
        boolean z = (voucherY0 == null || (barcode = voucherY0.getBarcode()) == null || barcode.length() <= 0) ? false : true;
        Menu menu2 = this.J;
        if (menu2 != null && (menuItemFindItem2 = menu2.findItem(R.id.menu_item_parking)) != null) {
            menuItemFindItem2.setEnabled(z);
        }
        Receipt receipt2 = this.I;
        if (receipt2 == null) {
            Intrinsics.p("receipt");
            throw null;
        }
        Boolean generatePdfEnabled = receipt2.getGeneratePdfEnabled();
        boolean zBooleanValue = generatePdfEnabled != null ? generatePdfEnabled.booleanValue() : false;
        Menu menu3 = this.J;
        if (menu3 != null && (menuItemFindItem = menu3.findItem(R.id.menu_email_receipt)) != null) {
            menuItemFindItem.setVisible(zBooleanValue);
        }
        return true;
    }

    @Override // com.woolworths.scanlibrary.base.dagger.DaggerBaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            int itemId = item.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId == R.id.menu_item_parking) {
                N4().b(new ViewParkingVoucherTracking());
                Voucher voucher = this.K;
                Intrinsics.e(voucher);
                ParkingVoucherActivity.Companion.a(this, voucher);
            } else if (itemId == R.id.menu_email_receipt) {
                N4().b(new ClickedEmailReceipt("Email Receipt"));
                ReceiptContract.Presenter presenter = (ReceiptContract.Presenter) S4();
                Receipt receipt = this.I;
                if (receipt == null) {
                    Intrinsics.p("receipt");
                    throw null;
                }
                presenter.L(receipt.getCartid());
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptAdapter.ReceiptAdapterListener
    public final void z0(Voucher voucher) {
        N4().b(new ViewParkingVoucherTracking());
        ParkingVoucherActivity.Companion.a(this, voucher);
    }
}
